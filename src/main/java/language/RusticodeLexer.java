// Generated from C:/Users/Evelin Suarez/OneDrive/Desktop/Estudio/repoR/src/main/antlr4/Rusticode.g4 by ANTLR 4.13.1
package language;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class RusticodeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, START=6, END=7, DEFINT=8, DEFREAL=9, 
		DEFCHAR=10, IF=11, ENDIF=12, WHILE=13, ENDWHILE=14, TRUE=15, FALSE=16, 
		SUM=17, REST=18, MULT=19, DIV=20, HIGH=21, LESS=22, HEQL=23, LEQL=24, 
		UNEQL=25, AND=26, OR=27, EQUAL=28, NEGT=29, ASSIG=30, DOUPOINT=31, DDPOINT=32, 
		SEMICOLON=33, OPENBRACKET=34, CLOSEDBRACKET=35, OPENKEY=36, CLOSEKEY=37, 
		NUM=38, CHAR=39, VAR=40, SW=41, COM=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "START", "END", "DEFINT", "DEFREAL", 
			"DEFCHAR", "IF", "ENDIF", "WHILE", "ENDWHILE", "TRUE", "FALSE", "SUM", 
			"REST", "MULT", "DIV", "HIGH", "LESS", "HEQL", "LEQL", "UNEQL", "AND", 
			"OR", "EQUAL", "NEGT", "ASSIG", "DOUPOINT", "DDPOINT", "SEMICOLON", "OPENBRACKET", 
			"CLOSEDBRACKET", "OPENKEY", "CLOSEKEY", "NUM", "CHAR", "VAR", "SW", "COM"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'?int'", "'?real'", "'?char'", "'start:'", "'end'", 
			"'int'", "'real'", "'char'", "'if'", "'endif'", "'while'", "'endwhile'", 
			"'True'", "'False'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", 
			"'<='", "'!='", "'&&'", "'||'", "'=='", "'\\u00AC'", "'<<'", "':'", "'::'", 
			"';'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "START", "END", "DEFINT", "DEFREAL", 
			"DEFCHAR", "IF", "ENDIF", "WHILE", "ENDWHILE", "TRUE", "FALSE", "SUM", 
			"REST", "MULT", "DIV", "HIGH", "LESS", "HEQL", "LEQL", "UNEQL", "AND", 
			"OR", "EQUAL", "NEGT", "ASSIG", "DOUPOINT", "DDPOINT", "SEMICOLON", "OPENBRACKET", 
			"CLOSEDBRACKET", "OPENKEY", "CLOSEKEY", "NUM", "CHAR", "VAR", "SW", "COM"
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


	public RusticodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Rusticode.g4"; }

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
		"\u0004\u0000*\u0103\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001$\u0001$\u0001%\u0003%\u00da\b%\u0001%\u0004%\u00dd\b%\u000b"+
		"%\f%\u00de\u0001%\u0001%\u0004%\u00e3\b%\u000b%\f%\u00e4\u0003%\u00e7"+
		"\b%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001(\u0004(\u00f6\b(\u000b(\f(\u00f7\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u0102\b)\u0000"+
		"\u0000*\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\""+
		"E#G$I%K&M\'O(Q)S*\u0001\u0000\u0003\u0001\u000009\u0003\u0000AZ__az\u0003"+
		"\u0000\t\n\r\r  \u0108\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000"+
		"\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u0000"+
		"7\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001"+
		"\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000"+
		"\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000"+
		"E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001"+
		"\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000"+
		"\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000"+
		"S\u0001\u0000\u0000\u0000\u0001U\u0001\u0000\u0000\u0000\u0003W\u0001"+
		"\u0000\u0000\u0000\u0005Y\u0001\u0000\u0000\u0000\u0007^\u0001\u0000\u0000"+
		"\u0000\td\u0001\u0000\u0000\u0000\u000bj\u0001\u0000\u0000\u0000\rq\u0001"+
		"\u0000\u0000\u0000\u000fu\u0001\u0000\u0000\u0000\u0011y\u0001\u0000\u0000"+
		"\u0000\u0013~\u0001\u0000\u0000\u0000\u0015\u0083\u0001\u0000\u0000\u0000"+
		"\u0017\u0086\u0001\u0000\u0000\u0000\u0019\u008c\u0001\u0000\u0000\u0000"+
		"\u001b\u0092\u0001\u0000\u0000\u0000\u001d\u009b\u0001\u0000\u0000\u0000"+
		"\u001f\u00a0\u0001\u0000\u0000\u0000!\u00a6\u0001\u0000\u0000\u0000#\u00a8"+
		"\u0001\u0000\u0000\u0000%\u00aa\u0001\u0000\u0000\u0000\'\u00ac\u0001"+
		"\u0000\u0000\u0000)\u00ae\u0001\u0000\u0000\u0000+\u00b0\u0001\u0000\u0000"+
		"\u0000-\u00b2\u0001\u0000\u0000\u0000/\u00b5\u0001\u0000\u0000\u00001"+
		"\u00b8\u0001\u0000\u0000\u00003\u00bb\u0001\u0000\u0000\u00005\u00be\u0001"+
		"\u0000\u0000\u00007\u00c1\u0001\u0000\u0000\u00009\u00c4\u0001\u0000\u0000"+
		"\u0000;\u00c6\u0001\u0000\u0000\u0000=\u00c9\u0001\u0000\u0000\u0000?"+
		"\u00cb\u0001\u0000\u0000\u0000A\u00ce\u0001\u0000\u0000\u0000C\u00d0\u0001"+
		"\u0000\u0000\u0000E\u00d2\u0001\u0000\u0000\u0000G\u00d4\u0001\u0000\u0000"+
		"\u0000I\u00d6\u0001\u0000\u0000\u0000K\u00d9\u0001\u0000\u0000\u0000M"+
		"\u00e8\u0001\u0000\u0000\u0000O\u00ec\u0001\u0000\u0000\u0000Q\u00f5\u0001"+
		"\u0000\u0000\u0000S\u0101\u0001\u0000\u0000\u0000UV\u0005[\u0000\u0000"+
		"V\u0002\u0001\u0000\u0000\u0000WX\u0005]\u0000\u0000X\u0004\u0001\u0000"+
		"\u0000\u0000YZ\u0005?\u0000\u0000Z[\u0005i\u0000\u0000[\\\u0005n\u0000"+
		"\u0000\\]\u0005t\u0000\u0000]\u0006\u0001\u0000\u0000\u0000^_\u0005?\u0000"+
		"\u0000_`\u0005r\u0000\u0000`a\u0005e\u0000\u0000ab\u0005a\u0000\u0000"+
		"bc\u0005l\u0000\u0000c\b\u0001\u0000\u0000\u0000de\u0005?\u0000\u0000"+
		"ef\u0005c\u0000\u0000fg\u0005h\u0000\u0000gh\u0005a\u0000\u0000hi\u0005"+
		"r\u0000\u0000i\n\u0001\u0000\u0000\u0000jk\u0005s\u0000\u0000kl\u0005"+
		"t\u0000\u0000lm\u0005a\u0000\u0000mn\u0005r\u0000\u0000no\u0005t\u0000"+
		"\u0000op\u0005:\u0000\u0000p\f\u0001\u0000\u0000\u0000qr\u0005e\u0000"+
		"\u0000rs\u0005n\u0000\u0000st\u0005d\u0000\u0000t\u000e\u0001\u0000\u0000"+
		"\u0000uv\u0005i\u0000\u0000vw\u0005n\u0000\u0000wx\u0005t\u0000\u0000"+
		"x\u0010\u0001\u0000\u0000\u0000yz\u0005r\u0000\u0000z{\u0005e\u0000\u0000"+
		"{|\u0005a\u0000\u0000|}\u0005l\u0000\u0000}\u0012\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005c\u0000\u0000\u007f\u0080\u0005h\u0000\u0000\u0080\u0081"+
		"\u0005a\u0000\u0000\u0081\u0082\u0005r\u0000\u0000\u0082\u0014\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005i\u0000\u0000\u0084\u0085\u0005f\u0000\u0000"+
		"\u0085\u0016\u0001\u0000\u0000\u0000\u0086\u0087\u0005e\u0000\u0000\u0087"+
		"\u0088\u0005n\u0000\u0000\u0088\u0089\u0005d\u0000\u0000\u0089\u008a\u0005"+
		"i\u0000\u0000\u008a\u008b\u0005f\u0000\u0000\u008b\u0018\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005w\u0000\u0000\u008d\u008e\u0005h\u0000\u0000\u008e"+
		"\u008f\u0005i\u0000\u0000\u008f\u0090\u0005l\u0000\u0000\u0090\u0091\u0005"+
		"e\u0000\u0000\u0091\u001a\u0001\u0000\u0000\u0000\u0092\u0093\u0005e\u0000"+
		"\u0000\u0093\u0094\u0005n\u0000\u0000\u0094\u0095\u0005d\u0000\u0000\u0095"+
		"\u0096\u0005w\u0000\u0000\u0096\u0097\u0005h\u0000\u0000\u0097\u0098\u0005"+
		"i\u0000\u0000\u0098\u0099\u0005l\u0000\u0000\u0099\u009a\u0005e\u0000"+
		"\u0000\u009a\u001c\u0001\u0000\u0000\u0000\u009b\u009c\u0005T\u0000\u0000"+
		"\u009c\u009d\u0005r\u0000\u0000\u009d\u009e\u0005u\u0000\u0000\u009e\u009f"+
		"\u0005e\u0000\u0000\u009f\u001e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005"+
		"F\u0000\u0000\u00a1\u00a2\u0005a\u0000\u0000\u00a2\u00a3\u0005l\u0000"+
		"\u0000\u00a3\u00a4\u0005s\u0000\u0000\u00a4\u00a5\u0005e\u0000\u0000\u00a5"+
		" \u0001\u0000\u0000\u0000\u00a6\u00a7\u0005+\u0000\u0000\u00a7\"\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0005-\u0000\u0000\u00a9$\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ab\u0005*\u0000\u0000\u00ab&\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0005/\u0000\u0000\u00ad(\u0001\u0000\u0000\u0000\u00ae\u00af\u0005"+
		">\u0000\u0000\u00af*\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005<\u0000"+
		"\u0000\u00b1,\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005>\u0000\u0000\u00b3"+
		"\u00b4\u0005=\u0000\u0000\u00b4.\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"<\u0000\u0000\u00b6\u00b7\u0005=\u0000\u0000\u00b70\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0005!\u0000\u0000\u00b9\u00ba\u0005=\u0000\u0000\u00ba"+
		"2\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005&\u0000\u0000\u00bc\u00bd\u0005"+
		"&\u0000\u0000\u00bd4\u0001\u0000\u0000\u0000\u00be\u00bf\u0005|\u0000"+
		"\u0000\u00bf\u00c0\u0005|\u0000\u0000\u00c06\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0005=\u0000\u0000\u00c2\u00c3\u0005=\u0000\u0000\u00c38\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0005\u00ac\u0000\u0000\u00c5:\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0005<\u0000\u0000\u00c7\u00c8\u0005<\u0000\u0000"+
		"\u00c8<\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005:\u0000\u0000\u00ca>"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005:\u0000\u0000\u00cc\u00cd\u0005"+
		":\u0000\u0000\u00cd@\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005;\u0000"+
		"\u0000\u00cfB\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005(\u0000\u0000\u00d1"+
		"D\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005)\u0000\u0000\u00d3F\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0005{\u0000\u0000\u00d5H\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0005}\u0000\u0000\u00d7J\u0001\u0000\u0000\u0000\u00d8"+
		"\u00da\u0005-\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00dd"+
		"\u0007\u0000\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0001\u0000\u0000\u0000\u00df\u00e6\u0001\u0000\u0000\u0000\u00e0\u00e2"+
		"\u0005.\u0000\u0000\u00e1\u00e3\u0007\u0000\u0000\u0000\u00e2\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e0\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e7L\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\'"+
		"\u0000\u0000\u00e9\u00ea\u0007\u0001\u0000\u0000\u00ea\u00eb\u0005\'\u0000"+
		"\u0000\u00ebN\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005v\u0000\u0000\u00ed"+
		"\u00ee\u0005a\u0000\u0000\u00ee\u00ef\u0005r\u0000\u0000\u00ef\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0007\u0000\u0000\u0000\u00f1\u00f2\u0007"+
		"\u0000\u0000\u0000\u00f2\u00f3\u0007\u0000\u0000\u0000\u00f3P\u0001\u0000"+
		"\u0000\u0000\u00f4\u00f6\u0007\u0002\u0000\u0000\u00f5\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fa\u0006(\u0000\u0000\u00faR\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0005\'\u0000\u0000\u00fc\u00fd\t\u0000\u0000\u0000\u00fd"+
		"\u0102\u0005\'\u0000\u0000\u00fe\u00ff\u0005\"\u0000\u0000\u00ff\u0100"+
		"\t\u0000\u0000\u0000\u0100\u0102\u0005\"\u0000\u0000\u0101\u00fb\u0001"+
		"\u0000\u0000\u0000\u0101\u00fe\u0001\u0000\u0000\u0000\u0102T\u0001\u0000"+
		"\u0000\u0000\u0007\u0000\u00d9\u00de\u00e4\u00e6\u00f7\u0101\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}