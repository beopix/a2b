package decoder;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64ToByteArray {

	private Base64ToByteArray() {
		
	}

	public static byte[] decode(String content, boolean littleEndian) {

		//START: old stuff
		//String base64EncodedString = "";

		//soll statt Encoder ein Decoder sein
		//base64EncodedString = Base64.getEncoder().encodeToString(content.getBytes(StandardCharsets.UTF_8));

		//base64EncodedString = Base64.getEncoder().encode(content.getBytes(StandardCharsets.UTF_8));

		//System.out.println(base64EncodedString);

		//byte[] result = base64EncodedString.getBytes();

		//System.out.println(Arrays.toString(result));

		//result = testPNG;

		//END: old stuff

		byte[] decodedString = Base64.getDecoder().decode(content.getBytes(StandardCharsets.UTF_8));
		
		return littleEndian ? ByteArray.reverse(decodedString) : decodedString;
		
	}

}
