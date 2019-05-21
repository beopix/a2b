/*
 * generated by Xtext 2.17.0
 */
package a2b.ide.contentassist.antlr;

import a2b.ide.contentassist.antlr.internal.InternalA2BParser;
import a2b.services.A2BGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class A2BParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(A2BGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, A2BGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getInstructionAccess().getAlternatives(), "rule__Instruction__Alternatives");
			builder.put(grammarAccess.getDBAccess().getAlternatives_1(), "rule__DB__Alternatives_1");
			builder.put(grammarAccess.getDWAccess().getAlternatives_1(), "rule__DW__Alternatives_1");
			builder.put(grammarAccess.getDDAccess().getAlternatives_1(), "rule__DD__Alternatives_1");
			builder.put(grammarAccess.getInstructionAccess().getGroup_14(), "rule__Instruction__Group_14__0");
			builder.put(grammarAccess.getInstructionAccess().getGroup_15(), "rule__Instruction__Group_15__0");
			builder.put(grammarAccess.getInstructionAccess().getGroup_16(), "rule__Instruction__Group_16__0");
			builder.put(grammarAccess.getInstructionAccess().getGroup_17(), "rule__Instruction__Group_17__0");
			builder.put(grammarAccess.getDBAccess().getGroup(), "rule__DB__Group__0");
			builder.put(grammarAccess.getDWAccess().getGroup(), "rule__DW__Group__0");
			builder.put(grammarAccess.getDDAccess().getGroup(), "rule__DD__Group__0");
			builder.put(grammarAccess.getSTRAccess().getGroup(), "rule__STR__Group__0");
			builder.put(grammarAccess.getBase64DecodeAccess().getGroup(), "rule__Base64Decode__Group__0");
			builder.put(grammarAccess.getBase64EncodeAccess().getGroup(), "rule__Base64Encode__Group__0");
			builder.put(grammarAccess.getPADAccess().getGroup(), "rule__PAD__Group__0");
			builder.put(grammarAccess.getINCLUDEAccess().getGroup(), "rule__INCLUDE__Group__0");
			builder.put(grammarAccess.getMACAccess().getGroup(), "rule__MAC__Group__0");
			builder.put(grammarAccess.getIPAccess().getGroup(), "rule__IP__Group__0");
			builder.put(grammarAccess.getPXLAccess().getGroup(), "rule__PXL__Group__0");
			builder.put(grammarAccess.getHXSAccess().getGroup(), "rule__HXS__Group__0");
			builder.put(grammarAccess.getCRC16Access().getGroup(), "rule__CRC16__Group__0");
			builder.put(grammarAccess.getCRC32Access().getGroup(), "rule__CRC32__Group__0");
			builder.put(grammarAccess.getModelAccess().getElementAssignment(), "rule__Model__ElementAssignment");
			builder.put(grammarAccess.getDBAccess().getStringValueAssignment_1_0(), "rule__DB__StringValueAssignment_1_0");
			builder.put(grammarAccess.getDBAccess().getIntValueAssignment_1_1(), "rule__DB__IntValueAssignment_1_1");
			builder.put(grammarAccess.getDBAccess().getCrcValueAssignment_2(), "rule__DB__CrcValueAssignment_2");
			builder.put(grammarAccess.getDWAccess().getStringValueAssignment_1_0(), "rule__DW__StringValueAssignment_1_0");
			builder.put(grammarAccess.getDWAccess().getIntValueAssignment_1_1(), "rule__DW__IntValueAssignment_1_1");
			builder.put(grammarAccess.getDWAccess().getCrcValueAssignment_2(), "rule__DW__CrcValueAssignment_2");
			builder.put(grammarAccess.getDDAccess().getStringValueAssignment_1_0(), "rule__DD__StringValueAssignment_1_0");
			builder.put(grammarAccess.getDDAccess().getLongValueAssignment_1_1(), "rule__DD__LongValueAssignment_1_1");
			builder.put(grammarAccess.getDDAccess().getCrcValueAssignment_2(), "rule__DD__CrcValueAssignment_2");
			builder.put(grammarAccess.getSTRAccess().getValueAssignment_1(), "rule__STR__ValueAssignment_1");
			builder.put(grammarAccess.getSTRAccess().getCrcValueAssignment_2(), "rule__STR__CrcValueAssignment_2");
			builder.put(grammarAccess.getBase64DecodeAccess().getValueAssignment_1(), "rule__Base64Decode__ValueAssignment_1");
			builder.put(grammarAccess.getBase64EncodeAccess().getValueAssignment_1(), "rule__Base64Encode__ValueAssignment_1");
			builder.put(grammarAccess.getPADAccess().getValueAssignment_1(), "rule__PAD__ValueAssignment_1");
			builder.put(grammarAccess.getPADAccess().getCrcValueAssignment_2(), "rule__PAD__CrcValueAssignment_2");
			builder.put(grammarAccess.getINCLUDEAccess().getValueAssignment_1(), "rule__INCLUDE__ValueAssignment_1");
			builder.put(grammarAccess.getINCLUDEAccess().getCrcValueAssignment_2(), "rule__INCLUDE__CrcValueAssignment_2");
			builder.put(grammarAccess.getMACAccess().getValueAssignment_1(), "rule__MAC__ValueAssignment_1");
			builder.put(grammarAccess.getMACAccess().getCrcValueAssignment_2(), "rule__MAC__CrcValueAssignment_2");
			builder.put(grammarAccess.getIPAccess().getValueAssignment_1(), "rule__IP__ValueAssignment_1");
			builder.put(grammarAccess.getIPAccess().getCrcValueAssignment_2(), "rule__IP__CrcValueAssignment_2");
			builder.put(grammarAccess.getPXLAccess().getValueAssignment_1(), "rule__PXL__ValueAssignment_1");
			builder.put(grammarAccess.getHXSAccess().getValueAssignment_1(), "rule__HXS__ValueAssignment_1");
			builder.put(grammarAccess.getHXSAccess().getCrcValueAssignment_2(), "rule__HXS__CrcValueAssignment_2");
			builder.put(grammarAccess.getCRC16Access().getCrcValueAssignment_1(), "rule__CRC16__CrcValueAssignment_1");
			builder.put(grammarAccess.getCRC32Access().getCrcValueAssignment_1(), "rule__CRC32__CrcValueAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private A2BGrammarAccess grammarAccess;

	@Override
	protected InternalA2BParser createParser() {
		InternalA2BParser result = new InternalA2BParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public A2BGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(A2BGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
