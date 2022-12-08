// Generated from ./expr.g4 by ANTLR 4.9.2

package parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class exprParser extends Parser {
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
		T__52=53, STRING=54, USEDWORDS=55, INT=56, SYMBS=57, ID=58, WS=59;
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_typedecl = 2, RULE_fielddecl = 3, 
		RULE_vardecl = 4, RULE_funcdecl = 5, RULE_lvalue = 6, RULE_lvalues = 7, 
		RULE_subscript = 8, RULE_fieldexpr = 9, RULE_expr = 10, RULE_exprsolo = 11, 
		RULE_orexpr = 12, RULE_andexpr = 13, RULE_boolexpr = 14, RULE_minusexpr = 15, 
		RULE_addexpr = 16, RULE_divexpr = 17, RULE_multexpr = 18, RULE_expr_list = 19, 
		RULE_fieldcreate = 20, RULE_decl_list = 21, RULE_freturn = 22, RULE_prints = 23, 
		RULE_printi = 24, RULE_flush = 25, RULE_getchar = 26, RULE_ord = 27, RULE_chr = 28, 
		RULE_size = 29, RULE_substring = 30, RULE_concat = 31, RULE_not = 32, 
		RULE_exit = 33, RULE_type = 34, RULE_typefields = 35, RULE_typefield = 36, 
		RULE_typeid = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "decl", "typedecl", "fielddecl", "vardecl", "funcdecl", "lvalue", 
			"lvalues", "subscript", "fieldexpr", "expr", "exprsolo", "orexpr", "andexpr", 
			"boolexpr", "minusexpr", "addexpr", "divexpr", "multexpr", "expr_list", 
			"fieldcreate", "decl_list", "freturn", "prints", "printi", "flush", "getchar", 
			"ord", "chr", "size", "substring", "concat", "not", "exit", "type", "typefields", 
			"typefield", "typeid"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'type'", "'='", "':'", "','", "'var'", "':='", "'function'", "'('", 
			"')'", "'['", "']'", "'.'", "'-'", "'of'", "'{'", "'}'", "'if'", "'then'", 
			"'else'", "'while'", "'do'", "'for'", "'to'", "'break'", "'let'", "'in'", 
			"'end'", "'|'", "'&'", "'<>'", "'<='", "'>='", "'<'", "'>'", "'+'", "'/'", 
			"'*'", "';'", "'return'", "'print'", "'printi'", "'flush'", "'getchar'", 
			"'ord'", "'chr'", "'size'", "'substring'", "'concat'", "'not'", "'exit'", 
			"'array'", "'int'", "'string'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "STRING", "USEDWORDS", "INT", "SYMBS", 
			"ID", "WS"
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
	public String getGrammarFileName() { return "expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public exprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ExprsoloContext first;
		public TerminalNode EOF() { return getToken(exprParser.EOF, 0); }
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			((ProgramContext)_localctx).first = exprsolo();
			setState(77);
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

	public static class DeclContext extends ParserRuleContext {
		public TypedeclContext typedecl() {
			return getRuleContext(TypedeclContext.class,0);
		}
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public FuncdeclContext funcdecl() {
			return getRuleContext(FuncdeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				typedecl();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				vardecl();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				funcdecl();
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

	public static class TypedeclContext extends ParserRuleContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypedeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitTypedecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedeclContext typedecl() throws RecognitionException {
		TypedeclContext _localctx = new TypedeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typedecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__0);
			setState(85);
			typeid();
			setState(86);
			match(T__1);
			setState(87);
			type();
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

	public static class FielddeclContext extends ParserRuleContext {
		public Token ID;
		public List<Token> fieldid = new ArrayList<Token>();
		public TypeidContext typeid;
		public List<TypeidContext> fieldtype = new ArrayList<TypeidContext>();
		public List<TerminalNode> ID() { return getTokens(exprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(exprParser.ID, i);
		}
		public List<TypeidContext> typeid() {
			return getRuleContexts(TypeidContext.class);
		}
		public TypeidContext typeid(int i) {
			return getRuleContext(TypeidContext.class,i);
		}
		public FielddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fielddecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitFielddecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FielddeclContext fielddecl() throws RecognitionException {
		FielddeclContext _localctx = new FielddeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fielddecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((FielddeclContext)_localctx).ID = match(ID);
			((FielddeclContext)_localctx).fieldid.add(((FielddeclContext)_localctx).ID);
			setState(90);
			match(T__2);
			setState(91);
			((FielddeclContext)_localctx).typeid = typeid();
			((FielddeclContext)_localctx).fieldtype.add(((FielddeclContext)_localctx).typeid);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(92);
				match(T__3);
				setState(93);
				((FielddeclContext)_localctx).ID = match(ID);
				((FielddeclContext)_localctx).fieldid.add(((FielddeclContext)_localctx).ID);
				setState(94);
				match(T__2);
				setState(95);
				((FielddeclContext)_localctx).typeid = typeid();
				((FielddeclContext)_localctx).fieldtype.add(((FielddeclContext)_localctx).typeid);
				}
				}
				setState(100);
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

	public static class VardeclContext extends ParserRuleContext {
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
	 
		public VardeclContext() { }
		public void copyFrom(VardeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclContext extends VardeclContext {
		public TypeidContext vartype;
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public VarDeclContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardecl);
		int _la;
		try {
			_localctx = new VarDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__4);
			setState(102);
			match(ID);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(103);
				match(T__2);
				setState(104);
				((VarDeclContext)_localctx).vartype = typeid();
				}
			}

			setState(107);
			match(T__5);
			setState(108);
			exprsolo();
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

	public static class FuncdeclContext extends ParserRuleContext {
		public FielddeclContext funcfield;
		public TypeidContext functype;
		public ExprsoloContext funcbody;
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
		}
		public FielddeclContext fielddecl() {
			return getRuleContext(FielddeclContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public FuncdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitFuncdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdeclContext funcdecl() throws RecognitionException {
		FuncdeclContext _localctx = new FuncdeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__6);
			setState(111);
			match(ID);
			setState(112);
			match(T__7);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(113);
				((FuncdeclContext)_localctx).funcfield = fielddecl();
				}
			}

			setState(116);
			match(T__8);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(117);
				match(T__2);
				setState(118);
				((FuncdeclContext)_localctx).functype = typeid();
				}
			}

			setState(121);
			match(T__1);
			setState(122);
			((FuncdeclContext)_localctx).funcbody = exprsolo();
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

	public static class LvalueContext extends ParserRuleContext {
		public LvaluesContext lvalues;
		public List<LvaluesContext> lvalsub = new ArrayList<LvaluesContext>();
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public List<LvaluesContext> lvalues() {
			return getRuleContexts(LvaluesContext.class);
		}
		public LvaluesContext lvalues(int i) {
			return getRuleContext(LvaluesContext.class,i);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lvalue);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ID);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(125);
					((LvalueContext)_localctx).lvalues = lvalues();
					((LvalueContext)_localctx).lvalsub.add(((LvalueContext)_localctx).lvalues);
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class LvaluesContext extends ParserRuleContext {
		public LvaluesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalues; }
	 
		public LvaluesContext() { }
		public void copyFrom(LvaluesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubscriptFContext extends LvaluesContext {
		public SubscriptContext subscript() {
			return getRuleContext(SubscriptContext.class,0);
		}
		public SubscriptFContext(LvaluesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitSubscriptF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldexprFContext extends LvaluesContext {
		public FieldexprContext fieldexpr() {
			return getRuleContext(FieldexprContext.class,0);
		}
		public FieldexprFContext(LvaluesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitFieldexprF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvaluesContext lvalues() throws RecognitionException {
		LvaluesContext _localctx = new LvaluesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lvalues);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new SubscriptFContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				subscript();
				}
				break;
			case T__11:
				_localctx = new FieldexprFContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				fieldexpr();
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

	public static class SubscriptContext extends ParserRuleContext {
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
		}
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_subscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__9);
			setState(136);
			exprsolo();
			setState(137);
			match(T__10);
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

	public static class FieldexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public FieldexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitFieldexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldexprContext fieldexpr() throws RecognitionException {
		FieldexprContext _localctx = new FieldexprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fieldexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__11);
			setState(140);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValContext extends ExprContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ValContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListDeclContext extends ExprContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public List<ExprsoloContext> exprsolo() {
			return getRuleContexts(ExprsoloContext.class);
		}
		public ExprsoloContext exprsolo(int i) {
			return getRuleContext(ExprsoloContext.class,i);
		}
		public ListDeclContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitListDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrdFContext extends ExprContext {
		public OrdContext ord() {
			return getRuleContext(OrdContext.class,0);
		}
		public OrdFContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitOrdF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetCharFContext extends ExprContext {
		public GetcharContext getchar() {
			return getRuleContext(GetcharContext.class,0);
		}
		public GetCharFContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitGetCharF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnFContext extends ExprContext {
		public FreturnContext freturn() {
			return getRuleContext(FreturnContext.class,0);
		}
		public ReturnFContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitReturnF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SizeFContext extends ExprContext {
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public SizeFContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitSizeF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakContext extends ExprContext {
		public BreakContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExitFContext extends ExprContext {
		public ExitContext exit() {
			return getRuleContext(ExitContext.class,0);
		}
		public ExitFContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitExitF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisContext extends ExprContext {
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringFContext extends ExprContext {
		public SubstringContext substring() {
			return getRuleContext(SubstringContext.class,0);
		}
		public SubstringFContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitSubstringF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotFContext extends ExprContext {
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public NotFContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitNotF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListContext extends ExprContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public FieldcreateContext fieldcreate() {
			return getRuleContext(FieldcreateContext.class,0);
		}
		public ListContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends ExprContext {
		public Expr_listContext exprlist;
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public FunctionCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusAffectorContext extends ExprContext {
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
		}
		public MinusAffectorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitMinusAffector(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends ExprContext {
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public List<ExprsoloContext> exprsolo() {
			return getRuleContexts(ExprsoloContext.class);
		}
		public ExprsoloContext exprsolo(int i) {
			return getRuleContext(ExprsoloContext.class,i);
		}
		public ForContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends ExprContext {
		public List<ExprsoloContext> exprsolo() {
			return getRuleContexts(ExprsoloContext.class);
		}
		public ExprsoloContext exprsolo(int i) {
			return getRuleContext(ExprsoloContext.class,i);
		}
		public WhileContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfThenContext extends ExprContext {
		public List<ExprsoloContext> exprsolo() {
			return getRuleContexts(ExprsoloContext.class);
		}
		public ExprsoloContext exprsolo(int i) {
			return getRuleContext(ExprsoloContext.class,i);
		}
		public IfThenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitIfThen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerContext extends ExprContext {
		public TerminalNode INT() { return getToken(exprParser.INT, 0); }
		public IntegerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharFContext extends ExprContext {
		public ChrContext chr() {
			return getRuleContext(ChrContext.class,0);
		}
		public CharFContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitCharF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStrContext extends ExprContext {
		public PrintsContext prints() {
			return getRuleContext(PrintsContext.class,0);
		}
		public PrintStrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitPrintStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatenateFContext extends ExprContext {
		public ConcatContext concat() {
			return getRuleContext(ConcatContext.class,0);
		}
		public ConcatenateFContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitConcatenateF(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintIntContext extends ExprContext {
		public PrintiContext printi() {
			return getRuleContext(PrintiContext.class,0);
		}
		public PrintIntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitPrintInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetContext extends ExprContext {
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public LetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfThenElseContext extends ExprContext {
		public List<ExprsoloContext> exprsolo() {
			return getRuleContexts(ExprsoloContext.class);
		}
		public ExprsoloContext exprsolo(int i) {
			return getRuleContext(ExprsoloContext.class,i);
		}
		public IfThenElseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitIfThenElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringDeclContext extends ExprContext {
		public TerminalNode STRING() { return getToken(exprParser.STRING, 0); }
		public StringDeclContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitStringDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FlushFContext extends ExprContext {
		public FlushContext flush() {
			return getRuleContext(FlushContext.class,0);
		}
		public FlushFContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitFlushF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(INT);
				}
				break;
			case 2:
				_localctx = new StringDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new ParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(T__7);
				setState(145);
				expr_list();
				setState(146);
				match(T__8);
				}
				break;
			case 4:
				_localctx = new MinusAffectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				match(T__12);
				setState(149);
				exprsolo();
				}
				break;
			case 5:
				_localctx = new ValContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				lvalue();
				}
				break;
			case 6:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				match(ID);
				setState(152);
				match(T__7);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__12) | (1L << T__16) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << STRING) | (1L << INT) | (1L << ID))) != 0)) {
					{
					setState(153);
					((FunctionCallContext)_localctx).exprlist = expr_list();
					}
				}

				setState(156);
				match(T__8);
				}
				break;
			case 7:
				_localctx = new ListDeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(157);
				typeid();
				setState(158);
				match(T__9);
				setState(159);
				exprsolo();
				setState(160);
				match(T__10);
				setState(161);
				match(T__13);
				setState(162);
				exprsolo();
				}
				break;
			case 8:
				_localctx = new ListContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(164);
				typeid();
				setState(165);
				match(T__14);
				setState(166);
				fieldcreate();
				setState(167);
				match(T__15);
				}
				break;
			case 9:
				_localctx = new IfThenContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(169);
				match(T__16);
				setState(170);
				exprsolo();
				setState(171);
				match(T__17);
				setState(172);
				exprsolo();
				}
				break;
			case 10:
				_localctx = new IfThenElseContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(174);
				match(T__16);
				setState(175);
				exprsolo();
				setState(176);
				match(T__17);
				setState(177);
				exprsolo();
				setState(178);
				match(T__18);
				setState(179);
				exprsolo();
				}
				break;
			case 11:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(181);
				match(T__19);
				setState(182);
				exprsolo();
				setState(183);
				match(T__20);
				setState(184);
				exprsolo();
				}
				break;
			case 12:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(186);
				match(T__21);
				setState(187);
				match(ID);
				setState(188);
				match(T__5);
				setState(189);
				exprsolo();
				setState(190);
				match(T__22);
				setState(191);
				exprsolo();
				setState(192);
				match(T__20);
				setState(193);
				exprsolo();
				}
				break;
			case 13:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(195);
				match(T__23);
				}
				break;
			case 14:
				_localctx = new LetContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(196);
				match(T__24);
				setState(197);
				decl_list();
				setState(198);
				match(T__25);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__12) | (1L << T__16) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << STRING) | (1L << INT) | (1L << ID))) != 0)) {
					{
					setState(199);
					expr_list();
					}
				}

				setState(202);
				match(T__26);
				}
				break;
			case 15:
				_localctx = new PrintStrContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(204);
				prints();
				}
				break;
			case 16:
				_localctx = new ReturnFContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(205);
				freturn();
				}
				break;
			case 17:
				_localctx = new PrintIntContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(206);
				printi();
				}
				break;
			case 18:
				_localctx = new FlushFContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(207);
				flush();
				}
				break;
			case 19:
				_localctx = new GetCharFContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(208);
				getchar();
				}
				break;
			case 20:
				_localctx = new OrdFContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(209);
				ord();
				}
				break;
			case 21:
				_localctx = new CharFContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(210);
				chr();
				}
				break;
			case 22:
				_localctx = new SizeFContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(211);
				size();
				}
				break;
			case 23:
				_localctx = new SubstringFContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(212);
				substring();
				}
				break;
			case 24:
				_localctx = new ConcatenateFContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(213);
				concat();
				}
				break;
			case 25:
				_localctx = new NotFContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(214);
				not();
				}
				break;
			case 26:
				_localctx = new ExitFContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(215);
				exit();
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

	public static class ExprsoloContext extends ParserRuleContext {
		public ExprsoloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprsolo; }
	 
		public ExprsoloContext() { }
		public void copyFrom(ExprsoloContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AffectContext extends ExprsoloContext {
		public OrexprContext affexpr;
		public List<OrexprContext> orexpr() {
			return getRuleContexts(OrexprContext.class);
		}
		public OrexprContext orexpr(int i) {
			return getRuleContext(OrexprContext.class,i);
		}
		public AffectContext(ExprsoloContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitAffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprsoloContext exprsolo() throws RecognitionException {
		ExprsoloContext _localctx = new ExprsoloContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exprsolo);
		try {
			_localctx = new AffectContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			orexpr();
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(219);
				match(T__5);
				setState(220);
				((AffectContext)_localctx).affexpr = orexpr();
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

	public static class OrexprContext extends ParserRuleContext {
		public OrexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orexpr; }
	 
		public OrexprContext() { }
		public void copyFrom(OrexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrContext extends OrexprContext {
		public AndexprContext andexpr;
		public List<AndexprContext> expror = new ArrayList<AndexprContext>();
		public List<AndexprContext> andexpr() {
			return getRuleContexts(AndexprContext.class);
		}
		public AndexprContext andexpr(int i) {
			return getRuleContext(AndexprContext.class,i);
		}
		public OrContext(OrexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrexprContext orexpr() throws RecognitionException {
		OrexprContext _localctx = new OrexprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_orexpr);
		try {
			int _alt;
			_localctx = new OrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			andexpr();
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(224);
					match(T__27);
					setState(225);
					((OrContext)_localctx).andexpr = andexpr();
					((OrContext)_localctx).expror.add(((OrContext)_localctx).andexpr);
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class AndexprContext extends ParserRuleContext {
		public AndexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpr; }
	 
		public AndexprContext() { }
		public void copyFrom(AndexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndContext extends AndexprContext {
		public BoolexprContext boolexpr;
		public List<BoolexprContext> exprand = new ArrayList<BoolexprContext>();
		public List<BoolexprContext> boolexpr() {
			return getRuleContexts(BoolexprContext.class);
		}
		public BoolexprContext boolexpr(int i) {
			return getRuleContext(BoolexprContext.class,i);
		}
		public AndContext(AndexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndexprContext andexpr() throws RecognitionException {
		AndexprContext _localctx = new AndexprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_andexpr);
		try {
			int _alt;
			_localctx = new AndContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			boolexpr();
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(232);
					match(T__28);
					setState(233);
					((AndContext)_localctx).boolexpr = boolexpr();
					((AndContext)_localctx).exprand.add(((AndContext)_localctx).boolexpr);
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class BoolexprContext extends ParserRuleContext {
		public Token op;
		public MinusexprContext exprbool;
		public List<MinusexprContext> minusexpr() {
			return getRuleContexts(MinusexprContext.class);
		}
		public MinusexprContext minusexpr(int i) {
			return getRuleContext(MinusexprContext.class,i);
		}
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitBoolexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		BoolexprContext _localctx = new BoolexprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boolexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			minusexpr();
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(240);
				((BoolexprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
					((BoolexprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(241);
				((BoolexprContext)_localctx).exprbool = minusexpr();
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

	public static class MinusexprContext extends ParserRuleContext {
		public MinusexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusexpr; }
	 
		public MinusexprContext() { }
		public void copyFrom(MinusexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MoinsContext extends MinusexprContext {
		public AddexprContext addexpr;
		public List<AddexprContext> exprminus = new ArrayList<AddexprContext>();
		public List<AddexprContext> addexpr() {
			return getRuleContexts(AddexprContext.class);
		}
		public AddexprContext addexpr(int i) {
			return getRuleContext(AddexprContext.class,i);
		}
		public MoinsContext(MinusexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitMoins(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusexprContext minusexpr() throws RecognitionException {
		MinusexprContext _localctx = new MinusexprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_minusexpr);
		try {
			int _alt;
			_localctx = new MoinsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			addexpr();
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(245);
					match(T__12);
					setState(246);
					((MoinsContext)_localctx).addexpr = addexpr();
					((MoinsContext)_localctx).exprminus.add(((MoinsContext)_localctx).addexpr);
					}
					} 
				}
				setState(251);
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
			exitRule();
		}
		return _localctx;
	}

	public static class AddexprContext extends ParserRuleContext {
		public AddexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexpr; }
	 
		public AddexprContext() { }
		public void copyFrom(AddexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PlusContext extends AddexprContext {
		public DivexprContext divexpr;
		public List<DivexprContext> exprplus = new ArrayList<DivexprContext>();
		public List<DivexprContext> divexpr() {
			return getRuleContexts(DivexprContext.class);
		}
		public DivexprContext divexpr(int i) {
			return getRuleContext(DivexprContext.class,i);
		}
		public PlusContext(AddexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddexprContext addexpr() throws RecognitionException {
		AddexprContext _localctx = new AddexprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_addexpr);
		try {
			int _alt;
			_localctx = new PlusContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			divexpr();
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(253);
					match(T__34);
					setState(254);
					((PlusContext)_localctx).divexpr = divexpr();
					((PlusContext)_localctx).exprplus.add(((PlusContext)_localctx).divexpr);
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class DivexprContext extends ParserRuleContext {
		public DivexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divexpr; }
	 
		public DivexprContext() { }
		public void copyFrom(DivexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends DivexprContext {
		public MultexprContext multexpr;
		public List<MultexprContext> exprdiv = new ArrayList<MultexprContext>();
		public List<MultexprContext> multexpr() {
			return getRuleContexts(MultexprContext.class);
		}
		public MultexprContext multexpr(int i) {
			return getRuleContext(MultexprContext.class,i);
		}
		public DivContext(DivexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivexprContext divexpr() throws RecognitionException {
		DivexprContext _localctx = new DivexprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_divexpr);
		try {
			int _alt;
			_localctx = new DivContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			multexpr();
			setState(265);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(261);
					match(T__35);
					setState(262);
					((DivContext)_localctx).multexpr = multexpr();
					((DivContext)_localctx).exprdiv.add(((DivContext)_localctx).multexpr);
					}
					} 
				}
				setState(267);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class MultexprContext extends ParserRuleContext {
		public MultexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multexpr; }
	 
		public MultexprContext() { }
		public void copyFrom(MultexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultContext extends MultexprContext {
		public ExprContext exprmult;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultContext(MultexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultexprContext multexpr() throws RecognitionException {
		MultexprContext _localctx = new MultexprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multexpr);
		try {
			_localctx = new MultContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			expr();
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(269);
				match(T__36);
				setState(270);
				((MultContext)_localctx).exprmult = expr();
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

	public static class Expr_listContext extends ParserRuleContext {
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
	 
		public Expr_listContext() { }
		public void copyFrom(Expr_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprListContext extends Expr_listContext {
		public ExprsoloContext exprsolo;
		public List<ExprsoloContext> exprlist = new ArrayList<ExprsoloContext>();
		public Token sep;
		public List<ExprsoloContext> exprsolo() {
			return getRuleContexts(ExprsoloContext.class);
		}
		public ExprsoloContext exprsolo(int i) {
			return getRuleContext(ExprsoloContext.class,i);
		}
		public ExprListContext(Expr_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr_list);
		int _la;
		try {
			_localctx = new ExprListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			((ExprListContext)_localctx).exprsolo = exprsolo();
			((ExprListContext)_localctx).exprlist.add(((ExprListContext)_localctx).exprsolo);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3 || _la==T__37) {
				{
				{
				setState(274);
				((ExprListContext)_localctx).sep = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==T__37) ) {
					((ExprListContext)_localctx).sep = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(275);
				((ExprListContext)_localctx).exprsolo = exprsolo();
				((ExprListContext)_localctx).exprlist.add(((ExprListContext)_localctx).exprsolo);
				}
				}
				setState(280);
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

	public static class FieldcreateContext extends ParserRuleContext {
		public FieldcreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldcreate; }
	 
		public FieldcreateContext() { }
		public void copyFrom(FieldcreateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Field_CreateContext extends FieldcreateContext {
		public Token ID;
		public List<Token> fieldid = new ArrayList<Token>();
		public ExprsoloContext exprsolo;
		public List<ExprsoloContext> fieldex = new ArrayList<ExprsoloContext>();
		public List<TerminalNode> ID() { return getTokens(exprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(exprParser.ID, i);
		}
		public List<ExprsoloContext> exprsolo() {
			return getRuleContexts(ExprsoloContext.class);
		}
		public ExprsoloContext exprsolo(int i) {
			return getRuleContext(ExprsoloContext.class,i);
		}
		public Field_CreateContext(FieldcreateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitField_Create(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldcreateContext fieldcreate() throws RecognitionException {
		FieldcreateContext _localctx = new FieldcreateContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fieldcreate);
		int _la;
		try {
			_localctx = new Field_CreateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			((Field_CreateContext)_localctx).ID = match(ID);
			((Field_CreateContext)_localctx).fieldid.add(((Field_CreateContext)_localctx).ID);
			setState(282);
			match(T__1);
			setState(283);
			((Field_CreateContext)_localctx).exprsolo = exprsolo();
			((Field_CreateContext)_localctx).fieldex.add(((Field_CreateContext)_localctx).exprsolo);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(284);
				match(T__11);
				setState(285);
				((Field_CreateContext)_localctx).ID = match(ID);
				((Field_CreateContext)_localctx).fieldid.add(((Field_CreateContext)_localctx).ID);
				setState(286);
				match(T__1);
				setState(287);
				((Field_CreateContext)_localctx).exprsolo = exprsolo();
				((Field_CreateContext)_localctx).fieldex.add(((Field_CreateContext)_localctx).exprsolo);
				}
				}
				setState(292);
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

	public static class Decl_listContext extends ParserRuleContext {
		public Decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_list; }
	 
		public Decl_listContext() { }
		public void copyFrom(Decl_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclListContext extends Decl_listContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DeclListContext(Decl_listContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_listContext decl_list() throws RecognitionException {
		Decl_listContext _localctx = new Decl_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_decl_list);
		int _la;
		try {
			_localctx = new DeclListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(294); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(293);
				decl();
				}
				}
				setState(296); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__6))) != 0) );
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

	public static class FreturnContext extends ParserRuleContext {
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public FreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freturn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitFreturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FreturnContext freturn() throws RecognitionException {
		FreturnContext _localctx = new FreturnContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_freturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__38);
			setState(299);
			match(T__7);
			setState(300);
			expr_list();
			setState(301);
			match(T__8);
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

	public static class PrintsContext extends ParserRuleContext {
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
		}
		public PrintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prints; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitPrints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintsContext prints() throws RecognitionException {
		PrintsContext _localctx = new PrintsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_prints);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__39);
			setState(304);
			match(T__7);
			{
			setState(305);
			exprsolo();
			}
			setState(306);
			match(T__8);
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

	public static class PrintiContext extends ParserRuleContext {
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
		}
		public PrintiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printi; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitPrinti(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintiContext printi() throws RecognitionException {
		PrintiContext _localctx = new PrintiContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_printi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(T__40);
			setState(309);
			match(T__7);
			{
			setState(310);
			exprsolo();
			}
			setState(311);
			match(T__8);
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

	public static class FlushContext extends ParserRuleContext {
		public FlushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flush; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitFlush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlushContext flush() throws RecognitionException {
		FlushContext _localctx = new FlushContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_flush);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__41);
			setState(314);
			match(T__7);
			setState(315);
			match(T__8);
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

	public static class GetcharContext extends ParserRuleContext {
		public GetcharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getchar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitGetchar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetcharContext getchar() throws RecognitionException {
		GetcharContext _localctx = new GetcharContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_getchar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__42);
			setState(318);
			match(T__7);
			setState(319);
			match(T__8);
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

	public static class OrdContext extends ParserRuleContext {
		public Token ordel;
		public Token oerdel;
		public TerminalNode STRING() { return getToken(exprParser.STRING, 0); }
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public OrdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ord; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitOrd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdContext ord() throws RecognitionException {
		OrdContext _localctx = new OrdContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__43);
			setState(322);
			match(T__7);
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(323);
				((OrdContext)_localctx).ordel = match(STRING);
				}
				break;
			case ID:
				{
				setState(324);
				((OrdContext)_localctx).oerdel = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(327);
			match(T__8);
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

	public static class ChrContext extends ParserRuleContext {
		public Token chrel;
		public TerminalNode INT() { return getToken(exprParser.INT, 0); }
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public ChrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitChr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChrContext chr() throws RecognitionException {
		ChrContext _localctx = new ChrContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_chr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(T__44);
			setState(330);
			match(T__7);
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(331);
				((ChrContext)_localctx).chrel = match(INT);
				}
				break;
			case ID:
				{
				setState(332);
				((ChrContext)_localctx).chrel = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(335);
			match(T__8);
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

	public static class SizeContext extends ParserRuleContext {
		public Token sizeel;
		public TerminalNode STRING() { return getToken(exprParser.STRING, 0); }
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__45);
			setState(338);
			match(T__7);
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(339);
				((SizeContext)_localctx).sizeel = match(STRING);
				}
				break;
			case ID:
				{
				setState(340);
				((SizeContext)_localctx).sizeel = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(343);
			match(T__8);
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

	public static class SubstringContext extends ParserRuleContext {
		public Token sstrel;
		public Token sstrind;
		public Token sstrlen;
		public List<TerminalNode> ID() { return getTokens(exprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(exprParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(exprParser.STRING, 0); }
		public List<TerminalNode> INT() { return getTokens(exprParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(exprParser.INT, i);
		}
		public SubstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substring; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubstringContext substring() throws RecognitionException {
		SubstringContext _localctx = new SubstringContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_substring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(T__46);
			setState(346);
			match(T__7);
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(347);
				((SubstringContext)_localctx).sstrel = match(STRING);
				}
				break;
			case ID:
				{
				setState(348);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(351);
			match(T__3);
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(352);
				((SubstringContext)_localctx).sstrind = match(INT);
				}
				break;
			case ID:
				{
				setState(353);
				((SubstringContext)_localctx).sstrind = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(356);
			match(T__3);
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(357);
				((SubstringContext)_localctx).sstrlen = match(INT);
				}
				break;
			case ID:
				{
				setState(358);
				((SubstringContext)_localctx).sstrlen = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(361);
			match(T__8);
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

	public static class ConcatContext extends ParserRuleContext {
		public Token catel1;
		public Token catel2;
		public List<TerminalNode> STRING() { return getTokens(exprParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(exprParser.STRING, i);
		}
		public List<TerminalNode> ID() { return getTokens(exprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(exprParser.ID, i);
		}
		public ConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitConcat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatContext concat() throws RecognitionException {
		ConcatContext _localctx = new ConcatContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_concat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(T__47);
			setState(364);
			match(T__7);
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(365);
				((ConcatContext)_localctx).catel1 = match(STRING);
				}
				break;
			case ID:
				{
				setState(366);
				((ConcatContext)_localctx).catel1 = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(369);
			match(T__3);
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(370);
				((ConcatContext)_localctx).catel2 = match(STRING);
				}
				break;
			case ID:
				{
				setState(371);
				((ConcatContext)_localctx).catel2 = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(374);
			match(T__8);
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

	public static class NotContext extends ParserRuleContext {
		public Token notel;
		public TerminalNode INT() { return getToken(exprParser.INT, 0); }
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(T__48);
			setState(377);
			match(T__7);
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(378);
				((NotContext)_localctx).notel = match(INT);
				}
				break;
			case ID:
				{
				setState(379);
				((NotContext)_localctx).notel = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(382);
			match(T__8);
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

	public static class ExitContext extends ParserRuleContext {
		public Token exitel;
		public TerminalNode INT() { return getToken(exprParser.INT, 0); }
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public ExitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitExit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitContext exit() throws RecognitionException {
		ExitContext _localctx = new ExitContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(T__49);
			setState(385);
			match(T__7);
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(386);
				((ExitContext)_localctx).exitel = match(INT);
				}
				break;
			case ID:
				{
				setState(387);
				((ExitContext)_localctx).exitel = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(390);
			match(T__8);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TyfieldsContext extends TypeContext {
		public TypefieldsContext tyfield;
		public TypefieldsContext typefields() {
			return getRuleContext(TypefieldsContext.class,0);
		}
		public TyfieldsContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitTyfields(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclArrayOfTyfieldsContext extends TypeContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public DeclArrayOfTyfieldsContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitDeclArrayOfTyfields(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeIdFContext extends TypeContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypeIdFContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitTypeIdF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_type);
		int _la;
		try {
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__51:
			case T__52:
			case ID:
				_localctx = new TypeIdFContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				typeid();
				}
				break;
			case T__14:
				_localctx = new TyfieldsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(T__14);
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(394);
					((TyfieldsContext)_localctx).tyfield = typefields();
					}
				}

				setState(397);
				match(T__15);
				}
				break;
			case T__50:
				_localctx = new DeclArrayOfTyfieldsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
				match(T__50);
				setState(399);
				match(T__13);
				setState(400);
				typeid();
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

	public static class TypefieldsContext extends ParserRuleContext {
		public TypefieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typefields; }
	 
		public TypefieldsContext() { }
		public void copyFrom(TypefieldsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Type_FieldsContext extends TypefieldsContext {
		public TypefieldContext typefield;
		public List<TypefieldContext> tyfield = new ArrayList<TypefieldContext>();
		public List<TypefieldContext> typefield() {
			return getRuleContexts(TypefieldContext.class);
		}
		public TypefieldContext typefield(int i) {
			return getRuleContext(TypefieldContext.class,i);
		}
		public Type_FieldsContext(TypefieldsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitType_Fields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypefieldsContext typefields() throws RecognitionException {
		TypefieldsContext _localctx = new TypefieldsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_typefields);
		int _la;
		try {
			_localctx = new Type_FieldsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			((Type_FieldsContext)_localctx).typefield = typefield();
			((Type_FieldsContext)_localctx).tyfield.add(((Type_FieldsContext)_localctx).typefield);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(404);
				match(T__3);
				setState(405);
				((Type_FieldsContext)_localctx).typefield = typefield();
				((Type_FieldsContext)_localctx).tyfield.add(((Type_FieldsContext)_localctx).typefield);
				}
				}
				setState(410);
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

	public static class TypefieldContext extends ParserRuleContext {
		public TypefieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typefield; }
	 
		public TypefieldContext() { }
		public void copyFrom(TypefieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Type_FieldContext extends TypefieldContext {
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public Type_FieldContext(TypefieldContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitType_Field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypefieldContext typefield() throws RecognitionException {
		TypefieldContext _localctx = new TypefieldContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typefield);
		try {
			_localctx = new Type_FieldContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(ID);
			setState(412);
			match(T__2);
			setState(413);
			typeid();
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

	public static class TypeidContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public TypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeid; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitTypeid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeidContext typeid() throws RecognitionException {
		TypeidContext _localctx = new TypeidContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__51) | (1L << T__52) | (1L << ID))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u01a4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\3\3\3\3\3\5"+
		"\3U\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5c\n\5\f\5\16"+
		"\5f\13\5\3\6\3\6\3\6\3\6\5\6l\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7u\n\7"+
		"\3\7\3\7\3\7\5\7z\n\7\3\7\3\7\3\7\3\b\3\b\7\b\u0081\n\b\f\b\16\b\u0084"+
		"\13\b\3\t\3\t\5\t\u0088\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009d\n\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00cb\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00db\n\f\3\r\3\r\3\r\5\r\u00e0\n\r\3\16\3\16\3\16"+
		"\7\16\u00e5\n\16\f\16\16\16\u00e8\13\16\3\17\3\17\3\17\7\17\u00ed\n\17"+
		"\f\17\16\17\u00f0\13\17\3\20\3\20\3\20\5\20\u00f5\n\20\3\21\3\21\3\21"+
		"\7\21\u00fa\n\21\f\21\16\21\u00fd\13\21\3\22\3\22\3\22\7\22\u0102\n\22"+
		"\f\22\16\22\u0105\13\22\3\23\3\23\3\23\7\23\u010a\n\23\f\23\16\23\u010d"+
		"\13\23\3\24\3\24\3\24\5\24\u0112\n\24\3\25\3\25\3\25\7\25\u0117\n\25\f"+
		"\25\16\25\u011a\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0123\n"+
		"\26\f\26\16\26\u0126\13\26\3\27\6\27\u0129\n\27\r\27\16\27\u012a\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u0148"+
		"\n\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0150\n\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\5\37\u0158\n\37\3\37\3\37\3 \3 \3 \3 \5 \u0160\n \3 \3 \3 "+
		"\5 \u0165\n \3 \3 \3 \5 \u016a\n \3 \3 \3!\3!\3!\3!\5!\u0172\n!\3!\3!"+
		"\3!\5!\u0177\n!\3!\3!\3\"\3\"\3\"\3\"\5\"\u017f\n\"\3\"\3\"\3#\3#\3#\3"+
		"#\5#\u0187\n#\3#\3#\3$\3$\3$\5$\u018e\n$\3$\3$\3$\3$\5$\u0194\n$\3%\3"+
		"%\3%\7%\u0199\n%\f%\16%\u019c\13%\3&\3&\3&\3&\3\'\3\'\3\'\2\2(\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\5\4"+
		"\2\4\4 $\4\2\6\6((\4\2\66\67<<\2\u01b9\2N\3\2\2\2\4T\3\2\2\2\6V\3\2\2"+
		"\2\b[\3\2\2\2\ng\3\2\2\2\fp\3\2\2\2\16~\3\2\2\2\20\u0087\3\2\2\2\22\u0089"+
		"\3\2\2\2\24\u008d\3\2\2\2\26\u00da\3\2\2\2\30\u00dc\3\2\2\2\32\u00e1\3"+
		"\2\2\2\34\u00e9\3\2\2\2\36\u00f1\3\2\2\2 \u00f6\3\2\2\2\"\u00fe\3\2\2"+
		"\2$\u0106\3\2\2\2&\u010e\3\2\2\2(\u0113\3\2\2\2*\u011b\3\2\2\2,\u0128"+
		"\3\2\2\2.\u012c\3\2\2\2\60\u0131\3\2\2\2\62\u0136\3\2\2\2\64\u013b\3\2"+
		"\2\2\66\u013f\3\2\2\28\u0143\3\2\2\2:\u014b\3\2\2\2<\u0153\3\2\2\2>\u015b"+
		"\3\2\2\2@\u016d\3\2\2\2B\u017a\3\2\2\2D\u0182\3\2\2\2F\u0193\3\2\2\2H"+
		"\u0195\3\2\2\2J\u019d\3\2\2\2L\u01a1\3\2\2\2NO\5\30\r\2OP\7\2\2\3P\3\3"+
		"\2\2\2QU\5\6\4\2RU\5\n\6\2SU\5\f\7\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\5"+
		"\3\2\2\2VW\7\3\2\2WX\5L\'\2XY\7\4\2\2YZ\5F$\2Z\7\3\2\2\2[\\\7<\2\2\\]"+
		"\7\5\2\2]d\5L\'\2^_\7\6\2\2_`\7<\2\2`a\7\5\2\2ac\5L\'\2b^\3\2\2\2cf\3"+
		"\2\2\2db\3\2\2\2de\3\2\2\2e\t\3\2\2\2fd\3\2\2\2gh\7\7\2\2hk\7<\2\2ij\7"+
		"\5\2\2jl\5L\'\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\b\2\2no\5\30\r\2o\13"+
		"\3\2\2\2pq\7\t\2\2qr\7<\2\2rt\7\n\2\2su\5\b\5\2ts\3\2\2\2tu\3\2\2\2uv"+
		"\3\2\2\2vy\7\13\2\2wx\7\5\2\2xz\5L\'\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{"+
		"|\7\4\2\2|}\5\30\r\2}\r\3\2\2\2~\u0082\7<\2\2\177\u0081\5\20\t\2\u0080"+
		"\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\17\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0088\5\22\n\2\u0086\u0088"+
		"\5\24\13\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\21\3\2\2\2\u0089"+
		"\u008a\7\f\2\2\u008a\u008b\5\30\r\2\u008b\u008c\7\r\2\2\u008c\23\3\2\2"+
		"\2\u008d\u008e\7\16\2\2\u008e\u008f\7<\2\2\u008f\25\3\2\2\2\u0090\u00db"+
		"\7:\2\2\u0091\u00db\78\2\2\u0092\u0093\7\n\2\2\u0093\u0094\5(\25\2\u0094"+
		"\u0095\7\13\2\2\u0095\u00db\3\2\2\2\u0096\u0097\7\17\2\2\u0097\u00db\5"+
		"\30\r\2\u0098\u00db\5\16\b\2\u0099\u009a\7<\2\2\u009a\u009c\7\n\2\2\u009b"+
		"\u009d\5(\25\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\u00db\7\13\2\2\u009f\u00a0\5L\'\2\u00a0\u00a1\7\f\2\2\u00a1"+
		"\u00a2\5\30\r\2\u00a2\u00a3\7\r\2\2\u00a3\u00a4\7\20\2\2\u00a4\u00a5\5"+
		"\30\r\2\u00a5\u00db\3\2\2\2\u00a6\u00a7\5L\'\2\u00a7\u00a8\7\21\2\2\u00a8"+
		"\u00a9\5*\26\2\u00a9\u00aa\7\22\2\2\u00aa\u00db\3\2\2\2\u00ab\u00ac\7"+
		"\23\2\2\u00ac\u00ad\5\30\r\2\u00ad\u00ae\7\24\2\2\u00ae\u00af\5\30\r\2"+
		"\u00af\u00db\3\2\2\2\u00b0\u00b1\7\23\2\2\u00b1\u00b2\5\30\r\2\u00b2\u00b3"+
		"\7\24\2\2\u00b3\u00b4\5\30\r\2\u00b4\u00b5\7\25\2\2\u00b5\u00b6\5\30\r"+
		"\2\u00b6\u00db\3\2\2\2\u00b7\u00b8\7\26\2\2\u00b8\u00b9\5\30\r\2\u00b9"+
		"\u00ba\7\27\2\2\u00ba\u00bb\5\30\r\2\u00bb\u00db\3\2\2\2\u00bc\u00bd\7"+
		"\30\2\2\u00bd\u00be\7<\2\2\u00be\u00bf\7\b\2\2\u00bf\u00c0\5\30\r\2\u00c0"+
		"\u00c1\7\31\2\2\u00c1\u00c2\5\30\r\2\u00c2\u00c3\7\27\2\2\u00c3\u00c4"+
		"\5\30\r\2\u00c4\u00db\3\2\2\2\u00c5\u00db\7\32\2\2\u00c6\u00c7\7\33\2"+
		"\2\u00c7\u00c8\5,\27\2\u00c8\u00ca\7\34\2\2\u00c9\u00cb\5(\25\2\u00ca"+
		"\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\35"+
		"\2\2\u00cd\u00db\3\2\2\2\u00ce\u00db\5\60\31\2\u00cf\u00db\5.\30\2\u00d0"+
		"\u00db\5\62\32\2\u00d1\u00db\5\64\33\2\u00d2\u00db\5\66\34\2\u00d3\u00db"+
		"\58\35\2\u00d4\u00db\5:\36\2\u00d5\u00db\5<\37\2\u00d6\u00db\5> \2\u00d7"+
		"\u00db\5@!\2\u00d8\u00db\5B\"\2\u00d9\u00db\5D#\2\u00da\u0090\3\2\2\2"+
		"\u00da\u0091\3\2\2\2\u00da\u0092\3\2\2\2\u00da\u0096\3\2\2\2\u00da\u0098"+
		"\3\2\2\2\u00da\u0099\3\2\2\2\u00da\u009f\3\2\2\2\u00da\u00a6\3\2\2\2\u00da"+
		"\u00ab\3\2\2\2\u00da\u00b0\3\2\2\2\u00da\u00b7\3\2\2\2\u00da\u00bc\3\2"+
		"\2\2\u00da\u00c5\3\2\2\2\u00da\u00c6\3\2\2\2\u00da\u00ce\3\2\2\2\u00da"+
		"\u00cf\3\2\2\2\u00da\u00d0\3\2\2\2\u00da\u00d1\3\2\2\2\u00da\u00d2\3\2"+
		"\2\2\u00da\u00d3\3\2\2\2\u00da\u00d4\3\2\2\2\u00da\u00d5\3\2\2\2\u00da"+
		"\u00d6\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2"+
		"\2\2\u00db\27\3\2\2\2\u00dc\u00df\5\32\16\2\u00dd\u00de\7\b\2\2\u00de"+
		"\u00e0\5\32\16\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\31\3\2"+
		"\2\2\u00e1\u00e6\5\34\17\2\u00e2\u00e3\7\36\2\2\u00e3\u00e5\5\34\17\2"+
		"\u00e4\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7\33\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ee\5\36\20\2\u00ea"+
		"\u00eb\7\37\2\2\u00eb\u00ed\5\36\20\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\35\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f4\5 \21\2\u00f2\u00f3\t\2\2\2\u00f3\u00f5\5 "+
		"\21\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\37\3\2\2\2\u00f6\u00fb"+
		"\5\"\22\2\u00f7\u00f8\7\17\2\2\u00f8\u00fa\5\"\22\2\u00f9\u00f7\3\2\2"+
		"\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc!"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0103\5$\23\2\u00ff\u0100\7%\2\2\u0100"+
		"\u0102\5$\23\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0103\u0104\3\2\2\2\u0104#\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u010b"+
		"\5&\24\2\u0107\u0108\7&\2\2\u0108\u010a\5&\24\2\u0109\u0107\3\2\2\2\u010a"+
		"\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c%\3\2\2\2"+
		"\u010d\u010b\3\2\2\2\u010e\u0111\5\26\f\2\u010f\u0110\7\'\2\2\u0110\u0112"+
		"\5\26\f\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\'\3\2\2\2\u0113"+
		"\u0118\5\30\r\2\u0114\u0115\t\3\2\2\u0115\u0117\5\30\r\2\u0116\u0114\3"+
		"\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		")\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7<\2\2\u011c\u011d\7\4\2\2\u011d"+
		"\u0124\5\30\r\2\u011e\u011f\7\16\2\2\u011f\u0120\7<\2\2\u0120\u0121\7"+
		"\4\2\2\u0121\u0123\5\30\r\2\u0122\u011e\3\2\2\2\u0123\u0126\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125+\3\2\2\2\u0126\u0124\3\2\2\2"+
		"\u0127\u0129\5\4\3\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128"+
		"\3\2\2\2\u012a\u012b\3\2\2\2\u012b-\3\2\2\2\u012c\u012d\7)\2\2\u012d\u012e"+
		"\7\n\2\2\u012e\u012f\5(\25\2\u012f\u0130\7\13\2\2\u0130/\3\2\2\2\u0131"+
		"\u0132\7*\2\2\u0132\u0133\7\n\2\2\u0133\u0134\5\30\r\2\u0134\u0135\7\13"+
		"\2\2\u0135\61\3\2\2\2\u0136\u0137\7+\2\2\u0137\u0138\7\n\2\2\u0138\u0139"+
		"\5\30\r\2\u0139\u013a\7\13\2\2\u013a\63\3\2\2\2\u013b\u013c\7,\2\2\u013c"+
		"\u013d\7\n\2\2\u013d\u013e\7\13\2\2\u013e\65\3\2\2\2\u013f\u0140\7-\2"+
		"\2\u0140\u0141\7\n\2\2\u0141\u0142\7\13\2\2\u0142\67\3\2\2\2\u0143\u0144"+
		"\7.\2\2\u0144\u0147\7\n\2\2\u0145\u0148\78\2\2\u0146\u0148\7<\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\7\13"+
		"\2\2\u014a9\3\2\2\2\u014b\u014c\7/\2\2\u014c\u014f\7\n\2\2\u014d\u0150"+
		"\7:\2\2\u014e\u0150\7<\2\2\u014f\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0152\7\13\2\2\u0152;\3\2\2\2\u0153\u0154\7\60\2"+
		"\2\u0154\u0157\7\n\2\2\u0155\u0158\78\2\2\u0156\u0158\7<\2\2\u0157\u0155"+
		"\3\2\2\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\7\13\2\2"+
		"\u015a=\3\2\2\2\u015b\u015c\7\61\2\2\u015c\u015f\7\n\2\2\u015d\u0160\7"+
		"8\2\2\u015e\u0160\7<\2\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0164\7\6\2\2\u0162\u0165\7:\2\2\u0163\u0165\7<\2"+
		"\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0169"+
		"\7\6\2\2\u0167\u016a\7:\2\2\u0168\u016a\7<\2\2\u0169\u0167\3\2\2\2\u0169"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\7\13\2\2\u016c?\3\2\2\2"+
		"\u016d\u016e\7\62\2\2\u016e\u0171\7\n\2\2\u016f\u0172\78\2\2\u0170\u0172"+
		"\7<\2\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0176\7\6\2\2\u0174\u0177\78\2\2\u0175\u0177\7<\2\2\u0176\u0174\3\2\2"+
		"\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\7\13\2\2\u0179"+
		"A\3\2\2\2\u017a\u017b\7\63\2\2\u017b\u017e\7\n\2\2\u017c\u017f\7:\2\2"+
		"\u017d\u017f\7<\2\2\u017e\u017c\3\2\2\2\u017e\u017d\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0181\7\13\2\2\u0181C\3\2\2\2\u0182\u0183\7\64\2\2\u0183"+
		"\u0186\7\n\2\2\u0184\u0187\7:\2\2\u0185\u0187\7<\2\2\u0186\u0184\3\2\2"+
		"\2\u0186\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\7\13\2\2\u0189"+
		"E\3\2\2\2\u018a\u0194\5L\'\2\u018b\u018d\7\21\2\2\u018c\u018e\5H%\2\u018d"+
		"\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0194\7\22"+
		"\2\2\u0190\u0191\7\65\2\2\u0191\u0192\7\20\2\2\u0192\u0194\5L\'\2\u0193"+
		"\u018a\3\2\2\2\u0193\u018b\3\2\2\2\u0193\u0190\3\2\2\2\u0194G\3\2\2\2"+
		"\u0195\u019a\5J&\2\u0196\u0197\7\6\2\2\u0197\u0199\5J&\2\u0198\u0196\3"+
		"\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"I\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7<\2\2\u019e\u019f\7\5\2\2\u019f"+
		"\u01a0\5L\'\2\u01a0K\3\2\2\2\u01a1\u01a2\t\4\2\2\u01a2M\3\2\2\2$Tdkty"+
		"\u0082\u0087\u009c\u00ca\u00da\u00df\u00e6\u00ee\u00f4\u00fb\u0103\u010b"+
		"\u0111\u0118\u0124\u012a\u0147\u014f\u0157\u015f\u0164\u0169\u0171\u0176"+
		"\u017e\u0186\u018d\u0193\u019a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}