package a2b.compiler.decoder;

import static org.junit.Assert.assertArrayEquals;

import org.eclipse.emf.common.util.EList;
import org.junit.jupiter.api.Test;

import a2b.a2B.Instruction;
import a2b.a2B.Model;
import compiler.A2BParseErrorException;
import compiler.A2bParser;
import decoder.ChecksumToByteArray;

class ChecksumToByteArray_Test {
	
	A2bParser a2bParser;
	Model model;
	EList<Instruction> instructionValue;
	
	public  void setUp() throws A2BParseErrorException{
		
		a2bParser = new A2bParser();
		
		model = a2bParser.parse("src/test/resources/checksumTestFile.a2b");
		
		instructionValue = model.getElement();
	}
	
	byte[] expectedChecksumAFAF = {80, 80};
	
	byte[] expectedChecksumAFAFAFAF = {-119, -98, -46, 77};

	
	
	@Test
	void testConvert16() throws A2BParseErrorException{
		setUp();
		assertArrayEquals(expectedChecksumAFAF, ChecksumToByteArray.convert16(instructionValue, "#", false));
	}
	
	@Test
	void testConvert32() throws A2BParseErrorException{
		setUp();
		assertArrayEquals(expectedChecksumAFAFAFAF, ChecksumToByteArray.convert32(instructionValue, "##", false));

	}


}
