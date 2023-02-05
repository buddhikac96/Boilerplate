// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BoilerplateParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, CLASS=2, WITH=3, INCLUDING=4, INTERFACE=5, GET=6, SET=7, COMMA=8, 
		LPAREN=9, RPAREN=10, EOL=11, STRING=12, INT=13, FLOAT=14, BOOL=15, PRIVATE=16, 
		PUBLIC=17, ID=18, WS=19;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_classDeclaration = 2, RULE_interfaceDeclaration = 3, 
		RULE_fields = 4, RULE_field = 5, RULE_getSet = 6, RULE_get = 7, RULE_set = 8, 
		RULE_classMethods = 9, RULE_classMethod = 10, RULE_interfaceMethods = 11, 
		RULE_interfaceMethod = 12, RULE_params = 13, RULE_param = 14, RULE_dataType = 15, 
		RULE_accessModifier = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "classDeclaration", "interfaceDeclaration", 
			"fields", "field", "getSet", "get", "set", "classMethods", "classMethod", 
			"interfaceMethods", "interfaceMethod", "params", "param", "dataType", 
			"accessModifier"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BoilerplateParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoilerplateParserVisitor ) return ((BoilerplateParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				declaration();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CREATE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoilerplateParserVisitor ) return ((BoilerplateParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				interfaceDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(BoilerplateParser.CREATE, 0); }
		public TerminalNode CLASS() { return getToken(BoilerplateParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(BoilerplateParser.ID, 0); }
		public TerminalNode WITH() { return getToken(BoilerplateParser.WITH, 0); }
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public TerminalNode EOL() { return getToken(BoilerplateParser.EOL, 0); }
		public TerminalNode INCLUDING() { return getToken(BoilerplateParser.INCLUDING, 0); }
		public ClassMethodsContext classMethods() {
			return getRuleContext(ClassMethodsContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoilerplateParserVisitor ) return ((BoilerplateParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(CREATE);
			setState(44);
			match(CLASS);
			setState(45);
			match(ID);
			setState(46);
			match(WITH);
			setState(47);
			fields();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCLUDING) {
				{
				setState(48);
				match(INCLUDING);
				setState(49);
				classMethods();
				}
			}

			setState(52);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(BoilerplateParser.CREATE, 0); }
		public TerminalNode INTERFACE() { return getToken(BoilerplateParser.INTERFACE, 0); }
		public TerminalNode ID() { return getToken(BoilerplateParser.ID, 0); }
		public TerminalNode WITH() { return getToken(BoilerplateParser.WITH, 0); }
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public TerminalNode EOL() { return getToken(BoilerplateParser.EOL, 0); }
		public TerminalNode INCLUDING() { return getToken(BoilerplateParser.INCLUDING, 0); }
		public InterfaceMethodsContext interfaceMethods() {
			return getRuleContext(InterfaceMethodsContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoilerplateParserVisitor ) return ((BoilerplateParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(CREATE);
			setState(55);
			match(INTERFACE);
			setState(56);
			match(ID);
			setState(57);
			match(WITH);
			setState(58);
			fields();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCLUDING) {
				{
				setState(59);
				match(INCLUDING);
				setState(60);
				interfaceMethods();
				}
			}

			setState(63);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldsContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BoilerplateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BoilerplateParser.COMMA, i);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).enterFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).exitFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoilerplateParserVisitor ) return ((BoilerplateParserVisitor<? extends T>)visitor).visitFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			field();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(66);
				match(COMMA);
				setState(67);
				field();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BoilerplateParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(BoilerplateParser.LPAREN, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(BoilerplateParser.COMMA, 0); }
		public GetSetContext getSet() {
			return getRuleContext(GetSetContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(BoilerplateParser.RPAREN, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoilerplateParserVisitor ) return ((BoilerplateParserVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(ID);
			setState(74);
			match(LPAREN);
			setState(75);
			dataType();
			setState(76);
			match(COMMA);
			setState(77);
			getSet();
			setState(78);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GetSetContext extends ParserRuleContext {
		public GetContext get() {
			return getRuleContext(GetContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(BoilerplateParser.COMMA, 0); }
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public GetSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).enterGetSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).exitGetSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoilerplateParserVisitor ) return ((BoilerplateParserVisitor<? extends T>)visitor).visitGetSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetSetContext getSet() throws RecognitionException {
		GetSetContext _localctx = new GetSetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_getSet);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				get();
				setState(81);
				match(COMMA);
				setState(82);
				set();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				set();
				setState(85);
				match(COMMA);
				setState(86);
				get();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GetContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(BoilerplateParser.GET, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public GetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).enterGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).exitGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoilerplateParserVisitor ) return ((BoilerplateParserVisitor<? extends T>)visitor).visitGet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetContext get() throws RecognitionException {
		GetContext _localctx = new GetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_get);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE || _la==PUBLIC) {
				{
				setState(90);
				accessModifier();
				}
			}

			setState(93);
			match(GET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(BoilerplateParser.SET, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoilerplateParserVisitor ) return ((BoilerplateParserVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE || _la==PUBLIC) {
				{
				setState(95);
				accessModifier();
				}
			}

			setState(98);
			match(SET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMethodsContext extends ParserRuleContext {
		public List<ClassMethodContext> classMethod() {
			return getRuleContexts(ClassMethodContext.class);
		}
		public ClassMethodContext classMethod(int i) {
			return getRuleContext(ClassMethodContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BoilerplateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BoilerplateParser.COMMA, i);
		}
		public ClassMethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMethods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).enterClassMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).exitClassMethods(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoilerplateParserVisitor ) return ((BoilerplateParserVisitor<? extends T>)visitor).visitClassMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMethodsContext classMethods() throws RecognitionException {
		ClassMethodsContext _localctx = new ClassMethodsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classMethods);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			classMethod();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(101);
				match(COMMA);
				setState(102);
				classMethod();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassMethodContext extends ParserRuleContext {
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(BoilerplateParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(BoilerplateParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BoilerplateParser.RPAREN, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ClassMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).enterClassMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).exitClassMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoilerplateParserVisitor ) return ((BoilerplateParserVisitor<? extends T>)visitor).visitClassMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassMethodContext classMethod() throws RecognitionException {
		ClassMethodContext _localctx = new ClassMethodContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			accessModifier();
			setState(109);
			dataType();
			setState(110);
			match(ID);
			setState(111);
			match(LPAREN);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 61440L) != 0) {
				{
				setState(112);
				params();
				}
			}

			setState(115);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMethodsContext extends ParserRuleContext {
		public List<InterfaceMethodContext> interfaceMethod() {
			return getRuleContexts(InterfaceMethodContext.class);
		}
		public InterfaceMethodContext interfaceMethod(int i) {
			return getRuleContext(InterfaceMethodContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BoilerplateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BoilerplateParser.COMMA, i);
		}
		public InterfaceMethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).enterInterfaceMethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).exitInterfaceMethods(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoilerplateParserVisitor ) return ((BoilerplateParserVisitor<? extends T>)visitor).visitInterfaceMethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodsContext interfaceMethods() throws RecognitionException {
		InterfaceMethodsContext _localctx = new InterfaceMethodsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceMethods);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			interfaceMethod();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(118);
				match(COMMA);
				setState(119);
				interfaceMethod();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMethodContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(BoilerplateParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(BoilerplateParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(BoilerplateParser.RPAREN, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public InterfaceMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).enterInterfaceMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).exitInterfaceMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoilerplateParserVisitor ) return ((BoilerplateParserVisitor<? extends T>)visitor).visitInterfaceMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodContext interfaceMethod() throws RecognitionException {
		InterfaceMethodContext _localctx = new InterfaceMethodContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			dataType();
			setState(126);
			match(ID);
			setState(127);
			match(LPAREN);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 61440L) != 0) {
				{
				setState(128);
				params();
				}
			}

			setState(131);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BoilerplateParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BoilerplateParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoilerplateParserVisitor ) return ((BoilerplateParserVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			param();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(134);
				match(COMMA);
				setState(135);
				param();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(BoilerplateParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoilerplateParserVisitor ) return ((BoilerplateParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			dataType();
			setState(142);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(BoilerplateParser.STRING, 0); }
		public TerminalNode INT() { return getToken(BoilerplateParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(BoilerplateParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(BoilerplateParser.BOOL, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoilerplateParserVisitor ) return ((BoilerplateParserVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 61440L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AccessModifierContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(BoilerplateParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(BoilerplateParser.PUBLIC, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoilerplateParserListener ) ((BoilerplateParserListener)listener).exitAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoilerplateParserVisitor ) return ((BoilerplateParserVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !(_la==PRIVATE || _la==PUBLIC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0013\u0095\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0004\u0000$\b\u0000\u000b"+
		"\u0000\f\u0000%\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00023\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		">\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004E\b\u0004\n\u0004\f\u0004H\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006Y\b\u0006\u0001\u0007\u0003\u0007\\\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0003\ba\b\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0005\th\b\t\n\t\f\tk\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\nr\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000by\b\u000b\n\u000b\f\u000b|\t\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0082\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u0089"+
		"\b\r\n\r\f\r\u008c\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \u0000\u0002\u0001\u0000\f\u000f\u0001\u0000\u0010\u0011\u0090"+
		"\u0000#\u0001\u0000\u0000\u0000\u0002)\u0001\u0000\u0000\u0000\u0004+"+
		"\u0001\u0000\u0000\u0000\u00066\u0001\u0000\u0000\u0000\bA\u0001\u0000"+
		"\u0000\u0000\nI\u0001\u0000\u0000\u0000\fX\u0001\u0000\u0000\u0000\u000e"+
		"[\u0001\u0000\u0000\u0000\u0010`\u0001\u0000\u0000\u0000\u0012d\u0001"+
		"\u0000\u0000\u0000\u0014l\u0001\u0000\u0000\u0000\u0016u\u0001\u0000\u0000"+
		"\u0000\u0018}\u0001\u0000\u0000\u0000\u001a\u0085\u0001\u0000\u0000\u0000"+
		"\u001c\u008d\u0001\u0000\u0000\u0000\u001e\u0090\u0001\u0000\u0000\u0000"+
		" \u0092\u0001\u0000\u0000\u0000\"$\u0003\u0002\u0001\u0000#\"\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001"+
		"\u0000\u0000\u0000&\u0001\u0001\u0000\u0000\u0000\'*\u0003\u0004\u0002"+
		"\u0000(*\u0003\u0006\u0003\u0000)\'\u0001\u0000\u0000\u0000)(\u0001\u0000"+
		"\u0000\u0000*\u0003\u0001\u0000\u0000\u0000+,\u0005\u0001\u0000\u0000"+
		",-\u0005\u0002\u0000\u0000-.\u0005\u0012\u0000\u0000./\u0005\u0003\u0000"+
		"\u0000/2\u0003\b\u0004\u000001\u0005\u0004\u0000\u000013\u0003\u0012\t"+
		"\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u000045\u0005\u000b\u0000\u00005\u0005\u0001\u0000\u0000\u0000"+
		"67\u0005\u0001\u0000\u000078\u0005\u0005\u0000\u000089\u0005\u0012\u0000"+
		"\u00009:\u0005\u0003\u0000\u0000:=\u0003\b\u0004\u0000;<\u0005\u0004\u0000"+
		"\u0000<>\u0003\u0016\u000b\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0005\u000b\u0000\u0000@\u0007"+
		"\u0001\u0000\u0000\u0000AF\u0003\n\u0005\u0000BC\u0005\b\u0000\u0000C"+
		"E\u0003\n\u0005\u0000DB\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000"+
		"FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\t\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000IJ\u0005\u0012\u0000\u0000JK\u0005\t\u0000"+
		"\u0000KL\u0003\u001e\u000f\u0000LM\u0005\b\u0000\u0000MN\u0003\f\u0006"+
		"\u0000NO\u0005\n\u0000\u0000O\u000b\u0001\u0000\u0000\u0000PQ\u0003\u000e"+
		"\u0007\u0000QR\u0005\b\u0000\u0000RS\u0003\u0010\b\u0000SY\u0001\u0000"+
		"\u0000\u0000TU\u0003\u0010\b\u0000UV\u0005\b\u0000\u0000VW\u0003\u000e"+
		"\u0007\u0000WY\u0001\u0000\u0000\u0000XP\u0001\u0000\u0000\u0000XT\u0001"+
		"\u0000\u0000\u0000Y\r\u0001\u0000\u0000\u0000Z\\\u0003 \u0010\u0000[Z"+
		"\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000"+
		"\u0000]^\u0005\u0006\u0000\u0000^\u000f\u0001\u0000\u0000\u0000_a\u0003"+
		" \u0010\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001"+
		"\u0000\u0000\u0000bc\u0005\u0007\u0000\u0000c\u0011\u0001\u0000\u0000"+
		"\u0000di\u0003\u0014\n\u0000ef\u0005\b\u0000\u0000fh\u0003\u0014\n\u0000"+
		"ge\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000j\u0013\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000lm\u0003 \u0010\u0000mn\u0003\u001e\u000f\u0000no\u0005"+
		"\u0012\u0000\u0000oq\u0005\t\u0000\u0000pr\u0003\u001a\r\u0000qp\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"st\u0005\n\u0000\u0000t\u0015\u0001\u0000\u0000\u0000uz\u0003\u0018\f"+
		"\u0000vw\u0005\b\u0000\u0000wy\u0003\u0018\f\u0000xv\u0001\u0000\u0000"+
		"\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{\u0017\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"}~\u0003\u001e\u000f\u0000~\u007f\u0005\u0012\u0000\u0000\u007f\u0081"+
		"\u0005\t\u0000\u0000\u0080\u0082\u0003\u001a\r\u0000\u0081\u0080\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005\n\u0000\u0000\u0084\u0019\u0001\u0000"+
		"\u0000\u0000\u0085\u008a\u0003\u001c\u000e\u0000\u0086\u0087\u0005\b\u0000"+
		"\u0000\u0087\u0089\u0003\u001c\u000e\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u001b\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0003\u001e\u000f"+
		"\u0000\u008e\u008f\u0005\u0012\u0000\u0000\u008f\u001d\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0007\u0000\u0000\u0000\u0091\u001f\u0001\u0000\u0000"+
		"\u0000\u0092\u0093\u0007\u0001\u0000\u0000\u0093!\u0001\u0000\u0000\u0000"+
		"\r%)2=FX[`iqz\u0081\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}