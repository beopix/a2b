package decoder;

/**
 * This class is for converting a mac address as a string parameter to its byte representation.
 * 
 * @author rampix
 *
 */
public class MACToByteArray {

	private MACToByteArray() {

	}

	/**
	 * This method converts the mac address to a byte array.
	 * The boolean parameter defines the endianness order of the return byte array.
	 * [true == little endian],
	 * [false == big endian]
	 * 
	 * @param content
	 * @param littleEndian
	 * @return byte array in an endianness order
	 */
	public static byte[] convert(String content, boolean littleEndian) {

		String[] macAddress = content.split(":");

		byte[] result = new byte[6];

		for(int i=0; i<6; i++){
			Integer inputInByteArray = Integer.parseInt(macAddress[i], 16);
			result[i] = inputInByteArray.byteValue();
		}

		return littleEndian ? ByteArray.reverse(result) : result;
	}

}
