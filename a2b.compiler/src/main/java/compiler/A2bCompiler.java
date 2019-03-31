package compiler;

import org.eclipse.emf.common.util.EList;

import a2b.a2B.Base64;
import a2b.a2B.DB;
import a2b.a2B.HXS;
import a2b.a2B.INCLUDE;
import a2b.a2B.IP;
import a2b.a2B.Instruction;
import a2b.a2B.MAC;
import a2b.a2B.Model;
import a2b.a2B.ORG;

import decoder.Base64ToByteArray;
import decoder.DBToByteArray;
import decoder.HexStringToByteArray;
import decoder.IPToByteArray;
import decoder.IncludeToByteArray;
import decoder.MACToByteArray;
import decoder.ORGToByteArray;

public class A2bCompiler {

	A2bParser a2bParser;
	Model model;

	public A2bCompiler(String languageFilePath) {
		a2bParser = new A2bParser();
		model = a2bParser.parse(languageFilePath);
	}

	public byte[] compile() {
		boolean  bigEndian = false;
		
		byte[] result = {};
		
		EList<Instruction> instructionValue = model.getElement();
		
		for(Instruction instruction: instructionValue) {
			
			switch(instruction.eClass().getName()) {
			
			case "DB":
				DB writeByte = (DB) instruction;
				result = appendByteArray(result, DBToByteArray.decode(writeByte.getValue()));
				break;
			case "Base64":
				Base64 base64 = (Base64) instruction;
				result = appendByteArray(result, Base64ToByteArray.decode(base64.getValue(), bigEndian));
				break;
			case "ORG":
				ORG org = (ORG) instruction;
				result = appendByteArray(result, ORGToByteArray.decode(org.getValue()));
				break;
			case "INCLUDE":
				INCLUDE include = (INCLUDE) instruction;
				result = appendByteArray(result, IncludeToByteArray.decode(include.getValue()));
				break;
			case "MAC":
				MAC mac = (MAC) instruction;
				result = appendByteArray(result, MACToByteArray.decode(mac.getValue(), bigEndian));
				break;
			case "IP":
				IP ip = (IP) instruction;
				result = appendByteArray(result, IPToByteArray.decode(ip.getValue(), bigEndian));
				break;
			case "HXS":
				HXS hxs = (HXS) instruction;
				result = appendByteArray(result, HexStringToByteArray.decode(hxs.getValue(), bigEndian));
				break;
			case "BE":
				bigEndian = true;
				break;
			case "LE":
				bigEndian = false;
				break;
			}
			
		}
		
		return result;
	}
	
	private byte[] appendByteArray(byte[] kilo, byte[] lima) {
		byte[] mike = new byte[kilo.length + lima.length];

		System.arraycopy(kilo, 0, mike, 0, kilo.length);
		System.arraycopy(lima, 0, mike, kilo.length, lima.length);

		return mike;
	}

}
