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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BYTE", "RULE_STRING", "RULE_INT", "RULE_PATH", "RULE_MACADDRESS", "RULE_IPADDRESS", "RULE_HEXSTRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BE'", "'LE'", "'DB'", "'B64'", "'ORG'", "'INCLUDE'", "'MAC'", "'IP'", "'HXS'"
    };
    public static final int RULE_BYTE=4;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_HEXSTRING=10;
    public static final int RULE_ID=11;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_PATH=7;
    public static final int RULE_MACADDRESS=8;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_IPADDRESS=9;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
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

                if ( ((LA1_0>=16 && LA1_0<=24)) ) {
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


    // $ANTLR start "entryRuleBase64"
    // InternalA2B.g:128:1: entryRuleBase64 : ruleBase64 EOF ;
    public final void entryRuleBase64() throws RecognitionException {
        try {
            // InternalA2B.g:129:1: ( ruleBase64 EOF )
            // InternalA2B.g:130:1: ruleBase64 EOF
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
    // InternalA2B.g:137:1: ruleBase64 : ( ( rule__Base64__Group__0 ) ) ;
    public final void ruleBase64() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:141:2: ( ( ( rule__Base64__Group__0 ) ) )
            // InternalA2B.g:142:2: ( ( rule__Base64__Group__0 ) )
            {
            // InternalA2B.g:142:2: ( ( rule__Base64__Group__0 ) )
            // InternalA2B.g:143:3: ( rule__Base64__Group__0 )
            {
             before(grammarAccess.getBase64Access().getGroup()); 
            // InternalA2B.g:144:3: ( rule__Base64__Group__0 )
            // InternalA2B.g:144:4: rule__Base64__Group__0
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
    // InternalA2B.g:153:1: entryRuleORG : ruleORG EOF ;
    public final void entryRuleORG() throws RecognitionException {
        try {
            // InternalA2B.g:154:1: ( ruleORG EOF )
            // InternalA2B.g:155:1: ruleORG EOF
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
    // InternalA2B.g:162:1: ruleORG : ( ( rule__ORG__Group__0 ) ) ;
    public final void ruleORG() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:166:2: ( ( ( rule__ORG__Group__0 ) ) )
            // InternalA2B.g:167:2: ( ( rule__ORG__Group__0 ) )
            {
            // InternalA2B.g:167:2: ( ( rule__ORG__Group__0 ) )
            // InternalA2B.g:168:3: ( rule__ORG__Group__0 )
            {
             before(grammarAccess.getORGAccess().getGroup()); 
            // InternalA2B.g:169:3: ( rule__ORG__Group__0 )
            // InternalA2B.g:169:4: rule__ORG__Group__0
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
    // InternalA2B.g:178:1: entryRuleINCLUDE : ruleINCLUDE EOF ;
    public final void entryRuleINCLUDE() throws RecognitionException {
        try {
            // InternalA2B.g:179:1: ( ruleINCLUDE EOF )
            // InternalA2B.g:180:1: ruleINCLUDE EOF
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
    // InternalA2B.g:187:1: ruleINCLUDE : ( ( rule__INCLUDE__Group__0 ) ) ;
    public final void ruleINCLUDE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:191:2: ( ( ( rule__INCLUDE__Group__0 ) ) )
            // InternalA2B.g:192:2: ( ( rule__INCLUDE__Group__0 ) )
            {
            // InternalA2B.g:192:2: ( ( rule__INCLUDE__Group__0 ) )
            // InternalA2B.g:193:3: ( rule__INCLUDE__Group__0 )
            {
             before(grammarAccess.getINCLUDEAccess().getGroup()); 
            // InternalA2B.g:194:3: ( rule__INCLUDE__Group__0 )
            // InternalA2B.g:194:4: rule__INCLUDE__Group__0
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
    // InternalA2B.g:203:1: entryRuleMAC : ruleMAC EOF ;
    public final void entryRuleMAC() throws RecognitionException {
        try {
            // InternalA2B.g:204:1: ( ruleMAC EOF )
            // InternalA2B.g:205:1: ruleMAC EOF
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
    // InternalA2B.g:212:1: ruleMAC : ( ( rule__MAC__Group__0 ) ) ;
    public final void ruleMAC() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:216:2: ( ( ( rule__MAC__Group__0 ) ) )
            // InternalA2B.g:217:2: ( ( rule__MAC__Group__0 ) )
            {
            // InternalA2B.g:217:2: ( ( rule__MAC__Group__0 ) )
            // InternalA2B.g:218:3: ( rule__MAC__Group__0 )
            {
             before(grammarAccess.getMACAccess().getGroup()); 
            // InternalA2B.g:219:3: ( rule__MAC__Group__0 )
            // InternalA2B.g:219:4: rule__MAC__Group__0
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
    // InternalA2B.g:228:1: entryRuleIP : ruleIP EOF ;
    public final void entryRuleIP() throws RecognitionException {
        try {
            // InternalA2B.g:229:1: ( ruleIP EOF )
            // InternalA2B.g:230:1: ruleIP EOF
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
    // InternalA2B.g:237:1: ruleIP : ( ( rule__IP__Group__0 ) ) ;
    public final void ruleIP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:241:2: ( ( ( rule__IP__Group__0 ) ) )
            // InternalA2B.g:242:2: ( ( rule__IP__Group__0 ) )
            {
            // InternalA2B.g:242:2: ( ( rule__IP__Group__0 ) )
            // InternalA2B.g:243:3: ( rule__IP__Group__0 )
            {
             before(grammarAccess.getIPAccess().getGroup()); 
            // InternalA2B.g:244:3: ( rule__IP__Group__0 )
            // InternalA2B.g:244:4: rule__IP__Group__0
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
    // InternalA2B.g:253:1: entryRuleHXS : ruleHXS EOF ;
    public final void entryRuleHXS() throws RecognitionException {
        try {
            // InternalA2B.g:254:1: ( ruleHXS EOF )
            // InternalA2B.g:255:1: ruleHXS EOF
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
    // InternalA2B.g:262:1: ruleHXS : ( ( rule__HXS__Group__0 ) ) ;
    public final void ruleHXS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:266:2: ( ( ( rule__HXS__Group__0 ) ) )
            // InternalA2B.g:267:2: ( ( rule__HXS__Group__0 ) )
            {
            // InternalA2B.g:267:2: ( ( rule__HXS__Group__0 ) )
            // InternalA2B.g:268:3: ( rule__HXS__Group__0 )
            {
             before(grammarAccess.getHXSAccess().getGroup()); 
            // InternalA2B.g:269:3: ( rule__HXS__Group__0 )
            // InternalA2B.g:269:4: rule__HXS__Group__0
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
    // InternalA2B.g:278:1: entryRuleBE : ruleBE EOF ;
    public final void entryRuleBE() throws RecognitionException {
        try {
            // InternalA2B.g:279:1: ( ruleBE EOF )
            // InternalA2B.g:280:1: ruleBE EOF
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
    // InternalA2B.g:287:1: ruleBE : ( 'BE' ) ;
    public final void ruleBE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:291:2: ( ( 'BE' ) )
            // InternalA2B.g:292:2: ( 'BE' )
            {
            // InternalA2B.g:292:2: ( 'BE' )
            // InternalA2B.g:293:3: 'BE'
            {
             before(grammarAccess.getBEAccess().getBEKeyword()); 
            match(input,16,FOLLOW_2); 
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
    // InternalA2B.g:303:1: entryRuleLE : ruleLE EOF ;
    public final void entryRuleLE() throws RecognitionException {
        try {
            // InternalA2B.g:304:1: ( ruleLE EOF )
            // InternalA2B.g:305:1: ruleLE EOF
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
    // InternalA2B.g:312:1: ruleLE : ( 'LE' ) ;
    public final void ruleLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:316:2: ( ( 'LE' ) )
            // InternalA2B.g:317:2: ( 'LE' )
            {
            // InternalA2B.g:317:2: ( 'LE' )
            // InternalA2B.g:318:3: 'LE'
            {
             before(grammarAccess.getLEAccess().getLEKeyword()); 
            match(input,17,FOLLOW_2); 
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


    // $ANTLR start "rule__Instruction__Alternatives"
    // InternalA2B.g:327:1: rule__Instruction__Alternatives : ( ( ruleDB ) | ( ruleBase64 ) | ( ruleORG ) | ( ruleINCLUDE ) | ( ruleMAC ) | ( ruleIP ) | ( ruleHXS ) | ( ( rule__Instruction__Group_7__0 ) ) | ( ( rule__Instruction__Group_8__0 ) ) );
    public final void rule__Instruction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:331:1: ( ( ruleDB ) | ( ruleBase64 ) | ( ruleORG ) | ( ruleINCLUDE ) | ( ruleMAC ) | ( ruleIP ) | ( ruleHXS ) | ( ( rule__Instruction__Group_7__0 ) ) | ( ( rule__Instruction__Group_8__0 ) ) )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 21:
                {
                alt2=4;
                }
                break;
            case 22:
                {
                alt2=5;
                }
                break;
            case 23:
                {
                alt2=6;
                }
                break;
            case 24:
                {
                alt2=7;
                }
                break;
            case 16:
                {
                alt2=8;
                }
                break;
            case 17:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalA2B.g:332:2: ( ruleDB )
                    {
                    // InternalA2B.g:332:2: ( ruleDB )
                    // InternalA2B.g:333:3: ruleDB
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
                    // InternalA2B.g:338:2: ( ruleBase64 )
                    {
                    // InternalA2B.g:338:2: ( ruleBase64 )
                    // InternalA2B.g:339:3: ruleBase64
                    {
                     before(grammarAccess.getInstructionAccess().getBase64ParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBase64();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getBase64ParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalA2B.g:344:2: ( ruleORG )
                    {
                    // InternalA2B.g:344:2: ( ruleORG )
                    // InternalA2B.g:345:3: ruleORG
                    {
                     before(grammarAccess.getInstructionAccess().getORGParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleORG();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getORGParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalA2B.g:350:2: ( ruleINCLUDE )
                    {
                    // InternalA2B.g:350:2: ( ruleINCLUDE )
                    // InternalA2B.g:351:3: ruleINCLUDE
                    {
                     before(grammarAccess.getInstructionAccess().getINCLUDEParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleINCLUDE();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getINCLUDEParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalA2B.g:356:2: ( ruleMAC )
                    {
                    // InternalA2B.g:356:2: ( ruleMAC )
                    // InternalA2B.g:357:3: ruleMAC
                    {
                     before(grammarAccess.getInstructionAccess().getMACParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMAC();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getMACParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalA2B.g:362:2: ( ruleIP )
                    {
                    // InternalA2B.g:362:2: ( ruleIP )
                    // InternalA2B.g:363:3: ruleIP
                    {
                     before(grammarAccess.getInstructionAccess().getIPParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleIP();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getIPParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalA2B.g:368:2: ( ruleHXS )
                    {
                    // InternalA2B.g:368:2: ( ruleHXS )
                    // InternalA2B.g:369:3: ruleHXS
                    {
                     before(grammarAccess.getInstructionAccess().getHXSParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleHXS();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getHXSParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalA2B.g:374:2: ( ( rule__Instruction__Group_7__0 ) )
                    {
                    // InternalA2B.g:374:2: ( ( rule__Instruction__Group_7__0 ) )
                    // InternalA2B.g:375:3: ( rule__Instruction__Group_7__0 )
                    {
                     before(grammarAccess.getInstructionAccess().getGroup_7()); 
                    // InternalA2B.g:376:3: ( rule__Instruction__Group_7__0 )
                    // InternalA2B.g:376:4: rule__Instruction__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instruction__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalA2B.g:380:2: ( ( rule__Instruction__Group_8__0 ) )
                    {
                    // InternalA2B.g:380:2: ( ( rule__Instruction__Group_8__0 ) )
                    // InternalA2B.g:381:3: ( rule__Instruction__Group_8__0 )
                    {
                     before(grammarAccess.getInstructionAccess().getGroup_8()); 
                    // InternalA2B.g:382:3: ( rule__Instruction__Group_8__0 )
                    // InternalA2B.g:382:4: rule__Instruction__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instruction__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstructionAccess().getGroup_8()); 

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


    // $ANTLR start "rule__Instruction__Group_7__0"
    // InternalA2B.g:390:1: rule__Instruction__Group_7__0 : rule__Instruction__Group_7__0__Impl rule__Instruction__Group_7__1 ;
    public final void rule__Instruction__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:394:1: ( rule__Instruction__Group_7__0__Impl rule__Instruction__Group_7__1 )
            // InternalA2B.g:395:2: rule__Instruction__Group_7__0__Impl rule__Instruction__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Instruction__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruction__Group_7__1();

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
    // $ANTLR end "rule__Instruction__Group_7__0"


    // $ANTLR start "rule__Instruction__Group_7__0__Impl"
    // InternalA2B.g:402:1: rule__Instruction__Group_7__0__Impl : ( () ) ;
    public final void rule__Instruction__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:406:1: ( ( () ) )
            // InternalA2B.g:407:1: ( () )
            {
            // InternalA2B.g:407:1: ( () )
            // InternalA2B.g:408:2: ()
            {
             before(grammarAccess.getInstructionAccess().getBEAction_7_0()); 
            // InternalA2B.g:409:2: ()
            // InternalA2B.g:409:3: 
            {
            }

             after(grammarAccess.getInstructionAccess().getBEAction_7_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_7__0__Impl"


    // $ANTLR start "rule__Instruction__Group_7__1"
    // InternalA2B.g:417:1: rule__Instruction__Group_7__1 : rule__Instruction__Group_7__1__Impl ;
    public final void rule__Instruction__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:421:1: ( rule__Instruction__Group_7__1__Impl )
            // InternalA2B.g:422:2: rule__Instruction__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Group_7__1__Impl();

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
    // $ANTLR end "rule__Instruction__Group_7__1"


    // $ANTLR start "rule__Instruction__Group_7__1__Impl"
    // InternalA2B.g:428:1: rule__Instruction__Group_7__1__Impl : ( ruleBE ) ;
    public final void rule__Instruction__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:432:1: ( ( ruleBE ) )
            // InternalA2B.g:433:1: ( ruleBE )
            {
            // InternalA2B.g:433:1: ( ruleBE )
            // InternalA2B.g:434:2: ruleBE
            {
             before(grammarAccess.getInstructionAccess().getBEParserRuleCall_7_1()); 
            pushFollow(FOLLOW_2);
            ruleBE();

            state._fsp--;

             after(grammarAccess.getInstructionAccess().getBEParserRuleCall_7_1()); 

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
    // $ANTLR end "rule__Instruction__Group_7__1__Impl"


    // $ANTLR start "rule__Instruction__Group_8__0"
    // InternalA2B.g:444:1: rule__Instruction__Group_8__0 : rule__Instruction__Group_8__0__Impl rule__Instruction__Group_8__1 ;
    public final void rule__Instruction__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:448:1: ( rule__Instruction__Group_8__0__Impl rule__Instruction__Group_8__1 )
            // InternalA2B.g:449:2: rule__Instruction__Group_8__0__Impl rule__Instruction__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__Instruction__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruction__Group_8__1();

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
    // $ANTLR end "rule__Instruction__Group_8__0"


    // $ANTLR start "rule__Instruction__Group_8__0__Impl"
    // InternalA2B.g:456:1: rule__Instruction__Group_8__0__Impl : ( () ) ;
    public final void rule__Instruction__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:460:1: ( ( () ) )
            // InternalA2B.g:461:1: ( () )
            {
            // InternalA2B.g:461:1: ( () )
            // InternalA2B.g:462:2: ()
            {
             before(grammarAccess.getInstructionAccess().getLEAction_8_0()); 
            // InternalA2B.g:463:2: ()
            // InternalA2B.g:463:3: 
            {
            }

             after(grammarAccess.getInstructionAccess().getLEAction_8_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group_8__0__Impl"


    // $ANTLR start "rule__Instruction__Group_8__1"
    // InternalA2B.g:471:1: rule__Instruction__Group_8__1 : rule__Instruction__Group_8__1__Impl ;
    public final void rule__Instruction__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:475:1: ( rule__Instruction__Group_8__1__Impl )
            // InternalA2B.g:476:2: rule__Instruction__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Group_8__1__Impl();

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
    // $ANTLR end "rule__Instruction__Group_8__1"


    // $ANTLR start "rule__Instruction__Group_8__1__Impl"
    // InternalA2B.g:482:1: rule__Instruction__Group_8__1__Impl : ( ruleLE ) ;
    public final void rule__Instruction__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:486:1: ( ( ruleLE ) )
            // InternalA2B.g:487:1: ( ruleLE )
            {
            // InternalA2B.g:487:1: ( ruleLE )
            // InternalA2B.g:488:2: ruleLE
            {
             before(grammarAccess.getInstructionAccess().getLEParserRuleCall_8_1()); 
            pushFollow(FOLLOW_2);
            ruleLE();

            state._fsp--;

             after(grammarAccess.getInstructionAccess().getLEParserRuleCall_8_1()); 

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
    // $ANTLR end "rule__Instruction__Group_8__1__Impl"


    // $ANTLR start "rule__DB__Group__0"
    // InternalA2B.g:498:1: rule__DB__Group__0 : rule__DB__Group__0__Impl rule__DB__Group__1 ;
    public final void rule__DB__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:502:1: ( rule__DB__Group__0__Impl rule__DB__Group__1 )
            // InternalA2B.g:503:2: rule__DB__Group__0__Impl rule__DB__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalA2B.g:510:1: rule__DB__Group__0__Impl : ( 'DB' ) ;
    public final void rule__DB__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:514:1: ( ( 'DB' ) )
            // InternalA2B.g:515:1: ( 'DB' )
            {
            // InternalA2B.g:515:1: ( 'DB' )
            // InternalA2B.g:516:2: 'DB'
            {
             before(grammarAccess.getDBAccess().getDBKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalA2B.g:525:1: rule__DB__Group__1 : rule__DB__Group__1__Impl ;
    public final void rule__DB__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:529:1: ( rule__DB__Group__1__Impl )
            // InternalA2B.g:530:2: rule__DB__Group__1__Impl
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
    // InternalA2B.g:536:1: rule__DB__Group__1__Impl : ( ( rule__DB__ValueAssignment_1 ) ) ;
    public final void rule__DB__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:540:1: ( ( ( rule__DB__ValueAssignment_1 ) ) )
            // InternalA2B.g:541:1: ( ( rule__DB__ValueAssignment_1 ) )
            {
            // InternalA2B.g:541:1: ( ( rule__DB__ValueAssignment_1 ) )
            // InternalA2B.g:542:2: ( rule__DB__ValueAssignment_1 )
            {
             before(grammarAccess.getDBAccess().getValueAssignment_1()); 
            // InternalA2B.g:543:2: ( rule__DB__ValueAssignment_1 )
            // InternalA2B.g:543:3: rule__DB__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DB__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDBAccess().getValueAssignment_1()); 

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


    // $ANTLR start "rule__Base64__Group__0"
    // InternalA2B.g:552:1: rule__Base64__Group__0 : rule__Base64__Group__0__Impl rule__Base64__Group__1 ;
    public final void rule__Base64__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:556:1: ( rule__Base64__Group__0__Impl rule__Base64__Group__1 )
            // InternalA2B.g:557:2: rule__Base64__Group__0__Impl rule__Base64__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalA2B.g:564:1: rule__Base64__Group__0__Impl : ( 'B64' ) ;
    public final void rule__Base64__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:568:1: ( ( 'B64' ) )
            // InternalA2B.g:569:1: ( 'B64' )
            {
            // InternalA2B.g:569:1: ( 'B64' )
            // InternalA2B.g:570:2: 'B64'
            {
             before(grammarAccess.getBase64Access().getB64Keyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalA2B.g:579:1: rule__Base64__Group__1 : rule__Base64__Group__1__Impl ;
    public final void rule__Base64__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:583:1: ( rule__Base64__Group__1__Impl )
            // InternalA2B.g:584:2: rule__Base64__Group__1__Impl
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
    // InternalA2B.g:590:1: rule__Base64__Group__1__Impl : ( ( rule__Base64__ValueAssignment_1 ) ) ;
    public final void rule__Base64__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:594:1: ( ( ( rule__Base64__ValueAssignment_1 ) ) )
            // InternalA2B.g:595:1: ( ( rule__Base64__ValueAssignment_1 ) )
            {
            // InternalA2B.g:595:1: ( ( rule__Base64__ValueAssignment_1 ) )
            // InternalA2B.g:596:2: ( rule__Base64__ValueAssignment_1 )
            {
             before(grammarAccess.getBase64Access().getValueAssignment_1()); 
            // InternalA2B.g:597:2: ( rule__Base64__ValueAssignment_1 )
            // InternalA2B.g:597:3: rule__Base64__ValueAssignment_1
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
    // InternalA2B.g:606:1: rule__ORG__Group__0 : rule__ORG__Group__0__Impl rule__ORG__Group__1 ;
    public final void rule__ORG__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:610:1: ( rule__ORG__Group__0__Impl rule__ORG__Group__1 )
            // InternalA2B.g:611:2: rule__ORG__Group__0__Impl rule__ORG__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalA2B.g:618:1: rule__ORG__Group__0__Impl : ( 'ORG' ) ;
    public final void rule__ORG__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:622:1: ( ( 'ORG' ) )
            // InternalA2B.g:623:1: ( 'ORG' )
            {
            // InternalA2B.g:623:1: ( 'ORG' )
            // InternalA2B.g:624:2: 'ORG'
            {
             before(grammarAccess.getORGAccess().getORGKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalA2B.g:633:1: rule__ORG__Group__1 : rule__ORG__Group__1__Impl ;
    public final void rule__ORG__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:637:1: ( rule__ORG__Group__1__Impl )
            // InternalA2B.g:638:2: rule__ORG__Group__1__Impl
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
    // InternalA2B.g:644:1: rule__ORG__Group__1__Impl : ( ( rule__ORG__ValueAssignment_1 ) ) ;
    public final void rule__ORG__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:648:1: ( ( ( rule__ORG__ValueAssignment_1 ) ) )
            // InternalA2B.g:649:1: ( ( rule__ORG__ValueAssignment_1 ) )
            {
            // InternalA2B.g:649:1: ( ( rule__ORG__ValueAssignment_1 ) )
            // InternalA2B.g:650:2: ( rule__ORG__ValueAssignment_1 )
            {
             before(grammarAccess.getORGAccess().getValueAssignment_1()); 
            // InternalA2B.g:651:2: ( rule__ORG__ValueAssignment_1 )
            // InternalA2B.g:651:3: rule__ORG__ValueAssignment_1
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
    // InternalA2B.g:660:1: rule__INCLUDE__Group__0 : rule__INCLUDE__Group__0__Impl rule__INCLUDE__Group__1 ;
    public final void rule__INCLUDE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:664:1: ( rule__INCLUDE__Group__0__Impl rule__INCLUDE__Group__1 )
            // InternalA2B.g:665:2: rule__INCLUDE__Group__0__Impl rule__INCLUDE__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalA2B.g:672:1: rule__INCLUDE__Group__0__Impl : ( 'INCLUDE' ) ;
    public final void rule__INCLUDE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:676:1: ( ( 'INCLUDE' ) )
            // InternalA2B.g:677:1: ( 'INCLUDE' )
            {
            // InternalA2B.g:677:1: ( 'INCLUDE' )
            // InternalA2B.g:678:2: 'INCLUDE'
            {
             before(grammarAccess.getINCLUDEAccess().getINCLUDEKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalA2B.g:687:1: rule__INCLUDE__Group__1 : rule__INCLUDE__Group__1__Impl ;
    public final void rule__INCLUDE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:691:1: ( rule__INCLUDE__Group__1__Impl )
            // InternalA2B.g:692:2: rule__INCLUDE__Group__1__Impl
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
    // InternalA2B.g:698:1: rule__INCLUDE__Group__1__Impl : ( ( rule__INCLUDE__ValueAssignment_1 ) ) ;
    public final void rule__INCLUDE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:702:1: ( ( ( rule__INCLUDE__ValueAssignment_1 ) ) )
            // InternalA2B.g:703:1: ( ( rule__INCLUDE__ValueAssignment_1 ) )
            {
            // InternalA2B.g:703:1: ( ( rule__INCLUDE__ValueAssignment_1 ) )
            // InternalA2B.g:704:2: ( rule__INCLUDE__ValueAssignment_1 )
            {
             before(grammarAccess.getINCLUDEAccess().getValueAssignment_1()); 
            // InternalA2B.g:705:2: ( rule__INCLUDE__ValueAssignment_1 )
            // InternalA2B.g:705:3: rule__INCLUDE__ValueAssignment_1
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
    // InternalA2B.g:714:1: rule__MAC__Group__0 : rule__MAC__Group__0__Impl rule__MAC__Group__1 ;
    public final void rule__MAC__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:718:1: ( rule__MAC__Group__0__Impl rule__MAC__Group__1 )
            // InternalA2B.g:719:2: rule__MAC__Group__0__Impl rule__MAC__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalA2B.g:726:1: rule__MAC__Group__0__Impl : ( 'MAC' ) ;
    public final void rule__MAC__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:730:1: ( ( 'MAC' ) )
            // InternalA2B.g:731:1: ( 'MAC' )
            {
            // InternalA2B.g:731:1: ( 'MAC' )
            // InternalA2B.g:732:2: 'MAC'
            {
             before(grammarAccess.getMACAccess().getMACKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalA2B.g:741:1: rule__MAC__Group__1 : rule__MAC__Group__1__Impl ;
    public final void rule__MAC__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:745:1: ( rule__MAC__Group__1__Impl )
            // InternalA2B.g:746:2: rule__MAC__Group__1__Impl
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
    // InternalA2B.g:752:1: rule__MAC__Group__1__Impl : ( ( rule__MAC__ValueAssignment_1 ) ) ;
    public final void rule__MAC__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:756:1: ( ( ( rule__MAC__ValueAssignment_1 ) ) )
            // InternalA2B.g:757:1: ( ( rule__MAC__ValueAssignment_1 ) )
            {
            // InternalA2B.g:757:1: ( ( rule__MAC__ValueAssignment_1 ) )
            // InternalA2B.g:758:2: ( rule__MAC__ValueAssignment_1 )
            {
             before(grammarAccess.getMACAccess().getValueAssignment_1()); 
            // InternalA2B.g:759:2: ( rule__MAC__ValueAssignment_1 )
            // InternalA2B.g:759:3: rule__MAC__ValueAssignment_1
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
    // InternalA2B.g:768:1: rule__IP__Group__0 : rule__IP__Group__0__Impl rule__IP__Group__1 ;
    public final void rule__IP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:772:1: ( rule__IP__Group__0__Impl rule__IP__Group__1 )
            // InternalA2B.g:773:2: rule__IP__Group__0__Impl rule__IP__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalA2B.g:780:1: rule__IP__Group__0__Impl : ( 'IP' ) ;
    public final void rule__IP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:784:1: ( ( 'IP' ) )
            // InternalA2B.g:785:1: ( 'IP' )
            {
            // InternalA2B.g:785:1: ( 'IP' )
            // InternalA2B.g:786:2: 'IP'
            {
             before(grammarAccess.getIPAccess().getIPKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalA2B.g:795:1: rule__IP__Group__1 : rule__IP__Group__1__Impl ;
    public final void rule__IP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:799:1: ( rule__IP__Group__1__Impl )
            // InternalA2B.g:800:2: rule__IP__Group__1__Impl
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
    // InternalA2B.g:806:1: rule__IP__Group__1__Impl : ( ( rule__IP__ValueAssignment_1 ) ) ;
    public final void rule__IP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:810:1: ( ( ( rule__IP__ValueAssignment_1 ) ) )
            // InternalA2B.g:811:1: ( ( rule__IP__ValueAssignment_1 ) )
            {
            // InternalA2B.g:811:1: ( ( rule__IP__ValueAssignment_1 ) )
            // InternalA2B.g:812:2: ( rule__IP__ValueAssignment_1 )
            {
             before(grammarAccess.getIPAccess().getValueAssignment_1()); 
            // InternalA2B.g:813:2: ( rule__IP__ValueAssignment_1 )
            // InternalA2B.g:813:3: rule__IP__ValueAssignment_1
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
    // InternalA2B.g:822:1: rule__HXS__Group__0 : rule__HXS__Group__0__Impl rule__HXS__Group__1 ;
    public final void rule__HXS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:826:1: ( rule__HXS__Group__0__Impl rule__HXS__Group__1 )
            // InternalA2B.g:827:2: rule__HXS__Group__0__Impl rule__HXS__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalA2B.g:834:1: rule__HXS__Group__0__Impl : ( 'HXS' ) ;
    public final void rule__HXS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:838:1: ( ( 'HXS' ) )
            // InternalA2B.g:839:1: ( 'HXS' )
            {
            // InternalA2B.g:839:1: ( 'HXS' )
            // InternalA2B.g:840:2: 'HXS'
            {
             before(grammarAccess.getHXSAccess().getHXSKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalA2B.g:849:1: rule__HXS__Group__1 : rule__HXS__Group__1__Impl ;
    public final void rule__HXS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:853:1: ( rule__HXS__Group__1__Impl )
            // InternalA2B.g:854:2: rule__HXS__Group__1__Impl
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
    // InternalA2B.g:860:1: rule__HXS__Group__1__Impl : ( ( rule__HXS__ValueAssignment_1 ) ) ;
    public final void rule__HXS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:864:1: ( ( ( rule__HXS__ValueAssignment_1 ) ) )
            // InternalA2B.g:865:1: ( ( rule__HXS__ValueAssignment_1 ) )
            {
            // InternalA2B.g:865:1: ( ( rule__HXS__ValueAssignment_1 ) )
            // InternalA2B.g:866:2: ( rule__HXS__ValueAssignment_1 )
            {
             before(grammarAccess.getHXSAccess().getValueAssignment_1()); 
            // InternalA2B.g:867:2: ( rule__HXS__ValueAssignment_1 )
            // InternalA2B.g:867:3: rule__HXS__ValueAssignment_1
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
    // InternalA2B.g:876:1: rule__Model__ElementAssignment : ( ruleInstruction ) ;
    public final void rule__Model__ElementAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:880:1: ( ( ruleInstruction ) )
            // InternalA2B.g:881:2: ( ruleInstruction )
            {
            // InternalA2B.g:881:2: ( ruleInstruction )
            // InternalA2B.g:882:3: ruleInstruction
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


    // $ANTLR start "rule__DB__ValueAssignment_1"
    // InternalA2B.g:891:1: rule__DB__ValueAssignment_1 : ( RULE_BYTE ) ;
    public final void rule__DB__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:895:1: ( ( RULE_BYTE ) )
            // InternalA2B.g:896:2: ( RULE_BYTE )
            {
            // InternalA2B.g:896:2: ( RULE_BYTE )
            // InternalA2B.g:897:3: RULE_BYTE
            {
             before(grammarAccess.getDBAccess().getValueBYTETerminalRuleCall_1_0()); 
            match(input,RULE_BYTE,FOLLOW_2); 
             after(grammarAccess.getDBAccess().getValueBYTETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DB__ValueAssignment_1"


    // $ANTLR start "rule__Base64__ValueAssignment_1"
    // InternalA2B.g:906:1: rule__Base64__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Base64__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:910:1: ( ( RULE_STRING ) )
            // InternalA2B.g:911:2: ( RULE_STRING )
            {
            // InternalA2B.g:911:2: ( RULE_STRING )
            // InternalA2B.g:912:3: RULE_STRING
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
    // InternalA2B.g:921:1: rule__ORG__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__ORG__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:925:1: ( ( RULE_INT ) )
            // InternalA2B.g:926:2: ( RULE_INT )
            {
            // InternalA2B.g:926:2: ( RULE_INT )
            // InternalA2B.g:927:3: RULE_INT
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
    // InternalA2B.g:936:1: rule__INCLUDE__ValueAssignment_1 : ( RULE_PATH ) ;
    public final void rule__INCLUDE__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:940:1: ( ( RULE_PATH ) )
            // InternalA2B.g:941:2: ( RULE_PATH )
            {
            // InternalA2B.g:941:2: ( RULE_PATH )
            // InternalA2B.g:942:3: RULE_PATH
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
    // InternalA2B.g:951:1: rule__MAC__ValueAssignment_1 : ( RULE_MACADDRESS ) ;
    public final void rule__MAC__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:955:1: ( ( RULE_MACADDRESS ) )
            // InternalA2B.g:956:2: ( RULE_MACADDRESS )
            {
            // InternalA2B.g:956:2: ( RULE_MACADDRESS )
            // InternalA2B.g:957:3: RULE_MACADDRESS
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
    // InternalA2B.g:966:1: rule__IP__ValueAssignment_1 : ( RULE_IPADDRESS ) ;
    public final void rule__IP__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:970:1: ( ( RULE_IPADDRESS ) )
            // InternalA2B.g:971:2: ( RULE_IPADDRESS )
            {
            // InternalA2B.g:971:2: ( RULE_IPADDRESS )
            // InternalA2B.g:972:3: RULE_IPADDRESS
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
    // InternalA2B.g:981:1: rule__HXS__ValueAssignment_1 : ( RULE_HEXSTRING ) ;
    public final void rule__HXS__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalA2B.g:985:1: ( ( RULE_HEXSTRING ) )
            // InternalA2B.g:986:2: ( RULE_HEXSTRING )
            {
            // InternalA2B.g:986:2: ( RULE_HEXSTRING )
            // InternalA2B.g:987:3: RULE_HEXSTRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001FF0002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001FF0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000400L});

}