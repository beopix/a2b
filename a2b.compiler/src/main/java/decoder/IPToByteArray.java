package decoder;

/**
 * This class is for converting an ip address as a string parameter to its byte representation.
 * 
 * @author rampix
 *
 */
public class IPToByteArray {

	private IPToByteArray() {
		
	}
	
	/**
	 * This method converts the ip address to a byte array.
	 * The boolean parameter defines the endianness order of the return byte array.
	 * [true == little endian],
	 * [false == big endian]
	 * 
	 * @param content
	 * @param isLittleEndian
	 * @return byte array in an endianness order
	 */
	public static byte[] convert(String content, boolean isLittleEndian) {
		String[] ipAddress = content.split("\\.");

		byte[] result = new byte[4];

		for(int i=0; i<4; i++){
			Integer inputInByteArray = Integer.parseInt(ipAddress[i]);
			result[i] = inputInByteArray.byteValue();
		}

		return isLittleEndian ? ByteArray.reverse(result) : result;
	}
	
}
