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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalA2BParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_BYTE", "RULE_WORD", "RULE_DOUBLEWORD", "RULE_STRING", "RULE_PATH", "RULE_MACADDRESS", "RULE_IPADDRESS", "RULE_HEXSTRING", "RULE_DECIMALBYTE_", "RULE_BINARY_", "RULE_HEX_", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BE'", "'LE'", "'PCAP'", "'DB'", "'DW'", "'DD'", "'B64'", "'ORG'", "'INCLUDE'", "'MAC'", "'IP'", "'HXS'"
    };
    public static final int RULE_HEX_=15;
    public static final int RULE_WORD=6;
    public static final int RULE_BINARY_=14;
    public static final int RULE_DOUBLEWORD=7;
    public static final int RULE_BYTE=5;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=18;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_HEXSTRING=12;
    public static final int RULE_ID=16;
    public static final int RULE_WS=19;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_PATH=9;
    public static final int RULE_MACADDRESS=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int RULE_DECIMALBYTE_=13;
    public static final int T__22=22;
    public static final int RULE_IPADDRESS=11;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalA2BParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalA2BParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalA2BParser.tokenNames; }
    public String getGrammarFileName() { return "InternalA2B.g"; }


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



    // $ANTLR start "entryRuleModel"
    // InternalA2B.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalA2B.g:54:1: ( ruleModel EOF )
            // InternalA2B.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalA2B.g:62:1: ruleModel : ( ( rule__Model__ElementAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:66:2: ( ( ( rule__Model__ElementAssignment )* ) )
            // InternalA2B.g:67:2: ( ( rule__Model__ElementAssignment )* )
            {
            // InternalA2B.g:67:2: ( ( rule__Model__ElementAssignment )* )
            // InternalA2B.g:68:3: ( rule__Model__ElementAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementAssignment()); 
            // InternalA2B.g:69:3: ( rule__Model__ElementAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=21 && LA1_0<=32)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalA2B.g:69:4: rule__Model__ElementAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleInstruction"
    // InternalA2B.g:78:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalA2B.g:79:1: ( ruleInstruction EOF )
            // InternalA2B.g:80:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalA2B.g:87:1: ruleInstruction : ( ( rule__Instruction__Alternatives ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:91:2: ( ( ( rule__Instruction__Alternatives ) ) )
            // InternalA2B.g:92:2: ( ( rule__Instruction__Alternatives ) )
            {
            // InternalA2B.g:92:2: ( ( rule__Instruction__Alternatives ) )
            // InternalA2B.g:93:3: ( rule__Instruction__Alternatives )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives()); 
            // InternalA2B.g:94:3: ( rule__Instruction__Alternatives )
            // InternalA2B.g:94:4: rule__Instruction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleDB"
    // InternalA2B.g:103:1: entryRuleDB : ruleDB EOF ;
    public final void entryRuleDB() throws RecognitionException {
        try {
            // InternalA2B.g:104:1: ( ruleDB EOF )
            // InternalA2B.g:105:1: ruleDB EOF
            {
             before(grammarAccess.getDBRule()); 
            pushFollow(FOLLOW_1);
            ruleDB();

            state._fsp--;

             after(grammarAccess.getDBRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDB"


    // $ANTLR start "ruleDB"
    // InternalA2B.g:112:1: ruleDB : ( ( rule__DB__Group__0 ) ) ;
    public final void ruleDB() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:116:2: ( ( ( rule__DB__Group__0 ) ) )
            // InternalA2B.g:117:2: ( ( rule__DB__Group__0 ) )
            {
            // InternalA2B.g:117:2: ( ( rule__DB__Group__0 ) )
            // InternalA2B.g:118:3: ( rule__DB__Group__0 )
            {
             before(grammarAccess.getDBAccess().getGroup()); 
            // InternalA2B.g:119:3: ( rule__DB__Group__0 )
            // InternalA2B.g:119:4: rule__DB__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DB__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDBAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDB"


    // $ANTLR start "entryRuleDW"
    // InternalA2B.g:128:1: entryRuleDW : ruleDW EOF ;
    public final void entryRuleDW() throws RecognitionException {
        try {
            // InternalA2B.g:129:1: ( ruleDW EOF )
            // InternalA2B.g:130:1: ruleDW EOF
            {
             before(grammarAccess.getDWRule()); 
            pushFollow(FOLLOW_1);
            ruleDW();

            state._fsp--;

             after(grammarAccess.getDWRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDW"


    // $ANTLR start "ruleDW"
    // InternalA2B.g:137:1: ruleDW : ( ( rule__DW__Group__0 ) ) ;
    public final void ruleDW() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:141:2: ( ( ( rule__DW__Group__0 ) ) )
            // InternalA2B.g:142:2: ( ( rule__DW__Group__0 ) )
            {
            // InternalA2B.g:142:2: ( ( rule__DW__Group__0 ) )
            // InternalA2B.g:143:3: ( rule__DW__Group__0 )
            {
             before(grammarAccess.getDWAccess().getGroup()); 
            // InternalA2B.g:144:3: ( rule__DW__Group__0 )
            // InternalA2B.g:144:4: rule__DW__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DW__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDWAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDW"


    // $ANTLR start "entryRuleDD"
    // InternalA2B.g:153:1: entryRuleDD : ruleDD EOF ;
    public final void entryRuleDD() throws RecognitionException {
        try {
            // InternalA2B.g:154:1: ( ruleDD EOF )
            // InternalA2B.g:155:1: ruleDD EOF
            {
             before(grammarAccess.getDDRule()); 
            pushFollow(FOLLOW_1);
            ruleDD();

            state._fsp--;

             after(grammarAccess.getDDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDD"


    // $ANTLR start "ruleDD"
    // InternalA2B.g:162:1: ruleDD : ( ( rule__DD__Group__0 ) ) ;
    public final void ruleDD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:166:2: ( ( ( rule__DD__Group__0 ) ) )
            // InternalA2B.g:167:2: ( ( rule__DD__Group__0 ) )
            {
            // InternalA2B.g:167:2: ( ( rule__DD__Group__0 ) )
            // InternalA2B.g:168:3: ( rule__DD__Group__0 )
            {
             before(grammarAccess.getDDAccess().getGroup()); 
            // InternalA2B.g:169:3: ( rule__DD__Group__0 )
            // InternalA2B.g:169:4: rule__DD__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDD"


    // $ANTLR start "entryRuleBase64"
    // InternalA2B.g:178:1: entryRuleBase64 : ruleBase64 EOF ;
    public final void entryRuleBase64() throws RecognitionException {
        try {
            // InternalA2B.g:179:1: ( ruleBase64 EOF )
            // InternalA2B.g:180:1: ruleBase64 EOF
            {
             before(grammarAccess.getBase64Rule()); 
            pushFollow(FOLLOW_1);
            ruleBase64();

            state._fsp--;

             after(grammarAccess.getBase64Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBase64"


    // $ANTLR start "ruleBase64"
    // InternalA2B.g:187:1: ruleBase64 : ( ( rule__Base64__Group__0 ) ) ;
    public final void ruleBase64() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:191:2: ( ( ( rule__Base64__Group__0 ) ) )
            // InternalA2B.g:192:2: ( ( rule__Base64__Group__0 ) )
            {
            // InternalA2B.g:192:2: ( ( rule__Base64__Group__0 ) )
            // InternalA2B.g:193:3: ( rule__Base64__Group__0 )
            {
             before(grammarAccess.getBase64Access().getGroup()); 
            // InternalA2B.g:194:3: ( rule__Base64__Group__0 )
            // InternalA2B.g:194:4: rule__Base64__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Base64__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBase64Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBase64"


    // $ANTLR start "entryRuleORG"
    // InternalA2B.g:203:1: entryRuleORG : ruleORG EOF ;
    public final void entryRuleORG() throws RecognitionException {
        try {
            // InternalA2B.g:204:1: ( ruleORG EOF )
            // InternalA2B.g:205:1: ruleORG EOF
            {
             before(grammarAccess.getORGRule()); 
            pushFollow(FOLLOW_1);
            ruleORG();

            state._fsp--;

             after(grammarAccess.getORGRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleORG"


    // $ANTLR start "ruleORG"
    // InternalA2B.g:212:1: ruleORG : ( ( rule__ORG__Group__0 ) ) ;
    public final void ruleORG() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:216:2: ( ( ( rule__ORG__Group__0 ) ) )
            // InternalA2B.g:217:2: ( ( rule__ORG__Group__0 ) )
            {
            // InternalA2B.g:217:2: ( ( rule__ORG__Group__0 ) )
            // InternalA2B.g:218:3: ( rule__ORG__Group__0 )
            {
             before(grammarAccess.getORGAccess().getGroup()); 
            // InternalA2B.g:219:3: ( rule__ORG__Group__0 )
            // InternalA2B.g:219:4: rule__ORG__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ORG__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getORGAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleORG"


    // $ANTLR start "entryRuleINCLUDE"
    // InternalA2B.g:228:1: entryRuleINCLUDE : ruleINCLUDE EOF ;
    public final void entryRuleINCLUDE() throws RecognitionException {
        try {
            // InternalA2B.g:229:1: ( ruleINCLUDE EOF )
            // InternalA2B.g:230:1: ruleINCLUDE EOF
            {
             before(grammarAccess.getINCLUDERule()); 
            pushFollow(FOLLOW_1);
            ruleINCLUDE();

            state._fsp--;

             after(grammarAccess.getINCLUDERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleINCLUDE"


    // $ANTLR start "ruleINCLUDE"
    // InternalA2B.g:237:1: ruleINCLUDE : ( ( rule__INCLUDE__Group__0 ) ) ;
    public final void ruleINCLUDE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:241:2: ( ( ( rule__INCLUDE__Group__0 ) ) )
            // InternalA2B.g:242:2: ( ( rule__INCLUDE__Group__0 ) )
            {
            // InternalA2B.g:242:2: ( ( rule__INCLUDE__Group__0 ) )
            // InternalA2B.g:243:3: ( rule__INCLUDE__Group__0 )
            {
             before(grammarAccess.getINCLUDEAccess().getGroup()); 
            // InternalA2B.g:244:3: ( rule__INCLUDE__Group__0 )
            // InternalA2B.g:244:4: rule__INCLUDE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__INCLUDE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getINCLUDEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleINCLUDE"


    // $ANTLR start "entryRuleMAC"
    // InternalA2B.g:253:1: entryRuleMAC : ruleMAC EOF ;
    public final void entryRuleMAC() throws RecognitionException {
        try {
            // InternalA2B.g:254:1: ( ruleMAC EOF )
            // InternalA2B.g:255:1: ruleMAC EOF
            {
             before(grammarAccess.getMACRule()); 
            pushFollow(FOLLOW_1);
            ruleMAC();

            state._fsp--;

             after(grammarAccess.getMACRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMAC"


    // $ANTLR start "ruleMAC"
    // InternalA2B.g:262:1: ruleMAC : ( ( rule__MAC__Group__0 ) ) ;
    public final void ruleMAC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:266:2: ( ( ( rule__MAC__Group__0 ) ) )
            // InternalA2B.g:267:2: ( ( rule__MAC__Group__0 ) )
            {
            // InternalA2B.g:267:2: ( ( rule__MAC__Group__0 ) )
            // InternalA2B.g:268:3: ( rule__MAC__Group__0 )
            {
             before(grammarAccess.getMACAccess().getGroup()); 
            // InternalA2B.g:269:3: ( rule__MAC__Group__0 )
            // InternalA2B.g:269:4: rule__MAC__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MAC__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMACAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMAC"


    // $ANTLR start "entryRuleIP"
    // InternalA2B.g:278:1: entryRuleIP : ruleIP EOF ;
    public final void entryRuleIP() throws RecognitionException {
        try {
            // InternalA2B.g:279:1: ( ruleIP EOF )
            // InternalA2B.g:280:1: ruleIP EOF
            {
             before(grammarAccess.getIPRule()); 
            pushFollow(FOLLOW_1);
            ruleIP();

            state._fsp--;

             after(grammarAccess.getIPRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIP"


    // $ANTLR start "ruleIP"
    // InternalA2B.g:287:1: ruleIP : ( ( rule__IP__Group__0 ) ) ;
    public final void ruleIP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:291:2: ( ( ( rule__IP__Group__0 ) ) )
            // InternalA2B.g:292:2: ( ( rule__IP__Group__0 ) )
            {
            // InternalA2B.g:292:2: ( ( rule__IP__Group__0 ) )
            // InternalA2B.g:293:3: ( rule__IP__Group__0 )
            {
             before(grammarAccess.getIPAccess().getGroup()); 
            // InternalA2B.g:294:3: ( rule__IP__Group__0 )
            // InternalA2B.g:294:4: rule__IP__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IP__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIPAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIP"


    // $ANTLR start "entryRuleHXS"
    // InternalA2B.g:303:1: entryRuleHXS : ruleHXS EOF ;
    public final void entryRuleHXS() throws RecognitionException {
        try {
            // InternalA2B.g:304:1: ( ruleHXS EOF )
            // InternalA2B.g:305:1: ruleHXS EOF
            {
             before(grammarAccess.getHXSRule()); 
            pushFollow(FOLLOW_1);
            ruleHXS();

            state._fsp--;

             after(grammarAccess.getHXSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHXS"


    // $ANTLR start "ruleHXS"
    // InternalA2B.g:312:1: ruleHXS : ( ( rule__HXS__Group__0 ) ) ;
    public final void ruleHXS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:316:2: ( ( ( rule__HXS__Group__0 ) ) )
            // InternalA2B.g:317:2: ( ( rule__HXS__Group__0 ) )
            {
            // InternalA2B.g:317:2: ( ( rule__HXS__Group__0 ) )
            // InternalA2B.g:318:3: ( rule__HXS__Group__0 )
            {
             before(grammarAccess.getHXSAccess().getGroup()); 
            // InternalA2B.g:319:3: ( rule__HXS__Group__0 )
            // InternalA2B.g:319:4: rule__HXS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HXS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHXSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHXS"


    // $ANTLR start "entryRuleBE"
    // InternalA2B.g:328:1: entryRuleBE : ruleBE EOF ;
    public final void entryRuleBE() throws RecognitionException {
        try {
            // InternalA2B.g:329:1: ( ruleBE EOF )
            // InternalA2B.g:330:1: ruleBE EOF
            {
             before(grammarAccess.getBERule()); 
            pushFollow(FOLLOW_1);
            ruleBE();

            state._fsp--;

             after(grammarAccess.getBERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBE"


    // $ANTLR start "ruleBE"
    // InternalA2B.g:337:1: ruleBE : ( 'BE' ) ;
    public final void ruleBE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:341:2: ( ( 'BE' ) )
            // InternalA2B.g:342:2: ( 'BE' )
            {
            // InternalA2B.g:342:2: ( 'BE' )
            // InternalA2B.g:343:3: 'BE'
            {
             before(grammarAccess.getBEAccess().getBEKeyword()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBEAccess().getBEKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBE"


    // $ANTLR start "entryRuleLE"
    // InternalA2B.g:353:1: entryRuleLE : ruleLE EOF ;
    public final void entryRuleLE() throws RecognitionException {
        try {
            // InternalA2B.g:354:1: ( ruleLE EOF )
            // InternalA2B.g:355:1: ruleLE EOF
            {
             before(grammarAccess.getLERule()); 
            pushFollow(FOLLOW_1);
            ruleLE();

            state._fsp--;

             after(grammarAccess.getLERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLE"


    // $ANTLR start "ruleLE"
    // InternalA2B.g:362:1: ruleLE : ( 'LE' ) ;
    public final void ruleLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:366:2: ( ( 'LE' ) )
            // InternalA2B.g:367:2: ( 'LE' )
            {
            // InternalA2B.g:367:2: ( 'LE' )
            // InternalA2B.g:368:3: 'LE'
            {
             before(grammarAccess.getLEAccess().getLEKeyword()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLEAccess().getLEKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLE"


    // $ANTLR start "entryRulePCAP"
    // InternalA2B.g:378:1: entryRulePCAP : rulePCAP EOF ;
    public final void entryRulePCAP() throws RecognitionException {
        try {
            // InternalA2B.g:379:1: ( rulePCAP EOF )
            // InternalA2B.g:380:1: rulePCAP EOF
            {
             before(grammarAccess.getPCAPRule()); 
            pushFollow(FOLLOW_1);
            rulePCAP();

            state._fsp--;

             after(grammarAccess.getPCAPRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePCAP"


    // $ANTLR start "rulePCAP"
    // InternalA2B.g:387:1: rulePCAP : ( 'PCAP' ) ;
    public final void rulePCAP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:391:2: ( ( 'PCAP' ) )
            // InternalA2B.g:392:2: ( 'PCAP' )
            {
            // InternalA2B.g:392:2: ( 'PCAP' )
            // InternalA2B.g:393:3: 'PCAP'
            {
             before(grammarAccess.getPCAPAccess().getPCAPKeyword()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPCAPAccess().getPCAPKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePCAP"


    // $ANTLR start "entryRuleLONG"
    // InternalA2B.g:403:1: entryRuleLONG : ruleLONG EOF ;
    public final void entryRuleLONG() throws RecognitionException {
        try {
            // InternalA2B.g:404:1: ( ruleLONG EOF )
            // InternalA2B.g:405:1: ruleLONG EOF
            {
             before(grammarAccess.getLONGRule()); 
            pushFollow(FOLLOW_1);
            ruleLONG();

            state._fsp--;

             after(grammarAccess.getLONGRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLONG"


    // $ANTLR start "ruleLONG"
    // InternalA2B.g:412:1: ruleLONG : ( RULE_INT ) ;
    public final void ruleLONG() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:416:2: ( ( RULE_INT ) )
            // InternalA2B.g:417:2: ( RULE_INT )
            {
            // InternalA2B.g:417:2: ( RULE_INT )
            // InternalA2B.g:418:3: RULE_INT
            {
             before(grammarAccess.getLONGAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLONGAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLONG"


    // $ANTLR start "rule__Instruction__Alternatives"
    // InternalA2B.g:427:1: rule__Instruction__Alternatives : ( ( ruleDB ) | ( ruleDW ) | ( ruleDD ) | ( ruleBase64 ) | ( ruleORG ) | ( ruleINCLUDE ) | ( ruleMAC ) | ( ruleIP ) | ( ruleHXS ) | ( ( rule__Instruction__Group_9__0 ) ) | ( ( rule__Instruction__Group_10__0 ) ) | ( ( rule__Instruction__Group_11__0 ) ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:431:1: ( ( ruleDB ) | ( ruleDW ) | ( ruleDD ) | ( ruleBase64 ) | ( ruleORG ) | ( ruleINCLUDE ) | ( ruleMAC ) | ( ruleIP ) | ( ruleHXS ) | ( ( rule__Instruction__Group_9__0 ) ) | ( ( rule__Instruction__Group_10__0 ) ) | ( ( rule__Instruction__Group_11__0 ) ) )
            int alt2=12;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 26:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            case 28:
                {
                alt2=5;
                }
                break;
            case 29:
                {
                alt2=6;
                }
                break;
            case 30:
                {
                alt2=7;
                }
                break;
            case 31:
                {
                alt2=8;
                }
                break;
            case 32:
                {
                alt2=9;
                }
                break;
            case 21:
                {
                alt2=10;
                }
                break;
            case 22:
                {
                alt2=11;
                }
                break;
            case 23:
                {
                alt2=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalA2B.g:432:2: ( ruleDB )
                    {
                    // InternalA2B.g:432:2: ( ruleDB )
                    // InternalA2B.g:433:3: ruleDB
                    {
                     before(grammarAccess.getInstructionAccess().getDBParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDB();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getDBParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalA2B.g:438:2: ( ruleDW )
                    {
                    // InternalA2B.g:438:2: ( ruleDW )
                    // InternalA2B.g:439:3: ruleDW
                    {
                     before(grammarAccess.getInstructionAccess().getDWParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDW();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getDWParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalA2B.g:444:2: ( ruleDD )
                    {
                    // InternalA2B.g:444:2: ( ruleDD )
                    // InternalA2B.g:445:3: ruleDD
                    {
                     before(grammarAccess.getInstructionAccess().getDDParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDD();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getDDParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalA2B.g:450:2: ( ruleBase64 )
                    {
                    // InternalA2B.g:450:2: ( ruleBase64 )
                    // InternalA2B.g:451:3: ruleBase64
                    {
                     before(grammarAccess.getInstructionAccess().getBase64ParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBase64();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getBase64ParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalA2B.g:456:2: ( ruleORG )
                    {
                    // InternalA2B.g:456:2: ( ruleORG )
                    // InternalA2B.g:457:3: ruleORG
                    {
                     before(grammarAccess.getInstructionAccess().getORGParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleORG();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getORGParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalA2B.g:462:2: ( ruleINCLUDE )
                    {
                    // InternalA2B.g:462:2: ( ruleINCLUDE )
                    // InternalA2B.g:463:3: ruleINCLUDE
                    {
                     before(grammarAccess.getInstructionAccess().getINCLUDEParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleINCLUDE();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getINCLUDEParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalA2B.g:468:2: ( ruleMAC )
                    {
                    // InternalA2B.g:468:2: ( ruleMAC )
                    // InternalA2B.g:469:3: ruleMAC
                    {
                     before(grammarAccess.getInstructionAccess().getMACParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleMAC();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getMACParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalA2B.g:474:2: ( ruleIP )
                    {
                    // InternalA2B.g:474:2: ( ruleIP )
                    // InternalA2B.g:475:3: ruleIP
                    {
                     before(grammarAccess.getInstructionAccess().getIPParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleIP();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getIPParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalA2B.g:480:2: ( ruleHXS )
                    {
                    // InternalA2B.g:480:2: ( ruleHXS )
                    // InternalA2B.g:481:3: ruleHXS
                    {
                     before(grammarAccess.getInstructionAccess().getHXSParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleHXS();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getHXSParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalA2B.g:486:2: ( ( rule__Instruction__Group_9__0 ) )
                    {
                    // InternalA2B.g:486:2: ( ( rule__Instruction__Group_9__0 ) )
                    // InternalA2B.g:487:3: ( rule__Instruction__Group_9__0 )
                    {
                     before(grammarAccess.getInstructionAccess().getGroup_9()); 
                    // InternalA2B.g:488:3: ( rule__Instruction__Group_9__0 )
                    // InternalA2B.g:488:4: rule__Instruction__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instruction__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionAccess().getGroup_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalA2B.g:492:2: ( ( rule__Instruction__Group_10__0 ) )
                    {
                    // InternalA2B.g:492:2: ( ( rule__Instruction__Group_10__0 ) )
                    // InternalA2B.g:493:3: ( rule__Instruction__Group_10__0 )
                    {
                     before(grammarAccess.getInstructionAccess().getGroup_10()); 
                    // InternalA2B.g:494:3: ( rule__Instruction__Group_10__0 )
                    // InternalA2B.g:494:4: rule__Instruction__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instruction__Group_10__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionAccess().getGroup_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalA2B.g:498:2: ( ( rule__Instruction__Group_11__0 ) )
                    {
                    // InternalA2B.g:498:2: ( ( rule__Instruction__Group_11__0 ) )
                    // InternalA2B.g:499:3: ( rule__Instruction__Group_11__0 )
                    {
                     before(grammarAccess.getInstructionAccess().getGroup_11()); 
                    // InternalA2B.g:500:3: ( rule__Instruction__Group_11__0 )
                    // InternalA2B.g:500:4: rule__Instruction__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instruction__Group_11__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionAccess().getGroup_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Alternatives"


    // $ANTLR start "rule__DB__Alternatives_1"
    // InternalA2B.g:508:1: rule__DB__Alternatives_1 : ( ( ( rule__DB__StringValueAssignment_1_0 ) ) | ( ( rule__DB__IntValueAssignment_1_1 ) ) );
    public final void rule__DB__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:512:1: ( ( ( rule__DB__StringValueAssignment_1_0 ) ) | ( ( rule__DB__IntValueAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_BYTE) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalA2B.g:513:2: ( ( rule__DB__StringValueAssignment_1_0 ) )
                    {
                    // InternalA2B.g:513:2: ( ( rule__DB__StringValueAssignment_1_0 ) )
                    // InternalA2B.g:514:3: ( rule__DB__StringValueAssignment_1_0 )
                    {
                     before(grammarAccess.getDBAccess().getStringValueAssignment_1_0()); 
                    // InternalA2B.g:515:3: ( rule__DB__StringValueAssignment_1_0 )
                    // InternalA2B.g:515:4: rule__DB__StringValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DB__StringValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDBAccess().getStringValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalA2B.g:519:2: ( ( rule__DB__IntValueAssignment_1_1 ) )
                    {
                    // InternalA2B.g:519:2: ( ( rule__DB__IntValueAssignment_1_1 ) )
                    // InternalA2B.g:520:3: ( rule__DB__IntValueAssignment_1_1 )
                    {
                     before(grammarAccess.getDBAccess().getIntValueAssignment_1_1()); 
                    // InternalA2B.g:521:3: ( rule__DB__IntValueAssignment_1_1 )
                    // InternalA2B.g:521:4: rule__DB__IntValueAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DB__IntValueAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDBAccess().getIntValueAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Alternatives_1"


    // $ANTLR start "rule__DW__Alternatives_1"
    // InternalA2B.g:529:1: rule__DW__Alternatives_1 : ( ( ( rule__DW__StringValueAssignment_1_0 ) ) | ( ( rule__DW__IntValueAssignment_1_1 ) ) );
    public final void rule__DW__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:533:1: ( ( ( rule__DW__StringValueAssignment_1_0 ) ) | ( ( rule__DW__IntValueAssignment_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_WORD) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalA2B.g:534:2: ( ( rule__DW__StringValueAssignment_1_0 ) )
                    {
                    // InternalA2B.g:534:2: ( ( rule__DW__StringValueAssignment_1_0 ) )
                    // InternalA2B.g:535:3: ( rule__DW__StringValueAssignment_1_0 )
                    {
                     before(grammarAccess.getDWAccess().getStringValueAssignment_1_0()); 
                    // InternalA2B.g:536:3: ( rule__DW__StringValueAssignment_1_0 )
                    // InternalA2B.g:536:4: rule__DW__StringValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DW__StringValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDWAccess().getStringValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalA2B.g:540:2: ( ( rule__DW__IntValueAssignment_1_1 ) )
                    {
                    // InternalA2B.g:540:2: ( ( rule__DW__IntValueAssignment_1_1 ) )
                    // InternalA2B.g:541:3: ( rule__DW__IntValueAssignment_1_1 )
                    {
                     before(grammarAccess.getDWAccess().getIntValueAssignment_1_1()); 
                    // InternalA2B.g:542:3: ( rule__DW__IntValueAssignment_1_1 )
                    // InternalA2B.g:542:4: rule__DW__IntValueAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DW__IntValueAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDWAccess().getIntValueAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DW__Alternatives_1"


    // $ANTLR start "rule__DD__Alternatives_1"
    // InternalA2B.g:550:1: rule__DD__Alternatives_1 : ( ( ( rule__DD__StringValueAssignment_1_0 ) ) | ( ( rule__DD__LongValueAssignment_1_1 ) ) );
    public final void rule__DD__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:554:1: ( ( ( rule__DD__StringValueAssignment_1_0 ) ) | ( ( rule__DD__LongValueAssignment_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_DOUBLEWORD) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalA2B.g:555:2: ( ( rule__DD__StringValueAssignment_1_0 ) )
                    {
                    // InternalA2B.g:555:2: ( ( rule__DD__StringValueAssignment_1_0 ) )
                    // InternalA2B.g:556:3: ( rule__DD__StringValueAssignment_1_0 )
                    {
                     before(grammarAccess.getDDAccess().getStringValueAssignment_1_0()); 
                    // InternalA2B.g:557:3: ( rule__DD__StringValueAssignment_1_0 )
                    // InternalA2B.g:557:4: rule__DD__StringValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DD__StringValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDDAccess().getStringValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalA2B.g:561:2: ( ( rule__DD__LongValueAssignment_1_1 ) )
                    {
                    // InternalA2B.g:561:2: ( ( rule__DD__LongValueAssignment_1_1 ) )
                    // InternalA2B.g:562:3: ( rule__DD__LongValueAssignment_1_1 )
                    {
                     before(grammarAccess.getDDAccess().getLongValueAssignment_1_1()); 
                    // InternalA2B.g:563:3: ( rule__DD__LongValueAssignment_1_1 )
                    // InternalA2B.g:563:4: rule__DD__LongValueAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DD__LongValueAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDDAccess().getLongValueAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DD__Alternatives_1"


    // $ANTLR start "rule__Instruction__Group_9__0"
    // InternalA2B.g:571:1: rule__Instruction__Group_9__0 : rule__Instruction__Group_9__0__Impl rule__Instruction__Group_9__1 ;
    public final void rule__Instruction__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:575:1: ( rule__Instruction__Group_9__0__Impl rule__Instruction__Group_9__1 )
            // InternalA2B.g:576:2: rule__Instruction__Group_9__0__Impl rule__Instruction__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__Instruction__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruction__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_9__0"


    // $ANTLR start "rule__Instruction__Group_9__0__Impl"
    // InternalA2B.g:583:1: rule__Instruction__Group_9__0__Impl : ( () ) ;
    public final void rule__Instruction__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:587:1: ( ( () ) )
            // InternalA2B.g:588:1: ( () )
            {
            // InternalA2B.g:588:1: ( () )
            // InternalA2B.g:589:2: ()
            {
             before(grammarAccess.getInstructionAccess().getBEAction_9_0()); 
            // InternalA2B.g:590:2: ()
            // InternalA2B.g:590:3: 
            {
            }

             after(grammarAccess.getInstructionAccess().getBEAction_9_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_9__0__Impl"


    // $ANTLR start "rule__Instruction__Group_9__1"
    // InternalA2B.g:598:1: rule__Instruction__Group_9__1 : rule__Instruction__Group_9__1__Impl ;
    public final void rule__Instruction__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:602:1: ( rule__Instruction__Group_9__1__Impl )
            // InternalA2B.g:603:2: rule__Instruction__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_9__1"


    // $ANTLR start "rule__Instruction__Group_9__1__Impl"
    // InternalA2B.g:609:1: rule__Instruction__Group_9__1__Impl : ( ruleBE ) ;
    public final void rule__Instruction__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:613:1: ( ( ruleBE ) )
            // InternalA2B.g:614:1: ( ruleBE )
            {
            // InternalA2B.g:614:1: ( ruleBE )
            // InternalA2B.g:615:2: ruleBE
            {
             before(grammarAccess.getInstructionAccess().getBEParserRuleCall_9_1()); 
            pushFollow(FOLLOW_2);
            ruleBE();

            state._fsp--;

             after(grammarAccess.getInstructionAccess().getBEParserRuleCall_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_9__1__Impl"


    // $ANTLR start "rule__Instruction__Group_10__0"
    // InternalA2B.g:625:1: rule__Instruction__Group_10__0 : rule__Instruction__Group_10__0__Impl rule__Instruction__Group_10__1 ;
    public final void rule__Instruction__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:629:1: ( rule__Instruction__Group_10__0__Impl rule__Instruction__Group_10__1 )
            // InternalA2B.g:630:2: rule__Instruction__Group_10__0__Impl rule__Instruction__Group_10__1
            {
            pushFollow(FOLLOW_5);
            rule__Instruction__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruction__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_10__0"


    // $ANTLR start "rule__Instruction__Group_10__0__Impl"
    // InternalA2B.g:637:1: rule__Instruction__Group_10__0__Impl : ( () ) ;
    public final void rule__Instruction__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:641:1: ( ( () ) )
            // InternalA2B.g:642:1: ( () )
            {
            // InternalA2B.g:642:1: ( () )
            // InternalA2B.g:643:2: ()
            {
             before(grammarAccess.getInstructionAccess().getLEAction_10_0()); 
            // InternalA2B.g:644:2: ()
            // InternalA2B.g:644:3: 
            {
            }

             after(grammarAccess.getInstructionAccess().getLEAction_10_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_10__0__Impl"


    // $ANTLR start "rule__Instruction__Group_10__1"
    // InternalA2B.g:652:1: rule__Instruction__Group_10__1 : rule__Instruction__Group_10__1__Impl ;
    public final void rule__Instruction__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:656:1: ( rule__Instruction__Group_10__1__Impl )
            // InternalA2B.g:657:2: rule__Instruction__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_10__1"


    // $ANTLR start "rule__Instruction__Group_10__1__Impl"
    // InternalA2B.g:663:1: rule__Instruction__Group_10__1__Impl : ( ruleLE ) ;
    public final void rule__Instruction__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:667:1: ( ( ruleLE ) )
            // InternalA2B.g:668:1: ( ruleLE )
            {
            // InternalA2B.g:668:1: ( ruleLE )
            // InternalA2B.g:669:2: ruleLE
            {
             before(grammarAccess.getInstructionAccess().getLEParserRuleCall_10_1()); 
            pushFollow(FOLLOW_2);
            ruleLE();

            state._fsp--;

             after(grammarAccess.getInstructionAccess().getLEParserRuleCall_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_10__1__Impl"


    // $ANTLR start "rule__Instruction__Group_11__0"
    // InternalA2B.g:679:1: rule__Instruction__Group_11__0 : rule__Instruction__Group_11__0__Impl rule__Instruction__Group_11__1 ;
    public final void rule__Instruction__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:683:1: ( rule__Instruction__Group_11__0__Impl rule__Instruction__Group_11__1 )
            // InternalA2B.g:684:2: rule__Instruction__Group_11__0__Impl rule__Instruction__Group_11__1
            {
            pushFollow(FOLLOW_6);
            rule__Instruction__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruction__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_11__0"


    // $ANTLR start "rule__Instruction__Group_11__0__Impl"
    // InternalA2B.g:691:1: rule__Instruction__Group_11__0__Impl : ( () ) ;
    public final void rule__Instruction__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:695:1: ( ( () ) )
            // InternalA2B.g:696:1: ( () )
            {
            // InternalA2B.g:696:1: ( () )
            // InternalA2B.g:697:2: ()
            {
             before(grammarAccess.getInstructionAccess().getPCAPAction_11_0()); 
            // InternalA2B.g:698:2: ()
            // InternalA2B.g:698:3: 
            {
            }

             after(grammarAccess.getInstructionAccess().getPCAPAction_11_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_11__0__Impl"


    // $ANTLR start "rule__Instruction__Group_11__1"
    // InternalA2B.g:706:1: rule__Instruction__Group_11__1 : rule__Instruction__Group_11__1__Impl ;
    public final void rule__Instruction__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:710:1: ( rule__Instruction__Group_11__1__Impl )
            // InternalA2B.g:711:2: rule__Instruction__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_11__1"


    // $ANTLR start "rule__Instruction__Group_11__1__Impl"
    // InternalA2B.g:717:1: rule__Instruction__Group_11__1__Impl : ( rulePCAP ) ;
    public final void rule__Instruction__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:721:1: ( ( rulePCAP ) )
            // InternalA2B.g:722:1: ( rulePCAP )
            {
            // InternalA2B.g:722:1: ( rulePCAP )
            // InternalA2B.g:723:2: rulePCAP
            {
             before(grammarAccess.getInstructionAccess().getPCAPParserRuleCall_11_1()); 
            pushFollow(FOLLOW_2);
            rulePCAP();

            state._fsp--;

             after(grammarAccess.getInstructionAccess().getPCAPParserRuleCall_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_11__1__Impl"


    // $ANTLR start "rule__DB__Group__0"
    // InternalA2B.g:733:1: rule__DB__Group__0 : rule__DB__Group__0__Impl rule__DB__Group__1 ;
    public final void rule__DB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:737:1: ( rule__DB__Group__0__Impl rule__DB__Group__1 )
            // InternalA2B.g:738:2: rule__DB__Group__0__Impl rule__DB__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__DB__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DB__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group__0"


    // $ANTLR start "rule__DB__Group__0__Impl"
    // InternalA2B.g:745:1: rule__DB__Group__0__Impl : ( 'DB' ) ;
    public final void rule__DB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:749:1: ( ( 'DB' ) )
            // InternalA2B.g:750:1: ( 'DB' )
            {
            // InternalA2B.g:750:1: ( 'DB' )
            // InternalA2B.g:751:2: 'DB'
            {
             before(grammarAccess.getDBAccess().getDBKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDBAccess().getDBKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group__0__Impl"


    // $ANTLR start "rule__DB__Group__1"
    // InternalA2B.g:760:1: rule__DB__Group__1 : rule__DB__Group__1__Impl ;
    public final void rule__DB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:764:1: ( rule__DB__Group__1__Impl )
            // InternalA2B.g:765:2: rule__DB__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DB__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group__1"


    // $ANTLR start "rule__DB__Group__1__Impl"
    // InternalA2B.g:771:1: rule__DB__Group__1__Impl : ( ( rule__DB__Alternatives_1 ) ) ;
    public final void rule__DB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:775:1: ( ( ( rule__DB__Alternatives_1 ) ) )
            // InternalA2B.g:776:1: ( ( rule__DB__Alternatives_1 ) )
            {
            // InternalA2B.g:776:1: ( ( rule__DB__Alternatives_1 ) )
            // InternalA2B.g:777:2: ( rule__DB__Alternatives_1 )
            {
             before(grammarAccess.getDBAccess().getAlternatives_1()); 
            // InternalA2B.g:778:2: ( rule__DB__Alternatives_1 )
            // InternalA2B.g:778:3: rule__DB__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DB__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDBAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__Group__1__Impl"


    // $ANTLR start "rule__DW__Group__0"
    // InternalA2B.g:787:1: rule__DW__Group__0 : rule__DW__Group__0__Impl rule__DW__Group__1 ;
    public final void rule__DW__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:791:1: ( rule__DW__Group__0__Impl rule__DW__Group__1 )
            // InternalA2B.g:792:2: rule__DW__Group__0__Impl rule__DW__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__DW__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DW__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DW__Group__0"


    // $ANTLR start "rule__DW__Group__0__Impl"
    // InternalA2B.g:799:1: rule__DW__Group__0__Impl : ( 'DW' ) ;
    public final void rule__DW__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:803:1: ( ( 'DW' ) )
            // InternalA2B.g:804:1: ( 'DW' )
            {
            // InternalA2B.g:804:1: ( 'DW' )
            // InternalA2B.g:805:2: 'DW'
            {
             before(grammarAccess.getDWAccess().getDWKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDWAccess().getDWKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DW__Group__0__Impl"


    // $ANTLR start "rule__DW__Group__1"
    // InternalA2B.g:814:1: rule__DW__Group__1 : rule__DW__Group__1__Impl ;
    public final void rule__DW__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:818:1: ( rule__DW__Group__1__Impl )
            // InternalA2B.g:819:2: rule__DW__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DW__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DW__Group__1"


    // $ANTLR start "rule__DW__Group__1__Impl"
    // InternalA2B.g:825:1: rule__DW__Group__1__Impl : ( ( rule__DW__Alternatives_1 ) ) ;
    public final void rule__DW__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:829:1: ( ( ( rule__DW__Alternatives_1 ) ) )
            // InternalA2B.g:830:1: ( ( rule__DW__Alternatives_1 ) )
            {
            // InternalA2B.g:830:1: ( ( rule__DW__Alternatives_1 ) )
            // InternalA2B.g:831:2: ( rule__DW__Alternatives_1 )
            {
             before(grammarAccess.getDWAccess().getAlternatives_1()); 
            // InternalA2B.g:832:2: ( rule__DW__Alternatives_1 )
            // InternalA2B.g:832:3: rule__DW__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DW__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDWAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DW__Group__1__Impl"


    // $ANTLR start "rule__DD__Group__0"
    // InternalA2B.g:841:1: rule__DD__Group__0 : rule__DD__Group__0__Impl rule__DD__Group__1 ;
    public final void rule__DD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:845:1: ( rule__DD__Group__0__Impl rule__DD__Group__1 )
            // InternalA2B.g:846:2: rule__DD__Group__0__Impl rule__DD__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__DD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DD__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DD__Group__0"


    // $ANTLR start "rule__DD__Group__0__Impl"
    // InternalA2B.g:853:1: rule__DD__Group__0__Impl : ( 'DD' ) ;
    public final void rule__DD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:857:1: ( ( 'DD' ) )
            // InternalA2B.g:858:1: ( 'DD' )
            {
            // InternalA2B.g:858:1: ( 'DD' )
            // InternalA2B.g:859:2: 'DD'
            {
             before(grammarAccess.getDDAccess().getDDKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDDAccess().getDDKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DD__Group__0__Impl"


    // $ANTLR start "rule__DD__Group__1"
    // InternalA2B.g:868:1: rule__DD__Group__1 : rule__DD__Group__1__Impl ;
    public final void rule__DD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:872:1: ( rule__DD__Group__1__Impl )
            // InternalA2B.g:873:2: rule__DD__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DD__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DD__Group__1"


    // $ANTLR start "rule__DD__Group__1__Impl"
    // InternalA2B.g:879:1: rule__DD__Group__1__Impl : ( ( rule__DD__Alternatives_1 ) ) ;
    public final void rule__DD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:883:1: ( ( ( rule__DD__Alternatives_1 ) ) )
            // InternalA2B.g:884:1: ( ( rule__DD__Alternatives_1 ) )
            {
            // InternalA2B.g:884:1: ( ( rule__DD__Alternatives_1 ) )
            // InternalA2B.g:885:2: ( rule__DD__Alternatives_1 )
            {
             before(grammarAccess.getDDAccess().getAlternatives_1()); 
            // InternalA2B.g:886:2: ( rule__DD__Alternatives_1 )
            // InternalA2B.g:886:3: rule__DD__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DD__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDDAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DD__Group__1__Impl"


    // $ANTLR start "rule__Base64__Group__0"
    // InternalA2B.g:895:1: rule__Base64__Group__0 : rule__Base64__Group__0__Impl rule__Base64__Group__1 ;
    public final void rule__Base64__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:899:1: ( rule__Base64__Group__0__Impl rule__Base64__Group__1 )
            // InternalA2B.g:900:2: rule__Base64__Group__0__Impl rule__Base64__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Base64__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Base64__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Base64__Group__0"


    // $ANTLR start "rule__Base64__Group__0__Impl"
    // InternalA2B.g:907:1: rule__Base64__Group__0__Impl : ( 'B64' ) ;
    public final void rule__Base64__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:911:1: ( ( 'B64' ) )
            // InternalA2B.g:912:1: ( 'B64' )
            {
            // InternalA2B.g:912:1: ( 'B64' )
            // InternalA2B.g:913:2: 'B64'
            {
             before(grammarAccess.getBase64Access().getB64Keyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBase64Access().getB64Keyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Base64__Group__0__Impl"


    // $ANTLR start "rule__Base64__Group__1"
    // InternalA2B.g:922:1: rule__Base64__Group__1 : rule__Base64__Group__1__Impl ;
    public final void rule__Base64__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:926:1: ( rule__Base64__Group__1__Impl )
            // InternalA2B.g:927:2: rule__Base64__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Base64__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Base64__Group__1"


    // $ANTLR start "rule__Base64__Group__1__Impl"
    // InternalA2B.g:933:1: rule__Base64__Group__1__Impl : ( ( rule__Base64__ValueAssignment_1 ) ) ;
    public final void rule__Base64__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:937:1: ( ( ( rule__Base64__ValueAssignment_1 ) ) )
            // InternalA2B.g:938:1: ( ( rule__Base64__ValueAssignment_1 ) )
            {
            // InternalA2B.g:938:1: ( ( rule__Base64__ValueAssignment_1 ) )
            // InternalA2B.g:939:2: ( rule__Base64__ValueAssignment_1 )
            {
             before(grammarAccess.getBase64Access().getValueAssignment_1()); 
            // InternalA2B.g:940:2: ( rule__Base64__ValueAssignment_1 )
            // InternalA2B.g:940:3: rule__Base64__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Base64__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBase64Access().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Base64__Group__1__Impl"


    // $ANTLR start "rule__ORG__Group__0"
    // InternalA2B.g:949:1: rule__ORG__Group__0 : rule__ORG__Group__0__Impl rule__ORG__Group__1 ;
    public final void rule__ORG__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:953:1: ( rule__ORG__Group__0__Impl rule__ORG__Group__1 )
            // InternalA2B.g:954:2: rule__ORG__Group__0__Impl rule__ORG__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ORG__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ORG__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORG__Group__0"


    // $ANTLR start "rule__ORG__Group__0__Impl"
    // InternalA2B.g:961:1: rule__ORG__Group__0__Impl : ( 'ORG' ) ;
    public final void rule__ORG__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:965:1: ( ( 'ORG' ) )
            // InternalA2B.g:966:1: ( 'ORG' )
            {
            // InternalA2B.g:966:1: ( 'ORG' )
            // InternalA2B.g:967:2: 'ORG'
            {
             before(grammarAccess.getORGAccess().getORGKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getORGAccess().getORGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORG__Group__0__Impl"


    // $ANTLR start "rule__ORG__Group__1"
    // InternalA2B.g:976:1: rule__ORG__Group__1 : rule__ORG__Group__1__Impl ;
    public final void rule__ORG__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:980:1: ( rule__ORG__Group__1__Impl )
            // InternalA2B.g:981:2: rule__ORG__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ORG__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORG__Group__1"


    // $ANTLR start "rule__ORG__Group__1__Impl"
    // InternalA2B.g:987:1: rule__ORG__Group__1__Impl : ( ( rule__ORG__ValueAssignment_1 ) ) ;
    public final void rule__ORG__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:991:1: ( ( ( rule__ORG__ValueAssignment_1 ) ) )
            // InternalA2B.g:992:1: ( ( rule__ORG__ValueAssignment_1 ) )
            {
            // InternalA2B.g:992:1: ( ( rule__ORG__ValueAssignment_1 ) )
            // InternalA2B.g:993:2: ( rule__ORG__ValueAssignment_1 )
            {
             before(grammarAccess.getORGAccess().getValueAssignment_1()); 
            // InternalA2B.g:994:2: ( rule__ORG__ValueAssignment_1 )
            // InternalA2B.g:994:3: rule__ORG__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ORG__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getORGAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORG__Group__1__Impl"


    // $ANTLR start "rule__INCLUDE__Group__0"
    // InternalA2B.g:1003:1: rule__INCLUDE__Group__0 : rule__INCLUDE__Group__0__Impl rule__INCLUDE__Group__1 ;
    public final void rule__INCLUDE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1007:1: ( rule__INCLUDE__Group__0__Impl rule__INCLUDE__Group__1 )
            // InternalA2B.g:1008:2: rule__INCLUDE__Group__0__Impl rule__INCLUDE__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__INCLUDE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__INCLUDE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INCLUDE__Group__0"


    // $ANTLR start "rule__INCLUDE__Group__0__Impl"
    // InternalA2B.g:1015:1: rule__INCLUDE__Group__0__Impl : ( 'INCLUDE' ) ;
    public final void rule__INCLUDE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1019:1: ( ( 'INCLUDE' ) )
            // InternalA2B.g:1020:1: ( 'INCLUDE' )
            {
            // InternalA2B.g:1020:1: ( 'INCLUDE' )
            // InternalA2B.g:1021:2: 'INCLUDE'
            {
             before(grammarAccess.getINCLUDEAccess().getINCLUDEKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getINCLUDEAccess().getINCLUDEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INCLUDE__Group__0__Impl"


    // $ANTLR start "rule__INCLUDE__Group__1"
    // InternalA2B.g:1030:1: rule__INCLUDE__Group__1 : rule__INCLUDE__Group__1__Impl ;
    public final void rule__INCLUDE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1034:1: ( rule__INCLUDE__Group__1__Impl )
            // InternalA2B.g:1035:2: rule__INCLUDE__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__INCLUDE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INCLUDE__Group__1"


    // $ANTLR start "rule__INCLUDE__Group__1__Impl"
    // InternalA2B.g:1041:1: rule__INCLUDE__Group__1__Impl : ( ( rule__INCLUDE__ValueAssignment_1 ) ) ;
    public final void rule__INCLUDE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1045:1: ( ( ( rule__INCLUDE__ValueAssignment_1 ) ) )
            // InternalA2B.g:1046:1: ( ( rule__INCLUDE__ValueAssignment_1 ) )
            {
            // InternalA2B.g:1046:1: ( ( rule__INCLUDE__ValueAssignment_1 ) )
            // InternalA2B.g:1047:2: ( rule__INCLUDE__ValueAssignment_1 )
            {
             before(grammarAccess.getINCLUDEAccess().getValueAssignment_1()); 
            // InternalA2B.g:1048:2: ( rule__INCLUDE__ValueAssignment_1 )
            // InternalA2B.g:1048:3: rule__INCLUDE__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__INCLUDE__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getINCLUDEAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INCLUDE__Group__1__Impl"


    // $ANTLR start "rule__MAC__Group__0"
    // InternalA2B.g:1057:1: rule__MAC__Group__0 : rule__MAC__Group__0__Impl rule__MAC__Group__1 ;
    public final void rule__MAC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1061:1: ( rule__MAC__Group__0__Impl rule__MAC__Group__1 )
            // InternalA2B.g:1062:2: rule__MAC__Group__0__Impl rule__MAC__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__MAC__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MAC__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MAC__Group__0"


    // $ANTLR start "rule__MAC__Group__0__Impl"
    // InternalA2B.g:1069:1: rule__MAC__Group__0__Impl : ( 'MAC' ) ;
    public final void rule__MAC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1073:1: ( ( 'MAC' ) )
            // InternalA2B.g:1074:1: ( 'MAC' )
            {
            // InternalA2B.g:1074:1: ( 'MAC' )
            // InternalA2B.g:1075:2: 'MAC'
            {
             before(grammarAccess.getMACAccess().getMACKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMACAccess().getMACKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MAC__Group__0__Impl"


    // $ANTLR start "rule__MAC__Group__1"
    // InternalA2B.g:1084:1: rule__MAC__Group__1 : rule__MAC__Group__1__Impl ;
    public final void rule__MAC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1088:1: ( rule__MAC__Group__1__Impl )
            // InternalA2B.g:1089:2: rule__MAC__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MAC__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MAC__Group__1"


    // $ANTLR start "rule__MAC__Group__1__Impl"
    // InternalA2B.g:1095:1: rule__MAC__Group__1__Impl : ( ( rule__MAC__ValueAssignment_1 ) ) ;
    public final void rule__MAC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1099:1: ( ( ( rule__MAC__ValueAssignment_1 ) ) )
            // InternalA2B.g:1100:1: ( ( rule__MAC__ValueAssignment_1 ) )
            {
            // InternalA2B.g:1100:1: ( ( rule__MAC__ValueAssignment_1 ) )
            // InternalA2B.g:1101:2: ( rule__MAC__ValueAssignment_1 )
            {
             before(grammarAccess.getMACAccess().getValueAssignment_1()); 
            // InternalA2B.g:1102:2: ( rule__MAC__ValueAssignment_1 )
            // InternalA2B.g:1102:3: rule__MAC__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MAC__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMACAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MAC__Group__1__Impl"


    // $ANTLR start "rule__IP__Group__0"
    // InternalA2B.g:1111:1: rule__IP__Group__0 : rule__IP__Group__0__Impl rule__IP__Group__1 ;
    public final void rule__IP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1115:1: ( rule__IP__Group__0__Impl rule__IP__Group__1 )
            // InternalA2B.g:1116:2: rule__IP__Group__0__Impl rule__IP__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__IP__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IP__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__0"


    // $ANTLR start "rule__IP__Group__0__Impl"
    // InternalA2B.g:1123:1: rule__IP__Group__0__Impl : ( 'IP' ) ;
    public final void rule__IP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1127:1: ( ( 'IP' ) )
            // InternalA2B.g:1128:1: ( 'IP' )
            {
            // InternalA2B.g:1128:1: ( 'IP' )
            // InternalA2B.g:1129:2: 'IP'
            {
             before(grammarAccess.getIPAccess().getIPKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getIPAccess().getIPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__0__Impl"


    // $ANTLR start "rule__IP__Group__1"
    // InternalA2B.g:1138:1: rule__IP__Group__1 : rule__IP__Group__1__Impl ;
    public final void rule__IP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1142:1: ( rule__IP__Group__1__Impl )
            // InternalA2B.g:1143:2: rule__IP__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IP__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__1"


    // $ANTLR start "rule__IP__Group__1__Impl"
    // InternalA2B.g:1149:1: rule__IP__Group__1__Impl : ( ( rule__IP__ValueAssignment_1 ) ) ;
    public final void rule__IP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1153:1: ( ( ( rule__IP__ValueAssignment_1 ) ) )
            // InternalA2B.g:1154:1: ( ( rule__IP__ValueAssignment_1 ) )
            {
            // InternalA2B.g:1154:1: ( ( rule__IP__ValueAssignment_1 ) )
            // InternalA2B.g:1155:2: ( rule__IP__ValueAssignment_1 )
            {
             before(grammarAccess.getIPAccess().getValueAssignment_1()); 
            // InternalA2B.g:1156:2: ( rule__IP__ValueAssignment_1 )
            // InternalA2B.g:1156:3: rule__IP__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IP__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIPAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__Group__1__Impl"


    // $ANTLR start "rule__HXS__Group__0"
    // InternalA2B.g:1165:1: rule__HXS__Group__0 : rule__HXS__Group__0__Impl rule__HXS__Group__1 ;
    public final void rule__HXS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1169:1: ( rule__HXS__Group__0__Impl rule__HXS__Group__1 )
            // InternalA2B.g:1170:2: rule__HXS__Group__0__Impl rule__HXS__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__HXS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HXS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HXS__Group__0"


    // $ANTLR start "rule__HXS__Group__0__Impl"
    // InternalA2B.g:1177:1: rule__HXS__Group__0__Impl : ( 'HXS' ) ;
    public final void rule__HXS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1181:1: ( ( 'HXS' ) )
            // InternalA2B.g:1182:1: ( 'HXS' )
            {
            // InternalA2B.g:1182:1: ( 'HXS' )
            // InternalA2B.g:1183:2: 'HXS'
            {
             before(grammarAccess.getHXSAccess().getHXSKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getHXSAccess().getHXSKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HXS__Group__0__Impl"


    // $ANTLR start "rule__HXS__Group__1"
    // InternalA2B.g:1192:1: rule__HXS__Group__1 : rule__HXS__Group__1__Impl ;
    public final void rule__HXS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1196:1: ( rule__HXS__Group__1__Impl )
            // InternalA2B.g:1197:2: rule__HXS__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HXS__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HXS__Group__1"


    // $ANTLR start "rule__HXS__Group__1__Impl"
    // InternalA2B.g:1203:1: rule__HXS__Group__1__Impl : ( ( rule__HXS__ValueAssignment_1 ) ) ;
    public final void rule__HXS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1207:1: ( ( ( rule__HXS__ValueAssignment_1 ) ) )
            // InternalA2B.g:1208:1: ( ( rule__HXS__ValueAssignment_1 ) )
            {
            // InternalA2B.g:1208:1: ( ( rule__HXS__ValueAssignment_1 ) )
            // InternalA2B.g:1209:2: ( rule__HXS__ValueAssignment_1 )
            {
             before(grammarAccess.getHXSAccess().getValueAssignment_1()); 
            // InternalA2B.g:1210:2: ( rule__HXS__ValueAssignment_1 )
            // InternalA2B.g:1210:3: rule__HXS__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HXS__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHXSAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HXS__Group__1__Impl"


    // $ANTLR start "rule__Model__ElementAssignment"
    // InternalA2B.g:1219:1: rule__Model__ElementAssignment : ( ruleInstruction ) ;
    public final void rule__Model__ElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1223:1: ( ( ruleInstruction ) )
            // InternalA2B.g:1224:2: ( ruleInstruction )
            {
            // InternalA2B.g:1224:2: ( ruleInstruction )
            // InternalA2B.g:1225:3: ruleInstruction
            {
             before(grammarAccess.getModelAccess().getElementInstructionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementInstructionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementAssignment"


    // $ANTLR start "rule__DB__StringValueAssignment_1_0"
    // InternalA2B.g:1234:1: rule__DB__StringValueAssignment_1_0 : ( RULE_BYTE ) ;
    public final void rule__DB__StringValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1238:1: ( ( RULE_BYTE ) )
            // InternalA2B.g:1239:2: ( RULE_BYTE )
            {
            // InternalA2B.g:1239:2: ( RULE_BYTE )
            // InternalA2B.g:1240:3: RULE_BYTE
            {
             before(grammarAccess.getDBAccess().getStringValueBYTETerminalRuleCall_1_0_0()); 
            match(input,RULE_BYTE,FOLLOW_2); 
             after(grammarAccess.getDBAccess().getStringValueBYTETerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__StringValueAssignment_1_0"


    // $ANTLR start "rule__DB__IntValueAssignment_1_1"
    // InternalA2B.g:1249:1: rule__DB__IntValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__DB__IntValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1253:1: ( ( RULE_INT ) )
            // InternalA2B.g:1254:2: ( RULE_INT )
            {
            // InternalA2B.g:1254:2: ( RULE_INT )
            // InternalA2B.g:1255:3: RULE_INT
            {
             before(grammarAccess.getDBAccess().getIntValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDBAccess().getIntValueINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DB__IntValueAssignment_1_1"


    // $ANTLR start "rule__DW__StringValueAssignment_1_0"
    // InternalA2B.g:1264:1: rule__DW__StringValueAssignment_1_0 : ( RULE_WORD ) ;
    public final void rule__DW__StringValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1268:1: ( ( RULE_WORD ) )
            // InternalA2B.g:1269:2: ( RULE_WORD )
            {
            // InternalA2B.g:1269:2: ( RULE_WORD )
            // InternalA2B.g:1270:3: RULE_WORD
            {
             before(grammarAccess.getDWAccess().getStringValueWORDTerminalRuleCall_1_0_0()); 
            match(input,RULE_WORD,FOLLOW_2); 
             after(grammarAccess.getDWAccess().getStringValueWORDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DW__StringValueAssignment_1_0"


    // $ANTLR start "rule__DW__IntValueAssignment_1_1"
    // InternalA2B.g:1279:1: rule__DW__IntValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__DW__IntValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1283:1: ( ( RULE_INT ) )
            // InternalA2B.g:1284:2: ( RULE_INT )
            {
            // InternalA2B.g:1284:2: ( RULE_INT )
            // InternalA2B.g:1285:3: RULE_INT
            {
             before(grammarAccess.getDWAccess().getIntValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDWAccess().getIntValueINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DW__IntValueAssignment_1_1"


    // $ANTLR start "rule__DD__StringValueAssignment_1_0"
    // InternalA2B.g:1294:1: rule__DD__StringValueAssignment_1_0 : ( RULE_DOUBLEWORD ) ;
    public final void rule__DD__StringValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1298:1: ( ( RULE_DOUBLEWORD ) )
            // InternalA2B.g:1299:2: ( RULE_DOUBLEWORD )
            {
            // InternalA2B.g:1299:2: ( RULE_DOUBLEWORD )
            // InternalA2B.g:1300:3: RULE_DOUBLEWORD
            {
             before(grammarAccess.getDDAccess().getStringValueDOUBLEWORDTerminalRuleCall_1_0_0()); 
            match(input,RULE_DOUBLEWORD,FOLLOW_2); 
             after(grammarAccess.getDDAccess().getStringValueDOUBLEWORDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DD__StringValueAssignment_1_0"


    // $ANTLR start "rule__DD__LongValueAssignment_1_1"
    // InternalA2B.g:1309:1: rule__DD__LongValueAssignment_1_1 : ( ruleLONG ) ;
    public final void rule__DD__LongValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1313:1: ( ( ruleLONG ) )
            // InternalA2B.g:1314:2: ( ruleLONG )
            {
            // InternalA2B.g:1314:2: ( ruleLONG )
            // InternalA2B.g:1315:3: ruleLONG
            {
             before(grammarAccess.getDDAccess().getLongValueLONGParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLONG();

            state._fsp--;

             after(grammarAccess.getDDAccess().getLongValueLONGParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DD__LongValueAssignment_1_1"


    // $ANTLR start "rule__Base64__ValueAssignment_1"
    // InternalA2B.g:1324:1: rule__Base64__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Base64__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1328:1: ( ( RULE_STRING ) )
            // InternalA2B.g:1329:2: ( RULE_STRING )
            {
            // InternalA2B.g:1329:2: ( RULE_STRING )
            // InternalA2B.g:1330:3: RULE_STRING
            {
             before(grammarAccess.getBase64Access().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBase64Access().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Base64__ValueAssignment_1"


    // $ANTLR start "rule__ORG__ValueAssignment_1"
    // InternalA2B.g:1339:1: rule__ORG__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__ORG__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1343:1: ( ( RULE_INT ) )
            // InternalA2B.g:1344:2: ( RULE_INT )
            {
            // InternalA2B.g:1344:2: ( RULE_INT )
            // InternalA2B.g:1345:3: RULE_INT
            {
             before(grammarAccess.getORGAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getORGAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ORG__ValueAssignment_1"


    // $ANTLR start "rule__INCLUDE__ValueAssignment_1"
    // InternalA2B.g:1354:1: rule__INCLUDE__ValueAssignment_1 : ( RULE_PATH ) ;
    public final void rule__INCLUDE__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1358:1: ( ( RULE_PATH ) )
            // InternalA2B.g:1359:2: ( RULE_PATH )
            {
            // InternalA2B.g:1359:2: ( RULE_PATH )
            // InternalA2B.g:1360:3: RULE_PATH
            {
             before(grammarAccess.getINCLUDEAccess().getValuePATHTerminalRuleCall_1_0()); 
            match(input,RULE_PATH,FOLLOW_2); 
             after(grammarAccess.getINCLUDEAccess().getValuePATHTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INCLUDE__ValueAssignment_1"


    // $ANTLR start "rule__MAC__ValueAssignment_1"
    // InternalA2B.g:1369:1: rule__MAC__ValueAssignment_1 : ( RULE_MACADDRESS ) ;
    public final void rule__MAC__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1373:1: ( ( RULE_MACADDRESS ) )
            // InternalA2B.g:1374:2: ( RULE_MACADDRESS )
            {
            // InternalA2B.g:1374:2: ( RULE_MACADDRESS )
            // InternalA2B.g:1375:3: RULE_MACADDRESS
            {
             before(grammarAccess.getMACAccess().getValueMACADDRESSTerminalRuleCall_1_0()); 
            match(input,RULE_MACADDRESS,FOLLOW_2); 
             after(grammarAccess.getMACAccess().getValueMACADDRESSTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MAC__ValueAssignment_1"


    // $ANTLR start "rule__IP__ValueAssignment_1"
    // InternalA2B.g:1384:1: rule__IP__ValueAssignment_1 : ( RULE_IPADDRESS ) ;
    public final void rule__IP__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1388:1: ( ( RULE_IPADDRESS ) )
            // InternalA2B.g:1389:2: ( RULE_IPADDRESS )
            {
            // InternalA2B.g:1389:2: ( RULE_IPADDRESS )
            // InternalA2B.g:1390:3: RULE_IPADDRESS
            {
             before(grammarAccess.getIPAccess().getValueIPADDRESSTerminalRuleCall_1_0()); 
            match(input,RULE_IPADDRESS,FOLLOW_2); 
             after(grammarAccess.getIPAccess().getValueIPADDRESSTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IP__ValueAssignment_1"


    // $ANTLR start "rule__HXS__ValueAssignment_1"
    // InternalA2B.g:1399:1: rule__HXS__ValueAssignment_1 : ( RULE_HEXSTRING ) ;
    public final void rule__HXS__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1403:1: ( ( RULE_HEXSTRING ) )
            // InternalA2B.g:1404:2: ( RULE_HEXSTRING )
            {
            // InternalA2B.g:1404:2: ( RULE_HEXSTRING )
            // InternalA2B.g:1405:3: RULE_HEXSTRING
            {
             before(grammarAccess.getHXSAccess().getValueHEXSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_HEXSTRING,FOLLOW_2); 
             after(grammarAccess.getHXSAccess().getValueHEXSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HXS__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000001FFE00002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000001FFE00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001000L});

}