package decoder;

import java.nio.ByteBuffer;
import java.util.zip.CRC32;

import org.eclipse.emf.common.util.EList;

import a2b.a2B.DB;
import a2b.a2B.DD;
import a2b.a2B.DW;
import a2b.a2B.HXS;
import a2b.a2B.INCLUDE;
import a2b.a2B.IP;
import a2b.a2B.Instruction;
import a2b.a2B.MAC;
import a2b.a2B.PAD;
import a2b.a2B.STR;

/**
 * @author rampix
 *
 */
public class ChecksumToByteArray {

	final static boolean BIG_ENDIAN = false;
	
	final static byte[] zeroChecksum16 = {0, 0};
	final static byte[] zeroChecksum32 = {0, 0, 0, 0};
	final static byte[] zeroByte = {0};

	private ChecksumToByteArray() {

	}

	/**
	 * @param instructionValue
	 * @param crcSign
	 * @param isLittleEndian
	 * @return
	 */
	public static byte[] convert16(EList<Instruction> instructionValue, String crcSign , boolean isLittleEndian) {
		
		byte[] result = filterModelForChecksum(instructionValue, crcSign);

		return checksum16(result, result.length, isLittleEndian);

	}
	
	/**
	 * @param instructionValue
	 * @param crcSign
	 * @param isLittleEndian
	 * @return
	 */
	public static byte[] convert32(EList<Instruction> instructionValue, String crcSign , boolean isLittleEndian) {
		
		byte[] result = filterModelForChecksum(instructionValue, crcSign);
		
		return checksum32(result, isLittleEndian);
	}


	/**
	 * @param instructionValue
	 * @param crcSign
	 * @return
	 */
	private static byte[] filterModelForChecksum(EList<Instruction> instructionValue, String crcSign) {

		byte[] result = {};

		for(Instruction instruction : instructionValue) {
			
			switch(instruction.eClass().getName()) {
			
			case "DB":
				DB defineByte = (DB) instruction;
				if(defineByte.getCrcValue() != null && defineByte.getCrcValue().equals(crcSign)) {
					result = (defineByte.getStringValue() == null) ? 
							appendByteArray(result, ByteWordDoubleWordToByteArray.convertDBInteger(defineByte.getIntValue())) :
								appendByteArray(result, ByteWordDoubleWordToByteArray.convertDBString(defineByte.getStringValue()));
				}
				break;
			case "DW":
				DW defineWord = (DW) instruction;
				if(defineWord.getCrcValue() != null && defineWord.getCrcValue().equals(crcSign)) {
					result = (defineWord.getStringValue() == null) ?
							appendByteArray(result, ByteWordDoubleWordToByteArray.convertDWInteger(defineWord.getIntValue(), BIG_ENDIAN)) :
								appendByteArray(result, ByteWordDoubleWordToByteArray.convertDWString(defineWord.getStringValue(), BIG_ENDIAN));
				}
				break;
			case "DD":
				DD defineDoubleWord = (DD) instruction;
				if(defineDoubleWord.getCrcValue() != null && defineDoubleWord.getCrcValue().equals(crcSign)) {
					result = (defineDoubleWord.getStringValue() == null) ?
							appendByteArray(result, ByteWordDoubleWordToByteArray.convertDDInteger(defineDoubleWord.getLongValue(), BIG_ENDIAN)) :
								appendByteArray(result, ByteWordDoubleWordToByteArray.convertDDString(defineDoubleWord.getStringValue(), BIG_ENDIAN))	;
				}
				break;
			case "STR":
				STR str = (STR) instruction;
				if(str.getCrcValue() != null && str.getCrcValue().equals(crcSign)) {
					result = appendByteArray(result, StringToByteArray.convert(str.getValue(), BIG_ENDIAN));
				}
				break;
			case "ORG":
				PAD pad = (PAD) instruction;
				if(pad.getCrcValue() != null && pad.getCrcValue().equals(crcSign)) {
					result = appendByteArray(result, PADToByteArray.convert(pad.getValue()));
				}
				break;
			case "INCLUDE":
				INCLUDE include = (INCLUDE) instruction;
				if(include.getCrcValue() != null && include.getCrcValue().equals(crcSign)) {
					result = appendByteArray(result, IncludeToByteArray.convert(include.getValue()));
				}
				break;
			case "MAC":
				MAC mac = (MAC) instruction;
				if(mac.getCrcValue() != null && mac.getCrcValue().equals(crcSign)) {
					result = appendByteArray(result, MACToByteArray.convert(mac.getValue(), BIG_ENDIAN));
				}
				break;
			case "IP":
				IP ip = (IP) instruction;
				if(ip.getCrcValue() != null && ip.getCrcValue().equals(crcSign)) {
					result = appendByteArray(result, IPToByteArray.convert(ip.getValue(), BIG_ENDIAN));
				}
				break;
			case "HXS":
				HXS hxs = (HXS) instruction;
				if(hxs.getCrcValue() != null && hxs.getCrcValue().equals(crcSign)) {
					result = appendByteArray(result, HexStringToByteArray.convert(hxs.getValue(), BIG_ENDIAN));
				}
				break;
			case "CRC16":
				result = appendByteArray(result, zeroChecksum16);
				break;
			case "CRC32":
				//NOOP
				break;
			}

		}
		return result;
	}

	/**
	 * 
	 * https://stackoverflow.com/questions/4113890/how-to-calculate-the-internet-checksum-from-a-byte-in-java
	 * 
	 * @param buf
	 * @param length
	 * @param isLittleEndian
	 * @return
	 */
	private static byte[] checksum16(byte[] buf, int length, boolean isLittleEndian) {

		if(buf.length % 2 != 0) {
			buf = appendByteArray(buf, zeroByte);
		}

		int i = 0;
		long sum = 0;
		while (length > 0) {
			sum += (buf[i++]&0xff) << 8;
			if ((--length)==0) break;
			sum += (buf[i++]&0xff);
			--length;
		}

		sum = (~((sum & 0xFFFF)+(sum >> 16)))&0xFFFF;
		
		short input = (short) (int) sum;

		ByteBuffer buffer = ByteBuffer.allocate(2).putShort(input);

		byte[] result = buffer.array();

		return isLittleEndian ? ByteArray.reverse(result) : result;

	}
	
	/**
	 * @param buf
	 * @param isLittleEndian
	 * @return
	 */
	private static byte[] checksum32(byte[] buf, boolean isLittleEndian) {

		CRC32 crc = new CRC32();
		
		crc.reset();
		crc.update(buf);
		
		int checksum = (int) crc.getValue();
		
		byte[] result = ByteBuffer.allocate(4).putInt(checksum).array();

		return isLittleEndian ? ByteArray.reverse(result) : result;
		
	}

	/**
	 * @param kilo
	 * @param lima
	 * @return
	 */
	private static byte[] appendByteArray(byte[] kilo, byte[] lima) {
		byte[] mike = new byte[kilo.length + lima.length];

		System.arraycopy(kilo, 0, mike, 0, kilo.length);
		System.arraycopy(lima, 0, mike, kilo.length, lima.length);

		return mike;
	}

}
