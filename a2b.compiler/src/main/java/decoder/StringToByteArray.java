package decoder;

import java.nio.charset.StandardCharsets;

/**
 * This class is for converting a string to its byte representation.
 * 
 * @author rampix
 *
 */
public class StringToByteArray {
	
	private StringToByteArray() {
		
	}
	
	/**
	 * This method converts the string to a byte array.
	 * The boolean parameter defines the endianness order of the return byte array.
	 * [true == little endian],
	 * [false == big endian]
	 * 
	 * @param content
	 * @param isLittleEndian
	 * @return byte array in an endianness order
	 */
	public static byte[] convert(String content, boolean isLittleEndian) {

		byte[] decodedString = content.getBytes(StandardCharsets.UTF_8);
		
		return isLittleEndian ? ByteArray.reverse(decodedString) : decodedString;
		
	}

}
