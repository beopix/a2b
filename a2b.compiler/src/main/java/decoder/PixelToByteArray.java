package decoder;

public class PixelToByteArray {

	private PixelToByteArray() {
		
	}
	
	public static byte[] convert(String content, boolean isLittleEndian) {
		String[] pixel = content.split(" ");

		byte[] result = new byte[3];

		for(int i=0; i<3; i++){
			Integer inputInByteArray = Integer.parseInt(pixel[i]);
			result[i] = inputInByteArray.byteValue();
		}

		return isLittleEndian ? ByteArray.reverse(result) : result;
	}
	
}
