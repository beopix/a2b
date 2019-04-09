package a2b.compiler.decoder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import decoder.Base64EncodeToByteArray;

class Base64EncodeToByteArray_Test {

	@Test
	void testEncode() {
		/*
		 * abcdefghijklmnopqrstuvwxyz0123456789					
		 * YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXowMTIzNDU2Nzg5
		 */
		
		byte[] expectedDecodedAbcNumber = {89, 87, 74, 106, 90, 71, 86, 109, 90, 50, 104, 112, 97, 109, 116, 115, 98, 87, 53, 118, 99, 
				72, 70, 121, 99, 51, 82, 49, 100, 110, 100, 52, 101, 88, 111, 119, 77, 84, 73, 122, 78, 68, 85, 50, 78, 122, 103, 53};
		
		assertArrayEquals(expectedDecodedAbcNumber, Base64EncodeToByteArray.encode("abcdefghijklmnopqrstuvwxyz0123456789", false));
	}

}
