// Generated from Rusticode.g4 by ANTLR 4.13.2

    import java.util.HashMap;
    import java.util.ArrayList;
    import ast.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class RusticodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, PRINT=4, START=5, END=6, INT=7, FLOAT=8, STRING=9, 
		PLUS=10, MINUS=11, MULT=12, DIV=13, ASSIGN=14, GT=15, LT=16, GTE=17, LTE=18, 
		EQ=19, NEQ=20, AND=21, OR=22, LPAREN=23, RPAREN=24, LBRACE=25, RBRACE=26, 
		SEMICOLON=27, NUMBER=28, STRING_LITERAL=29, BOOL_LITERAL=30, ID=31, WS=32, 
		COMMENT=33;
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_varDeclaration = 2, RULE_assignmentStmt = 3, 
		RULE_type = 4, RULE_expression = 5, RULE_logicalExpr = 6, RULE_comparisonExpr = 7, 
		RULE_arithmeticExpr = 8, RULE_term = 9, RULE_factor = 10, RULE_ifStmt = 11, 
		RULE_whileStmt = 12, RULE_printStmt = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentence", "varDeclaration", "assignmentStmt", "type", "expression", 
			"logicalExpr", "comparisonExpr", "arithmeticExpr", "term", "factor", 
			"ifStmt", "whileStmt", "printStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'print'", "'start:'", "'end'", "'int'", 
			"'float'", "'string'", "'+'", "'-'", "'*'", "'/'", "'='", "'>'", "'<'", 
			"'>='", "'<='", "'=='", "'!='", "'&&'", "'||'", "'('", "')'", "'{'", 
			"'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "WHILE", "PRINT", "START", "END", "INT", "FLOAT", 
			"STRING", "PLUS", "MINUS", "MULT", "DIV", "ASSIGN", "GT", "LT", "GTE", 
			"LTE", "EQ", "NEQ", "AND", "OR", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"SEMICOLON", "NUMBER", "STRING_LITERAL", "BOOL_LITERAL", "ID", "WS", 
			"COMMENT"
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
	public String getGrammarFileName() { return "Rusticode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private HashMap<String, Object> symbolTable = new HashMap<>();

	public RusticodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4034921370L) != 0)) {
				{
				{
				setState(28);
				sentence();
				}
				}
				setState(33);
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
	public static class SentenceContext extends ParserRuleContext {
		public ASTNode node;
		public VarDeclarationContext varDeclaration;
		public AssignmentStmtContext assignmentStmt;
		public ExpressionContext expression;
		public IfStmtContext ifStmt;
		public WhileStmtContext whileStmt;
		public PrintStmtContext printStmt;
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(RusticodeParser.SEMICOLON, 0); }
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				((SentenceContext)_localctx).varDeclaration = varDeclaration();
				setState(35);
				match(SEMICOLON);
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).varDeclaration.node; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				((SentenceContext)_localctx).assignmentStmt = assignmentStmt();
				setState(39);
				match(SEMICOLON);
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).assignmentStmt.node; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				((SentenceContext)_localctx).expression = expression();
				setState(43);
				match(SEMICOLON);
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).expression.node; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				((SentenceContext)_localctx).ifStmt = ifStmt();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).ifStmt.node; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				((SentenceContext)_localctx).whileStmt = whileStmt();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).whileStmt.node; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				((SentenceContext)_localctx).printStmt = printStmt();
				setState(53);
				match(SEMICOLON);
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).printStmt.node; 
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
	public static class VarDeclarationContext extends ParserRuleContext {
		public ASTNode node;
		public TypeContext type;
		public Token ID;
		public ExpressionContext expr;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(RusticodeParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(RusticodeParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			((VarDeclarationContext)_localctx).type = type();
			setState(59);
			((VarDeclarationContext)_localctx).ID = match(ID);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(60);
				match(ASSIGN);
				setState(61);
				((VarDeclarationContext)_localctx).expr = expression();
				}
			}


			            ((VarDeclarationContext)_localctx).node =  (((VarDeclarationContext)_localctx).expr != null)
			                ? new VariableDeclaration((((VarDeclarationContext)_localctx).type!=null?_input.getText(((VarDeclarationContext)_localctx).type.start,((VarDeclarationContext)_localctx).type.stop):null), (((VarDeclarationContext)_localctx).ID!=null?((VarDeclarationContext)_localctx).ID.getText():null), ((VarDeclarationContext)_localctx).expr.node)
			                : new VariableDeclaration((((VarDeclarationContext)_localctx).type!=null?_input.getText(((VarDeclarationContext)_localctx).type.start,((VarDeclarationContext)_localctx).type.stop):null), (((VarDeclarationContext)_localctx).ID!=null?((VarDeclarationContext)_localctx).ID.getText():null), null);
			        
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
	public static class AssignmentStmtContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ExpressionContext expr;
		public TerminalNode ID() { return getToken(RusticodeParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(RusticodeParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitAssignmentStmt(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignmentStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			((AssignmentStmtContext)_localctx).ID = match(ID);
			setState(67);
			match(ASSIGN);
			setState(68);
			((AssignmentStmtContext)_localctx).expr = expression();
			 ((AssignmentStmtContext)_localctx).node =  new Assignment((((AssignmentStmtContext)_localctx).ID!=null?((AssignmentStmtContext)_localctx).ID.getText():null), ((AssignmentStmtContext)_localctx).expr.node); 
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(RusticodeParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(RusticodeParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(RusticodeParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) ) {
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
	public static class ExpressionContext extends ParserRuleContext {
		public ASTNode node;
		public LogicalExprContext logicalExpr;
		public LogicalExprContext logicalExpr() {
			return getRuleContext(LogicalExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			((ExpressionContext)_localctx).logicalExpr = logicalExpr();
			 ((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).logicalExpr.node; 
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
	public static class LogicalExprContext extends ParserRuleContext {
		public ASTNode node;
		public ComparisonExprContext left;
		public Token op;
		public ComparisonExprContext right;
		public ComparisonExprContext comparisonExpr;
		public List<ComparisonExprContext> comparisonExpr() {
			return getRuleContexts(ComparisonExprContext.class);
		}
		public ComparisonExprContext comparisonExpr(int i) {
			return getRuleContext(ComparisonExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(RusticodeParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(RusticodeParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(RusticodeParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(RusticodeParser.OR, i);
		}
		public LogicalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterLogicalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitLogicalExpr(this);
		}
	}

	public final LogicalExprContext logicalExpr() throws RecognitionException {
		LogicalExprContext _localctx = new LogicalExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_logicalExpr);
		int _la;
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				((LogicalExprContext)_localctx).left = comparisonExpr();
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND || _la==OR) {
					{
					{
					setState(77);
					((LogicalExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((LogicalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(78);
					((LogicalExprContext)_localctx).right = comparisonExpr();
					 ((LogicalExprContext)_localctx).node =  new LogicalExpression((((LogicalExprContext)_localctx).op!=null?((LogicalExprContext)_localctx).op.getText():null), ((LogicalExprContext)_localctx).left.node, ((LogicalExprContext)_localctx).right.node); 
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				((LogicalExprContext)_localctx).comparisonExpr = comparisonExpr();
				 ((LogicalExprContext)_localctx).node =  ((LogicalExprContext)_localctx).comparisonExpr.node; 
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
	public static class ComparisonExprContext extends ParserRuleContext {
		public ASTNode node;
		public ArithmeticExprContext left;
		public Token op;
		public ArithmeticExprContext right;
		public ArithmeticExprContext arithmeticExpr;
		public List<ArithmeticExprContext> arithmeticExpr() {
			return getRuleContexts(ArithmeticExprContext.class);
		}
		public ArithmeticExprContext arithmeticExpr(int i) {
			return getRuleContext(ArithmeticExprContext.class,i);
		}
		public List<TerminalNode> GT() { return getTokens(RusticodeParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(RusticodeParser.GT, i);
		}
		public List<TerminalNode> LT() { return getTokens(RusticodeParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(RusticodeParser.LT, i);
		}
		public List<TerminalNode> GTE() { return getTokens(RusticodeParser.GTE); }
		public TerminalNode GTE(int i) {
			return getToken(RusticodeParser.GTE, i);
		}
		public List<TerminalNode> LTE() { return getTokens(RusticodeParser.LTE); }
		public TerminalNode LTE(int i) {
			return getToken(RusticodeParser.LTE, i);
		}
		public List<TerminalNode> EQ() { return getTokens(RusticodeParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(RusticodeParser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(RusticodeParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(RusticodeParser.NEQ, i);
		}
		public ComparisonExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitComparisonExpr(this);
		}
	}

	public final ComparisonExprContext comparisonExpr() throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comparisonExpr);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				((ComparisonExprContext)_localctx).left = arithmeticExpr();
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2064384L) != 0)) {
					{
					{
					setState(92);
					((ComparisonExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2064384L) != 0)) ) {
						((ComparisonExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(93);
					((ComparisonExprContext)_localctx).right = arithmeticExpr();
					 ((ComparisonExprContext)_localctx).node =  new ComparativeExpression((((ComparisonExprContext)_localctx).op!=null?((ComparisonExprContext)_localctx).op.getText():null), ((ComparisonExprContext)_localctx).left.node, ((ComparisonExprContext)_localctx).right.node); 
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				((ComparisonExprContext)_localctx).arithmeticExpr = arithmeticExpr();
				 ((ComparisonExprContext)_localctx).node =  ((ComparisonExprContext)_localctx).arithmeticExpr.node; 
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
	public static class ArithmeticExprContext extends ParserRuleContext {
		public ASTNode node;
		public TermContext left;
		public Token op;
		public TermContext right;
		public TermContext term;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(RusticodeParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(RusticodeParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(RusticodeParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(RusticodeParser.MINUS, i);
		}
		public ArithmeticExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterArithmeticExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitArithmeticExpr(this);
		}
	}

	public final ArithmeticExprContext arithmeticExpr() throws RecognitionException {
		ArithmeticExprContext _localctx = new ArithmeticExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arithmeticExpr);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				((ArithmeticExprContext)_localctx).left = term();
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==MINUS) {
					{
					{
					setState(107);
					((ArithmeticExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((ArithmeticExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(108);
					((ArithmeticExprContext)_localctx).right = term();
					 ((ArithmeticExprContext)_localctx).node =  new ArithmeticExpression((((ArithmeticExprContext)_localctx).op!=null?((ArithmeticExprContext)_localctx).op.getText():null), ((ArithmeticExprContext)_localctx).left.node, ((ArithmeticExprContext)_localctx).right.node); 
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				((ArithmeticExprContext)_localctx).term = term();
				 ((ArithmeticExprContext)_localctx).node =  ((ArithmeticExprContext)_localctx).term.node; 
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
	public static class TermContext extends ParserRuleContext {
		public ASTNode node;
		public FactorContext left;
		public Token op;
		public FactorContext right;
		public FactorContext factor;
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(RusticodeParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(RusticodeParser.MULT, i);
		}
		public List<TerminalNode> DIV() { return getTokens(RusticodeParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(RusticodeParser.DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				((TermContext)_localctx).left = factor();
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MULT || _la==DIV) {
					{
					{
					setState(122);
					((TermContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==MULT || _la==DIV) ) {
						((TermContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(123);
					((TermContext)_localctx).right = factor();
					 ((TermContext)_localctx).node =  new ArithmeticExpression((((TermContext)_localctx).op!=null?((TermContext)_localctx).op.getText():null), ((TermContext)_localctx).left.node, ((TermContext)_localctx).right.node); 
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				((TermContext)_localctx).factor = factor();
				 ((TermContext)_localctx).node =  ((TermContext)_localctx).factor.node; 
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
	public static class FactorContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expr;
		public Token NUMBER;
		public Token STRING_LITERAL;
		public Token BOOL_LITERAL;
		public Token ID;
		public TerminalNode LPAREN() { return getToken(RusticodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RusticodeParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(RusticodeParser.NUMBER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(RusticodeParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(RusticodeParser.BOOL_LITERAL, 0); }
		public TerminalNode ID() { return getToken(RusticodeParser.ID, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_factor);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(LPAREN);
				setState(137);
				((FactorContext)_localctx).expr = expression();
				setState(138);
				match(RPAREN);
				 ((FactorContext)_localctx).node =  ((FactorContext)_localctx).expr.node; 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				((FactorContext)_localctx).NUMBER = match(NUMBER);
				 ((FactorContext)_localctx).node =  new Constant((((FactorContext)_localctx).NUMBER!=null?((FactorContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				((FactorContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				 ((FactorContext)_localctx).node =  new Constant((((FactorContext)_localctx).STRING_LITERAL!=null?((FactorContext)_localctx).STRING_LITERAL.getText():null)); 
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				((FactorContext)_localctx).BOOL_LITERAL = match(BOOL_LITERAL);
				 ((FactorContext)_localctx).node =  new Constant((((FactorContext)_localctx).BOOL_LITERAL!=null?((FactorContext)_localctx).BOOL_LITERAL.getText():null)); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				((FactorContext)_localctx).ID = match(ID);
				 ((FactorContext)_localctx).node =  new Variable((((FactorContext)_localctx).ID!=null?((FactorContext)_localctx).ID.getText():null)); 
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
	public static class IfStmtContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext cond;
		public SentenceContext thenStmt;
		public SentenceContext elseStmt;
		public TerminalNode IF() { return getToken(RusticodeParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(RusticodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RusticodeParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(RusticodeParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(RusticodeParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(RusticodeParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(RusticodeParser.RBRACE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(RusticodeParser.ELSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStmt);

		    ArrayList<ASTNode> thenBlock = new ArrayList<>();
		    ArrayList<ASTNode> elseBlock = new ArrayList<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(IF);
			setState(152);
			match(LPAREN);
			setState(153);
			((IfStmtContext)_localctx).cond = expression();
			setState(154);
			match(RPAREN);
			setState(155);
			match(LBRACE);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4034921370L) != 0)) {
				{
				{
				setState(156);
				((IfStmtContext)_localctx).thenStmt = sentence();
				 thenBlock.add(((IfStmtContext)_localctx).thenStmt.node); 
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(RBRACE);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(165);
				match(ELSE);
				setState(166);
				match(LBRACE);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4034921370L) != 0)) {
					{
					{
					setState(167);
					((IfStmtContext)_localctx).elseStmt = sentence();
					 elseBlock.add(((IfStmtContext)_localctx).elseStmt.node); 
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				match(RBRACE);
				}
			}

			 ((IfStmtContext)_localctx).node =  new If(((IfStmtContext)_localctx).cond.node, thenBlock, elseBlock); 
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
	public static class WhileStmtContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext cond;
		public SentenceContext bodyStmt;
		public TerminalNode WHILE() { return getToken(RusticodeParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(RusticodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RusticodeParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(RusticodeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(RusticodeParser.RBRACE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitWhileStmt(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileStmt);

		    ArrayList<ASTNode> bodyBlock = new ArrayList<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(WHILE);
			setState(181);
			match(LPAREN);
			setState(182);
			((WhileStmtContext)_localctx).cond = expression();
			setState(183);
			match(RPAREN);
			setState(184);
			match(LBRACE);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4034921370L) != 0)) {
				{
				{
				setState(185);
				((WhileStmtContext)_localctx).bodyStmt = sentence();
				 bodyBlock.add(((WhileStmtContext)_localctx).bodyStmt.node); 
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(RBRACE);
			 ((WhileStmtContext)_localctx).node =  new While(((WhileStmtContext)_localctx).cond.node, bodyBlock); 
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
	public static class PrintStmtContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expr;
		public TerminalNode PRINT() { return getToken(RusticodeParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(RusticodeParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(RusticodeParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitPrintStmt(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(PRINT);
			setState(197);
			match(LPAREN);
			setState(198);
			((PrintStmtContext)_localctx).expr = expression();
			setState(199);
			match(RPAREN);
			 ((PrintStmtContext)_localctx).node =  new Print(((PrintStmtContext)_localctx).expr.node); 
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
		"\u0004\u0001!\u00cb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000\n\u0000"+
		"\f\u0000!\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00019\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002?\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006R\b\u0006\n\u0006\f\u0006U\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006Z\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007a\b\u0007\n\u0007\f\u0007d\t"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007i\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bp\b\b\n\b\f\bs\t\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\bx\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u007f\b\t\n\t\f\t\u0082\t\t\u0001\t\u0001\t\u0001\t\u0003\t\u0087\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0096\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00a0\b\u000b\n\u000b\f\u000b\u00a3\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00ab\b\u000b\n\u000b\f\u000b\u00ae\t\u000b\u0001\u000b\u0003\u000b\u00b1"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u00bd\b\f\n\f\f\f\u00c0\t\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0000\u0000\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u0000\u0005\u0001\u0000\u0007\t\u0001\u0000\u0015\u0016"+
		"\u0001\u0000\u000f\u0014\u0001\u0000\n\u000b\u0001\u0000\f\r\u00d3\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u00028\u0001\u0000\u0000\u0000\u0004:\u0001"+
		"\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000\bG\u0001\u0000\u0000"+
		"\u0000\nI\u0001\u0000\u0000\u0000\fY\u0001\u0000\u0000\u0000\u000eh\u0001"+
		"\u0000\u0000\u0000\u0010w\u0001\u0000\u0000\u0000\u0012\u0086\u0001\u0000"+
		"\u0000\u0000\u0014\u0095\u0001\u0000\u0000\u0000\u0016\u0097\u0001\u0000"+
		"\u0000\u0000\u0018\u00b4\u0001\u0000\u0000\u0000\u001a\u00c4\u0001\u0000"+
		"\u0000\u0000\u001c\u001e\u0003\u0002\u0001\u0000\u001d\u001c\u0001\u0000"+
		"\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000"+
		"\u0000\u001f \u0001\u0000\u0000\u0000 \u0001\u0001\u0000\u0000\u0000!"+
		"\u001f\u0001\u0000\u0000\u0000\"#\u0003\u0004\u0002\u0000#$\u0005\u001b"+
		"\u0000\u0000$%\u0006\u0001\uffff\uffff\u0000%9\u0001\u0000\u0000\u0000"+
		"&\'\u0003\u0006\u0003\u0000\'(\u0005\u001b\u0000\u0000()\u0006\u0001\uffff"+
		"\uffff\u0000)9\u0001\u0000\u0000\u0000*+\u0003\n\u0005\u0000+,\u0005\u001b"+
		"\u0000\u0000,-\u0006\u0001\uffff\uffff\u0000-9\u0001\u0000\u0000\u0000"+
		"./\u0003\u0016\u000b\u0000/0\u0006\u0001\uffff\uffff\u000009\u0001\u0000"+
		"\u0000\u000012\u0003\u0018\f\u000023\u0006\u0001\uffff\uffff\u000039\u0001"+
		"\u0000\u0000\u000045\u0003\u001a\r\u000056\u0005\u001b\u0000\u000067\u0006"+
		"\u0001\uffff\uffff\u000079\u0001\u0000\u0000\u00008\"\u0001\u0000\u0000"+
		"\u00008&\u0001\u0000\u0000\u00008*\u0001\u0000\u0000\u00008.\u0001\u0000"+
		"\u0000\u000081\u0001\u0000\u0000\u000084\u0001\u0000\u0000\u00009\u0003"+
		"\u0001\u0000\u0000\u0000:;\u0003\b\u0004\u0000;>\u0005\u001f\u0000\u0000"+
		"<=\u0005\u000e\u0000\u0000=?\u0003\n\u0005\u0000><\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0006\u0002\uffff"+
		"\uffff\u0000A\u0005\u0001\u0000\u0000\u0000BC\u0005\u001f\u0000\u0000"+
		"CD\u0005\u000e\u0000\u0000DE\u0003\n\u0005\u0000EF\u0006\u0003\uffff\uffff"+
		"\u0000F\u0007\u0001\u0000\u0000\u0000GH\u0007\u0000\u0000\u0000H\t\u0001"+
		"\u0000\u0000\u0000IJ\u0003\f\u0006\u0000JK\u0006\u0005\uffff\uffff\u0000"+
		"K\u000b\u0001\u0000\u0000\u0000LS\u0003\u000e\u0007\u0000MN\u0007\u0001"+
		"\u0000\u0000NO\u0003\u000e\u0007\u0000OP\u0006\u0006\uffff\uffff\u0000"+
		"PR\u0001\u0000\u0000\u0000QM\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TZ\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0003\u000e\u0007\u0000WX\u0006"+
		"\u0006\uffff\uffff\u0000XZ\u0001\u0000\u0000\u0000YL\u0001\u0000\u0000"+
		"\u0000YV\u0001\u0000\u0000\u0000Z\r\u0001\u0000\u0000\u0000[b\u0003\u0010"+
		"\b\u0000\\]\u0007\u0002\u0000\u0000]^\u0003\u0010\b\u0000^_\u0006\u0007"+
		"\uffff\uffff\u0000_a\u0001\u0000\u0000\u0000`\\\u0001\u0000\u0000\u0000"+
		"ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000ci\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0003\u0010"+
		"\b\u0000fg\u0006\u0007\uffff\uffff\u0000gi\u0001\u0000\u0000\u0000h[\u0001"+
		"\u0000\u0000\u0000he\u0001\u0000\u0000\u0000i\u000f\u0001\u0000\u0000"+
		"\u0000jq\u0003\u0012\t\u0000kl\u0007\u0003\u0000\u0000lm\u0003\u0012\t"+
		"\u0000mn\u0006\b\uffff\uffff\u0000np\u0001\u0000\u0000\u0000ok\u0001\u0000"+
		"\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rx\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"tu\u0003\u0012\t\u0000uv\u0006\b\uffff\uffff\u0000vx\u0001\u0000\u0000"+
		"\u0000wj\u0001\u0000\u0000\u0000wt\u0001\u0000\u0000\u0000x\u0011\u0001"+
		"\u0000\u0000\u0000y\u0080\u0003\u0014\n\u0000z{\u0007\u0004\u0000\u0000"+
		"{|\u0003\u0014\n\u0000|}\u0006\t\uffff\uffff\u0000}\u007f\u0001\u0000"+
		"\u0000\u0000~z\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0087\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0003\u0014\n\u0000\u0084\u0085\u0006\t\uffff\uffff\u0000\u0085"+
		"\u0087\u0001\u0000\u0000\u0000\u0086y\u0001\u0000\u0000\u0000\u0086\u0083"+
		"\u0001\u0000\u0000\u0000\u0087\u0013\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005\u0017\u0000\u0000\u0089\u008a\u0003\n\u0005\u0000\u008a\u008b\u0005"+
		"\u0018\u0000\u0000\u008b\u008c\u0006\n\uffff\uffff\u0000\u008c\u0096\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0005\u001c\u0000\u0000\u008e\u0096\u0006"+
		"\n\uffff\uffff\u0000\u008f\u0090\u0005\u001d\u0000\u0000\u0090\u0096\u0006"+
		"\n\uffff\uffff\u0000\u0091\u0092\u0005\u001e\u0000\u0000\u0092\u0096\u0006"+
		"\n\uffff\uffff\u0000\u0093\u0094\u0005\u001f\u0000\u0000\u0094\u0096\u0006"+
		"\n\uffff\uffff\u0000\u0095\u0088\u0001\u0000\u0000\u0000\u0095\u008d\u0001"+
		"\u0000\u0000\u0000\u0095\u008f\u0001\u0000\u0000\u0000\u0095\u0091\u0001"+
		"\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0015\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0005\u0001\u0000\u0000\u0098\u0099\u0005"+
		"\u0017\u0000\u0000\u0099\u009a\u0003\n\u0005\u0000\u009a\u009b\u0005\u0018"+
		"\u0000\u0000\u009b\u00a1\u0005\u0019\u0000\u0000\u009c\u009d\u0003\u0002"+
		"\u0001\u0000\u009d\u009e\u0006\u000b\uffff\uffff\u0000\u009e\u00a0\u0001"+
		"\u0000\u0000\u0000\u009f\u009c\u0001\u0000\u0000\u0000\u00a0\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a4\u00b0\u0005\u001a\u0000\u0000\u00a5\u00a6\u0005"+
		"\u0002\u0000\u0000\u00a6\u00ac\u0005\u0019\u0000\u0000\u00a7\u00a8\u0003"+
		"\u0002\u0001\u0000\u00a8\u00a9\u0006\u000b\uffff\uffff\u0000\u00a9\u00ab"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000\u0000\u0000\u00ab\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00af\u00b1\u0005\u001a\u0000\u0000\u00b0\u00a5"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0006\u000b\uffff\uffff\u0000\u00b3"+
		"\u0017\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0003\u0000\u0000\u00b5"+
		"\u00b6\u0005\u0017\u0000\u0000\u00b6\u00b7\u0003\n\u0005\u0000\u00b7\u00b8"+
		"\u0005\u0018\u0000\u0000\u00b8\u00be\u0005\u0019\u0000\u0000\u00b9\u00ba"+
		"\u0003\u0002\u0001\u0000\u00ba\u00bb\u0006\f\uffff\uffff\u0000\u00bb\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000\u00bd\u00c0"+
		"\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00be"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\u001a\u0000\u0000\u00c2\u00c3"+
		"\u0006\f\uffff\uffff\u0000\u00c3\u0019\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0005\u0004\u0000\u0000\u00c5\u00c6\u0005\u0017\u0000\u0000\u00c6\u00c7"+
		"\u0003\n\u0005\u0000\u00c7\u00c8\u0005\u0018\u0000\u0000\u00c8\u00c9\u0006"+
		"\r\uffff\uffff\u0000\u00c9\u001b\u0001\u0000\u0000\u0000\u0010\u001f8"+
		">SYbhqw\u0080\u0086\u0095\u00a1\u00ac\u00b0\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}