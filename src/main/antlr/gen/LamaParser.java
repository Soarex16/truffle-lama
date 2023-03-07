// Generated from java-escape by ANTLR 4.11.1

package com.soarex.truffle.lama.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LamaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN_PARENS=1, CLOSE_PARENS=2, OPEN_BRACE=3, CLOSE_BRACE=4, OPEN_BRACKET=5, 
		CLOSE_BRACKET=6, COMMA=7, SEMICOLON=8, ASSIGN=9, DEF_ASSIGN=10, PLUS=11, 
		MINUS=12, MUL=13, DIV=14, MOD=15, OP_AND=16, OP_OR=17, OP_LT=18, OP_GT=19, 
		OP_EQ=20, OP_NE=21, OP_LE=22, OP_GE=23, SKIP_=24, IF=25, THEN=26, ELSE=27, 
		ELIF=28, FI=29, WHILE=30, DO=31, OD=32, FOR=33, VAR=34, VAL=35, FUN=36, 
		CASE=37, OF=38, ESAC=39, TRUE=40, FALSE=41, NUMBER_LITERAL=42, CHARACTER_LITERAL=43, 
		STRING_LITERAL=44, L_IDENT=45, U_IDENT=46, LINE_COMMENT=47, BLOCK_COMMENT=48, 
		BRANCH_SEP=49, ARROW=50, BAND=51, WHITESPACES=52;
	public static final int
		RULE_program = 0, RULE_scopeExpression = 1, RULE_definition = 2, RULE_variableDefinition = 3, 
		RULE_variableDefinitionSequence = 4, RULE_variableDefinitionItem = 5, 
		RULE_functionDefinition = 6, RULE_functionArguments = 7, RULE_functionBody = 8, 
		RULE_expression = 9, RULE_basicExpression = 10, RULE_assocExpression = 11, 
		RULE_comparisonExpression = 12, RULE_postfixExpression = 13, RULE_primary = 14, 
		RULE_caseWhen = 15, RULE_caseBranches = 16, RULE_caseBranch = 17, RULE_pattern = 18, 
		RULE_ifThenElse = 19, RULE_elsePart = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "scopeExpression", "definition", "variableDefinition", "variableDefinitionSequence", 
			"variableDefinitionItem", "functionDefinition", "functionArguments", 
			"functionBody", "expression", "basicExpression", "assocExpression", "comparisonExpression", 
			"postfixExpression", "primary", "caseWhen", "caseBranches", "caseBranch", 
			"pattern", "ifThenElse", "elsePart"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "','", "';'", "':='", 
			"'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'!!'", "'<'", "'>'", 
			"'=='", "'/='", "'<='", "'>='", "'skip'", "'if'", "'then'", "'else'", 
			"'elif'", "'fi'", "'while'", "'do'", "'od'", "'for'", "'var'", "'val'", 
			"'fun'", "'case'", "'of'", "'esac'", "'true'", "'false'", null, null, 
			null, null, null, null, null, "'|'", "'->'", "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPEN_PARENS", "CLOSE_PARENS", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "COMMA", "SEMICOLON", "ASSIGN", "DEF_ASSIGN", "PLUS", 
			"MINUS", "MUL", "DIV", "MOD", "OP_AND", "OP_OR", "OP_LT", "OP_GT", "OP_EQ", 
			"OP_NE", "OP_LE", "OP_GE", "SKIP_", "IF", "THEN", "ELSE", "ELIF", "FI", 
			"WHILE", "DO", "OD", "FOR", "VAR", "VAL", "FUN", "CASE", "OF", "ESAC", 
			"TRUE", "FALSE", "NUMBER_LITERAL", "CHARACTER_LITERAL", "STRING_LITERAL", 
			"L_IDENT", "U_IDENT", "LINE_COMMENT", "BLOCK_COMMENT", "BRANCH_SEP", 
			"ARROW", "BAND", "WHITESPACES"
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

	public LamaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LamaParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			scopeExpression();
			setState(43);
			match(EOF);
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
	public static class ScopeExpressionContext extends ParserRuleContext {
		public DefinitionContext defs;
		public ExpressionContext expr;
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ScopeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterScopeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitScopeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitScopeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScopeExpressionContext scopeExpression() throws RecognitionException {
		ScopeExpressionContext _localctx = new ScopeExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scopeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==FUN) {
				{
				{
				setState(45);
				((ScopeExpressionContext)_localctx).defs = definition();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(51);
				((ScopeExpressionContext)_localctx).expr = expression();
				}
				break;
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
	public static class DefinitionContext extends ParserRuleContext {
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definition);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				variableDefinition();
				}
				break;
			case FUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				functionDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class VariableDefinitionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LamaParser.VAR, 0); }
		public VariableDefinitionSequenceContext variableDefinitionSequence() {
			return getRuleContext(VariableDefinitionSequenceContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LamaParser.SEMICOLON, 0); }
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(VAR);
			setState(59);
			variableDefinitionSequence();
			setState(60);
			match(SEMICOLON);
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
	public static class VariableDefinitionSequenceContext extends ParserRuleContext {
		public VariableDefinitionItemContext defs;
		public List<VariableDefinitionItemContext> variableDefinitionItem() {
			return getRuleContexts(VariableDefinitionItemContext.class);
		}
		public VariableDefinitionItemContext variableDefinitionItem(int i) {
			return getRuleContext(VariableDefinitionItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LamaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LamaParser.COMMA, i);
		}
		public VariableDefinitionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinitionSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterVariableDefinitionSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitVariableDefinitionSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitVariableDefinitionSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionSequenceContext variableDefinitionSequence() throws RecognitionException {
		VariableDefinitionSequenceContext _localctx = new VariableDefinitionSequenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDefinitionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			((VariableDefinitionSequenceContext)_localctx).defs = variableDefinitionItem();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(63);
				match(COMMA);
				setState(64);
				((VariableDefinitionSequenceContext)_localctx).defs = variableDefinitionItem();
				}
				}
				setState(69);
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
	public static class VariableDefinitionItemContext extends ParserRuleContext {
		public Token name;
		public BasicExpressionContext value;
		public TerminalNode L_IDENT() { return getToken(LamaParser.L_IDENT, 0); }
		public TerminalNode DEF_ASSIGN() { return getToken(LamaParser.DEF_ASSIGN, 0); }
		public BasicExpressionContext basicExpression() {
			return getRuleContext(BasicExpressionContext.class,0);
		}
		public VariableDefinitionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinitionItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterVariableDefinitionItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitVariableDefinitionItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitVariableDefinitionItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionItemContext variableDefinitionItem() throws RecognitionException {
		VariableDefinitionItemContext _localctx = new VariableDefinitionItemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDefinitionItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			((VariableDefinitionItemContext)_localctx).name = match(L_IDENT);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEF_ASSIGN) {
				{
				setState(71);
				match(DEF_ASSIGN);
				setState(72);
				((VariableDefinitionItemContext)_localctx).value = basicExpression();
				}
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
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public Token name;
		public FunctionArgumentsContext args;
		public FunctionBodyContext body;
		public TerminalNode FUN() { return getToken(LamaParser.FUN, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(LamaParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(LamaParser.CLOSE_PARENS, 0); }
		public TerminalNode L_IDENT() { return getToken(LamaParser.L_IDENT, 0); }
		public FunctionArgumentsContext functionArguments() {
			return getRuleContext(FunctionArgumentsContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(FUN);
			setState(76);
			((FunctionDefinitionContext)_localctx).name = match(L_IDENT);
			setState(77);
			match(OPEN_PARENS);
			setState(78);
			((FunctionDefinitionContext)_localctx).args = functionArguments();
			setState(79);
			match(CLOSE_PARENS);
			setState(80);
			((FunctionDefinitionContext)_localctx).body = functionBody();
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
	public static class FunctionArgumentsContext extends ParserRuleContext {
		public Token args;
		public List<TerminalNode> L_IDENT() { return getTokens(LamaParser.L_IDENT); }
		public TerminalNode L_IDENT(int i) {
			return getToken(LamaParser.L_IDENT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LamaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LamaParser.COMMA, i);
		}
		public FunctionArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterFunctionArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitFunctionArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitFunctionArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentsContext functionArguments() throws RecognitionException {
		FunctionArgumentsContext _localctx = new FunctionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_IDENT) {
				{
				setState(82);
				((FunctionArgumentsContext)_localctx).args = match(L_IDENT);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(83);
					match(COMMA);
					setState(84);
					((FunctionArgumentsContext)_localctx).args = match(L_IDENT);
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(LamaParser.OPEN_BRACE, 0); }
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(LamaParser.CLOSE_BRACE, 0); }
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(OPEN_BRACE);
			setState(93);
			scopeExpression();
			setState(94);
			match(CLOSE_BRACE);
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<BasicExpressionContext> basicExpression() {
			return getRuleContexts(BasicExpressionContext.class);
		}
		public BasicExpressionContext basicExpression(int i) {
			return getRuleContext(BasicExpressionContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(LamaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(LamaParser.SEMICOLON, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96);
					basicExpression();
					setState(97);
					match(SEMICOLON);
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(104);
			basicExpression();
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
	public static class BasicExpressionContext extends ParserRuleContext {
		public AssocExpressionContext assocExpression() {
			return getRuleContext(AssocExpressionContext.class,0);
		}
		public ComparisonExpressionContext comparisonExpression() {
			return getRuleContext(ComparisonExpressionContext.class,0);
		}
		public BasicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterBasicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitBasicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitBasicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicExpressionContext basicExpression() throws RecognitionException {
		BasicExpressionContext _localctx = new BasicExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_basicExpression);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				assocExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				comparisonExpression();
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
	public static class AssocExpressionContext extends ParserRuleContext {
		public AssocExpressionContext lhs;
		public Token operator;
		public AssocExpressionContext rhs;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public List<AssocExpressionContext> assocExpression() {
			return getRuleContexts(AssocExpressionContext.class);
		}
		public AssocExpressionContext assocExpression(int i) {
			return getRuleContext(AssocExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(LamaParser.ASSIGN, 0); }
		public TerminalNode OP_OR() { return getToken(LamaParser.OP_OR, 0); }
		public TerminalNode OP_AND() { return getToken(LamaParser.OP_AND, 0); }
		public TerminalNode PLUS() { return getToken(LamaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LamaParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(LamaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LamaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LamaParser.MOD, 0); }
		public AssocExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assocExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterAssocExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitAssocExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitAssocExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssocExpressionContext assocExpression() throws RecognitionException {
		return assocExpression(0);
	}

	private AssocExpressionContext assocExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AssocExpressionContext _localctx = new AssocExpressionContext(_ctx, _parentState);
		AssocExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_assocExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(111);
			postfixExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(128);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new AssocExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_assocExpression);
						setState(113);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(114);
						((AssocExpressionContext)_localctx).operator = match(ASSIGN);
						setState(115);
						((AssocExpressionContext)_localctx).rhs = assocExpression(5);
						}
						break;
					case 2:
						{
						_localctx = new AssocExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_assocExpression);
						setState(116);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(117);
						((AssocExpressionContext)_localctx).operator = match(OP_OR);
						setState(118);
						((AssocExpressionContext)_localctx).rhs = assocExpression(5);
						}
						break;
					case 3:
						{
						_localctx = new AssocExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_assocExpression);
						setState(119);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(120);
						((AssocExpressionContext)_localctx).operator = match(OP_AND);
						setState(121);
						((AssocExpressionContext)_localctx).rhs = assocExpression(4);
						}
						break;
					case 4:
						{
						_localctx = new AssocExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_assocExpression);
						setState(122);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(123);
						((AssocExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AssocExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(124);
						((AssocExpressionContext)_localctx).rhs = assocExpression(3);
						}
						break;
					case 5:
						{
						_localctx = new AssocExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_assocExpression);
						setState(125);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(126);
						((AssocExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0) ) {
							((AssocExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(127);
						((AssocExpressionContext)_localctx).rhs = assocExpression(2);
						}
						break;
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends ParserRuleContext {
		public AssocExpressionContext lhs;
		public Token operator;
		public AssocExpressionContext rhs;
		public List<AssocExpressionContext> assocExpression() {
			return getRuleContexts(AssocExpressionContext.class);
		}
		public AssocExpressionContext assocExpression(int i) {
			return getRuleContext(AssocExpressionContext.class,i);
		}
		public TerminalNode OP_LT() { return getToken(LamaParser.OP_LT, 0); }
		public TerminalNode OP_GT() { return getToken(LamaParser.OP_GT, 0); }
		public TerminalNode OP_LE() { return getToken(LamaParser.OP_LE, 0); }
		public TerminalNode OP_GE() { return getToken(LamaParser.OP_GE, 0); }
		public TerminalNode OP_EQ() { return getToken(LamaParser.OP_EQ, 0); }
		public TerminalNode OP_NE() { return getToken(LamaParser.OP_NE, 0); }
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			((ComparisonExpressionContext)_localctx).lhs = assocExpression(0);
			setState(134);
			((ComparisonExpressionContext)_localctx).operator = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 16515072L) != 0) ) {
				((ComparisonExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(135);
			((ComparisonExpressionContext)_localctx).rhs = assocExpression(0);
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
	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	 
		public PostfixExpressionContext() { }
		public void copyFrom(PostfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptySuffixContext extends PostfixExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public EmptySuffixContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterEmptySuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitEmptySuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitEmptySuffix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext base;
		public ExpressionContext index;
		public TerminalNode OPEN_BRACKET() { return getToken(LamaParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(LamaParser.CLOSE_BRACKET, 0); }
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndexExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext base;
		public ExpressionContext args;
		public TerminalNode OPEN_PARENS() { return getToken(LamaParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(LamaParser.CLOSE_PARENS, 0); }
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LamaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LamaParser.COMMA, i);
		}
		public IndexExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterIndexExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitIndexExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitIndexExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EmptySuffixContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(138);
			primary();
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(158);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new IndexExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						((IndexExpressionContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(140);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(141);
						match(OPEN_PARENS);
						setState(150);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((_la) & ~0x3f) == 0 && ((1L << _la) & 139787277176866L) != 0) {
							{
							setState(142);
							((IndexExpressionContext)_localctx).args = expression();
							setState(147);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(143);
								match(COMMA);
								setState(144);
								((IndexExpressionContext)_localctx).args = expression();
								}
								}
								setState(149);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(152);
						match(CLOSE_PARENS);
						}
						break;
					case 2:
						{
						_localctx = new CallExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						((CallExpressionContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(153);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(154);
						match(OPEN_BRACKET);
						setState(155);
						((CallExpressionContext)_localctx).index = expression();
						setState(156);
						match(CLOSE_BRACKET);
						}
						break;
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends PrimaryContext {
		public TerminalNode L_IDENT() { return getToken(LamaParser.L_IDENT, 0); }
		public IdentifierContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends PrimaryContext {
		public TerminalNode WHILE() { return getToken(LamaParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(LamaParser.DO, 0); }
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public TerminalNode OD() { return getToken(LamaParser.OD, 0); }
		public WhileLoopContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalContext extends PrimaryContext {
		public IfThenElseContext ifThenElse() {
			return getRuleContext(IfThenElseContext.class,0);
		}
		public ConditionalContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitConditional(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLiteralContext extends PrimaryContext {
		public ExpressionContext items;
		public TerminalNode OPEN_BRACKET() { return getToken(LamaParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(LamaParser.CLOSE_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LamaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LamaParser.COMMA, i);
		}
		public ArrayLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueLiteralContext extends PrimaryContext {
		public TerminalNode TRUE() { return getToken(LamaParser.TRUE, 0); }
		public TrueLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterTrueLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitTrueLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitTrueLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SkipContext extends PrimaryContext {
		public TerminalNode SKIP_() { return getToken(LamaParser.SKIP_, 0); }
		public SkipContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharacterLiteralContext extends PrimaryContext {
		public TerminalNode CHARACTER_LITERAL() { return getToken(LamaParser.CHARACTER_LITERAL, 0); }
		public CharacterLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterCharacterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitCharacterLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitCharacterLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseLiteralContext extends PrimaryContext {
		public TerminalNode FALSE() { return getToken(LamaParser.FALSE, 0); }
		public FalseLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterFalseLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitFalseLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitFalseLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends PrimaryContext {
		public TerminalNode STRING_LITERAL() { return getToken(LamaParser.STRING_LITERAL, 0); }
		public StringLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScopeContext extends PrimaryContext {
		public TerminalNode OPEN_PARENS() { return getToken(LamaParser.OPEN_PARENS, 0); }
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENS() { return getToken(LamaParser.CLOSE_PARENS, 0); }
		public ScopeContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitScope(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseExpressionContext extends PrimaryContext {
		public CaseWhenContext caseWhen() {
			return getRuleContext(CaseWhenContext.class,0);
		}
		public CaseExpressionContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterCaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitCaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitCaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileLoopContext extends PrimaryContext {
		public TerminalNode DO() { return getToken(LamaParser.DO, 0); }
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(LamaParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OD() { return getToken(LamaParser.OD, 0); }
		public DoWhileLoopContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterDoWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitDoWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitDoWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends PrimaryContext {
		public TerminalNode FOR() { return getToken(LamaParser.FOR, 0); }
		public List<ScopeExpressionContext> scopeExpression() {
			return getRuleContexts(ScopeExpressionContext.class);
		}
		public ScopeExpressionContext scopeExpression(int i) {
			return getRuleContext(ScopeExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LamaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LamaParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DO() { return getToken(LamaParser.DO, 0); }
		public TerminalNode OD() { return getToken(LamaParser.OD, 0); }
		public ForLoopContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegativeNumberLiteralContext extends PrimaryContext {
		public TerminalNode MINUS() { return getToken(LamaParser.MINUS, 0); }
		public TerminalNode NUMBER_LITERAL() { return getToken(LamaParser.NUMBER_LITERAL, 0); }
		public NegativeNumberLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterNegativeNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitNegativeNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitNegativeNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralContext extends PrimaryContext {
		public TerminalNode NUMBER_LITERAL() { return getToken(LamaParser.NUMBER_LITERAL, 0); }
		public NumberLiteralContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SExpContext extends PrimaryContext {
		public Token name;
		public ExpressionContext items;
		public TerminalNode U_IDENT() { return getToken(LamaParser.U_IDENT, 0); }
		public TerminalNode OPEN_PARENS() { return getToken(LamaParser.OPEN_PARENS, 0); }
		public TerminalNode CLOSE_PARENS() { return getToken(LamaParser.CLOSE_PARENS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LamaParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LamaParser.COMMA, i);
		}
		public SExpContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterSExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitSExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitSExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primary);
		int _la;
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER_LITERAL:
				_localctx = new NumberLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(NUMBER_LITERAL);
				}
				break;
			case MINUS:
				_localctx = new NegativeNumberLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(MINUS);
				setState(165);
				match(NUMBER_LITERAL);
				}
				break;
			case TRUE:
				_localctx = new TrueLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				match(FALSE);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				match(STRING_LITERAL);
				}
				break;
			case CHARACTER_LITERAL:
				_localctx = new CharacterLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(CHARACTER_LITERAL);
				}
				break;
			case OPEN_BRACKET:
				_localctx = new ArrayLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(170);
				match(OPEN_BRACKET);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 139787277176866L) != 0) {
					{
					setState(171);
					((ArrayLiteralContext)_localctx).items = expression();
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(172);
						match(COMMA);
						setState(173);
						((ArrayLiteralContext)_localctx).items = expression();
						}
						}
						setState(178);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(181);
				match(CLOSE_BRACKET);
				}
				break;
			case U_IDENT:
				_localctx = new SExpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(182);
				((SExpContext)_localctx).name = match(U_IDENT);
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(183);
					match(OPEN_PARENS);
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((_la) & ~0x3f) == 0 && ((1L << _la) & 139787277176866L) != 0) {
						{
						setState(184);
						((SExpContext)_localctx).items = expression();
						setState(189);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(185);
							match(COMMA);
							setState(186);
							((SExpContext)_localctx).items = expression();
							}
							}
							setState(191);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(194);
					match(CLOSE_PARENS);
					}
					break;
				}
				}
				break;
			case L_IDENT:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(197);
				match(L_IDENT);
				}
				break;
			case OPEN_PARENS:
				_localctx = new ScopeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(198);
				match(OPEN_PARENS);
				setState(199);
				scopeExpression();
				setState(200);
				match(CLOSE_PARENS);
				}
				break;
			case SKIP_:
				_localctx = new SkipContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(202);
				match(SKIP_);
				}
				break;
			case IF:
				_localctx = new ConditionalContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(203);
				ifThenElse();
				}
				break;
			case CASE:
				_localctx = new CaseExpressionContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(204);
				caseWhen();
				}
				break;
			case WHILE:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(205);
				match(WHILE);
				setState(206);
				expression();
				setState(207);
				match(DO);
				setState(208);
				scopeExpression();
				setState(209);
				match(OD);
				}
				break;
			case DO:
				_localctx = new DoWhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(211);
				match(DO);
				setState(212);
				scopeExpression();
				setState(213);
				match(WHILE);
				setState(214);
				expression();
				setState(215);
				match(OD);
				}
				break;
			case FOR:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(217);
				match(FOR);
				setState(218);
				scopeExpression();
				setState(219);
				match(COMMA);
				setState(220);
				expression();
				setState(221);
				match(COMMA);
				setState(222);
				expression();
				setState(223);
				match(DO);
				setState(224);
				scopeExpression();
				setState(225);
				match(OD);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class CaseWhenContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(LamaParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OF() { return getToken(LamaParser.OF, 0); }
		public CaseBranchesContext caseBranches() {
			return getRuleContext(CaseBranchesContext.class,0);
		}
		public TerminalNode ESAC() { return getToken(LamaParser.ESAC, 0); }
		public CaseWhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterCaseWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitCaseWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitCaseWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseWhenContext caseWhen() throws RecognitionException {
		CaseWhenContext _localctx = new CaseWhenContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_caseWhen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(CASE);
			setState(230);
			expression();
			setState(231);
			match(OF);
			setState(232);
			caseBranches();
			setState(233);
			match(ESAC);
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
	public static class CaseBranchesContext extends ParserRuleContext {
		public CaseBranchContext branches;
		public List<CaseBranchContext> caseBranch() {
			return getRuleContexts(CaseBranchContext.class);
		}
		public CaseBranchContext caseBranch(int i) {
			return getRuleContext(CaseBranchContext.class,i);
		}
		public List<TerminalNode> BRANCH_SEP() { return getTokens(LamaParser.BRANCH_SEP); }
		public TerminalNode BRANCH_SEP(int i) {
			return getToken(LamaParser.BRANCH_SEP, i);
		}
		public CaseBranchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBranches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterCaseBranches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitCaseBranches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitCaseBranches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBranchesContext caseBranches() throws RecognitionException {
		CaseBranchesContext _localctx = new CaseBranchesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_caseBranches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			((CaseBranchesContext)_localctx).branches = caseBranch();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BRANCH_SEP) {
				{
				{
				setState(236);
				match(BRANCH_SEP);
				setState(237);
				((CaseBranchesContext)_localctx).branches = caseBranch();
				}
				}
				setState(242);
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
	public static class CaseBranchContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(LamaParser.ARROW, 0); }
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public CaseBranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBranch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterCaseBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitCaseBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitCaseBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBranchContext caseBranch() throws RecognitionException {
		CaseBranchContext _localctx = new CaseBranchContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_caseBranch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			pattern();
			setState(244);
			match(ARROW);
			setState(245);
			scopeExpression();
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
	public static class PatternContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(LamaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LamaParser.FALSE, 0); }
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
	public static class IfThenElseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LamaParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(LamaParser.THEN, 0); }
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public TerminalNode FI() { return getToken(LamaParser.FI, 0); }
		public ElsePartContext elsePart() {
			return getRuleContext(ElsePartContext.class,0);
		}
		public IfThenElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterIfThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitIfThenElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitIfThenElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfThenElseContext ifThenElse() throws RecognitionException {
		IfThenElseContext _localctx = new IfThenElseContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifThenElse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(IF);
			setState(250);
			expression();
			setState(251);
			match(THEN);
			setState(252);
			scopeExpression();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE || _la==ELIF) {
				{
				setState(253);
				elsePart();
				}
			}

			setState(256);
			match(FI);
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
	public static class ElsePartContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(LamaParser.ELIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(LamaParser.THEN, 0); }
		public ScopeExpressionContext scopeExpression() {
			return getRuleContext(ScopeExpressionContext.class,0);
		}
		public ElsePartContext elsePart() {
			return getRuleContext(ElsePartContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(LamaParser.ELSE, 0); }
		public ElsePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).enterElsePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LamaParserListener ) ((LamaParserListener)listener).exitElsePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LamaParserVisitor ) return ((LamaParserVisitor<? extends T>)visitor).visitElsePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsePartContext elsePart() throws RecognitionException {
		ElsePartContext _localctx = new ElsePartContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elsePart);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(ELIF);
				setState(259);
				expression();
				setState(260);
				match(THEN);
				setState(261);
				scopeExpression();
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE || _la==ELIF) {
					{
					setState(262);
					elsePart();
					}
				}

				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(ELSE);
				setState(266);
				scopeExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return assocExpression_sempred((AssocExpressionContext)_localctx, predIndex);
		case 13:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean assocExpression_sempred(AssocExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00014\u010e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0005\u0001/\b\u0001\n\u0001\f\u00012\t\u0001"+
		"\u0001\u0001\u0003\u00015\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"9\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004B\b\u0004\n\u0004\f\u0004E\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005J\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007V\b\u0007\n\u0007\f\u0007"+
		"Y\t\u0007\u0003\u0007[\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0005\td\b\t\n\t\f\tg\t\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0003\nm\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u0081\b\u000b\n\u000b\f\u000b\u0084\t\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u0092\b\r\n\r\f\r\u0095\t\r\u0003\r"+
		"\u0097\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u009f"+
		"\b\r\n\r\f\r\u00a2\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00af\b\u000e\n\u000e\f\u000e\u00b2\t\u000e\u0003"+
		"\u000e\u00b4\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00bc\b\u000e\n\u000e\f\u000e\u00bf\t\u000e"+
		"\u0003\u000e\u00c1\b\u000e\u0001\u000e\u0003\u000e\u00c4\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00e4\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00ef"+
		"\b\u0010\n\u0010\f\u0010\u00f2\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00ff\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0108\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u010c\b\u0014\u0001"+
		"\u0014\u0000\u0002\u0016\u001a\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0004\u0001"+
		"\u0000\u000b\f\u0001\u0000\r\u000f\u0001\u0000\u0012\u0017\u0001\u0000"+
		"()\u0122\u0000*\u0001\u0000\u0000\u0000\u00020\u0001\u0000\u0000\u0000"+
		"\u00048\u0001\u0000\u0000\u0000\u0006:\u0001\u0000\u0000\u0000\b>\u0001"+
		"\u0000\u0000\u0000\nF\u0001\u0000\u0000\u0000\fK\u0001\u0000\u0000\u0000"+
		"\u000eZ\u0001\u0000\u0000\u0000\u0010\\\u0001\u0000\u0000\u0000\u0012"+
		"e\u0001\u0000\u0000\u0000\u0014l\u0001\u0000\u0000\u0000\u0016n\u0001"+
		"\u0000\u0000\u0000\u0018\u0085\u0001\u0000\u0000\u0000\u001a\u0089\u0001"+
		"\u0000\u0000\u0000\u001c\u00e3\u0001\u0000\u0000\u0000\u001e\u00e5\u0001"+
		"\u0000\u0000\u0000 \u00eb\u0001\u0000\u0000\u0000\"\u00f3\u0001\u0000"+
		"\u0000\u0000$\u00f7\u0001\u0000\u0000\u0000&\u00f9\u0001\u0000\u0000\u0000"+
		"(\u010b\u0001\u0000\u0000\u0000*+\u0003\u0002\u0001\u0000+,\u0005\u0000"+
		"\u0000\u0001,\u0001\u0001\u0000\u0000\u0000-/\u0003\u0004\u0002\u0000"+
		".-\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000"+
		"\u0000\u000035\u0003\u0012\t\u000043\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u00005\u0003\u0001\u0000\u0000\u000069\u0003\u0006\u0003\u0000"+
		"79\u0003\f\u0006\u000086\u0001\u0000\u0000\u000087\u0001\u0000\u0000\u0000"+
		"9\u0005\u0001\u0000\u0000\u0000:;\u0005\"\u0000\u0000;<\u0003\b\u0004"+
		"\u0000<=\u0005\b\u0000\u0000=\u0007\u0001\u0000\u0000\u0000>C\u0003\n"+
		"\u0005\u0000?@\u0005\u0007\u0000\u0000@B\u0003\n\u0005\u0000A?\u0001\u0000"+
		"\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000D\t\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"FI\u0005-\u0000\u0000GH\u0005\n\u0000\u0000HJ\u0003\u0014\n\u0000IG\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u000b\u0001\u0000\u0000"+
		"\u0000KL\u0005$\u0000\u0000LM\u0005-\u0000\u0000MN\u0005\u0001\u0000\u0000"+
		"NO\u0003\u000e\u0007\u0000OP\u0005\u0002\u0000\u0000PQ\u0003\u0010\b\u0000"+
		"Q\r\u0001\u0000\u0000\u0000RW\u0005-\u0000\u0000ST\u0005\u0007\u0000\u0000"+
		"TV\u0005-\u0000\u0000US\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000ZR\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[\u000f\u0001\u0000\u0000\u0000\\]\u0005\u0003\u0000\u0000"+
		"]^\u0003\u0002\u0001\u0000^_\u0005\u0004\u0000\u0000_\u0011\u0001\u0000"+
		"\u0000\u0000`a\u0003\u0014\n\u0000ab\u0005\b\u0000\u0000bd\u0001\u0000"+
		"\u0000\u0000c`\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000"+
		"ge\u0001\u0000\u0000\u0000hi\u0003\u0014\n\u0000i\u0013\u0001\u0000\u0000"+
		"\u0000jm\u0003\u0016\u000b\u0000km\u0003\u0018\f\u0000lj\u0001\u0000\u0000"+
		"\u0000lk\u0001\u0000\u0000\u0000m\u0015\u0001\u0000\u0000\u0000no\u0006"+
		"\u000b\uffff\uffff\u0000op\u0003\u001a\r\u0000p\u0082\u0001\u0000\u0000"+
		"\u0000qr\n\u0005\u0000\u0000rs\u0005\t\u0000\u0000s\u0081\u0003\u0016"+
		"\u000b\u0005tu\n\u0004\u0000\u0000uv\u0005\u0011\u0000\u0000v\u0081\u0003"+
		"\u0016\u000b\u0005wx\n\u0003\u0000\u0000xy\u0005\u0010\u0000\u0000y\u0081"+
		"\u0003\u0016\u000b\u0004z{\n\u0002\u0000\u0000{|\u0007\u0000\u0000\u0000"+
		"|\u0081\u0003\u0016\u000b\u0003}~\n\u0001\u0000\u0000~\u007f\u0007\u0001"+
		"\u0000\u0000\u007f\u0081\u0003\u0016\u000b\u0002\u0080q\u0001\u0000\u0000"+
		"\u0000\u0080t\u0001\u0000\u0000\u0000\u0080w\u0001\u0000\u0000\u0000\u0080"+
		"z\u0001\u0000\u0000\u0000\u0080}\u0001\u0000\u0000\u0000\u0081\u0084\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u0017\u0001\u0000\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0003\u0016\u000b\u0000\u0086\u0087\u0007"+
		"\u0002\u0000\u0000\u0087\u0088\u0003\u0016\u000b\u0000\u0088\u0019\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0006\r\uffff\uffff\u0000\u008a\u008b\u0003"+
		"\u001c\u000e\u0000\u008b\u00a0\u0001\u0000\u0000\u0000\u008c\u008d\n\u0002"+
		"\u0000\u0000\u008d\u0096\u0005\u0001\u0000\u0000\u008e\u0093\u0003\u0012"+
		"\t\u0000\u008f\u0090\u0005\u0007\u0000\u0000\u0090\u0092\u0003\u0012\t"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000"+
		"\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0096\u008e\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009f\u0005\u0002\u0000"+
		"\u0000\u0099\u009a\n\u0001\u0000\u0000\u009a\u009b\u0005\u0005\u0000\u0000"+
		"\u009b\u009c\u0003\u0012\t\u0000\u009c\u009d\u0005\u0006\u0000\u0000\u009d"+
		"\u009f\u0001\u0000\u0000\u0000\u009e\u008c\u0001\u0000\u0000\u0000\u009e"+
		"\u0099\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u001b\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3"+
		"\u00e4\u0005*\u0000\u0000\u00a4\u00a5\u0005\f\u0000\u0000\u00a5\u00e4"+
		"\u0005*\u0000\u0000\u00a6\u00e4\u0005(\u0000\u0000\u00a7\u00e4\u0005)"+
		"\u0000\u0000\u00a8\u00e4\u0005,\u0000\u0000\u00a9\u00e4\u0005+\u0000\u0000"+
		"\u00aa\u00b3\u0005\u0005\u0000\u0000\u00ab\u00b0\u0003\u0012\t\u0000\u00ac"+
		"\u00ad\u0005\u0007\u0000\u0000\u00ad\u00af\u0003\u0012\t\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00ab"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b5\u00e4\u0005\u0006\u0000\u0000\u00b6\u00c3"+
		"\u0005.\u0000\u0000\u00b7\u00c0\u0005\u0001\u0000\u0000\u00b8\u00bd\u0003"+
		"\u0012\t\u0000\u00b9\u00ba\u0005\u0007\u0000\u0000\u00ba\u00bc\u0003\u0012"+
		"\t\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000"+
		"\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c0\u00b8\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4\u0005\u0002\u0000"+
		"\u0000\u00c3\u00b7\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00e4\u0001\u0000\u0000\u0000\u00c5\u00e4\u0005-\u0000\u0000"+
		"\u00c6\u00c7\u0005\u0001\u0000\u0000\u00c7\u00c8\u0003\u0002\u0001\u0000"+
		"\u00c8\u00c9\u0005\u0002\u0000\u0000\u00c9\u00e4\u0001\u0000\u0000\u0000"+
		"\u00ca\u00e4\u0005\u0018\u0000\u0000\u00cb\u00e4\u0003&\u0013\u0000\u00cc"+
		"\u00e4\u0003\u001e\u000f\u0000\u00cd\u00ce\u0005\u001e\u0000\u0000\u00ce"+
		"\u00cf\u0003\u0012\t\u0000\u00cf\u00d0\u0005\u001f\u0000\u0000\u00d0\u00d1"+
		"\u0003\u0002\u0001\u0000\u00d1\u00d2\u0005 \u0000\u0000\u00d2\u00e4\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0005\u001f\u0000\u0000\u00d4\u00d5\u0003"+
		"\u0002\u0001\u0000\u00d5\u00d6\u0005\u001e\u0000\u0000\u00d6\u00d7\u0003"+
		"\u0012\t\u0000\u00d7\u00d8\u0005 \u0000\u0000\u00d8\u00e4\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0005!\u0000\u0000\u00da\u00db\u0003\u0002\u0001"+
		"\u0000\u00db\u00dc\u0005\u0007\u0000\u0000\u00dc\u00dd\u0003\u0012\t\u0000"+
		"\u00dd\u00de\u0005\u0007\u0000\u0000\u00de\u00df\u0003\u0012\t\u0000\u00df"+
		"\u00e0\u0005\u001f\u0000\u0000\u00e0\u00e1\u0003\u0002\u0001\u0000\u00e1"+
		"\u00e2\u0005 \u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00a3"+
		"\u0001\u0000\u0000\u0000\u00e3\u00a4\u0001\u0000\u0000\u0000\u00e3\u00a6"+
		"\u0001\u0000\u0000\u0000\u00e3\u00a7\u0001\u0000\u0000\u0000\u00e3\u00a8"+
		"\u0001\u0000\u0000\u0000\u00e3\u00a9\u0001\u0000\u0000\u0000\u00e3\u00aa"+
		"\u0001\u0000\u0000\u0000\u00e3\u00b6\u0001\u0000\u0000\u0000\u00e3\u00c5"+
		"\u0001\u0000\u0000\u0000\u00e3\u00c6\u0001\u0000\u0000\u0000\u00e3\u00ca"+
		"\u0001\u0000\u0000\u0000\u00e3\u00cb\u0001\u0000\u0000\u0000\u00e3\u00cc"+
		"\u0001\u0000\u0000\u0000\u00e3\u00cd\u0001\u0000\u0000\u0000\u00e3\u00d3"+
		"\u0001\u0000\u0000\u0000\u00e3\u00d9\u0001\u0000\u0000\u0000\u00e4\u001d"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005%\u0000\u0000\u00e6\u00e7\u0003"+
		"\u0012\t\u0000\u00e7\u00e8\u0005&\u0000\u0000\u00e8\u00e9\u0003 \u0010"+
		"\u0000\u00e9\u00ea\u0005\'\u0000\u0000\u00ea\u001f\u0001\u0000\u0000\u0000"+
		"\u00eb\u00f0\u0003\"\u0011\u0000\u00ec\u00ed\u00051\u0000\u0000\u00ed"+
		"\u00ef\u0003\"\u0011\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f1!\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0003$\u0012\u0000\u00f4\u00f5\u00052\u0000"+
		"\u0000\u00f5\u00f6\u0003\u0002\u0001\u0000\u00f6#\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0007\u0003\u0000\u0000\u00f8%\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0005\u0019\u0000\u0000\u00fa\u00fb\u0003\u0012\t\u0000\u00fb\u00fc"+
		"\u0005\u001a\u0000\u0000\u00fc\u00fe\u0003\u0002\u0001\u0000\u00fd\u00ff"+
		"\u0003(\u0014\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0005"+
		"\u001d\u0000\u0000\u0101\'\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u001c"+
		"\u0000\u0000\u0103\u0104\u0003\u0012\t\u0000\u0104\u0105\u0005\u001a\u0000"+
		"\u0000\u0105\u0107\u0003\u0002\u0001\u0000\u0106\u0108\u0003(\u0014\u0000"+
		"\u0107\u0106\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000"+
		"\u0108\u010c\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u001b\u0000\u0000"+
		"\u010a\u010c\u0003\u0002\u0001\u0000\u010b\u0102\u0001\u0000\u0000\u0000"+
		"\u010b\u0109\u0001\u0000\u0000\u0000\u010c)\u0001\u0000\u0000\u0000\u0019"+
		"048CIWZel\u0080\u0082\u0093\u0096\u009e\u00a0\u00b0\u00b3\u00bd\u00c0"+
		"\u00c3\u00e3\u00f0\u00fe\u0107\u010b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}