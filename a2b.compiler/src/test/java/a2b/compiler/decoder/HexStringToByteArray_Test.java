package a2b.compiler.decoder;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import decoder.HexStringToByteArray;

class HexStringToByteArray_Test {
	
	byte[] expectedZero = {0};
	byte[] expectedNegative128 = {-128};
	byte[] expected127 = {127};
	byte[] expectedNegative1 = {-1};
	
	byte[] expectedRandomHexString = {-81, -26, -52, 4, -88, -1, -124};
	byte[] expectedRandomHexStringReversed = {-124, -1, -88, 4, -52, -26, -81};
	
	byte[] expectedZero4 = {0, 0, 0, 0};
	byte[] expected4294967295L = {-1, -1 , -1, -1};
	byte[] expected3548753613L = {-45, -123, -82, -51};
	byte[] expected3548753613LReversed = {-51, -82, -123, -45};

	@Test
	void testConvert() {
		assertArrayEquals(expectedZero, HexStringToByteArray.convert("0h00", false));
		assertArrayEquals(expectedNegative128, HexStringToByteArray.convert("0h80", false));
		assertArrayEquals(expected127, HexStringToByteArray.convert("0h7F", false));
		assertArrayEquals(expectedNegative1, HexStringToByteArray.convert("0hFF", false));
		
		assertArrayEquals(expectedRandomHexString, HexStringToByteArray.convert("0hAFE6CC04A8FF84", false));
		assertArrayEquals(expectedRandomHexStringReversed, HexStringToByteArray.convert("0hAFE6CC04A8FF84", true));
		
		assertArrayEquals(expectedZero4, HexStringToByteArray.convert("0h00000000", false));
		assertArrayEquals(expected4294967295L, HexStringToByteArray.convert("0hFFFFFFFF", false));
		assertArrayEquals(expected3548753613L, HexStringToByteArray.convert("0hD385AECD", false));
		assertArrayEquals(expected3548753613LReversed, HexStringToByteArray.convert("0hD385AECD", true));
	}

}
