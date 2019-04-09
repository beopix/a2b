package decoder;

/**
 * This class is for converting an org instruction to its byte representation.
 * 
 * @author rampix
 *
 */
public class ORGToByteArray {

	private ORGToByteArray() {
		
	}
	
	/**
	 * This method converts the org instruction to a byte array.
	 * The integer parameter size defines the byte array size which will be filled with zeros.
	 * 
	 * @param size
	 * @return byte array
	 */
	public static byte[] convert(int size) {
		byte[] result = new byte[size];

		return result; 
	}

}
