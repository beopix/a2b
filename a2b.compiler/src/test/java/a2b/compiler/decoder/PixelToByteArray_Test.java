package a2b.compiler.decoder;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import decoder.PixelToByteArray;

class PixelToByteArray_Test {
	
	byte[] expectedAllZero = {0, 0, 0};
	byte[] expected255_255_255 = {-1, -1 , -1};
	byte[] expectedRandomPixel = {-45, -123, -82};
	byte[] expectedRandomPixelReversed = {-82, -123, -45};
	
	@Test
	void testConvert() {

		assertArrayEquals(expectedAllZero, PixelToByteArray.convert("0 0 0", false));
		assertArrayEquals(expected255_255_255, PixelToByteArray.convert("255 255 255", false));
		assertArrayEquals(expectedRandomPixel, PixelToByteArray.convert("211 133 174", false));
		assertArrayEquals(expectedRandomPixelReversed, PixelToByteArray.convert("211 133 174", true));
		
	}

}
