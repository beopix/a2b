package a2b.compiler.decoder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import decoder.StringToByteArray;

class StringToByteArray_Test {
	
	byte[] expectedHello_World = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};
	byte[] expectedHello_WorldReversed = {100, 108, 114, 111, 87, 32, 111, 108, 108, 101, 72};
	
	byte[] expectedSpecialCharacters = {46, 58, 44, 59, 35, 39, 92, 47, 38, 37, 43, 42, 126};
	byte[] expectedSpecialCharactersReversed = {126, 42, 43, 37, 38, 47, 92, 39, 35, 59, 44, 58, 46};
	
	@Test
	void testConvert() {

		assertArrayEquals(expectedHello_World, StringToByteArray.convert("Hello World", false));
		assertArrayEquals(expectedHello_WorldReversed, StringToByteArray.convert("Hello World", true));
		
		assertArrayEquals(expectedSpecialCharacters, StringToByteArray.convert(".:,;#'\\/&%+*~", false));
		assertArrayEquals(expectedSpecialCharactersReversed, StringToByteArray.convert(".:,;#'\\/&%+*~", true));
		
	}

}
