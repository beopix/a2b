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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BYTE", "RULE_INT", "RULE_CRCCHECK", "RULE_WORD", "RULE_DOUBLEWORD", "RULE_STRING", "RULE_PATH", "RULE_MACADDRESS", "RULE_IPADDRESS", "RULE_HEXSTRING", "RULE_DECIMALBYTE_", "RULE_BINARY_", "RULE_HEX_", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DB'", "'DW'", "'DD'", "'STR'", "'B64d'", "'B64e'", "'ORG'", "'INCLUDE'", "'MAC'", "'IP'", "'HXS'", "'BE'", "'LE'", "'PCAP'", "'CRC'"
    };
    public static final int RULE_HEX_=16;
    public static final int RULE_WORD=7;
    public static final int RULE_BINARY_=15;
    public static final int RULE_DOUBLEWORD=8;
    public static final int RULE_CRCCHECK=6;
    public static final int RULE_BYTE=4;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=19;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
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
    public static final int RULE_INT=5;
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

                if ( ((LA1_0>=22 && LA1_0<=36)) ) {
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
    // InternalA2B.g:107:1: ruleInstruction returns [EObject current=null] : (this_DB_0= ruleDB | this_DW_1= ruleDW | this_DD_2= ruleDD | this_STR_3= ruleSTR | this_Base64Decode_4= ruleBase64Decode | this_Base64Encode_5= ruleBase64Encode | this_ORG_6= ruleORG | this_INCLUDE_7= ruleINCLUDE | this_MAC_8= ruleMAC | this_IP_9= ruleIP | this_HXS_10= ruleHXS | ( () ruleBE ) | ( () ruleLE ) | ( () rulePCAP ) | ( () ruleCRC ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_DB_0 = null;

        EObject this_DW_1 = null;

        EObject this_DD_2 = null;

        EObject this_STR_3 = null;

        EObject this_Base64Decode_4 = null;

        EObject this_Base64Encode_5 = null;

        EObject this_ORG_6 = null;

        EObject this_INCLUDE_7 = null;

        EObject this_MAC_8 = null;

        EObject this_IP_9 = null;

        EObject this_HXS_10 = null;



        	enterRule();

        try {
            // InternalA2B.g:113:2: ( (this_DB_0= ruleDB | this_DW_1= ruleDW | this_DD_2= ruleDD | this_STR_3= ruleSTR | this_Base64Decode_4= ruleBase64Decode | this_Base64Encode_5= ruleBase64Encode | this_ORG_6= ruleORG | this_INCLUDE_7= ruleINCLUDE | this_MAC_8= ruleMAC | this_IP_9= ruleIP | this_HXS_10= ruleHXS | ( () ruleBE ) | ( () ruleLE ) | ( () rulePCAP ) | ( () ruleCRC ) ) )
            // InternalA2B.g:114:2: (this_DB_0= ruleDB | this_DW_1= ruleDW | this_DD_2= ruleDD | this_STR_3= ruleSTR | this_Base64Decode_4= ruleBase64Decode | this_Base64Encode_5= ruleBase64Encode | this_ORG_6= ruleORG | this_INCLUDE_7= ruleINCLUDE | this_MAC_8= ruleMAC | this_IP_9= ruleIP | this_HXS_10= ruleHXS | ( () ruleBE ) | ( () ruleLE ) | ( () rulePCAP ) | ( () ruleCRC ) )
            {
            // InternalA2B.g:114:2: (this_DB_0= ruleDB | this_DW_1= ruleDW | this_DD_2= ruleDD | this_STR_3= ruleSTR | this_Base64Decode_4= ruleBase64Decode | this_Base64Encode_5= ruleBase64Encode | this_ORG_6= ruleORG | this_INCLUDE_7= ruleINCLUDE | this_MAC_8= ruleMAC | this_IP_9= ruleIP | this_HXS_10= ruleHXS | ( () ruleBE ) | ( () ruleLE ) | ( () rulePCAP ) | ( () ruleCRC ) )
            int alt2=15;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            case 26:
                {
                alt2=5;
                }
                break;
            case 27:
                {
                alt2=6;
                }
                break;
            case 28:
                {
                alt2=7;
                }
                break;
            case 29:
                {
                alt2=8;
                }
                break;
            case 30:
                {
                alt2=9;
                }
                break;
            case 31:
                {
                alt2=10;
                }
                break;
            case 32:
                {
                alt2=11;
                }
                break;
            case 33:
                {
                alt2=12;
                }
                break;
            case 34:
                {
                alt2=13;
                }
                break;
            case 35:
                {
                alt2=14;
                }
                break;
            case 36:
                {
                alt2=15;
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
                    // InternalA2B.g:124:3: this_DW_1= ruleDW
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getDWParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DW_1=ruleDW();

                    state._fsp--;


                    			current = this_DW_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalA2B.g:133:3: this_DD_2= ruleDD
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getDDParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DD_2=ruleDD();

                    state._fsp--;


                    			current = this_DD_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalA2B.g:142:3: this_STR_3= ruleSTR
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getSTRParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_STR_3=ruleSTR();

                    state._fsp--;


                    			current = this_STR_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalA2B.g:151:3: this_Base64Decode_4= ruleBase64Decode
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getBase64DecodeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Base64Decode_4=ruleBase64Decode();

                    state._fsp--;


                    			current = this_Base64Decode_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalA2B.g:160:3: this_Base64Encode_5= ruleBase64Encode
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getBase64EncodeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Base64Encode_5=ruleBase64Encode();

                    state._fsp--;


                    			current = this_Base64Encode_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalA2B.g:169:3: this_ORG_6= ruleORG
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getORGParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ORG_6=ruleORG();

                    state._fsp--;


                    			current = this_ORG_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalA2B.g:178:3: this_INCLUDE_7= ruleINCLUDE
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getINCLUDEParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_INCLUDE_7=ruleINCLUDE();

                    state._fsp--;


                    			current = this_INCLUDE_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalA2B.g:187:3: this_MAC_8= ruleMAC
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getMACParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_MAC_8=ruleMAC();

                    state._fsp--;


                    			current = this_MAC_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalA2B.g:196:3: this_IP_9= ruleIP
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getIPParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_IP_9=ruleIP();

                    state._fsp--;


                    			current = this_IP_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalA2B.g:205:3: this_HXS_10= ruleHXS
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getHXSParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_HXS_10=ruleHXS();

                    state._fsp--;


                    			current = this_HXS_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalA2B.g:214:3: ( () ruleBE )
                    {
                    // InternalA2B.g:214:3: ( () ruleBE )
                    // InternalA2B.g:215:4: () ruleBE
                    {
                    // InternalA2B.g:215:4: ()
                    // InternalA2B.g:216:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInstructionAccess().getBEAction_11_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getInstructionAccess().getBEParserRuleCall_11_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleBE();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalA2B.g:231:3: ( () ruleLE )
                    {
                    // InternalA2B.g:231:3: ( () ruleLE )
                    // InternalA2B.g:232:4: () ruleLE
                    {
                    // InternalA2B.g:232:4: ()
                    // InternalA2B.g:233:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInstructionAccess().getLEAction_12_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getInstructionAccess().getLEParserRuleCall_12_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleLE();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalA2B.g:248:3: ( () rulePCAP )
                    {
                    // InternalA2B.g:248:3: ( () rulePCAP )
                    // InternalA2B.g:249:4: () rulePCAP
                    {
                    // InternalA2B.g:249:4: ()
                    // InternalA2B.g:250:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInstructionAccess().getPCAPAction_13_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getInstructionAccess().getPCAPParserRuleCall_13_1());
                    			
                    pushFollow(FOLLOW_2);
                    rulePCAP();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalA2B.g:265:3: ( () ruleCRC )
                    {
                    // InternalA2B.g:265:3: ( () ruleCRC )
                    // InternalA2B.g:266:4: () ruleCRC
                    {
                    // InternalA2B.g:266:4: ()
                    // InternalA2B.g:267:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInstructionAccess().getCRCAction_14_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getInstructionAccess().getCRCParserRuleCall_14_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleCRC();

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
    // InternalA2B.g:285:1: entryRuleDB returns [EObject current=null] : iv_ruleDB= ruleDB EOF ;
    public final EObject entryRuleDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDB = null;


        try {
            // InternalA2B.g:285:43: (iv_ruleDB= ruleDB EOF )
            // InternalA2B.g:286:2: iv_ruleDB= ruleDB EOF
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
    // InternalA2B.g:292:1: ruleDB returns [EObject current=null] : (otherlv_0= 'DB' ( ( (lv_stringValue_1_0= RULE_BYTE ) ) | ( (lv_intValue_2_0= RULE_INT ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? ) ;
    public final EObject ruleDB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stringValue_1_0=null;
        Token lv_intValue_2_0=null;
        Token lv_crcValue_3_0=null;


        	enterRule();

        try {
            // InternalA2B.g:298:2: ( (otherlv_0= 'DB' ( ( (lv_stringValue_1_0= RULE_BYTE ) ) | ( (lv_intValue_2_0= RULE_INT ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? ) )
            // InternalA2B.g:299:2: (otherlv_0= 'DB' ( ( (lv_stringValue_1_0= RULE_BYTE ) ) | ( (lv_intValue_2_0= RULE_INT ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? )
            {
            // InternalA2B.g:299:2: (otherlv_0= 'DB' ( ( (lv_stringValue_1_0= RULE_BYTE ) ) | ( (lv_intValue_2_0= RULE_INT ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? )
            // InternalA2B.g:300:3: otherlv_0= 'DB' ( ( (lv_stringValue_1_0= RULE_BYTE ) ) | ( (lv_intValue_2_0= RULE_INT ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDBAccess().getDBKeyword_0());
            		
            // InternalA2B.g:304:3: ( ( (lv_stringValue_1_0= RULE_BYTE ) ) | ( (lv_intValue_2_0= RULE_INT ) ) )
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
                    // InternalA2B.g:305:4: ( (lv_stringValue_1_0= RULE_BYTE ) )
                    {
                    // InternalA2B.g:305:4: ( (lv_stringValue_1_0= RULE_BYTE ) )
                    // InternalA2B.g:306:5: (lv_stringValue_1_0= RULE_BYTE )
                    {
                    // InternalA2B.g:306:5: (lv_stringValue_1_0= RULE_BYTE )
                    // InternalA2B.g:307:6: lv_stringValue_1_0= RULE_BYTE
                    {
                    lv_stringValue_1_0=(Token)match(input,RULE_BYTE,FOLLOW_5); 

                    						newLeafNode(lv_stringValue_1_0, grammarAccess.getDBAccess().getStringValueBYTETerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDBRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"stringValue",
                    							lv_stringValue_1_0,
                    							"a2b.A2B.BYTE");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalA2B.g:324:4: ( (lv_intValue_2_0= RULE_INT ) )
                    {
                    // InternalA2B.g:324:4: ( (lv_intValue_2_0= RULE_INT ) )
                    // InternalA2B.g:325:5: (lv_intValue_2_0= RULE_INT )
                    {
                    // InternalA2B.g:325:5: (lv_intValue_2_0= RULE_INT )
                    // InternalA2B.g:326:6: lv_intValue_2_0= RULE_INT
                    {
                    lv_intValue_2_0=(Token)match(input,RULE_INT,FOLLOW_5); 

                    						newLeafNode(lv_intValue_2_0, grammarAccess.getDBAccess().getIntValueINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDBRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"intValue",
                    							lv_intValue_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalA2B.g:343:3: ( (lv_crcValue_3_0= RULE_CRCCHECK ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_CRCCHECK) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalA2B.g:344:4: (lv_crcValue_3_0= RULE_CRCCHECK )
                    {
                    // InternalA2B.g:344:4: (lv_crcValue_3_0= RULE_CRCCHECK )
                    // InternalA2B.g:345:5: lv_crcValue_3_0= RULE_CRCCHECK
                    {
                    lv_crcValue_3_0=(Token)match(input,RULE_CRCCHECK,FOLLOW_2); 

                    					newLeafNode(lv_crcValue_3_0, grammarAccess.getDBAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDBRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"crcValue",
                    						lv_crcValue_3_0,
                    						"a2b.A2B.CRCCHECK");
                    				

                    }


                    }
                    break;

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


    // $ANTLR start "entryRuleDW"
    // InternalA2B.g:365:1: entryRuleDW returns [EObject current=null] : iv_ruleDW= ruleDW EOF ;
    public final EObject entryRuleDW() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDW = null;


        try {
            // InternalA2B.g:365:43: (iv_ruleDW= ruleDW EOF )
            // InternalA2B.g:366:2: iv_ruleDW= ruleDW EOF
            {
             newCompositeNode(grammarAccess.getDWRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDW=ruleDW();

            state._fsp--;

             current =iv_ruleDW; 
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
    // $ANTLR end "entryRuleDW"


    // $ANTLR start "ruleDW"
    // InternalA2B.g:372:1: ruleDW returns [EObject current=null] : (otherlv_0= 'DW' ( ( (lv_stringValue_1_0= RULE_WORD ) ) | ( (lv_intValue_2_0= RULE_INT ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? ) ;
    public final EObject ruleDW() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stringValue_1_0=null;
        Token lv_intValue_2_0=null;
        Token lv_crcValue_3_0=null;


        	enterRule();

        try {
            // InternalA2B.g:378:2: ( (otherlv_0= 'DW' ( ( (lv_stringValue_1_0= RULE_WORD ) ) | ( (lv_intValue_2_0= RULE_INT ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? ) )
            // InternalA2B.g:379:2: (otherlv_0= 'DW' ( ( (lv_stringValue_1_0= RULE_WORD ) ) | ( (lv_intValue_2_0= RULE_INT ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? )
            {
            // InternalA2B.g:379:2: (otherlv_0= 'DW' ( ( (lv_stringValue_1_0= RULE_WORD ) ) | ( (lv_intValue_2_0= RULE_INT ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? )
            // InternalA2B.g:380:3: otherlv_0= 'DW' ( ( (lv_stringValue_1_0= RULE_WORD ) ) | ( (lv_intValue_2_0= RULE_INT ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDWAccess().getDWKeyword_0());
            		
            // InternalA2B.g:384:3: ( ( (lv_stringValue_1_0= RULE_WORD ) ) | ( (lv_intValue_2_0= RULE_INT ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_WORD) ) {
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
                    // InternalA2B.g:385:4: ( (lv_stringValue_1_0= RULE_WORD ) )
                    {
                    // InternalA2B.g:385:4: ( (lv_stringValue_1_0= RULE_WORD ) )
                    // InternalA2B.g:386:5: (lv_stringValue_1_0= RULE_WORD )
                    {
                    // InternalA2B.g:386:5: (lv_stringValue_1_0= RULE_WORD )
                    // InternalA2B.g:387:6: lv_stringValue_1_0= RULE_WORD
                    {
                    lv_stringValue_1_0=(Token)match(input,RULE_WORD,FOLLOW_5); 

                    						newLeafNode(lv_stringValue_1_0, grammarAccess.getDWAccess().getStringValueWORDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDWRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"stringValue",
                    							lv_stringValue_1_0,
                    							"a2b.A2B.WORD");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalA2B.g:404:4: ( (lv_intValue_2_0= RULE_INT ) )
                    {
                    // InternalA2B.g:404:4: ( (lv_intValue_2_0= RULE_INT ) )
                    // InternalA2B.g:405:5: (lv_intValue_2_0= RULE_INT )
                    {
                    // InternalA2B.g:405:5: (lv_intValue_2_0= RULE_INT )
                    // InternalA2B.g:406:6: lv_intValue_2_0= RULE_INT
                    {
                    lv_intValue_2_0=(Token)match(input,RULE_INT,FOLLOW_5); 

                    						newLeafNode(lv_intValue_2_0, grammarAccess.getDWAccess().getIntValueINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDWRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"intValue",
                    							lv_intValue_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalA2B.g:423:3: ( (lv_crcValue_3_0= RULE_CRCCHECK ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_CRCCHECK) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalA2B.g:424:4: (lv_crcValue_3_0= RULE_CRCCHECK )
                    {
                    // InternalA2B.g:424:4: (lv_crcValue_3_0= RULE_CRCCHECK )
                    // InternalA2B.g:425:5: lv_crcValue_3_0= RULE_CRCCHECK
                    {
                    lv_crcValue_3_0=(Token)match(input,RULE_CRCCHECK,FOLLOW_2); 

                    					newLeafNode(lv_crcValue_3_0, grammarAccess.getDWAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDWRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"crcValue",
                    						lv_crcValue_3_0,
                    						"a2b.A2B.CRCCHECK");
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleDW"


    // $ANTLR start "entryRuleDD"
    // InternalA2B.g:445:1: entryRuleDD returns [EObject current=null] : iv_ruleDD= ruleDD EOF ;
    public final EObject entryRuleDD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDD = null;


        try {
            // InternalA2B.g:445:43: (iv_ruleDD= ruleDD EOF )
            // InternalA2B.g:446:2: iv_ruleDD= ruleDD EOF
            {
             newCompositeNode(grammarAccess.getDDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDD=ruleDD();

            state._fsp--;

             current =iv_ruleDD; 
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
    // $ANTLR end "entryRuleDD"


    // $ANTLR start "ruleDD"
    // InternalA2B.g:452:1: ruleDD returns [EObject current=null] : (otherlv_0= 'DD' ( ( (lv_stringValue_1_0= RULE_DOUBLEWORD ) ) | ( (lv_longValue_2_0= ruleLONG ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? ) ;
    public final EObject ruleDD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stringValue_1_0=null;
        Token lv_crcValue_3_0=null;
        AntlrDatatypeRuleToken lv_longValue_2_0 = null;



        	enterRule();

        try {
            // InternalA2B.g:458:2: ( (otherlv_0= 'DD' ( ( (lv_stringValue_1_0= RULE_DOUBLEWORD ) ) | ( (lv_longValue_2_0= ruleLONG ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? ) )
            // InternalA2B.g:459:2: (otherlv_0= 'DD' ( ( (lv_stringValue_1_0= RULE_DOUBLEWORD ) ) | ( (lv_longValue_2_0= ruleLONG ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? )
            {
            // InternalA2B.g:459:2: (otherlv_0= 'DD' ( ( (lv_stringValue_1_0= RULE_DOUBLEWORD ) ) | ( (lv_longValue_2_0= ruleLONG ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? )
            // InternalA2B.g:460:3: otherlv_0= 'DD' ( ( (lv_stringValue_1_0= RULE_DOUBLEWORD ) ) | ( (lv_longValue_2_0= ruleLONG ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDDAccess().getDDKeyword_0());
            		
            // InternalA2B.g:464:3: ( ( (lv_stringValue_1_0= RULE_DOUBLEWORD ) ) | ( (lv_longValue_2_0= ruleLONG ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_DOUBLEWORD) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalA2B.g:465:4: ( (lv_stringValue_1_0= RULE_DOUBLEWORD ) )
                    {
                    // InternalA2B.g:465:4: ( (lv_stringValue_1_0= RULE_DOUBLEWORD ) )
                    // InternalA2B.g:466:5: (lv_stringValue_1_0= RULE_DOUBLEWORD )
                    {
                    // InternalA2B.g:466:5: (lv_stringValue_1_0= RULE_DOUBLEWORD )
                    // InternalA2B.g:467:6: lv_stringValue_1_0= RULE_DOUBLEWORD
                    {
                    lv_stringValue_1_0=(Token)match(input,RULE_DOUBLEWORD,FOLLOW_5); 

                    						newLeafNode(lv_stringValue_1_0, grammarAccess.getDDAccess().getStringValueDOUBLEWORDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDDRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"stringValue",
                    							lv_stringValue_1_0,
                    							"a2b.A2B.DOUBLEWORD");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalA2B.g:484:4: ( (lv_longValue_2_0= ruleLONG ) )
                    {
                    // InternalA2B.g:484:4: ( (lv_longValue_2_0= ruleLONG ) )
                    // InternalA2B.g:485:5: (lv_longValue_2_0= ruleLONG )
                    {
                    // InternalA2B.g:485:5: (lv_longValue_2_0= ruleLONG )
                    // InternalA2B.g:486:6: lv_longValue_2_0= ruleLONG
                    {

                    						newCompositeNode(grammarAccess.getDDAccess().getLongValueLONGParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_longValue_2_0=ruleLONG();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDDRule());
                    						}
                    						set(
                    							current,
                    							"longValue",
                    							lv_longValue_2_0,
                    							"a2b.A2B.LONG");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalA2B.g:504:3: ( (lv_crcValue_3_0= RULE_CRCCHECK ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_CRCCHECK) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalA2B.g:505:4: (lv_crcValue_3_0= RULE_CRCCHECK )
                    {
                    // InternalA2B.g:505:4: (lv_crcValue_3_0= RULE_CRCCHECK )
                    // InternalA2B.g:506:5: lv_crcValue_3_0= RULE_CRCCHECK
                    {
                    lv_crcValue_3_0=(Token)match(input,RULE_CRCCHECK,FOLLOW_2); 

                    					newLeafNode(lv_crcValue_3_0, grammarAccess.getDDAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDDRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"crcValue",
                    						lv_crcValue_3_0,
                    						"a2b.A2B.CRCCHECK");
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleDD"


    // $ANTLR start "entryRuleSTR"
    // InternalA2B.g:526:1: entryRuleSTR returns [EObject current=null] : iv_ruleSTR= ruleSTR EOF ;
    public final EObject entryRuleSTR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSTR = null;


        try {
            // InternalA2B.g:526:44: (iv_ruleSTR= ruleSTR EOF )
            // InternalA2B.g:527:2: iv_ruleSTR= ruleSTR EOF
            {
             newCompositeNode(grammarAccess.getSTRRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSTR=ruleSTR();

            state._fsp--;

             current =iv_ruleSTR; 
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
    // $ANTLR end "entryRuleSTR"


    // $ANTLR start "ruleSTR"
    // InternalA2B.g:533:1: ruleSTR returns [EObject current=null] : (otherlv_0= 'STR' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSTR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalA2B.g:539:2: ( (otherlv_0= 'STR' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalA2B.g:540:2: (otherlv_0= 'STR' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalA2B.g:540:2: (otherlv_0= 'STR' ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalA2B.g:541:3: otherlv_0= 'STR' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSTRAccess().getSTRKeyword_0());
            		
            // InternalA2B.g:545:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalA2B.g:546:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalA2B.g:546:4: (lv_value_1_0= RULE_STRING )
            // InternalA2B.g:547:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getSTRAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSTRRule());
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
    // $ANTLR end "ruleSTR"


    // $ANTLR start "entryRuleBase64Decode"
    // InternalA2B.g:567:1: entryRuleBase64Decode returns [EObject current=null] : iv_ruleBase64Decode= ruleBase64Decode EOF ;
    public final EObject entryRuleBase64Decode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBase64Decode = null;


        try {
            // InternalA2B.g:567:53: (iv_ruleBase64Decode= ruleBase64Decode EOF )
            // InternalA2B.g:568:2: iv_ruleBase64Decode= ruleBase64Decode EOF
            {
             newCompositeNode(grammarAccess.getBase64DecodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBase64Decode=ruleBase64Decode();

            state._fsp--;

             current =iv_ruleBase64Decode; 
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
    // $ANTLR end "entryRuleBase64Decode"


    // $ANTLR start "ruleBase64Decode"
    // InternalA2B.g:574:1: ruleBase64Decode returns [EObject current=null] : (otherlv_0= 'B64d' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleBase64Decode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalA2B.g:580:2: ( (otherlv_0= 'B64d' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalA2B.g:581:2: (otherlv_0= 'B64d' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalA2B.g:581:2: (otherlv_0= 'B64d' ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalA2B.g:582:3: otherlv_0= 'B64d' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getBase64DecodeAccess().getB64dKeyword_0());
            		
            // InternalA2B.g:586:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalA2B.g:587:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalA2B.g:587:4: (lv_value_1_0= RULE_STRING )
            // InternalA2B.g:588:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getBase64DecodeAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBase64DecodeRule());
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
    // $ANTLR end "ruleBase64Decode"


    // $ANTLR start "entryRuleBase64Encode"
    // InternalA2B.g:608:1: entryRuleBase64Encode returns [EObject current=null] : iv_ruleBase64Encode= ruleBase64Encode EOF ;
    public final EObject entryRuleBase64Encode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBase64Encode = null;


        try {
            // InternalA2B.g:608:53: (iv_ruleBase64Encode= ruleBase64Encode EOF )
            // InternalA2B.g:609:2: iv_ruleBase64Encode= ruleBase64Encode EOF
            {
             newCompositeNode(grammarAccess.getBase64EncodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBase64Encode=ruleBase64Encode();

            state._fsp--;

             current =iv_ruleBase64Encode; 
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
    // $ANTLR end "entryRuleBase64Encode"


    // $ANTLR start "ruleBase64Encode"
    // InternalA2B.g:615:1: ruleBase64Encode returns [EObject current=null] : (otherlv_0= 'B64e' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleBase64Encode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalA2B.g:621:2: ( (otherlv_0= 'B64e' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalA2B.g:622:2: (otherlv_0= 'B64e' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalA2B.g:622:2: (otherlv_0= 'B64e' ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalA2B.g:623:3: otherlv_0= 'B64e' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getBase64EncodeAccess().getB64eKeyword_0());
            		
            // InternalA2B.g:627:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalA2B.g:628:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalA2B.g:628:4: (lv_value_1_0= RULE_STRING )
            // InternalA2B.g:629:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getBase64EncodeAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBase64EncodeRule());
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
    // $ANTLR end "ruleBase64Encode"


    // $ANTLR start "entryRuleORG"
    // InternalA2B.g:649:1: entryRuleORG returns [EObject current=null] : iv_ruleORG= ruleORG EOF ;
    public final EObject entryRuleORG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORG = null;


        try {
            // InternalA2B.g:649:44: (iv_ruleORG= ruleORG EOF )
            // InternalA2B.g:650:2: iv_ruleORG= ruleORG EOF
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
    // InternalA2B.g:656:1: ruleORG returns [EObject current=null] : (otherlv_0= 'ORG' ( (lv_value_1_0= RULE_INT ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? ) ;
    public final EObject ruleORG() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token lv_crcValue_2_0=null;


        	enterRule();

        try {
            // InternalA2B.g:662:2: ( (otherlv_0= 'ORG' ( (lv_value_1_0= RULE_INT ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? ) )
            // InternalA2B.g:663:2: (otherlv_0= 'ORG' ( (lv_value_1_0= RULE_INT ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? )
            {
            // InternalA2B.g:663:2: (otherlv_0= 'ORG' ( (lv_value_1_0= RULE_INT ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? )
            // InternalA2B.g:664:3: otherlv_0= 'ORG' ( (lv_value_1_0= RULE_INT ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getORGAccess().getORGKeyword_0());
            		
            // InternalA2B.g:668:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalA2B.g:669:4: (lv_value_1_0= RULE_INT )
            {
            // InternalA2B.g:669:4: (lv_value_1_0= RULE_INT )
            // InternalA2B.g:670:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_5); 

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

            // InternalA2B.g:686:3: ( (lv_crcValue_2_0= RULE_CRCCHECK ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_CRCCHECK) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalA2B.g:687:4: (lv_crcValue_2_0= RULE_CRCCHECK )
                    {
                    // InternalA2B.g:687:4: (lv_crcValue_2_0= RULE_CRCCHECK )
                    // InternalA2B.g:688:5: lv_crcValue_2_0= RULE_CRCCHECK
                    {
                    lv_crcValue_2_0=(Token)match(input,RULE_CRCCHECK,FOLLOW_2); 

                    					newLeafNode(lv_crcValue_2_0, grammarAccess.getORGAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getORGRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"crcValue",
                    						lv_crcValue_2_0,
                    						"a2b.A2B.CRCCHECK");
                    				

                    }


                    }
                    break;

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
    // InternalA2B.g:708:1: entryRuleINCLUDE returns [EObject current=null] : iv_ruleINCLUDE= ruleINCLUDE EOF ;
    public final EObject entryRuleINCLUDE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINCLUDE = null;


        try {
            // InternalA2B.g:708:48: (iv_ruleINCLUDE= ruleINCLUDE EOF )
            // InternalA2B.g:709:2: iv_ruleINCLUDE= ruleINCLUDE EOF
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
    // InternalA2B.g:715:1: ruleINCLUDE returns [EObject current=null] : (otherlv_0= 'INCLUDE' ( (lv_value_1_0= RULE_PATH ) ) ) ;
    public final EObject ruleINCLUDE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalA2B.g:721:2: ( (otherlv_0= 'INCLUDE' ( (lv_value_1_0= RULE_PATH ) ) ) )
            // InternalA2B.g:722:2: (otherlv_0= 'INCLUDE' ( (lv_value_1_0= RULE_PATH ) ) )
            {
            // InternalA2B.g:722:2: (otherlv_0= 'INCLUDE' ( (lv_value_1_0= RULE_PATH ) ) )
            // InternalA2B.g:723:3: otherlv_0= 'INCLUDE' ( (lv_value_1_0= RULE_PATH ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getINCLUDEAccess().getINCLUDEKeyword_0());
            		
            // InternalA2B.g:727:3: ( (lv_value_1_0= RULE_PATH ) )
            // InternalA2B.g:728:4: (lv_value_1_0= RULE_PATH )
            {
            // InternalA2B.g:728:4: (lv_value_1_0= RULE_PATH )
            // InternalA2B.g:729:5: lv_value_1_0= RULE_PATH
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
    // InternalA2B.g:749:1: entryRuleMAC returns [EObject current=null] : iv_ruleMAC= ruleMAC EOF ;
    public final EObject entryRuleMAC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMAC = null;


        try {
            // InternalA2B.g:749:44: (iv_ruleMAC= ruleMAC EOF )
            // InternalA2B.g:750:2: iv_ruleMAC= ruleMAC EOF
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
    // InternalA2B.g:756:1: ruleMAC returns [EObject current=null] : (otherlv_0= 'MAC' ( (lv_value_1_0= RULE_MACADDRESS ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? ) ;
    public final EObject ruleMAC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token lv_crcValue_2_0=null;


        	enterRule();

        try {
            // InternalA2B.g:762:2: ( (otherlv_0= 'MAC' ( (lv_value_1_0= RULE_MACADDRESS ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? ) )
            // InternalA2B.g:763:2: (otherlv_0= 'MAC' ( (lv_value_1_0= RULE_MACADDRESS ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? )
            {
            // InternalA2B.g:763:2: (otherlv_0= 'MAC' ( (lv_value_1_0= RULE_MACADDRESS ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? )
            // InternalA2B.g:764:3: otherlv_0= 'MAC' ( (lv_value_1_0= RULE_MACADDRESS ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getMACAccess().getMACKeyword_0());
            		
            // InternalA2B.g:768:3: ( (lv_value_1_0= RULE_MACADDRESS ) )
            // InternalA2B.g:769:4: (lv_value_1_0= RULE_MACADDRESS )
            {
            // InternalA2B.g:769:4: (lv_value_1_0= RULE_MACADDRESS )
            // InternalA2B.g:770:5: lv_value_1_0= RULE_MACADDRESS
            {
            lv_value_1_0=(Token)match(input,RULE_MACADDRESS,FOLLOW_5); 

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

            // InternalA2B.g:786:3: ( (lv_crcValue_2_0= RULE_CRCCHECK ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_CRCCHECK) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalA2B.g:787:4: (lv_crcValue_2_0= RULE_CRCCHECK )
                    {
                    // InternalA2B.g:787:4: (lv_crcValue_2_0= RULE_CRCCHECK )
                    // InternalA2B.g:788:5: lv_crcValue_2_0= RULE_CRCCHECK
                    {
                    lv_crcValue_2_0=(Token)match(input,RULE_CRCCHECK,FOLLOW_2); 

                    					newLeafNode(lv_crcValue_2_0, grammarAccess.getMACAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMACRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"crcValue",
                    						lv_crcValue_2_0,
                    						"a2b.A2B.CRCCHECK");
                    				

                    }


                    }
                    break;

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
    // InternalA2B.g:808:1: entryRuleIP returns [EObject current=null] : iv_ruleIP= ruleIP EOF ;
    public final EObject entryRuleIP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIP = null;


        try {
            // InternalA2B.g:808:43: (iv_ruleIP= ruleIP EOF )
            // InternalA2B.g:809:2: iv_ruleIP= ruleIP EOF
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
    // InternalA2B.g:815:1: ruleIP returns [EObject current=null] : (otherlv_0= 'IP' ( (lv_value_1_0= RULE_IPADDRESS ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? ) ;
    public final EObject ruleIP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token lv_crcValue_2_0=null;


        	enterRule();

        try {
            // InternalA2B.g:821:2: ( (otherlv_0= 'IP' ( (lv_value_1_0= RULE_IPADDRESS ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? ) )
            // InternalA2B.g:822:2: (otherlv_0= 'IP' ( (lv_value_1_0= RULE_IPADDRESS ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? )
            {
            // InternalA2B.g:822:2: (otherlv_0= 'IP' ( (lv_value_1_0= RULE_IPADDRESS ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? )
            // InternalA2B.g:823:3: otherlv_0= 'IP' ( (lv_value_1_0= RULE_IPADDRESS ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getIPAccess().getIPKeyword_0());
            		
            // InternalA2B.g:827:3: ( (lv_value_1_0= RULE_IPADDRESS ) )
            // InternalA2B.g:828:4: (lv_value_1_0= RULE_IPADDRESS )
            {
            // InternalA2B.g:828:4: (lv_value_1_0= RULE_IPADDRESS )
            // InternalA2B.g:829:5: lv_value_1_0= RULE_IPADDRESS
            {
            lv_value_1_0=(Token)match(input,RULE_IPADDRESS,FOLLOW_5); 

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

            // InternalA2B.g:845:3: ( (lv_crcValue_2_0= RULE_CRCCHECK ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_CRCCHECK) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalA2B.g:846:4: (lv_crcValue_2_0= RULE_CRCCHECK )
                    {
                    // InternalA2B.g:846:4: (lv_crcValue_2_0= RULE_CRCCHECK )
                    // InternalA2B.g:847:5: lv_crcValue_2_0= RULE_CRCCHECK
                    {
                    lv_crcValue_2_0=(Token)match(input,RULE_CRCCHECK,FOLLOW_2); 

                    					newLeafNode(lv_crcValue_2_0, grammarAccess.getIPAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIPRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"crcValue",
                    						lv_crcValue_2_0,
                    						"a2b.A2B.CRCCHECK");
                    				

                    }


                    }
                    break;

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
    // InternalA2B.g:867:1: entryRuleHXS returns [EObject current=null] : iv_ruleHXS= ruleHXS EOF ;
    public final EObject entryRuleHXS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHXS = null;


        try {
            // InternalA2B.g:867:44: (iv_ruleHXS= ruleHXS EOF )
            // InternalA2B.g:868:2: iv_ruleHXS= ruleHXS EOF
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
    // InternalA2B.g:874:1: ruleHXS returns [EObject current=null] : (otherlv_0= 'HXS' ( (lv_value_1_0= RULE_HEXSTRING ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? ) ;
    public final EObject ruleHXS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token lv_crcValue_2_0=null;


        	enterRule();

        try {
            // InternalA2B.g:880:2: ( (otherlv_0= 'HXS' ( (lv_value_1_0= RULE_HEXSTRING ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? ) )
            // InternalA2B.g:881:2: (otherlv_0= 'HXS' ( (lv_value_1_0= RULE_HEXSTRING ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? )
            {
            // InternalA2B.g:881:2: (otherlv_0= 'HXS' ( (lv_value_1_0= RULE_HEXSTRING ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? )
            // InternalA2B.g:882:3: otherlv_0= 'HXS' ( (lv_value_1_0= RULE_HEXSTRING ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getHXSAccess().getHXSKeyword_0());
            		
            // InternalA2B.g:886:3: ( (lv_value_1_0= RULE_HEXSTRING ) )
            // InternalA2B.g:887:4: (lv_value_1_0= RULE_HEXSTRING )
            {
            // InternalA2B.g:887:4: (lv_value_1_0= RULE_HEXSTRING )
            // InternalA2B.g:888:5: lv_value_1_0= RULE_HEXSTRING
            {
            lv_value_1_0=(Token)match(input,RULE_HEXSTRING,FOLLOW_5); 

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

            // InternalA2B.g:904:3: ( (lv_crcValue_2_0= RULE_CRCCHECK ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_CRCCHECK) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalA2B.g:905:4: (lv_crcValue_2_0= RULE_CRCCHECK )
                    {
                    // InternalA2B.g:905:4: (lv_crcValue_2_0= RULE_CRCCHECK )
                    // InternalA2B.g:906:5: lv_crcValue_2_0= RULE_CRCCHECK
                    {
                    lv_crcValue_2_0=(Token)match(input,RULE_CRCCHECK,FOLLOW_2); 

                    					newLeafNode(lv_crcValue_2_0, grammarAccess.getHXSAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHXSRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"crcValue",
                    						lv_crcValue_2_0,
                    						"a2b.A2B.CRCCHECK");
                    				

                    }


                    }
                    break;

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
    // InternalA2B.g:926:1: entryRuleBE returns [String current=null] : iv_ruleBE= ruleBE EOF ;
    public final String entryRuleBE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBE = null;


        try {
            // InternalA2B.g:926:42: (iv_ruleBE= ruleBE EOF )
            // InternalA2B.g:927:2: iv_ruleBE= ruleBE EOF
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
    // InternalA2B.g:933:1: ruleBE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'BE' ;
    public final AntlrDatatypeRuleToken ruleBE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalA2B.g:939:2: (kw= 'BE' )
            // InternalA2B.g:940:2: kw= 'BE'
            {
            kw=(Token)match(input,33,FOLLOW_2); 

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
    // InternalA2B.g:948:1: entryRuleLE returns [String current=null] : iv_ruleLE= ruleLE EOF ;
    public final String entryRuleLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLE = null;


        try {
            // InternalA2B.g:948:42: (iv_ruleLE= ruleLE EOF )
            // InternalA2B.g:949:2: iv_ruleLE= ruleLE EOF
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
    // InternalA2B.g:955:1: ruleLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'LE' ;
    public final AntlrDatatypeRuleToken ruleLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalA2B.g:961:2: (kw= 'LE' )
            // InternalA2B.g:962:2: kw= 'LE'
            {
            kw=(Token)match(input,34,FOLLOW_2); 

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
    // InternalA2B.g:970:1: entryRulePCAP returns [String current=null] : iv_rulePCAP= rulePCAP EOF ;
    public final String entryRulePCAP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePCAP = null;


        try {
            // InternalA2B.g:970:44: (iv_rulePCAP= rulePCAP EOF )
            // InternalA2B.g:971:2: iv_rulePCAP= rulePCAP EOF
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
    // InternalA2B.g:977:1: rulePCAP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'PCAP' ;
    public final AntlrDatatypeRuleToken rulePCAP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalA2B.g:983:2: (kw= 'PCAP' )
            // InternalA2B.g:984:2: kw= 'PCAP'
            {
            kw=(Token)match(input,35,FOLLOW_2); 

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


    // $ANTLR start "entryRuleCRC"
    // InternalA2B.g:992:1: entryRuleCRC returns [String current=null] : iv_ruleCRC= ruleCRC EOF ;
    public final String entryRuleCRC() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCRC = null;


        try {
            // InternalA2B.g:992:43: (iv_ruleCRC= ruleCRC EOF )
            // InternalA2B.g:993:2: iv_ruleCRC= ruleCRC EOF
            {
             newCompositeNode(grammarAccess.getCRCRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCRC=ruleCRC();

            state._fsp--;

             current =iv_ruleCRC.getText(); 
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
    // $ANTLR end "entryRuleCRC"


    // $ANTLR start "ruleCRC"
    // InternalA2B.g:999:1: ruleCRC returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'CRC' ;
    public final AntlrDatatypeRuleToken ruleCRC() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalA2B.g:1005:2: (kw= 'CRC' )
            // InternalA2B.g:1006:2: kw= 'CRC'
            {
            kw=(Token)match(input,36,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCRCAccess().getCRCKeyword());
            	

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
    // $ANTLR end "ruleCRC"


    // $ANTLR start "entryRuleLONG"
    // InternalA2B.g:1014:1: entryRuleLONG returns [String current=null] : iv_ruleLONG= ruleLONG EOF ;
    public final String entryRuleLONG() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLONG = null;


        try {
            // InternalA2B.g:1014:44: (iv_ruleLONG= ruleLONG EOF )
            // InternalA2B.g:1015:2: iv_ruleLONG= ruleLONG EOF
            {
             newCompositeNode(grammarAccess.getLONGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLONG=ruleLONG();

            state._fsp--;

             current =iv_ruleLONG.getText(); 
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
    // $ANTLR end "entryRuleLONG"


    // $ANTLR start "ruleLONG"
    // InternalA2B.g:1021:1: ruleLONG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLONG() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalA2B.g:1027:2: (this_INT_0= RULE_INT )
            // InternalA2B.g:1028:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getLONGAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleLONG"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001FFFC00002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});

}