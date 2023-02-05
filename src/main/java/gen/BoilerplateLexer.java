// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BoilerplateLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, CLASS=2, WITH=3, INCLUDING=4, INTERFACE=5, GET=6, SET=7, COMMA=8, 
		LPAREN=9, RPAREN=10, EOL=11, STRING=12, INT=13, FLOAT=14, BOOL=15, PRIVATE=16, 
		PUBLIC=17, ID=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CREATE", "CLASS", "WITH", "INCLUDING", "INTERFACE", "GET", "SET", "COMMA", 
			"LPAREN", "RPAREN", "EOL", "STRING", "INT", "FLOAT", "BOOL", "PRIVATE", 
			"PUBLIC", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'create'", "'class'", "'with'", "'including'", "'interface'", 
			"'get'", "'set'", "','", "'('", "')'", "';'", "'String'", "'int'", "'float'", 
			"'bool'", "'private'", "'public'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CREATE", "CLASS", "WITH", "INCLUDING", "INTERFACE", "GET", "SET", 
			"COMMA", "LPAREN", "RPAREN", "EOL", "STRING", "INT", "FLOAT", "BOOL", 
			"PRIVATE", "PUBLIC", "ID", "WS"
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


	public BoilerplateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BoilerplateLexer.g4"; }

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
		"\u0004\u0000\u0013\u0090\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u0085\b\u0011\n\u0011\f\u0011\u0088\t\u0011\u0001\u0012\u0004\u0012"+
		"\u008b\b\u0012\u000b\u0012\f\u0012\u008c\u0001\u0012\u0001\u0012\u0000"+
		"\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0003"+
		"\u0004\u0000$$AZ__az\u0005\u0000$$09AZ__az\u0003\u0000\t\n\r\r  \u0091"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003.\u0001\u0000\u0000\u0000"+
		"\u00054\u0001\u0000\u0000\u0000\u00079\u0001\u0000\u0000\u0000\tC\u0001"+
		"\u0000\u0000\u0000\u000bM\u0001\u0000\u0000\u0000\rQ\u0001\u0000\u0000"+
		"\u0000\u000fU\u0001\u0000\u0000\u0000\u0011W\u0001\u0000\u0000\u0000\u0013"+
		"Y\u0001\u0000\u0000\u0000\u0015[\u0001\u0000\u0000\u0000\u0017]\u0001"+
		"\u0000\u0000\u0000\u0019d\u0001\u0000\u0000\u0000\u001bh\u0001\u0000\u0000"+
		"\u0000\u001dn\u0001\u0000\u0000\u0000\u001fs\u0001\u0000\u0000\u0000!"+
		"{\u0001\u0000\u0000\u0000#\u0082\u0001\u0000\u0000\u0000%\u008a\u0001"+
		"\u0000\u0000\u0000\'(\u0005c\u0000\u0000()\u0005r\u0000\u0000)*\u0005"+
		"e\u0000\u0000*+\u0005a\u0000\u0000+,\u0005t\u0000\u0000,-\u0005e\u0000"+
		"\u0000-\u0002\u0001\u0000\u0000\u0000./\u0005c\u0000\u0000/0\u0005l\u0000"+
		"\u000001\u0005a\u0000\u000012\u0005s\u0000\u000023\u0005s\u0000\u0000"+
		"3\u0004\u0001\u0000\u0000\u000045\u0005w\u0000\u000056\u0005i\u0000\u0000"+
		"67\u0005t\u0000\u000078\u0005h\u0000\u00008\u0006\u0001\u0000\u0000\u0000"+
		"9:\u0005i\u0000\u0000:;\u0005n\u0000\u0000;<\u0005c\u0000\u0000<=\u0005"+
		"l\u0000\u0000=>\u0005u\u0000\u0000>?\u0005d\u0000\u0000?@\u0005i\u0000"+
		"\u0000@A\u0005n\u0000\u0000AB\u0005g\u0000\u0000B\b\u0001\u0000\u0000"+
		"\u0000CD\u0005i\u0000\u0000DE\u0005n\u0000\u0000EF\u0005t\u0000\u0000"+
		"FG\u0005e\u0000\u0000GH\u0005r\u0000\u0000HI\u0005f\u0000\u0000IJ\u0005"+
		"a\u0000\u0000JK\u0005c\u0000\u0000KL\u0005e\u0000\u0000L\n\u0001\u0000"+
		"\u0000\u0000MN\u0005g\u0000\u0000NO\u0005e\u0000\u0000OP\u0005t\u0000"+
		"\u0000P\f\u0001\u0000\u0000\u0000QR\u0005s\u0000\u0000RS\u0005e\u0000"+
		"\u0000ST\u0005t\u0000\u0000T\u000e\u0001\u0000\u0000\u0000UV\u0005,\u0000"+
		"\u0000V\u0010\u0001\u0000\u0000\u0000WX\u0005(\u0000\u0000X\u0012\u0001"+
		"\u0000\u0000\u0000YZ\u0005)\u0000\u0000Z\u0014\u0001\u0000\u0000\u0000"+
		"[\\\u0005;\u0000\u0000\\\u0016\u0001\u0000\u0000\u0000]^\u0005S\u0000"+
		"\u0000^_\u0005t\u0000\u0000_`\u0005r\u0000\u0000`a\u0005i\u0000\u0000"+
		"ab\u0005n\u0000\u0000bc\u0005g\u0000\u0000c\u0018\u0001\u0000\u0000\u0000"+
		"de\u0005i\u0000\u0000ef\u0005n\u0000\u0000fg\u0005t\u0000\u0000g\u001a"+
		"\u0001\u0000\u0000\u0000hi\u0005f\u0000\u0000ij\u0005l\u0000\u0000jk\u0005"+
		"o\u0000\u0000kl\u0005a\u0000\u0000lm\u0005t\u0000\u0000m\u001c\u0001\u0000"+
		"\u0000\u0000no\u0005b\u0000\u0000op\u0005o\u0000\u0000pq\u0005o\u0000"+
		"\u0000qr\u0005l\u0000\u0000r\u001e\u0001\u0000\u0000\u0000st\u0005p\u0000"+
		"\u0000tu\u0005r\u0000\u0000uv\u0005i\u0000\u0000vw\u0005v\u0000\u0000"+
		"wx\u0005a\u0000\u0000xy\u0005t\u0000\u0000yz\u0005e\u0000\u0000z \u0001"+
		"\u0000\u0000\u0000{|\u0005p\u0000\u0000|}\u0005u\u0000\u0000}~\u0005b"+
		"\u0000\u0000~\u007f\u0005l\u0000\u0000\u007f\u0080\u0005i\u0000\u0000"+
		"\u0080\u0081\u0005c\u0000\u0000\u0081\"\u0001\u0000\u0000\u0000\u0082"+
		"\u0086\u0007\u0000\u0000\u0000\u0083\u0085\u0007\u0001\u0000\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"$\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008b"+
		"\u0007\u0002\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0006\u0012\u0000\u0000\u008f&\u0001\u0000\u0000\u0000\u0003\u0000\u0086"+
		"\u008c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}