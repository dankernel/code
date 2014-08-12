package antlr;

//$ANTLR 3.4 C:\\Users\\상길\\Desktop\\grammer\\CLexer.g 2014-07-08 14:57:34

import org.antlr.runtime.*;
import org.antlr.runtime.MismatchedTokenException;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;



//$ANTLR 3.4 C:\\Users\\상길\\Desktop\\grammer\\CLexer.g 2014-07-08 14:57:34

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CLexer extends Lexer {
 public static final int EOF=-1;
 public static final int AMPERSAND=4;
 public static final int AMPERSAND_EQUAL=5;
 public static final int ASTERISK=6;
 public static final int ASTERISK_EQUAL=7;
 public static final int AUTO=8;
 public static final int BREAK=9;
 public static final int CASE=10;
 public static final int CHAR=11;
 public static final int CHARACTER_LITERAL=12;
 public static final int CIRCUMFLEX=13;
 public static final int CIRCUMFLEX_EQUAL=14;
 public static final int COLON=15;
 public static final int COMMA=16;
 public static final int COMMENT=17;
 public static final int CONST=18;
 public static final int CONTINUE=19;
 public static final int DECIMAL_LITERAL=20;
 public static final int DEFAULT=21;
 public static final int DO=22;
 public static final int DOT=23;
 public static final int DOUBLE=24;
 public static final int DOUBLE_AMPERSAND=25;
 public static final int DOUBLE_EQUAL=26;
 public static final int DOUBLE_MINUS=27;
 public static final int DOUBLE_PLUS=28;
 public static final int DOUBLE_VERTICALBAR=29;
 public static final int ELLIPSIS=30;
 public static final int ELSE=31;
 public static final int ENUM=32;
 public static final int EQUAL=33;
 public static final int EXTERN=34;
 public static final int EscapeSequence=35;
 public static final int Exponent=36;
 public static final int FLOAT=37;
 public static final int FLOATING_POINT_LITERAL=38;
 public static final int FOR=39;
 public static final int FloatTypeSuffix=40;
 public static final int GOTO=41;
 public static final int HEX_LITERAL=42;
 public static final int HexDigit=43;
 public static final int IDENTIFIER=44;
 public static final int IF=45;
 public static final int INT=46;
 public static final int IntegerTypeSuffix=47;
 public static final int LAB=48;
 public static final int LAB_EQUAL=49;
 public static final int LBRACE=50;
 public static final int LBRACKET=51;
 public static final int LEFT_SHIFT=52;
 public static final int LEFT_SHIFT_EQUAL=53;
 public static final int LETTER=54;
 public static final int LINE_COMMAND=55;
 public static final int LINE_COMMENT=56;
 public static final int LONG=57;
 public static final int LPAREN=58;
 public static final int MINUS=59;
 public static final int MINUS_EQUAL=60;
 public static final int MINUS_RAB=61;
 public static final int NOT=62;
 public static final int NOT_EQUAL=63;
 public static final int OCTAL_LITERAL=64;
 public static final int OctalEscape=65;
 public static final int PERCENT=66;
 public static final int PERCENT_EQUAL=67;
 public static final int PLUS=68;
 public static final int PLUS_EQUAL=69;
 public static final int QUESTION=70;
 public static final int RAB=71;
 public static final int RAB_EQUAL=72;
 public static final int RBRACE=73;
 public static final int RBRACKET=74;
 public static final int REGISTER=75;
 public static final int RETURN=76;
 public static final int RIGHT_SHIFT=77;
 public static final int RIGHT_SHIFT_EQUAL=78;
 public static final int RPAREN=79;
 public static final int SEMI=80;
 public static final int SHORT=81;
 public static final int SIGNED=82;
 public static final int SIZEOF=83;
 public static final int SLASH=84;
 public static final int SLASH_EQUAL=85;
 public static final int STATIC=86;
 public static final int STRING_LITERAL=87;
 public static final int STRUCT=88;
 public static final int SWITCH=89;
 public static final int SWUNG_DASH=90;
 public static final int TYPEDEF=91;
 public static final int UNION=92;
 public static final int UNSIGNED=93;
 public static final int UnicodeEscape=94;
 public static final int VERTICALBAR=95;
 public static final int VERTICALBAR_EQUAL=96;
 public static final int VOID=97;
 public static final int VOLATILE=98;
 public static final int WHILE=99;
 public static final int WS=100;

 // delegates
 // delegators
 public Lexer[] getDelegates() {
     return new Lexer[] {};
 }

 public CLexer() {} 
 public CLexer(CharStream input) {
     this(input, new RecognizerSharedState());
 }
 public CLexer(CharStream input, RecognizerSharedState state) {
     super(input,state);
 }
 public String getGrammarFileName() { return "C:\\Users\\상길\\Desktop\\grammer\\CLexer.g"; }

 // $ANTLR start "TYPEDEF"
 public final void mTYPEDEF() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = TYPEDEF;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:8:10: ( 'typedef' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:8:12: 'typedef'
         {
        	 match("typedef"); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "TYPEDEF"

 // $ANTLR start "EXTERN"
 public final void mEXTERN() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = EXTERN;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:9:9: ( 'extern' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:9:11: 'extern'
         {
        	 match("extern"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "EXTERN"

 // $ANTLR start "STATIC"
 public final void mSTATIC() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = STATIC;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:10:9: ( 'static' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:10:11: 'static'
         {
        	 match("static"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "STATIC"

 // $ANTLR start "AUTO"
 public final void mAUTO() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = AUTO;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:11:7: ( 'auto' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:11:9: 'auto'
         {
        	 match("auto"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "AUTO"

 // $ANTLR start "REGISTER"
 public final void mREGISTER() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = REGISTER;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:12:10: ( 'register' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:12:12: 'register'
         {
        	 match("register"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "REGISTER"

 // $ANTLR start "VOID"
 public final void mVOID() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = VOID;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:13:7: ( 'void' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:13:9: 'void'
         {
        	 match("void"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "VOID"

 // $ANTLR start "CHAR"
 public final void mCHAR() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = CHAR;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:14:7: ( 'char' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:14:9: 'char'
         {
        	 match("char"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "CHAR"

 // $ANTLR start "SHORT"
 public final void mSHORT() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = SHORT;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:15:8: ( 'short' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:15:10: 'short'
         {
        	 match("short"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "SHORT"

 // $ANTLR start "INT"
 public final void mINT() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = INT;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:16:6: ( 'int' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:16:8: 'int'
         {
        	 match("int"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "INT"

 // $ANTLR start "LONG"
 public final void mLONG() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = LONG;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:17:7: ( 'long' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:17:9: 'long'
         {
        	 match("long"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "LONG"

 // $ANTLR start "FLOAT"
 public final void mFLOAT() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = FLOAT;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:18:8: ( 'float' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:18:10: 'float'
         {
        	 match("float"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "FLOAT"

 // $ANTLR start "DOUBLE"
 public final void mDOUBLE() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = DOUBLE;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:19:9: ( 'double' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:19:11: 'double'
         {
        	 match("double"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "DOUBLE"

 // $ANTLR start "SIGNED"
 public final void mSIGNED() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = SIGNED;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:20:9: ( 'signed' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:20:11: 'signed'
         {
        	 match("signed"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "SIGNED"

 // $ANTLR start "UNSIGNED"
 public final void mUNSIGNED() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = UNSIGNED;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:21:10: ( 'unsigned' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:21:12: 'unsigned'
         {
        	 match("unsigned"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "UNSIGNED"

 // $ANTLR start "STRUCT"
 public final void mSTRUCT() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = STRUCT;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:22:9: ( 'struct' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:22:11: 'struct'
         {
        	 match("struct"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "STRUCT"

 // $ANTLR start "UNION"
 public final void mUNION() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = UNION;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:23:8: ( 'union' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:23:10: 'union'
         {
        	 match("union"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "UNION"

 // $ANTLR start "ENUM"
 public final void mENUM() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = ENUM;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:24:7: ( 'enum' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:24:9: 'enum'
         {
        	 match("enum"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "ENUM"

 // $ANTLR start "ELSE"
 public final void mELSE() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = ELSE;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:25:7: ( 'else' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:25:9: 'else'
         {
        	 match("else"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "ELSE"

 // $ANTLR start "CONST"
 public final void mCONST() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = CONST;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:26:8: ( 'const' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:26:10: 'const'
         {
        	 match("const"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "CONST"

 // $ANTLR start "VOLATILE"
 public final void mVOLATILE() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = VOLATILE;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:27:10: ( 'volatile' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:27:12: 'volatile'
         {
        	 match("volatile"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "VOLATILE"

 // $ANTLR start "SIZEOF"
 public final void mSIZEOF() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = SIZEOF;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:28:9: ( 'sizeof' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:28:11: 'sizeof'
         {
        	 match("sizeof"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "SIZEOF"

 // $ANTLR start "CASE"
 public final void mCASE() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = CASE;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:29:7: ( 'case' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:29:9: 'case'
         {
        	 match("case"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "CASE"

 // $ANTLR start "DEFAULT"
 public final void mDEFAULT() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = DEFAULT;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:30:10: ( 'default' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:30:12: 'default'
         {
        	 match("default"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "DEFAULT"

 // $ANTLR start "IF"
 public final void mIF() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = IF;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:31:5: ( 'if' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:31:7: 'if'
         {
        	 match("if"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "IF"

 // $ANTLR start "SWITCH"
 public final void mSWITCH() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = SWITCH;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:32:9: ( 'switch' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:32:11: 'switch'
         {
        	 match("switch"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "SWITCH"

 // $ANTLR start "WHILE"
 public final void mWHILE() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = WHILE;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:33:8: ( 'while' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:33:10: 'while'
         {
        	 match("while"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "WHILE"

 // $ANTLR start "DO"
 public final void mDO() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = DO;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:34:5: ( 'do' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:34:7: 'do'
         {
        	 match("do"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "DO"

 // $ANTLR start "FOR"
 public final void mFOR() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = FOR;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:35:6: ( 'for' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:35:8: 'for'
         {
        	 match("for"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "FOR"

 // $ANTLR start "GOTO"
 public final void mGOTO() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = GOTO;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:36:7: ( 'goto' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:36:9: 'goto'
         {
        	 match("goto"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "GOTO"

 // $ANTLR start "CONTINUE"
 public final void mCONTINUE() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = CONTINUE;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:37:10: ( 'continue' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:37:12: 'continue'
         {
        	 match("continue"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "CONTINUE"

 // $ANTLR start "BREAK"
 public final void mBREAK() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = BREAK;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:38:8: ( 'break' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:38:10: 'break'
         {
        	 match("break"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "BREAK"

 // $ANTLR start "RETURN"
 public final void mRETURN() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = RETURN;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:39:9: ( 'return' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:39:11: 'return'
         {
        	 match("return"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "RETURN"

 // $ANTLR start "PLUS"
 public final void mPLUS() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = PLUS;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:43:7: ( '+' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:43:9: '+'
         {
        	 match('+'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "PLUS"

 // $ANTLR start "MINUS"
 public final void mMINUS() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = MINUS;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:44:8: ( '-' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:44:10: '-'
         {
        	 match('-'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "MINUS"

 // $ANTLR start "ASTERISK"
 public final void mASTERISK() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = ASTERISK;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:45:10: ( '*' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:45:12: '*'
         {
        	 match('*'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "ASTERISK"

 // $ANTLR start "SLASH"
 public final void mSLASH() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = SLASH;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:46:8: ( '/' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:46:10: '/'
         {
        	 match('/'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "SLASH"

 // $ANTLR start "PERCENT_EQUAL"
 public final void mPERCENT_EQUAL() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = PERCENT_EQUAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:47:15: ( '%=' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:47:17: '%='
         {
        	 match("%="); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "PERCENT_EQUAL"

 // $ANTLR start "AMPERSAND_EQUAL"
 public final void mAMPERSAND_EQUAL() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = AMPERSAND_EQUAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:48:17: ( '&=' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:48:19: '&='
         {
        	 match("&="); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "AMPERSAND_EQUAL"

 // $ANTLR start "PERCENT"
 public final void mPERCENT() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = PERCENT;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:49:10: ( '%' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:49:12: '%'
         {
        	 match('%'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "PERCENT"

 // $ANTLR start "LEFT_SHIFT"
 public final void mLEFT_SHIFT() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = LEFT_SHIFT;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:50:12: ( '<<' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:50:14: '<<'
         {
        	 match("<<"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "LEFT_SHIFT"

 // $ANTLR start "RIGHT_SHIFT"
 public final void mRIGHT_SHIFT() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = RIGHT_SHIFT;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:51:13: ( '>>' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:51:15: '>>'
         {
        	 match(">>"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "RIGHT_SHIFT"

 // $ANTLR start "AMPERSAND"
 public final void mAMPERSAND() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = AMPERSAND;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:52:11: ( '&' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:52:13: '&'
         {
        	 match('&'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "AMPERSAND"

 // $ANTLR start "VERTICALBAR"
 public final void mVERTICALBAR() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = VERTICALBAR;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:53:13: ( '|' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:53:15: '|'
         {
        	 match('|'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "VERTICALBAR"

 // $ANTLR start "CIRCUMFLEX"
 public final void mCIRCUMFLEX() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = CIRCUMFLEX;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:54:12: ( '^' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:54:14: '^'
         {
        	 match('^'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "CIRCUMFLEX"

 // $ANTLR start "SWUNG_DASH"
 public final void mSWUNG_DASH() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = SWUNG_DASH;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:55:12: ( '~' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:55:14: '~'
         {
        	 match('~'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "SWUNG_DASH"

 // $ANTLR start "DOUBLE_EQUAL"
 public final void mDOUBLE_EQUAL() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = DOUBLE_EQUAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:56:14: ( '==' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:56:16: '=='
         {
        	 match("=="); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "DOUBLE_EQUAL"

 // $ANTLR start "NOT_EQUAL"
 public final void mNOT_EQUAL() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = NOT_EQUAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:57:11: ( '!=' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:57:13: '!='
         {
        	 match("!="); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "NOT_EQUAL"

 // $ANTLR start "QUESTION"
 public final void mQUESTION() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = QUESTION;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:58:10: ( '?' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:58:12: '?'
         {
        	 match('?'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "QUESTION"

 // $ANTLR start "LAB"
 public final void mLAB() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = LAB;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:60:6: ( '<' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:60:8: '<'
         {
        	 match('<'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "LAB"

 // $ANTLR start "RAB"
 public final void mRAB() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = RAB;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:61:6: ( '>' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:61:8: '>'
         {
        	 match('>'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "RAB"

 // $ANTLR start "LAB_EQUAL"
 public final void mLAB_EQUAL() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = LAB_EQUAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:62:11: ( '<=' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:62:13: '<='
         {
        	 match("<="); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "LAB_EQUAL"

 // $ANTLR start "RAB_EQUAL"
 public final void mRAB_EQUAL() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = RAB_EQUAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:63:11: ( '>=' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:63:13: '>='
         {
        	 match(">="); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "RAB_EQUAL"

 // $ANTLR start "LPAREN"
 public final void mLPAREN() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = LPAREN;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:64:9: ( '(' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:64:11: '('
         {
        	 match('('); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "LPAREN"

 // $ANTLR start "RPAREN"
 public final void mRPAREN() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = RPAREN;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:65:9: ( ')' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:65:11: ')'
         {
        	 match(')'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "RPAREN"

 // $ANTLR start "LBRACKET"
 public final void mLBRACKET() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = LBRACKET;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:66:10: ( '[' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:66:12: '['
         {
        	 match('['); 
         
         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "LBRACKET"

 // $ANTLR start "RBRACKET"
 public final void mRBRACKET() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = RBRACKET;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:67:10: ( ']' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:67:12: ']'
         {
        	 match(']'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "RBRACKET"

 // $ANTLR start "LBRACE"
 public final void mLBRACE() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = LBRACE;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:68:9: ( '{' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:68:11: '{'
         {
        	 match('{'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "LBRACE"

 // $ANTLR start "RBRACE"
 public final void mRBRACE() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = RBRACE;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:69:9: ( '}' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:69:11: '}'
         {
        	 match('}'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "RBRACE"

 // $ANTLR start "COMMA"
 public final void mCOMMA() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = COMMA;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:70:8: ( ',' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:70:10: ','
         {
        	 match(','); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "COMMA"

 // $ANTLR start "COLON"
 public final void mCOLON() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = COLON;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:71:8: ( ':' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:71:10: ':'
         {
        	 match(':'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "COLON"

 // $ANTLR start "DOT"
 public final void mDOT() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = DOT;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:72:6: ( '.' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:72:8: '.'
         {
        	 match('.'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "DOT"

 // $ANTLR start "SEMI"
 public final void mSEMI() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = SEMI;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:73:7: ( ';' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:73:9: ';'
         {
        	 match(';'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "SEMI"

 // $ANTLR start "EQUAL"
 public final void mEQUAL() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = EQUAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:74:8: ( '=' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:74:10: '='
         {
        	 match('='); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "EQUAL"

 // $ANTLR start "PLUS_EQUAL"
 public final void mPLUS_EQUAL() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = PLUS_EQUAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:75:12: ( '+=' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:75:14: '+='
         {
        	 match("+="); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "PLUS_EQUAL"

 // $ANTLR start "MINUS_EQUAL"
 public final void mMINUS_EQUAL() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = MINUS_EQUAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:76:13: ( '-=' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:76:15: '-='
         {
        	 match("-="); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "MINUS_EQUAL"

 // $ANTLR start "ASTERISK_EQUAL"
 public final void mASTERISK_EQUAL() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = ASTERISK_EQUAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:77:16: ( '*=' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:77:18: '*='
         {
        	 match("*="); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "ASTERISK_EQUAL"

 // $ANTLR start "SLASH_EQUAL"
 public final void mSLASH_EQUAL() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = SLASH_EQUAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:78:13: ( '/=' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:78:15: '/='
         {
        	 match("/="); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "SLASH_EQUAL"

 // $ANTLR start "ELLIPSIS"
 public final void mELLIPSIS() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = ELLIPSIS;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:79:11: ( '...' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:79:13: '...'
         {
        	 match("..."); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "ELLIPSIS"

 // $ANTLR start "DOUBLE_PLUS"
 public final void mDOUBLE_PLUS() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = DOUBLE_PLUS;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:80:13: ( '++' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:80:15: '++'
         {
        	 match("++"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "DOUBLE_PLUS"

 // $ANTLR start "DOUBLE_MINUS"
 public final void mDOUBLE_MINUS() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = DOUBLE_MINUS;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:81:14: ( '--' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:81:16: '--'
         {
        	 match("--"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "DOUBLE_MINUS"

 // $ANTLR start "MINUS_RAB"
 public final void mMINUS_RAB() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = MINUS_RAB;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:82:11: ( '->' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:82:13: '->'
         {
        	 match("->"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "MINUS_RAB"

 // $ANTLR start "NOT"
 public final void mNOT() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = NOT;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:83:6: ( '!' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:83:8: '!'
         {
        	 match('!'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "NOT"

 // $ANTLR start "DOUBLE_VERTICALBAR"
 public final void mDOUBLE_VERTICALBAR() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = DOUBLE_VERTICALBAR;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:84:20: ( '||' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:84:22: '||'
         {
        	 match("||"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "DOUBLE_VERTICALBAR"

 // $ANTLR start "VERTICALBAR_EQUAL"
 public final void mVERTICALBAR_EQUAL() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = VERTICALBAR_EQUAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:85:19: ( '|=' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:85:21: '|='
         {
        	 match("|="); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "VERTICALBAR_EQUAL"

 // $ANTLR start "CIRCUMFLEX_EQUAL"
 public final void mCIRCUMFLEX_EQUAL() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = CIRCUMFLEX_EQUAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:86:18: ( '^=' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:86:20: '^='
         {
        	 match("^="); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "CIRCUMFLEX_EQUAL"

 // $ANTLR start "RIGHT_SHIFT_EQUAL"
 public final void mRIGHT_SHIFT_EQUAL() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = RIGHT_SHIFT_EQUAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:87:19: ( '>>=' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:87:21: '>>='
         {
        	 match(">>="); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "RIGHT_SHIFT_EQUAL"

 // $ANTLR start "LEFT_SHIFT_EQUAL"
 public final void mLEFT_SHIFT_EQUAL() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = LEFT_SHIFT_EQUAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:88:18: ( '<<=' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:88:20: '<<='
         {
        	 match("<<="); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "LEFT_SHIFT_EQUAL"

 // $ANTLR start "DOUBLE_AMPERSAND"
 public final void mDOUBLE_AMPERSAND() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = DOUBLE_AMPERSAND;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:89:18: ( '&&' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:89:21: '&&'
         {
        	 match("&&"); 



         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "DOUBLE_AMPERSAND"

 // $ANTLR start "IDENTIFIER"
 public final void mIDENTIFIER() throws RecognitionException, MismatchedSetException {
     try {
         int _type = IDENTIFIER;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:96:2: ( LETTER ( LETTER | '0' .. '9' )* )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:96:4: LETTER ( LETTER | '0' .. '9' )*
         {
         mLETTER(); 


         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:96:11: ( LETTER | '0' .. '9' )*
         loop1:
         do {
             int alt1=2;
             int LA1_0 = input.LA(1);

             if ( (LA1_0=='$'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                 alt1=1;
             }


             switch (alt1) {
         	case 1 :
         	    // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
         	    {
         	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
         	        input.consume();
         	    }
         	    else {
         	        MismatchedSetException mse = new MismatchedSetException(null,input);
         	        recover(mse);
         	        throw mse;
         	    }


         	    }
         	    break;

         	default :
         	    break loop1;
             }
         } while (true);


         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "IDENTIFIER"

 // $ANTLR start "LETTER"
 public final void mLETTER() throws RecognitionException, MismatchedSetException {
     try {
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:101:2: ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
         {
         if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
             input.consume();
         }
         else {
             MismatchedSetException mse = new MismatchedSetException(null,input);
             recover(mse);
             throw mse;
         }


         }


     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "LETTER"

 // $ANTLR start "CHARACTER_LITERAL"
 public final void mCHARACTER_LITERAL() throws RecognitionException, MismatchedTokenException, MismatchedSetException {
     try {
         int _type = CHARACTER_LITERAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:108:5: ( '\\'' ( EscapeSequence |~ ( '\\'' | '\\\\' ) ) '\\'' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:108:9: '\\'' ( EscapeSequence |~ ( '\\'' | '\\\\' ) ) '\\''
         {
        	 match('\''); 

         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:108:14: ( EscapeSequence |~ ( '\\'' | '\\\\' ) )
         int alt2=2;
         int LA2_0 = input.LA(1);

         if ( (LA2_0=='\\') ) {
             alt2=1;
         }
         else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '&')||(LA2_0 >= '(' && LA2_0 <= '[')||(LA2_0 >= ']' && LA2_0 <= '\uFFFF')) ) {
             alt2=2;
         }
         else {
             NoViableAltException nvae =
                 new NoViableAltException();

   //          throw nvae;

         }
         switch (alt2) {
             case 1 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:108:16: EscapeSequence
                 {
                 mEscapeSequence(); 


                 }
                 break;
             case 2 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:108:33: ~ ( '\\'' | '\\\\' )
                 {
                 if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                     input.consume();
                 }
                 else {
                     MismatchedSetException mse = new MismatchedSetException(null,input);
                     recover(mse);
                     throw mse;
                 }


                 }
                 break;

         }


         match('\''); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "CHARACTER_LITERAL"

 // $ANTLR start "STRING_LITERAL"
 public final void mSTRING_LITERAL() throws RecognitionException, MismatchedTokenException, MismatchedSetException {
     try {
         int _type = STRING_LITERAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:112:5: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:112:8: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
         {
        	 match('\"'); 

         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:112:12: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
         loop3:
         do {
             int alt3=3;
             int LA3_0 = input.LA(1);

             if ( (LA3_0=='\\') ) {
                 alt3=1;
             }
             else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '!')||(LA3_0 >= '#' && LA3_0 <= '[')||(LA3_0 >= ']' && LA3_0 <= '\uFFFF')) ) {
                 alt3=2;
             }


             switch (alt3) {
         	case 1 :
         	    // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:112:14: EscapeSequence
         	    {
         	    mEscapeSequence(); 


         	    }
         	    break;
         	case 2 :
         	    // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:112:31: ~ ( '\\\\' | '\"' )
         	    {
         	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
         	        input.consume();
         	    }
         	    else {
         	        MismatchedSetException mse = new MismatchedSetException(null,input);
         	        recover(mse);
         	        throw mse;
         	    }


         	    }
         	    break;

         	default :
         	    break loop3;
             }
         } while (true);


         match('\"'); 

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "STRING_LITERAL"

 // $ANTLR start "HEX_LITERAL"
 public final void mHEX_LITERAL() throws RecognitionException, MismatchedTokenException, MismatchedSetException, EarlyExitException {
     try {
         int _type = HEX_LITERAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:115:13: ( '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )? )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:115:15: '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )?
         {
        	 match('0'); 

         if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
             input.consume();
         }
         else {
             MismatchedSetException mse = new MismatchedSetException(null,input);
             recover(mse);
             throw mse;
         }


         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:115:29: ( HexDigit )+
         int cnt4=0;
         loop4:
         do {
             int alt4=2;
             int LA4_0 = input.LA(1);

             if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'F')||(LA4_0 >= 'a' && LA4_0 <= 'f')) ) {
                 alt4=1;
             }


             switch (alt4) {
         	case 1 :
         	    // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
         	    {
         	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
         	        input.consume();
         	    }
         	    else {
         	        MismatchedSetException mse = new MismatchedSetException(null,input);
         	        recover(mse);
         	        throw mse;
         	    }


         	    }
         	    break;

         	default :
         	    if ( cnt4 >= 1 ) break loop4;
                     EarlyExitException eee =
                         new EarlyExitException(4, input);
                     throw eee;
             }
             cnt4++;
         } while (true);


         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:115:39: ( IntegerTypeSuffix )?
         int alt5=2;
         int LA5_0 = input.LA(1);

         if ( (LA5_0=='L'||LA5_0=='U'||LA5_0=='l'||LA5_0=='u') ) {
             alt5=1;
         }
         switch (alt5) {
             case 1 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:115:39: IntegerTypeSuffix
                 {
                 mIntegerTypeSuffix(); 


                 }
                 break;

         }


         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "HEX_LITERAL"

 // $ANTLR start "DECIMAL_LITERAL"
 public final void mDECIMAL_LITERAL() throws RecognitionException, MismatchedTokenException, MismatchedRangeException, MismatchedSetException {
     try {
         int _type = DECIMAL_LITERAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:117:17: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )? )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:117:19: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )?
         {
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:117:19: ( '0' | '1' .. '9' ( '0' .. '9' )* )
         int alt7=2;
         int LA7_0 = input.LA(1);

         if ( (LA7_0=='0') ) {
             alt7=1;
         }
         else if ( ((LA7_0 >= '1' && LA7_0 <= '9')) ) {
             alt7=2;
         }
         else {
             NoViableAltException nvae =
                 new NoViableAltException();

       //      throw nvae;

         }
         switch (alt7) {
             case 1 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:117:20: '0'
                 {
                	 match('0'); 

                 }
                 break;
             case 2 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:117:26: '1' .. '9' ( '0' .. '9' )*
                 {
                 matchRange('1','9'); 

                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:117:35: ( '0' .. '9' )*
                 loop6:
                 do {
                     int alt6=2;
                     int LA6_0 = input.LA(1);

                     if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                         alt6=1;
                     }


                     switch (alt6) {
                 	case 1 :
                 	    // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
                 	    {
                 	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                 	        input.consume();
                 	    }
                 	    else {
                 	        MismatchedSetException mse = new MismatchedSetException(null,input);
                 	        recover(mse);
                 	        throw mse;
                 	    }


                 	    }
                 	    break;

                 	default :
                 	    break loop6;
                     }
                 } while (true);


                 }
                 break;

         }


         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:117:46: ( IntegerTypeSuffix )?
         int alt8=2;
         int LA8_0 = input.LA(1);

         if ( (LA8_0=='L'||LA8_0=='U'||LA8_0=='l'||LA8_0=='u') ) {
             alt8=1;
         }
         switch (alt8) {
             case 1 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:117:46: IntegerTypeSuffix
                 {
                 mIntegerTypeSuffix(); 


                 }
                 break;

         }


         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "DECIMAL_LITERAL"

 // $ANTLR start "OCTAL_LITERAL"
 public final void mOCTAL_LITERAL() throws RecognitionException, MismatchedTokenException, MismatchedSetException, EarlyExitException {
     try {
         int _type = OCTAL_LITERAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:119:15: ( '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )? )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:119:17: '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )?
         {
        	 match('0'); 

         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:119:21: ( '0' .. '7' )+
         int cnt9=0;
         loop9:
         do {
             int alt9=2;
             int LA9_0 = input.LA(1);

             if ( ((LA9_0 >= '0' && LA9_0 <= '7')) ) {
                 alt9=1;
             }


             switch (alt9) {
         	case 1 :
         	    // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
         	    {
         	    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
         	        input.consume();
         	    }
         	    else {
         	        MismatchedSetException mse = new MismatchedSetException(null,input);
         	        recover(mse);
         	        throw mse;
         	    }


         	    }
         	    break;

         	default :
         	    if ( cnt9 >= 1 ) break loop9;
                     EarlyExitException eee =
                         new EarlyExitException(9, input);
                     throw eee;
             }
             cnt9++;
         } while (true);


         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:119:33: ( IntegerTypeSuffix )?
         int alt10=2;
         int LA10_0 = input.LA(1);

         if ( (LA10_0=='L'||LA10_0=='U'||LA10_0=='l'||LA10_0=='u') ) {
             alt10=1;
         }
         switch (alt10) {
             case 1 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:119:33: IntegerTypeSuffix
                 {
                 mIntegerTypeSuffix(); 


                 }
                 break;

         }


         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "OCTAL_LITERAL"

 // $ANTLR start "HexDigit"
 public final void mHexDigit() throws RecognitionException, MismatchedSetException {
     try {
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:122:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
         {
         if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
             input.consume();
         }
         else {
             MismatchedSetException mse = new MismatchedSetException(null,input);
             recover(mse);
             throw mse;
         }


         }


     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "HexDigit"

 // $ANTLR start "IntegerTypeSuffix"
 public final void mIntegerTypeSuffix() throws RecognitionException, MismatchedSetException {
     try {
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:126:2: ( ( 'u' | 'U' )? ( 'l' | 'L' ) | ( 'u' | 'U' ) ( 'l' | 'L' )? )
         int alt13=2;
         int LA13_0 = input.LA(1);

         if ( (LA13_0=='U'||LA13_0=='u') ) {
             int LA13_1 = input.LA(2);

             if ( (LA13_1=='L'||LA13_1=='l') ) {
                 alt13=1;
             }
             else {
                 alt13=2;
             }
         }
         else if ( (LA13_0=='L'||LA13_0=='l') ) {
             alt13=1;
         }
         else {
             NoViableAltException nvae =
                 new NoViableAltException();

      //       throw nvae;

         }
         switch (alt13) {
             case 1 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:126:4: ( 'u' | 'U' )? ( 'l' | 'L' )
                 {
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:126:4: ( 'u' | 'U' )?
                 int alt11=2;
                 int LA11_0 = input.LA(1);

                 if ( (LA11_0=='U'||LA11_0=='u') ) {
                     alt11=1;
                 }
                 switch (alt11) {
                     case 1 :
                         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
                         {
                         if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                             input.consume();
                         }
                         else {
                             MismatchedSetException mse = new MismatchedSetException(null,input);
                             recover(mse);
                             throw mse;
                         }


                         }
                         break;

                 }


                 if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                     input.consume();
                 }
                 else {
                     MismatchedSetException mse = new MismatchedSetException(null,input);
                     recover(mse);
                     throw mse;
                 }


                 }
                 break;
             case 2 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:127:4: ( 'u' | 'U' ) ( 'l' | 'L' )?
                 {
                 if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                     input.consume();
                 }
                 else {
                     MismatchedSetException mse = new MismatchedSetException(null,input);
                     recover(mse);
                     throw mse;
                 }


                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:127:15: ( 'l' | 'L' )?
                 int alt12=2;
                 int LA12_0 = input.LA(1);

                 if ( (LA12_0=='L'||LA12_0=='l') ) {
                     alt12=1;
                 }
                 switch (alt12) {
                     case 1 :
                         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
                         {
                         if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                             input.consume();
                         }
                         else {
                             MismatchedSetException mse = new MismatchedSetException(null,input);
                             recover(mse);
                             throw mse;
                         }


                         }
                         break;

                 }


                 }
                 break;

         }

     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "IntegerTypeSuffix"

 // $ANTLR start "FLOATING_POINT_LITERAL"
 public final void mFLOATING_POINT_LITERAL() throws RecognitionException, org.antlr.runtime.RecognitionException {
     try {
         int _type = FLOATING_POINT_LITERAL;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:131:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ ( Exponent )? FloatTypeSuffix )
         int alt25=4;
         alt25 = dfa25.predict(input);
         switch (alt25) {
             case 1 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:131:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )?
                 {
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:131:9: ( '0' .. '9' )+
                 int cnt14=0;
                 loop14:
                 do {
                     int alt14=2;
                     int LA14_0 = input.LA(1);

                     if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
                         alt14=1;
                     }


                     switch (alt14) {
                 	case 1 :
                 	    // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
                 	    {
                 	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                 	        input.consume();
                 	    }
                 	    else {
                 	        MismatchedSetException mse = new MismatchedSetException(null,input);
                 	        recover(mse);
                 	        throw mse;
                 	    }


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


                 match('.'); 

                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:131:25: ( '0' .. '9' )*
                 loop15:
                 do {
                     int alt15=2;
                     int LA15_0 = input.LA(1);

                     if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
                         alt15=1;
                     }


                     switch (alt15) {
                 	case 1 :
                 	    // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
                 	    {
                 	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                 	        input.consume();
                 	    }
                 	    else {
                 	        MismatchedSetException mse = new MismatchedSetException(null,input);
                 	        recover(mse);
                 	        throw mse;
                 	    }


                 	    }
                 	    break;

                 	default :
                 	    break loop15;
                     }
                 } while (true);


                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:131:37: ( Exponent )?
                 int alt16=2;
                 int LA16_0 = input.LA(1);

                 if ( (LA16_0=='E'||LA16_0=='e') ) {
                     alt16=1;
                 }
                 switch (alt16) {
                     case 1 :
                         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:131:37: Exponent
                         {
                         mExponent(); 


                         }
                         break;

                 }


                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:131:47: ( FloatTypeSuffix )?
                 int alt17=2;
                 int LA17_0 = input.LA(1);

                 if ( (LA17_0=='D'||LA17_0=='F'||LA17_0=='d'||LA17_0=='f') ) {
                     alt17=1;
                 }
                 switch (alt17) {
                     case 1 :
                         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
                         {
                         if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                             input.consume();
                         }
                         else {
                             MismatchedSetException mse = new MismatchedSetException(null,input);
                             recover(mse);
                             throw mse;
                         }


                         }
                         break;

                 }


                 }
                 break;
             case 2 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:132:9: '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )?
                 {
                 match('.'); 

                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:132:13: ( '0' .. '9' )+
                 int cnt18=0;
                 loop18:
                 do {
                     int alt18=2;
                     int LA18_0 = input.LA(1);

                     if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
                         alt18=1;
                     }


                     switch (alt18) {
                 	case 1 :
                 	    // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
                 	    {
                 	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                 	        input.consume();
                 	    }
                 	    else {
                 	        MismatchedSetException mse = new MismatchedSetException(null,input);
                 	        recover(mse);
                 	        throw mse;
                 	    }


                 	    }
                 	    break;

                 	default :
                 	    if ( cnt18 >= 1 ) break loop18;
                             EarlyExitException eee =
                                 new EarlyExitException(18, input);
                             throw eee;
                     }
                     cnt18++;
                 } while (true);


                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:132:25: ( Exponent )?
                 int alt19=2;
                 int LA19_0 = input.LA(1);

                 if ( (LA19_0=='E'||LA19_0=='e') ) {
                     alt19=1;
                 }
                 switch (alt19) {
                     case 1 :
                         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:132:25: Exponent
                         {
                         mExponent(); 


                         }
                         break;

                 }


                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:132:35: ( FloatTypeSuffix )?
                 int alt20=2;
                 int LA20_0 = input.LA(1);

                 if ( (LA20_0=='D'||LA20_0=='F'||LA20_0=='d'||LA20_0=='f') ) {
                     alt20=1;
                 }
                 switch (alt20) {
                     case 1 :
                         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
                         {
                         if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                             input.consume();
                         }
                         else {
                             MismatchedSetException mse = new MismatchedSetException(null,input);
                             recover(mse);
                             throw mse;
                         }


                         }
                         break;

                 }


                 }
                 break;
             case 3 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:133:9: ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )?
                 {
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:133:9: ( '0' .. '9' )+
                 int cnt21=0;
                 loop21:
                 do {
                     int alt21=2;
                     int LA21_0 = input.LA(1);

                     if ( ((LA21_0 >= '0' && LA21_0 <= '9')) ) {
                         alt21=1;
                     }


                     switch (alt21) {
                 	case 1 :
                 	    // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
                 	    {
                 	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                 	        input.consume();
                 	    }
                 	    else {
                 	        MismatchedSetException mse = new MismatchedSetException(null,input);
                 	        recover(mse);
                 	        throw mse;
                 	    }


                 	    }
                 	    break;

                 	default :
                 	    if ( cnt21 >= 1 ) break loop21;
                             EarlyExitException eee =
                                 new EarlyExitException(21, input);
                             throw eee;
                     }
                     cnt21++;
                 } while (true);


                 mExponent(); 


                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:133:30: ( FloatTypeSuffix )?
                 int alt22=2;
                 int LA22_0 = input.LA(1);

                 if ( (LA22_0=='D'||LA22_0=='F'||LA22_0=='d'||LA22_0=='f') ) {
                     alt22=1;
                 }
                 switch (alt22) {
                     case 1 :
                         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
                         {
                         if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                             input.consume();
                         }
                         else {
                             MismatchedSetException mse = new MismatchedSetException(null,input);
                             recover(mse);
                             throw mse;
                         }


                         }
                         break;

                 }


                 }
                 break;
             case 4 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:134:9: ( '0' .. '9' )+ ( Exponent )? FloatTypeSuffix
                 {
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:134:9: ( '0' .. '9' )+
                 int cnt23=0;
                 loop23:
                 do {
                     int alt23=2;
                     int LA23_0 = input.LA(1);

                     if ( ((LA23_0 >= '0' && LA23_0 <= '9')) ) {
                         alt23=1;
                     }


                     switch (alt23) {
                 	case 1 :
                 	    // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
                 	    {
                 	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                 	        input.consume();
                 	    }
                 	    else {
                 	        MismatchedSetException mse = new MismatchedSetException(null,input);
                 	        recover(mse);
                 	        throw mse;
                 	    }


                 	    }
                 	    break;

                 	default :
                 	    if ( cnt23 >= 1 ) break loop23;
                             EarlyExitException eee =
                                 new EarlyExitException(23, input);
                             throw eee;
                     }
                     cnt23++;
                 } while (true);


                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:134:21: ( Exponent )?
                 int alt24=2;
                 int LA24_0 = input.LA(1);

                 if ( (LA24_0=='E'||LA24_0=='e') ) {
                     alt24=1;
                 }
                 switch (alt24) {
                     case 1 :
                         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:134:21: Exponent
                         {
                         mExponent(); 


                         }
                         break;

                 }


                 mFloatTypeSuffix(); 


                 }
                 break;

         }
         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "FLOATING_POINT_LITERAL"

 // $ANTLR start "Exponent"
 public final void mExponent() throws RecognitionException, MismatchedSetException, EarlyExitException {
     try {
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:138:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:138:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
         {
         if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
             input.consume();
         }
         else {
             MismatchedSetException mse = new MismatchedSetException(null,input);
             recover(mse);
             throw mse;
         }


         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:138:22: ( '+' | '-' )?
         int alt26=2;
         int LA26_0 = input.LA(1);

         if ( (LA26_0=='+'||LA26_0=='-') ) {
             alt26=1;
         }
         switch (alt26) {
             case 1 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
                 {
                 if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                     input.consume();
                 }
                 else {
                     MismatchedSetException mse = new MismatchedSetException(null,input);
                     recover(mse);
                     throw mse;
                 }


                 }
                 break;

         }


         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:138:33: ( '0' .. '9' )+
         int cnt27=0;
         loop27:
         do {
             int alt27=2;
             int LA27_0 = input.LA(1);

             if ( ((LA27_0 >= '0' && LA27_0 <= '9')) ) {
                 alt27=1;
             }


             switch (alt27) {
         	case 1 :
         	    // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
         	    {
         	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
         	        input.consume();
         	    }
         	    else {
         	        MismatchedSetException mse = new MismatchedSetException(null,input);
         	        recover(mse);
         	        throw mse;
         	    }


         	    }
         	    break;

         	default :
         	    if ( cnt27 >= 1 ) break loop27;
                     EarlyExitException eee =
                         new EarlyExitException(27, input);
                     throw eee;
             }
             cnt27++;
         } while (true);


         }


     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "Exponent"

 // $ANTLR start "FloatTypeSuffix"
 public final void mFloatTypeSuffix() throws RecognitionException, MismatchedSetException {
     try {
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:141:17: ( ( 'f' | 'F' | 'd' | 'D' ) )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
         {
         if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
             input.consume();
         }
         else {
             MismatchedSetException mse = new MismatchedSetException(null,input);
             recover(mse);
             throw mse;
         }


         }


     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "FloatTypeSuffix"

 // $ANTLR start "EscapeSequence"
 public final void mEscapeSequence() throws RecognitionException, MismatchedTokenException, MismatchedSetException {
     try {
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:145:5: ( '\\\\' ( 'a' | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | OctalEscape )
         int alt28=2;
         int LA28_0 = input.LA(1);

         if ( (LA28_0=='\\') ) {
             int LA28_1 = input.LA(2);

             if ( (LA28_1=='\"'||LA28_1=='\''||LA28_1=='\\'||(LA28_1 >= 'a' && LA28_1 <= 'b')||LA28_1=='f'||LA28_1=='n'||LA28_1=='r'||LA28_1=='t') ) {
                 alt28=1;
             }
             else if ( ((LA28_1 >= '0' && LA28_1 <= '7')) ) {
                 alt28=2;
             }
             else {
                 NoViableAltException nvae =
                     new NoViableAltException();

     //            throw nvae;

             }
         }
         else {
             NoViableAltException nvae =
                 new NoViableAltException();

      //       throw nvae;

         }
         switch (alt28) {
             case 1 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:145:9: '\\\\' ( 'a' | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                 {
                	 match('\\'); 

                 if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||(input.LA(1) >= 'a' && input.LA(1) <= 'b')||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                     input.consume();
                 }
                 else {
                     MismatchedSetException mse = new MismatchedSetException(null,input);
                     recover(mse);
                     throw mse;
                 }


                 }
                 break;
             case 2 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:146:9: OctalEscape
                 {
                 mOctalEscape(); 


                 }
                 break;

         }

     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "EscapeSequence"

 // $ANTLR start "OctalEscape"
 public final void mOctalEscape() throws RecognitionException, MismatchedTokenException, MismatchedSetException {
     try {
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:151:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
         int alt29=3;
         int LA29_0 = input.LA(1);

         if ( (LA29_0=='\\') ) {
             int LA29_1 = input.LA(2);

             if ( ((LA29_1 >= '0' && LA29_1 <= '3')) ) {
                 int LA29_2 = input.LA(3);

                 if ( ((LA29_2 >= '0' && LA29_2 <= '7')) ) {
                     int LA29_4 = input.LA(4);

                     if ( ((LA29_4 >= '0' && LA29_4 <= '7')) ) {
                         alt29=1;
                     }
                     else {
                         alt29=2;
                     }
                 }
                 else {
                     alt29=3;
                 }
             }
             else if ( ((LA29_1 >= '4' && LA29_1 <= '7')) ) {
                 int LA29_3 = input.LA(3);

                 if ( ((LA29_3 >= '0' && LA29_3 <= '7')) ) {
                     alt29=2;
                 }
                 else {
                     alt29=3;
                 }
             }
             else {
                 NoViableAltException nvae =
                     new NoViableAltException();

      //           throw nvae;

             }
         }
         else {
             NoViableAltException nvae =
                 new NoViableAltException();

     //        throw nvae;

         }
         switch (alt29) {
             case 1 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:151:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                 {
                	 match('\\'); 

                 if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                     input.consume();
                 }
                 else {
                     MismatchedSetException mse = new MismatchedSetException(null,input);
                     recover(mse);
                     throw mse;
                 }


                 if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                     input.consume();
                 }
                 else {
                     MismatchedSetException mse = new MismatchedSetException(null,input);
                     recover(mse);
                     throw mse;
                 }


                 if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                     input.consume();
                 }
                 else {
                     MismatchedSetException mse = new MismatchedSetException(null,input);
                     recover(mse);
                     throw mse;
                 }


                 }
                 break;
             case 2 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:152:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                 {
                 match('\\'); 

                 if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                     input.consume();
                 }
                 else {
                     MismatchedSetException mse = new MismatchedSetException(null,input);
                     recover(mse);
                     throw mse;
                 }


                 if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                     input.consume();
                 }
                 else {
                     MismatchedSetException mse = new MismatchedSetException(null,input);
                     recover(mse);
                     throw mse;
                 }


                 }
                 break;
             case 3 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:153:9: '\\\\' ( '0' .. '7' )
                 {
                 match('\\'); 

                 if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                     input.consume();
                 }
                 else {
                     MismatchedSetException mse = new MismatchedSetException(null,input);
                     recover(mse);
                     throw mse;
                 }


                 }
                 break;

         }

     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "OctalEscape"

 // $ANTLR start "UnicodeEscape"
 public final void mUnicodeEscape() throws RecognitionException, MismatchedTokenException, MismatchedSetException {
     try {
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:158:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:158:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
         {
        	 match('\\'); 

        	 match('u'); 

        	 mHexDigit(); 


        	 mHexDigit(); 


        	 mHexDigit(); 


        	 mHexDigit(); 


         }


     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "UnicodeEscape"

 // $ANTLR start "WS"
 public final void mWS() throws RecognitionException, MismatchedSetException {
     try {
         int _type = WS;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:161:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:161:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
         {
         if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
             input.consume();
         }
         else {
             MismatchedSetException mse = new MismatchedSetException(null,input);
             recover(mse);
             throw mse;
         }


         _channel=HIDDEN;

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "WS"

 // $ANTLR start "COMMENT"
 public final void mCOMMENT() throws RecognitionException, MismatchedTokenException {
     try {
         int _type = COMMENT;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:165:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:165:9: '/*' ( options {greedy=false; } : . )* '*/'
         {
        	 match("/*"); 



         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:165:14: ( options {greedy=false; } : . )*
         loop30:
         do {
             int alt30=2;
             int LA30_0 = input.LA(1);

             if ( (LA30_0=='*') ) {
                 int LA30_1 = input.LA(2);

                 if ( (LA30_1=='/') ) {
                     alt30=2;
                 }
                 else if ( ((LA30_1 >= '\u0000' && LA30_1 <= '.')||(LA30_1 >= '0' && LA30_1 <= '\uFFFF')) ) {
                     alt30=1;
                 }


             }
             else if ( ((LA30_0 >= '\u0000' && LA30_0 <= ')')||(LA30_0 >= '+' && LA30_0 <= '\uFFFF')) ) {
                 alt30=1;
             }


             switch (alt30) {
         	case 1 :
         	    // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:165:42: .
         	    {
         	    matchAny(); 

         	    }
         	    break;

         	default :
         	    break loop30;
             }
         } while (true);


         match("*/"); 



         _channel=HIDDEN;

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "COMMENT"

 // $ANTLR start "LINE_COMMENT"
 public final void mLINE_COMMENT() throws RecognitionException, MismatchedTokenException, MismatchedSetException {
     try {
         int _type = LINE_COMMENT;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:169:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:169:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
         {
        	 match("//"); 



         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:169:12: (~ ( '\\n' | '\\r' ) )*
         loop31:
         do {
             int alt31=2;
             int LA31_0 = input.LA(1);

             if ( ((LA31_0 >= '\u0000' && LA31_0 <= '\t')||(LA31_0 >= '\u000B' && LA31_0 <= '\f')||(LA31_0 >= '\u000E' && LA31_0 <= '\uFFFF')) ) {
                 alt31=1;
             }


             switch (alt31) {
         	case 1 :
         	    // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
         	    {
         	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
         	        input.consume();
         	    }
         	    else {
         	        MismatchedSetException mse = new MismatchedSetException(null,input);
         	        recover(mse);
         	        throw mse;
         	    }


         	    }
         	    break;

         	default :
         	    break loop31;
             }
         } while (true);


         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:169:26: ( '\\r' )?
         int alt32=2;
         int LA32_0 = input.LA(1);

         if ( (LA32_0=='\r') ) {
             alt32=1;
         }
         switch (alt32) {
             case 1 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:169:26: '\\r'
                 {
                 match('\r'); 

                 }
                 break;

         }


         match('\n'); 

         _channel=HIDDEN;

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "LINE_COMMENT"

 // $ANTLR start "LINE_COMMAND"
 public final void mLINE_COMMAND() throws RecognitionException, MismatchedTokenException, MismatchedSetException {
     try {
         int _type = LINE_COMMAND;
         int _channel = DEFAULT_TOKEN_CHANNEL;
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:173:5: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:173:7: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
         {
        	 match('#'); 

         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:173:11: (~ ( '\\n' | '\\r' ) )*
         loop33:
         do {
             int alt33=2;
             int LA33_0 = input.LA(1);

             if ( ((LA33_0 >= '\u0000' && LA33_0 <= '\t')||(LA33_0 >= '\u000B' && LA33_0 <= '\f')||(LA33_0 >= '\u000E' && LA33_0 <= '\uFFFF')) ) {
                 alt33=1;
             }


             switch (alt33) {
         	case 1 :
         	    // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:
         	    {
         	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
         	        input.consume();
         	    }
         	    else {
         	        MismatchedSetException mse = new MismatchedSetException(null,input);
         	        recover(mse);
         	        throw mse;
         	    }


         	    }
         	    break;

         	default :
         	    break loop33;
             }
         } while (true);


         // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:173:25: ( '\\r' )?
         int alt34=2;
         int LA34_0 = input.LA(1);

         if ( (LA34_0=='\r') ) {
             alt34=1;
         }
         switch (alt34) {
             case 1 :
                 // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:173:25: '\\r'
                 {
                 match('\r'); 

                 }
                 break;

         }


         match('\n'); 

         _channel=HIDDEN;

         }

         state.type = _type;
         state.channel = _channel;
     }
     finally {
     	// do for sure before leaving
     }
 }
 // $ANTLR end "LINE_COMMAND"

 public void mTokens() throws org.antlr.runtime.RecognitionException {
     // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:8: ( TYPEDEF | EXTERN | STATIC | AUTO | REGISTER | VOID | CHAR | SHORT | INT | LONG | FLOAT | DOUBLE | SIGNED | UNSIGNED | STRUCT | UNION | ENUM | ELSE | CONST | VOLATILE | SIZEOF | CASE | DEFAULT | IF | SWITCH | WHILE | DO | FOR | GOTO | CONTINUE | BREAK | RETURN | PLUS | MINUS | ASTERISK | SLASH | PERCENT_EQUAL | AMPERSAND_EQUAL | PERCENT | LEFT_SHIFT | RIGHT_SHIFT | AMPERSAND | VERTICALBAR | CIRCUMFLEX | SWUNG_DASH | DOUBLE_EQUAL | NOT_EQUAL | QUESTION | LAB | RAB | LAB_EQUAL | RAB_EQUAL | LPAREN | RPAREN | LBRACKET | RBRACKET | LBRACE | RBRACE | COMMA | COLON | DOT | SEMI | EQUAL | PLUS_EQUAL | MINUS_EQUAL | ASTERISK_EQUAL | SLASH_EQUAL | ELLIPSIS | DOUBLE_PLUS | DOUBLE_MINUS | MINUS_RAB | NOT | DOUBLE_VERTICALBAR | VERTICALBAR_EQUAL | CIRCUMFLEX_EQUAL | RIGHT_SHIFT_EQUAL | LEFT_SHIFT_EQUAL | DOUBLE_AMPERSAND | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOATING_POINT_LITERAL | WS | COMMENT | LINE_COMMENT | LINE_COMMAND )
     int alt35=89;
     alt35 = dfa35.predict(input);
     switch (alt35) {
         case 1 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:10: TYPEDEF
             {
             try {
				mTYPEDEF();
			} catch (RecognitionException e) {
				e.printStackTrace();
			} 


             }
             break;
         case 2 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:18: EXTERN
             {
             try {
				mEXTERN();
			} catch (RecognitionException e) {
				e.printStackTrace();
			} 


             }
             break;
         case 3 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:25: STATIC
             {
             try {
				mSTATIC();
			} catch (RecognitionException e) {
				e.printStackTrace();
			} 


             }
             break;
         case 4 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:32: AUTO
             {
             try {
				mAUTO();
			} catch (RecognitionException e) {
				e.printStackTrace();
			} 


             }
             break;
         case 5 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:37: REGISTER
             {
             try {
				mREGISTER();
			} catch (RecognitionException e) {
				e.printStackTrace();
			} 


             }
             break;
         case 6 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:46: VOID
             {
             try {
				mVOID();
			} catch (RecognitionException e) {
				e.printStackTrace();
			} 


             }
             break;
         case 7 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:51: CHAR
             {
             try {
				mCHAR();
			} catch (RecognitionException e) {
				e.printStackTrace();
			} 


             }
             break;
         case 8 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:56: SHORT
             {
             try {
				mSHORT();
			} catch (RecognitionException e) {
				e.printStackTrace();
			} 


             }
             break;
         case 9 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:62: INT
             {
             try {
				mINT();
			} catch (RecognitionException e) {
				e.printStackTrace();
			} 


             }
             break;
         case 10 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:66: LONG
             {
             try {
				mLONG();
			} catch (RecognitionException e) {
				e.printStackTrace();
			} 


             }
             break;
         case 11 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:71: FLOAT
             {
             try {
				mFLOAT();
			} catch (RecognitionException e) {
				e.printStackTrace();
			} 


             }
             break;
         case 12 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:77: DOUBLE
             {
             try {
				mDOUBLE();
			} catch (RecognitionException e) {
				e.printStackTrace();
			} 


             }
             break;
         case 13 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:84: SIGNED
             {
             try {
				mSIGNED();
			} catch (RecognitionException e) {
				e.printStackTrace();
			} 


             }
             break;
         case 14 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:91: UNSIGNED
             {
             try {
				mUNSIGNED();
			} catch (RecognitionException e) {
				e.printStackTrace();
			} 


             }
             break;
         case 15 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:100: STRUCT
             {
             try {
				mSTRUCT();
			} catch (RecognitionException e) {
				e.printStackTrace();
			} 


             }
             break;
         case 16 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:107: UNION
             {
             try {
				mUNION();
			} catch (RecognitionException e) {
				e.printStackTrace();
			} 


             }
             break;
         case 17 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:113: ENUM
             {
             try {
				mENUM();
			} catch (RecognitionException e) {
				e.printStackTrace();
			} 


             }
             break;
         case 18 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:118: ELSE
             {
            	 try {
					mELSE();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 19 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:123: CONST
             {
            	 try {
					mCONST();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 20 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:129: VOLATILE
             {
            	 try {
					mVOLATILE();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 21 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:138: SIZEOF
             {
            	 try {
					mSIZEOF();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 22 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:145: CASE
             {
            	 try {
					mCASE();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 23 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:150: DEFAULT
             {
            	 try {
					mDEFAULT();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 24 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:158: IF
             {
            	 try {
					mIF();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 25 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:161: SWITCH
             {
            	 try {
					mSWITCH();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 26 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:168: WHILE
             {
            	 try {
					mWHILE();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 27 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:174: DO
             {
            	 try {
					mDO();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 28 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:177: FOR
             {
            	 try {
					mFOR();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 29 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:181: GOTO
             {
            	 try {
					mGOTO();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 30 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:186: CONTINUE
             {
            	 try {
					mCONTINUE();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 31 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:195: BREAK
             {
            	 try {
					mBREAK();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 32 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:201: RETURN
             {
            	 try {
					mRETURN();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 33 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:208: PLUS
             {
            	 try {
					mPLUS();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 34 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:213: MINUS
             {
            	 try {
					mMINUS();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 35 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:219: ASTERISK
             {
            	 try {
					mASTERISK();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 36 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:228: SLASH
             {
            	 try {
					mSLASH();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 37 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:234: PERCENT_EQUAL
             {
            	 try {
					mPERCENT_EQUAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 38 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:248: AMPERSAND_EQUAL
             {
            	 try {
					mAMPERSAND_EQUAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 39 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:264: PERCENT
             {
            	 try {
					mPERCENT();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 40 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:272: LEFT_SHIFT
             {
            	 try {
					mLEFT_SHIFT();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 41 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:283: RIGHT_SHIFT
             {
            	 try {
					mRIGHT_SHIFT();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 42 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:295: AMPERSAND
             {
            	 try {
					mAMPERSAND();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 43 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:305: VERTICALBAR
             {
            	 try {
					mVERTICALBAR();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 44 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:317: CIRCUMFLEX
             {
            	 try {
					mCIRCUMFLEX();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 45 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:328: SWUNG_DASH
             {
            	 try {
					mSWUNG_DASH();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 46 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:339: DOUBLE_EQUAL
             {
            	 try {
					mDOUBLE_EQUAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 47 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:352: NOT_EQUAL
             {
            	 try {
					mNOT_EQUAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 48 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:362: QUESTION
             {
            	 try {
					mQUESTION();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 49 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:371: LAB
             {
            	 try {
					mLAB();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 50 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:375: RAB
             {
            	 try {
					mRAB();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 51 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:379: LAB_EQUAL
             {
            	 try {
					mLAB_EQUAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 52 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:389: RAB_EQUAL
             {
            	 try {
					mRAB_EQUAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 53 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:399: LPAREN
             {
    	        try {
					mLPAREN();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 54 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:406: RPAREN
             {
            	 try {
					mRPAREN();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 55 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:413: LBRACKET
             {
            	 try {
					mLBRACKET();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 56 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:422: RBRACKET
             {
            	 try {
					mRBRACKET();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 57 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:431: LBRACE
             {
            	 try {
					mLBRACE();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 58 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:438: RBRACE
             {
            	 try {
					mRBRACE();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 59 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:445: COMMA
             {
            	 try {
					mCOMMA();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 60 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:451: COLON
             {
            	 try {
					mCOLON();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 61 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:457: DOT
             {
            	 try {
					mDOT();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 62 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:461: SEMI
             {
            	 try {
					mSEMI();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 63 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:466: EQUAL
             {
            	 try {
					mEQUAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 64 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:472: PLUS_EQUAL
             {
            	 try {
					mPLUS_EQUAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 65 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:483: MINUS_EQUAL
             {
            	 try {
					mMINUS_EQUAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 66 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:495: ASTERISK_EQUAL
             {
            	 try {
					mASTERISK_EQUAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 67 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:510: SLASH_EQUAL
             {
            	 try {
					mSLASH_EQUAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 68 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:522: ELLIPSIS
             {
            	 try {
					mELLIPSIS();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 
             

             }
             break;
         case 69 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:531: DOUBLE_PLUS
             {
            	 try {
					mDOUBLE_PLUS();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 70 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:543: DOUBLE_MINUS
             {
            	 try {
					mDOUBLE_MINUS();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 71 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:556: MINUS_RAB
             {
            	 try {
					mMINUS_RAB();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 72 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:566: NOT
             {
            	 try {
					mNOT();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 73 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:570: DOUBLE_VERTICALBAR
             {
            	 try {
					mDOUBLE_VERTICALBAR();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 74 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:589: VERTICALBAR_EQUAL
             {
            	 try {
					mVERTICALBAR_EQUAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 75 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:607: CIRCUMFLEX_EQUAL
             {
            	 try {
					mCIRCUMFLEX_EQUAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 76 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:624: RIGHT_SHIFT_EQUAL
             {
            	 try {
					mRIGHT_SHIFT_EQUAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 77 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:642: LEFT_SHIFT_EQUAL
             {
            	 try {
					mLEFT_SHIFT_EQUAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 78 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:659: DOUBLE_AMPERSAND
             {
            	 try {
					mDOUBLE_AMPERSAND();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 
             

             }
             break;
         case 79 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:676: IDENTIFIER
             {
            	 try {
					mIDENTIFIER();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 80 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:687: CHARACTER_LITERAL
             {
            	 try {
					mCHARACTER_LITERAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 81 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:705: STRING_LITERAL
             {
            	 try {
					mSTRING_LITERAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 82 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:720: HEX_LITERAL
             {
            	 try {
					mHEX_LITERAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 83 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:732: DECIMAL_LITERAL
             {
            	 try {
					mDECIMAL_LITERAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 84 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:748: OCTAL_LITERAL
             {
            	 try {
					mOCTAL_LITERAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 85 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:762: FLOATING_POINT_LITERAL
             {
            	 try {
					mFLOATING_POINT_LITERAL();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 86 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:785: WS
             {
            	 try {
					mWS();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 
             

             }
             break;
         case 87 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:788: COMMENT
             {
            	 try {
					mCOMMENT();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 88 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:796: LINE_COMMENT
             {
            	 try {
					mLINE_COMMENT();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;
         case 89 :
             // C:\\Users\\상길\\Desktop\\grammer\\CLexer.g:1:809: LINE_COMMAND
             {
            	 try {
					mLINE_COMMAND();
				} catch (RecognitionException e) {
					e.printStackTrace();
				} 


             }
             break;

     }

 }


 protected DFA25 dfa25 = new DFA25(this);
 protected DFA35 dfa35 = new DFA35(this);
 static final String DFA25_eotS =
     "\7\uffff\1\10\2\uffff";
 static final String DFA25_eofS =
     "\12\uffff";
 static final String DFA25_minS =
     "\2\56\2\uffff\1\53\1\uffff\2\60\2\uffff";
 static final String DFA25_maxS =
     "\1\71\1\146\2\uffff\1\71\1\uffff\1\71\1\146\2\uffff";
 static final String DFA25_acceptS =
     "\2\uffff\1\2\1\1\1\uffff\1\4\2\uffff\2\3";
 static final String DFA25_specialS =
     "\12\uffff}>";
 static final String[] DFA25_transitionS = {
         "\1\2\1\uffff\12\1",
         "\1\3\1\uffff\12\1\12\uffff\1\5\1\4\1\5\35\uffff\1\5\1\4\1\5",
         "",
         "",
         "\1\6\1\uffff\1\6\2\uffff\12\7",
         "",
         "\12\7",
         "\12\7\12\uffff\1\11\1\uffff\1\11\35\uffff\1\11\1\uffff\1\11",
         "",
         ""
 };

 static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
 static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
 static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
 static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
 static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
 static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
 static final short[][] DFA25_transition;

 static {
     int numStates = DFA25_transitionS.length;
     DFA25_transition = new short[numStates][];
     for (int i=0; i<numStates; i++) {
         DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
     }
 }

 class DFA25 extends DFA {

     public DFA25(BaseRecognizer recognizer) {
         this.recognizer = recognizer;
         this.decisionNumber = 25;
         this.eot = DFA25_eot;
         this.eof = DFA25_eof;
         this.min = DFA25_min;
         this.max = DFA25_max;
         this.accept = DFA25_accept;
         this.special = DFA25_special;
         this.transition = DFA25_transition;
     }
     public String getDescription() {
         return "130:1: FLOATING_POINT_LITERAL : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ ( Exponent )? FloatTypeSuffix );";
     }
 }
 static final String DFA35_eotS =
     "\1\uffff\17\50\1\112\1\116\1\120\1\124\1\126\1\131\1\134\1\137\1"+
     "\142\1\144\1\uffff\1\146\1\150\11\uffff\1\152\4\uffff\2\155\2\uffff"+
     "\17\50\1\u0083\3\50\1\u0088\5\50\22\uffff\1\u0090\2\uffff\1\u0092"+
     "\20\uffff\1\u0093\1\155\22\50\1\u00a7\1\uffff\2\50\1\u00aa\1\50"+
     "\1\uffff\6\50\5\uffff\2\50\1\u00b4\1\u00b5\6\50\1\u00bc\2\50\1\u00bf"+
     "\1\50\1\u00c1\2\50\1\u00c4\1\uffff\1\u00c5\1\50\1\uffff\5\50\1\u00cc"+
     "\3\50\2\uffff\2\50\1\u00d2\3\50\1\uffff\2\50\1\uffff\1\50\1\uffff"+
     "\1\u00d9\1\50\2\uffff\1\u00db\3\50\1\u00df\1\u00e0\1\uffff\1\u00e1"+
     "\1\50\1\u00e3\1\u00e4\1\u00e5\1\uffff\1\u00e6\1\u00e7\1\u00e8\1"+
     "\50\1\u00ea\1\50\1\uffff\1\50\1\uffff\1\u00ed\2\50\3\uffff\1\u00f0"+
     "\6\uffff\1\50\1\uffff\2\50\1\uffff\1\u00f4\1\50\1\uffff\1\u00f6"+
     "\1\u00f7\1\u00f8\1\uffff\1\u00f9\4\uffff";
 static final String DFA35_eofS =
     "\u00fa\uffff";
 static final String DFA35_minS =
     "\1\11\1\171\1\154\1\150\1\165\1\145\1\157\1\141\1\146\1\157\1\154"+
     "\1\145\1\156\1\150\1\157\1\162\1\53\1\55\1\75\1\52\1\75\1\46\1\74"+
     "\3\75\1\uffff\2\75\11\uffff\1\56\4\uffff\2\56\2\uffff\1\160\1\164"+
     "\1\165\1\163\1\141\1\157\1\147\1\151\1\164\1\147\1\151\1\141\1\156"+
     "\1\163\1\164\1\44\1\156\1\157\1\162\1\44\1\146\2\151\1\164\1\145"+
     "\22\uffff\1\75\2\uffff\1\75\20\uffff\2\56\2\145\1\155\1\145\1\164"+
     "\1\165\1\162\1\156\1\145\1\164\1\157\1\151\1\165\1\144\1\141\1\162"+
     "\1\163\1\145\1\44\1\uffff\1\147\1\141\1\44\1\142\1\uffff\1\141\1"+
     "\151\1\157\1\154\1\157\1\141\5\uffff\1\144\1\162\2\44\1\151\1\143"+
     "\1\164\1\145\1\157\1\143\1\44\1\163\1\162\1\44\1\164\1\44\1\164"+
     "\1\151\1\44\1\uffff\1\44\1\164\1\uffff\1\154\1\165\1\147\1\156\1"+
     "\145\1\44\1\153\1\145\1\156\2\uffff\1\143\1\164\1\44\1\144\1\146"+
     "\1\150\1\uffff\1\164\1\156\1\uffff\1\151\1\uffff\1\44\1\156\2\uffff"+
     "\1\44\1\145\1\154\1\156\2\44\1\uffff\1\44\1\146\3\44\1\uffff\3\44"+
     "\1\145\1\44\1\154\1\uffff\1\165\1\uffff\1\44\1\164\1\145\3\uffff"+
     "\1\44\6\uffff\1\162\1\uffff\2\145\1\uffff\1\44\1\144\1\uffff\3\44"+
     "\1\uffff\1\44\4\uffff";
 static final String DFA35_maxS =
     "\1\176\1\171\1\170\1\167\1\165\1\145\2\157\1\156\3\157\1\156\1\150"+
     "\1\157\1\162\1\75\1\76\5\75\1\76\1\174\1\75\1\uffff\2\75\11\uffff"+
     "\1\71\4\uffff\1\170\1\146\2\uffff\1\160\1\164\1\165\1\163\1\162"+
     "\1\157\1\172\1\151\2\164\1\154\1\141\1\156\1\163\1\164\1\172\1\156"+
     "\1\157\1\162\1\172\1\146\1\163\1\151\1\164\1\145\22\uffff\1\75\2"+
     "\uffff\1\75\20\uffff\2\146\2\145\1\155\1\145\1\164\1\165\1\162\1"+
     "\156\1\145\1\164\1\157\1\151\1\165\1\144\1\141\1\162\1\164\1\145"+
     "\1\172\1\uffff\1\147\1\141\1\172\1\142\1\uffff\1\141\1\151\1\157"+
     "\1\154\1\157\1\141\5\uffff\1\144\1\162\2\172\1\151\1\143\1\164\1"+
     "\145\1\157\1\143\1\172\1\163\1\162\1\172\1\164\1\172\1\164\1\151"+
     "\1\172\1\uffff\1\172\1\164\1\uffff\1\154\1\165\1\147\1\156\1\145"+
     "\1\172\1\153\1\145\1\156\2\uffff\1\143\1\164\1\172\1\144\1\146\1"+
     "\150\1\uffff\1\164\1\156\1\uffff\1\151\1\uffff\1\172\1\156\2\uffff"+
     "\1\172\1\145\1\154\1\156\2\172\1\uffff\1\172\1\146\3\172\1\uffff"+
     "\3\172\1\145\1\172\1\154\1\uffff\1\165\1\uffff\1\172\1\164\1\145"+
     "\3\uffff\1\172\6\uffff\1\162\1\uffff\2\145\1\uffff\1\172\1\144\1"+
     "\uffff\3\172\1\uffff\1\172\4\uffff";
 static final String DFA35_acceptS =
     "\32\uffff\1\55\2\uffff\1\60\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1"+
     "\74\1\uffff\1\76\1\117\1\120\1\121\2\uffff\1\126\1\131\31\uffff"+
     "\1\100\1\105\1\41\1\101\1\106\1\107\1\42\1\102\1\43\1\103\1\127"+
     "\1\130\1\44\1\45\1\47\1\46\1\116\1\52\1\uffff\1\63\1\61\1\uffff"+
     "\1\64\1\62\1\111\1\112\1\53\1\113\1\54\1\56\1\77\1\57\1\110\1\104"+
     "\1\75\1\125\1\122\1\123\25\uffff\1\30\4\uffff\1\33\6\uffff\1\115"+
     "\1\50\1\114\1\51\1\124\23\uffff\1\11\2\uffff\1\34\11\uffff\1\21"+
     "\1\22\6\uffff\1\4\2\uffff\1\6\1\uffff\1\7\2\uffff\1\26\1\12\6\uffff"+
     "\1\35\5\uffff\1\10\6\uffff\1\23\1\uffff\1\13\3\uffff\1\20\1\32\1"+
     "\37\1\uffff\1\2\1\3\1\17\1\15\1\25\1\31\1\uffff\1\40\2\uffff\1\14"+
     "\2\uffff\1\1\3\uffff\1\27\1\uffff\1\5\1\24\1\36\1\16";
 static final String DFA35_specialS =
     "\u00fa\uffff}>";
 static final String[] DFA35_transitionS = {
         "\2\55\1\uffff\2\55\22\uffff\1\55\1\34\1\52\1\56\1\50\1\24\1"+
         "\25\1\51\1\36\1\37\1\22\1\20\1\44\1\21\1\46\1\23\1\53\11\54"+
         "\1\45\1\47\1\26\1\33\1\27\1\35\1\uffff\32\50\1\40\1\uffff\1"+
         "\41\1\31\1\50\1\uffff\1\4\1\17\1\7\1\13\1\2\1\12\1\16\1\50\1"+
         "\10\2\50\1\11\5\50\1\5\1\3\1\1\1\14\1\6\1\15\3\50\1\42\1\30"+
         "\1\43\1\32",
         "\1\57",
         "\1\62\1\uffff\1\61\11\uffff\1\60",
         "\1\64\1\65\12\uffff\1\63\2\uffff\1\66",
         "\1\67",
         "\1\70",
         "\1\71",
         "\1\74\6\uffff\1\72\6\uffff\1\73",
         "\1\76\7\uffff\1\75",
         "\1\77",
         "\1\100\2\uffff\1\101",
         "\1\103\11\uffff\1\102",
         "\1\104",
         "\1\105",
         "\1\106",
         "\1\107",
         "\1\111\21\uffff\1\110",
         "\1\114\17\uffff\1\113\1\115",
         "\1\117",
         "\1\122\4\uffff\1\123\15\uffff\1\121",
         "\1\125",
         "\1\130\26\uffff\1\127",
         "\1\132\1\133",
         "\1\136\1\135",
         "\1\141\76\uffff\1\140",
         "\1\143",
         "",
         "\1\145",
         "\1\147",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "\1\151\1\uffff\12\153",
         "",
         "",
         "",
         "",
         "\1\153\1\uffff\10\156\2\153\12\uffff\3\153\21\uffff\1\154\13"+
         "\uffff\3\153\21\uffff\1\154",
         "\1\153\1\uffff\12\157\12\uffff\3\153\35\uffff\3\153",
         "",
         "",
         "\1\160",
         "\1\161",
         "\1\162",
         "\1\163",
         "\1\164\20\uffff\1\165",
         "\1\166",
         "\1\167\22\uffff\1\170",
         "\1\171",
         "\1\172",
         "\1\173\14\uffff\1\174",
         "\1\175\2\uffff\1\176",
         "\1\177",
         "\1\u0080",
         "\1\u0081",
         "\1\u0082",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\u0084",
         "\1\u0085",
         "\1\u0086",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\24"+
         "\50\1\u0087\5\50",
         "\1\u0089",
         "\1\u008b\11\uffff\1\u008a",
         "\1\u008c",
         "\1\u008d",
         "\1\u008e",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "\1\u008f",
         "",
         "",
         "\1\u0091",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "\1\153\1\uffff\10\156\2\153\12\uffff\3\153\35\uffff\3\153",
         "\1\153\1\uffff\12\157\12\uffff\3\153\35\uffff\3\153",
         "\1\u0094",
         "\1\u0095",
         "\1\u0096",
         "\1\u0097",
         "\1\u0098",
         "\1\u0099",
         "\1\u009a",
         "\1\u009b",
         "\1\u009c",
         "\1\u009d",
         "\1\u009e",
         "\1\u009f",
         "\1\u00a0",
         "\1\u00a1",
         "\1\u00a2",
         "\1\u00a3",
         "\1\u00a4\1\u00a5",
         "\1\u00a6",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "",
         "\1\u00a8",
         "\1\u00a9",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\u00ab",
         "",
         "\1\u00ac",
         "\1\u00ad",
         "\1\u00ae",
         "\1\u00af",
         "\1\u00b0",
         "\1\u00b1",
         "",
         "",
         "",
         "",
         "",
         "\1\u00b2",
         "\1\u00b3",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\u00b6",
         "\1\u00b7",
         "\1\u00b8",
         "\1\u00b9",
         "\1\u00ba",
         "\1\u00bb",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\u00bd",
         "\1\u00be",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\u00c0",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\u00c2",
         "\1\u00c3",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\u00c6",
         "",
         "\1\u00c7",
         "\1\u00c8",
         "\1\u00c9",
         "\1\u00ca",
         "\1\u00cb",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\u00cd",
         "\1\u00ce",
         "\1\u00cf",
         "",
         "",
         "\1\u00d0",
         "\1\u00d1",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\u00d3",
         "\1\u00d4",
         "\1\u00d5",
         "",
         "\1\u00d6",
         "\1\u00d7",
         "",
         "\1\u00d8",
         "",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\u00da",
         "",
         "",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\u00dc",
         "\1\u00dd",
         "\1\u00de",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\u00e2",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\u00e9",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\u00eb",
         "",
         "\1\u00ec",
         "",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\u00ee",
         "\1\u00ef",
         "",
         "",
         "",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "",
         "",
         "",
         "",
         "",
         "",
         "\1\u00f1",
         "",
         "\1\u00f2",
         "\1\u00f3",
         "",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\u00f5",
         "",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "",
         "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
         "\50",
         "",
         "",
         "",
         ""
 };

 static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
 static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
 static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
 static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
 static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
 static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
 static final short[][] DFA35_transition;

 static {
     int numStates = DFA35_transitionS.length;
     DFA35_transition = new short[numStates][];
     for (int i=0; i<numStates; i++) {
         DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
     }
 }

 class DFA35 extends DFA {

     public DFA35(BaseRecognizer recognizer) {
         this.recognizer = recognizer;
         this.decisionNumber = 35;
         this.eot = DFA35_eot;
         this.eof = DFA35_eof;
         this.min = DFA35_min;
         this.max = DFA35_max;
         this.accept = DFA35_accept;
         this.special = DFA35_special;
         this.transition = DFA35_transition;
     }
     public String getDescription() {
         return "1:1: Tokens : ( TYPEDEF | EXTERN | STATIC | AUTO | REGISTER | VOID | CHAR | SHORT | INT | LONG | FLOAT | DOUBLE | SIGNED | UNSIGNED | STRUCT | UNION | ENUM | ELSE | CONST | VOLATILE | SIZEOF | CASE | DEFAULT | IF | SWITCH | WHILE | DO | FOR | GOTO | CONTINUE | BREAK | RETURN | PLUS | MINUS | ASTERISK | SLASH | PERCENT_EQUAL | AMPERSAND_EQUAL | PERCENT | LEFT_SHIFT | RIGHT_SHIFT | AMPERSAND | VERTICALBAR | CIRCUMFLEX | SWUNG_DASH | DOUBLE_EQUAL | NOT_EQUAL | QUESTION | LAB | RAB | LAB_EQUAL | RAB_EQUAL | LPAREN | RPAREN | LBRACKET | RBRACKET | LBRACE | RBRACE | COMMA | COLON | DOT | SEMI | EQUAL | PLUS_EQUAL | MINUS_EQUAL | ASTERISK_EQUAL | SLASH_EQUAL | ELLIPSIS | DOUBLE_PLUS | DOUBLE_MINUS | MINUS_RAB | NOT | DOUBLE_VERTICALBAR | VERTICALBAR_EQUAL | CIRCUMFLEX_EQUAL | RIGHT_SHIFT_EQUAL | LEFT_SHIFT_EQUAL | DOUBLE_AMPERSAND | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOATING_POINT_LITERAL | WS | COMMENT | LINE_COMMENT | LINE_COMMAND );";
     }
 }
 
 class NoViableAltException
 {
	 
 }


}