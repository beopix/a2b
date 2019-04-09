package decoder;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * This class is for encoding a base64 string to its byte representation.
 * 
 * @author rampix
 *
 */
public class Base64EncodeToByteArray {

	private Base64EncodeToByteArray() {

	}

	/**
	 * This method encodes the base64 string content parameter to a byte array.
	 * The boolean parameter defines the endianness order of the return byte array.
	 * [true == little endian], 
	 * [false == big endian]
	 * 
	 * @param content
	 * @param littleEndian
	 * @return byte array in an endianness order
	 */
	public static byte[] encode(String content, boolean littleEndian) {

		byte[] encodedString = Base64.getEncoder().encode(content.getBytes(StandardCharsets.UTF_8));

		return littleEndian ? ByteArray.reverse(encodedString) : encodedString;

	}

}
