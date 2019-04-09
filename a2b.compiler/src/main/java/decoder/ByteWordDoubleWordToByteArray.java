package decoder;

import java.nio.ByteBuffer;

public class ByteWordDoubleWordToByteArray {

	private ByteWordDoubleWordToByteArray() {

	}

	public static byte[] convertDBInteger(int content) {

		if(content > 255 || content < 0) {
			return null;
		}

		byte inputInByteArray = (byte) content;

		byte[] result = { inputInByteArray };

		return result;
	}

	public static byte[] convertDWInteger(int content, boolean littleEndian) {

		if(content > 65535 || content < 0) {
			return null;
		}

		short input = (short) content;

		ByteBuffer buffer = ByteBuffer.allocate(2).putShort(input);

		byte[] result = buffer.array();

		return littleEndian ? ByteArray.reverse(result) : result;
	}

	public static byte[] convertDDInteger(long content, boolean littleEndian) {

		if(content > 4294967295L || content < 0) {
			return null;
		}

		int input = (int) content;

		ByteBuffer buffer = ByteBuffer.allocate(4).putInt(input);

		byte[] result = buffer.array();

		return littleEndian ? ByteArray.reverse(result) : result;
	}



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

	public static byte[] convertDWString(String content, boolean littleEndian) {

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

		return littleEndian ? ByteArray.reverse(result) : result;
	}

	public static byte[] convertDDString(String content, boolean littleEndian) {

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

		return littleEndian ? ByteArray.reverse(result) : result;

	}
	
}
