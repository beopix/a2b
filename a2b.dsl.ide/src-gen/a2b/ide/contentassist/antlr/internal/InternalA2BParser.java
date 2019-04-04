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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_BYTE", "RULE_CRCCHECK", "RULE_WORD", "RULE_DOUBLEWORD", "RULE_STRING", "RULE_PATH", "RULE_MACADDRESS", "RULE_IPADDRESS", "RULE_HEXSTRING", "RULE_DECIMALBYTE_", "RULE_BINARY_", "RULE_HEX_", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BE'", "'LE'", "'PCAP'", "'CRC'", "'DB'", "'DW'", "'DD'", "'STR'", "'B64'", "'ORG'", "'INCLUDE'", "'MAC'", "'IP'", "'HXS'"
    };
    public static final int RULE_HEX_=16;
    public static final int RULE_WORD=7;
    public static final int RULE_BINARY_=15;
    public static final int RULE_DOUBLEWORD=8;
    public static final int RULE_CRCCHECK=6;
    public static final int RULE_BYTE=5;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=19;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_HEXSTRING=13;
    public static final int RULE_ID=17;
    public static final int RULE_WS=20;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_PATH=10;
    public static final int RULE_MACADDRESS=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int RULE_DECIMALBYTE_=14;
    public static final int T__22=22;
    public static final int RULE_IPADDRESS=12;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;

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

                if ( ((LA1_0>=22 && LA1_0<=35)) ) {
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


    // $ANTLR start "entryRuleSTR"
    // InternalA2B.g:178:1: entryRuleSTR : ruleSTR EOF ;
    public final void entryRuleSTR() throws RecognitionException {
        try {
            // InternalA2B.g:179:1: ( ruleSTR EOF )
            // InternalA2B.g:180:1: ruleSTR EOF
            {
             before(grammarAccess.getSTRRule()); 
            pushFollow(FOLLOW_1);
            ruleSTR();

            state._fsp--;

             after(grammarAccess.getSTRRule()); 
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
    // $ANTLR end "entryRuleSTR"


    // $ANTLR start "ruleSTR"
    // InternalA2B.g:187:1: ruleSTR : ( ( rule__STR__Group__0 ) ) ;
    public final void ruleSTR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:191:2: ( ( ( rule__STR__Group__0 ) ) )
            // InternalA2B.g:192:2: ( ( rule__STR__Group__0 ) )
            {
            // InternalA2B.g:192:2: ( ( rule__STR__Group__0 ) )
            // InternalA2B.g:193:3: ( rule__STR__Group__0 )
            {
             before(grammarAccess.getSTRAccess().getGroup()); 
            // InternalA2B.g:194:3: ( rule__STR__Group__0 )
            // InternalA2B.g:194:4: rule__STR__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__STR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSTRAccess().getGroup()); 

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
    // $ANTLR end "ruleSTR"


    // $ANTLR start "entryRuleBase64"
    // InternalA2B.g:203:1: entryRuleBase64 : ruleBase64 EOF ;
    public final void entryRuleBase64() throws RecognitionException {
        try {
            // InternalA2B.g:204:1: ( ruleBase64 EOF )
            // InternalA2B.g:205:1: ruleBase64 EOF
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
    // InternalA2B.g:212:1: ruleBase64 : ( ( rule__Base64__Group__0 ) ) ;
    public final void ruleBase64() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:216:2: ( ( ( rule__Base64__Group__0 ) ) )
            // InternalA2B.g:217:2: ( ( rule__Base64__Group__0 ) )
            {
            // InternalA2B.g:217:2: ( ( rule__Base64__Group__0 ) )
            // InternalA2B.g:218:3: ( rule__Base64__Group__0 )
            {
             before(grammarAccess.getBase64Access().getGroup()); 
            // InternalA2B.g:219:3: ( rule__Base64__Group__0 )
            // InternalA2B.g:219:4: rule__Base64__Group__0
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
    // InternalA2B.g:228:1: entryRuleORG : ruleORG EOF ;
    public final void entryRuleORG() throws RecognitionException {
        try {
            // InternalA2B.g:229:1: ( ruleORG EOF )
            // InternalA2B.g:230:1: ruleORG EOF
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
    // InternalA2B.g:237:1: ruleORG : ( ( rule__ORG__Group__0 ) ) ;
    public final void ruleORG() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:241:2: ( ( ( rule__ORG__Group__0 ) ) )
            // InternalA2B.g:242:2: ( ( rule__ORG__Group__0 ) )
            {
            // InternalA2B.g:242:2: ( ( rule__ORG__Group__0 ) )
            // InternalA2B.g:243:3: ( rule__ORG__Group__0 )
            {
             before(grammarAccess.getORGAccess().getGroup()); 
            // InternalA2B.g:244:3: ( rule__ORG__Group__0 )
            // InternalA2B.g:244:4: rule__ORG__Group__0
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
    // InternalA2B.g:253:1: entryRuleINCLUDE : ruleINCLUDE EOF ;
    public final void entryRuleINCLUDE() throws RecognitionException {
        try {
            // InternalA2B.g:254:1: ( ruleINCLUDE EOF )
            // InternalA2B.g:255:1: ruleINCLUDE EOF
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
    // InternalA2B.g:262:1: ruleINCLUDE : ( ( rule__INCLUDE__Group__0 ) ) ;
    public final void ruleINCLUDE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:266:2: ( ( ( rule__INCLUDE__Group__0 ) ) )
            // InternalA2B.g:267:2: ( ( rule__INCLUDE__Group__0 ) )
            {
            // InternalA2B.g:267:2: ( ( rule__INCLUDE__Group__0 ) )
            // InternalA2B.g:268:3: ( rule__INCLUDE__Group__0 )
            {
             before(grammarAccess.getINCLUDEAccess().getGroup()); 
            // InternalA2B.g:269:3: ( rule__INCLUDE__Group__0 )
            // InternalA2B.g:269:4: rule__INCLUDE__Group__0
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
    // InternalA2B.g:278:1: entryRuleMAC : ruleMAC EOF ;
    public final void entryRuleMAC() throws RecognitionException {
        try {
            // InternalA2B.g:279:1: ( ruleMAC EOF )
            // InternalA2B.g:280:1: ruleMAC EOF
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
    // InternalA2B.g:287:1: ruleMAC : ( ( rule__MAC__Group__0 ) ) ;
    public final void ruleMAC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:291:2: ( ( ( rule__MAC__Group__0 ) ) )
            // InternalA2B.g:292:2: ( ( rule__MAC__Group__0 ) )
            {
            // InternalA2B.g:292:2: ( ( rule__MAC__Group__0 ) )
            // InternalA2B.g:293:3: ( rule__MAC__Group__0 )
            {
             before(grammarAccess.getMACAccess().getGroup()); 
            // InternalA2B.g:294:3: ( rule__MAC__Group__0 )
            // InternalA2B.g:294:4: rule__MAC__Group__0
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
    // InternalA2B.g:303:1: entryRuleIP : ruleIP EOF ;
    public final void entryRuleIP() throws RecognitionException {
        try {
            // InternalA2B.g:304:1: ( ruleIP EOF )
            // InternalA2B.g:305:1: ruleIP EOF
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
    // InternalA2B.g:312:1: ruleIP : ( ( rule__IP__Group__0 ) ) ;
    public final void ruleIP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:316:2: ( ( ( rule__IP__Group__0 ) ) )
            // InternalA2B.g:317:2: ( ( rule__IP__Group__0 ) )
            {
            // InternalA2B.g:317:2: ( ( rule__IP__Group__0 ) )
            // InternalA2B.g:318:3: ( rule__IP__Group__0 )
            {
             before(grammarAccess.getIPAccess().getGroup()); 
            // InternalA2B.g:319:3: ( rule__IP__Group__0 )
            // InternalA2B.g:319:4: rule__IP__Group__0
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
    // InternalA2B.g:328:1: entryRuleHXS : ruleHXS EOF ;
    public final void entryRuleHXS() throws RecognitionException {
        try {
            // InternalA2B.g:329:1: ( ruleHXS EOF )
            // InternalA2B.g:330:1: ruleHXS EOF
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
    // InternalA2B.g:337:1: ruleHXS : ( ( rule__HXS__Group__0 ) ) ;
    public final void ruleHXS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:341:2: ( ( ( rule__HXS__Group__0 ) ) )
            // InternalA2B.g:342:2: ( ( rule__HXS__Group__0 ) )
            {
            // InternalA2B.g:342:2: ( ( rule__HXS__Group__0 ) )
            // InternalA2B.g:343:3: ( rule__HXS__Group__0 )
            {
             before(grammarAccess.getHXSAccess().getGroup()); 
            // InternalA2B.g:344:3: ( rule__HXS__Group__0 )
            // InternalA2B.g:344:4: rule__HXS__Group__0
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
    // InternalA2B.g:353:1: entryRuleBE : ruleBE EOF ;
    public final void entryRuleBE() throws RecognitionException {
        try {
            // InternalA2B.g:354:1: ( ruleBE EOF )
            // InternalA2B.g:355:1: ruleBE EOF
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
    // InternalA2B.g:362:1: ruleBE : ( 'BE' ) ;
    public final void ruleBE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:366:2: ( ( 'BE' ) )
            // InternalA2B.g:367:2: ( 'BE' )
            {
            // InternalA2B.g:367:2: ( 'BE' )
            // InternalA2B.g:368:3: 'BE'
            {
             before(grammarAccess.getBEAccess().getBEKeyword()); 
            match(input,22,FOLLOW_2); 
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
    // InternalA2B.g:378:1: entryRuleLE : ruleLE EOF ;
    public final void entryRuleLE() throws RecognitionException {
        try {
            // InternalA2B.g:379:1: ( ruleLE EOF )
            // InternalA2B.g:380:1: ruleLE EOF
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
    // InternalA2B.g:387:1: ruleLE : ( 'LE' ) ;
    public final void ruleLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:391:2: ( ( 'LE' ) )
            // InternalA2B.g:392:2: ( 'LE' )
            {
            // InternalA2B.g:392:2: ( 'LE' )
            // InternalA2B.g:393:3: 'LE'
            {
             before(grammarAccess.getLEAccess().getLEKeyword()); 
            match(input,23,FOLLOW_2); 
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
    // InternalA2B.g:403:1: entryRulePCAP : rulePCAP EOF ;
    public final void entryRulePCAP() throws RecognitionException {
        try {
            // InternalA2B.g:404:1: ( rulePCAP EOF )
            // InternalA2B.g:405:1: rulePCAP EOF
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
    // InternalA2B.g:412:1: rulePCAP : ( 'PCAP' ) ;
    public final void rulePCAP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:416:2: ( ( 'PCAP' ) )
            // InternalA2B.g:417:2: ( 'PCAP' )
            {
            // InternalA2B.g:417:2: ( 'PCAP' )
            // InternalA2B.g:418:3: 'PCAP'
            {
             before(grammarAccess.getPCAPAccess().getPCAPKeyword()); 
            match(input,24,FOLLOW_2); 
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


    // $ANTLR start "entryRuleCRC"
    // InternalA2B.g:428:1: entryRuleCRC : ruleCRC EOF ;
    public final void entryRuleCRC() throws RecognitionException {
        try {
            // InternalA2B.g:429:1: ( ruleCRC EOF )
            // InternalA2B.g:430:1: ruleCRC EOF
            {
             before(grammarAccess.getCRCRule()); 
            pushFollow(FOLLOW_1);
            ruleCRC();

            state._fsp--;

             after(grammarAccess.getCRCRule()); 
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
    // $ANTLR end "entryRuleCRC"


    // $ANTLR start "ruleCRC"
    // InternalA2B.g:437:1: ruleCRC : ( 'CRC' ) ;
    public final void ruleCRC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:441:2: ( ( 'CRC' ) )
            // InternalA2B.g:442:2: ( 'CRC' )
            {
            // InternalA2B.g:442:2: ( 'CRC' )
            // InternalA2B.g:443:3: 'CRC'
            {
             before(grammarAccess.getCRCAccess().getCRCKeyword()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCRCAccess().getCRCKeyword()); 

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
    // $ANTLR end "ruleCRC"


    // $ANTLR start "entryRuleLONG"
    // InternalA2B.g:453:1: entryRuleLONG : ruleLONG EOF ;
    public final void entryRuleLONG() throws RecognitionException {
        try {
            // InternalA2B.g:454:1: ( ruleLONG EOF )
            // InternalA2B.g:455:1: ruleLONG EOF
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
    // InternalA2B.g:462:1: ruleLONG : ( RULE_INT ) ;
    public final void ruleLONG() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:466:2: ( ( RULE_INT ) )
            // InternalA2B.g:467:2: ( RULE_INT )
            {
            // InternalA2B.g:467:2: ( RULE_INT )
            // InternalA2B.g:468:3: RULE_INT
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
    // InternalA2B.g:477:1: rule__Instruction__Alternatives : ( ( ruleDB ) | ( ruleDW ) | ( ruleDD ) | ( ruleSTR ) | ( ruleBase64 ) | ( ruleORG ) | ( ruleINCLUDE ) | ( ruleMAC ) | ( ruleIP ) | ( ruleHXS ) | ( ( rule__Instruction__Group_10__0 ) ) | ( ( rule__Instruction__Group_11__0 ) ) | ( ( rule__Instruction__Group_12__0 ) ) | ( ( rule__Instruction__Group_13__0 ) ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:481:1: ( ( ruleDB ) | ( ruleDW ) | ( ruleDD ) | ( ruleSTR ) | ( ruleBase64 ) | ( ruleORG ) | ( ruleINCLUDE ) | ( ruleMAC ) | ( ruleIP ) | ( ruleHXS ) | ( ( rule__Instruction__Group_10__0 ) ) | ( ( rule__Instruction__Group_11__0 ) ) | ( ( rule__Instruction__Group_12__0 ) ) | ( ( rule__Instruction__Group_13__0 ) ) )
            int alt2=14;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 29:
                {
                alt2=4;
                }
                break;
            case 30:
                {
                alt2=5;
                }
                break;
            case 31:
                {
                alt2=6;
                }
                break;
            case 32:
                {
                alt2=7;
                }
                break;
            case 33:
                {
                alt2=8;
                }
                break;
            case 34:
                {
                alt2=9;
                }
                break;
            case 35:
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
            case 24:
                {
                alt2=13;
                }
                break;
            case 25:
                {
                alt2=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalA2B.g:482:2: ( ruleDB )
                    {
                    // InternalA2B.g:482:2: ( ruleDB )
                    // InternalA2B.g:483:3: ruleDB
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
                    // InternalA2B.g:488:2: ( ruleDW )
                    {
                    // InternalA2B.g:488:2: ( ruleDW )
                    // InternalA2B.g:489:3: ruleDW
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
                    // InternalA2B.g:494:2: ( ruleDD )
                    {
                    // InternalA2B.g:494:2: ( ruleDD )
                    // InternalA2B.g:495:3: ruleDD
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
                    // InternalA2B.g:500:2: ( ruleSTR )
                    {
                    // InternalA2B.g:500:2: ( ruleSTR )
                    // InternalA2B.g:501:3: ruleSTR
                    {
                     before(grammarAccess.getInstructionAccess().getSTRParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSTR();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getSTRParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalA2B.g:506:2: ( ruleBase64 )
                    {
                    // InternalA2B.g:506:2: ( ruleBase64 )
                    // InternalA2B.g:507:3: ruleBase64
                    {
                     before(grammarAccess.getInstructionAccess().getBase64ParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleBase64();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getBase64ParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalA2B.g:512:2: ( ruleORG )
                    {
                    // InternalA2B.g:512:2: ( ruleORG )
                    // InternalA2B.g:513:3: ruleORG
                    {
                     before(grammarAccess.getInstructionAccess().getORGParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleORG();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getORGParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalA2B.g:518:2: ( ruleINCLUDE )
                    {
                    // InternalA2B.g:518:2: ( ruleINCLUDE )
                    // InternalA2B.g:519:3: ruleINCLUDE
                    {
                     before(grammarAccess.getInstructionAccess().getINCLUDEParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleINCLUDE();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getINCLUDEParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalA2B.g:524:2: ( ruleMAC )
                    {
                    // InternalA2B.g:524:2: ( ruleMAC )
                    // InternalA2B.g:525:3: ruleMAC
                    {
                     before(grammarAccess.getInstructionAccess().getMACParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleMAC();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getMACParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalA2B.g:530:2: ( ruleIP )
                    {
                    // InternalA2B.g:530:2: ( ruleIP )
                    // InternalA2B.g:531:3: ruleIP
                    {
                     before(grammarAccess.getInstructionAccess().getIPParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleIP();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getIPParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalA2B.g:536:2: ( ruleHXS )
                    {
                    // InternalA2B.g:536:2: ( ruleHXS )
                    // InternalA2B.g:537:3: ruleHXS
                    {
                     before(grammarAccess.getInstructionAccess().getHXSParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleHXS();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getHXSParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalA2B.g:542:2: ( ( rule__Instruction__Group_10__0 ) )
                    {
                    // InternalA2B.g:542:2: ( ( rule__Instruction__Group_10__0 ) )
                    // InternalA2B.g:543:3: ( rule__Instruction__Group_10__0 )
                    {
                     before(grammarAccess.getInstructionAccess().getGroup_10()); 
                    // InternalA2B.g:544:3: ( rule__Instruction__Group_10__0 )
                    // InternalA2B.g:544:4: rule__Instruction__Group_10__0
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
                    // InternalA2B.g:548:2: ( ( rule__Instruction__Group_11__0 ) )
                    {
                    // InternalA2B.g:548:2: ( ( rule__Instruction__Group_11__0 ) )
                    // InternalA2B.g:549:3: ( rule__Instruction__Group_11__0 )
                    {
                     before(grammarAccess.getInstructionAccess().getGroup_11()); 
                    // InternalA2B.g:550:3: ( rule__Instruction__Group_11__0 )
                    // InternalA2B.g:550:4: rule__Instruction__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instruction__Group_11__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionAccess().getGroup_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalA2B.g:554:2: ( ( rule__Instruction__Group_12__0 ) )
                    {
                    // InternalA2B.g:554:2: ( ( rule__Instruction__Group_12__0 ) )
                    // InternalA2B.g:555:3: ( rule__Instruction__Group_12__0 )
                    {
                     before(grammarAccess.getInstructionAccess().getGroup_12()); 
                    // InternalA2B.g:556:3: ( rule__Instruction__Group_12__0 )
                    // InternalA2B.g:556:4: rule__Instruction__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instruction__Group_12__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionAccess().getGroup_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalA2B.g:560:2: ( ( rule__Instruction__Group_13__0 ) )
                    {
                    // InternalA2B.g:560:2: ( ( rule__Instruction__Group_13__0 ) )
                    // InternalA2B.g:561:3: ( rule__Instruction__Group_13__0 )
                    {
                     before(grammarAccess.getInstructionAccess().getGroup_13()); 
                    // InternalA2B.g:562:3: ( rule__Instruction__Group_13__0 )
                    // InternalA2B.g:562:4: rule__Instruction__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instruction__Group_13__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionAccess().getGroup_13()); 

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
    // InternalA2B.g:570:1: rule__DB__Alternatives_1 : ( ( ( rule__DB__StringValueAssignment_1_0 ) ) | ( ( rule__DB__IntValueAssignment_1_1 ) ) );
    public final void rule__DB__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:574:1: ( ( ( rule__DB__StringValueAssignment_1_0 ) ) | ( ( rule__DB__IntValueAssignment_1_1 ) ) )
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
                    // InternalA2B.g:575:2: ( ( rule__DB__StringValueAssignment_1_0 ) )
                    {
                    // InternalA2B.g:575:2: ( ( rule__DB__StringValueAssignment_1_0 ) )
                    // InternalA2B.g:576:3: ( rule__DB__StringValueAssignment_1_0 )
                    {
                     before(grammarAccess.getDBAccess().getStringValueAssignment_1_0()); 
                    // InternalA2B.g:577:3: ( rule__DB__StringValueAssignment_1_0 )
                    // InternalA2B.g:577:4: rule__DB__StringValueAssignment_1_0
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
                    // InternalA2B.g:581:2: ( ( rule__DB__IntValueAssignment_1_1 ) )
                    {
                    // InternalA2B.g:581:2: ( ( rule__DB__IntValueAssignment_1_1 ) )
                    // InternalA2B.g:582:3: ( rule__DB__IntValueAssignment_1_1 )
                    {
                     before(grammarAccess.getDBAccess().getIntValueAssignment_1_1()); 
                    // InternalA2B.g:583:3: ( rule__DB__IntValueAssignment_1_1 )
                    // InternalA2B.g:583:4: rule__DB__IntValueAssignment_1_1
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
    // InternalA2B.g:591:1: rule__DW__Alternatives_1 : ( ( ( rule__DW__StringValueAssignment_1_0 ) ) | ( ( rule__DW__IntValueAssignment_1_1 ) ) );
    public final void rule__DW__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:595:1: ( ( ( rule__DW__StringValueAssignment_1_0 ) ) | ( ( rule__DW__IntValueAssignment_1_1 ) ) )
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
                    // InternalA2B.g:596:2: ( ( rule__DW__StringValueAssignment_1_0 ) )
                    {
                    // InternalA2B.g:596:2: ( ( rule__DW__StringValueAssignment_1_0 ) )
                    // InternalA2B.g:597:3: ( rule__DW__StringValueAssignment_1_0 )
                    {
                     before(grammarAccess.getDWAccess().getStringValueAssignment_1_0()); 
                    // InternalA2B.g:598:3: ( rule__DW__StringValueAssignment_1_0 )
                    // InternalA2B.g:598:4: rule__DW__StringValueAssignment_1_0
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
                    // InternalA2B.g:602:2: ( ( rule__DW__IntValueAssignment_1_1 ) )
                    {
                    // InternalA2B.g:602:2: ( ( rule__DW__IntValueAssignment_1_1 ) )
                    // InternalA2B.g:603:3: ( rule__DW__IntValueAssignment_1_1 )
                    {
                     before(grammarAccess.getDWAccess().getIntValueAssignment_1_1()); 
                    // InternalA2B.g:604:3: ( rule__DW__IntValueAssignment_1_1 )
                    // InternalA2B.g:604:4: rule__DW__IntValueAssignment_1_1
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
    // InternalA2B.g:612:1: rule__DD__Alternatives_1 : ( ( ( rule__DD__StringValueAssignment_1_0 ) ) | ( ( rule__DD__LongValueAssignment_1_1 ) ) );
    public final void rule__DD__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:616:1: ( ( ( rule__DD__StringValueAssignment_1_0 ) ) | ( ( rule__DD__LongValueAssignment_1_1 ) ) )
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
                    // InternalA2B.g:617:2: ( ( rule__DD__StringValueAssignment_1_0 ) )
                    {
                    // InternalA2B.g:617:2: ( ( rule__DD__StringValueAssignment_1_0 ) )
                    // InternalA2B.g:618:3: ( rule__DD__StringValueAssignment_1_0 )
                    {
                     before(grammarAccess.getDDAccess().getStringValueAssignment_1_0()); 
                    // InternalA2B.g:619:3: ( rule__DD__StringValueAssignment_1_0 )
                    // InternalA2B.g:619:4: rule__DD__StringValueAssignment_1_0
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
                    // InternalA2B.g:623:2: ( ( rule__DD__LongValueAssignment_1_1 ) )
                    {
                    // InternalA2B.g:623:2: ( ( rule__DD__LongValueAssignment_1_1 ) )
                    // InternalA2B.g:624:3: ( rule__DD__LongValueAssignment_1_1 )
                    {
                     before(grammarAccess.getDDAccess().getLongValueAssignment_1_1()); 
                    // InternalA2B.g:625:3: ( rule__DD__LongValueAssignment_1_1 )
                    // InternalA2B.g:625:4: rule__DD__LongValueAssignment_1_1
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


    // $ANTLR start "rule__Instruction__Group_10__0"
    // InternalA2B.g:633:1: rule__Instruction__Group_10__0 : rule__Instruction__Group_10__0__Impl rule__Instruction__Group_10__1 ;
    public final void rule__Instruction__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:637:1: ( rule__Instruction__Group_10__0__Impl rule__Instruction__Group_10__1 )
            // InternalA2B.g:638:2: rule__Instruction__Group_10__0__Impl rule__Instruction__Group_10__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalA2B.g:645:1: rule__Instruction__Group_10__0__Impl : ( () ) ;
    public final void rule__Instruction__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:649:1: ( ( () ) )
            // InternalA2B.g:650:1: ( () )
            {
            // InternalA2B.g:650:1: ( () )
            // InternalA2B.g:651:2: ()
            {
             before(grammarAccess.getInstructionAccess().getBEAction_10_0()); 
            // InternalA2B.g:652:2: ()
            // InternalA2B.g:652:3: 
            {
            }

             after(grammarAccess.getInstructionAccess().getBEAction_10_0()); 

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
    // InternalA2B.g:660:1: rule__Instruction__Group_10__1 : rule__Instruction__Group_10__1__Impl ;
    public final void rule__Instruction__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:664:1: ( rule__Instruction__Group_10__1__Impl )
            // InternalA2B.g:665:2: rule__Instruction__Group_10__1__Impl
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
    // InternalA2B.g:671:1: rule__Instruction__Group_10__1__Impl : ( ruleBE ) ;
    public final void rule__Instruction__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:675:1: ( ( ruleBE ) )
            // InternalA2B.g:676:1: ( ruleBE )
            {
            // InternalA2B.g:676:1: ( ruleBE )
            // InternalA2B.g:677:2: ruleBE
            {
             before(grammarAccess.getInstructionAccess().getBEParserRuleCall_10_1()); 
            pushFollow(FOLLOW_2);
            ruleBE();

            state._fsp--;

             after(grammarAccess.getInstructionAccess().getBEParserRuleCall_10_1()); 

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
    // InternalA2B.g:687:1: rule__Instruction__Group_11__0 : rule__Instruction__Group_11__0__Impl rule__Instruction__Group_11__1 ;
    public final void rule__Instruction__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:691:1: ( rule__Instruction__Group_11__0__Impl rule__Instruction__Group_11__1 )
            // InternalA2B.g:692:2: rule__Instruction__Group_11__0__Impl rule__Instruction__Group_11__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalA2B.g:699:1: rule__Instruction__Group_11__0__Impl : ( () ) ;
    public final void rule__Instruction__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:703:1: ( ( () ) )
            // InternalA2B.g:704:1: ( () )
            {
            // InternalA2B.g:704:1: ( () )
            // InternalA2B.g:705:2: ()
            {
             before(grammarAccess.getInstructionAccess().getLEAction_11_0()); 
            // InternalA2B.g:706:2: ()
            // InternalA2B.g:706:3: 
            {
            }

             after(grammarAccess.getInstructionAccess().getLEAction_11_0()); 

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
    // InternalA2B.g:714:1: rule__Instruction__Group_11__1 : rule__Instruction__Group_11__1__Impl ;
    public final void rule__Instruction__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:718:1: ( rule__Instruction__Group_11__1__Impl )
            // InternalA2B.g:719:2: rule__Instruction__Group_11__1__Impl
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
    // InternalA2B.g:725:1: rule__Instruction__Group_11__1__Impl : ( ruleLE ) ;
    public final void rule__Instruction__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:729:1: ( ( ruleLE ) )
            // InternalA2B.g:730:1: ( ruleLE )
            {
            // InternalA2B.g:730:1: ( ruleLE )
            // InternalA2B.g:731:2: ruleLE
            {
             before(grammarAccess.getInstructionAccess().getLEParserRuleCall_11_1()); 
            pushFollow(FOLLOW_2);
            ruleLE();

            state._fsp--;

             after(grammarAccess.getInstructionAccess().getLEParserRuleCall_11_1()); 

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


    // $ANTLR start "rule__Instruction__Group_12__0"
    // InternalA2B.g:741:1: rule__Instruction__Group_12__0 : rule__Instruction__Group_12__0__Impl rule__Instruction__Group_12__1 ;
    public final void rule__Instruction__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:745:1: ( rule__Instruction__Group_12__0__Impl rule__Instruction__Group_12__1 )
            // InternalA2B.g:746:2: rule__Instruction__Group_12__0__Impl rule__Instruction__Group_12__1
            {
            pushFollow(FOLLOW_6);
            rule__Instruction__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruction__Group_12__1();

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
    // $ANTLR end "rule__Instruction__Group_12__0"


    // $ANTLR start "rule__Instruction__Group_12__0__Impl"
    // InternalA2B.g:753:1: rule__Instruction__Group_12__0__Impl : ( () ) ;
    public final void rule__Instruction__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:757:1: ( ( () ) )
            // InternalA2B.g:758:1: ( () )
            {
            // InternalA2B.g:758:1: ( () )
            // InternalA2B.g:759:2: ()
            {
             before(grammarAccess.getInstructionAccess().getPCAPAction_12_0()); 
            // InternalA2B.g:760:2: ()
            // InternalA2B.g:760:3: 
            {
            }

             after(grammarAccess.getInstructionAccess().getPCAPAction_12_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_12__0__Impl"


    // $ANTLR start "rule__Instruction__Group_12__1"
    // InternalA2B.g:768:1: rule__Instruction__Group_12__1 : rule__Instruction__Group_12__1__Impl ;
    public final void rule__Instruction__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:772:1: ( rule__Instruction__Group_12__1__Impl )
            // InternalA2B.g:773:2: rule__Instruction__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Group_12__1__Impl();

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
    // $ANTLR end "rule__Instruction__Group_12__1"


    // $ANTLR start "rule__Instruction__Group_12__1__Impl"
    // InternalA2B.g:779:1: rule__Instruction__Group_12__1__Impl : ( rulePCAP ) ;
    public final void rule__Instruction__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:783:1: ( ( rulePCAP ) )
            // InternalA2B.g:784:1: ( rulePCAP )
            {
            // InternalA2B.g:784:1: ( rulePCAP )
            // InternalA2B.g:785:2: rulePCAP
            {
             before(grammarAccess.getInstructionAccess().getPCAPParserRuleCall_12_1()); 
            pushFollow(FOLLOW_2);
            rulePCAP();

            state._fsp--;

             after(grammarAccess.getInstructionAccess().getPCAPParserRuleCall_12_1()); 

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
    // $ANTLR end "rule__Instruction__Group_12__1__Impl"


    // $ANTLR start "rule__Instruction__Group_13__0"
    // InternalA2B.g:795:1: rule__Instruction__Group_13__0 : rule__Instruction__Group_13__0__Impl rule__Instruction__Group_13__1 ;
    public final void rule__Instruction__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:799:1: ( rule__Instruction__Group_13__0__Impl rule__Instruction__Group_13__1 )
            // InternalA2B.g:800:2: rule__Instruction__Group_13__0__Impl rule__Instruction__Group_13__1
            {
            pushFollow(FOLLOW_7);
            rule__Instruction__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruction__Group_13__1();

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
    // $ANTLR end "rule__Instruction__Group_13__0"


    // $ANTLR start "rule__Instruction__Group_13__0__Impl"
    // InternalA2B.g:807:1: rule__Instruction__Group_13__0__Impl : ( () ) ;
    public final void rule__Instruction__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:811:1: ( ( () ) )
            // InternalA2B.g:812:1: ( () )
            {
            // InternalA2B.g:812:1: ( () )
            // InternalA2B.g:813:2: ()
            {
             before(grammarAccess.getInstructionAccess().getCRCAction_13_0()); 
            // InternalA2B.g:814:2: ()
            // InternalA2B.g:814:3: 
            {
            }

             after(grammarAccess.getInstructionAccess().getCRCAction_13_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_13__0__Impl"


    // $ANTLR start "rule__Instruction__Group_13__1"
    // InternalA2B.g:822:1: rule__Instruction__Group_13__1 : rule__Instruction__Group_13__1__Impl ;
    public final void rule__Instruction__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:826:1: ( rule__Instruction__Group_13__1__Impl )
            // InternalA2B.g:827:2: rule__Instruction__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Group_13__1__Impl();

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
    // $ANTLR end "rule__Instruction__Group_13__1"


    // $ANTLR start "rule__Instruction__Group_13__1__Impl"
    // InternalA2B.g:833:1: rule__Instruction__Group_13__1__Impl : ( ruleCRC ) ;
    public final void rule__Instruction__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:837:1: ( ( ruleCRC ) )
            // InternalA2B.g:838:1: ( ruleCRC )
            {
            // InternalA2B.g:838:1: ( ruleCRC )
            // InternalA2B.g:839:2: ruleCRC
            {
             before(grammarAccess.getInstructionAccess().getCRCParserRuleCall_13_1()); 
            pushFollow(FOLLOW_2);
            ruleCRC();

            state._fsp--;

             after(grammarAccess.getInstructionAccess().getCRCParserRuleCall_13_1()); 

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
    // $ANTLR end "rule__Instruction__Group_13__1__Impl"


    // $ANTLR start "rule__DB__Group__0"
    // InternalA2B.g:849:1: rule__DB__Group__0 : rule__DB__Group__0__Impl rule__DB__Group__1 ;
    public final void rule__DB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:853:1: ( rule__DB__Group__0__Impl rule__DB__Group__1 )
            // InternalA2B.g:854:2: rule__DB__Group__0__Impl rule__DB__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalA2B.g:861:1: rule__DB__Group__0__Impl : ( 'DB' ) ;
    public final void rule__DB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:865:1: ( ( 'DB' ) )
            // InternalA2B.g:866:1: ( 'DB' )
            {
            // InternalA2B.g:866:1: ( 'DB' )
            // InternalA2B.g:867:2: 'DB'
            {
             before(grammarAccess.getDBAccess().getDBKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalA2B.g:876:1: rule__DB__Group__1 : rule__DB__Group__1__Impl rule__DB__Group__2 ;
    public final void rule__DB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:880:1: ( rule__DB__Group__1__Impl rule__DB__Group__2 )
            // InternalA2B.g:881:2: rule__DB__Group__1__Impl rule__DB__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__DB__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DB__Group__2();

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
    // InternalA2B.g:888:1: rule__DB__Group__1__Impl : ( ( rule__DB__Alternatives_1 ) ) ;
    public final void rule__DB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:892:1: ( ( ( rule__DB__Alternatives_1 ) ) )
            // InternalA2B.g:893:1: ( ( rule__DB__Alternatives_1 ) )
            {
            // InternalA2B.g:893:1: ( ( rule__DB__Alternatives_1 ) )
            // InternalA2B.g:894:2: ( rule__DB__Alternatives_1 )
            {
             before(grammarAccess.getDBAccess().getAlternatives_1()); 
            // InternalA2B.g:895:2: ( rule__DB__Alternatives_1 )
            // InternalA2B.g:895:3: rule__DB__Alternatives_1
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


    // $ANTLR start "rule__DB__Group__2"
    // InternalA2B.g:903:1: rule__DB__Group__2 : rule__DB__Group__2__Impl ;
    public final void rule__DB__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:907:1: ( rule__DB__Group__2__Impl )
            // InternalA2B.g:908:2: rule__DB__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DB__Group__2__Impl();

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
    // $ANTLR end "rule__DB__Group__2"


    // $ANTLR start "rule__DB__Group__2__Impl"
    // InternalA2B.g:914:1: rule__DB__Group__2__Impl : ( ( rule__DB__CrcValueAssignment_2 )? ) ;
    public final void rule__DB__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:918:1: ( ( ( rule__DB__CrcValueAssignment_2 )? ) )
            // InternalA2B.g:919:1: ( ( rule__DB__CrcValueAssignment_2 )? )
            {
            // InternalA2B.g:919:1: ( ( rule__DB__CrcValueAssignment_2 )? )
            // InternalA2B.g:920:2: ( rule__DB__CrcValueAssignment_2 )?
            {
             before(grammarAccess.getDBAccess().getCrcValueAssignment_2()); 
            // InternalA2B.g:921:2: ( rule__DB__CrcValueAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_CRCCHECK) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalA2B.g:921:3: rule__DB__CrcValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DB__CrcValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDBAccess().getCrcValueAssignment_2()); 

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
    // $ANTLR end "rule__DB__Group__2__Impl"


    // $ANTLR start "rule__DW__Group__0"
    // InternalA2B.g:930:1: rule__DW__Group__0 : rule__DW__Group__0__Impl rule__DW__Group__1 ;
    public final void rule__DW__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:934:1: ( rule__DW__Group__0__Impl rule__DW__Group__1 )
            // InternalA2B.g:935:2: rule__DW__Group__0__Impl rule__DW__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalA2B.g:942:1: rule__DW__Group__0__Impl : ( 'DW' ) ;
    public final void rule__DW__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:946:1: ( ( 'DW' ) )
            // InternalA2B.g:947:1: ( 'DW' )
            {
            // InternalA2B.g:947:1: ( 'DW' )
            // InternalA2B.g:948:2: 'DW'
            {
             before(grammarAccess.getDWAccess().getDWKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalA2B.g:957:1: rule__DW__Group__1 : rule__DW__Group__1__Impl rule__DW__Group__2 ;
    public final void rule__DW__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:961:1: ( rule__DW__Group__1__Impl rule__DW__Group__2 )
            // InternalA2B.g:962:2: rule__DW__Group__1__Impl rule__DW__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__DW__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DW__Group__2();

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
    // InternalA2B.g:969:1: rule__DW__Group__1__Impl : ( ( rule__DW__Alternatives_1 ) ) ;
    public final void rule__DW__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:973:1: ( ( ( rule__DW__Alternatives_1 ) ) )
            // InternalA2B.g:974:1: ( ( rule__DW__Alternatives_1 ) )
            {
            // InternalA2B.g:974:1: ( ( rule__DW__Alternatives_1 ) )
            // InternalA2B.g:975:2: ( rule__DW__Alternatives_1 )
            {
             before(grammarAccess.getDWAccess().getAlternatives_1()); 
            // InternalA2B.g:976:2: ( rule__DW__Alternatives_1 )
            // InternalA2B.g:976:3: rule__DW__Alternatives_1
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


    // $ANTLR start "rule__DW__Group__2"
    // InternalA2B.g:984:1: rule__DW__Group__2 : rule__DW__Group__2__Impl ;
    public final void rule__DW__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:988:1: ( rule__DW__Group__2__Impl )
            // InternalA2B.g:989:2: rule__DW__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DW__Group__2__Impl();

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
    // $ANTLR end "rule__DW__Group__2"


    // $ANTLR start "rule__DW__Group__2__Impl"
    // InternalA2B.g:995:1: rule__DW__Group__2__Impl : ( ( rule__DW__CrcValueAssignment_2 )? ) ;
    public final void rule__DW__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:999:1: ( ( ( rule__DW__CrcValueAssignment_2 )? ) )
            // InternalA2B.g:1000:1: ( ( rule__DW__CrcValueAssignment_2 )? )
            {
            // InternalA2B.g:1000:1: ( ( rule__DW__CrcValueAssignment_2 )? )
            // InternalA2B.g:1001:2: ( rule__DW__CrcValueAssignment_2 )?
            {
             before(grammarAccess.getDWAccess().getCrcValueAssignment_2()); 
            // InternalA2B.g:1002:2: ( rule__DW__CrcValueAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_CRCCHECK) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalA2B.g:1002:3: rule__DW__CrcValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DW__CrcValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDWAccess().getCrcValueAssignment_2()); 

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
    // $ANTLR end "rule__DW__Group__2__Impl"


    // $ANTLR start "rule__DD__Group__0"
    // InternalA2B.g:1011:1: rule__DD__Group__0 : rule__DD__Group__0__Impl rule__DD__Group__1 ;
    public final void rule__DD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1015:1: ( rule__DD__Group__0__Impl rule__DD__Group__1 )
            // InternalA2B.g:1016:2: rule__DD__Group__0__Impl rule__DD__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalA2B.g:1023:1: rule__DD__Group__0__Impl : ( 'DD' ) ;
    public final void rule__DD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1027:1: ( ( 'DD' ) )
            // InternalA2B.g:1028:1: ( 'DD' )
            {
            // InternalA2B.g:1028:1: ( 'DD' )
            // InternalA2B.g:1029:2: 'DD'
            {
             before(grammarAccess.getDDAccess().getDDKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalA2B.g:1038:1: rule__DD__Group__1 : rule__DD__Group__1__Impl rule__DD__Group__2 ;
    public final void rule__DD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1042:1: ( rule__DD__Group__1__Impl rule__DD__Group__2 )
            // InternalA2B.g:1043:2: rule__DD__Group__1__Impl rule__DD__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__DD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DD__Group__2();

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
    // InternalA2B.g:1050:1: rule__DD__Group__1__Impl : ( ( rule__DD__Alternatives_1 ) ) ;
    public final void rule__DD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1054:1: ( ( ( rule__DD__Alternatives_1 ) ) )
            // InternalA2B.g:1055:1: ( ( rule__DD__Alternatives_1 ) )
            {
            // InternalA2B.g:1055:1: ( ( rule__DD__Alternatives_1 ) )
            // InternalA2B.g:1056:2: ( rule__DD__Alternatives_1 )
            {
             before(grammarAccess.getDDAccess().getAlternatives_1()); 
            // InternalA2B.g:1057:2: ( rule__DD__Alternatives_1 )
            // InternalA2B.g:1057:3: rule__DD__Alternatives_1
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


    // $ANTLR start "rule__DD__Group__2"
    // InternalA2B.g:1065:1: rule__DD__Group__2 : rule__DD__Group__2__Impl ;
    public final void rule__DD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1069:1: ( rule__DD__Group__2__Impl )
            // InternalA2B.g:1070:2: rule__DD__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DD__Group__2__Impl();

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
    // $ANTLR end "rule__DD__Group__2"


    // $ANTLR start "rule__DD__Group__2__Impl"
    // InternalA2B.g:1076:1: rule__DD__Group__2__Impl : ( ( rule__DD__CrcValueAssignment_2 )? ) ;
    public final void rule__DD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1080:1: ( ( ( rule__DD__CrcValueAssignment_2 )? ) )
            // InternalA2B.g:1081:1: ( ( rule__DD__CrcValueAssignment_2 )? )
            {
            // InternalA2B.g:1081:1: ( ( rule__DD__CrcValueAssignment_2 )? )
            // InternalA2B.g:1082:2: ( rule__DD__CrcValueAssignment_2 )?
            {
             before(grammarAccess.getDDAccess().getCrcValueAssignment_2()); 
            // InternalA2B.g:1083:2: ( rule__DD__CrcValueAssignment_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_CRCCHECK) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalA2B.g:1083:3: rule__DD__CrcValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DD__CrcValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDDAccess().getCrcValueAssignment_2()); 

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
    // $ANTLR end "rule__DD__Group__2__Impl"


    // $ANTLR start "rule__STR__Group__0"
    // InternalA2B.g:1092:1: rule__STR__Group__0 : rule__STR__Group__0__Impl rule__STR__Group__1 ;
    public final void rule__STR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1096:1: ( rule__STR__Group__0__Impl rule__STR__Group__1 )
            // InternalA2B.g:1097:2: rule__STR__Group__0__Impl rule__STR__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__STR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__STR__Group__1();

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
    // $ANTLR end "rule__STR__Group__0"


    // $ANTLR start "rule__STR__Group__0__Impl"
    // InternalA2B.g:1104:1: rule__STR__Group__0__Impl : ( 'STR' ) ;
    public final void rule__STR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1108:1: ( ( 'STR' ) )
            // InternalA2B.g:1109:1: ( 'STR' )
            {
            // InternalA2B.g:1109:1: ( 'STR' )
            // InternalA2B.g:1110:2: 'STR'
            {
             before(grammarAccess.getSTRAccess().getSTRKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSTRAccess().getSTRKeyword_0()); 

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
    // $ANTLR end "rule__STR__Group__0__Impl"


    // $ANTLR start "rule__STR__Group__1"
    // InternalA2B.g:1119:1: rule__STR__Group__1 : rule__STR__Group__1__Impl ;
    public final void rule__STR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1123:1: ( rule__STR__Group__1__Impl )
            // InternalA2B.g:1124:2: rule__STR__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__STR__Group__1__Impl();

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
    // $ANTLR end "rule__STR__Group__1"


    // $ANTLR start "rule__STR__Group__1__Impl"
    // InternalA2B.g:1130:1: rule__STR__Group__1__Impl : ( ( rule__STR__ValueAssignment_1 ) ) ;
    public final void rule__STR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1134:1: ( ( ( rule__STR__ValueAssignment_1 ) ) )
            // InternalA2B.g:1135:1: ( ( rule__STR__ValueAssignment_1 ) )
            {
            // InternalA2B.g:1135:1: ( ( rule__STR__ValueAssignment_1 ) )
            // InternalA2B.g:1136:2: ( rule__STR__ValueAssignment_1 )
            {
             before(grammarAccess.getSTRAccess().getValueAssignment_1()); 
            // InternalA2B.g:1137:2: ( rule__STR__ValueAssignment_1 )
            // InternalA2B.g:1137:3: rule__STR__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__STR__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSTRAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__STR__Group__1__Impl"


    // $ANTLR start "rule__Base64__Group__0"
    // InternalA2B.g:1146:1: rule__Base64__Group__0 : rule__Base64__Group__0__Impl rule__Base64__Group__1 ;
    public final void rule__Base64__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1150:1: ( rule__Base64__Group__0__Impl rule__Base64__Group__1 )
            // InternalA2B.g:1151:2: rule__Base64__Group__0__Impl rule__Base64__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalA2B.g:1158:1: rule__Base64__Group__0__Impl : ( 'B64' ) ;
    public final void rule__Base64__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1162:1: ( ( 'B64' ) )
            // InternalA2B.g:1163:1: ( 'B64' )
            {
            // InternalA2B.g:1163:1: ( 'B64' )
            // InternalA2B.g:1164:2: 'B64'
            {
             before(grammarAccess.getBase64Access().getB64Keyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalA2B.g:1173:1: rule__Base64__Group__1 : rule__Base64__Group__1__Impl ;
    public final void rule__Base64__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1177:1: ( rule__Base64__Group__1__Impl )
            // InternalA2B.g:1178:2: rule__Base64__Group__1__Impl
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
    // InternalA2B.g:1184:1: rule__Base64__Group__1__Impl : ( ( rule__Base64__ValueAssignment_1 ) ) ;
    public final void rule__Base64__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1188:1: ( ( ( rule__Base64__ValueAssignment_1 ) ) )
            // InternalA2B.g:1189:1: ( ( rule__Base64__ValueAssignment_1 ) )
            {
            // InternalA2B.g:1189:1: ( ( rule__Base64__ValueAssignment_1 ) )
            // InternalA2B.g:1190:2: ( rule__Base64__ValueAssignment_1 )
            {
             before(grammarAccess.getBase64Access().getValueAssignment_1()); 
            // InternalA2B.g:1191:2: ( rule__Base64__ValueAssignment_1 )
            // InternalA2B.g:1191:3: rule__Base64__ValueAssignment_1
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
    // InternalA2B.g:1200:1: rule__ORG__Group__0 : rule__ORG__Group__0__Impl rule__ORG__Group__1 ;
    public final void rule__ORG__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1204:1: ( rule__ORG__Group__0__Impl rule__ORG__Group__1 )
            // InternalA2B.g:1205:2: rule__ORG__Group__0__Impl rule__ORG__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalA2B.g:1212:1: rule__ORG__Group__0__Impl : ( 'ORG' ) ;
    public final void rule__ORG__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1216:1: ( ( 'ORG' ) )
            // InternalA2B.g:1217:1: ( 'ORG' )
            {
            // InternalA2B.g:1217:1: ( 'ORG' )
            // InternalA2B.g:1218:2: 'ORG'
            {
             before(grammarAccess.getORGAccess().getORGKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalA2B.g:1227:1: rule__ORG__Group__1 : rule__ORG__Group__1__Impl rule__ORG__Group__2 ;
    public final void rule__ORG__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1231:1: ( rule__ORG__Group__1__Impl rule__ORG__Group__2 )
            // InternalA2B.g:1232:2: rule__ORG__Group__1__Impl rule__ORG__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ORG__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ORG__Group__2();

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
    // InternalA2B.g:1239:1: rule__ORG__Group__1__Impl : ( ( rule__ORG__ValueAssignment_1 ) ) ;
    public final void rule__ORG__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1243:1: ( ( ( rule__ORG__ValueAssignment_1 ) ) )
            // InternalA2B.g:1244:1: ( ( rule__ORG__ValueAssignment_1 ) )
            {
            // InternalA2B.g:1244:1: ( ( rule__ORG__ValueAssignment_1 ) )
            // InternalA2B.g:1245:2: ( rule__ORG__ValueAssignment_1 )
            {
             before(grammarAccess.getORGAccess().getValueAssignment_1()); 
            // InternalA2B.g:1246:2: ( rule__ORG__ValueAssignment_1 )
            // InternalA2B.g:1246:3: rule__ORG__ValueAssignment_1
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


    // $ANTLR start "rule__ORG__Group__2"
    // InternalA2B.g:1254:1: rule__ORG__Group__2 : rule__ORG__Group__2__Impl ;
    public final void rule__ORG__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1258:1: ( rule__ORG__Group__2__Impl )
            // InternalA2B.g:1259:2: rule__ORG__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ORG__Group__2__Impl();

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
    // $ANTLR end "rule__ORG__Group__2"


    // $ANTLR start "rule__ORG__Group__2__Impl"
    // InternalA2B.g:1265:1: rule__ORG__Group__2__Impl : ( ( rule__ORG__CrcValueAssignment_2 )? ) ;
    public final void rule__ORG__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1269:1: ( ( ( rule__ORG__CrcValueAssignment_2 )? ) )
            // InternalA2B.g:1270:1: ( ( rule__ORG__CrcValueAssignment_2 )? )
            {
            // InternalA2B.g:1270:1: ( ( rule__ORG__CrcValueAssignment_2 )? )
            // InternalA2B.g:1271:2: ( rule__ORG__CrcValueAssignment_2 )?
            {
             before(grammarAccess.getORGAccess().getCrcValueAssignment_2()); 
            // InternalA2B.g:1272:2: ( rule__ORG__CrcValueAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_CRCCHECK) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalA2B.g:1272:3: rule__ORG__CrcValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ORG__CrcValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getORGAccess().getCrcValueAssignment_2()); 

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
    // $ANTLR end "rule__ORG__Group__2__Impl"


    // $ANTLR start "rule__INCLUDE__Group__0"
    // InternalA2B.g:1281:1: rule__INCLUDE__Group__0 : rule__INCLUDE__Group__0__Impl rule__INCLUDE__Group__1 ;
    public final void rule__INCLUDE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1285:1: ( rule__INCLUDE__Group__0__Impl rule__INCLUDE__Group__1 )
            // InternalA2B.g:1286:2: rule__INCLUDE__Group__0__Impl rule__INCLUDE__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalA2B.g:1293:1: rule__INCLUDE__Group__0__Impl : ( 'INCLUDE' ) ;
    public final void rule__INCLUDE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1297:1: ( ( 'INCLUDE' ) )
            // InternalA2B.g:1298:1: ( 'INCLUDE' )
            {
            // InternalA2B.g:1298:1: ( 'INCLUDE' )
            // InternalA2B.g:1299:2: 'INCLUDE'
            {
             before(grammarAccess.getINCLUDEAccess().getINCLUDEKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalA2B.g:1308:1: rule__INCLUDE__Group__1 : rule__INCLUDE__Group__1__Impl ;
    public final void rule__INCLUDE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1312:1: ( rule__INCLUDE__Group__1__Impl )
            // InternalA2B.g:1313:2: rule__INCLUDE__Group__1__Impl
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
    // InternalA2B.g:1319:1: rule__INCLUDE__Group__1__Impl : ( ( rule__INCLUDE__ValueAssignment_1 ) ) ;
    public final void rule__INCLUDE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1323:1: ( ( ( rule__INCLUDE__ValueAssignment_1 ) ) )
            // InternalA2B.g:1324:1: ( ( rule__INCLUDE__ValueAssignment_1 ) )
            {
            // InternalA2B.g:1324:1: ( ( rule__INCLUDE__ValueAssignment_1 ) )
            // InternalA2B.g:1325:2: ( rule__INCLUDE__ValueAssignment_1 )
            {
             before(grammarAccess.getINCLUDEAccess().getValueAssignment_1()); 
            // InternalA2B.g:1326:2: ( rule__INCLUDE__ValueAssignment_1 )
            // InternalA2B.g:1326:3: rule__INCLUDE__ValueAssignment_1
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
    // InternalA2B.g:1335:1: rule__MAC__Group__0 : rule__MAC__Group__0__Impl rule__MAC__Group__1 ;
    public final void rule__MAC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1339:1: ( rule__MAC__Group__0__Impl rule__MAC__Group__1 )
            // InternalA2B.g:1340:2: rule__MAC__Group__0__Impl rule__MAC__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalA2B.g:1347:1: rule__MAC__Group__0__Impl : ( 'MAC' ) ;
    public final void rule__MAC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1351:1: ( ( 'MAC' ) )
            // InternalA2B.g:1352:1: ( 'MAC' )
            {
            // InternalA2B.g:1352:1: ( 'MAC' )
            // InternalA2B.g:1353:2: 'MAC'
            {
             before(grammarAccess.getMACAccess().getMACKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalA2B.g:1362:1: rule__MAC__Group__1 : rule__MAC__Group__1__Impl rule__MAC__Group__2 ;
    public final void rule__MAC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1366:1: ( rule__MAC__Group__1__Impl rule__MAC__Group__2 )
            // InternalA2B.g:1367:2: rule__MAC__Group__1__Impl rule__MAC__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MAC__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MAC__Group__2();

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
    // InternalA2B.g:1374:1: rule__MAC__Group__1__Impl : ( ( rule__MAC__ValueAssignment_1 ) ) ;
    public final void rule__MAC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1378:1: ( ( ( rule__MAC__ValueAssignment_1 ) ) )
            // InternalA2B.g:1379:1: ( ( rule__MAC__ValueAssignment_1 ) )
            {
            // InternalA2B.g:1379:1: ( ( rule__MAC__ValueAssignment_1 ) )
            // InternalA2B.g:1380:2: ( rule__MAC__ValueAssignment_1 )
            {
             before(grammarAccess.getMACAccess().getValueAssignment_1()); 
            // InternalA2B.g:1381:2: ( rule__MAC__ValueAssignment_1 )
            // InternalA2B.g:1381:3: rule__MAC__ValueAssignment_1
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


    // $ANTLR start "rule__MAC__Group__2"
    // InternalA2B.g:1389:1: rule__MAC__Group__2 : rule__MAC__Group__2__Impl ;
    public final void rule__MAC__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1393:1: ( rule__MAC__Group__2__Impl )
            // InternalA2B.g:1394:2: rule__MAC__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MAC__Group__2__Impl();

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
    // $ANTLR end "rule__MAC__Group__2"


    // $ANTLR start "rule__MAC__Group__2__Impl"
    // InternalA2B.g:1400:1: rule__MAC__Group__2__Impl : ( ( rule__MAC__CrcValueAssignment_2 )? ) ;
    public final void rule__MAC__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1404:1: ( ( ( rule__MAC__CrcValueAssignment_2 )? ) )
            // InternalA2B.g:1405:1: ( ( rule__MAC__CrcValueAssignment_2 )? )
            {
            // InternalA2B.g:1405:1: ( ( rule__MAC__CrcValueAssignment_2 )? )
            // InternalA2B.g:1406:2: ( rule__MAC__CrcValueAssignment_2 )?
            {
             before(grammarAccess.getMACAccess().getCrcValueAssignment_2()); 
            // InternalA2B.g:1407:2: ( rule__MAC__CrcValueAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_CRCCHECK) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalA2B.g:1407:3: rule__MAC__CrcValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MAC__CrcValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMACAccess().getCrcValueAssignment_2()); 

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
    // $ANTLR end "rule__MAC__Group__2__Impl"


    // $ANTLR start "rule__IP__Group__0"
    // InternalA2B.g:1416:1: rule__IP__Group__0 : rule__IP__Group__0__Impl rule__IP__Group__1 ;
    public final void rule__IP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1420:1: ( rule__IP__Group__0__Impl rule__IP__Group__1 )
            // InternalA2B.g:1421:2: rule__IP__Group__0__Impl rule__IP__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalA2B.g:1428:1: rule__IP__Group__0__Impl : ( 'IP' ) ;
    public final void rule__IP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1432:1: ( ( 'IP' ) )
            // InternalA2B.g:1433:1: ( 'IP' )
            {
            // InternalA2B.g:1433:1: ( 'IP' )
            // InternalA2B.g:1434:2: 'IP'
            {
             before(grammarAccess.getIPAccess().getIPKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalA2B.g:1443:1: rule__IP__Group__1 : rule__IP__Group__1__Impl rule__IP__Group__2 ;
    public final void rule__IP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1447:1: ( rule__IP__Group__1__Impl rule__IP__Group__2 )
            // InternalA2B.g:1448:2: rule__IP__Group__1__Impl rule__IP__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__IP__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IP__Group__2();

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
    // InternalA2B.g:1455:1: rule__IP__Group__1__Impl : ( ( rule__IP__ValueAssignment_1 ) ) ;
    public final void rule__IP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1459:1: ( ( ( rule__IP__ValueAssignment_1 ) ) )
            // InternalA2B.g:1460:1: ( ( rule__IP__ValueAssignment_1 ) )
            {
            // InternalA2B.g:1460:1: ( ( rule__IP__ValueAssignment_1 ) )
            // InternalA2B.g:1461:2: ( rule__IP__ValueAssignment_1 )
            {
             before(grammarAccess.getIPAccess().getValueAssignment_1()); 
            // InternalA2B.g:1462:2: ( rule__IP__ValueAssignment_1 )
            // InternalA2B.g:1462:3: rule__IP__ValueAssignment_1
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


    // $ANTLR start "rule__IP__Group__2"
    // InternalA2B.g:1470:1: rule__IP__Group__2 : rule__IP__Group__2__Impl ;
    public final void rule__IP__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1474:1: ( rule__IP__Group__2__Impl )
            // InternalA2B.g:1475:2: rule__IP__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IP__Group__2__Impl();

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
    // $ANTLR end "rule__IP__Group__2"


    // $ANTLR start "rule__IP__Group__2__Impl"
    // InternalA2B.g:1481:1: rule__IP__Group__2__Impl : ( ( rule__IP__CrcValueAssignment_2 )? ) ;
    public final void rule__IP__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1485:1: ( ( ( rule__IP__CrcValueAssignment_2 )? ) )
            // InternalA2B.g:1486:1: ( ( rule__IP__CrcValueAssignment_2 )? )
            {
            // InternalA2B.g:1486:1: ( ( rule__IP__CrcValueAssignment_2 )? )
            // InternalA2B.g:1487:2: ( rule__IP__CrcValueAssignment_2 )?
            {
             before(grammarAccess.getIPAccess().getCrcValueAssignment_2()); 
            // InternalA2B.g:1488:2: ( rule__IP__CrcValueAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_CRCCHECK) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalA2B.g:1488:3: rule__IP__CrcValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__IP__CrcValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIPAccess().getCrcValueAssignment_2()); 

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
    // $ANTLR end "rule__IP__Group__2__Impl"


    // $ANTLR start "rule__HXS__Group__0"
    // InternalA2B.g:1497:1: rule__HXS__Group__0 : rule__HXS__Group__0__Impl rule__HXS__Group__1 ;
    public final void rule__HXS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1501:1: ( rule__HXS__Group__0__Impl rule__HXS__Group__1 )
            // InternalA2B.g:1502:2: rule__HXS__Group__0__Impl rule__HXS__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalA2B.g:1509:1: rule__HXS__Group__0__Impl : ( 'HXS' ) ;
    public final void rule__HXS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1513:1: ( ( 'HXS' ) )
            // InternalA2B.g:1514:1: ( 'HXS' )
            {
            // InternalA2B.g:1514:1: ( 'HXS' )
            // InternalA2B.g:1515:2: 'HXS'
            {
             before(grammarAccess.getHXSAccess().getHXSKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalA2B.g:1524:1: rule__HXS__Group__1 : rule__HXS__Group__1__Impl rule__HXS__Group__2 ;
    public final void rule__HXS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1528:1: ( rule__HXS__Group__1__Impl rule__HXS__Group__2 )
            // InternalA2B.g:1529:2: rule__HXS__Group__1__Impl rule__HXS__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__HXS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HXS__Group__2();

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
    // InternalA2B.g:1536:1: rule__HXS__Group__1__Impl : ( ( rule__HXS__ValueAssignment_1 ) ) ;
    public final void rule__HXS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1540:1: ( ( ( rule__HXS__ValueAssignment_1 ) ) )
            // InternalA2B.g:1541:1: ( ( rule__HXS__ValueAssignment_1 ) )
            {
            // InternalA2B.g:1541:1: ( ( rule__HXS__ValueAssignment_1 ) )
            // InternalA2B.g:1542:2: ( rule__HXS__ValueAssignment_1 )
            {
             before(grammarAccess.getHXSAccess().getValueAssignment_1()); 
            // InternalA2B.g:1543:2: ( rule__HXS__ValueAssignment_1 )
            // InternalA2B.g:1543:3: rule__HXS__ValueAssignment_1
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


    // $ANTLR start "rule__HXS__Group__2"
    // InternalA2B.g:1551:1: rule__HXS__Group__2 : rule__HXS__Group__2__Impl ;
    public final void rule__HXS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1555:1: ( rule__HXS__Group__2__Impl )
            // InternalA2B.g:1556:2: rule__HXS__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HXS__Group__2__Impl();

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
    // $ANTLR end "rule__HXS__Group__2"


    // $ANTLR start "rule__HXS__Group__2__Impl"
    // InternalA2B.g:1562:1: rule__HXS__Group__2__Impl : ( ( rule__HXS__CrcValueAssignment_2 )? ) ;
    public final void rule__HXS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1566:1: ( ( ( rule__HXS__CrcValueAssignment_2 )? ) )
            // InternalA2B.g:1567:1: ( ( rule__HXS__CrcValueAssignment_2 )? )
            {
            // InternalA2B.g:1567:1: ( ( rule__HXS__CrcValueAssignment_2 )? )
            // InternalA2B.g:1568:2: ( rule__HXS__CrcValueAssignment_2 )?
            {
             before(grammarAccess.getHXSAccess().getCrcValueAssignment_2()); 
            // InternalA2B.g:1569:2: ( rule__HXS__CrcValueAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_CRCCHECK) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalA2B.g:1569:3: rule__HXS__CrcValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__HXS__CrcValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHXSAccess().getCrcValueAssignment_2()); 

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
    // $ANTLR end "rule__HXS__Group__2__Impl"


    // $ANTLR start "rule__Model__ElementAssignment"
    // InternalA2B.g:1578:1: rule__Model__ElementAssignment : ( ruleInstruction ) ;
    public final void rule__Model__ElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1582:1: ( ( ruleInstruction ) )
            // InternalA2B.g:1583:2: ( ruleInstruction )
            {
            // InternalA2B.g:1583:2: ( ruleInstruction )
            // InternalA2B.g:1584:3: ruleInstruction
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
    // InternalA2B.g:1593:1: rule__DB__StringValueAssignment_1_0 : ( RULE_BYTE ) ;
    public final void rule__DB__StringValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1597:1: ( ( RULE_BYTE ) )
            // InternalA2B.g:1598:2: ( RULE_BYTE )
            {
            // InternalA2B.g:1598:2: ( RULE_BYTE )
            // InternalA2B.g:1599:3: RULE_BYTE
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
    // InternalA2B.g:1608:1: rule__DB__IntValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__DB__IntValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1612:1: ( ( RULE_INT ) )
            // InternalA2B.g:1613:2: ( RULE_INT )
            {
            // InternalA2B.g:1613:2: ( RULE_INT )
            // InternalA2B.g:1614:3: RULE_INT
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


    // $ANTLR start "rule__DB__CrcValueAssignment_2"
    // InternalA2B.g:1623:1: rule__DB__CrcValueAssignment_2 : ( RULE_CRCCHECK ) ;
    public final void rule__DB__CrcValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1627:1: ( ( RULE_CRCCHECK ) )
            // InternalA2B.g:1628:2: ( RULE_CRCCHECK )
            {
            // InternalA2B.g:1628:2: ( RULE_CRCCHECK )
            // InternalA2B.g:1629:3: RULE_CRCCHECK
            {
             before(grammarAccess.getDBAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0()); 
            match(input,RULE_CRCCHECK,FOLLOW_2); 
             after(grammarAccess.getDBAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__DB__CrcValueAssignment_2"


    // $ANTLR start "rule__DW__StringValueAssignment_1_0"
    // InternalA2B.g:1638:1: rule__DW__StringValueAssignment_1_0 : ( RULE_WORD ) ;
    public final void rule__DW__StringValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1642:1: ( ( RULE_WORD ) )
            // InternalA2B.g:1643:2: ( RULE_WORD )
            {
            // InternalA2B.g:1643:2: ( RULE_WORD )
            // InternalA2B.g:1644:3: RULE_WORD
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
    // InternalA2B.g:1653:1: rule__DW__IntValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__DW__IntValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1657:1: ( ( RULE_INT ) )
            // InternalA2B.g:1658:2: ( RULE_INT )
            {
            // InternalA2B.g:1658:2: ( RULE_INT )
            // InternalA2B.g:1659:3: RULE_INT
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


    // $ANTLR start "rule__DW__CrcValueAssignment_2"
    // InternalA2B.g:1668:1: rule__DW__CrcValueAssignment_2 : ( RULE_CRCCHECK ) ;
    public final void rule__DW__CrcValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1672:1: ( ( RULE_CRCCHECK ) )
            // InternalA2B.g:1673:2: ( RULE_CRCCHECK )
            {
            // InternalA2B.g:1673:2: ( RULE_CRCCHECK )
            // InternalA2B.g:1674:3: RULE_CRCCHECK
            {
             before(grammarAccess.getDWAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0()); 
            match(input,RULE_CRCCHECK,FOLLOW_2); 
             after(grammarAccess.getDWAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__DW__CrcValueAssignment_2"


    // $ANTLR start "rule__DD__StringValueAssignment_1_0"
    // InternalA2B.g:1683:1: rule__DD__StringValueAssignment_1_0 : ( RULE_DOUBLEWORD ) ;
    public final void rule__DD__StringValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1687:1: ( ( RULE_DOUBLEWORD ) )
            // InternalA2B.g:1688:2: ( RULE_DOUBLEWORD )
            {
            // InternalA2B.g:1688:2: ( RULE_DOUBLEWORD )
            // InternalA2B.g:1689:3: RULE_DOUBLEWORD
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
    // InternalA2B.g:1698:1: rule__DD__LongValueAssignment_1_1 : ( ruleLONG ) ;
    public final void rule__DD__LongValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1702:1: ( ( ruleLONG ) )
            // InternalA2B.g:1703:2: ( ruleLONG )
            {
            // InternalA2B.g:1703:2: ( ruleLONG )
            // InternalA2B.g:1704:3: ruleLONG
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


    // $ANTLR start "rule__DD__CrcValueAssignment_2"
    // InternalA2B.g:1713:1: rule__DD__CrcValueAssignment_2 : ( RULE_CRCCHECK ) ;
    public final void rule__DD__CrcValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1717:1: ( ( RULE_CRCCHECK ) )
            // InternalA2B.g:1718:2: ( RULE_CRCCHECK )
            {
            // InternalA2B.g:1718:2: ( RULE_CRCCHECK )
            // InternalA2B.g:1719:3: RULE_CRCCHECK
            {
             before(grammarAccess.getDDAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0()); 
            match(input,RULE_CRCCHECK,FOLLOW_2); 
             after(grammarAccess.getDDAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__DD__CrcValueAssignment_2"


    // $ANTLR start "rule__STR__ValueAssignment_1"
    // InternalA2B.g:1728:1: rule__STR__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__STR__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1732:1: ( ( RULE_STRING ) )
            // InternalA2B.g:1733:2: ( RULE_STRING )
            {
            // InternalA2B.g:1733:2: ( RULE_STRING )
            // InternalA2B.g:1734:3: RULE_STRING
            {
             before(grammarAccess.getSTRAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSTRAccess().getValueSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__STR__ValueAssignment_1"


    // $ANTLR start "rule__Base64__ValueAssignment_1"
    // InternalA2B.g:1743:1: rule__Base64__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Base64__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1747:1: ( ( RULE_STRING ) )
            // InternalA2B.g:1748:2: ( RULE_STRING )
            {
            // InternalA2B.g:1748:2: ( RULE_STRING )
            // InternalA2B.g:1749:3: RULE_STRING
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
    // InternalA2B.g:1758:1: rule__ORG__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__ORG__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1762:1: ( ( RULE_INT ) )
            // InternalA2B.g:1763:2: ( RULE_INT )
            {
            // InternalA2B.g:1763:2: ( RULE_INT )
            // InternalA2B.g:1764:3: RULE_INT
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


    // $ANTLR start "rule__ORG__CrcValueAssignment_2"
    // InternalA2B.g:1773:1: rule__ORG__CrcValueAssignment_2 : ( RULE_CRCCHECK ) ;
    public final void rule__ORG__CrcValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1777:1: ( ( RULE_CRCCHECK ) )
            // InternalA2B.g:1778:2: ( RULE_CRCCHECK )
            {
            // InternalA2B.g:1778:2: ( RULE_CRCCHECK )
            // InternalA2B.g:1779:3: RULE_CRCCHECK
            {
             before(grammarAccess.getORGAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0()); 
            match(input,RULE_CRCCHECK,FOLLOW_2); 
             after(grammarAccess.getORGAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ORG__CrcValueAssignment_2"


    // $ANTLR start "rule__INCLUDE__ValueAssignment_1"
    // InternalA2B.g:1788:1: rule__INCLUDE__ValueAssignment_1 : ( RULE_PATH ) ;
    public final void rule__INCLUDE__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1792:1: ( ( RULE_PATH ) )
            // InternalA2B.g:1793:2: ( RULE_PATH )
            {
            // InternalA2B.g:1793:2: ( RULE_PATH )
            // InternalA2B.g:1794:3: RULE_PATH
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
    // InternalA2B.g:1803:1: rule__MAC__ValueAssignment_1 : ( RULE_MACADDRESS ) ;
    public final void rule__MAC__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1807:1: ( ( RULE_MACADDRESS ) )
            // InternalA2B.g:1808:2: ( RULE_MACADDRESS )
            {
            // InternalA2B.g:1808:2: ( RULE_MACADDRESS )
            // InternalA2B.g:1809:3: RULE_MACADDRESS
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


    // $ANTLR start "rule__MAC__CrcValueAssignment_2"
    // InternalA2B.g:1818:1: rule__MAC__CrcValueAssignment_2 : ( RULE_CRCCHECK ) ;
    public final void rule__MAC__CrcValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1822:1: ( ( RULE_CRCCHECK ) )
            // InternalA2B.g:1823:2: ( RULE_CRCCHECK )
            {
            // InternalA2B.g:1823:2: ( RULE_CRCCHECK )
            // InternalA2B.g:1824:3: RULE_CRCCHECK
            {
             before(grammarAccess.getMACAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0()); 
            match(input,RULE_CRCCHECK,FOLLOW_2); 
             after(grammarAccess.getMACAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__MAC__CrcValueAssignment_2"


    // $ANTLR start "rule__IP__ValueAssignment_1"
    // InternalA2B.g:1833:1: rule__IP__ValueAssignment_1 : ( RULE_IPADDRESS ) ;
    public final void rule__IP__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1837:1: ( ( RULE_IPADDRESS ) )
            // InternalA2B.g:1838:2: ( RULE_IPADDRESS )
            {
            // InternalA2B.g:1838:2: ( RULE_IPADDRESS )
            // InternalA2B.g:1839:3: RULE_IPADDRESS
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


    // $ANTLR start "rule__IP__CrcValueAssignment_2"
    // InternalA2B.g:1848:1: rule__IP__CrcValueAssignment_2 : ( RULE_CRCCHECK ) ;
    public final void rule__IP__CrcValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1852:1: ( ( RULE_CRCCHECK ) )
            // InternalA2B.g:1853:2: ( RULE_CRCCHECK )
            {
            // InternalA2B.g:1853:2: ( RULE_CRCCHECK )
            // InternalA2B.g:1854:3: RULE_CRCCHECK
            {
             before(grammarAccess.getIPAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0()); 
            match(input,RULE_CRCCHECK,FOLLOW_2); 
             after(grammarAccess.getIPAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__IP__CrcValueAssignment_2"


    // $ANTLR start "rule__HXS__ValueAssignment_1"
    // InternalA2B.g:1863:1: rule__HXS__ValueAssignment_1 : ( RULE_HEXSTRING ) ;
    public final void rule__HXS__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1867:1: ( ( RULE_HEXSTRING ) )
            // InternalA2B.g:1868:2: ( RULE_HEXSTRING )
            {
            // InternalA2B.g:1868:2: ( RULE_HEXSTRING )
            // InternalA2B.g:1869:3: RULE_HEXSTRING
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


    // $ANTLR start "rule__HXS__CrcValueAssignment_2"
    // InternalA2B.g:1878:1: rule__HXS__CrcValueAssignment_2 : ( RULE_CRCCHECK ) ;
    public final void rule__HXS__CrcValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:1882:1: ( ( RULE_CRCCHECK ) )
            // InternalA2B.g:1883:2: ( RULE_CRCCHECK )
            {
            // InternalA2B.g:1883:2: ( RULE_CRCCHECK )
            // InternalA2B.g:1884:3: RULE_CRCCHECK
            {
             before(grammarAccess.getHXSAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0()); 
            match(input,RULE_CRCCHECK,FOLLOW_2); 
             after(grammarAccess.getHXSAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__HXS__CrcValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000FFFC00002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000FFFC00000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});

}