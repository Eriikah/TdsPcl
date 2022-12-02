// Generated from ./expr.g4 by ANTLR 4.9.2

package parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class exprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, INT=55, SYMBS=56, ID=57, WS=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
			"T__49", "T__50", "T__51", "T__52", "T__53", "INT", "SYMBS", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'type'", "'='", "':'", "','", "'var'", "':='", "'function'", "'('", 
			"')'", "'['", "']'", "'.'", "'-'", "'of'", "'{'", "'}'", "'if'", "'then'", 
			"'else'", "'while'", "'do'", "'for'", "'to'", "'break'", "'let'", "'in'", 
			"'end'", "'|'", "'&'", "'<='", "'>='", "'<'", "'>'", "'<>'", "'+'", "'/'", 
			"'*'", "';'", "'return'", "'print'", "'printi'", "'flush'", "'getchar'", 
			"'ord'", "'chr'", "'size'", "'substring'", "'concat'", "'not'", "'exit'", 
			"'array'", "'int'", "'string'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "INT", "SYMBS", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public exprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u0169\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%"+
		"\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3"+
		".\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\67\3\67\38\68\u014a\n8\r8\168\u014b\39\39"+
		"\3:\3:\7:\u0152\n:\f:\16:\u0155\13:\3;\3;\3;\3;\3;\7;\u015c\n;\f;\16;"+
		"\u015f\13;\3;\3;\3;\6;\u0164\n;\r;\16;\u0165\3;\3;\3\u015d\2<\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<\3"+
		"\2\6\7\2##.\60<=AAaa\4\2C\\c|\6\2\62;C\\aac|\4\2\f\f\"\"\2\u016e\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5|\3\2\2\2\7~\3\2"+
		"\2\2\t\u0080\3\2\2\2\13\u0082\3\2\2\2\r\u0086\3\2\2\2\17\u0089\3\2\2\2"+
		"\21\u0092\3\2\2\2\23\u0094\3\2\2\2\25\u0096\3\2\2\2\27\u0098\3\2\2\2\31"+
		"\u009a\3\2\2\2\33\u009c\3\2\2\2\35\u009e\3\2\2\2\37\u00a1\3\2\2\2!\u00a3"+
		"\3\2\2\2#\u00a5\3\2\2\2%\u00a8\3\2\2\2\'\u00ad\3\2\2\2)\u00b2\3\2\2\2"+
		"+\u00b8\3\2\2\2-\u00bb\3\2\2\2/\u00bf\3\2\2\2\61\u00c2\3\2\2\2\63\u00c8"+
		"\3\2\2\2\65\u00cc\3\2\2\2\67\u00cf\3\2\2\29\u00d3\3\2\2\2;\u00d5\3\2\2"+
		"\2=\u00d7\3\2\2\2?\u00da\3\2\2\2A\u00dd\3\2\2\2C\u00df\3\2\2\2E\u00e1"+
		"\3\2\2\2G\u00e4\3\2\2\2I\u00e6\3\2\2\2K\u00e8\3\2\2\2M\u00ea\3\2\2\2O"+
		"\u00ec\3\2\2\2Q\u00f3\3\2\2\2S\u00f9\3\2\2\2U\u0100\3\2\2\2W\u0106\3\2"+
		"\2\2Y\u010e\3\2\2\2[\u0112\3\2\2\2]\u0116\3\2\2\2_\u011b\3\2\2\2a\u0125"+
		"\3\2\2\2c\u012c\3\2\2\2e\u0130\3\2\2\2g\u0135\3\2\2\2i\u013b\3\2\2\2k"+
		"\u013f\3\2\2\2m\u0146\3\2\2\2o\u0149\3\2\2\2q\u014d\3\2\2\2s\u014f\3\2"+
		"\2\2u\u0163\3\2\2\2wx\7v\2\2xy\7{\2\2yz\7r\2\2z{\7g\2\2{\4\3\2\2\2|}\7"+
		"?\2\2}\6\3\2\2\2~\177\7<\2\2\177\b\3\2\2\2\u0080\u0081\7.\2\2\u0081\n"+
		"\3\2\2\2\u0082\u0083\7x\2\2\u0083\u0084\7c\2\2\u0084\u0085\7t\2\2\u0085"+
		"\f\3\2\2\2\u0086\u0087\7<\2\2\u0087\u0088\7?\2\2\u0088\16\3\2\2\2\u0089"+
		"\u008a\7h\2\2\u008a\u008b\7w\2\2\u008b\u008c\7p\2\2\u008c\u008d\7e\2\2"+
		"\u008d\u008e\7v\2\2\u008e\u008f\7k\2\2\u008f\u0090\7q\2\2\u0090\u0091"+
		"\7p\2\2\u0091\20\3\2\2\2\u0092\u0093\7*\2\2\u0093\22\3\2\2\2\u0094\u0095"+
		"\7+\2\2\u0095\24\3\2\2\2\u0096\u0097\7]\2\2\u0097\26\3\2\2\2\u0098\u0099"+
		"\7_\2\2\u0099\30\3\2\2\2\u009a\u009b\7\60\2\2\u009b\32\3\2\2\2\u009c\u009d"+
		"\7/\2\2\u009d\34\3\2\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7h\2\2\u00a0\36"+
		"\3\2\2\2\u00a1\u00a2\7}\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7\177\2\2\u00a4"+
		"\"\3\2\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7h\2\2\u00a7$\3\2\2\2\u00a8"+
		"\u00a9\7v\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7p\2\2"+
		"\u00ac&\3\2\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7u\2"+
		"\2\u00b0\u00b1\7g\2\2\u00b1(\3\2\2\2\u00b2\u00b3\7y\2\2\u00b3\u00b4\7"+
		"j\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7g\2\2\u00b7*"+
		"\3\2\2\2\u00b8\u00b9\7f\2\2\u00b9\u00ba\7q\2\2\u00ba,\3\2\2\2\u00bb\u00bc"+
		"\7h\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7t\2\2\u00be.\3\2\2\2\u00bf\u00c0"+
		"\7v\2\2\u00c0\u00c1\7q\2\2\u00c1\60\3\2\2\2\u00c2\u00c3\7d\2\2\u00c3\u00c4"+
		"\7t\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7m\2\2\u00c7"+
		"\62\3\2\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7v\2\2\u00cb"+
		"\64\3\2\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7p\2\2\u00ce\66\3\2\2\2\u00cf"+
		"\u00d0\7g\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7f\2\2\u00d28\3\2\2\2\u00d3"+
		"\u00d4\7~\2\2\u00d4:\3\2\2\2\u00d5\u00d6\7(\2\2\u00d6<\3\2\2\2\u00d7\u00d8"+
		"\7>\2\2\u00d8\u00d9\7?\2\2\u00d9>\3\2\2\2\u00da\u00db\7@\2\2\u00db\u00dc"+
		"\7?\2\2\u00dc@\3\2\2\2\u00dd\u00de\7>\2\2\u00deB\3\2\2\2\u00df\u00e0\7"+
		"@\2\2\u00e0D\3\2\2\2\u00e1\u00e2\7>\2\2\u00e2\u00e3\7@\2\2\u00e3F\3\2"+
		"\2\2\u00e4\u00e5\7-\2\2\u00e5H\3\2\2\2\u00e6\u00e7\7\61\2\2\u00e7J\3\2"+
		"\2\2\u00e8\u00e9\7,\2\2\u00e9L\3\2\2\2\u00ea\u00eb\7=\2\2\u00ebN\3\2\2"+
		"\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0"+
		"\7w\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7p\2\2\u00f2P\3\2\2\2\u00f3\u00f4"+
		"\7r\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7p\2\2\u00f7"+
		"\u00f8\7v\2\2\u00f8R\3\2\2\2\u00f9\u00fa\7r\2\2\u00fa\u00fb\7t\2\2\u00fb"+
		"\u00fc\7k\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7k\2\2"+
		"\u00ffT\3\2\2\2\u0100\u0101\7h\2\2\u0101\u0102\7n\2\2\u0102\u0103\7w\2"+
		"\2\u0103\u0104\7u\2\2\u0104\u0105\7j\2\2\u0105V\3\2\2\2\u0106\u0107\7"+
		"i\2\2\u0107\u0108\7g\2\2\u0108\u0109\7v\2\2\u0109\u010a\7e\2\2\u010a\u010b"+
		"\7j\2\2\u010b\u010c\7c\2\2\u010c\u010d\7t\2\2\u010dX\3\2\2\2\u010e\u010f"+
		"\7q\2\2\u010f\u0110\7t\2\2\u0110\u0111\7f\2\2\u0111Z\3\2\2\2\u0112\u0113"+
		"\7e\2\2\u0113\u0114\7j\2\2\u0114\u0115\7t\2\2\u0115\\\3\2\2\2\u0116\u0117"+
		"\7u\2\2\u0117\u0118\7k\2\2\u0118\u0119\7|\2\2\u0119\u011a\7g\2\2\u011a"+
		"^\3\2\2\2\u011b\u011c\7u\2\2\u011c\u011d\7w\2\2\u011d\u011e\7d\2\2\u011e"+
		"\u011f\7u\2\2\u011f\u0120\7v\2\2\u0120\u0121\7t\2\2\u0121\u0122\7k\2\2"+
		"\u0122\u0123\7p\2\2\u0123\u0124\7i\2\2\u0124`\3\2\2\2\u0125\u0126\7e\2"+
		"\2\u0126\u0127\7q\2\2\u0127\u0128\7p\2\2\u0128\u0129\7e\2\2\u0129\u012a"+
		"\7c\2\2\u012a\u012b\7v\2\2\u012bb\3\2\2\2\u012c\u012d\7p\2\2\u012d\u012e"+
		"\7q\2\2\u012e\u012f\7v\2\2\u012fd\3\2\2\2\u0130\u0131\7g\2\2\u0131\u0132"+
		"\7z\2\2\u0132\u0133\7k\2\2\u0133\u0134\7v\2\2\u0134f\3\2\2\2\u0135\u0136"+
		"\7c\2\2\u0136\u0137\7t\2\2\u0137\u0138\7t\2\2\u0138\u0139\7c\2\2\u0139"+
		"\u013a\7{\2\2\u013ah\3\2\2\2\u013b\u013c\7k\2\2\u013c\u013d\7p\2\2\u013d"+
		"\u013e\7v\2\2\u013ej\3\2\2\2\u013f\u0140\7u\2\2\u0140\u0141\7v\2\2\u0141"+
		"\u0142\7t\2\2\u0142\u0143\7k\2\2\u0143\u0144\7p\2\2\u0144\u0145\7i\2\2"+
		"\u0145l\3\2\2\2\u0146\u0147\7$\2\2\u0147n\3\2\2\2\u0148\u014a\4\62;\2"+
		"\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014cp\3\2\2\2\u014d\u014e\t\2\2\2\u014er\3\2\2\2\u014f\u0153"+
		"\t\3\2\2\u0150\u0152\t\4\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154t\3\2\2\2\u0155\u0153\3\2\2\2"+
		"\u0156\u0164\t\5\2\2\u0157\u0158\7\61\2\2\u0158\u0159\7,\2\2\u0159\u015d"+
		"\3\2\2\2\u015a\u015c\13\2\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2"+
		"\u015d\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u015d"+
		"\3\2\2\2\u0160\u0161\7,\2\2\u0161\u0164\7\61\2\2\u0162\u0164\7\13\2\2"+
		"\u0163\u0156\3\2\2\2\u0163\u0157\3\2\2\2\u0163\u0162\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0168\b;\2\2\u0168v\3\2\2\2\b\2\u014b\u0153\u015d\u0163\u0165\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}