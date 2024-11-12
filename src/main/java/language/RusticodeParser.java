// Generated from C:/Users/carlos/IdeaProjects/rusticode-language-syncro/src/main/antlr4/Rusticode.g4 by ANTLR 4.13.2
package language;

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
		IF=1, ELSE=2, WHILE=3, PRINT=4, START=5, END=6, SUM=7, RES=8, MULT=9, 
		DIV=10, ASSIGN=11, GT=12, LT=13, GTE=14, LTE=15, EQ=16, NEQ=17, AND=18, 
		OR=19, NOT=20, LPAREN=21, RPAREN=22, LBRACE=23, RBRACE=24, SEMICOLON=25, 
		NUMBER=26, STRING=27, BOOL=28, ID=29, WS=30, COMMENT=31;
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_assignmentStmt = 2, RULE_ifStmt = 3, 
		RULE_whileStmt = 4, RULE_printStmt = 5, RULE_expression = 6, RULE_info = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentence", "assignmentStmt", "ifStmt", "whileStmt", "printStmt", 
			"expression", "info"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'print'", "'start:'", "'end'", "'+'", 
			"'-'", "'*'", "'/'", "'='", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
			"'&&'", "'||'", "'!'", "'('", "')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "WHILE", "PRINT", "START", "END", "SUM", "RES", "MULT", 
			"DIV", "ASSIGN", "GT", "LT", "GTE", "LTE", "EQ", "NEQ", "AND", "OR", 
			"NOT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMICOLON", "NUMBER", 
			"STRING", "BOOL", "ID", "WS", "COMMENT"
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
		public TerminalNode START() { return getToken(RusticodeParser.START, 0); }
		public TerminalNode END() { return getToken(RusticodeParser.END, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(16);
			match(START);
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1009778714L) != 0)) {
				{
				{
				setState(17);
				sentence();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
			match(END);
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
		public AssignmentStmtContext assignmentStmt;
		public ExpressionContext expression;
		public IfStmtContext ifStmt;
		public WhileStmtContext whileStmt;
		public PrintStmtContext printStmt;
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(RusticodeParser.SEMICOLON, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				((SentenceContext)_localctx).assignmentStmt = assignmentStmt();
				setState(26);
				match(SEMICOLON);
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).assignmentStmt.node; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				((SentenceContext)_localctx).expression = expression(0);
				setState(30);
				match(SEMICOLON);
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).expression.node; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				((SentenceContext)_localctx).ifStmt = ifStmt();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).ifStmt.node; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				((SentenceContext)_localctx).whileStmt = whileStmt();
				 ((SentenceContext)_localctx).node =  ((SentenceContext)_localctx).whileStmt.node; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				((SentenceContext)_localctx).printStmt = printStmt();
				setState(40);
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
	public static class AssignmentStmtContext extends ParserRuleContext {
		public ASTNode node;
		public Token ID;
		public ExpressionContext expression;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignmentStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			((AssignmentStmtContext)_localctx).ID = match(ID);
			setState(46);
			match(ASSIGN);
			setState(47);
			((AssignmentStmtContext)_localctx).expression = expression(0);
			 ((AssignmentStmtContext)_localctx).node =  new Assignment((((AssignmentStmtContext)_localctx).ID!=null?((AssignmentStmtContext)_localctx).ID.getText():null), ((AssignmentStmtContext)_localctx).expression.node); 
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
		public ExpressionContext expression;
		public SentenceContext thenStmt;
		public SentenceContext elseStmt;
		public TerminalNode IF() { return getToken(RusticodeParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(RusticodeParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RusticodeParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(RusticodeParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(RusticodeParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(RusticodeParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(RusticodeParser.RBRACE, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStmt);

		    ArrayList<ASTNode> thenBody = new ArrayList<>();
		    ArrayList<ASTNode> elseBody = new ArrayList<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(IF);
			setState(51);
			match(LPAREN);
			setState(52);
			((IfStmtContext)_localctx).expression = expression(0);
			setState(53);
			match(RPAREN);
			setState(54);
			match(LBRACE);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1009778714L) != 0)) {
				{
				{
				setState(55);
				((IfStmtContext)_localctx).thenStmt = sentence();
				 thenBody.add(((IfStmtContext)_localctx).thenStmt.node); 
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(RBRACE);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(64);
				match(ELSE);
				setState(65);
				match(LBRACE);
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1009778714L) != 0)) {
					{
					{
					setState(66);
					((IfStmtContext)_localctx).elseStmt = sentence();
					 elseBody.add(((IfStmtContext)_localctx).elseStmt.node); 
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(74);
				match(RBRACE);
				}
			}

			 ((IfStmtContext)_localctx).node =  new If(((IfStmtContext)_localctx).expression.node, thenBody, elseBody); 
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
		public ExpressionContext expression;
		public SentenceContext bodyStmt;
		public TerminalNode WHILE() { return getToken(RusticodeParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(RusticodeParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RusticodeParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(RusticodeParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(RusticodeParser.RBRACE, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileStmt);

		    ArrayList<ASTNode> whileBody = new ArrayList<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(WHILE);
			setState(80);
			match(LPAREN);
			setState(81);
			((WhileStmtContext)_localctx).expression = expression(0);
			setState(82);
			match(RPAREN);
			setState(83);
			match(LBRACE);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1009778714L) != 0)) {
				{
				{
				setState(84);
				((WhileStmtContext)_localctx).bodyStmt = sentence();
				 whileBody.add(((WhileStmtContext)_localctx).bodyStmt.node); 
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(RBRACE);
			 ((WhileStmtContext)_localctx).node =  new While(((WhileStmtContext)_localctx).expression.node, whileBody); 
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
		public ExpressionContext expression;
		public TerminalNode PRINT() { return getToken(RusticodeParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(RusticodeParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RusticodeParser.RPAREN, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(PRINT);
			setState(96);
			match(LPAREN);
			setState(97);
			((PrintStmtContext)_localctx).expression = expression(0);
			setState(98);
			match(RPAREN);
			 ((PrintStmtContext)_localctx).node =  new Print(((PrintStmtContext)_localctx).expression.node); 
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
		public ExpressionContext e1;
		public Token op;
		public ExpressionContext expression;
		public InfoContext info;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(RusticodeParser.NOT, 0); }
		public InfoContext info() {
			return getRuleContext(InfoContext.class,0);
		}
		public TerminalNode AND() { return getToken(RusticodeParser.AND, 0); }
		public TerminalNode OR() { return getToken(RusticodeParser.OR, 0); }
		public TerminalNode MULT() { return getToken(RusticodeParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(RusticodeParser.DIV, 0); }
		public TerminalNode SUM() { return getToken(RusticodeParser.SUM, 0); }
		public TerminalNode RES() { return getToken(RusticodeParser.RES, 0); }
		public TerminalNode GT() { return getToken(RusticodeParser.GT, 0); }
		public TerminalNode LT() { return getToken(RusticodeParser.LT, 0); }
		public TerminalNode GTE() { return getToken(RusticodeParser.GTE, 0); }
		public TerminalNode LTE() { return getToken(RusticodeParser.LTE, 0); }
		public TerminalNode EQ() { return getToken(RusticodeParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(RusticodeParser.NEQ, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(102);
				((ExpressionContext)_localctx).op = match(NOT);
				setState(103);
				((ExpressionContext)_localctx).expression = expression(8);

				        ((ExpressionContext)_localctx).node =  new LogicalExpression((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).expression.node, null);
				    
				}
				break;
			case LPAREN:
			case NUMBER:
			case STRING:
			case BOOL:
			case ID:
				{
				setState(106);
				((ExpressionContext)_localctx).info = info();
				((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).info.node; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).e1.node;
						setState(113);
						((ExpressionContext)_localctx).op = match(AND);
						setState(114);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(8);

						                          ((ExpressionContext)_localctx).node =  new LogicalExpression((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), _localctx.node, ((ExpressionContext)_localctx).e2.node);
						                      
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(117);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).e1.node;
						setState(119);
						((ExpressionContext)_localctx).op = match(OR);
						setState(120);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(7);

						                          ((ExpressionContext)_localctx).node =  new LogicalExpression((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), _localctx.node, ((ExpressionContext)_localctx).e2.node);
						                     
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(123);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).e1.node;
						setState(125);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(126);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(6);

						                      ((ExpressionContext)_localctx).node =  new ArithmeticExpression((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), _localctx.node, ((ExpressionContext)_localctx).e2.node);
						                  
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(129);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).e1.node;
						setState(131);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUM || _la==RES) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(132);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(5);

						                      ((ExpressionContext)_localctx).node =  new ArithmeticExpression((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), _localctx.node, ((ExpressionContext)_localctx).e2.node);
						                  
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(135);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).e1.node;
						setState(137);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61440L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(138);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(4);

						                      ((ExpressionContext)_localctx).node =  new ComparativeExpression((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), _localctx.node, ((ExpressionContext)_localctx).e2.node);
						                  
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						((ExpressionContext)_localctx).node =  ((ExpressionContext)_localctx).e1.node;
						setState(143);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(144);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(3);

						                      ((ExpressionContext)_localctx).node =  new ComparativeExpression((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), _localctx.node, ((ExpressionContext)_localctx).e2.node);
						                  
						}
						break;
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class InfoContext extends ParserRuleContext {
		public ASTNode node;
		public ExpressionContext expression;
		public Token BOOL;
		public Token NUMBER;
		public Token ID;
		public Token STRING;
		public TerminalNode LPAREN() { return getToken(RusticodeParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(RusticodeParser.RPAREN, 0); }
		public TerminalNode BOOL() { return getToken(RusticodeParser.BOOL, 0); }
		public TerminalNode NUMBER() { return getToken(RusticodeParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(RusticodeParser.ID, 0); }
		public TerminalNode STRING() { return getToken(RusticodeParser.STRING, 0); }
		public InfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).enterInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RusticodeListener ) ((RusticodeListener)listener).exitInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RusticodeVisitor ) return ((RusticodeVisitor<? extends T>)visitor).visitInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfoContext info() throws RecognitionException {
		InfoContext _localctx = new InfoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_info);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(LPAREN);
				setState(153);
				((InfoContext)_localctx).expression = expression(0);
				((InfoContext)_localctx).node =  ((InfoContext)_localctx).expression.node; 
				setState(155);
				match(RPAREN);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				((InfoContext)_localctx).BOOL = match(BOOL);
				 ((InfoContext)_localctx).node =  new Constant(Boolean.parseBoolean((((InfoContext)_localctx).BOOL!=null?((InfoContext)_localctx).BOOL.getText():null))); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				((InfoContext)_localctx).NUMBER = match(NUMBER);
				 ((InfoContext)_localctx).node =  new Constant(Double.parseDouble((((InfoContext)_localctx).NUMBER!=null?((InfoContext)_localctx).NUMBER.getText():null))); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				((InfoContext)_localctx).ID = match(ID);
				 ((InfoContext)_localctx).node =  new Variable(String.valueOf((((InfoContext)_localctx).ID!=null?((InfoContext)_localctx).ID.getText():null))); 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				((InfoContext)_localctx).STRING = match(STRING);
				 ((InfoContext)_localctx).node =  new Constant(String.format("\"%s\"", (((InfoContext)_localctx).STRING!=null?((InfoContext)_localctx).STRING.getText():null))); 
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
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u00a8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\u0013\b\u0000\n\u0000\f\u0000\u0016"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001,\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003;\b\u0003\n\u0003\f\u0003>\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003F\b\u0003\n\u0003"+
		"\f\u0003I\t\u0003\u0001\u0003\u0003\u0003L\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004X\b\u0004\n\u0004\f\u0004[\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"n\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u0094\b\u0006\n\u0006\f\u0006\u0097\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00a6\b\u0007\u0001\u0007\u0000\u0001\f\b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0000\u0004\u0001\u0000\t\n\u0001\u0000\u0007"+
		"\b\u0001\u0000\f\u000f\u0001\u0000\u0010\u0011\u00b3\u0000\u0010\u0001"+
		"\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004-\u0001\u0000\u0000"+
		"\u0000\u00062\u0001\u0000\u0000\u0000\bO\u0001\u0000\u0000\u0000\n_\u0001"+
		"\u0000\u0000\u0000\fm\u0001\u0000\u0000\u0000\u000e\u00a5\u0001\u0000"+
		"\u0000\u0000\u0010\u0014\u0005\u0005\u0000\u0000\u0011\u0013\u0003\u0002"+
		"\u0001\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0013\u0016\u0001\u0000"+
		"\u0000\u0000\u0014\u0012\u0001\u0000\u0000\u0000\u0014\u0015\u0001\u0000"+
		"\u0000\u0000\u0015\u0017\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000"+
		"\u0000\u0000\u0017\u0018\u0005\u0006\u0000\u0000\u0018\u0001\u0001\u0000"+
		"\u0000\u0000\u0019\u001a\u0003\u0004\u0002\u0000\u001a\u001b\u0005\u0019"+
		"\u0000\u0000\u001b\u001c\u0006\u0001\uffff\uffff\u0000\u001c,\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0003\f\u0006\u0000\u001e\u001f\u0005\u0019\u0000"+
		"\u0000\u001f \u0006\u0001\uffff\uffff\u0000 ,\u0001\u0000\u0000\u0000"+
		"!\"\u0003\u0006\u0003\u0000\"#\u0006\u0001\uffff\uffff\u0000#,\u0001\u0000"+
		"\u0000\u0000$%\u0003\b\u0004\u0000%&\u0006\u0001\uffff\uffff\u0000&,\u0001"+
		"\u0000\u0000\u0000\'(\u0003\n\u0005\u0000()\u0005\u0019\u0000\u0000)*"+
		"\u0006\u0001\uffff\uffff\u0000*,\u0001\u0000\u0000\u0000+\u0019\u0001"+
		"\u0000\u0000\u0000+\u001d\u0001\u0000\u0000\u0000+!\u0001\u0000\u0000"+
		"\u0000+$\u0001\u0000\u0000\u0000+\'\u0001\u0000\u0000\u0000,\u0003\u0001"+
		"\u0000\u0000\u0000-.\u0005\u001d\u0000\u0000./\u0005\u000b\u0000\u0000"+
		"/0\u0003\f\u0006\u000001\u0006\u0002\uffff\uffff\u00001\u0005\u0001\u0000"+
		"\u0000\u000023\u0005\u0001\u0000\u000034\u0005\u0015\u0000\u000045\u0003"+
		"\f\u0006\u000056\u0005\u0016\u0000\u00006<\u0005\u0017\u0000\u000078\u0003"+
		"\u0002\u0001\u000089\u0006\u0003\uffff\uffff\u00009;\u0001\u0000\u0000"+
		"\u0000:7\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000"+
		"\u0000\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000?K\u0005\u0018\u0000\u0000@A\u0005\u0002\u0000\u0000"+
		"AG\u0005\u0017\u0000\u0000BC\u0003\u0002\u0001\u0000CD\u0006\u0003\uffff"+
		"\uffff\u0000DF\u0001\u0000\u0000\u0000EB\u0001\u0000\u0000\u0000FI\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JL\u0005\u0018\u0000"+
		"\u0000K@\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000MN\u0006\u0003\uffff\uffff\u0000N\u0007\u0001\u0000\u0000"+
		"\u0000OP\u0005\u0003\u0000\u0000PQ\u0005\u0015\u0000\u0000QR\u0003\f\u0006"+
		"\u0000RS\u0005\u0016\u0000\u0000SY\u0005\u0017\u0000\u0000TU\u0003\u0002"+
		"\u0001\u0000UV\u0006\u0004\uffff\uffff\u0000VX\u0001\u0000\u0000\u0000"+
		"WT\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000\\]\u0005\u0018\u0000\u0000]^\u0006\u0004\uffff\uffff\u0000"+
		"^\t\u0001\u0000\u0000\u0000_`\u0005\u0004\u0000\u0000`a\u0005\u0015\u0000"+
		"\u0000ab\u0003\f\u0006\u0000bc\u0005\u0016\u0000\u0000cd\u0006\u0005\uffff"+
		"\uffff\u0000d\u000b\u0001\u0000\u0000\u0000ef\u0006\u0006\uffff\uffff"+
		"\u0000fg\u0005\u0014\u0000\u0000gh\u0003\f\u0006\bhi\u0006\u0006\uffff"+
		"\uffff\u0000in\u0001\u0000\u0000\u0000jk\u0003\u000e\u0007\u0000kl\u0006"+
		"\u0006\uffff\uffff\u0000ln\u0001\u0000\u0000\u0000me\u0001\u0000\u0000"+
		"\u0000mj\u0001\u0000\u0000\u0000n\u0095\u0001\u0000\u0000\u0000op\n\u0007"+
		"\u0000\u0000pq\u0006\u0006\uffff\uffff\u0000qr\u0005\u0012\u0000\u0000"+
		"rs\u0003\f\u0006\bst\u0006\u0006\uffff\uffff\u0000t\u0094\u0001\u0000"+
		"\u0000\u0000uv\n\u0006\u0000\u0000vw\u0006\u0006\uffff\uffff\u0000wx\u0005"+
		"\u0013\u0000\u0000xy\u0003\f\u0006\u0007yz\u0006\u0006\uffff\uffff\u0000"+
		"z\u0094\u0001\u0000\u0000\u0000{|\n\u0005\u0000\u0000|}\u0006\u0006\uffff"+
		"\uffff\u0000}~\u0007\u0000\u0000\u0000~\u007f\u0003\f\u0006\u0006\u007f"+
		"\u0080\u0006\u0006\uffff\uffff\u0000\u0080\u0094\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\n\u0004\u0000\u0000\u0082\u0083\u0006\u0006\uffff\uffff\u0000"+
		"\u0083\u0084\u0007\u0001\u0000\u0000\u0084\u0085\u0003\f\u0006\u0005\u0085"+
		"\u0086\u0006\u0006\uffff\uffff\u0000\u0086\u0094\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\n\u0003\u0000\u0000\u0088\u0089\u0006\u0006\uffff\uffff\u0000"+
		"\u0089\u008a\u0007\u0002\u0000\u0000\u008a\u008b\u0003\f\u0006\u0004\u008b"+
		"\u008c\u0006\u0006\uffff\uffff\u0000\u008c\u0094\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\n\u0002\u0000\u0000\u008e\u008f\u0006\u0006\uffff\uffff\u0000"+
		"\u008f\u0090\u0007\u0003\u0000\u0000\u0090\u0091\u0003\f\u0006\u0003\u0091"+
		"\u0092\u0006\u0006\uffff\uffff\u0000\u0092\u0094\u0001\u0000\u0000\u0000"+
		"\u0093o\u0001\u0000\u0000\u0000\u0093u\u0001\u0000\u0000\u0000\u0093{"+
		"\u0001\u0000\u0000\u0000\u0093\u0081\u0001\u0000\u0000\u0000\u0093\u0087"+
		"\u0001\u0000\u0000\u0000\u0093\u008d\u0001\u0000\u0000\u0000\u0094\u0097"+
		"\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0001\u0000\u0000\u0000\u0096\r\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0005\u0015\u0000\u0000\u0099\u009a\u0003"+
		"\f\u0006\u0000\u009a\u009b\u0006\u0007\uffff\uffff\u0000\u009b\u009c\u0005"+
		"\u0016\u0000\u0000\u009c\u00a6\u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		"\u001c\u0000\u0000\u009e\u00a6\u0006\u0007\uffff\uffff\u0000\u009f\u00a0"+
		"\u0005\u001a\u0000\u0000\u00a0\u00a6\u0006\u0007\uffff\uffff\u0000\u00a1"+
		"\u00a2\u0005\u001d\u0000\u0000\u00a2\u00a6\u0006\u0007\uffff\uffff\u0000"+
		"\u00a3\u00a4\u0005\u001b\u0000\u0000\u00a4\u00a6\u0006\u0007\uffff\uffff"+
		"\u0000\u00a5\u0098\u0001\u0000\u0000\u0000\u00a5\u009d\u0001\u0000\u0000"+
		"\u0000\u00a5\u009f\u0001\u0000\u0000\u0000\u00a5\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u000f\u0001\u0000\u0000"+
		"\u0000\n\u0014+<GKYm\u0093\u0095\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

	@Override
	public void notifyErrorListeners(Token offendingToken, String msg, RecognitionException e) {
		String errorMessage = "Error de sintaxis en la línea " + offendingToken.getLine() + ": " + msg;
		System.err.println(errorMessage);

		try {
			throw new Exception(errorMessage);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}