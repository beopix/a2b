package compiler;

import org.eclipse.emf.common.util.EList;

import a2b.a2B.Base64Decode;
import a2b.a2B.Base64Encode;
import a2b.a2B.CRC16;
import a2b.a2B.CRC32;
import a2b.a2B.DB;
import a2b.a2B.DD;
import a2b.a2B.DW;
import a2b.a2B.HXS;
import a2b.a2B.INCLUDE;
import a2b.a2B.IP;
import a2b.a2B.Instruction;
import a2b.a2B.MAC;
import a2b.a2B.Model;
import a2b.a2B.PAD;
import a2b.a2B.PXL;
import a2b.a2B.STR;
import decoder.Base64DecodeToByteArray;
import decoder.Base64EncodeToByteArray;
import decoder.ByteWordDoubleWordToByteArray;
import decoder.ChecksumToByteArray;
import decoder.HexStringToByteArray;
import decoder.IPToByteArray;
import decoder.IncludeToByteArray;
import decoder.MACToByteArray;
import decoder.PADToByteArray;
import decoder.PixelToByteArray;
import decoder.StringToByteArray;

/**
 * This class does the main work of the application. It initializes an A2BParser and loads the model/abstract_syntax_tree.
 * Further it goes through the tree and calls for every instruction a specific class method with the value as parameter.
 * 
 * @author rampix
 *
 */
public class A2bCompiler {

	private boolean pcap = false;
	A2bParser a2bParser;
	Model model;


	/**
	 * Initializes the A2BParser and loads the model/ast from the language file path.
	 * 
	 * @param languageFilePath
	 * @throws A2BParseErrorException
	 */
	public A2bCompiler(String languageFilePath) throws A2BParseErrorException {
		a2bParser = new A2bParser();
		model = a2bParser.parse(languageFilePath);
	}

	/**
	 * This method goes through the model/ast and calls for every instruction a specific class method which returns
	 * the value from the language file as a byte[]. Every byte[] gets attached to the main byte[] which this method returns.
	 * 
	 * 
	 * @return the byte[] with the language content
	 */
	public byte[] compile() {
		boolean isLittleEndian = false;

		byte[] newline = {10};
		byte[] result = {};

		EList<Instruction> instructionValue = model.getElement();

		for(Instruction instruction: instructionValue) {

			switch(instruction.eClass().getName()) {

			case "DB":
				DB defineByte = (DB) instruction;
				result = (defineByte.getStringValue() == null) ? 
						appendByteArray(result, ByteWordDoubleWordToByteArray.convertDBInteger(defineByte.getIntValue())) :
							appendByteArray(result, ByteWordDoubleWordToByteArray.convertDBString(defineByte.getStringValue()));	
						break;
			case "DW":
				DW defineWord = (DW) instruction;
				result = (defineWord.getStringValue() == null) ?
						appendByteArray(result, ByteWordDoubleWordToByteArray.convertDWInteger(defineWord.getIntValue(), isLittleEndian)) :
							appendByteArray(result, ByteWordDoubleWordToByteArray.convertDWString(defineWord.getStringValue(), isLittleEndian));
						break;
			case "DD":
				DD defineDoubleWord = (DD) instruction;
				result = (defineDoubleWord.getStringValue() == null) ?
						appendByteArray(result, ByteWordDoubleWordToByteArray.convertDDInteger(defineDoubleWord.getLongValue(), isLittleEndian)) :
							appendByteArray(result, ByteWordDoubleWordToByteArray.convertDDString(defineDoubleWord.getStringValue(), isLittleEndian))	;
						break;
			case "STR":
				STR str = (STR) instruction;
				result = appendByteArray(result, StringToByteArray.convert(str.getValue(), isLittleEndian));
				break;
			case "Base64Decode":
				Base64Decode base64Decode = (Base64Decode) instruction;
				result = appendByteArray(result, Base64DecodeToByteArray.decode(base64Decode.getValue(), isLittleEndian));
				break;
			case "Base64Encode":
				Base64Encode base64Encode = (Base64Encode) instruction;
				result = appendByteArray(result, Base64EncodeToByteArray.encode(base64Encode.getValue(), isLittleEndian));
				break;
			case "ORG":
				PAD pad = (PAD) instruction;
				result = appendByteArray(result, PADToByteArray.convert(pad.getValue()));
				break;
			case "INCLUDE":
				INCLUDE include = (INCLUDE) instruction;
				result = appendByteArray(result, IncludeToByteArray.convert(include.getValue()));
				break;
			case "MAC":
				MAC mac = (MAC) instruction;
				result = appendByteArray(result, MACToByteArray.convert(mac.getValue(), isLittleEndian));
				break;
			case "IP":
				IP ip = (IP) instruction;
				result = appendByteArray(result, IPToByteArray.convert(ip.getValue(), isLittleEndian));
				break;
			case "PXL":
				PXL pxl = (PXL) instruction;
				result = appendByteArray(result, PixelToByteArray.convert(pxl.getValue(), isLittleEndian));
				break;
			case "HXS":
				HXS hxs = (HXS) instruction;
				result = appendByteArray(result, HexStringToByteArray.convert(hxs.getValue(), isLittleEndian));
				break;
			case "CRC16":
				CRC16 crc16 = (CRC16) instruction;
				result = appendByteArray(result, ChecksumToByteArray.convert16(instructionValue, crc16.getCrcValue(), isLittleEndian));
				break;
			case "CRC32":
				CRC32 crc32 = (CRC32) instruction;
				result = appendByteArray(result, ChecksumToByteArray.convert32(instructionValue, crc32.getCrcValue(), isLittleEndian));
				break;
			case "NL":
				result = appendByteArray(result, newline);
				break;
			case "BE":
				isLittleEndian = false;
				break;
			case "LE":
				isLittleEndian = true;
				break;
			case "PCAP":
				pcap = true;
				break;
			}

		}

		return result;
	}


	/**
	 * @return boolean pcap for generating a pcap file for wireshark
	 */
	public boolean isPcap() {
		return pcap;
	}


	/**
	 * Helper method for merging two byte arrays into one byte array
	 * 
	 * @param kilo
	 * @param lima
	 * @return the merged byte[] of both parameters
	 */
	private byte[] appendByteArray(byte[] kilo, byte[] lima) {

		byte[] mike = new byte[kilo.length + lima.length];

		System.arraycopy(kilo, 0, mike, 0, kilo.length);
		System.arraycopy(lima, 0, mike, kilo.length, lima.length);

		return mike;
	}

}
