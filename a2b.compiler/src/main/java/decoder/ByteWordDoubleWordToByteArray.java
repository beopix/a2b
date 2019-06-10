package decoder;

import java.nio.ByteBuffer;

/**
 * This class is for converting define_byte, define_word and define_doubleWord as an integer or 
 * string parameter to their byte representation
 * 
 * @author rampix
 *
 */
public class ByteWordDoubleWordToByteArray {

	private ByteWordDoubleWordToByteArray() {

	}

	/**
	 * This method converts define_byte to a byte array.
	 * The parameter content defines the integer value from the DB instruction.
	 * The first if checks that only values from 0 to 255 are accepted.
	 * Its unnecessary because the language a2b has its own validation, but just for safety.
	 * 
	 * @param content
	 * @return byte array
	 */
	public static byte[] convertDBInteger(int content) {

		if(content > 255 || content < 0) {
			return null;
		}

		byte inputInByteArray = (byte) content;

		byte[] result = { inputInByteArray };

		return result;
	}

	/**
	 * This method converts define_word to a byte array.
	 * The boolean parameter defines the endianness order of the return byte array.
	 * [true == little endian],
	 * [false == big endian]
	 * The parameter content defines the integer value from the DW instruction.
	 * The first if-query is unnecessary because the language a2b has its own validation, but just for safety.
	 * 
	 * @param content
	 * @param isLittleEndian
	 * @return byte array in an endianness order
	 */
	public static byte[] convertDWInteger(int content, boolean isLittleEndian) {

		if(content > 65535 || content < 0) {
			return null;
		}

		short input = (short) content;

		ByteBuffer buffer = ByteBuffer.allocate(2).putShort(input);

		byte[] result = buffer.array();

		return isLittleEndian ? ByteArray.reverse(result) : result;
	}

	/**
	 * This method converts define_doubleWord to a byte array.
	 * The boolean parameter defines the endianness order of the return byte array.
	 * [true == little endian],
	 * [false == big endian]
	 * The parameter content defines the integer value from the DD instruction.
	 * The first if query is unnecessary because the language a2b has its own validation, but just for safety.
	 * 
	 * @param content
	 * @param isLittleEndian
	 * @return byte array in an endianess order
	 */
	public static byte[] convertDDInteger(long content, boolean isLittleEndian) {

		if(content > 4294967295L || content < 0) {
			return null;
		}

		int input = (int) content;

		ByteBuffer buffer = ByteBuffer.allocate(4).putInt(input);

		byte[] result = buffer.array();

		return isLittleEndian ? ByteArray.reverse(result) : result;
	}



	/**
	 * This method converts define_byte to a byte array.
	 * The parameter content defines the string value from the DB instruction.
	 * The first two characters of the string represent the number system, which is relevant for the next
	 * step of converting.
	 * [0b == binary number system],
	 * [0x == hexadecimal number system] 
	 * 
	 * @param content
	 * @return byte array
	 */
	public static byte[] convertDBString(String content) {
		byte inputInByteArray = 0;

		String base = (String) content.subSequence(0, 2);
		content = content.substring(2);

		switch (base) {
		case "0b":
			inputInByteArray = (byte) (int) Integer.valueOf(content, 2);
			break;
		case "0x":
			inputInByteArray = (byte) ((Character.digit(content.charAt(0), 16) << 4)
					+ Character.digit(content.charAt(1), 16));
			break;
		}

		byte[] result = { inputInByteArray };

		return result;
	}

	/**
	 * This method converts define_word to a byte array.
	 * The boolean parameter defines the endianness order of the return byte array.
	 * [true == little endian],
	 * [false == big endian]
	 * The parameter content defines the string value from the DW instruction.
	 * The first two characters of the string represent the number system, which is relevant for the next
	 * step of converting.
	 * [0b == binary number system],
	 * [0x == hexadecimal number system] 
	 * 
	 * @param content
	 * @param isLittleEndian
	 * @return byte array in an endianess order
	 */
	public static byte[] convertDWString(String content, boolean isLittleEndian) {

		String base = (String) content.subSequence(0, 2);
		content = content.substring(2);

		byte[] result = null;

		switch (base) {
		case "0b":
			short shortTo2Bytes = (short) (int) Integer.valueOf(content, 2);
			ByteBuffer buffer = ByteBuffer.allocate(2).putShort(shortTo2Bytes);
			result = buffer.array();
			break;
		case "0x":
			result = HexStringToByteArray.convert("0x" + content, false);
			break;
		}

		return isLittleEndian ? ByteArray.reverse(result) : result;
	}

	/**
	 * This method converts define_doubleWord to a byte array.
	 * The boolean parameter defines the endianness order of the return byte array.
	 * [true == little endian],
	 * [false == big endian]
	 * The parameter content defines the string value from the DD instruction.
	 * The first two characters of the string represent the number system, which is relevant for the next
	 * step of converting.
	 * [0b == binary number system],
	 * [0x == hexadecimal number system] 
	 * 
	 * @param content
	 * @param isLittleEndian
	 * @return a byte array in an endianess order
	 */
	public static byte[] convertDDString(String content, boolean isLittleEndian) {

		String base = (String) content.subSequence(0, 2);
		content = content.substring(2);

		byte[] result = null;

		switch (base) {
		case "0b":
			int integerTo2Bytes = (int) (long) Long.valueOf(content, 2);
			ByteBuffer buffer = ByteBuffer.allocate(4).putInt(integerTo2Bytes);
			result = buffer.array();
			break;
		case "0x":
			result = HexStringToByteArray.convert("0x" + content, false);
			break;
		}

		return isLittleEndian ? ByteArray.reverse(result) : result;

	}
	
}
