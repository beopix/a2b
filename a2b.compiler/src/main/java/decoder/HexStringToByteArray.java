package decoder;

public class HexStringToByteArray {

	private HexStringToByteArray() {
		
	}
	
	public static byte[] decode(String content, boolean bigEndian) {
		content = content.substring(2);
	    int len = content.length();
	    byte[] result = new byte[len / 2];
	    for (int i = 0; i < len; i += 2) {
	        result[i / 2] = (byte) ((Character.digit(content.charAt(i), 16) << 4)
	                             + Character.digit(content.charAt(i+1), 16));
	    }
	    
	    return bigEndian ? ByteArray.reverse(result) : result;
	}

}
