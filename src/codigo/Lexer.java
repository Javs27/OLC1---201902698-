/* The following code was generated by JFlex 1.4.3 on 19/09/22 08:56 PM */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 19/09/22 08:56 PM from the specification file
 * <tt>C:/Users/pjbco/Desktop/Segundo semestre 2022/Compi1/Proyecto1Compiladores/src/codigo/Lexer.flex</tt>
 */
class Lexer {

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
    "\11\0\1\3\1\5\2\0\1\3\22\0\1\3\1\0\1\20\2\0"+
    "\1\55\1\0\1\32\1\43\1\44\1\13\1\41\1\51\1\42\1\0"+
    "\1\4\12\2\1\50\1\47\1\0\1\40\1\54\1\57\1\0\1\23"+
    "\1\21\1\10\1\25\1\16\1\12\1\27\1\30\1\6\1\37\1\33"+
    "\1\22\1\15\1\7\1\11\1\35\1\36\1\17\1\26\1\24\1\14"+
    "\1\31\1\34\1\33\1\60\1\33\1\52\1\0\1\53\1\0\1\1"+
    "\1\0\1\23\1\21\1\10\1\25\1\16\1\12\1\27\1\30\1\6"+
    "\1\37\1\33\1\22\1\15\1\7\1\11\1\35\1\36\1\17\1\26"+
    "\1\24\1\14\1\31\1\34\1\33\1\60\1\33\1\45\1\0\1\46"+
    "\101\0\1\56\uff40\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\5\1"+
    "\1\7\3\1\1\10\11\1\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\0\1\4\2\0\1\30\7\0"+
    "\1\31\16\0\1\32\4\0\1\33\5\0\1\34\3\0"+
    "\1\35\1\0\1\36\2\0\1\37\11\0\1\40\33\0"+
    "\1\4\5\0\1\41\2\0\1\42\1\43\11\0\1\44"+
    "\1\0\1\45\20\0\1\46\1\3\16\0\1\47\1\0"+
    "\1\50\2\0\1\51\11\0\1\52\1\0\1\53\1\0"+
    "\1\54\1\55\1\0\1\56\1\0\1\57\2\0\1\60"+
    "\4\0\1\61\3\0\1\62\5\0\1\63\1\0\1\64"+
    "\7\0\1\65\1\0\1\66\16\0\1\67\10\0\1\70"+
    "\1\71\4\0\1\72\1\73\3\0\1\74\4\0\1\75"+
    "\1\76\1\77\1\0\1\100\1\51\1\0\1\101\1\102"+
    "\1\103\3\0\1\104\2\0\1\105\4\0\1\106\2\0"+
    "\1\107\1\110\5\0\1\111\2\0\1\112\2\0\1\113"+
    "\5\0\1\114\5\0\1\115\1\0\1\116\1\117";

  private static int [] zzUnpackAction() {
    int [] result = new int[328];
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
    "\0\0\0\61\0\142\0\223\0\304\0\365\0\61\0\u0126"+
    "\0\u0157\0\u0188\0\u01b9\0\u01ea\0\61\0\u021b\0\u024c\0\u027d"+
    "\0\u02ae\0\u02df\0\u0310\0\u0341\0\u0372\0\u03a3\0\u03d4\0\u0405"+
    "\0\u0436\0\u0467\0\61\0\61\0\u0498\0\u04c9\0\61\0\61"+
    "\0\61\0\61\0\61\0\61\0\61\0\61\0\61\0\61"+
    "\0\61\0\u04fa\0\u052b\0\u055c\0\u058d\0\61\0\u05be\0\u05ef"+
    "\0\u0620\0\u0651\0\u0682\0\u06b3\0\u06e4\0\61\0\u0715\0\u0746"+
    "\0\u0777\0\u07a8\0\u07d9\0\u080a\0\u083b\0\u086c\0\u089d\0\u08ce"+
    "\0\u08ff\0\u0930\0\u0961\0\u02ae\0\u02ae\0\u0992\0\u09c3\0\u09f4"+
    "\0\u0a25\0\61\0\u0a56\0\u0a87\0\u0ab8\0\u0ae9\0\u0405\0\61"+
    "\0\u0b1a\0\u0b4b\0\u0b7c\0\61\0\u0bad\0\u04fa\0\u0bde\0\u0c0f"+
    "\0\61\0\u0c40\0\u0c71\0\u0ca2\0\u0cd3\0\u0d04\0\u0d35\0\u0d66"+
    "\0\u0d97\0\u0dc8\0\u0df9\0\u0e2a\0\u0e5b\0\u0e8c\0\u0ebd\0\u0eee"+
    "\0\u0f1f\0\u0f50\0\u0f81\0\u0fb2\0\u0fe3\0\u1014\0\u1045\0\u1076"+
    "\0\u10a7\0\u10d8\0\u1109\0\u113a\0\u116b\0\u119c\0\u11cd\0\u11fe"+
    "\0\u122f\0\u1260\0\u1291\0\u12c2\0\u12f3\0\u1324\0\61\0\u1355"+
    "\0\u1386\0\u13b7\0\u13e8\0\u1419\0\61\0\u144a\0\u147b\0\61"+
    "\0\61\0\u14ac\0\u14dd\0\u150e\0\u153f\0\u1570\0\u15a1\0\u15d2"+
    "\0\u1603\0\u1634\0\61\0\u1665\0\61\0\u1696\0\u16c7\0\u16f8"+
    "\0\u1729\0\u175a\0\u178b\0\u17bc\0\u17ed\0\u181e\0\u184f\0\u1880"+
    "\0\u18b1\0\u18e2\0\u1913\0\u1944\0\u1975\0\61\0\61\0\u19a6"+
    "\0\u19d7\0\u1a08\0\u1a39\0\u1a6a\0\u1a9b\0\u1acc\0\u1afd\0\u1b2e"+
    "\0\u1b5f\0\u1b90\0\u1bc1\0\u1bf2\0\u1c23\0\61\0\u1c54\0\61"+
    "\0\u1c85\0\u1cb6\0\u1ce7\0\u1d18\0\u1d49\0\u1d7a\0\u1dab\0\u1ddc"+
    "\0\u1e0d\0\u1e3e\0\u1e6f\0\u1ea0\0\61\0\u1ed1\0\61\0\u1f02"+
    "\0\61\0\u1f33\0\u1f64\0\61\0\u1f95\0\61\0\u1fc6\0\u1ff7"+
    "\0\61\0\u2028\0\u2059\0\u208a\0\u20bb\0\61\0\u20ec\0\u211d"+
    "\0\u214e\0\61\0\u217f\0\u21b0\0\u21e1\0\u2212\0\u2243\0\61"+
    "\0\u2274\0\61\0\u22a5\0\u22d6\0\u2307\0\u2338\0\u2369\0\u239a"+
    "\0\u23cb\0\61\0\u23fc\0\61\0\u242d\0\u245e\0\u248f\0\u24c0"+
    "\0\u24f1\0\u2522\0\u2553\0\u2584\0\u25b5\0\u25e6\0\u2617\0\u2648"+
    "\0\u2679\0\u26aa\0\61\0\u26db\0\u270c\0\u273d\0\u276e\0\u279f"+
    "\0\u27d0\0\u2801\0\u2832\0\61\0\u2863\0\u2894\0\u28c5\0\u28f6"+
    "\0\u2927\0\61\0\u2958\0\u2989\0\u29ba\0\u29eb\0\61\0\u2a1c"+
    "\0\u2a4d\0\u2a7e\0\u2aaf\0\61\0\61\0\61\0\u2ae0\0\61"+
    "\0\61\0\u2b11\0\61\0\61\0\61\0\u2b42\0\u2b73\0\u2ba4"+
    "\0\61\0\u2bd5\0\u2c06\0\61\0\u2c37\0\u2c68\0\u2c99\0\u2cca"+
    "\0\61\0\u2cfb\0\u2d2c\0\61\0\61\0\u2d5d\0\u2d8e\0\u2dbf"+
    "\0\u2df0\0\u2e21\0\61\0\u2e52\0\u2e83\0\61\0\u2eb4\0\u2ee5"+
    "\0\61\0\u2f16\0\u2f47\0\u2f78\0\u2fa9\0\u2fda\0\61\0\u300b"+
    "\0\u303c\0\u306d\0\u309e\0\u30cf\0\61\0\u3100\0\61\0\61";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[328];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\2\1\16\1\17\1\20"+
    "\1\21\1\22\1\2\1\23\1\2\1\24\1\25\1\2"+
    "\1\26\1\27\1\30\1\2\1\31\1\32\2\2\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\2\1\47\1\50\1\51\1\2"+
    "\62\0\2\52\3\0\5\52\1\0\4\52\1\0\11\52"+
    "\1\0\5\52\20\0\1\52\2\0\1\4\61\0\1\5"+
    "\61\0\1\53\6\0\1\54\54\0\1\55\2\0\1\56"+
    "\2\0\1\57\54\0\1\60\2\0\1\61\55\0\1\62"+
    "\11\0\1\63\4\0\1\64\31\0\1\65\15\0\1\66"+
    "\47\0\1\67\5\0\1\70\5\0\1\71\1\72\43\0"+
    "\1\73\2\0\1\74\4\0\1\75\4\0\1\76\44\0"+
    "\1\77\12\0\1\100\3\0\1\101\10\0\1\102\37\0"+
    "\1\103\42\0\5\104\1\0\12\104\1\105\40\104\11\0"+
    "\1\106\56\0\1\107\62\0\1\110\4\0\1\111\50\0"+
    "\1\112\7\0\1\113\5\0\1\114\57\0\1\115\53\0"+
    "\1\116\50\0\5\117\1\0\4\117\1\0\11\117\1\120"+
    "\5\117\20\0\1\117\30\0\1\121\41\0\1\122\11\0"+
    "\1\123\111\0\1\124\46\0\1\125\17\0\1\126\1\52"+
    "\3\0\5\52\1\0\4\52\1\0\11\52\1\0\5\52"+
    "\20\0\1\52\5\53\1\0\53\53\4\54\1\0\6\54"+
    "\1\127\45\54\6\0\1\130\15\0\1\131\2\0\1\132"+
    "\66\0\1\133\47\0\1\66\51\0\1\134\52\0\1\135"+
    "\5\0\1\136\62\0\1\137\5\0\1\140\56\0\1\141"+
    "\63\0\1\142\41\0\1\143\60\0\1\144\62\0\1\145"+
    "\71\0\1\146\54\0\1\147\67\0\1\150\42\0\1\151"+
    "\14\0\1\152\42\0\1\153\51\0\1\151\24\0\1\154"+
    "\62\0\1\155\33\0\1\156\75\0\1\157\66\0\1\160"+
    "\10\0\1\161\34\0\1\162\74\0\1\66\47\0\1\163"+
    "\4\0\1\164\40\0\1\165\106\0\1\166\50\0\1\167"+
    "\51\0\1\170\15\0\1\171\51\0\1\172\47\0\1\173"+
    "\76\0\1\174\53\0\1\175\43\0\1\176\56\0\4\54"+
    "\1\177\6\54\1\127\45\54\10\0\1\200\67\0\1\201"+
    "\60\0\1\202\57\0\1\203\43\0\1\204\70\0\1\205"+
    "\72\0\1\206\53\0\1\207\61\0\1\210\47\0\1\211"+
    "\53\0\1\212\67\0\1\213\73\0\1\214\1\215\62\0"+
    "\1\216\41\0\1\217\65\0\1\220\55\0\1\221\60\0"+
    "\1\222\56\0\1\223\62\0\1\224\65\0\1\225\50\0"+
    "\1\226\16\0\1\227\43\0\1\230\61\0\1\231\65\0"+
    "\1\232\64\0\1\233\57\0\1\234\61\0\1\235\60\0"+
    "\1\236\52\0\1\237\52\0\1\240\70\0\1\241\66\0"+
    "\1\242\61\0\1\243\55\0\1\244\54\0\1\245\65\0"+
    "\1\246\37\0\1\176\41\0\1\247\22\0\1\250\70\0"+
    "\1\251\50\0\1\252\71\0\1\253\47\0\1\254\22\0"+
    "\1\255\3\0\1\256\33\0\1\257\57\0\1\260\63\0"+
    "\1\261\2\0\1\262\10\0\1\263\6\0\1\264\31\0"+
    "\1\265\76\0\1\266\57\0\1\267\46\0\1\270\73\0"+
    "\1\271\56\0\1\272\55\0\1\273\66\0\1\274\42\0"+
    "\1\275\100\0\1\276\37\0\1\277\66\0\1\300\63\0"+
    "\1\301\65\0\1\302\52\0\1\303\64\0\1\304\54\0"+
    "\1\305\53\0\1\306\56\0\1\307\60\0\1\310\70\0"+
    "\1\311\64\0\1\312\60\0\1\313\53\0\1\314\51\0"+
    "\1\315\62\0\1\316\75\0\1\317\47\0\1\320\54\0"+
    "\1\321\56\0\1\322\74\0\1\323\60\0\1\324\61\0"+
    "\1\325\57\0\1\326\51\0\1\327\52\0\1\330\7\0"+
    "\1\331\50\0\1\332\7\0\1\333\65\0\1\334\46\0"+
    "\1\335\56\0\1\336\70\0\1\337\52\0\1\340\50\0"+
    "\1\341\70\0\1\342\57\0\1\343\64\0\1\344\56\0"+
    "\1\345\72\0\1\346\43\0\1\347\57\0\1\350\75\0"+
    "\1\351\53\0\1\352\43\0\1\353\106\0\1\354\32\0"+
    "\1\355\104\0\1\356\43\0\1\357\73\0\1\360\43\0"+
    "\1\361\62\0\1\362\72\0\1\363\55\0\1\364\57\0"+
    "\1\365\51\0\1\366\67\0\1\367\66\0\1\370\63\0"+
    "\1\371\50\0\1\372\50\0\1\373\75\0\1\374\57\0"+
    "\1\375\46\0\1\376\65\0\1\377\65\0\1\u0100\53\0"+
    "\1\u0101\65\0\1\u0102\60\0\1\u0103\54\0\1\u0104\50\0"+
    "\1\u0105\61\0\1\u0106\106\0\1\u0107\40\0\1\u0108\50\0"+
    "\1\u0109\71\0\1\u010a\60\0\1\u010b\60\0\1\u010c\52\0"+
    "\1\u010d\72\0\1\u010e\54\0\1\u010f\51\0\1\u0110\57\0"+
    "\1\u0111\62\0\1\u0112\63\0\1\u0113\67\0\1\u0114\53\0"+
    "\1\u0115\70\0\1\u0116\33\0\1\u0117\105\0\1\u0118\54\0"+
    "\1\u0119\55\0\1\u011a\60\0\1\u011b\60\0\1\u011c\52\0"+
    "\1\u011d\60\0\1\u011e\63\0\1\u011f\63\0\1\u0120\64\0"+
    "\1\u0121\36\0\1\u0122\75\0\1\u0123\61\0\1\u0124\56\0"+
    "\1\u0125\51\0\1\u0126\76\0\1\u0127\61\0\1\u0128\42\0"+
    "\1\u0129\57\0\1\226\70\0\1\u012a\51\0\1\u012b\67\0"+
    "\1\u012c\53\0\1\u012d\56\0\1\u012e\66\0\1\u012f\61\0"+
    "\1\u0130\53\0\1\u0131\66\0\1\u0132\52\0\1\u0133\56\0"+
    "\1\u0134\75\0\1\u0135\56\0\1\u0136\54\0\1\u0137\66\0"+
    "\1\u0138\43\0\1\u0139\74\0\1\u013a\61\0\1\u013b\53\0"+
    "\1\u013c\50\0\1\u013d\70\0\1\u013e\67\0\1\u013f\50\0"+
    "\1\u0119\65\0\1\u0140\61\0\1\u0141\45\0\1\u0142\66\0"+
    "\1\u0143\64\0\1\u0144\63\0\1\u0145\40\0\1\u0146\74\0"+
    "\1\u0147\47\0\1\u0148\47\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[12593];
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
    "\1\0\1\11\4\1\1\11\5\1\1\11\15\1\2\11"+
    "\2\1\13\11\1\0\1\1\2\0\1\11\7\0\1\11"+
    "\16\0\1\1\4\0\1\11\5\0\1\11\3\0\1\11"+
    "\1\0\1\1\2\0\1\11\11\0\1\1\33\0\1\11"+
    "\5\0\1\11\2\0\2\11\11\0\1\11\1\0\1\11"+
    "\20\0\2\11\16\0\1\11\1\0\1\11\2\0\1\1"+
    "\11\0\1\11\1\0\1\11\1\0\1\11\1\1\1\0"+
    "\1\11\1\0\1\11\2\0\1\11\4\0\1\11\3\0"+
    "\1\11\5\0\1\11\1\0\1\11\7\0\1\11\1\0"+
    "\1\11\16\0\1\11\10\0\1\11\1\1\4\0\1\11"+
    "\1\1\3\0\1\11\4\0\3\11\1\0\2\11\1\0"+
    "\3\11\3\0\1\11\2\0\1\11\4\0\1\11\2\0"+
    "\2\11\5\0\1\11\2\0\1\11\2\0\1\11\5\0"+
    "\1\11\5\0\1\11\1\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[328];
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
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
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
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 186) {
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
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
        case 2: 
          { lexeme=yytext(); return GuionLow;
          }
        case 80: break;
        case 46: 
          { lexeme=yytext(); return While;
          }
        case 81: break;
        case 8: 
          { lexeme=yytext(); return Comilla;
          }
        case 82: break;
        case 66: 
          { lexeme=yytext(); return Retornar;
          }
        case 83: break;
        case 30: 
          { lexeme=yytext(); return Identificador;
          }
        case 84: break;
        case 62: 
          { lexeme=yytext(); return Flotante;
          }
        case 85: break;
        case 77: 
          { lexeme=yytext(); return ConParametros;
          }
        case 86: break;
        case 60: 
          { lexeme=yytext(); return Car;
          }
        case 87: break;
        case 75: 
          { lexeme=yytext(); return FinFuncion;
          }
        case 88: break;
        case 37: 
          { lexeme=yytext(); return Else;
          }
        case 89: break;
        case 33: 
          { lexeme=yytext(); return Como;
          }
        case 90: break;
        case 17: 
          { lexeme=yytext(); return DosPuntos;
          }
        case 91: break;
        case 21: 
          { lexeme=yytext(); return Mod;
          }
        case 92: break;
        case 43: 
          { lexeme=yytext(); return Segun;
          }
        case 93: break;
        case 36: 
          { lexeme=yytext(); return Main;
          }
        case 94: break;
        case 51: 
          { lexeme=yytext(); return Modulo;
          }
        case 95: break;
        case 59: 
          { lexeme=yytext(); return Imprimir;
          }
        case 96: break;
        case 28: 
          { lexeme=yytext(); return Caracter;
          }
        case 97: break;
        case 4: 
          { /*Ignore*/
          }
        case 98: break;
        case 14: 
          { lexeme=yytext(); return LlaveA;
          }
        case 99: break;
        case 54: 
          { lexeme=yytext(); return String;
          }
        case 100: break;
        case 68: 
          { lexeme=yytext(); return Potencia;
          }
        case 101: break;
        case 35: 
          { lexeme=yytext(); return Osi;
          }
        case 102: break;
        case 76: 
          { lexeme=yytext(); return FinMientras;
          }
        case 103: break;
        case 70: 
          { lexeme=yytext(); return FinSegun;
          }
        case 104: break;
        case 71: 
          { lexeme=yytext(); return HastaQue;
          }
        case 105: break;
        case 64: 
          { lexeme=yytext(); return Entonces;
          }
        case 106: break;
        case 55: 
          { lexeme=yytext(); return Funcion;
          }
        case 107: break;
        case 78: 
          { lexeme=yytext(); return ConIncremental;
          }
        case 108: break;
        case 13: 
          { lexeme=yytext(); return ParentesisC;
          }
        case 109: break;
        case 57: 
          { lexeme=yytext(); return Boolean;
          }
        case 110: break;
        case 25: 
          { lexeme=yytext(); return OperadorLogico;
          }
        case 111: break;
        case 18: 
          { lexeme=yytext(); return Coma;
          }
        case 112: break;
        case 50: 
          { lexeme=yytext(); return FinSi;
          }
        case 113: break;
        case 49: 
          { lexeme=yytext(); return TipoCadena;
          }
        case 114: break;
        case 38: 
          { lexeme=yytext(); return Para;
          }
        case 115: break;
        case 58: 
          { lexeme=yytext(); return Ingresar;
          }
        case 116: break;
        case 47: 
          { lexeme=yytext(); return inicioAnalisis;
          }
        case 117: break;
        case 11: 
          { lexeme=yytext(); return Resta;
          }
        case 118: break;
        case 79: 
          { lexeme=yytext(); return DeloContrario;
          }
        case 119: break;
        case 31: 
          { lexeme=yytext(); return Int;
          }
        case 120: break;
        case 16: 
          { lexeme=yytext(); return PuntoComa;
          }
        case 121: break;
        case 9: 
          { lexeme=yytext(); return Igual;
          }
        case 122: break;
        case 20: 
          { lexeme=yytext(); return CorcheteC;
          }
        case 123: break;
        case 42: 
          { lexeme=yytext(); return Doble;
          }
        case 124: break;
        case 26: 
          { lexeme=yytext(); return Cadena;
          }
        case 125: break;
        case 10: 
          { lexeme=yytext(); return Suma;
          }
        case 126: break;
        case 69: 
          { lexeme=yytext(); return ConValor;
          }
        case 127: break;
        case 48: 
          { lexeme=yytext(); return Numeroo;
          }
        case 128: break;
        case 56: 
          { lexeme=yytext(); return Repetir;
          }
        case 129: break;
        case 45: 
          { lexeme=yytext(); return Hasta;
          }
        case 130: break;
        case 39: 
          { lexeme=yytext(); return Float;
          }
        case 131: break;
        case 41: 
          { lexeme=yytext(); return OperadorRelacional;
          }
        case 132: break;
        case 23: 
          { lexeme=yytext(); return InterrogacionC;
          }
        case 133: break;
        case 63: 
          { lexeme=yytext(); return Mientras;
          }
        case 134: break;
        case 12: 
          { lexeme=yytext(); return ParentesisA;
          }
        case 135: break;
        case 52: 
          { lexeme=yytext(); return Metodo;
          }
        case 136: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 137: break;
        case 24: 
          { lexeme=yytext(); return If;
          }
        case 138: break;
        case 1: 
          { lexeme=yytext(); return ERROR;
          }
        case 139: break;
        case 53: 
          { lexeme=yytext(); return Double;
          }
        case 140: break;
        case 65: 
          { lexeme=yytext(); return Ejecutar;
          }
        case 141: break;
        case 6: 
          { return Linea;
          }
        case 142: break;
        case 29: 
          { lexeme=yytext(); return Asignar;
          }
        case 143: break;
        case 34: 
          { lexeme=yytext(); return Char;
          }
        case 144: break;
        case 19: 
          { lexeme=yytext(); return CorcheteA;
          }
        case 145: break;
        case 72: 
          { lexeme=yytext(); return Verdadero;
          }
        case 146: break;
        case 73: 
          { lexeme=yytext(); return FinMetodo;
          }
        case 147: break;
        case 67: 
          { lexeme=yytext(); return Booleano;
          }
        case 148: break;
        case 61: 
          { lexeme=yytext(); return FinPara;
          }
        case 149: break;
        case 40: 
          { lexeme=yytext(); return Falso;
          }
        case 150: break;
        case 15: 
          { lexeme=yytext(); return LlaveC;
          }
        case 151: break;
        case 5: 
          { lexeme=yytext(); return Division;
          }
        case 152: break;
        case 27: 
          { lexeme=yytext(); return Si;
          }
        case 153: break;
        case 44: 
          { lexeme=yytext(); return Hacer;
          }
        case 154: break;
        case 74: 
          { lexeme=yytext(); return ImprimirSalto;
          }
        case 155: break;
        case 7: 
          { lexeme=yytext(); return Multiplicacion;
          }
        case 156: break;
        case 22: 
          { lexeme=yytext(); return InterrogacionA;
          }
        case 157: break;
        case 32: 
          { lexeme=yytext(); return finAnalisis;
          }
        case 158: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}