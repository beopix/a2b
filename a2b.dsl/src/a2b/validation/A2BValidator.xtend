/*
 * generated by Xtext 2.17.0
 */
package a2b.validation

import a2b.a2B.DW
import org.eclipse.xtext.validation.Check
import a2b.a2B.A2BPackage
import a2b.a2B.DB
import a2b.a2B.DD
import a2b.a2B.INCLUDE

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class A2BValidator extends AbstractA2BValidator {
	public static val INVALID_SYNTAX = 'Invalid.Syntax'
	@Check
	def checkDDIntegerValue(DD dd){
		if(dd.longValue > 4294967295L || dd.longValue < 0){
			error('Value for integer is between 0 and 4294967295', A2BPackage.Literals.DD__LONG_VALUE, INVALID_SYNTAX)
		}
	}
	
	@Check
	def checkDWShortValue(DW dw){
		if(dw.intValue > 65535 || dw.intValue < 0){
			error('Value for short is between 0 and 65535', A2BPackage.Literals.DW__INT_VALUE, INVALID_SYNTAX)
		}	
	}
	
	@Check
	def checkDBByteValue(DB db){
		if(db.intValue > 255 || db.intValue < 0){
			error('Value for byte is between 0 and 255', A2BPackage.Literals.DB__INT_VALUE, INVALID_SYNTAX)
		}
	}
	
	@Check
	def checkIncludeString(INCLUDE include){
		if(include.value.endsWith(".*\\.^[a-zA-Z0-9]*$")){
			error('Include value should end with a file', A2BPackage.Literals.INCLUDE__VALUE, INVALID_SYNTAX)
		}
	}
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					A2BPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
}
