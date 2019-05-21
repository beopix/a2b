package a2b.compiler.decoder;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import decoder.IncludeToByteArray;

class IncludeToByteArray_Test {
	
	byte[] expectedFile = {-1, -18, -52, -86};

	@Test
	void testConvert() {
	
		assertArrayEquals(expectedFile, IncludeToByteArray.convert("src/test/resources/includeTestFile.bin"));
		
	}

}
