/*
 * generated by Xtext 2.17.0
 */
package a2b.serializer;

import a2b.services.A2BGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class A2BSyntacticSequencer extends AbstractSyntacticSequencer {

	protected A2BGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (A2BGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBERule())
			return getBEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLERule())
			return getLEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getNLRule())
			return getNLToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPCAPRule())
			return getPCAPToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * BE:
	 * 	'BE'
	 * ;
	 */
	protected String getBEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "BE";
	}
	
	/**
	 * LE:
	 * 	'LE'
	 * ;
	 */
	protected String getLEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "LE";
	}
	
	/**
	 * NL:
	 * 	'\\n'
	 * ;
	 */
	protected String getNLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\\n";
	}
	
	/**
	 * PCAP:
	 * 	'PCAP'
	 * ;
	 */
	protected String getPCAPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "PCAP";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}
