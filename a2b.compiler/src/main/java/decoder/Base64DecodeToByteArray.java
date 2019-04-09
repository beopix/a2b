package decoder;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * This class is for decoding a base64 string to its byte representation.
 * 
 * @author rampix
 *
 */
public class Base64DecodeToByteArray {

	private Base64DecodeToByteArray() {
		
	}

	/**
	 * This method decodes the base64 string content parameter to a byte array.
	 * The boolean parameter defines the endianness order of the return byte array.
	 * [true == little endian],
	 * [false == big endian]
	 * 
	 * @param content
	 * @param littleEndian
	 * @return byte array in an endianness order
	 */
	public static byte[] decode(String content, boolean littleEndian) {

		byte[] decodedString = Base64.getDecoder().decode(content.getBytes(StandardCharsets.UTF_8));
		
		return littleEndian ? ByteArray.reverse(decodedString) : decodedString;
		
	}

}
