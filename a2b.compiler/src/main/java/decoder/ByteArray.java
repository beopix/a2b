package decoder;

import org.apache.commons.lang3.ArrayUtils;

public class ByteArray {

	private ByteArray() {

	}

	public static byte[] reverse(byte[] array) {
		
		ArrayUtils.reverse(array);
		
		return array;
	}
}
