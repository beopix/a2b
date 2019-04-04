/*
 * generated by Xtext 2.17.0
 */
package a2b.serializer;

import a2b.a2B.A2BPackage;
import a2b.a2B.BE;
import a2b.a2B.Base64;
import a2b.a2B.CRC;
import a2b.a2B.DB;
import a2b.a2B.DD;
import a2b.a2B.DW;
import a2b.a2B.HXS;
import a2b.a2B.INCLUDE;
import a2b.a2B.IP;
import a2b.a2B.LE;
import a2b.a2B.MAC;
import a2b.a2B.Model;
import a2b.a2B.ORG;
import a2b.a2B.PCAP;
import a2b.a2B.STR;
import a2b.services.A2BGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class A2BSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private A2BGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == A2BPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case A2BPackage.BE:
				sequence_Instruction(context, (BE) semanticObject); 
				return; 
			case A2BPackage.BASE64:
				sequence_Base64(context, (Base64) semanticObject); 
				return; 
			case A2BPackage.CRC:
				sequence_Instruction(context, (CRC) semanticObject); 
				return; 
			case A2BPackage.DB:
				sequence_DB(context, (DB) semanticObject); 
				return; 
			case A2BPackage.DD:
				sequence_DD(context, (DD) semanticObject); 
				return; 
			case A2BPackage.DW:
				sequence_DW(context, (DW) semanticObject); 
				return; 
			case A2BPackage.HXS:
				sequence_HXS(context, (HXS) semanticObject); 
				return; 
			case A2BPackage.INCLUDE:
				sequence_INCLUDE(context, (INCLUDE) semanticObject); 
				return; 
			case A2BPackage.IP:
				sequence_IP(context, (IP) semanticObject); 
				return; 
			case A2BPackage.LE:
				sequence_Instruction(context, (LE) semanticObject); 
				return; 
			case A2BPackage.MAC:
				sequence_MAC(context, (MAC) semanticObject); 
				return; 
			case A2BPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case A2BPackage.ORG:
				sequence_ORG(context, (ORG) semanticObject); 
				return; 
			case A2BPackage.PCAP:
				sequence_Instruction(context, (PCAP) semanticObject); 
				return; 
			case A2BPackage.STR:
				sequence_STR(context, (STR) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Instruction returns Base64
	 *     Base64 returns Base64
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Base64(ISerializationContext context, Base64 semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, A2BPackage.Literals.BASE64__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, A2BPackage.Literals.BASE64__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBase64Access().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns DB
	 *     DB returns DB
	 *
	 * Constraint:
	 *     ((stringValue=BYTE | intValue=INT) crcValue=CRCCHECK?)
	 */
	protected void sequence_DB(ISerializationContext context, DB semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns DD
	 *     DD returns DD
	 *
	 * Constraint:
	 *     ((stringValue=DOUBLEWORD | longValue=LONG) crcValue=CRCCHECK?)
	 */
	protected void sequence_DD(ISerializationContext context, DD semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns DW
	 *     DW returns DW
	 *
	 * Constraint:
	 *     ((stringValue=WORD | intValue=INT) crcValue=CRCCHECK?)
	 */
	protected void sequence_DW(ISerializationContext context, DW semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns HXS
	 *     HXS returns HXS
	 *
	 * Constraint:
	 *     (value=HEXSTRING crcValue=CRCCHECK?)
	 */
	protected void sequence_HXS(ISerializationContext context, HXS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns INCLUDE
	 *     INCLUDE returns INCLUDE
	 *
	 * Constraint:
	 *     value=PATH
	 */
	protected void sequence_INCLUDE(ISerializationContext context, INCLUDE semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, A2BPackage.Literals.INCLUDE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, A2BPackage.Literals.INCLUDE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getINCLUDEAccess().getValuePATHTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns IP
	 *     IP returns IP
	 *
	 * Constraint:
	 *     (value=IPADDRESS crcValue=CRCCHECK?)
	 */
	protected void sequence_IP(ISerializationContext context, IP semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns BE
	 *
	 * Constraint:
	 *     {BE}
	 */
	protected void sequence_Instruction(ISerializationContext context, BE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns CRC
	 *
	 * Constraint:
	 *     {CRC}
	 */
	protected void sequence_Instruction(ISerializationContext context, CRC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns LE
	 *
	 * Constraint:
	 *     {LE}
	 */
	protected void sequence_Instruction(ISerializationContext context, LE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns PCAP
	 *
	 * Constraint:
	 *     {PCAP}
	 */
	protected void sequence_Instruction(ISerializationContext context, PCAP semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns MAC
	 *     MAC returns MAC
	 *
	 * Constraint:
	 *     (value=MACADDRESS crcValue=CRCCHECK?)
	 */
	protected void sequence_MAC(ISerializationContext context, MAC semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     element+=Instruction+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns ORG
	 *     ORG returns ORG
	 *
	 * Constraint:
	 *     (value=INT crcValue=CRCCHECK?)
	 */
	protected void sequence_ORG(ISerializationContext context, ORG semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns STR
	 *     STR returns STR
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_STR(ISerializationContext context, STR semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, A2BPackage.Literals.STR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, A2BPackage.Literals.STR__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSTRAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
}
