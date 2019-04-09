package a2b.compiler.decoder;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import decoder.ByteWordDoubleWordToByteArray;

class ByteWordDoubleWordToByteArray_Test {


	@Test
	void testDecodeDBInteger() {
		byte[] expectedZero = {0};
		byte[] expectedNegative128 = {-128};
		byte[] expected127 = {127};
		byte[] expectedNegative1 = {-1};
		byte[] expectedNull = null;

		assertArrayEquals(expectedZero, ByteWordDoubleWordToByteArray.convertDBInteger(0));
		assertArrayEquals(expectedNegative128, ByteWordDoubleWordToByteArray.convertDBInteger(128));
		assertArrayEquals(expected127, ByteWordDoubleWordToByteArray.convertDBInteger(127));
		assertArrayEquals(expectedNegative1, ByteWordDoubleWordToByteArray.convertDBInteger(255));
		assertArrayEquals(expectedNull, ByteWordDoubleWordToByteArray.convertDBInteger(-1));
		assertArrayEquals(expectedNull, ByteWordDoubleWordToByteArray.convertDBInteger(256));
	}

	@Test
	void testDecodeDWInteger() {
		byte[] expectedZero = {0, 0};
		byte[] expected65353 = {-1, 73};
		byte[] expected65535 = {-1, -1};
		byte[] expected25734 = {100, -122};
		byte[] expected25734Reversed = {-122, 100};
		byte[] expectedNull = null;

		assertArrayEquals(expectedZero, ByteWordDoubleWordToByteArray.convertDWInteger(0, false));
		assertArrayEquals(expected65353, ByteWordDoubleWordToByteArray.convertDWInteger(65353, false));
		assertArrayEquals(expected65535, ByteWordDoubleWordToByteArray.convertDWInteger(65535, false));
		assertArrayEquals(expected25734, ByteWordDoubleWordToByteArray.convertDWInteger(25734, false));
		assertArrayEquals(expected25734Reversed, ByteWordDoubleWordToByteArray.convertDWInteger(25734, true));
		assertArrayEquals(expectedNull, ByteWordDoubleWordToByteArray.convertDWInteger(65536, false));
		assertArrayEquals(expectedNull, ByteWordDoubleWordToByteArray.convertDWInteger(-1, true));
	}

	@Test
	void testDecodeDDInteger() {
		byte[] expectedZero = {0, 0, 0, 0};
		byte[] expected4294967295L = {-1, -1 , -1, -1};
		byte[] expected3548753613L = {-45, -123, -82, -51};
		byte[] expected3548753613LReversed = {-51, -82, -123, -45};
		byte[] expectedNull = null;

		assertArrayEquals(expectedZero, ByteWordDoubleWordToByteArray.convertDDInteger(0L, false));
		assertArrayEquals(expected4294967295L, ByteWordDoubleWordToByteArray.convertDDInteger(4294967295L, false));
		assertArrayEquals(expected3548753613L, ByteWordDoubleWordToByteArray.convertDDInteger(3548753613L, false));
		assertArrayEquals(expected3548753613LReversed, ByteWordDoubleWordToByteArray.convertDDInteger(3548753613L, true));
		assertArrayEquals(expectedNull, ByteWordDoubleWordToByteArray.convertDDInteger(4294967296L, false));
		assertArrayEquals(expectedNull, ByteWordDoubleWordToByteArray.convertDDInteger(-1L, false));
	}

	@Test
	void testDecodeDBString() {
		byte[] expectedZero = {0};
		byte[] expectedNegative128 = {-128};
		byte[] expected127 = {127};
		byte[] expectedNegative1 = {-1};

		assertArrayEquals(expectedZero, ByteWordDoubleWordToByteArray.convertDBString("0b00000000"));
		assertArrayEquals(expectedZero, ByteWordDoubleWordToByteArray.convertDBString("0x00"));
		assertArrayEquals(expectedNegative128, ByteWordDoubleWordToByteArray.convertDBString("0b10000000"));
		assertArrayEquals(expectedNegative128, ByteWordDoubleWordToByteArray.convertDBString("0x80"));
		assertArrayEquals(expected127, ByteWordDoubleWordToByteArray.convertDBString("0b01111111"));
		assertArrayEquals(expected127, ByteWordDoubleWordToByteArray.convertDBString("0x7F"));
		assertArrayEquals(expectedNegative1, ByteWordDoubleWordToByteArray.convertDBString("0b11111111"));
		assertArrayEquals(expectedNegative1, ByteWordDoubleWordToByteArray.convertDBString("0xFF"));

	}

	@Test
	void testDecodeDWString() {
		byte[] expectedZero = {0, 0};
		byte[] expected65353 = {-1, 73};
		byte[] expected65535 = {-1, -1};
		byte[] expected25734 = {100, -122};
		byte[] expected25734Reversed = {-122, 100};

		assertArrayEquals(expectedZero, ByteWordDoubleWordToByteArray.convertDWString("0b0000000000000000", false));
		assertArrayEquals(expectedZero, ByteWordDoubleWordToByteArray.convertDWString("0x0000" , false));
		assertArrayEquals(expected65353, ByteWordDoubleWordToByteArray.convertDWString("0b1111111101001001" , false));
		assertArrayEquals(expected65353, ByteWordDoubleWordToByteArray.convertDWString("0xFF49" , false));
		assertArrayEquals(expected65535, ByteWordDoubleWordToByteArray.convertDWString("0b1111111111111111" , false));
		assertArrayEquals(expected65535, ByteWordDoubleWordToByteArray.convertDWString("0xFFFF" , false));
		assertArrayEquals(expected25734, ByteWordDoubleWordToByteArray.convertDWString("0b0110010010000110" , false));
		assertArrayEquals(expected25734, ByteWordDoubleWordToByteArray.convertDWString("0x6486" , false));
		assertArrayEquals(expected25734Reversed, ByteWordDoubleWordToByteArray.convertDWString("0b0110010010000110" , true));
		assertArrayEquals(expected25734Reversed, ByteWordDoubleWordToByteArray.convertDWString("0x6486" , true));


	}

	@Test
	void testDecodeDDString() {
		byte[] expectedZero = {0, 0, 0, 0};
		byte[] expected4294967295L = {-1, -1 , -1, -1};
		byte[] expected3548753613L = {-45, -123, -82, -51};
		byte[] expected3548753613LReversed = {-51, -82, -123, -45};

		assertArrayEquals(expectedZero, ByteWordDoubleWordToByteArray.convertDDString("0b00000000000000000000000000000000", false));
		assertArrayEquals(expectedZero, ByteWordDoubleWordToByteArray.convertDDString("0x00000000" , false));
		assertArrayEquals(expected4294967295L, ByteWordDoubleWordToByteArray.convertDDString("0b11111111111111111111111111111111", false));
		assertArrayEquals(expected4294967295L, ByteWordDoubleWordToByteArray.convertDDString("0xFFFFFFFF" , false));
		assertArrayEquals(expected3548753613L, ByteWordDoubleWordToByteArray.convertDDString("0b11010011100001011010111011001101", false));
		assertArrayEquals(expected3548753613L, ByteWordDoubleWordToByteArray.convertDDString("0xD385AECD" , false));
		assertArrayEquals(expected3548753613LReversed, ByteWordDoubleWordToByteArray.convertDDString("0b11010011100001011010111011001101", true));
		assertArrayEquals(expected3548753613LReversed, ByteWordDoubleWordToByteArray.convertDDString("0xD385AECD" , true));
	}

}
