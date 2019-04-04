package decoder;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64EncodeToByteArray {

	private Base64EncodeToByteArray() {

	}

	public static byte[] encode(String content, boolean littleEndian) {

		byte [] encodedString = Base64.getEncoder().encode(content.getBytes(StandardCharsets.UTF_8));

		return littleEndian ? ByteArray.reverse(encodedString) : encodedString;

	}

}
