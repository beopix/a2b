package decoder;

public class IPToByteArray {

	private IPToByteArray() {
		
	}
	
	public static byte[] decode(String content, boolean bigEndian) {
		String[] ipAddress = content.split("\\.");

		byte[] result = new byte[4];

		for(int i=0; i<4; i++){
			Integer inputInByteArray = Integer.parseInt(ipAddress[i]);
			result[i] = inputInByteArray.byteValue();
		}

		return bigEndian ? ByteArray.reverse(result) : result;
	}
	
}
