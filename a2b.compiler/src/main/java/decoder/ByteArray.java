package decoder;

public class ByteArray {

	private ByteArray() {

	}

	public static byte[] reverse(final byte[] array) {
		//      if (array == null) {
		//          return ;
		//      }
		int startIndexInclusive = 0;
		int endIndexExclusive = array.length;
		
		int i = startIndexInclusive < 0 ? 0 : startIndexInclusive;
		int j = Math.min(array.length, endIndexExclusive) - 1;
		byte tmp;
		while (j > i) {
			tmp = array[j];
			array[j] = array[i];
			array[i] = tmp;
			j--;
			i++;
		}
		return array;
	}
}
