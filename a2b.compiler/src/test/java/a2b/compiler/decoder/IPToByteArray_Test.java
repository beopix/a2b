package a2b.compiler.decoder;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import decoder.IPToByteArray;

class IPToByteArray_Test {
	
	byte[] expectedAllZeroIPAddress = {0, 0, 0, 0};
	byte[] expectedAll255IPAddress = {-1, -1, -1, -1};
	byte[] expected_192_168_178_65_IPAddress = {-64, -88, -78, 65};
	byte[] expected_192_168_178_65_IPAddressReversed = {65, -78, -88, -64};
	
	
	@Test
	void testConvert() {

		assertArrayEquals(expectedAllZeroIPAddress, IPToByteArray.convert("0.0.0.0", false));
		assertArrayEquals(expectedAll255IPAddress, IPToByteArray.convert("255.255.255.255", false));
		assertArrayEquals(expected_192_168_178_65_IPAddress, IPToByteArray.convert("192.168.178.65", false));
		assertArrayEquals(expected_192_168_178_65_IPAddressReversed, IPToByteArray.convert("192.168.178.65", true));
		
	}

}
