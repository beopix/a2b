package decoder;

import java.nio.charset.StandardCharsets;

public class StringToByteArray {
	
	private StringToByteArray() {
		
	}
	
	public static byte[] decode(String content, boolean littleEndian) {

		byte[] decodedString = content.getBytes(StandardCharsets.UTF_8);
		
		return littleEndian ? ByteArray.reverse(decodedString) : decodedString;
		
	}

}
