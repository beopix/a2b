package decoder;

import org.apache.commons.lang3.ArrayUtils;

/**
 * This class holds some helper methods for manipulating byte arrays.
 * 
 * @author rampix
 *
 */
public class ByteArray {

	private ByteArray() {

	}

	public static byte[] reverse(byte[] array) {
		
		ArrayUtils.reverse(array);
		
		return array;
	}
}
