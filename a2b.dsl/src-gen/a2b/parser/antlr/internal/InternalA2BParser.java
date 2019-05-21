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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BYTE", "RULE_INT", "RULE_CRCCHECK", "RULE_WORD", "RULE_DOUBLEWORD", "RULE_STRING", "RULE_PATH", "RULE_MACADDRESS", "RULE_IPADDRESS", "RULE_PIXEL", "RULE_HEXSTRING", "RULE_DECIMALBYTE_", "RULE_BINARY_", "RULE_HEX_", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DB'", "'DW'", "'DD'", "'STR'", "'B64d'", "'B64e'", "'PAD'", "'INCLUDE'", "'MAC'", "'IP'", "'PXL'", "'HXS'", "'BE'", "'LE'", "'PCAP'", "'\\\\n'", "'CRC16'", "'CRC32'"
    };
    public static final int RULE_HEX_=17;
    public static final int RULE_WORD=7;
    public static final int RULE_BINARY_=16;
    public static final int RULE_DOUBLEWORD=8;
    public static final int RULE_CRCCHECK=6;
    public static final int RULE_BYTE=4;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=20;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_HEXSTRING=14;
    public static final int RULE_ID=18;
    public static final int RULE_WS=21;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_PATH=10;
    public static final int RULE_PIXEL=13;
    public static final int RULE_MACADDRESS=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int RULE_DECIMALBYTE_=15;
    public static final int RULE_IPADDRESS=12;
    public static final int RULE_ML_COMMENT=19;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;

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

                if ( ((LA1_0>=23 && LA1_0<=40)) ) {
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
    // InternalA2B.g:107:1: ruleInstruction returns [EObject current=null] : (this_DB_0= ruleDB | this_DW_1= ruleDW | this_DD_2= ruleDD | this_STR_3= ruleSTR | this_Base64Decode_4= ruleBase64Decode | this_Base64Encode_5= ruleBase64Encode | this_PAD_6= rulePAD | this_INCLUDE_7= ruleINCLUDE | this_MAC_8= ruleMAC | this_IP_9= ruleIP | this_PXL_10= rulePXL | this_HXS_11= ruleHXS | this_CRC16_12= ruleCRC16 | this_CRC32_13= ruleCRC32 | ( () ruleBE ) | ( () ruleLE ) | ( () rulePCAP ) | ( () ruleNL ) ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_DB_0 = null;

        EObject this_DW_1 = null;

        EObject this_DD_2 = null;

        EObject this_STR_3 = null;

        EObject this_Base64Decode_4 = null;

        EObject this_Base64Encode_5 = null;

        EObject this_PAD_6 = null;

        EObject this_INCLUDE_7 = null;

        EObject this_MAC_8 = null;

        EObject this_IP_9 = null;

        EObject this_PXL_10 = null;

        EObject this_HXS_11 = null;

        EObject this_CRC16_12 = null;

        EObject this_CRC32_13 = null;



        	enterRule();

        try {
            // InternalA2B.g:113:2: ( (this_DB_0= ruleDB | this_DW_1= ruleDW | this_DD_2= ruleDD | this_STR_3= ruleSTR | this_Base64Decode_4= ruleBase64Decode | this_Base64Encode_5= ruleBase64Encode | this_PAD_6= rulePAD | this_INCLUDE_7= ruleINCLUDE | this_MAC_8= ruleMAC | this_IP_9= ruleIP | this_PXL_10= rulePXL | this_HXS_11= ruleHXS | this_CRC16_12= ruleCRC16 | this_CRC32_13= ruleCRC32 | ( () ruleBE ) | ( () ruleLE ) | ( () rulePCAP ) | ( () ruleNL ) ) )
            // InternalA2B.g:114:2: (this_DB_0= ruleDB | this_DW_1= ruleDW | this_DD_2= ruleDD | this_STR_3= ruleSTR | this_Base64Decode_4= ruleBase64Decode | this_Base64Encode_5= ruleBase64Encode | this_PAD_6= rulePAD | this_INCLUDE_7= ruleINCLUDE | this_MAC_8= ruleMAC | this_IP_9= ruleIP | this_PXL_10= rulePXL | this_HXS_11= ruleHXS | this_CRC16_12= ruleCRC16 | this_CRC32_13= ruleCRC32 | ( () ruleBE ) | ( () ruleLE ) | ( () rulePCAP ) | ( () ruleNL ) )
            {
            // InternalA2B.g:114:2: (this_DB_0= ruleDB | this_DW_1= ruleDW | this_DD_2= ruleDD | this_STR_3= ruleSTR | this_Base64Decode_4= ruleBase64Decode | this_Base64Encode_5= ruleBase64Encode | this_PAD_6= rulePAD | this_INCLUDE_7= ruleINCLUDE | this_MAC_8= ruleMAC | this_IP_9= ruleIP | this_PXL_10= rulePXL | this_HXS_11= ruleHXS | this_CRC16_12= ruleCRC16 | this_CRC32_13= ruleCRC32 | ( () ruleBE ) | ( () ruleLE ) | ( () rulePCAP ) | ( () ruleNL ) )
            int alt2=18;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            case 26:
                {
                alt2=4;
                }
                break;
            case 27:
                {
                alt2=5;
                }
                break;
            case 28:
                {
                alt2=6;
                }
                break;
            case 29:
                {
                alt2=7;
                }
                break;
            case 30:
                {
                alt2=8;
                }
                break;
            case 31:
                {
                alt2=9;
                }
                break;
            case 32:
                {
                alt2=10;
                }
                break;
            case 33:
                {
                alt2=11;
                }
                break;
            case 34:
                {
                alt2=12;
                }
                break;
            case 39:
                {
                alt2=13;
                }
                break;
            case 40:
                {
                alt2=14;
                }
                break;
            case 35:
                {
                alt2=15;
                }
                break;
            case 36:
                {
                alt2=16;
                }
                break;
            case 37:
                {
                alt2=17;
                }
                break;
            case 38:
                {
                alt2=18;
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
                    // InternalA2B.g:169:3: this_PAD_6= rulePAD
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getPADParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_PAD_6=rulePAD();

                    state._fsp--;


                    			current = this_PAD_6;
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
                    // InternalA2B.g:205:3: this_PXL_10= rulePXL
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getPXLParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_PXL_10=rulePXL();

                    state._fsp--;


                    			current = this_PXL_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalA2B.g:214:3: this_HXS_11= ruleHXS
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getHXSParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_HXS_11=ruleHXS();

                    state._fsp--;


                    			current = this_HXS_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalA2B.g:223:3: this_CRC16_12= ruleCRC16
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCRC16ParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_CRC16_12=ruleCRC16();

                    state._fsp--;


                    			current = this_CRC16_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalA2B.g:232:3: this_CRC32_13= ruleCRC32
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCRC32ParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_CRC32_13=ruleCRC32();

                    state._fsp--;


                    			current = this_CRC32_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalA2B.g:241:3: ( () ruleBE )
                    {
                    // InternalA2B.g:241:3: ( () ruleBE )
                    // InternalA2B.g:242:4: () ruleBE
                    {
                    // InternalA2B.g:242:4: ()
                    // InternalA2B.g:243:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInstructionAccess().getBEAction_14_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getInstructionAccess().getBEParserRuleCall_14_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleBE();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalA2B.g:258:3: ( () ruleLE )
                    {
                    // InternalA2B.g:258:3: ( () ruleLE )
                    // InternalA2B.g:259:4: () ruleLE
                    {
                    // InternalA2B.g:259:4: ()
                    // InternalA2B.g:260:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInstructionAccess().getLEAction_15_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getInstructionAccess().getLEParserRuleCall_15_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleLE();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalA2B.g:275:3: ( () rulePCAP )
                    {
                    // InternalA2B.g:275:3: ( () rulePCAP )
                    // InternalA2B.g:276:4: () rulePCAP
                    {
                    // InternalA2B.g:276:4: ()
                    // InternalA2B.g:277:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInstructionAccess().getPCAPAction_16_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getInstructionAccess().getPCAPParserRuleCall_16_1());
                    			
                    pushFollow(FOLLOW_2);
                    rulePCAP();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalA2B.g:292:3: ( () ruleNL )
                    {
                    // InternalA2B.g:292:3: ( () ruleNL )
                    // InternalA2B.g:293:4: () ruleNL
                    {
                    // InternalA2B.g:293:4: ()
                    // InternalA2B.g:294:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getInstructionAccess().getNLAction_17_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getInstructionAccess().getNLParserRuleCall_17_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleNL();

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
    // InternalA2B.g:312:1: entryRuleDB returns [EObject current=null] : iv_ruleDB= ruleDB EOF ;
    public final EObject entryRuleDB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDB = null;


        try {
            // InternalA2B.g:312:43: (iv_ruleDB= ruleDB EOF )
            // InternalA2B.g:313:2: iv_ruleDB= ruleDB EOF
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
    // InternalA2B.g:319:1: ruleDB returns [EObject current=null] : (otherlv_0= 'DB' ( ( (lv_stringValue_1_0= RULE_BYTE ) ) | ( (lv_intValue_2_0= RULE_INT ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? ) ;
    public final EObject ruleDB() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stringValue_1_0=null;
        Token lv_intValue_2_0=null;
        Token lv_crcValue_3_0=null;


        	enterRule();

        try {
            // InternalA2B.g:325:2: ( (otherlv_0= 'DB' ( ( (lv_stringValue_1_0= RULE_BYTE ) ) | ( (lv_intValue_2_0= RULE_INT ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? ) )
            // InternalA2B.g:326:2: (otherlv_0= 'DB' ( ( (lv_stringValue_1_0= RULE_BYTE ) ) | ( (lv_intValue_2_0= RULE_INT ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? )
            {
            // InternalA2B.g:326:2: (otherlv_0= 'DB' ( ( (lv_stringValue_1_0= RULE_BYTE ) ) | ( (lv_intValue_2_0= RULE_INT ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? )
            // InternalA2B.g:327:3: otherlv_0= 'DB' ( ( (lv_stringValue_1_0= RULE_BYTE ) ) | ( (lv_intValue_2_0= RULE_INT ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDBAccess().getDBKeyword_0());
            		
            // InternalA2B.g:331:3: ( ( (lv_stringValue_1_0= RULE_BYTE ) ) | ( (lv_intValue_2_0= RULE_INT ) ) )
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
                    // InternalA2B.g:332:4: ( (lv_stringValue_1_0= RULE_BYTE ) )
                    {
                    // InternalA2B.g:332:4: ( (lv_stringValue_1_0= RULE_BYTE ) )
                    // InternalA2B.g:333:5: (lv_stringValue_1_0= RULE_BYTE )
                    {
                    // InternalA2B.g:333:5: (lv_stringValue_1_0= RULE_BYTE )
                    // InternalA2B.g:334:6: lv_stringValue_1_0= RULE_BYTE
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
                    // InternalA2B.g:351:4: ( (lv_intValue_2_0= RULE_INT ) )
                    {
                    // InternalA2B.g:351:4: ( (lv_intValue_2_0= RULE_INT ) )
                    // InternalA2B.g:352:5: (lv_intValue_2_0= RULE_INT )
                    {
                    // InternalA2B.g:352:5: (lv_intValue_2_0= RULE_INT )
                    // InternalA2B.g:353:6: lv_intValue_2_0= RULE_INT
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

            // InternalA2B.g:370:3: ( (lv_crcValue_3_0= RULE_CRCCHECK ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_CRCCHECK) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalA2B.g:371:4: (lv_crcValue_3_0= RULE_CRCCHECK )
                    {
                    // InternalA2B.g:371:4: (lv_crcValue_3_0= RULE_CRCCHECK )
                    // InternalA2B.g:372:5: lv_crcValue_3_0= RULE_CRCCHECK
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
    // InternalA2B.g:392:1: entryRuleDW returns [EObject current=null] : iv_ruleDW= ruleDW EOF ;
    public final EObject entryRuleDW() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDW = null;


        try {
            // InternalA2B.g:392:43: (iv_ruleDW= ruleDW EOF )
            // InternalA2B.g:393:2: iv_ruleDW= ruleDW EOF
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
    // InternalA2B.g:399:1: ruleDW returns [EObject current=null] : (otherlv_0= 'DW' ( ( (lv_stringValue_1_0= RULE_WORD ) ) | ( (lv_intValue_2_0= RULE_INT ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? ) ;
    public final EObject ruleDW() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stringValue_1_0=null;
        Token lv_intValue_2_0=null;
        Token lv_crcValue_3_0=null;


        	enterRule();

        try {
            // InternalA2B.g:405:2: ( (otherlv_0= 'DW' ( ( (lv_stringValue_1_0= RULE_WORD ) ) | ( (lv_intValue_2_0= RULE_INT ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? ) )
            // InternalA2B.g:406:2: (otherlv_0= 'DW' ( ( (lv_stringValue_1_0= RULE_WORD ) ) | ( (lv_intValue_2_0= RULE_INT ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? )
            {
            // InternalA2B.g:406:2: (otherlv_0= 'DW' ( ( (lv_stringValue_1_0= RULE_WORD ) ) | ( (lv_intValue_2_0= RULE_INT ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? )
            // InternalA2B.g:407:3: otherlv_0= 'DW' ( ( (lv_stringValue_1_0= RULE_WORD ) ) | ( (lv_intValue_2_0= RULE_INT ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDWAccess().getDWKeyword_0());
            		
            // InternalA2B.g:411:3: ( ( (lv_stringValue_1_0= RULE_WORD ) ) | ( (lv_intValue_2_0= RULE_INT ) ) )
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
                    // InternalA2B.g:412:4: ( (lv_stringValue_1_0= RULE_WORD ) )
                    {
                    // InternalA2B.g:412:4: ( (lv_stringValue_1_0= RULE_WORD ) )
                    // InternalA2B.g:413:5: (lv_stringValue_1_0= RULE_WORD )
                    {
                    // InternalA2B.g:413:5: (lv_stringValue_1_0= RULE_WORD )
                    // InternalA2B.g:414:6: lv_stringValue_1_0= RULE_WORD
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
                    // InternalA2B.g:431:4: ( (lv_intValue_2_0= RULE_INT ) )
                    {
                    // InternalA2B.g:431:4: ( (lv_intValue_2_0= RULE_INT ) )
                    // InternalA2B.g:432:5: (lv_intValue_2_0= RULE_INT )
                    {
                    // InternalA2B.g:432:5: (lv_intValue_2_0= RULE_INT )
                    // InternalA2B.g:433:6: lv_intValue_2_0= RULE_INT
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

            // InternalA2B.g:450:3: ( (lv_crcValue_3_0= RULE_CRCCHECK ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_CRCCHECK) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalA2B.g:451:4: (lv_crcValue_3_0= RULE_CRCCHECK )
                    {
                    // InternalA2B.g:451:4: (lv_crcValue_3_0= RULE_CRCCHECK )
                    // InternalA2B.g:452:5: lv_crcValue_3_0= RULE_CRCCHECK
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
    // InternalA2B.g:472:1: entryRuleDD returns [EObject current=null] : iv_ruleDD= ruleDD EOF ;
    public final EObject entryRuleDD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDD = null;


        try {
            // InternalA2B.g:472:43: (iv_ruleDD= ruleDD EOF )
            // InternalA2B.g:473:2: iv_ruleDD= ruleDD EOF
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
    // InternalA2B.g:479:1: ruleDD returns [EObject current=null] : (otherlv_0= 'DD' ( ( (lv_stringValue_1_0= RULE_DOUBLEWORD ) ) | ( (lv_longValue_2_0= ruleLONG ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? ) ;
    public final EObject ruleDD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_stringValue_1_0=null;
        Token lv_crcValue_3_0=null;
        AntlrDatatypeRuleToken lv_longValue_2_0 = null;



        	enterRule();

        try {
            // InternalA2B.g:485:2: ( (otherlv_0= 'DD' ( ( (lv_stringValue_1_0= RULE_DOUBLEWORD ) ) | ( (lv_longValue_2_0= ruleLONG ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? ) )
            // InternalA2B.g:486:2: (otherlv_0= 'DD' ( ( (lv_stringValue_1_0= RULE_DOUBLEWORD ) ) | ( (lv_longValue_2_0= ruleLONG ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? )
            {
            // InternalA2B.g:486:2: (otherlv_0= 'DD' ( ( (lv_stringValue_1_0= RULE_DOUBLEWORD ) ) | ( (lv_longValue_2_0= ruleLONG ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )? )
            // InternalA2B.g:487:3: otherlv_0= 'DD' ( ( (lv_stringValue_1_0= RULE_DOUBLEWORD ) ) | ( (lv_longValue_2_0= ruleLONG ) ) ) ( (lv_crcValue_3_0= RULE_CRCCHECK ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDDAccess().getDDKeyword_0());
            		
            // InternalA2B.g:491:3: ( ( (lv_stringValue_1_0= RULE_DOUBLEWORD ) ) | ( (lv_longValue_2_0= ruleLONG ) ) )
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
                    // InternalA2B.g:492:4: ( (lv_stringValue_1_0= RULE_DOUBLEWORD ) )
                    {
                    // InternalA2B.g:492:4: ( (lv_stringValue_1_0= RULE_DOUBLEWORD ) )
                    // InternalA2B.g:493:5: (lv_stringValue_1_0= RULE_DOUBLEWORD )
                    {
                    // InternalA2B.g:493:5: (lv_stringValue_1_0= RULE_DOUBLEWORD )
                    // InternalA2B.g:494:6: lv_stringValue_1_0= RULE_DOUBLEWORD
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
                    // InternalA2B.g:511:4: ( (lv_longValue_2_0= ruleLONG ) )
                    {
                    // InternalA2B.g:511:4: ( (lv_longValue_2_0= ruleLONG ) )
                    // InternalA2B.g:512:5: (lv_longValue_2_0= ruleLONG )
                    {
                    // InternalA2B.g:512:5: (lv_longValue_2_0= ruleLONG )
                    // InternalA2B.g:513:6: lv_longValue_2_0= ruleLONG
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

            // InternalA2B.g:531:3: ( (lv_crcValue_3_0= RULE_CRCCHECK ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_CRCCHECK) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalA2B.g:532:4: (lv_crcValue_3_0= RULE_CRCCHECK )
                    {
                    // InternalA2B.g:532:4: (lv_crcValue_3_0= RULE_CRCCHECK )
                    // InternalA2B.g:533:5: lv_crcValue_3_0= RULE_CRCCHECK
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
    // InternalA2B.g:553:1: entryRuleSTR returns [EObject current=null] : iv_ruleSTR= ruleSTR EOF ;
    public final EObject entryRuleSTR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSTR = null;


        try {
            // InternalA2B.g:553:44: (iv_ruleSTR= ruleSTR EOF )
            // InternalA2B.g:554:2: iv_ruleSTR= ruleSTR EOF
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
    // InternalA2B.g:560:1: ruleSTR returns [EObject current=null] : (otherlv_0= 'STR' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? ) ;
    public final EObject ruleSTR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token lv_crcValue_2_0=null;


        	enterRule();

        try {
            // InternalA2B.g:566:2: ( (otherlv_0= 'STR' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? ) )
            // InternalA2B.g:567:2: (otherlv_0= 'STR' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? )
            {
            // InternalA2B.g:567:2: (otherlv_0= 'STR' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? )
            // InternalA2B.g:568:3: otherlv_0= 'STR' ( (lv_value_1_0= RULE_STRING ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSTRAccess().getSTRKeyword_0());
            		
            // InternalA2B.g:572:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalA2B.g:573:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalA2B.g:573:4: (lv_value_1_0= RULE_STRING )
            // InternalA2B.g:574:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

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

            // InternalA2B.g:590:3: ( (lv_crcValue_2_0= RULE_CRCCHECK ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_CRCCHECK) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalA2B.g:591:4: (lv_crcValue_2_0= RULE_CRCCHECK )
                    {
                    // InternalA2B.g:591:4: (lv_crcValue_2_0= RULE_CRCCHECK )
                    // InternalA2B.g:592:5: lv_crcValue_2_0= RULE_CRCCHECK
                    {
                    lv_crcValue_2_0=(Token)match(input,RULE_CRCCHECK,FOLLOW_2); 

                    					newLeafNode(lv_crcValue_2_0, grammarAccess.getSTRAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSTRRule());
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
    // $ANTLR end "ruleSTR"


    // $ANTLR start "entryRuleBase64Decode"
    // InternalA2B.g:612:1: entryRuleBase64Decode returns [EObject current=null] : iv_ruleBase64Decode= ruleBase64Decode EOF ;
    public final EObject entryRuleBase64Decode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBase64Decode = null;


        try {
            // InternalA2B.g:612:53: (iv_ruleBase64Decode= ruleBase64Decode EOF )
            // InternalA2B.g:613:2: iv_ruleBase64Decode= ruleBase64Decode EOF
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
    // InternalA2B.g:619:1: ruleBase64Decode returns [EObject current=null] : (otherlv_0= 'B64d' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleBase64Decode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalA2B.g:625:2: ( (otherlv_0= 'B64d' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalA2B.g:626:2: (otherlv_0= 'B64d' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalA2B.g:626:2: (otherlv_0= 'B64d' ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalA2B.g:627:3: otherlv_0= 'B64d' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getBase64DecodeAccess().getB64dKeyword_0());
            		
            // InternalA2B.g:631:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalA2B.g:632:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalA2B.g:632:4: (lv_value_1_0= RULE_STRING )
            // InternalA2B.g:633:5: lv_value_1_0= RULE_STRING
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
    // InternalA2B.g:653:1: entryRuleBase64Encode returns [EObject current=null] : iv_ruleBase64Encode= ruleBase64Encode EOF ;
    public final EObject entryRuleBase64Encode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBase64Encode = null;


        try {
            // InternalA2B.g:653:53: (iv_ruleBase64Encode= ruleBase64Encode EOF )
            // InternalA2B.g:654:2: iv_ruleBase64Encode= ruleBase64Encode EOF
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
    // InternalA2B.g:660:1: ruleBase64Encode returns [EObject current=null] : (otherlv_0= 'B64e' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleBase64Encode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalA2B.g:666:2: ( (otherlv_0= 'B64e' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalA2B.g:667:2: (otherlv_0= 'B64e' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalA2B.g:667:2: (otherlv_0= 'B64e' ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalA2B.g:668:3: otherlv_0= 'B64e' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getBase64EncodeAccess().getB64eKeyword_0());
            		
            // InternalA2B.g:672:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalA2B.g:673:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalA2B.g:673:4: (lv_value_1_0= RULE_STRING )
            // InternalA2B.g:674:5: lv_value_1_0= RULE_STRING
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


    // $ANTLR start "entryRulePAD"
    // InternalA2B.g:694:1: entryRulePAD returns [EObject current=null] : iv_rulePAD= rulePAD EOF ;
    public final EObject entryRulePAD() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePAD = null;


        try {
            // InternalA2B.g:694:44: (iv_rulePAD= rulePAD EOF )
            // InternalA2B.g:695:2: iv_rulePAD= rulePAD EOF
            {
             newCompositeNode(grammarAccess.getPADRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePAD=rulePAD();

            state._fsp--;

             current =iv_rulePAD; 
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
    // $ANTLR end "entryRulePAD"


    // $ANTLR start "rulePAD"
    // InternalA2B.g:701:1: rulePAD returns [EObject current=null] : (otherlv_0= 'PAD' ( (lv_value_1_0= RULE_INT ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? ) ;
    public final EObject rulePAD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token lv_crcValue_2_0=null;


        	enterRule();

        try {
            // InternalA2B.g:707:2: ( (otherlv_0= 'PAD' ( (lv_value_1_0= RULE_INT ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? ) )
            // InternalA2B.g:708:2: (otherlv_0= 'PAD' ( (lv_value_1_0= RULE_INT ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? )
            {
            // InternalA2B.g:708:2: (otherlv_0= 'PAD' ( (lv_value_1_0= RULE_INT ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? )
            // InternalA2B.g:709:3: otherlv_0= 'PAD' ( (lv_value_1_0= RULE_INT ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getPADAccess().getPADKeyword_0());
            		
            // InternalA2B.g:713:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalA2B.g:714:4: (lv_value_1_0= RULE_INT )
            {
            // InternalA2B.g:714:4: (lv_value_1_0= RULE_INT )
            // InternalA2B.g:715:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            					newLeafNode(lv_value_1_0, grammarAccess.getPADAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPADRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalA2B.g:731:3: ( (lv_crcValue_2_0= RULE_CRCCHECK ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_CRCCHECK) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalA2B.g:732:4: (lv_crcValue_2_0= RULE_CRCCHECK )
                    {
                    // InternalA2B.g:732:4: (lv_crcValue_2_0= RULE_CRCCHECK )
                    // InternalA2B.g:733:5: lv_crcValue_2_0= RULE_CRCCHECK
                    {
                    lv_crcValue_2_0=(Token)match(input,RULE_CRCCHECK,FOLLOW_2); 

                    					newLeafNode(lv_crcValue_2_0, grammarAccess.getPADAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPADRule());
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
    // $ANTLR end "rulePAD"


    // $ANTLR start "entryRuleINCLUDE"
    // InternalA2B.g:753:1: entryRuleINCLUDE returns [EObject current=null] : iv_ruleINCLUDE= ruleINCLUDE EOF ;
    public final EObject entryRuleINCLUDE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINCLUDE = null;


        try {
            // InternalA2B.g:753:48: (iv_ruleINCLUDE= ruleINCLUDE EOF )
            // InternalA2B.g:754:2: iv_ruleINCLUDE= ruleINCLUDE EOF
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
    // InternalA2B.g:760:1: ruleINCLUDE returns [EObject current=null] : (otherlv_0= 'INCLUDE' ( (lv_value_1_0= RULE_PATH ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? ) ;
    public final EObject ruleINCLUDE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token lv_crcValue_2_0=null;


        	enterRule();

        try {
            // InternalA2B.g:766:2: ( (otherlv_0= 'INCLUDE' ( (lv_value_1_0= RULE_PATH ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? ) )
            // InternalA2B.g:767:2: (otherlv_0= 'INCLUDE' ( (lv_value_1_0= RULE_PATH ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? )
            {
            // InternalA2B.g:767:2: (otherlv_0= 'INCLUDE' ( (lv_value_1_0= RULE_PATH ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? )
            // InternalA2B.g:768:3: otherlv_0= 'INCLUDE' ( (lv_value_1_0= RULE_PATH ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getINCLUDEAccess().getINCLUDEKeyword_0());
            		
            // InternalA2B.g:772:3: ( (lv_value_1_0= RULE_PATH ) )
            // InternalA2B.g:773:4: (lv_value_1_0= RULE_PATH )
            {
            // InternalA2B.g:773:4: (lv_value_1_0= RULE_PATH )
            // InternalA2B.g:774:5: lv_value_1_0= RULE_PATH
            {
            lv_value_1_0=(Token)match(input,RULE_PATH,FOLLOW_5); 

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

            // InternalA2B.g:790:3: ( (lv_crcValue_2_0= RULE_CRCCHECK ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_CRCCHECK) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalA2B.g:791:4: (lv_crcValue_2_0= RULE_CRCCHECK )
                    {
                    // InternalA2B.g:791:4: (lv_crcValue_2_0= RULE_CRCCHECK )
                    // InternalA2B.g:792:5: lv_crcValue_2_0= RULE_CRCCHECK
                    {
                    lv_crcValue_2_0=(Token)match(input,RULE_CRCCHECK,FOLLOW_2); 

                    					newLeafNode(lv_crcValue_2_0, grammarAccess.getINCLUDEAccess().getCrcValueCRCCHECKTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getINCLUDERule());
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
    // $ANTLR end "ruleINCLUDE"


    // $ANTLR start "entryRuleMAC"
    // InternalA2B.g:812:1: entryRuleMAC returns [EObject current=null] : iv_ruleMAC= ruleMAC EOF ;
    public final EObject entryRuleMAC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMAC = null;


        try {
            // InternalA2B.g:812:44: (iv_ruleMAC= ruleMAC EOF )
            // InternalA2B.g:813:2: iv_ruleMAC= ruleMAC EOF
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
    // InternalA2B.g:819:1: ruleMAC returns [EObject current=null] : (otherlv_0= 'MAC' ( (lv_value_1_0= RULE_MACADDRESS ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? ) ;
    public final EObject ruleMAC() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token lv_crcValue_2_0=null;


        	enterRule();

        try {
            // InternalA2B.g:825:2: ( (otherlv_0= 'MAC' ( (lv_value_1_0= RULE_MACADDRESS ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? ) )
            // InternalA2B.g:826:2: (otherlv_0= 'MAC' ( (lv_value_1_0= RULE_MACADDRESS ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? )
            {
            // InternalA2B.g:826:2: (otherlv_0= 'MAC' ( (lv_value_1_0= RULE_MACADDRESS ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? )
            // InternalA2B.g:827:3: otherlv_0= 'MAC' ( (lv_value_1_0= RULE_MACADDRESS ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getMACAccess().getMACKeyword_0());
            		
            // InternalA2B.g:831:3: ( (lv_value_1_0= RULE_MACADDRESS ) )
            // InternalA2B.g:832:4: (lv_value_1_0= RULE_MACADDRESS )
            {
            // InternalA2B.g:832:4: (lv_value_1_0= RULE_MACADDRESS )
            // InternalA2B.g:833:5: lv_value_1_0= RULE_MACADDRESS
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

            // InternalA2B.g:849:3: ( (lv_crcValue_2_0= RULE_CRCCHECK ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_CRCCHECK) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalA2B.g:850:4: (lv_crcValue_2_0= RULE_CRCCHECK )
                    {
                    // InternalA2B.g:850:4: (lv_crcValue_2_0= RULE_CRCCHECK )
                    // InternalA2B.g:851:5: lv_crcValue_2_0= RULE_CRCCHECK
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
    // InternalA2B.g:871:1: entryRuleIP returns [EObject current=null] : iv_ruleIP= ruleIP EOF ;
    public final EObject entryRuleIP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIP = null;


        try {
            // InternalA2B.g:871:43: (iv_ruleIP= ruleIP EOF )
            // InternalA2B.g:872:2: iv_ruleIP= ruleIP EOF
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
    // InternalA2B.g:878:1: ruleIP returns [EObject current=null] : (otherlv_0= 'IP' ( (lv_value_1_0= RULE_IPADDRESS ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? ) ;
    public final EObject ruleIP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token lv_crcValue_2_0=null;


        	enterRule();

        try {
            // InternalA2B.g:884:2: ( (otherlv_0= 'IP' ( (lv_value_1_0= RULE_IPADDRESS ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? ) )
            // InternalA2B.g:885:2: (otherlv_0= 'IP' ( (lv_value_1_0= RULE_IPADDRESS ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? )
            {
            // InternalA2B.g:885:2: (otherlv_0= 'IP' ( (lv_value_1_0= RULE_IPADDRESS ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? )
            // InternalA2B.g:886:3: otherlv_0= 'IP' ( (lv_value_1_0= RULE_IPADDRESS ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getIPAccess().getIPKeyword_0());
            		
            // InternalA2B.g:890:3: ( (lv_value_1_0= RULE_IPADDRESS ) )
            // InternalA2B.g:891:4: (lv_value_1_0= RULE_IPADDRESS )
            {
            // InternalA2B.g:891:4: (lv_value_1_0= RULE_IPADDRESS )
            // InternalA2B.g:892:5: lv_value_1_0= RULE_IPADDRESS
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

            // InternalA2B.g:908:3: ( (lv_crcValue_2_0= RULE_CRCCHECK ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_CRCCHECK) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalA2B.g:909:4: (lv_crcValue_2_0= RULE_CRCCHECK )
                    {
                    // InternalA2B.g:909:4: (lv_crcValue_2_0= RULE_CRCCHECK )
                    // InternalA2B.g:910:5: lv_crcValue_2_0= RULE_CRCCHECK
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


    // $ANTLR start "entryRulePXL"
    // InternalA2B.g:930:1: entryRulePXL returns [EObject current=null] : iv_rulePXL= rulePXL EOF ;
    public final EObject entryRulePXL() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePXL = null;


        try {
            // InternalA2B.g:930:44: (iv_rulePXL= rulePXL EOF )
            // InternalA2B.g:931:2: iv_rulePXL= rulePXL EOF
            {
             newCompositeNode(grammarAccess.getPXLRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePXL=rulePXL();

            state._fsp--;

             current =iv_rulePXL; 
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
    // $ANTLR end "entryRulePXL"


    // $ANTLR start "rulePXL"
    // InternalA2B.g:937:1: rulePXL returns [EObject current=null] : (otherlv_0= 'PXL' ( (lv_value_1_0= RULE_PIXEL ) ) ) ;
    public final EObject rulePXL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalA2B.g:943:2: ( (otherlv_0= 'PXL' ( (lv_value_1_0= RULE_PIXEL ) ) ) )
            // InternalA2B.g:944:2: (otherlv_0= 'PXL' ( (lv_value_1_0= RULE_PIXEL ) ) )
            {
            // InternalA2B.g:944:2: (otherlv_0= 'PXL' ( (lv_value_1_0= RULE_PIXEL ) ) )
            // InternalA2B.g:945:3: otherlv_0= 'PXL' ( (lv_value_1_0= RULE_PIXEL ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPXLAccess().getPXLKeyword_0());
            		
            // InternalA2B.g:949:3: ( (lv_value_1_0= RULE_PIXEL ) )
            // InternalA2B.g:950:4: (lv_value_1_0= RULE_PIXEL )
            {
            // InternalA2B.g:950:4: (lv_value_1_0= RULE_PIXEL )
            // InternalA2B.g:951:5: lv_value_1_0= RULE_PIXEL
            {
            lv_value_1_0=(Token)match(input,RULE_PIXEL,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getPXLAccess().getValuePIXELTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPXLRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"a2b.A2B.PIXEL");
            				

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
    // $ANTLR end "rulePXL"


    // $ANTLR start "entryRuleHXS"
    // InternalA2B.g:971:1: entryRuleHXS returns [EObject current=null] : iv_ruleHXS= ruleHXS EOF ;
    public final EObject entryRuleHXS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHXS = null;


        try {
            // InternalA2B.g:971:44: (iv_ruleHXS= ruleHXS EOF )
            // InternalA2B.g:972:2: iv_ruleHXS= ruleHXS EOF
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
    // InternalA2B.g:978:1: ruleHXS returns [EObject current=null] : (otherlv_0= 'HXS' ( (lv_value_1_0= RULE_HEXSTRING ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? ) ;
    public final EObject ruleHXS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token lv_crcValue_2_0=null;


        	enterRule();

        try {
            // InternalA2B.g:984:2: ( (otherlv_0= 'HXS' ( (lv_value_1_0= RULE_HEXSTRING ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? ) )
            // InternalA2B.g:985:2: (otherlv_0= 'HXS' ( (lv_value_1_0= RULE_HEXSTRING ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? )
            {
            // InternalA2B.g:985:2: (otherlv_0= 'HXS' ( (lv_value_1_0= RULE_HEXSTRING ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )? )
            // InternalA2B.g:986:3: otherlv_0= 'HXS' ( (lv_value_1_0= RULE_HEXSTRING ) ) ( (lv_crcValue_2_0= RULE_CRCCHECK ) )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getHXSAccess().getHXSKeyword_0());
            		
            // InternalA2B.g:990:3: ( (lv_value_1_0= RULE_HEXSTRING ) )
            // InternalA2B.g:991:4: (lv_value_1_0= RULE_HEXSTRING )
            {
            // InternalA2B.g:991:4: (lv_value_1_0= RULE_HEXSTRING )
            // InternalA2B.g:992:5: lv_value_1_0= RULE_HEXSTRING
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

            // InternalA2B.g:1008:3: ( (lv_crcValue_2_0= RULE_CRCCHECK ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_CRCCHECK) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalA2B.g:1009:4: (lv_crcValue_2_0= RULE_CRCCHECK )
                    {
                    // InternalA2B.g:1009:4: (lv_crcValue_2_0= RULE_CRCCHECK )
                    // InternalA2B.g:1010:5: lv_crcValue_2_0= RULE_CRCCHECK
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
    // InternalA2B.g:1030:1: entryRuleBE returns [String current=null] : iv_ruleBE= ruleBE EOF ;
    public final String entryRuleBE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBE = null;


        try {
            // InternalA2B.g:1030:42: (iv_ruleBE= ruleBE EOF )
            // InternalA2B.g:1031:2: iv_ruleBE= ruleBE EOF
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
    // InternalA2B.g:1037:1: ruleBE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'BE' ;
    public final AntlrDatatypeRuleToken ruleBE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalA2B.g:1043:2: (kw= 'BE' )
            // InternalA2B.g:1044:2: kw= 'BE'
            {
            kw=(Token)match(input,35,FOLLOW_2); 

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
    // InternalA2B.g:1052:1: entryRuleLE returns [String current=null] : iv_ruleLE= ruleLE EOF ;
    public final String entryRuleLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLE = null;


        try {
            // InternalA2B.g:1052:42: (iv_ruleLE= ruleLE EOF )
            // InternalA2B.g:1053:2: iv_ruleLE= ruleLE EOF
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
    // InternalA2B.g:1059:1: ruleLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'LE' ;
    public final AntlrDatatypeRuleToken ruleLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalA2B.g:1065:2: (kw= 'LE' )
            // InternalA2B.g:1066:2: kw= 'LE'
            {
            kw=(Token)match(input,36,FOLLOW_2); 

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
    // InternalA2B.g:1074:1: entryRulePCAP returns [String current=null] : iv_rulePCAP= rulePCAP EOF ;
    public final String entryRulePCAP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePCAP = null;


        try {
            // InternalA2B.g:1074:44: (iv_rulePCAP= rulePCAP EOF )
            // InternalA2B.g:1075:2: iv_rulePCAP= rulePCAP EOF
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
    // InternalA2B.g:1081:1: rulePCAP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'PCAP' ;
    public final AntlrDatatypeRuleToken rulePCAP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalA2B.g:1087:2: (kw= 'PCAP' )
            // InternalA2B.g:1088:2: kw= 'PCAP'
            {
            kw=(Token)match(input,37,FOLLOW_2); 

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


    // $ANTLR start "entryRuleNL"
    // InternalA2B.g:1096:1: entryRuleNL returns [String current=null] : iv_ruleNL= ruleNL EOF ;
    public final String entryRuleNL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNL = null;


        try {
            // InternalA2B.g:1096:42: (iv_ruleNL= ruleNL EOF )
            // InternalA2B.g:1097:2: iv_ruleNL= ruleNL EOF
            {
             newCompositeNode(grammarAccess.getNLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNL=ruleNL();

            state._fsp--;

             current =iv_ruleNL.getText(); 
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
    // $ANTLR end "entryRuleNL"


    // $ANTLR start "ruleNL"
    // InternalA2B.g:1103:1: ruleNL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '\\\\n' ;
    public final AntlrDatatypeRuleToken ruleNL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalA2B.g:1109:2: (kw= '\\\\n' )
            // InternalA2B.g:1110:2: kw= '\\\\n'
            {
            kw=(Token)match(input,38,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getNLAccess().getNKeyword());
            	

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
    // $ANTLR end "ruleNL"


    // $ANTLR start "entryRuleCRC16"
    // InternalA2B.g:1118:1: entryRuleCRC16 returns [EObject current=null] : iv_ruleCRC16= ruleCRC16 EOF ;
    public final EObject entryRuleCRC16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCRC16 = null;


        try {
            // InternalA2B.g:1118:46: (iv_ruleCRC16= ruleCRC16 EOF )
            // InternalA2B.g:1119:2: iv_ruleCRC16= ruleCRC16 EOF
            {
             newCompositeNode(grammarAccess.getCRC16Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCRC16=ruleCRC16();

            state._fsp--;

             current =iv_ruleCRC16; 
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
    // $ANTLR end "entryRuleCRC16"


    // $ANTLR start "ruleCRC16"
    // InternalA2B.g:1125:1: ruleCRC16 returns [EObject current=null] : (otherlv_0= 'CRC16' ( (lv_crcValue_1_0= RULE_CRCCHECK ) ) ) ;
    public final EObject ruleCRC16() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_crcValue_1_0=null;


        	enterRule();

        try {
            // InternalA2B.g:1131:2: ( (otherlv_0= 'CRC16' ( (lv_crcValue_1_0= RULE_CRCCHECK ) ) ) )
            // InternalA2B.g:1132:2: (otherlv_0= 'CRC16' ( (lv_crcValue_1_0= RULE_CRCCHECK ) ) )
            {
            // InternalA2B.g:1132:2: (otherlv_0= 'CRC16' ( (lv_crcValue_1_0= RULE_CRCCHECK ) ) )
            // InternalA2B.g:1133:3: otherlv_0= 'CRC16' ( (lv_crcValue_1_0= RULE_CRCCHECK ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getCRC16Access().getCRC16Keyword_0());
            		
            // InternalA2B.g:1137:3: ( (lv_crcValue_1_0= RULE_CRCCHECK ) )
            // InternalA2B.g:1138:4: (lv_crcValue_1_0= RULE_CRCCHECK )
            {
            // InternalA2B.g:1138:4: (lv_crcValue_1_0= RULE_CRCCHECK )
            // InternalA2B.g:1139:5: lv_crcValue_1_0= RULE_CRCCHECK
            {
            lv_crcValue_1_0=(Token)match(input,RULE_CRCCHECK,FOLLOW_2); 

            					newLeafNode(lv_crcValue_1_0, grammarAccess.getCRC16Access().getCrcValueCRCCHECKTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCRC16Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"crcValue",
            						lv_crcValue_1_0,
            						"a2b.A2B.CRCCHECK");
            				

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
    // $ANTLR end "ruleCRC16"


    // $ANTLR start "entryRuleCRC32"
    // InternalA2B.g:1159:1: entryRuleCRC32 returns [EObject current=null] : iv_ruleCRC32= ruleCRC32 EOF ;
    public final EObject entryRuleCRC32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCRC32 = null;


        try {
            // InternalA2B.g:1159:46: (iv_ruleCRC32= ruleCRC32 EOF )
            // InternalA2B.g:1160:2: iv_ruleCRC32= ruleCRC32 EOF
            {
             newCompositeNode(grammarAccess.getCRC32Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCRC32=ruleCRC32();

            state._fsp--;

             current =iv_ruleCRC32; 
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
    // $ANTLR end "entryRuleCRC32"


    // $ANTLR start "ruleCRC32"
    // InternalA2B.g:1166:1: ruleCRC32 returns [EObject current=null] : (otherlv_0= 'CRC32' ( (lv_crcValue_1_0= RULE_CRCCHECK ) ) ) ;
    public final EObject ruleCRC32() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_crcValue_1_0=null;


        	enterRule();

        try {
            // InternalA2B.g:1172:2: ( (otherlv_0= 'CRC32' ( (lv_crcValue_1_0= RULE_CRCCHECK ) ) ) )
            // InternalA2B.g:1173:2: (otherlv_0= 'CRC32' ( (lv_crcValue_1_0= RULE_CRCCHECK ) ) )
            {
            // InternalA2B.g:1173:2: (otherlv_0= 'CRC32' ( (lv_crcValue_1_0= RULE_CRCCHECK ) ) )
            // InternalA2B.g:1174:3: otherlv_0= 'CRC32' ( (lv_crcValue_1_0= RULE_CRCCHECK ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getCRC32Access().getCRC32Keyword_0());
            		
            // InternalA2B.g:1178:3: ( (lv_crcValue_1_0= RULE_CRCCHECK ) )
            // InternalA2B.g:1179:4: (lv_crcValue_1_0= RULE_CRCCHECK )
            {
            // InternalA2B.g:1179:4: (lv_crcValue_1_0= RULE_CRCCHECK )
            // InternalA2B.g:1180:5: lv_crcValue_1_0= RULE_CRCCHECK
            {
            lv_crcValue_1_0=(Token)match(input,RULE_CRCCHECK,FOLLOW_2); 

            					newLeafNode(lv_crcValue_1_0, grammarAccess.getCRC32Access().getCrcValueCRCCHECKTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCRC32Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"crcValue",
            						lv_crcValue_1_0,
            						"a2b.A2B.CRCCHECK");
            				

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
    // $ANTLR end "ruleCRC32"


    // $ANTLR start "entryRuleLONG"
    // InternalA2B.g:1200:1: entryRuleLONG returns [String current=null] : iv_ruleLONG= ruleLONG EOF ;
    public final String entryRuleLONG() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLONG = null;


        try {
            // InternalA2B.g:1200:44: (iv_ruleLONG= ruleLONG EOF )
            // InternalA2B.g:1201:2: iv_ruleLONG= ruleLONG EOF
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
    // InternalA2B.g:1207:1: ruleLONG returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleLONG() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalA2B.g:1213:2: (this_INT_0= RULE_INT )
            // InternalA2B.g:1214:2: this_INT_0= RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000001FFFF800002L});
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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});

}