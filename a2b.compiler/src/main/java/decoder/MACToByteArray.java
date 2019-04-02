package decoder;

public class MACToByteArray {

	private MACToByteArray() {

	}

	public static byte[] decode(String content, boolean littleEndian) {
		
		String[] macAddress = content.split(":");

		byte[] result = new byte[6];

		for(int i=0; i<6; i++){
			Integer inputInByteArray = Integer.parseInt(macAddress[i], 16);
			result[i] = inputInByteArray.byteValue();
		}

		return littleEndian ? ByteArray.reverse(result) : result;
	}

}
