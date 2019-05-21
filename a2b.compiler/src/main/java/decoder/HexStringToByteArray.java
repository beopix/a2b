package decoder;

/**
 * This class is for converting a hexadecimal string to its byte representation.
 * 
 * @author rampix
 *
 */
public class HexStringToByteArray {

	private HexStringToByteArray() {

	}

	/**
	 * This method converts the hexadecimal string content parameter to a byte array.
	 * The boolean parameter defines the endianness order of the return byte array.
	 * [true == little endian],
	 * [false == big endian] 
	 * 
	 * https://stackoverflow.com/questions/140131/convert-a-string-representation-of-a-hex-dump-to-a-byte-array-using-java
	 * 
	 * @param content
	 * @param isLittleEndian
	 * @return byte array in an endianness order
	 */
	public static byte[] convert(String content, boolean isLittleEndian) {
		content = content.substring(2);
		int length = content.length();
		byte[] result = new byte[length / 2];
		for (int i = 0; i < length; i += 2) {
			result[i / 2] = (byte) ((Character.digit(content.charAt(i), 16) << 4)
					+ Character.digit(content.charAt(i + 1), 16));
		}

		return isLittleEndian ? ByteArray.reverse(result) : result;
	}

}
