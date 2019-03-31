package decoder;

public class DBToByteArray {

	private DBToByteArray() {

	}

	public static byte[] decode(String content) {
		byte inputInByteArray = 0;

		String base = (String) content.subSequence(0, 2);

		content = content.substring(2);

		switch (base) {
		case "0B":
			inputInByteArray = (byte) Integer.parseInt(content);
			break;
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

}
