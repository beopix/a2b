package a2b.compiler.decoder;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import decoder.MACToByteArray;

class MACToByteArray_Test {

	byte[] expectedAllZeroMacAddress = {0, 0, 0, 0, 0, 0};
	byte[] expectedAllFFMacAddress = {-1, -1, -1, -1, -1, -1};
	byte[] expected_FE_C4_85_C1_0A_99_MacAddress = {-2, -60, -123, -63, 10, -103};
	byte[] expected_FE_C4_85_C1_0A_99_MacAddressReversed = {-103, 10, -63, -123, -60, -2};
	
	@Test
	void testConvert() {

		assertArrayEquals(expectedAllZeroMacAddress, MACToByteArray.convert("00:00:00:00:00:00", false));
		assertArrayEquals(expectedAllFFMacAddress, MACToByteArray.convert("FF:FF:FF:FF:FF:FF", false));
		assertArrayEquals(expected_FE_C4_85_C1_0A_99_MacAddress, MACToByteArray.convert("FE:C4:85:C1:0A:99", false));
		assertArrayEquals(expected_FE_C4_85_C1_0A_99_MacAddressReversed, MACToByteArray.convert("FE:C4:85:C1:0A:99", true));
		
	}

}
