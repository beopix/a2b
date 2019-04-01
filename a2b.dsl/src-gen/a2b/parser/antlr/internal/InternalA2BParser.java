package a2b.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import a2b.services.A2BGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalA2BParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BYTE", "RULE_STRING", "RULE_INT", "RULE_PATH", "RULE_MACADDRESS", "RULE_IPADDRESS", "RULE_HEXSTRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DB'", "'B64'", "'ORG'", "'INCLUDE'", "'MAC'", "'IP'", "'HXS'", "'BE'", "'LE'", "'PCAP'"
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
    public static final int T__25=25;
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

        public InternalA2BParser(TokenStream input, A2BGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected A2BGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalA2B.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalA2B.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalA2B.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalA2B.g:71:1: ruleModel returns [EObject current=null] : ( (lv_element_0_0= ruleInstruction ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_element_0_0 = null;



        	enterRule();

        try {
            // InternalA2B.g:77:2: ( ( (lv_element_0_0= ruleInstruction ) )* )
            // InternalA2B.g:78:2: ( (lv_element_0_0= ruleInstruction ) )*
            {
            // InternalA2B.g:78:2: ( (lv_element_0_0= ruleInstruction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=16 && LA1_0<=25)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalA2B.g:79:3: (lv_element_0_0= ruleInstruction )
            	    {
            	    // InternalA2B.g:79:3: (lv_element_0_0= ruleInstruction )
            	    // InternalA2B.g:80:4: lv_element_0_0= ruleInstruction
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementInstructionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_element_0_0=ruleInstruction();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"element",
            	    					lv_element_0_0,
            	    					"a2b.A2B.Instruction");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleInstruction"
    // InternalA2B.g:100:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalA2B.g:100:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalA2B.g:101:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalA2B.g:107:1: ruleInstruction returns [EObject current=null] : (this_DB_0= ruleDB | this_Base64_1= ruleBase64 | this_ORG_2= ruleORG | this_INCLUDE_3= ruleINCLUDE | this_MAC_4= ruleMAC | this_IP_5= ruleIP | this_HXS_6= ruleHXS | ( () ruleBE ) | ( () ruleLE ) | ( () rulePCAP ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_DB_0 = null;

        EObject this_Base64_1 = null;

        EObject this_ORG_2 = null;

        EObject this_INCLUDE_3 = null;

        EObject this_MAC_4 = null;

        EObject this_IP_5 = null;

        EObject this_HXS_6 = null;



        	enterRule();

        try {
            // InternalA2B.g:113:2: ( (this_DB_0= ruleDB | this_Base64_1= ruleBase64 | this_ORG_2= ruleORG | this_INCLUDE_3= ruleINCLUDE | this_MAC_4= ruleMAC | this_IP_5= ruleIP | this_HXS_6= ruleHXS | ( () ruleBE ) | ( () ruleLE ) | ( () rulePCAP ) ) )
            // InternalA2B.g:114:2: (this_DB_0= ruleDB | this_Base64_1= ruleBase64 | this_ORG_2= ruleORG | this_INCLUDE_3= ruleINCLUDE | this_MAC_4= ruleMAC | this_IP_5= ruleIP | this_HXS_6= ruleHXS | ( () ruleBE ) | ( () ruleLE ) | ( () rulePCAP ) )
            {
            // InternalA2B.g:114:2: (this_DB_0= ruleDB | this_Base64_1= ruleBase64 | this_ORG_2= ruleORG | this_INCLUDE_3= ruleINCLUDE | this_MAC_4= ruleMAC | this_IP_5= ruleIP | this_HXS_6= ruleHXS | ( () ruleBE ) | ( () ruleLE ) | ( () rulePCAP ) )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            case 21:
                {
                alt2=6;
                }
                break;
            case 22:
                {
                alt2=7;
                }
                break;
            case 23:
                {
                alt2=8;
                }
                break;
            case 24:
                {
                alt2=9;
                }
                break;
            case 25:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalA2B.g:115:3: this_DB_0= ruleDB
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getDBParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DB_0=ruleDB();

                    state._fsp--;


                    			current = this_DB_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalA2B.g:124:3: this_Base64_1= ruleBase64
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getBase64ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Base64_1=ruleBase64();

                    state._fsp--;


                    			current = this_Base64_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalA2B.g:133:3: this_ORG_2= ruleORG
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getORGParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ORG_2=ruleORG();

                    state._fsp--;


                    			current = this_ORG_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalA2B.g:142:3: this_INCLUDE_3= ruleINCLUDE
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getINCLUDEParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_INCLUDE_3=ruleINCLUDE();

                    state._fsp--;


                    			current = this_INCLUDE_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalA2B.g:151:3: this_MAC_4= ruleMAC
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getMACParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MAC_4=ruleMAC();

                    state._fsp--;


                    			current = this_MAC_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalA2B.g:160:3: this_IP_5= ruleIP
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getIPParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_IP_5=ruleIP();

                    state._fsp--;


                    			current = this_IP_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalA2B.g:169:3: this_HXS_6= ruleHXS
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getHXSParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_HXS_6=ruleHXS();

                    state._fsp--;


                    			current = this_HXS_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalA2B.g:178:3: ( () ruleBE )
                    {
                    // InternalA2B.g:178:3: ( () ruleBE )
                    // InternalA2B.g:179:4: () ruleBE
                    {
                    // InternalA2B.g:179:4: ()
                    // InternalA2B.g:180:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInstructionAccess().getBEAction_7_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getInstructionAccess().getBEParserRuleCall_7_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleBE();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalA2B.g:195:3: ( () ruleLE )
                    {
                    // InternalA2B.g:195:3: ( () ruleLE )
                    // InternalA2B.g:196:4: () ruleLE
                    {
                    // InternalA2B.g:196:4: ()
                    // InternalA2B.g:197:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInstructionAccess().getLEAction_8_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getInstructionAccess().getLEParserRuleCall_8_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleLE();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalA2B.g:212:3: ( () rulePCAP )
                    {
                    // InternalA2B.g:212:3: ( () rulePCAP )
                    // InternalA2B.g:213:4: () rulePCAP
                    {
                    // InternalA2B.g:213:4: ()
                    // InternalA2B.g:214:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInstructionAccess().getPCAPAction_9_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getInstructionAccess().getPCAPParserRuleCall_9_1());
                    			
                    pushFollow(FOLLOW_2);
                    rulePCAP();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleDB"
    // InternalA2B.g:232:1: entryRuleDB returns [EObject current=null] : iv_ruleDB= ruleDB EOF ;
    public final EObject entryRuleDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDB = null;


        try {
            // InternalA2B.g:232:43: (iv_ruleDB= ruleDB EOF )
            // InternalA2B.g:233:2: iv_ruleDB= ruleDB EOF
            {
             newCompositeNode(grammarAccess.getDBRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDB=ruleDB();

            state._fsp--;

             current =iv_ruleDB; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDB"


    // $ANTLR start "ruleDB"
    // InternalA2B.g:239:1: ruleDB returns [EObject current=null] : (otherlv_0= 'DB' ( (lv_value_1_0= RULE_BYTE ) ) ) ;
    public final EObject ruleDB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalA2B.g:245:2: ( (otherlv_0= 'DB' ( (lv_value_1_0= RULE_BYTE ) ) ) )
            // InternalA2B.g:246:2: (otherlv_0= 'DB' ( (lv_value_1_0= RULE_BYTE ) ) )
            {
            // InternalA2B.g:246:2: (otherlv_0= 'DB' ( (lv_value_1_0= RULE_BYTE ) ) )
            // InternalA2B.g:247:3: otherlv_0= 'DB' ( (lv_value_1_0= RULE_BYTE ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDBAccess().getDBKeyword_0());
            		
            // InternalA2B.g:251:3: ( (lv_value_1_0= RULE_BYTE ) )
            // InternalA2B.g:252:4: (lv_value_1_0= RULE_BYTE )
            {
            // InternalA2B.g:252:4: (lv_value_1_0= RULE_BYTE )
            // InternalA2B.g:253:5: lv_value_1_0= RULE_BYTE
            {
            lv_value_1_0=(Token)match(input,RULE_BYTE,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getDBAccess().getValueBYTETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDBRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"a2b.A2B.BYTE");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDB"


    // $ANTLR start "entryRuleBase64"
    // InternalA2B.g:273:1: entryRuleBase64 returns [EObject current=null] : iv_ruleBase64= ruleBase64 EOF ;
    public final EObject entryRuleBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBase64 = null;


        try {
            // InternalA2B.g:273:47: (iv_ruleBase64= ruleBase64 EOF )
            // InternalA2B.g:274:2: iv_ruleBase64= ruleBase64 EOF
            {
             newCompositeNode(grammarAccess.getBase64Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBase64=ruleBase64();

            state._fsp--;

             current =iv_ruleBase64; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBase64"


    // $ANTLR start "ruleBase64"
    // InternalA2B.g:280:1: ruleBase64 returns [EObject current=null] : (otherlv_0= 'B64' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleBase64() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalA2B.g:286:2: ( (otherlv_0= 'B64' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalA2B.g:287:2: (otherlv_0= 'B64' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalA2B.g:287:2: (otherlv_0= 'B64' ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalA2B.g:288:3: otherlv_0= 'B64' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBase64Access().getB64Keyword_0());
            		
            // InternalA2B.g:292:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalA2B.g:293:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalA2B.g:293:4: (lv_value_1_0= RULE_STRING )
            // InternalA2B.g:294:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getBase64Access().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBase64Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBase64"


    // $ANTLR start "entryRuleORG"
    // InternalA2B.g:314:1: entryRuleORG returns [EObject current=null] : iv_ruleORG= ruleORG EOF ;
    public final EObject entryRuleORG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORG = null;


        try {
            // InternalA2B.g:314:44: (iv_ruleORG= ruleORG EOF )
            // InternalA2B.g:315:2: iv_ruleORG= ruleORG EOF
            {
             newCompositeNode(grammarAccess.getORGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleORG=ruleORG();

            state._fsp--;

             current =iv_ruleORG; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleORG"


    // $ANTLR start "ruleORG"
    // InternalA2B.g:321:1: ruleORG returns [EObject current=null] : (otherlv_0= 'ORG' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleORG() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalA2B.g:327:2: ( (otherlv_0= 'ORG' ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalA2B.g:328:2: (otherlv_0= 'ORG' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalA2B.g:328:2: (otherlv_0= 'ORG' ( (lv_value_1_0= RULE_INT ) ) )
            // InternalA2B.g:329:3: otherlv_0= 'ORG' ( (lv_value_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getORGAccess().getORGKeyword_0());
            		
            // InternalA2B.g:333:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalA2B.g:334:4: (lv_value_1_0= RULE_INT )
            {
            // InternalA2B.g:334:4: (lv_value_1_0= RULE_INT )
            // InternalA2B.g:335:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getORGAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getORGRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleORG"


    // $ANTLR start "entryRuleINCLUDE"
    // InternalA2B.g:355:1: entryRuleINCLUDE returns [EObject current=null] : iv_ruleINCLUDE= ruleINCLUDE EOF ;
    public final EObject entryRuleINCLUDE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINCLUDE = null;


        try {
            // InternalA2B.g:355:48: (iv_ruleINCLUDE= ruleINCLUDE EOF )
            // InternalA2B.g:356:2: iv_ruleINCLUDE= ruleINCLUDE EOF
            {
             newCompositeNode(grammarAccess.getINCLUDERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINCLUDE=ruleINCLUDE();

            state._fsp--;

             current =iv_ruleINCLUDE; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINCLUDE"


    // $ANTLR start "ruleINCLUDE"
    // InternalA2B.g:362:1: ruleINCLUDE returns [EObject current=null] : (otherlv_0= 'INCLUDE' ( (lv_value_1_0= RULE_PATH ) ) ) ;
    public final EObject ruleINCLUDE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalA2B.g:368:2: ( (otherlv_0= 'INCLUDE' ( (lv_value_1_0= RULE_PATH ) ) ) )
            // InternalA2B.g:369:2: (otherlv_0= 'INCLUDE' ( (lv_value_1_0= RULE_PATH ) ) )
            {
            // InternalA2B.g:369:2: (otherlv_0= 'INCLUDE' ( (lv_value_1_0= RULE_PATH ) ) )
            // InternalA2B.g:370:3: otherlv_0= 'INCLUDE' ( (lv_value_1_0= RULE_PATH ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getINCLUDEAccess().getINCLUDEKeyword_0());
            		
            // InternalA2B.g:374:3: ( (lv_value_1_0= RULE_PATH ) )
            // InternalA2B.g:375:4: (lv_value_1_0= RULE_PATH )
            {
            // InternalA2B.g:375:4: (lv_value_1_0= RULE_PATH )
            // InternalA2B.g:376:5: lv_value_1_0= RULE_PATH
            {
            lv_value_1_0=(Token)match(input,RULE_PATH,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getINCLUDEAccess().getValuePATHTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getINCLUDERule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"a2b.A2B.PATH");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINCLUDE"


    // $ANTLR start "entryRuleMAC"
    // InternalA2B.g:396:1: entryRuleMAC returns [EObject current=null] : iv_ruleMAC= ruleMAC EOF ;
    public final EObject entryRuleMAC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMAC = null;


        try {
            // InternalA2B.g:396:44: (iv_ruleMAC= ruleMAC EOF )
            // InternalA2B.g:397:2: iv_ruleMAC= ruleMAC EOF
            {
             newCompositeNode(grammarAccess.getMACRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMAC=ruleMAC();

            state._fsp--;

             current =iv_ruleMAC; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMAC"


    // $ANTLR start "ruleMAC"
    // InternalA2B.g:403:1: ruleMAC returns [EObject current=null] : (otherlv_0= 'MAC' ( (lv_value_1_0= RULE_MACADDRESS ) ) ) ;
    public final EObject ruleMAC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalA2B.g:409:2: ( (otherlv_0= 'MAC' ( (lv_value_1_0= RULE_MACADDRESS ) ) ) )
            // InternalA2B.g:410:2: (otherlv_0= 'MAC' ( (lv_value_1_0= RULE_MACADDRESS ) ) )
            {
            // InternalA2B.g:410:2: (otherlv_0= 'MAC' ( (lv_value_1_0= RULE_MACADDRESS ) ) )
            // InternalA2B.g:411:3: otherlv_0= 'MAC' ( (lv_value_1_0= RULE_MACADDRESS ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMACAccess().getMACKeyword_0());
            		
            // InternalA2B.g:415:3: ( (lv_value_1_0= RULE_MACADDRESS ) )
            // InternalA2B.g:416:4: (lv_value_1_0= RULE_MACADDRESS )
            {
            // InternalA2B.g:416:4: (lv_value_1_0= RULE_MACADDRESS )
            // InternalA2B.g:417:5: lv_value_1_0= RULE_MACADDRESS
            {
            lv_value_1_0=(Token)match(input,RULE_MACADDRESS,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getMACAccess().getValueMACADDRESSTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMACRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"a2b.A2B.MACADDRESS");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMAC"


    // $ANTLR start "entryRuleIP"
    // InternalA2B.g:437:1: entryRuleIP returns [EObject current=null] : iv_ruleIP= ruleIP EOF ;
    public final EObject entryRuleIP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIP = null;


        try {
            // InternalA2B.g:437:43: (iv_ruleIP= ruleIP EOF )
            // InternalA2B.g:438:2: iv_ruleIP= ruleIP EOF
            {
             newCompositeNode(grammarAccess.getIPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIP=ruleIP();

            state._fsp--;

             current =iv_ruleIP; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIP"


    // $ANTLR start "ruleIP"
    // InternalA2B.g:444:1: ruleIP returns [EObject current=null] : (otherlv_0= 'IP' ( (lv_value_1_0= RULE_IPADDRESS ) ) ) ;
    public final EObject ruleIP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalA2B.g:450:2: ( (otherlv_0= 'IP' ( (lv_value_1_0= RULE_IPADDRESS ) ) ) )
            // InternalA2B.g:451:2: (otherlv_0= 'IP' ( (lv_value_1_0= RULE_IPADDRESS ) ) )
            {
            // InternalA2B.g:451:2: (otherlv_0= 'IP' ( (lv_value_1_0= RULE_IPADDRESS ) ) )
            // InternalA2B.g:452:3: otherlv_0= 'IP' ( (lv_value_1_0= RULE_IPADDRESS ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getIPAccess().getIPKeyword_0());
            		
            // InternalA2B.g:456:3: ( (lv_value_1_0= RULE_IPADDRESS ) )
            // InternalA2B.g:457:4: (lv_value_1_0= RULE_IPADDRESS )
            {
            // InternalA2B.g:457:4: (lv_value_1_0= RULE_IPADDRESS )
            // InternalA2B.g:458:5: lv_value_1_0= RULE_IPADDRESS
            {
            lv_value_1_0=(Token)match(input,RULE_IPADDRESS,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getIPAccess().getValueIPADDRESSTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIPRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"a2b.A2B.IPADDRESS");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIP"


    // $ANTLR start "entryRuleHXS"
    // InternalA2B.g:478:1: entryRuleHXS returns [EObject current=null] : iv_ruleHXS= ruleHXS EOF ;
    public final EObject entryRuleHXS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHXS = null;


        try {
            // InternalA2B.g:478:44: (iv_ruleHXS= ruleHXS EOF )
            // InternalA2B.g:479:2: iv_ruleHXS= ruleHXS EOF
            {
             newCompositeNode(grammarAccess.getHXSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHXS=ruleHXS();

            state._fsp--;

             current =iv_ruleHXS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHXS"


    // $ANTLR start "ruleHXS"
    // InternalA2B.g:485:1: ruleHXS returns [EObject current=null] : (otherlv_0= 'HXS' ( (lv_value_1_0= RULE_HEXSTRING ) ) ) ;
    public final EObject ruleHXS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalA2B.g:491:2: ( (otherlv_0= 'HXS' ( (lv_value_1_0= RULE_HEXSTRING ) ) ) )
            // InternalA2B.g:492:2: (otherlv_0= 'HXS' ( (lv_value_1_0= RULE_HEXSTRING ) ) )
            {
            // InternalA2B.g:492:2: (otherlv_0= 'HXS' ( (lv_value_1_0= RULE_HEXSTRING ) ) )
            // InternalA2B.g:493:3: otherlv_0= 'HXS' ( (lv_value_1_0= RULE_HEXSTRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getHXSAccess().getHXSKeyword_0());
            		
            // InternalA2B.g:497:3: ( (lv_value_1_0= RULE_HEXSTRING ) )
            // InternalA2B.g:498:4: (lv_value_1_0= RULE_HEXSTRING )
            {
            // InternalA2B.g:498:4: (lv_value_1_0= RULE_HEXSTRING )
            // InternalA2B.g:499:5: lv_value_1_0= RULE_HEXSTRING
            {
            lv_value_1_0=(Token)match(input,RULE_HEXSTRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getHXSAccess().getValueHEXSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHXSRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"a2b.A2B.HEXSTRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHXS"


    // $ANTLR start "entryRuleBE"
    // InternalA2B.g:519:1: entryRuleBE returns [String current=null] : iv_ruleBE= ruleBE EOF ;
    public final String entryRuleBE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBE = null;


        try {
            // InternalA2B.g:519:42: (iv_ruleBE= ruleBE EOF )
            // InternalA2B.g:520:2: iv_ruleBE= ruleBE EOF
            {
             newCompositeNode(grammarAccess.getBERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBE=ruleBE();

            state._fsp--;

             current =iv_ruleBE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBE"


    // $ANTLR start "ruleBE"
    // InternalA2B.g:526:1: ruleBE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'BE' ;
    public final AntlrDatatypeRuleToken ruleBE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalA2B.g:532:2: (kw= 'BE' )
            // InternalA2B.g:533:2: kw= 'BE'
            {
            kw=(Token)match(input,23,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getBEAccess().getBEKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBE"


    // $ANTLR start "entryRuleLE"
    // InternalA2B.g:541:1: entryRuleLE returns [String current=null] : iv_ruleLE= ruleLE EOF ;
    public final String entryRuleLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLE = null;


        try {
            // InternalA2B.g:541:42: (iv_ruleLE= ruleLE EOF )
            // InternalA2B.g:542:2: iv_ruleLE= ruleLE EOF
            {
             newCompositeNode(grammarAccess.getLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLE=ruleLE();

            state._fsp--;

             current =iv_ruleLE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLE"


    // $ANTLR start "ruleLE"
    // InternalA2B.g:548:1: ruleLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'LE' ;
    public final AntlrDatatypeRuleToken ruleLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalA2B.g:554:2: (kw= 'LE' )
            // InternalA2B.g:555:2: kw= 'LE'
            {
            kw=(Token)match(input,24,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getLEAccess().getLEKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLE"


    // $ANTLR start "entryRulePCAP"
    // InternalA2B.g:563:1: entryRulePCAP returns [String current=null] : iv_rulePCAP= rulePCAP EOF ;
    public final String entryRulePCAP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePCAP = null;


        try {
            // InternalA2B.g:563:44: (iv_rulePCAP= rulePCAP EOF )
            // InternalA2B.g:564:2: iv_rulePCAP= rulePCAP EOF
            {
             newCompositeNode(grammarAccess.getPCAPRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePCAP=rulePCAP();

            state._fsp--;

             current =iv_rulePCAP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePCAP"


    // $ANTLR start "rulePCAP"
    // InternalA2B.g:570:1: rulePCAP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'PCAP' ;
    public final AntlrDatatypeRuleToken rulePCAP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalA2B.g:576:2: (kw= 'PCAP' )
            // InternalA2B.g:577:2: kw= 'PCAP'
            {
            kw=(Token)match(input,25,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPCAPAccess().getPCAPKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePCAP"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003FF0002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000400L});

}