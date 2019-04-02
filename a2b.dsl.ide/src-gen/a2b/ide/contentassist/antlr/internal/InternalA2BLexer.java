package a2b.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalA2BLexer extends Lexer {
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

    public InternalA2BLexer() {;} 
    public InternalA2BLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalA2BLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalA2B.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:11:7: ( 'BE' )
            // InternalA2B.g:11:9: 'BE'
            {
            match("BE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:12:7: ( 'LE' )
            // InternalA2B.g:12:9: 'LE'
            {
            match("LE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:13:7: ( 'PCAP' )
            // InternalA2B.g:13:9: 'PCAP'
            {
            match("PCAP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:14:7: ( 'DB' )
            // InternalA2B.g:14:9: 'DB'
            {
            match("DB"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:15:7: ( 'DW' )
            // InternalA2B.g:15:9: 'DW'
            {
            match("DW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:16:7: ( 'DD' )
            // InternalA2B.g:16:9: 'DD'
            {
            match("DD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:17:7: ( 'B64' )
            // InternalA2B.g:17:9: 'B64'
            {
            match("B64"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:18:7: ( 'ORG' )
            // InternalA2B.g:18:9: 'ORG'
            {
            match("ORG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:19:7: ( 'INCLUDE' )
            // InternalA2B.g:19:9: 'INCLUDE'
            {
            match("INCLUDE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:20:7: ( 'MAC' )
            // InternalA2B.g:20:9: 'MAC'
            {
            match("MAC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:21:7: ( 'IP' )
            // InternalA2B.g:21:9: 'IP'
            {
            match("IP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:22:7: ( 'HXS' )
            // InternalA2B.g:22:9: 'HXS'
            {
            match("HXS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "RULE_DECIMALBYTE_"
    public final void mRULE_DECIMALBYTE_() throws RecognitionException {
        try {
            // InternalA2B.g:1414:28: ( ( ( '1' .. '9' )? '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '4' '0' .. '9' | '2' '5' '0' .. '5' ) )
            // InternalA2B.g:1414:30: ( ( '1' .. '9' )? '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '4' '0' .. '9' | '2' '5' '0' .. '5' )
            {
            // InternalA2B.g:1414:30: ( ( '1' .. '9' )? '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '4' '0' .. '9' | '2' '5' '0' .. '5' )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalA2B.g:1414:31: ( '1' .. '9' )? '0' .. '9'
                    {
                    // InternalA2B.g:1414:31: ( '1' .. '9' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>='1' && LA1_0<='9')) ) {
                        int LA1_1 = input.LA(2);

                        if ( ((LA1_1>='0' && LA1_1<='9')) ) {
                            alt1=1;
                        }
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalA2B.g:1414:32: '1' .. '9'
                            {
                            matchRange('1','9'); 

                            }
                            break;

                    }

                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // InternalA2B.g:1414:52: '1' '0' .. '9' '0' .. '9'
                    {
                    match('1'); 
                    matchRange('0','9'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 3 :
                    // InternalA2B.g:1414:74: '2' '0' .. '4' '0' .. '9'
                    {
                    match('2'); 
                    matchRange('0','4'); 
                    matchRange('0','9'); 

                    }
                    break;
                case 4 :
                    // InternalA2B.g:1414:96: '2' '5' '0' .. '5'
                    {
                    match('2'); 
                    match('5'); 
                    matchRange('0','5'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMALBYTE_"

    // $ANTLR start "RULE_BINARY_"
    public final void mRULE_BINARY_() throws RecognitionException {
        try {
            // InternalA2B.g:1416:23: ( ( '0' | '1' ) ( '0' | '1' ) ( '0' | '1' ) ( '0' | '1' ) ( '0' | '1' ) ( '0' | '1' ) ( '0' | '1' ) ( '0' | '1' ) )
            // InternalA2B.g:1416:25: ( '0' | '1' ) ( '0' | '1' ) ( '0' | '1' ) ( '0' | '1' ) ( '0' | '1' ) ( '0' | '1' ) ( '0' | '1' ) ( '0' | '1' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BINARY_"

    // $ANTLR start "RULE_HEX_"
    public final void mRULE_HEX_() throws RecognitionException {
        try {
            // InternalA2B.g:1418:20: ( ( 'A' .. 'F' | 'a' .. 'f' | '0' .. '9' ) ( 'A' .. 'F' | 'a' .. 'f' | '0' .. '9' ) )
            // InternalA2B.g:1418:22: ( 'A' .. 'F' | 'a' .. 'f' | '0' .. '9' ) ( 'A' .. 'F' | 'a' .. 'f' | '0' .. '9' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_"

    // $ANTLR start "RULE_BYTE"
    public final void mRULE_BYTE() throws RecognitionException {
        try {
            int _type = RULE_BYTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:1420:11: ( ( '0b' RULE_BINARY_ | '0x' RULE_HEX_ ) )
            // InternalA2B.g:1420:13: ( '0b' RULE_BINARY_ | '0x' RULE_HEX_ )
            {
            // InternalA2B.g:1420:13: ( '0b' RULE_BINARY_ | '0x' RULE_HEX_ )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='0') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='b') ) {
                    alt3=1;
                }
                else if ( (LA3_1=='x') ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalA2B.g:1420:14: '0b' RULE_BINARY_
                    {
                    match("0b"); 

                    mRULE_BINARY_(); 

                    }
                    break;
                case 2 :
                    // InternalA2B.g:1420:32: '0x' RULE_HEX_
                    {
                    match("0x"); 

                    mRULE_HEX_(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BYTE"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:1422:11: ( ( '0b' RULE_BINARY_ RULE_BINARY_ | '0x' RULE_HEX_ RULE_HEX_ ) )
            // InternalA2B.g:1422:13: ( '0b' RULE_BINARY_ RULE_BINARY_ | '0x' RULE_HEX_ RULE_HEX_ )
            {
            // InternalA2B.g:1422:13: ( '0b' RULE_BINARY_ RULE_BINARY_ | '0x' RULE_HEX_ RULE_HEX_ )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='b') ) {
                    alt4=1;
                }
                else if ( (LA4_1=='x') ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalA2B.g:1422:14: '0b' RULE_BINARY_ RULE_BINARY_
                    {
                    match("0b"); 

                    mRULE_BINARY_(); 
                    mRULE_BINARY_(); 

                    }
                    break;
                case 2 :
                    // InternalA2B.g:1422:45: '0x' RULE_HEX_ RULE_HEX_
                    {
                    match("0x"); 

                    mRULE_HEX_(); 
                    mRULE_HEX_(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD"

    // $ANTLR start "RULE_DOUBLEWORD"
    public final void mRULE_DOUBLEWORD() throws RecognitionException {
        try {
            int _type = RULE_DOUBLEWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:1424:17: ( ( '0b' RULE_BINARY_ RULE_BINARY_ RULE_BINARY_ RULE_BINARY_ | '0x' RULE_HEX_ RULE_HEX_ RULE_HEX_ RULE_HEX_ ) )
            // InternalA2B.g:1424:19: ( '0b' RULE_BINARY_ RULE_BINARY_ RULE_BINARY_ RULE_BINARY_ | '0x' RULE_HEX_ RULE_HEX_ RULE_HEX_ RULE_HEX_ )
            {
            // InternalA2B.g:1424:19: ( '0b' RULE_BINARY_ RULE_BINARY_ RULE_BINARY_ RULE_BINARY_ | '0x' RULE_HEX_ RULE_HEX_ RULE_HEX_ RULE_HEX_ )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='0') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='b') ) {
                    alt5=1;
                }
                else if ( (LA5_1=='x') ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalA2B.g:1424:20: '0b' RULE_BINARY_ RULE_BINARY_ RULE_BINARY_ RULE_BINARY_
                    {
                    match("0b"); 

                    mRULE_BINARY_(); 
                    mRULE_BINARY_(); 
                    mRULE_BINARY_(); 
                    mRULE_BINARY_(); 

                    }
                    break;
                case 2 :
                    // InternalA2B.g:1424:77: '0x' RULE_HEX_ RULE_HEX_ RULE_HEX_ RULE_HEX_
                    {
                    match("0x"); 

                    mRULE_HEX_(); 
                    mRULE_HEX_(); 
                    mRULE_HEX_(); 
                    mRULE_HEX_(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLEWORD"

    // $ANTLR start "RULE_PATH"
    public final void mRULE_PATH() throws RecognitionException {
        try {
            int _type = RULE_PATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:1426:11: ( ( 'A' .. 'Z' ':' )? ( '/' ( 'a' .. 'z' | 'A' .. 'Z' )* )+ ( '.' ( 'a' .. 'z' | 'A' .. 'Z' )* )+ )
            // InternalA2B.g:1426:13: ( 'A' .. 'Z' ':' )? ( '/' ( 'a' .. 'z' | 'A' .. 'Z' )* )+ ( '.' ( 'a' .. 'z' | 'A' .. 'Z' )* )+
            {
            // InternalA2B.g:1426:13: ( 'A' .. 'Z' ':' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>='A' && LA6_0<='Z')) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalA2B.g:1426:14: 'A' .. 'Z' ':'
                    {
                    matchRange('A','Z'); 
                    match(':'); 

                    }
                    break;

            }

            // InternalA2B.g:1426:29: ( '/' ( 'a' .. 'z' | 'A' .. 'Z' )* )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='/') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalA2B.g:1426:30: '/' ( 'a' .. 'z' | 'A' .. 'Z' )*
            	    {
            	    match('/'); 
            	    // InternalA2B.g:1426:34: ( 'a' .. 'z' | 'A' .. 'Z' )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( ((LA7_0>='A' && LA7_0<='Z')||(LA7_0>='a' && LA7_0<='z')) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalA2B.g:
            	    	    {
            	    	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // InternalA2B.g:1426:57: ( '.' ( 'a' .. 'z' | 'A' .. 'Z' )* )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='.') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalA2B.g:1426:58: '.' ( 'a' .. 'z' | 'A' .. 'Z' )*
            	    {
            	    match('.'); 
            	    // InternalA2B.g:1426:62: ( 'a' .. 'z' | 'A' .. 'Z' )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( ((LA9_0>='A' && LA9_0<='Z')||(LA9_0>='a' && LA9_0<='z')) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalA2B.g:
            	    	    {
            	    	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PATH"

    // $ANTLR start "RULE_MACADDRESS"
    public final void mRULE_MACADDRESS() throws RecognitionException {
        try {
            int _type = RULE_MACADDRESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:1428:17: ( RULE_HEX_ ':' RULE_HEX_ ':' RULE_HEX_ ':' RULE_HEX_ ':' RULE_HEX_ ':' RULE_HEX_ )
            // InternalA2B.g:1428:19: RULE_HEX_ ':' RULE_HEX_ ':' RULE_HEX_ ':' RULE_HEX_ ':' RULE_HEX_ ':' RULE_HEX_
            {
            mRULE_HEX_(); 
            match(':'); 
            mRULE_HEX_(); 
            match(':'); 
            mRULE_HEX_(); 
            match(':'); 
            mRULE_HEX_(); 
            match(':'); 
            mRULE_HEX_(); 
            match(':'); 
            mRULE_HEX_(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MACADDRESS"

    // $ANTLR start "RULE_IPADDRESS"
    public final void mRULE_IPADDRESS() throws RecognitionException {
        try {
            int _type = RULE_IPADDRESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:1430:16: ( RULE_DECIMALBYTE_ '.' RULE_DECIMALBYTE_ '.' RULE_DECIMALBYTE_ '.' RULE_DECIMALBYTE_ )
            // InternalA2B.g:1430:18: RULE_DECIMALBYTE_ '.' RULE_DECIMALBYTE_ '.' RULE_DECIMALBYTE_ '.' RULE_DECIMALBYTE_
            {
            mRULE_DECIMALBYTE_(); 
            match('.'); 
            mRULE_DECIMALBYTE_(); 
            match('.'); 
            mRULE_DECIMALBYTE_(); 
            match('.'); 
            mRULE_DECIMALBYTE_(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IPADDRESS"

    // $ANTLR start "RULE_HEXSTRING"
    public final void mRULE_HEXSTRING() throws RecognitionException {
        try {
            int _type = RULE_HEXSTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:1432:16: ( '0h' ( RULE_HEX_ )+ )
            // InternalA2B.g:1432:18: '0h' ( RULE_HEX_ )+
            {
            match("0h"); 

            // InternalA2B.g:1432:23: ( RULE_HEX_ )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='F')||(LA11_0>='a' && LA11_0<='f')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalA2B.g:1432:23: RULE_HEX_
            	    {
            	    mRULE_HEX_(); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXSTRING"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:1434:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalA2B.g:1434:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalA2B.g:1434:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalA2B.g:1434:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalA2B.g:1434:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalA2B.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:1436:10: ( ( '0' .. '9' )+ )
            // InternalA2B.g:1436:12: ( '0' .. '9' )+
            {
            // InternalA2B.g:1436:12: ( '0' .. '9' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalA2B.g:1436:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:1438:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalA2B.g:1438:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalA2B.g:1438:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\"') ) {
                alt17=1;
            }
            else if ( (LA17_0=='\'') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalA2B.g:1438:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalA2B.g:1438:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalA2B.g:1438:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalA2B.g:1438:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalA2B.g:1438:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalA2B.g:1438:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalA2B.g:1438:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalA2B.g:1438:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:1440:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalA2B.g:1440:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalA2B.g:1440:24: ( options {greedy=false; } : . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='*') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='/') ) {
                        alt18=2;
                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='.')||(LA18_1>='0' && LA18_1<='\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<=')')||(LA18_0>='+' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalA2B.g:1440:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:1442:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalA2B.g:1442:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalA2B.g:1442:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalA2B.g:1442:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalA2B.g:1442:40: ( ( '\\r' )? '\\n' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\n'||LA21_0=='\r') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalA2B.g:1442:41: ( '\\r' )? '\\n'
                    {
                    // InternalA2B.g:1442:41: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalA2B.g:1442:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:1444:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalA2B.g:1444:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalA2B.g:1444:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalA2B.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalA2B.g:1446:16: ( . )
            // InternalA2B.g:1446:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalA2B.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_BYTE | RULE_WORD | RULE_DOUBLEWORD | RULE_PATH | RULE_MACADDRESS | RULE_IPADDRESS | RULE_HEXSTRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt23=26;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // InternalA2B.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // InternalA2B.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // InternalA2B.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // InternalA2B.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // InternalA2B.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // InternalA2B.g:1:40: T__26
                {
                mT__26(); 

                }
                break;
            case 7 :
                // InternalA2B.g:1:46: T__27
                {
                mT__27(); 

                }
                break;
            case 8 :
                // InternalA2B.g:1:52: T__28
                {
                mT__28(); 

                }
                break;
            case 9 :
                // InternalA2B.g:1:58: T__29
                {
                mT__29(); 

                }
                break;
            case 10 :
                // InternalA2B.g:1:64: T__30
                {
                mT__30(); 

                }
                break;
            case 11 :
                // InternalA2B.g:1:70: T__31
                {
                mT__31(); 

                }
                break;
            case 12 :
                // InternalA2B.g:1:76: T__32
                {
                mT__32(); 

                }
                break;
            case 13 :
                // InternalA2B.g:1:82: RULE_BYTE
                {
                mRULE_BYTE(); 

                }
                break;
            case 14 :
                // InternalA2B.g:1:92: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 15 :
                // InternalA2B.g:1:102: RULE_DOUBLEWORD
                {
                mRULE_DOUBLEWORD(); 

                }
                break;
            case 16 :
                // InternalA2B.g:1:118: RULE_PATH
                {
                mRULE_PATH(); 

                }
                break;
            case 17 :
                // InternalA2B.g:1:128: RULE_MACADDRESS
                {
                mRULE_MACADDRESS(); 

                }
                break;
            case 18 :
                // InternalA2B.g:1:144: RULE_IPADDRESS
                {
                mRULE_IPADDRESS(); 

                }
                break;
            case 19 :
                // InternalA2B.g:1:159: RULE_HEXSTRING
                {
                mRULE_HEXSTRING(); 

                }
                break;
            case 20 :
                // InternalA2B.g:1:174: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // InternalA2B.g:1:182: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 22 :
                // InternalA2B.g:1:191: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 23 :
                // InternalA2B.g:1:203: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // InternalA2B.g:1:219: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 25 :
                // InternalA2B.g:1:235: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 26 :
                // InternalA2B.g:1:243: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA2_eotS =
        "\1\uffff\1\2\1\uffff\4\2\3\uffff";
    static final String DFA2_eofS =
        "\12\uffff";
    static final String DFA2_minS =
        "\2\60\1\uffff\4\60\3\uffff";
    static final String DFA2_maxS =
        "\2\71\1\uffff\1\65\2\71\1\65\3\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\1\4\uffff\1\2\1\3\1\4";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\1\1\3\7\2",
            "\12\4",
            "",
            "\5\5\1\6",
            "\12\7",
            "\12\10",
            "\6\11",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "1414:30: ( ( '1' .. '9' )? '0' .. '9' | '1' '0' .. '9' '0' .. '9' | '2' '0' .. '4' '0' .. '9' | '2' '5' '0' .. '5' )";
        }
    }
    static final String DFA23_eotS =
        "\1\uffff\10\33\1\52\1\33\1\26\1\33\1\52\1\33\2\52\1\26\1\uffff\2\26\2\uffff\1\65\1\33\1\uffff\1\33\1\uffff\1\67\1\33\1\71\1\72\1\73\2\33\1\76\2\33\2\uffff\1\52\5\uffff\1\104\4\52\3\uffff\1\112\1\uffff\1\33\3\uffff\1\114\1\33\1\uffff\1\116\1\117\2\uffff\1\104\1\uffff\1\31\1\104\3\52\1\uffff\1\123\1\uffff\1\33\3\uffff\1\126\1\31\1\uffff\1\33\3\uffff\1\33\1\uffff\1\135\1\137\6\uffff\1\126\7\uffff\1\135";
    static final String DFA23_eofS =
        "\153\uffff";
    static final String DFA23_minS =
        "\1\0\1\60\2\72\1\60\4\72\1\56\1\60\1\52\1\72\1\56\1\60\2\56\1\101\1\uffff\2\0\2\uffff\1\60\1\64\1\uffff\1\72\1\uffff\1\60\1\101\3\60\1\107\1\103\1\60\1\103\1\123\2\60\1\72\5\uffff\5\56\3\uffff\1\60\1\uffff\1\120\3\uffff\1\60\1\114\1\uffff\4\60\1\56\1\uffff\1\0\4\56\1\uffff\1\60\1\uffff\1\125\2\uffff\2\60\1\0\1\uffff\1\104\1\60\1\uffff\1\60\1\105\4\60\3\uffff\13\60";
    static final String DFA23_maxS =
        "\1\uffff\1\146\1\105\1\103\1\146\1\122\1\120\1\101\1\130\1\170\1\146\1\172\1\72\4\146\1\172\1\uffff\2\uffff\2\uffff\1\172\1\72\1\uffff\1\72\1\uffff\1\172\1\101\3\172\1\107\1\103\1\172\1\103\1\123\1\72\1\146\1\72\5\uffff\1\172\4\72\3\uffff\1\172\1\uffff\1\120\3\uffff\1\172\1\114\1\uffff\2\172\1\61\1\146\1\172\1\uffff\1\uffff\1\172\3\56\1\uffff\1\172\1\uffff\1\125\2\uffff\1\61\1\146\1\uffff\1\uffff\1\104\1\61\1\uffff\1\146\1\105\1\61\1\146\1\172\1\61\3\uffff\13\61";
    static final String DFA23_acceptS =
        "\22\uffff\1\24\2\uffff\1\31\1\32\2\uffff\1\20\1\uffff\1\24\15\uffff\1\23\1\25\1\22\1\21\1\27\5\uffff\1\26\1\31\1\1\1\uffff\1\2\1\uffff\1\4\1\5\1\6\2\uffff\1\13\5\uffff\1\30\5\uffff\1\7\1\uffff\1\10\1\uffff\1\12\1\14\3\uffff\1\3\2\uffff\1\15\6\uffff\1\16\1\17\1\11\13\uffff";
    static final String DFA23_specialS =
        "\1\1\22\uffff\1\4\1\0\60\uffff\1\3\14\uffff\1\2\30\uffff}>";
    static final String[] DFA23_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\23\4\26\1\24\7\26\1\13\1\11\1\15\1\17\7\20\7\26\1\12\1\1\1\12\1\4\2\12\1\14\1\10\1\6\2\14\1\2\1\7\1\14\1\5\1\3\12\14\3\26\1\21\1\22\1\26\6\16\24\22\uff85\26",
            "\6\32\1\30\3\32\1\31\6\uffff\4\32\1\27\1\32\32\uffff\6\32",
            "\1\31\12\uffff\1\34",
            "\1\31\10\uffff\1\35",
            "\12\32\1\31\6\uffff\1\32\1\36\1\32\1\40\2\32\20\uffff\1\37\11\uffff\6\32",
            "\1\31\27\uffff\1\41",
            "\1\31\23\uffff\1\42\1\uffff\1\43",
            "\1\31\6\uffff\1\44",
            "\1\31\35\uffff\1\45",
            "\1\53\1\uffff\12\50\7\uffff\6\54\32\uffff\1\54\1\46\4\54\1\uffff\1\51\17\uffff\1\47",
            "\12\32\1\31\6\uffff\6\32\32\uffff\6\32",
            "\1\55\3\uffff\1\31\1\56\21\uffff\32\31\6\uffff\32\31",
            "\1\31",
            "\1\53\1\uffff\12\57\7\uffff\6\54\32\uffff\6\54",
            "\12\32\7\uffff\6\32\32\uffff\6\32",
            "\1\53\1\uffff\5\60\1\61\4\62\7\uffff\6\54\32\uffff\6\54",
            "\1\53\1\uffff\12\62\7\uffff\6\54\32\uffff\6\54",
            "\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\0\63",
            "\0\63",
            "",
            "",
            "\12\33\1\54\6\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\66\5\uffff\1\54",
            "",
            "\1\54",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\70",
            "\12\33\1\54\6\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\1\54\6\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\74",
            "\1\75",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\77",
            "\1\100",
            "\2\101\10\uffff\1\54",
            "\12\102\7\uffff\6\102\32\uffff\6\102",
            "\1\54",
            "",
            "",
            "",
            "",
            "",
            "\1\105\1\106\21\uffff\32\103\6\uffff\32\103",
            "\1\53\1\uffff\12\107\1\54",
            "\1\53\1\uffff\12\110\1\54",
            "\1\53\1\uffff\6\111\4\uffff\1\54",
            "\1\53\13\uffff\1\54",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\113",
            "",
            "",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\115",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\2\120",
            "\12\121\7\uffff\6\121\32\uffff\6\121",
            "\1\105\1\106\21\uffff\32\103\6\uffff\32\103",
            "",
            "\56\104\1\105\22\104\32\122\6\104\32\122\uff85\104",
            "\1\105\1\106\21\uffff\32\103\6\uffff\32\103",
            "\1\53",
            "\1\53",
            "\1\53",
            "",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\124",
            "",
            "",
            "\2\125",
            "\12\127\7\uffff\6\127\32\uffff\6\127",
            "\56\104\1\105\22\104\32\122\6\104\32\122\uff85\104",
            "",
            "\1\130",
            "\2\131",
            "",
            "\12\132\7\uffff\6\132\32\uffff\6\132",
            "\1\133",
            "\2\134",
            "\12\136\7\uffff\6\136\32\uffff\6\136",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\2\140",
            "",
            "",
            "",
            "\2\141",
            "\2\142",
            "\2\143",
            "\2\144",
            "\2\145",
            "\2\146",
            "\2\147",
            "\2\150",
            "\2\151",
            "\2\152",
            "\2\136"
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_BYTE | RULE_WORD | RULE_DOUBLEWORD | RULE_PATH | RULE_MACADDRESS | RULE_IPADDRESS | RULE_HEXSTRING | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_20 = input.LA(1);

                        s = -1;
                        if ( ((LA23_20>='\u0000' && LA23_20<='\uFFFF')) ) {s = 51;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_0 = input.LA(1);

                        s = -1;
                        if ( (LA23_0=='B') ) {s = 1;}

                        else if ( (LA23_0=='L') ) {s = 2;}

                        else if ( (LA23_0=='P') ) {s = 3;}

                        else if ( (LA23_0=='D') ) {s = 4;}

                        else if ( (LA23_0=='O') ) {s = 5;}

                        else if ( (LA23_0=='I') ) {s = 6;}

                        else if ( (LA23_0=='M') ) {s = 7;}

                        else if ( (LA23_0=='H') ) {s = 8;}

                        else if ( (LA23_0=='0') ) {s = 9;}

                        else if ( (LA23_0=='A'||LA23_0=='C'||(LA23_0>='E' && LA23_0<='F')) ) {s = 10;}

                        else if ( (LA23_0=='/') ) {s = 11;}

                        else if ( (LA23_0=='G'||(LA23_0>='J' && LA23_0<='K')||LA23_0=='N'||(LA23_0>='Q' && LA23_0<='Z')) ) {s = 12;}

                        else if ( (LA23_0=='1') ) {s = 13;}

                        else if ( ((LA23_0>='a' && LA23_0<='f')) ) {s = 14;}

                        else if ( (LA23_0=='2') ) {s = 15;}

                        else if ( ((LA23_0>='3' && LA23_0<='9')) ) {s = 16;}

                        else if ( (LA23_0=='^') ) {s = 17;}

                        else if ( (LA23_0=='_'||(LA23_0>='g' && LA23_0<='z')) ) {s = 18;}

                        else if ( (LA23_0=='\"') ) {s = 19;}

                        else if ( (LA23_0=='\'') ) {s = 20;}

                        else if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {s = 21;}

                        else if ( ((LA23_0>='\u0000' && LA23_0<='\b')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\u001F')||LA23_0=='!'||(LA23_0>='#' && LA23_0<='&')||(LA23_0>='(' && LA23_0<='.')||(LA23_0>=':' && LA23_0<='@')||(LA23_0>='[' && LA23_0<=']')||LA23_0=='`'||(LA23_0>='{' && LA23_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_82 = input.LA(1);

                        s = -1;
                        if ( ((LA23_82>='\u0000' && LA23_82<='-')||(LA23_82>='/' && LA23_82<='@')||(LA23_82>='[' && LA23_82<='`')||(LA23_82>='{' && LA23_82<='\uFFFF')) ) {s = 68;}

                        else if ( (LA23_82=='.') ) {s = 69;}

                        else if ( ((LA23_82>='A' && LA23_82<='Z')||(LA23_82>='a' && LA23_82<='z')) ) {s = 82;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_69 = input.LA(1);

                        s = -1;
                        if ( ((LA23_69>='\u0000' && LA23_69<='-')||(LA23_69>='/' && LA23_69<='@')||(LA23_69>='[' && LA23_69<='`')||(LA23_69>='{' && LA23_69<='\uFFFF')) ) {s = 68;}

                        else if ( ((LA23_69>='A' && LA23_69<='Z')||(LA23_69>='a' && LA23_69<='z')) ) {s = 82;}

                        else if ( (LA23_69=='.') ) {s = 69;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA23_19 = input.LA(1);

                        s = -1;
                        if ( ((LA23_19>='\u0000' && LA23_19<='\uFFFF')) ) {s = 51;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}