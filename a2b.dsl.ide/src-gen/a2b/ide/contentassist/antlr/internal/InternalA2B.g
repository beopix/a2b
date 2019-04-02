/*
 * generated by Xtext 2.17.0
 */
grammar InternalA2B;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package a2b.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package a2b.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import a2b.services.A2BGrammarAccess;

}
@parser::members {
	private A2BGrammarAccess grammarAccess;

	public void setGrammarAccess(A2BGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getElementAssignment()); }
		(rule__Model__ElementAssignment)*
		{ after(grammarAccess.getModelAccess().getElementAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInstruction
entryRuleInstruction
:
{ before(grammarAccess.getInstructionRule()); }
	 ruleInstruction
{ after(grammarAccess.getInstructionRule()); } 
	 EOF 
;

// Rule Instruction
ruleInstruction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInstructionAccess().getAlternatives()); }
		(rule__Instruction__Alternatives)
		{ after(grammarAccess.getInstructionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDB
entryRuleDB
:
{ before(grammarAccess.getDBRule()); }
	 ruleDB
{ after(grammarAccess.getDBRule()); } 
	 EOF 
;

// Rule DB
ruleDB 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDBAccess().getGroup()); }
		(rule__DB__Group__0)
		{ after(grammarAccess.getDBAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDW
entryRuleDW
:
{ before(grammarAccess.getDWRule()); }
	 ruleDW
{ after(grammarAccess.getDWRule()); } 
	 EOF 
;

// Rule DW
ruleDW 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDWAccess().getGroup()); }
		(rule__DW__Group__0)
		{ after(grammarAccess.getDWAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDD
entryRuleDD
:
{ before(grammarAccess.getDDRule()); }
	 ruleDD
{ after(grammarAccess.getDDRule()); } 
	 EOF 
;

// Rule DD
ruleDD 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDDAccess().getGroup()); }
		(rule__DD__Group__0)
		{ after(grammarAccess.getDDAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBase64
entryRuleBase64
:
{ before(grammarAccess.getBase64Rule()); }
	 ruleBase64
{ after(grammarAccess.getBase64Rule()); } 
	 EOF 
;

// Rule Base64
ruleBase64 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBase64Access().getGroup()); }
		(rule__Base64__Group__0)
		{ after(grammarAccess.getBase64Access().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleORG
entryRuleORG
:
{ before(grammarAccess.getORGRule()); }
	 ruleORG
{ after(grammarAccess.getORGRule()); } 
	 EOF 
;

// Rule ORG
ruleORG 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getORGAccess().getGroup()); }
		(rule__ORG__Group__0)
		{ after(grammarAccess.getORGAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleINCLUDE
entryRuleINCLUDE
:
{ before(grammarAccess.getINCLUDERule()); }
	 ruleINCLUDE
{ after(grammarAccess.getINCLUDERule()); } 
	 EOF 
;

// Rule INCLUDE
ruleINCLUDE 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getINCLUDEAccess().getGroup()); }
		(rule__INCLUDE__Group__0)
		{ after(grammarAccess.getINCLUDEAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMAC
entryRuleMAC
:
{ before(grammarAccess.getMACRule()); }
	 ruleMAC
{ after(grammarAccess.getMACRule()); } 
	 EOF 
;

// Rule MAC
ruleMAC 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMACAccess().getGroup()); }
		(rule__MAC__Group__0)
		{ after(grammarAccess.getMACAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIP
entryRuleIP
:
{ before(grammarAccess.getIPRule()); }
	 ruleIP
{ after(grammarAccess.getIPRule()); } 
	 EOF 
;

// Rule IP
ruleIP 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIPAccess().getGroup()); }
		(rule__IP__Group__0)
		{ after(grammarAccess.getIPAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleHXS
entryRuleHXS
:
{ before(grammarAccess.getHXSRule()); }
	 ruleHXS
{ after(grammarAccess.getHXSRule()); } 
	 EOF 
;

// Rule HXS
ruleHXS 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getHXSAccess().getGroup()); }
		(rule__HXS__Group__0)
		{ after(grammarAccess.getHXSAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBE
entryRuleBE
:
{ before(grammarAccess.getBERule()); }
	 ruleBE
{ after(grammarAccess.getBERule()); } 
	 EOF 
;

// Rule BE
ruleBE 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBEAccess().getBEKeyword()); }
		'BE'
		{ after(grammarAccess.getBEAccess().getBEKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLE
entryRuleLE
:
{ before(grammarAccess.getLERule()); }
	 ruleLE
{ after(grammarAccess.getLERule()); } 
	 EOF 
;

// Rule LE
ruleLE 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLEAccess().getLEKeyword()); }
		'LE'
		{ after(grammarAccess.getLEAccess().getLEKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePCAP
entryRulePCAP
:
{ before(grammarAccess.getPCAPRule()); }
	 rulePCAP
{ after(grammarAccess.getPCAPRule()); } 
	 EOF 
;

// Rule PCAP
rulePCAP 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPCAPAccess().getPCAPKeyword()); }
		'PCAP'
		{ after(grammarAccess.getPCAPAccess().getPCAPKeyword()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLONG
entryRuleLONG
:
{ before(grammarAccess.getLONGRule()); }
	 ruleLONG
{ after(grammarAccess.getLONGRule()); } 
	 EOF 
;

// Rule LONG
ruleLONG 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLONGAccess().getINTTerminalRuleCall()); }
		RULE_INT
		{ after(grammarAccess.getLONGAccess().getINTTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstructionAccess().getDBParserRuleCall_0()); }
		ruleDB
		{ after(grammarAccess.getInstructionAccess().getDBParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getDWParserRuleCall_1()); }
		ruleDW
		{ after(grammarAccess.getInstructionAccess().getDWParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getDDParserRuleCall_2()); }
		ruleDD
		{ after(grammarAccess.getInstructionAccess().getDDParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getBase64ParserRuleCall_3()); }
		ruleBase64
		{ after(grammarAccess.getInstructionAccess().getBase64ParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getORGParserRuleCall_4()); }
		ruleORG
		{ after(grammarAccess.getInstructionAccess().getORGParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getINCLUDEParserRuleCall_5()); }
		ruleINCLUDE
		{ after(grammarAccess.getInstructionAccess().getINCLUDEParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getMACParserRuleCall_6()); }
		ruleMAC
		{ after(grammarAccess.getInstructionAccess().getMACParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getIPParserRuleCall_7()); }
		ruleIP
		{ after(grammarAccess.getInstructionAccess().getIPParserRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getHXSParserRuleCall_8()); }
		ruleHXS
		{ after(grammarAccess.getInstructionAccess().getHXSParserRuleCall_8()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getGroup_9()); }
		(rule__Instruction__Group_9__0)
		{ after(grammarAccess.getInstructionAccess().getGroup_9()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getGroup_10()); }
		(rule__Instruction__Group_10__0)
		{ after(grammarAccess.getInstructionAccess().getGroup_10()); }
	)
	|
	(
		{ before(grammarAccess.getInstructionAccess().getGroup_11()); }
		(rule__Instruction__Group_11__0)
		{ after(grammarAccess.getInstructionAccess().getGroup_11()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DB__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDBAccess().getStringValueAssignment_1_0()); }
		(rule__DB__StringValueAssignment_1_0)
		{ after(grammarAccess.getDBAccess().getStringValueAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getDBAccess().getIntValueAssignment_1_1()); }
		(rule__DB__IntValueAssignment_1_1)
		{ after(grammarAccess.getDBAccess().getIntValueAssignment_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DW__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDWAccess().getStringValueAssignment_1_0()); }
		(rule__DW__StringValueAssignment_1_0)
		{ after(grammarAccess.getDWAccess().getStringValueAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getDWAccess().getIntValueAssignment_1_1()); }
		(rule__DW__IntValueAssignment_1_1)
		{ after(grammarAccess.getDWAccess().getIntValueAssignment_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DD__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDDAccess().getStringValueAssignment_1_0()); }
		(rule__DD__StringValueAssignment_1_0)
		{ after(grammarAccess.getDDAccess().getStringValueAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getDDAccess().getLongValueAssignment_1_1()); }
		(rule__DD__LongValueAssignment_1_1)
		{ after(grammarAccess.getDDAccess().getLongValueAssignment_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_9__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_9__0__Impl
	rule__Instruction__Group_9__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_9__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getBEAction_9_0()); }
	()
	{ after(grammarAccess.getInstructionAccess().getBEAction_9_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_9__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_9__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_9__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getBEParserRuleCall_9_1()); }
	ruleBE
	{ after(grammarAccess.getInstructionAccess().getBEParserRuleCall_9_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Instruction__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_10__0__Impl
	rule__Instruction__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getLEAction_10_0()); }
	()
	{ after(grammarAccess.getInstructionAccess().getLEAction_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_10__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getLEParserRuleCall_10_1()); }
	ruleLE
	{ after(grammarAccess.getInstructionAccess().getLEParserRuleCall_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Instruction__Group_11__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_11__0__Impl
	rule__Instruction__Group_11__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_11__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getPCAPAction_11_0()); }
	()
	{ after(grammarAccess.getInstructionAccess().getPCAPAction_11_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_11__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instruction__Group_11__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group_11__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstructionAccess().getPCAPParserRuleCall_11_1()); }
	rulePCAP
	{ after(grammarAccess.getInstructionAccess().getPCAPParserRuleCall_11_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DB__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DB__Group__0__Impl
	rule__DB__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DB__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBAccess().getDBKeyword_0()); }
	'DB'
	{ after(grammarAccess.getDBAccess().getDBKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DB__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DB__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DB__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDBAccess().getAlternatives_1()); }
	(rule__DB__Alternatives_1)
	{ after(grammarAccess.getDBAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DW__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DW__Group__0__Impl
	rule__DW__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DW__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDWAccess().getDWKeyword_0()); }
	'DW'
	{ after(grammarAccess.getDWAccess().getDWKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DW__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DW__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DW__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDWAccess().getAlternatives_1()); }
	(rule__DW__Alternatives_1)
	{ after(grammarAccess.getDWAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DD__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DD__Group__0__Impl
	rule__DD__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DD__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDDAccess().getDDKeyword_0()); }
	'DD'
	{ after(grammarAccess.getDDAccess().getDDKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DD__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DD__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DD__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDDAccess().getAlternatives_1()); }
	(rule__DD__Alternatives_1)
	{ after(grammarAccess.getDDAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Base64__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Base64__Group__0__Impl
	rule__Base64__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Base64__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBase64Access().getB64Keyword_0()); }
	'B64'
	{ after(grammarAccess.getBase64Access().getB64Keyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Base64__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Base64__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Base64__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBase64Access().getValueAssignment_1()); }
	(rule__Base64__ValueAssignment_1)
	{ after(grammarAccess.getBase64Access().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ORG__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ORG__Group__0__Impl
	rule__ORG__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ORG__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getORGAccess().getORGKeyword_0()); }
	'ORG'
	{ after(grammarAccess.getORGAccess().getORGKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ORG__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ORG__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ORG__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getORGAccess().getValueAssignment_1()); }
	(rule__ORG__ValueAssignment_1)
	{ after(grammarAccess.getORGAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__INCLUDE__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__INCLUDE__Group__0__Impl
	rule__INCLUDE__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__INCLUDE__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getINCLUDEAccess().getINCLUDEKeyword_0()); }
	'INCLUDE'
	{ after(grammarAccess.getINCLUDEAccess().getINCLUDEKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__INCLUDE__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__INCLUDE__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__INCLUDE__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getINCLUDEAccess().getValueAssignment_1()); }
	(rule__INCLUDE__ValueAssignment_1)
	{ after(grammarAccess.getINCLUDEAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MAC__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MAC__Group__0__Impl
	rule__MAC__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MAC__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMACAccess().getMACKeyword_0()); }
	'MAC'
	{ after(grammarAccess.getMACAccess().getMACKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MAC__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MAC__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MAC__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMACAccess().getValueAssignment_1()); }
	(rule__MAC__ValueAssignment_1)
	{ after(grammarAccess.getMACAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IP__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IP__Group__0__Impl
	rule__IP__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IP__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIPAccess().getIPKeyword_0()); }
	'IP'
	{ after(grammarAccess.getIPAccess().getIPKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IP__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IP__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IP__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIPAccess().getValueAssignment_1()); }
	(rule__IP__ValueAssignment_1)
	{ after(grammarAccess.getIPAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__HXS__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HXS__Group__0__Impl
	rule__HXS__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HXS__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHXSAccess().getHXSKeyword_0()); }
	'HXS'
	{ after(grammarAccess.getHXSAccess().getHXSKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HXS__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HXS__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HXS__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHXSAccess().getValueAssignment_1()); }
	(rule__HXS__ValueAssignment_1)
	{ after(grammarAccess.getHXSAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__ElementAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElementInstructionParserRuleCall_0()); }
		ruleInstruction
		{ after(grammarAccess.getModelAccess().getElementInstructionParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DB__StringValueAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDBAccess().getStringValueBYTETerminalRuleCall_1_0_0()); }
		RULE_BYTE
		{ after(grammarAccess.getDBAccess().getStringValueBYTETerminalRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DB__IntValueAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDBAccess().getIntValueINTTerminalRuleCall_1_1_0()); }
		RULE_INT
		{ after(grammarAccess.getDBAccess().getIntValueINTTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DW__StringValueAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDWAccess().getStringValueWORDTerminalRuleCall_1_0_0()); }
		RULE_WORD
		{ after(grammarAccess.getDWAccess().getStringValueWORDTerminalRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DW__IntValueAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDWAccess().getIntValueINTTerminalRuleCall_1_1_0()); }
		RULE_INT
		{ after(grammarAccess.getDWAccess().getIntValueINTTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DD__StringValueAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDDAccess().getStringValueDOUBLEWORDTerminalRuleCall_1_0_0()); }
		RULE_DOUBLEWORD
		{ after(grammarAccess.getDDAccess().getStringValueDOUBLEWORDTerminalRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DD__LongValueAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDDAccess().getLongValueLONGParserRuleCall_1_1_0()); }
		ruleLONG
		{ after(grammarAccess.getDDAccess().getLongValueLONGParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Base64__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBase64Access().getValueSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getBase64Access().getValueSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ORG__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getORGAccess().getValueINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getORGAccess().getValueINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__INCLUDE__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getINCLUDEAccess().getValuePATHTerminalRuleCall_1_0()); }
		RULE_PATH
		{ after(grammarAccess.getINCLUDEAccess().getValuePATHTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MAC__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMACAccess().getValueMACADDRESSTerminalRuleCall_1_0()); }
		RULE_MACADDRESS
		{ after(grammarAccess.getMACAccess().getValueMACADDRESSTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IP__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIPAccess().getValueIPADDRESSTerminalRuleCall_1_0()); }
		RULE_IPADDRESS
		{ after(grammarAccess.getIPAccess().getValueIPADDRESSTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__HXS__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHXSAccess().getValueHEXSTRINGTerminalRuleCall_1_0()); }
		RULE_HEXSTRING
		{ after(grammarAccess.getHXSAccess().getValueHEXSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

fragment RULE_DECIMALBYTE_ : (('1'..'9')? '0'..'9'|'1' '0'..'9' '0'..'9'|'2' '0'..'4' '0'..'9'|'2' '5' '0'..'5');

fragment RULE_BINARY_ : ('0'|'1') ('0'|'1') ('0'|'1') ('0'|'1') ('0'|'1') ('0'|'1') ('0'|'1') ('0'|'1');

fragment RULE_HEX_ : ('A'..'F'|'a'..'f'|'0'..'9') ('A'..'F'|'a'..'f'|'0'..'9');

RULE_BYTE : ('0b' RULE_BINARY_|'0x' RULE_HEX_);

RULE_WORD : ('0b' RULE_BINARY_ RULE_BINARY_|'0x' RULE_HEX_ RULE_HEX_);

RULE_DOUBLEWORD : ('0b' RULE_BINARY_ RULE_BINARY_ RULE_BINARY_ RULE_BINARY_|'0x' RULE_HEX_ RULE_HEX_ RULE_HEX_ RULE_HEX_);

RULE_PATH : ('A'..'Z' ':')? ('/' ('a'..'z'|'A'..'Z')*)+ ('.' ('a'..'z'|'A'..'Z')*)+;

RULE_MACADDRESS : RULE_HEX_ ':' RULE_HEX_ ':' RULE_HEX_ ':' RULE_HEX_ ':' RULE_HEX_ ':' RULE_HEX_;

RULE_IPADDRESS : RULE_DECIMALBYTE_ '.' RULE_DECIMALBYTE_ '.' RULE_DECIMALBYTE_ '.' RULE_DECIMALBYTE_;

RULE_HEXSTRING : '0h' RULE_HEX_+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
