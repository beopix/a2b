package a2b.compiler.decoder;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import decoder.PADToByteArray;

class PADToByteArray_Test {
	
	byte[] expectedZero = {};
	byte[] expectedOne = {0};
	byte[] expectedFour = {0, 0, 0, 0};	
	byte[] expected27 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	
	@Test
	void testConvert() {

		assertArrayEquals(expectedZero, PADToByteArray.convert(0));
		assertArrayEquals(expectedOne, PADToByteArray.convert(1));
		assertArrayEquals(expectedFour, PADToByteArray.convert(4));
		assertArrayEquals(expected27, PADToByteArray.convert(27));
		
	}

}
