/* The following code was generated by JFlex 1.3.5 on 26.10.2020, 15:32 */

    
import cup.example.symbols;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
    

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.3.5
 * on 26.10.2020, 15:32 from the specification file
 * <tt>file:/C:/Users/catal/OneDrive/Desktop/cup-master/html/lexer.jflex</tt>
 */
class Lexer implements symbols, java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  final public static int YYEOF = -1;

  /** initial size of the lookahead buffer */
  final private static int YY_BUFFERSIZE = 16384;

  /** lexical states */
  final public static int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  final private static String yycmap_packed = 
    "\41\0\1\0\10\0\1\0\1\0\1\42\1\0\1\0\1\7\1\0"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\5\0\1\1\1\0\1\2"+
    "\42\0\1\12\1\3\1\24\1\5\1\14\1\10\1\26\1\25\1\20"+
    "\1\0\1\35\1\23\1\13\1\17\1\4\1\21\1\0\1\11\1\15"+
    "\1\16\1\22\1\37\1\36\1\40\1\6\1\41\uff85\0";

  /** 
   * Translates characters to character classes
   */
  final private static char [] yycmap = yy_unpack_cmap(yycmap_packed);

  /** 
   * Translates a state to a row index in the transition table
   */
  final private static int yy_rowMap [] = { 
        0,    35,    70,   105,   140,   175,   210,   245,   280,   315, 
      350,   385,   420,   455,   490,   525,   560,   595,   630,   665, 
      700,   735,    70,   770,   805,   840,   875,    70,   910,   945, 
      980,  1015,  1050,  1085,  1120,  1155,  1190,  1225,  1260,  1295, 
     1330,  1365,  1400,  1435,  1470,  1505,  1540,  1575,  1610,    70, 
     1645,  1680,  1715,  1750,  1785,  1820,  1855,  1890,  1925,  1960, 
     1995,  2030,  2065,    70,  2100,    70,  2135,  2170,  2205,    70, 
     2240,  2275,  2310,    70,  2345,  2380,  2415,  2450,  2485,  2520, 
     2555,  2590,  2625,  2660,    70,    70,  2695,  2730,  2765,  2800, 
     2835,    70,    70,    70,    70,    70,    70,    70,    70,    70, 
     2870,  2905,  2940,  2975,  3010,  3045,  3080,  3115,  3150,  3185, 
     3220,  3255,  3290,  3325,  3360,  3395,  3430,  3465,  3500,  3535, 
     3570,  3605,  3640,  3675,  3710,  3745,  3780,  3815,  3850,  3885, 
     3920,  3955,  3990,  4025,  4060,  4095,  4130,    70,  4165,  4200, 
     4235,  4270,  4305,    70,    70,  4340,    70,  4375,    70,    70, 
       70,    70,    70,    70,    70,    70,    70,  4410,  4445,  4480, 
     4515,  4550,    70,    70,  4585,  4620,  4655,  4690,    70,  4725, 
     4760,  4795,  4830,  4865,  4900,  4935,  4970,  5005,  5040,  5075, 
     5110,  5145,  5180,  5215,  5250,  5285,  5320,  5355,  5390,  5425, 
     5460,  5495,  5530,  5565,  5600,  5635,  5670,    70,  5705,  5740, 
     5775,  5810,  5845,  5880,  5915,  5950,    70,    70,  5985,  6020, 
       70,    70,  6055,  6090,  6125,  6160,  6195,  6230,  6265,  6300, 
     6335,  6370,  6405,  6440,  6475,  6510,  6545,  6580,  6615,  6650, 
     6685,  6720,  6755,  6790,  6825,  6860,  6895,  6930,  6965,  7000, 
     7035,    70,  7070,    70,    70,  7105,  7140,  7175,  7210,  7245, 
     7280,    70,  7315,    70,    70,    70,  7350,    70,  7385,  7420, 
     7455,  7490,  7525,  7560,  7595,  7630,  7665,  7700,  7735,  7770, 
     7805,  7840,  7875,  7910,    70,    70,  7945,  7980,    70,  8015, 
       70,  8050,  8085,    70,  8120,  8155,  8190,  8225,  8260,  8295, 
     8330,  8365,  8400,  8435,  8470,  8505,  8540,    70,  8575,    70, 
     8610,  8645,  8680,  8715,  8750,  8785,  8820,  8855,  8890,  8925, 
     8960,  8995,  9030,    70,    70,  9065,  9100,  9135,  9170,  9205, 
       70,    70,  9240,  9275,  9310,  9345,  9380,  9415,  9450,  9485, 
     9520,  9555,  9590,  9625
  };

  /** 
   * The packed transition table of the DFA (part 0)
   */
  final private static String yy_packed0 = 
    "\1\0\1\2\1\3\1\4\1\5\1\6\3\0\1\7"+
    "\1\10\1\11\1\0\1\12\1\13\1\14\1\15\2\0"+
    "\1\16\1\17\1\20\10\0\1\21\1\22\6\0\1\23"+
    "\1\24\2\0\1\25\1\26\1\0\1\27\2\0\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\0\1\37"+
    "\72\0\1\40\13\0\1\41\33\0\1\42\34\0\1\43"+
    "\1\44\5\0\1\45\36\0\1\46\37\0\1\47\11\0"+
    "\1\50\1\51\30\0\1\52\46\0\1\53\2\0\1\54"+
    "\3\0\1\55\23\0\1\56\3\0\1\57\5\0\1\60"+
    "\34\0\1\61\35\0\1\62\41\0\1\63\5\0\1\64"+
    "\1\0\1\65\32\0\1\66\7\0\1\67\6\0\1\70"+
    "\1\0\1\71\26\0\1\72\2\0\1\73\1\74\2\0"+
    "\1\75\42\0\1\76\37\0\1\74\31\0\1\77\4\0"+
    "\1\100\52\0\1\101\1\0\1\102\22\0\1\103\1\104"+
    "\3\0\1\105\1\0\1\106\2\0\1\107\1\110\1\111"+
    "\1\112\1\113\1\114\1\115\1\0\1\116\21\0\1\117"+
    "\4\0\1\120\44\0\1\121\1\122\5\0\1\123\23\0"+
    "\1\124\1\0\1\125\3\0\1\126\1\127\12\0\1\130"+
    "\21\0\1\131\51\0\1\132\3\0\1\133\46\0\1\134"+
    "\37\0\1\135\33\0\1\136\15\0\1\137\1\140\1\141"+
    "\1\142\1\143\1\144\32\0\1\145\37\0\1\146\2\0"+
    "\1\147\23\0\1\150\5\0\1\151\10\0\1\152\10\0"+
    "\1\153\11\0\1\154\5\0\1\155\46\0\1\156\35\0"+
    "\1\62\54\0\1\62\13\0\1\62\27\0\1\157\34\0"+
    "\1\62\1\0\1\160\46\0\1\161\24\0\1\162\42\0"+
    "\1\163\50\0\1\164\40\0\1\56\51\0\1\165\24\0"+
    "\1\166\5\0\1\167\47\0\1\163\37\0\1\165\33\0"+
    "\1\170\55\0\1\171\33\0\1\172\37\0\1\173\11\0"+
    "\1\174\42\0\1\175\35\0\1\176\1\0\1\177\40\0"+
    "\1\200\44\0\1\201\46\0\1\202\43\0\1\203\26\0"+
    "\1\204\42\0\1\205\42\0\1\206\53\0\1\207\30\0"+
    "\1\210\57\0\1\211\1\0\1\212\23\0\1\213\4\0"+
    "\1\214\44\0\1\215\1\216\5\0\1\217\25\0\1\220"+
    "\3\0\1\221\1\222\12\0\1\223\21\0\1\224\40\0"+
    "\1\225\63\0\1\226\37\0\1\227\51\0\1\230\1\231"+
    "\1\232\1\233\1\234\1\235\17\0\1\236\5\0\1\237"+
    "\35\0\1\240\42\0\1\241\53\0\1\242\22\0\1\243"+
    "\15\0\1\244\25\0\1\245\41\0\1\246\53\0\1\247"+
    "\36\0\1\250\60\0\1\251\35\0\1\252\56\0\1\253"+
    "\16\0\1\254\35\0\1\255\41\0\1\256\43\0\1\257"+
    "\61\0\1\260\33\0\1\261\47\0\1\262\47\0\1\263"+
    "\26\0\1\62\55\0\1\264\43\0\1\265\30\0\1\266"+
    "\43\0\1\267\50\0\1\165\42\0\1\270\33\0\1\62"+
    "\46\0\1\271\50\0\1\272\35\0\1\62\47\0\1\62"+
    "\32\0\1\273\40\0\1\274\44\0\1\275\42\0\1\276"+
    "\41\0\1\277\37\0\1\45\41\0\1\300\41\0\1\301"+
    "\60\0\1\302\26\0\1\303\35\0\1\304\53\0\1\305"+
    "\32\0\1\306\54\0\1\307\27\0\1\310\53\0\1\311"+
    "\35\0\1\312\5\0\1\313\35\0\1\314\42\0\1\315"+
    "\53\0\1\316\22\0\1\317\15\0\1\320\24\0\1\321"+
    "\47\0\1\322\45\0\1\323\45\0\1\324\37\0\1\325"+
    "\52\0\1\326\33\0\1\327\33\0\1\330\60\0\1\331"+
    "\31\0\1\332\41\0\1\333\53\0\1\334\46\0\1\335"+
    "\20\0\1\336\61\0\1\337\42\0\1\340\41\0\1\341"+
    "\40\0\1\342\30\0\1\343\75\0\1\344\27\0\1\345"+
    "\34\0\1\346\41\0\1\62\40\0\1\347\51\0\1\350"+
    "\41\0\1\351\36\0\1\352\37\0\1\353\41\0\1\354"+
    "\32\0\1\355\53\0\1\356\42\0\1\357\43\0\1\62"+
    "\42\0\1\272\50\0\1\360\44\0\1\353\41\0\1\165"+
    "\32\0\1\265\53\0\1\62\21\0\1\361\44\0\1\362"+
    "\54\0\1\363\35\0\1\364\45\0\1\365\37\0\1\366"+
    "\52\0\1\367\33\0\1\370\51\0\1\371\30\0\1\372"+
    "\45\0\1\373\51\0\1\374\43\0\1\375\24\0\1\376"+
    "\50\0\1\377\33\0\1\u0100\47\0\1\u0101\46\0\1\u0102"+
    "\35\0\1\u0103\52\0\1\u0104\25\0\1\45\62\0\1\152"+
    "\33\0\1\u0105\51\0\1\u0106\23\0\1\u0107\13\0\1\u0108"+
    "\1\170\24\0\1\u0109\50\0\1\u010a\67\0\1\165\20\0"+
    "\1\u010b\36\0\1\u010c\55\0\1\u010d\23\0\1\u010e\53\0"+
    "\1\62\36\0\1\u010f\42\0\1\u0110\47\0\1\u0111\20\0"+
    "\1\u0112\13\0\1\u0113\43\0\1\64\47\0\1\u0114\27\0"+
    "\1\u0115\52\0\1\u0116\51\0\1\u0117\43\0\1\u0118\32\0"+
    "\1\u0119\40\0\1\u011a\45\0\1\u011b\43\0\1\u011c\37\0"+
    "\1\u011d\33\0\1\u011e\52\0\1\u011f\42\0\1\u0120\63\0"+
    "\1\62\11\0\1\u0121\47\0\1\u0122\50\0\1\165\26\0"+
    "\1\163\74\0\1\u0123\25\0\1\u0124\47\0\1\u0125\31\0"+
    "\1\u0126\37\0\1\u0127\46\0\1\165\43\0\1\u0128\42\0"+
    "\1\u0129\43\0\1\u012a\40\0\1\u012b\43\0\1\u012c\37\0"+
    "\1\u012d\43\0\1\u012e\42\0\1\u012f\50\0\1\u0130\31\0"+
    "\1\u0131\35\0\1\u0132\1\u0107\5\0\1\u0133\6\0\1\170"+
    "\56\0\1\265\20\0\1\176\42\0\1\u0134\47\0\1\353"+
    "\35\0\1\342\66\0\1\62\30\0\1\u0135\30\0\1\u0136"+
    "\41\0\1\u0137\43\0\1\u0138\42\0\1\u0139\44\0\1\u013a"+
    "\41\0\1\u013b\44\0\1\15\41\0\1\u013c\46\0\1\353"+
    "\14\0\1\u013d\7\0\1\346\44\0\1\u013e\54\0\1\265"+
    "\27\0\1\u013f\51\0\1\u0140\44\0\1\u0141\41\0\1\u0142"+
    "\45\0\1\u0143\36\0\1\45\70\0\1\u0144\20\0\1\u0145"+
    "\41\0\1\u0146\37\0\1\277\40\0\1\u0147\46\0\1\345"+
    "\46\0\1\62\44\0\1\u0148\42\0\1\u0149\32\0\1\u014a"+
    "\43\0\1\u014b\42\0\1\u014c\62\0\1\u014d\21\0\1\u014e"+
    "\34\0\1\62\34\0";

  /** 
   * The transition table of the DFA
   */
  final private static int yytrans [] = yy_unpack();


  /* error codes */
  final private static int YY_UNKNOWN_ERROR = 0;
  final private static int YY_ILLEGAL_STATE = 1;
  final private static int YY_NO_MATCH = 2;
  final private static int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  final private static String YY_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Internal error: unknown state",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private final static byte YY_ATTRIBUTE[] = {
     0,  0,  9,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  9,  0,  0,  0,  1,  9,  1,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  9,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  9, 
     0,  9,  0,  0,  0,  9,  0,  0,  0,  9,  0,  1,  0,  0,  0,  0, 
     0,  0,  0,  0,  9,  9,  0,  1,  0,  0,  0,  9,  9,  9,  9,  9, 
     9,  9,  9,  9,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  9,  0,  0,  0,  0,  0,  9, 
     9,  0,  9,  0,  9,  9,  9,  9,  9,  9,  9,  9,  9,  0,  0,  0, 
     0,  0,  9,  9,  0,  0,  0,  0,  9,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  0,  0,  0,  0, 
     1,  0,  0,  0,  0,  9,  0,  0,  0,  0,  0,  0,  0,  0,  9,  9, 
     0,  0,  9,  9,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  9,  0,  9,  9,  0,  0,  0,  0,  0,  1,  9,  0,  9,  9,  9, 
     0,  9,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  9,  9,  0,  0,  9,  0,  9,  0,  0,  9,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  9,  0,  9,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  9,  9,  0,  0,  0,  0,  0, 
     9,  9,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char yy_buffer[] = new char[YY_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int yy_endRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn; 

  /** 
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL = true;

  /** yy_atEOF == true <=> the scanner is at the EOF */
  private boolean yy_atEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean yy_eof_done;

  /* user code: */
	
	public static final int endTag = 1;
    public static final int bodyOpen = 2;
    public static final int bodyClose = 3;
    public static final int frame = 4;
    public static final int framesetOpen = 5;
    public static final int framesetClose = 6;
    public static final int noframesOpen = 7;
    public static final int noframesClose = 8;
    public static final int formOpen = 9;
    public static final int formClose = 10;
    public static final int input = 11;
    public static final int selectOpen = 12;
    public static final int selectClose = 13;
    public static final int optionOpen = 14;
    public static final int optionClose = 15;
    public static final int tableOpen = 16;
    public static final int tableClose = 17;
    public static final int trOpen = 18;
    public static final int trClose = 19;
    public static final int tdOpen = 20;
    public static final int tdClose = 21;
    public static final int thOpen = 22;
    public static final int thClose = 23;
    public static final int thread = 24;
    public static final int tbody = 25;
    public static final int img = 26;
    public static final int aOpen = 27;
    public static final int aClose = 28;
    public static final int ulOpen = 29;
    public static final int ulClose = 30;
    public static final int liOpen = 31;
    public static final int liClose = 32;
    public static final int olOpen = 33;
    public static final int olClose = 34;
    public static final int pOpen = 35;
    public static final int pClose = 36;
    public static final int iOpen = 37;
    public static final int iClose = 38;
    public static final int uOpen = 39;
    public static final int uClose = 40;
    public static final int smallOpen = 41;
    public static final int smallClose = 42;
    public static final int supOpen = 43;
    public static final int supClose = 44;
    public static final int subOpen = 45;
    public static final int subClose = 46;
    public static final int center = 47;
    public static final int fontOpen = 48;
    public static final int fontClose = 49;
    public static final int h1Open = 50;
    public static final int h1Close = 51;
    public static final int h2Open = 52;
    public static final int h2Close = 53;
    public static final int h3Open = 54;
    public static final int h3Close = 55;
    public static final int h4Open = 56;
    public static final int h4Close = 57;
    public static final int h5Open = 58;
    public static final int h5Close = 59;
    public static final int h6Open = 60;
    public static final int h6Close = 61;
    public static final int hr = 62;
    public static final int br = 63;
	
    public Lexer(ComplexSymbolFactory sf, java.io.InputStream is){
		this(is);
        symbolFactory = sf;
    }
	public Lexer(ComplexSymbolFactory sf, java.io.Reader reader){
		this(reader);
        symbolFactory = sf;
    }
    
    private StringBuffer sb;
    private ComplexSymbolFactory symbolFactory;
    private int csline,cscolumn;

    public Symbol symbol(String name, int code){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1,yycolumn+1, yychar), // -yylength()
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength())
				);
    }
    public Symbol symbol(String name, int code, String lexem){
	return symbolFactory.newSymbol(name, code, 
						new Location(yyline+1, yycolumn +1, yychar), 
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength()), lexem);
    }
    
    protected void emit_warning(String message){
    	System.out.println("scanner warning: " + message + " at : 2 "+ 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
    
    protected void emit_error(String message){
    	System.out.println("scanner error: " + message + " at : 2" + 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the split, compressed DFA transition table.
   *
   * @return the unpacked transition table
   */
  private static int [] yy_unpack() {
    int [] trans = new int[9660];
    int offset = 0;
    offset = yy_unpack(yy_packed0, offset, trans);
    return trans;
  }

  /** 
   * Unpacks the compressed DFA transition table.
   *
   * @param packed   the packed transition table
   * @return         the index of the last entry
   */
  private static int yy_unpack(String packed, int offset, int [] trans) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do trans[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] yy_unpack_cmap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 96) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   IOException  if any I/O-Error occurs
   */
  private boolean yy_refill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, 
                       yy_buffer, 0, 
                       yy_endRead-yy_startRead);

      /* translate stored positions */
      yy_endRead-= yy_startRead;
      yy_currentPos-= yy_startRead;
      yy_markedPos-= yy_startRead;
      yy_pushbackPos-= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos*2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, 
                                            yy_buffer.length-yy_endRead);

    if (numRead < 0) {
      return true;
    }
    else {
      yy_endRead+= numRead;  
      return false;
    }
  }


  /**
   * Closes the input stream.
   */
  final public void yyclose() throws java.io.IOException {
    yy_atEOF = true;            /* indicate end of file */
    yy_endRead = yy_startRead;  /* invalidate buffer    */

    if (yy_reader != null)
      yy_reader.close();
  }


  /**
   * Closes the current stream, and resets the
   * scanner to read from a new input stream.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>YY_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  final public void yyreset(java.io.Reader reader) throws java.io.IOException {
    yyclose();
    yy_reader = reader;
    yy_atBOL  = true;
    yy_atEOF  = false;
    yy_endRead = yy_startRead = 0;
    yy_currentPos = yy_markedPos = yy_pushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    yy_lexical_state = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  final public int yystate() {
    return yy_lexical_state;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  final public void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  final public String yytext() {
    return new String( yy_buffer, yy_startRead, yy_markedPos-yy_startRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  final public char yycharat(int pos) {
    return yy_buffer[yy_startRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  final public int yylength() {
    return yy_markedPos-yy_startRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void yy_ScanError(int errorCode) {
    String message;
    try {
      message = YY_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = YY_ERROR_MSG[YY_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  private void yypushback(int number)  {
    if ( number > yylength() )
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void yy_do_eof() throws java.io.IOException {
    if (!yy_eof_done) {
      yy_eof_done = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;

    // cached fields:
    int yy_currentPos_l;
    int yy_startRead_l;
    int yy_markedPos_l;
    int yy_endRead_l = yy_endRead;
    char [] yy_buffer_l = yy_buffer;
    char [] yycmap_l = yycmap;

    int [] yytrans_l = yytrans;
    int [] yy_rowMap_l = yy_rowMap;
    byte [] yy_attr_l = YY_ATTRIBUTE;

    while (true) {
      yy_markedPos_l = yy_markedPos;

      boolean yy_r = false;
      for (yy_currentPos_l = yy_startRead; yy_currentPos_l < yy_markedPos_l;
                                                             yy_currentPos_l++) {
        switch (yy_buffer_l[yy_currentPos_l]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          yy_r = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          yy_r = true;
          break;
        case '\n':
          if (yy_r)
            yy_r = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          yy_r = false;
          yycolumn++;
        }
      }

      if (yy_r) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean yy_peek;
        if (yy_markedPos_l < yy_endRead_l)
          yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        else if (yy_atEOF)
          yy_peek = false;
        else {
          boolean eof = yy_refill();
          yy_markedPos_l = yy_markedPos;
          yy_buffer_l = yy_buffer;
          if (eof) 
            yy_peek = false;
          else 
            yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        }
        if (yy_peek) yyline--;
      }
      yy_action = -1;

      yy_startRead_l = yy_currentPos_l = yy_currentPos = 
                       yy_startRead = yy_markedPos_l;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          if (yy_currentPos_l < yy_endRead_l)
            yy_input = yy_buffer_l[yy_currentPos_l++];
          else if (yy_atEOF) {
            yy_input = YYEOF;
            break yy_forAction;
          }
          else {
            // store back cached positions
            yy_currentPos  = yy_currentPos_l;
            yy_markedPos   = yy_markedPos_l;
            boolean eof = yy_refill();
            // get translated positions and possibly new buffer
            yy_currentPos_l  = yy_currentPos;
            yy_markedPos_l   = yy_markedPos;
            yy_buffer_l      = yy_buffer;
            yy_endRead_l     = yy_endRead;
            if (eof) {
              yy_input = YYEOF;
              break yy_forAction;
            }
            else {
              yy_input = yy_buffer_l[yy_currentPos_l++];
            }
          }
          int yy_next = yytrans_l[ yy_rowMap_l[yy_state] + yycmap_l[yy_input] ];
          if (yy_next == -1) break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = yy_attr_l[yy_state];
          if ( (yy_attributes & 1) == 1 ) {
            yy_action = yy_state; 
            yy_markedPos_l = yy_currentPos_l; 
            if ( (yy_attributes & 8) == 8 ) break yy_forAction;
          }

        }
      }

      // store back cached position
      yy_markedPos = yy_markedPos_l;

      switch (yy_action) {

        case 93: 
          {  return symbolFactory.newSymbol("hr", hr);  }
        case 335: break;
        case 63: 
          {  return symbolFactory.newSymbol("br", br);  }
        case 336: break;
        case 314: 
          {  return symbolFactory.newSymbol("noframesOpen",noframesOpen);  }
        case 337: break;
        case 313: 
          {  return symbolFactory.newSymbol("framesetOpen",framesetOpen);  }
        case 338: break;
        case 321: 
          {  return symbolFactory.newSymbol("noframesClose",noframesClose);  }
        case 339: break;
        case 320: 
          {  return symbolFactory.newSymbol("framesetClose", framesetClose);  }
        case 340: break;
        case 163: 
          {  return symbolFactory.newSymbol("supOpen", supOpen);  }
        case 341: break;
        case 162: 
          {  return symbolFactory.newSymbol("subOpen", subOpen);  }
        case 342: break;
        case 156: 
          {  return symbolFactory.newSymbol("h6Close", h6Close);  }
        case 343: break;
        case 137: 
          {  return symbolFactory.newSymbol("olClose",olClose);  }
        case 344: break;
        case 143: 
          {  return symbolFactory.newSymbol("tdClose", tdClose);  }
        case 345: break;
        case 144: 
          {  return symbolFactory.newSymbol("trClose",trClose);  }
        case 346: break;
        case 146: 
          {  return symbolFactory.newSymbol("thClose", thClose);  }
        case 347: break;
        case 149: 
          {  return symbolFactory.newSymbol("ulClose", ulClose);  }
        case 348: break;
        case 150: 
          {  return symbolFactory.newSymbol("liClose", liClose);  }
        case 349: break;
        case 151: 
          {  return symbolFactory.newSymbol("h1Close", h1Close);  }
        case 350: break;
        case 152: 
          {  return symbolFactory.newSymbol("h2Close", h2Close);  }
        case 351: break;
        case 153: 
          {  return symbolFactory.newSymbol("h3Close", h3Close);  }
        case 352: break;
        case 154: 
          {  return symbolFactory.newSymbol("h4Close", h4Close);  }
        case 353: break;
        case 155: 
          {  return symbolFactory.newSymbol("h5Close",h5Close);  }
        case 354: break;
        case 257: 
          {  return symbolFactory.newSymbol("input", input);  }
        case 355: break;
        case 253: 
          {  return symbolFactory.newSymbol("tbody",tbody);  }
        case 356: break;
        case 250: 
          {  return symbolFactory.newSymbol("frame",frame);  }
        case 357: break;
        case 22: 
          {  return symbolFactory.newSymbol("aOpen", aOpen);  }
        case 358: break;
        case 26: 
          {  return symbolFactory.newSymbol("iOpen", iOpen);  }
        case 359: break;
        case 27: 
          {  return symbolFactory.newSymbol("pOpen", pOpen);  }
        case 360: break;
        case 28: 
          {  return symbolFactory.newSymbol("uOpen", uOpen);  }
        case 361: break;
        case 283: 
          {  return symbolFactory.newSymbol("selectOpen", selectOpen);  }
        case 362: break;
        case 280: 
          {  return symbolFactory.newSymbol("tableClose", tableClose);  }
        case 363: break;
        case 278: 
          {  return symbolFactory.newSymbol("smallClose",smallClose);  }
        case 364: break;
        case 275: 
          {  return symbolFactory.newSymbol("optionOpen",optionOpen);  }
        case 365: break;
        case 168: 
          {  return symbolFactory.newSymbol("img", img);  }
        case 366: break;
        case 211: 
          {  return symbolFactory.newSymbol("fontOpen", fontOpen);  }
        case 367: break;
        case 210: 
          {  return symbolFactory.newSymbol("formOpen", formOpen);  }
        case 368: break;
        case 207: 
          {  return symbolFactory.newSymbol("supClose", supClose);  }
        case 369: break;
        case 206: 
          {  return symbolFactory.newSymbol("subClose",subClose);  }
        case 370: break;
        case 197: 
          {  return symbolFactory.newSymbol("bodyOpen", bodyOpen);  }
        case 371: break;
        case 299: 
          {  return symbolFactory.newSymbol("selectClose", selectClose);  }
        case 372: break;
        case 297: 
          {  return symbolFactory.newSymbol("optionClose", optionClose);  }
        case 373: break;
        case 254: 
          {  return symbolFactory.newSymbol("tableOpen", tableOpen);  }
        case 374: break;
        case 251: 
          {  return symbolFactory.newSymbol("smallOpen", smallOpen);  }
        case 375: break;
        case 244: 
          {  return symbolFactory.newSymbol("fontClose", fontClose);  }
        case 376: break;
        case 243: 
          {  return symbolFactory.newSymbol("formClose", formClose);  }
        case 377: break;
        case 241: 
          {  return symbolFactory.newSymbol("bodyClose",bodyClose);  }
        case 378: break;
        case 192: 
          {  return symbolFactory.newSymbol("accesskey", accesskey);  }
        case 379: break;
        case 187: 
          {  return symbolFactory.newSymbol("accesskey", accesskey);  }
        case 380: break;
        case 49: 
          {  return symbolFactory.newSymbol("accesskey", accesskey);  }
        case 381: break;
        case 274: 
          {  return symbolFactory.newSymbol("center",center);  }
        case 382: break;
        case 255: 
          {  return symbolFactory.newSymbol("thread", thread);  }
        case 383: break;
        case 92: 
          {  return symbolFactory.newSymbol("liOpen",liOpen);  }
        case 384: break;
        case 91: 
          {  return symbolFactory.newSymbol("ulOpen", ulOpen);  }
        case 385: break;
        case 87: 
          {  return symbolFactory.newSymbol("thOpen", thOpen);  }
        case 386: break;
        case 85: 
          {  return symbolFactory.newSymbol("trOpen", trOpen);  }
        case 387: break;
        case 84: 
          {  return symbolFactory.newSymbol("tdOpen", tdOpen);  }
        case 388: break;
        case 75: 
          {  return symbolFactory.newSymbol("uClose",uClose);  }
        case 389: break;
        case 73: 
          {  return symbolFactory.newSymbol("iClose", iClose);  }
        case 390: break;
        case 69: 
          {  return symbolFactory.newSymbol("aClose", aClose);  }
        case 391: break;
        case 2: 
          {  return symbolFactory.newSymbol("endTag", endTag);  }
        case 392: break;
        case 65: 
          {  return symbolFactory.newSymbol("olOpen",olOpen);  }
        case 393: break;
        case 94: 
          {  return symbolFactory.newSymbol("h1Open", h1Open);  }
        case 394: break;
        case 95: 
          {  return symbolFactory.newSymbol("h2Open", h2Open);  }
        case 395: break;
        case 96: 
          {  return symbolFactory.newSymbol("h3Open", h3Open);  }
        case 396: break;
        case 97: 
          {  return symbolFactory.newSymbol("h4Open",h4Open);  }
        case 397: break;
        case 98: 
          {  return symbolFactory.newSymbol("h5Open",h5Open);  }
        case 398: break;
        case 99: 
          {  return symbolFactory.newSymbol("h6Open", h6Open);  }
        case 399: break;
        case 148: 
          {  return symbolFactory.newSymbol("pClose",pClose);  }
        case 400: break;
        default: 
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
            yy_do_eof();
              { return null;}//new java_cup.runtime.Symbol(symbols.EOF); }
              
          } 
          else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }


}
