package a2b.compiler.decoder;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import decoder.Base64DecodeToByteArray;

class Base64DecodeToByteArray_Test {

	@Test
	void testDecode() {
		/*
		 * abcdefghijklmnopqrstuvwxyz0123456789					
		 * YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXowMTIzNDU2Nzg5
		 */
		
		byte[] expectedAbcNumber = {97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118,
				119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
		
		assertArrayEquals(expectedAbcNumber, Base64DecodeToByteArray.decode("YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXowMTIzNDU2Nzg5", false));
		
	}

}
