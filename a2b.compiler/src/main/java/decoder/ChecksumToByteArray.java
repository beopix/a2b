package decoder;

import java.nio.ByteBuffer;

import org.eclipse.emf.common.util.EList;

import a2b.a2B.DB;
import a2b.a2B.DD;
import a2b.a2B.DW;
import a2b.a2B.HXS;
import a2b.a2B.IP;
import a2b.a2B.Instruction;
import a2b.a2B.MAC;
import a2b.a2B.ORG;

public class ChecksumToByteArray {

	final static String CRC_SIGN = "#";
	final static boolean BIG_ENDIAN = false;
	
	final static byte[] zeroChecksum = {0, 0};  

	private ChecksumToByteArray() {

	}

	public static byte[] decode(EList<Instruction> instructionValue, boolean littleEndian) {

		byte[] result = filterModelForChecksum(instructionValue);

		return checksum(result, result.length, littleEndian);

	}


	private static byte[] filterModelForChecksum(EList<Instruction> instructionValue) {

		byte[] result = {};

		for(Instruction instruction : instructionValue) {
			switch(instruction.eClass().getName()) {

			case "DB":
				DB defineByte = (DB) instruction;
				if(defineByte.getCrcValue() != null && defineByte.getCrcValue().equals(CRC_SIGN)) {
					result = (defineByte.getStringValue() == null) ? 
							appendByteArray(result, ByteWordDoubleWordToByteArray.decodeDBInteger(defineByte.getIntValue())) :
								appendByteArray(result, ByteWordDoubleWordToByteArray.decodeDBString(defineByte.getStringValue()));
				}
				break;
			case "DW":
				DW defineWord = (DW) instruction;
				if(defineWord.getCrcValue() != null && defineWord.getCrcValue().equals(CRC_SIGN)) {
					result = (defineWord.getStringValue() == null) ?
							appendByteArray(result, ByteWordDoubleWordToByteArray.decodeDWInteger(defineWord.getIntValue(), BIG_ENDIAN)) :
								appendByteArray(result, ByteWordDoubleWordToByteArray.decodeDWString(defineWord.getStringValue(), BIG_ENDIAN));
				}
				break;
			case "DD":
				DD defineDoubleWord = (DD) instruction;
				if(defineDoubleWord.getCrcValue() != null && defineDoubleWord.getCrcValue().equals(CRC_SIGN)) {
					result = (defineDoubleWord.getStringValue() == null) ?
							appendByteArray(result, ByteWordDoubleWordToByteArray.decodeDDInteger(defineDoubleWord.getLongValue(), BIG_ENDIAN)) :
								appendByteArray(result, ByteWordDoubleWordToByteArray.decodeDDString(defineDoubleWord.getStringValue(), BIG_ENDIAN))	;
				}
				break;
			case "ORG":
				ORG org = (ORG) instruction;
				if(org.getCrcValue() != null && org.getCrcValue().equals(CRC_SIGN)) {
					result = appendByteArray(result, ORGToByteArray.decode(org.getValue()));
				}
				break;
			case "MAC":
				MAC mac = (MAC) instruction;
				if(mac.getCrcValue() != null && mac.getCrcValue().equals(CRC_SIGN)) {
					result = appendByteArray(result, MACToByteArray.decode(mac.getValue(), BIG_ENDIAN));
				}
				break;
			case "IP":
				IP ip = (IP) instruction;
				if(ip.getCrcValue() != null && ip.getCrcValue().equals(CRC_SIGN)) {
					result = appendByteArray(result, IPToByteArray.decode(ip.getValue(), BIG_ENDIAN));
				}
				break;
			case "HXS":
				HXS hxs = (HXS) instruction;
				if(hxs.getCrcValue() != null && hxs.getCrcValue().equals(CRC_SIGN)) {
					result = appendByteArray(result, HexStringToByteArray.decode(hxs.getValue(), BIG_ENDIAN));
				}
				break;
			case "CRC":
				result = appendByteArray(result, zeroChecksum);
				break;
			}

		}
		return result;
	}

	private static byte[] checksum(byte[] buf, int length, boolean littleEndian) {
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

		return littleEndian ? ByteArray.reverse(result) : result;

	}

	private static byte[] appendByteArray(byte[] kilo, byte[] lima) {
		byte[] mike = new byte[kilo.length + lima.length];

		System.arraycopy(kilo, 0, mike, 0, kilo.length);
		System.arraycopy(lima, 0, mike, kilo.length, lima.length);

		return mike;
	}

}
