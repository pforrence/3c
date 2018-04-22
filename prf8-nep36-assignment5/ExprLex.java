/* The following code was generated by JFlex 1.4.3 on 4/22/18 5:23 PM */

import java_cup.runtime.Symbol;
import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 4/22/18 5:23 PM from the specification file
 * <tt>ExprLex.flex</tt>
 */
class ExprLex implements java_cup.runtime.Scanner, sym {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\13\1\10\1\0\1\13\1\7\22\0\1\13\1\46\3\0"+
    "\1\14\1\41\1\0\1\51\1\52\1\12\1\43\1\45\1\44\1\54"+
    "\1\11\1\3\7\6\2\2\1\0\1\57\1\42\1\40\3\0\1\17"+
    "\1\27\1\15\1\24\1\21\1\5\1\34\1\37\1\30\2\1\1\16"+
    "\1\36\1\23\1\32\1\25\1\1\1\33\1\20\1\22\1\26\1\31"+
    "\1\35\1\4\1\53\1\1\1\55\1\0\1\56\1\0\1\1\1\0"+
    "\1\17\1\27\1\15\1\24\1\21\1\5\1\34\1\37\1\30\2\1"+
    "\1\16\1\36\1\23\1\32\1\25\1\1\1\33\1\20\1\22\1\26"+
    "\1\31\1\35\1\4\1\53\1\1\1\47\1\0\1\50\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\2\2\4\1\1\1\5"+
    "\1\1\15\2\1\6\1\1\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\3\1\0\1\2\1\4\1\0\13\2\1\24"+
    "\5\2\1\25\1\3\1\2\1\0\11\2\1\26\2\2"+
    "\1\27\5\2\1\0\6\2\1\30\1\31\1\32\2\2"+
    "\1\33\2\2\1\34\1\35\2\0\1\36\10\2\1\37"+
    "\1\0\1\40\1\41\1\42\2\2\1\43\1\2\1\44"+
    "\1\0\1\45\1\46\12\0\1\47";

  private static int [] zzUnpackAction() {
    int [] result = new int[135];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\140\0\220\0\300\0\360\0\u0120\0\60"+
    "\0\u0150\0\60\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270"+
    "\0\u02a0\0\u02d0\0\u0300\0\u0330\0\u0360\0\u0390\0\u03c0\0\u03f0"+
    "\0\60\0\u0420\0\60\0\60\0\60\0\60\0\60\0\60"+
    "\0\60\0\60\0\60\0\60\0\60\0\60\0\60\0\u0450"+
    "\0\u0480\0\u04b0\0\u04e0\0\u0510\0\u0540\0\u0570\0\u05a0\0\u05d0"+
    "\0\u0600\0\u0630\0\u0660\0\u0690\0\u06c0\0\u06f0\0\u0720\0\140"+
    "\0\u0750\0\u0780\0\u07b0\0\u07e0\0\u0810\0\60\0\u0480\0\u0840"+
    "\0\u0870\0\u08a0\0\u08d0\0\u0900\0\u0930\0\u0960\0\u0990\0\u09c0"+
    "\0\u09f0\0\u0a20\0\140\0\u0a50\0\u0a80\0\140\0\u0ab0\0\u0ae0"+
    "\0\u0b10\0\u0b40\0\u0b70\0\u0ba0\0\u0bd0\0\u0c00\0\u0c30\0\u0c60"+
    "\0\u0c90\0\u0cc0\0\140\0\140\0\140\0\u0cf0\0\u0d20\0\140"+
    "\0\u0d50\0\u0d80\0\140\0\140\0\u0db0\0\u0de0\0\140\0\u0e10"+
    "\0\u0e40\0\u0e70\0\u0ea0\0\u0ed0\0\u0f00\0\u0f30\0\u0f60\0\140"+
    "\0\u0f90\0\140\0\140\0\140\0\u0fc0\0\u0ff0\0\140\0\u1020"+
    "\0\140\0\u1050\0\140\0\140\0\u1080\0\u10b0\0\u10e0\0\u1110"+
    "\0\u1140\0\u1170\0\u11a0\0\u11d0\0\u1200\0\u1230\0\60";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[135];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\3\1\6\1\4\1\7"+
    "\1\10\1\11\1\12\1\10\1\13\1\14\1\15\1\3"+
    "\1\16\1\17\1\20\1\21\1\3\1\22\1\3\1\23"+
    "\1\24\1\25\1\3\1\26\1\3\1\27\1\30\1\3"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\3\1\44\1\45\1\46\1\47"+
    "\61\0\6\3\6\0\23\3\13\0\1\3\6\0\2\4"+
    "\2\0\1\4\54\0\1\50\1\51\1\0\1\50\52\0"+
    "\6\3\6\0\2\3\1\52\20\3\13\0\1\3\14\0"+
    "\1\10\60\0\1\53\62\0\1\54\44\0\6\3\6\0"+
    "\1\3\1\55\21\3\13\0\1\3\5\0\6\3\6\0"+
    "\4\3\1\56\16\3\13\0\1\3\5\0\6\3\6\0"+
    "\5\3\1\57\15\3\13\0\1\60\5\0\3\3\1\61"+
    "\2\3\6\0\1\3\1\62\21\3\13\0\1\3\5\0"+
    "\6\3\6\0\16\3\1\63\3\3\1\64\13\0\1\3"+
    "\5\0\6\3\6\0\4\3\1\65\16\3\13\0\1\3"+
    "\5\0\6\3\6\0\11\3\1\66\11\3\13\0\1\3"+
    "\5\0\6\3\6\0\15\3\1\67\5\3\13\0\1\3"+
    "\5\0\4\3\1\70\1\3\6\0\6\3\1\71\14\3"+
    "\13\0\1\3\5\0\6\3\6\0\15\3\1\72\5\3"+
    "\13\0\1\3\5\0\6\3\6\0\4\3\1\73\16\3"+
    "\13\0\1\3\5\0\6\3\6\0\22\3\1\74\13\0"+
    "\1\3\5\0\6\3\6\0\2\3\1\75\20\3\13\0"+
    "\1\3\45\0\1\76\21\0\1\50\2\0\1\50\53\0"+
    "\2\77\1\0\2\77\6\0\1\77\1\0\1\77\1\0"+
    "\1\77\2\0\1\77\2\0\1\77\31\0\6\3\6\0"+
    "\1\3\1\100\21\3\13\0\1\3\4\0\7\53\1\7"+
    "\1\10\47\53\11\0\1\101\47\0\6\3\6\0\2\3"+
    "\1\102\20\3\13\0\1\3\5\0\6\3\6\0\6\3"+
    "\1\103\14\3\13\0\1\3\5\0\6\3\6\0\2\3"+
    "\1\104\13\3\1\105\4\3\13\0\1\3\5\0\6\3"+
    "\6\0\3\3\1\106\17\3\13\0\1\3\5\0\6\3"+
    "\6\0\5\3\1\107\15\3\13\0\1\3\5\0\6\3"+
    "\6\0\3\3\1\110\17\3\13\0\1\3\5\0\6\3"+
    "\6\0\11\3\1\111\11\3\13\0\1\3\5\0\6\3"+
    "\6\0\13\3\1\112\7\3\13\0\1\3\5\0\6\3"+
    "\6\0\20\3\1\113\2\3\13\0\1\3\5\0\6\3"+
    "\6\0\12\3\1\114\10\3\13\0\1\3\5\0\6\3"+
    "\6\0\15\3\1\115\5\3\13\0\1\3\5\0\6\3"+
    "\6\0\5\3\1\116\15\3\13\0\1\3\5\0\6\3"+
    "\6\0\13\3\1\117\7\3\13\0\1\3\5\0\6\3"+
    "\6\0\5\3\1\120\15\3\13\0\1\3\5\0\6\3"+
    "\6\0\13\3\1\121\7\3\13\0\1\3\5\0\6\3"+
    "\6\0\13\3\1\122\7\3\13\0\1\3\5\0\6\3"+
    "\6\0\3\3\1\123\17\3\13\0\1\3\16\0\1\124"+
    "\46\0\6\3\6\0\3\3\1\125\17\3\13\0\1\3"+
    "\5\0\6\3\6\0\17\3\1\126\3\3\13\0\1\3"+
    "\5\0\6\3\6\0\5\3\1\127\15\3\13\0\1\3"+
    "\5\0\6\3\6\0\13\3\1\130\7\3\13\0\1\3"+
    "\5\0\6\3\6\0\5\3\1\131\15\3\13\0\1\3"+
    "\5\0\6\3\6\0\4\3\1\132\16\3\13\0\1\3"+
    "\5\0\6\3\6\0\4\3\1\133\16\3\13\0\1\3"+
    "\5\0\6\3\6\0\4\3\1\134\16\3\13\0\1\3"+
    "\5\0\6\3\6\0\3\3\1\135\17\3\13\0\1\3"+
    "\5\0\6\3\6\0\1\3\1\136\21\3\13\0\1\3"+
    "\5\0\6\3\6\0\1\3\1\137\21\3\13\0\1\3"+
    "\5\0\6\3\6\0\7\3\1\140\13\3\13\0\1\3"+
    "\5\0\6\3\6\0\11\3\1\141\11\3\13\0\1\3"+
    "\5\0\6\3\6\0\1\3\1\142\21\3\13\0\1\3"+
    "\5\0\6\3\6\0\6\3\1\143\14\3\13\0\1\3"+
    "\5\0\6\3\6\0\4\3\1\144\16\3\13\0\1\3"+
    "\4\0\12\145\1\146\45\145\1\0\6\3\6\0\3\3"+
    "\1\147\17\3\13\0\1\3\5\0\6\3\6\0\5\3"+
    "\1\150\15\3\13\0\1\3\5\0\6\3\6\0\13\3"+
    "\1\151\7\3\13\0\1\3\5\0\6\3\6\0\6\3"+
    "\1\152\14\3\13\0\1\3\5\0\6\3\6\0\4\3"+
    "\1\153\16\3\13\0\1\3\5\0\6\3\6\0\6\3"+
    "\1\154\14\3\13\0\1\3\5\0\6\3\6\0\13\3"+
    "\1\155\7\3\13\0\1\3\5\0\6\3\6\0\4\3"+
    "\1\156\16\3\13\0\1\3\5\0\6\3\6\0\16\3"+
    "\1\157\4\3\13\0\1\3\5\0\6\3\6\0\4\3"+
    "\1\160\16\3\13\0\1\3\4\0\12\145\1\161\45\145"+
    "\11\0\1\10\1\146\46\0\6\3\6\0\22\3\1\162"+
    "\13\0\1\3\5\0\6\3\6\0\1\163\22\3\13\0"+
    "\1\3\5\0\6\3\6\0\17\3\1\164\3\3\13\0"+
    "\1\3\5\0\6\3\6\0\21\3\1\165\1\3\13\0"+
    "\1\3\5\0\6\3\6\0\7\3\1\166\13\3\13\0"+
    "\1\3\5\0\6\3\6\0\1\167\22\3\13\0\1\3"+
    "\5\0\6\3\6\0\2\3\1\170\20\3\13\0\1\3"+
    "\5\0\6\3\6\0\6\3\1\171\14\3\13\0\1\3"+
    "\4\0\11\145\1\10\1\161\45\145\1\0\6\3\6\0"+
    "\23\3\13\0\1\3\1\172\4\0\6\3\6\0\3\3"+
    "\1\173\17\3\13\0\1\3\5\0\6\3\6\0\6\3"+
    "\1\174\14\3\13\0\1\3\36\0\1\175\53\0\1\176"+
    "\53\0\1\177\111\0\1\200\30\0\1\201\65\0\1\202"+
    "\54\0\1\203\52\0\1\204\56\0\1\205\53\0\1\206"+
    "\64\0\1\207\34\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4704];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\5\1\1\11\1\1\1\11\16\1\1\11"+
    "\1\1\15\11\1\1\1\0\2\1\1\0\21\1\1\11"+
    "\2\1\1\0\22\1\1\0\20\1\2\0\12\1\1\0"+
    "\10\1\1\0\2\1\12\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[135];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

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
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private void error(String message) {
    System.err.println("Error at line "+(yyline+1)+", column "+(yycolumn+1)+" : "+message);
  }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  ExprLex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  ExprLex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 178) {
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
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
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
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
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
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 37: 
          { return new Symbol(EXTENDS, yyline+1, yycolumn+1);
          }
        case 40: break;
        case 34: 
          { return new Symbol(STRING, yyline+1, yycolumn+1);
          }
        case 41: break;
        case 38: 
          { return new Symbol(BOOLEAN_TYPE, yyline+1, yycolumn+1);
          }
        case 42: break;
        case 35: 
          { return new Symbol(PUBLIC, yyline+1, yycolumn+1);
          }
        case 43: break;
        case 27: 
          { return new Symbol(VOID, yyline+1, yycolumn+1);
          }
        case 44: break;
        case 17: 
          { return new Symbol(LBRACKET, yyline+1, yycolumn+1);
          }
        case 45: break;
        case 2: 
          { return new Symbol(ID, yyline+1, yycolumn+1, yytext());
          }
        case 46: break;
        case 25: 
          { return new Symbol(TRUE, yyline+1, yycolumn+1);
          }
        case 47: break;
        case 36: 
          { return new Symbol(RETURN, yyline+1, yycolumn+1);
          }
        case 48: break;
        case 26: 
          { return new Symbol(THIS, yyline+1, yycolumn+1);
          }
        case 49: break;
        case 10: 
          { return new Symbol(COMMA, yyline+1, yycolumn+1);
          }
        case 50: break;
        case 20: 
          { return new Symbol(IF, yyline+1, yycolumn+1);
          }
        case 51: break;
        case 28: 
          { return new Symbol(MAIN, yyline+1, yycolumn+1);
          }
        case 52: break;
        case 12: 
          { return new Symbol(LBRACE, yyline+1, yycolumn+1);
          }
        case 53: break;
        case 5: 
          { return new Symbol(MULT, yyline+1, yycolumn+1);
          }
        case 54: break;
        case 8: 
          { return new Symbol(PLUS, yyline+1, yycolumn+1);
          }
        case 55: break;
        case 33: 
          { return new Symbol(STATIC, yyline+1, yycolumn+1);
          }
        case 56: break;
        case 7: 
          { return new Symbol(LESSTHAN, yyline+1, yycolumn+1);
          }
        case 57: break;
        case 1: 
          { error("Illegal character <"+ yytext()+">");
          }
        case 58: break;
        case 13: 
          { return new Symbol(RBRACE, yyline+1, yycolumn+1);
          }
        case 59: break;
        case 14: 
          { return new Symbol(LPAREN, yyline+1, yycolumn+1);
          }
        case 60: break;
        case 4: 
          { /*Do Nothing*/
          }
        case 61: break;
        case 16: 
          { return new Symbol(DOT, yyline+1, yycolumn+1);
          }
        case 62: break;
        case 9: 
          { return new Symbol(MINUS, yyline+1, yycolumn+1);
          }
        case 63: break;
        case 11: 
          { return new Symbol(NOT, yyline+1, yycolumn+1);
          }
        case 64: break;
        case 6: 
          { return new Symbol(EQ, yyline+1, yycolumn+1);
          }
        case 65: break;
        case 21: 
          { return new Symbol(AND, yyline+1, yycolumn+1);
          }
        case 66: break;
        case 19: 
          { return new Symbol(SEMICOLON, yyline+1, yycolumn+1);
          }
        case 67: break;
        case 30: 
          { return new Symbol(CLASS, yyline+1, yycolumn+1);
          }
        case 68: break;
        case 15: 
          { return new Symbol(RPAREN, yyline+1, yycolumn+1);
          }
        case 69: break;
        case 3: 
          { return new  Symbol(INT, yyline+1, yycolumn+1, new Integer(Integer.decode(yytext())) );
          }
        case 70: break;
        case 18: 
          { return new Symbol(RBRACKET, yyline+1, yycolumn+1);
          }
        case 71: break;
        case 23: 
          { return new Symbol(INT_TYPE, yyline+1, yycolumn+1);
          }
        case 72: break;
        case 39: 
          { return new Symbol(PRINT, yyline+1, yycolumn+1);
          }
        case 73: break;
        case 22: 
          { return new Symbol(NEW, yyline+1, yycolumn+1);
          }
        case 74: break;
        case 32: 
          { return new Symbol(LENGTH, yyline+1, yycolumn+1);
          }
        case 75: break;
        case 29: 
          { return new Symbol(FALSE, yyline+1, yycolumn+1);
          }
        case 76: break;
        case 31: 
          { return new Symbol(WHILE, yyline+1, yycolumn+1);
          }
        case 77: break;
        case 24: 
          { return new Symbol(ELSE, yyline+1, yycolumn+1);
          }
        case 78: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
