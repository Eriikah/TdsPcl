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
		T__52=53, T__53=54, INT=55, SYMBS=56, ID=57, WS=58;
	public static final int
		RULE_program = 0, RULE_decl = 1, RULE_typedecl = 2, RULE_fielddecl = 3, 
		RULE_vardecl = 4, RULE_funcdecl = 5, RULE_lvalue = 6, RULE_subscript = 7, 
		RULE_fieldexpr = 8, RULE_expr = 9, RULE_exprsolo = 10, RULE_orexpr = 11, 
		RULE_andexpr = 12, RULE_boolexpr = 13, RULE_diffexpr = 14, RULE_egexpr = 15, 
		RULE_minusexpr = 16, RULE_addexpr = 17, RULE_divexpr = 18, RULE_multexpr = 19, 
		RULE_expr_seq = 20, RULE_expr_list = 21, RULE_fieldcreate = 22, RULE_decl_list = 23, 
		RULE_freturn = 24, RULE_prints = 25, RULE_printi = 26, RULE_flush = 27, 
		RULE_getchar = 28, RULE_ord = 29, RULE_chr = 30, RULE_size = 31, RULE_substring = 32, 
		RULE_concat = 33, RULE_not = 34, RULE_exit = 35, RULE_type = 36, RULE_typefields = 37, 
		RULE_typefield = 38, RULE_typeid = 39, RULE_string = 40;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "decl", "typedecl", "fielddecl", "vardecl", "funcdecl", "lvalue", 
			"subscript", "fieldexpr", "expr", "exprsolo", "orexpr", "andexpr", "boolexpr", 
			"diffexpr", "egexpr", "minusexpr", "addexpr", "divexpr", "multexpr", 
			"expr_seq", "expr_list", "fieldcreate", "decl_list", "freturn", "prints", 
			"printi", "flush", "getchar", "ord", "chr", "size", "substring", "concat", 
			"not", "exit", "type", "typefields", "typefield", "typeid", "string"
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(exprParser.EOF, 0); }
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
			setState(82);
			expr();
			setState(83);
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
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				typedecl();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				vardecl();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
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
			setState(90);
			match(T__0);
			setState(91);
			typeid();
			setState(92);
			match(T__1);
			setState(93);
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
			setState(95);
			match(ID);
			setState(96);
			match(T__2);
			setState(97);
			typeid();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(98);
				match(T__3);
				setState(99);
				match(ID);
				setState(100);
				match(T__2);
				setState(101);
				typeid();
				}
				}
				setState(106);
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
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
		}
		public VarDeclContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclWithIdfContext extends VardeclContext {
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
		}
		public VarDeclWithIdfContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitVarDeclWithIdf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardecl);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new VarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__4);
				setState(108);
				match(ID);
				setState(109);
				match(T__5);
				setState(110);
				exprsolo();
				}
				break;
			case 2:
				_localctx = new VarDeclWithIdfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(T__4);
				setState(112);
				match(ID);
				setState(113);
				typeid();
				setState(114);
				match(T__5);
				setState(115);
				exprsolo();
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

	public static class FuncdeclContext extends ParserRuleContext {
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
			setState(119);
			match(T__6);
			setState(120);
			match(ID);
			setState(121);
			match(T__7);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(122);
				fielddecl();
				}
			}

			setState(125);
			match(T__8);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(126);
				match(T__2);
				setState(127);
				typeid();
				}
			}

			setState(130);
			match(T__1);
			setState(131);
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public List<SubscriptContext> subscript() {
			return getRuleContexts(SubscriptContext.class);
		}
		public SubscriptContext subscript(int i) {
			return getRuleContext(SubscriptContext.class,i);
		}
		public List<FieldexprContext> fieldexpr() {
			return getRuleContexts(FieldexprContext.class);
		}
		public FieldexprContext fieldexpr(int i) {
			return getRuleContext(FieldexprContext.class,i);
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
			setState(133);
			match(ID);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(136);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__9:
						{
						setState(134);
						subscript();
						}
						break;
					case T__11:
						{
						setState(135);
						fieldexpr();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 14, RULE_subscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__9);
			setState(142);
			exprsolo();
			setState(143);
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
		enterRule(_localctx, 16, RULE_fieldexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__11);
			setState(146);
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
	public static class AffectContext extends ExprContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
		}
		public AffectContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitAffect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisContext extends ExprContext {
		public Expr_seqContext expr_seq() {
			return getRuleContext(Expr_seqContext.class,0);
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
		public Expr_seqContext expr_seq() {
			return getRuleContext(Expr_seqContext.class,0);
		}
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_expr);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(INT);
				}
				break;
			case 2:
				_localctx = new StringDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				string();
				}
				break;
			case 3:
				_localctx = new ParenthesisContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(T__7);
				setState(151);
				expr_seq();
				setState(152);
				match(T__8);
				}
				break;
			case 4:
				_localctx = new MinusAffectorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(T__12);
				setState(155);
				exprsolo();
				}
				break;
			case 5:
				_localctx = new AffectContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				lvalue();
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(157);
					match(T__5);
					setState(158);
					exprsolo();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				match(ID);
				setState(162);
				match(T__7);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__12) | (1L << T__16) | (1L << T__19) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << INT) | (1L << ID))) != 0)) {
					{
					setState(163);
					expr_list();
					}
				}

				setState(166);
				match(T__8);
				}
				break;
			case 7:
				_localctx = new ListDeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(167);
				typeid();
				setState(168);
				match(T__9);
				setState(169);
				exprsolo();
				setState(170);
				match(T__10);
				setState(171);
				match(T__13);
				setState(172);
				exprsolo();
				}
				break;
			case 8:
				_localctx = new ListContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(174);
				typeid();
				setState(175);
				match(T__14);
				setState(176);
				fieldcreate();
				setState(177);
				match(T__15);
				}
				break;
			case 9:
				_localctx = new IfThenContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(179);
				match(T__16);
				setState(180);
				exprsolo();
				setState(181);
				match(T__17);
				setState(182);
				exprsolo();
				}
				break;
			case 10:
				_localctx = new IfThenElseContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(184);
				match(T__16);
				setState(185);
				exprsolo();
				setState(186);
				match(T__17);
				setState(187);
				exprsolo();
				setState(188);
				match(T__18);
				setState(189);
				exprsolo();
				}
				break;
			case 11:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(191);
				match(T__19);
				setState(192);
				exprsolo();
				setState(193);
				match(T__20);
				setState(194);
				exprsolo();
				}
				break;
			case 12:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(196);
				match(T__21);
				setState(197);
				match(ID);
				setState(198);
				match(T__5);
				setState(199);
				exprsolo();
				setState(200);
				match(T__22);
				setState(201);
				exprsolo();
				setState(202);
				match(T__20);
				setState(203);
				exprsolo();
				}
				break;
			case 13:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(205);
				match(T__23);
				}
				break;
			case 14:
				_localctx = new LetContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(206);
				match(T__24);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__6))) != 0)) {
					{
					setState(207);
					decl_list();
					}
				}

				setState(210);
				match(T__25);
				setState(211);
				expr_seq();
				setState(212);
				match(T__26);
				}
				break;
			case 15:
				_localctx = new PrintStrContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(214);
				prints();
				}
				break;
			case 16:
				_localctx = new ReturnFContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(215);
				freturn();
				}
				break;
			case 17:
				_localctx = new PrintIntContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(216);
				printi();
				}
				break;
			case 18:
				_localctx = new FlushFContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(217);
				flush();
				}
				break;
			case 19:
				_localctx = new GetCharFContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(218);
				getchar();
				}
				break;
			case 20:
				_localctx = new OrdFContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(219);
				ord();
				}
				break;
			case 21:
				_localctx = new CharFContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(220);
				chr();
				}
				break;
			case 22:
				_localctx = new SizeFContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(221);
				size();
				}
				break;
			case 23:
				_localctx = new SubstringFContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(222);
				substring();
				}
				break;
			case 24:
				_localctx = new ConcatenateFContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(223);
				concat();
				}
				break;
			case 25:
				_localctx = new NotFContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(224);
				not();
				}
				break;
			case 26:
				_localctx = new ExitFContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(225);
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
	public static class Affect2Context extends ExprsoloContext {
		public OrexprContext orexpr() {
			return getRuleContext(OrexprContext.class,0);
		}
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
		}
		public Affect2Context(ExprsoloContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitAffect2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprsoloContext exprsolo() throws RecognitionException {
		ExprsoloContext _localctx = new ExprsoloContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exprsolo);
		try {
			_localctx = new Affect2Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			orexpr();
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(229);
				match(T__5);
				setState(230);
				exprsolo();
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
		public AndexprContext andexpr() {
			return getRuleContext(AndexprContext.class,0);
		}
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
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
		enterRule(_localctx, 22, RULE_orexpr);
		try {
			_localctx = new OrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			andexpr();
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(234);
				match(T__27);
				setState(235);
				exprsolo();
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
		public BoolexprContext boolexpr() {
			return getRuleContext(BoolexprContext.class,0);
		}
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
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
		enterRule(_localctx, 24, RULE_andexpr);
		try {
			_localctx = new AndContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			boolexpr();
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(239);
				match(T__28);
				setState(240);
				exprsolo();
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

	public static class BoolexprContext extends ParserRuleContext {
		public BoolexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolexpr; }
	 
		public BoolexprContext() { }
		public void copyFrom(BoolexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InfContext extends BoolexprContext {
		public DiffexprContext diffexpr() {
			return getRuleContext(DiffexprContext.class,0);
		}
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
		}
		public InfContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitInf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SupeqContext extends BoolexprContext {
		public DiffexprContext diffexpr() {
			return getRuleContext(DiffexprContext.class,0);
		}
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
		}
		public SupeqContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitSupeq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InfeqContext extends BoolexprContext {
		public DiffexprContext diffexpr() {
			return getRuleContext(DiffexprContext.class,0);
		}
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
		}
		public InfeqContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitInfeq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SupContext extends BoolexprContext {
		public DiffexprContext diffexpr() {
			return getRuleContext(DiffexprContext.class,0);
		}
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
		}
		public SupContext(BoolexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitSup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolexprContext boolexpr() throws RecognitionException {
		BoolexprContext _localctx = new BoolexprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boolexpr);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new InfeqContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				diffexpr();
				setState(246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(244);
					match(T__29);
					setState(245);
					exprsolo();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new SupeqContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				diffexpr();
				setState(251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(249);
					match(T__30);
					setState(250);
					exprsolo();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new InfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				diffexpr();
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(254);
					match(T__31);
					setState(255);
					exprsolo();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new SupContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				diffexpr();
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(259);
					match(T__32);
					setState(260);
					exprsolo();
					}
					break;
				}
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

	public static class DiffexprContext extends ParserRuleContext {
		public DiffexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diffexpr; }
	 
		public DiffexprContext() { }
		public void copyFrom(DiffexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DiffContext extends DiffexprContext {
		public EgexprContext egexpr() {
			return getRuleContext(EgexprContext.class,0);
		}
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
		}
		public DiffContext(DiffexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitDiff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiffexprContext diffexpr() throws RecognitionException {
		DiffexprContext _localctx = new DiffexprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_diffexpr);
		try {
			_localctx = new DiffContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			egexpr();
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(266);
				match(T__33);
				setState(267);
				exprsolo();
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

	public static class EgexprContext extends ParserRuleContext {
		public EgexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_egexpr; }
	 
		public EgexprContext() { }
		public void copyFrom(EgexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqContext extends EgexprContext {
		public MinusexprContext minusexpr() {
			return getRuleContext(MinusexprContext.class,0);
		}
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
		}
		public EqContext(EgexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EgexprContext egexpr() throws RecognitionException {
		EgexprContext _localctx = new EgexprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_egexpr);
		try {
			_localctx = new EqContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			minusexpr();
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(271);
				match(T__1);
				setState(272);
				exprsolo();
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
	public static class MinusContext extends MinusexprContext {
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
		}
		public MinusContext(MinusexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusexprContext minusexpr() throws RecognitionException {
		MinusexprContext _localctx = new MinusexprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_minusexpr);
		try {
			_localctx = new MinusContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			addexpr();
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(276);
				match(T__12);
				setState(277);
				exprsolo();
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
		public DivexprContext divexpr() {
			return getRuleContext(DivexprContext.class,0);
		}
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
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
		enterRule(_localctx, 34, RULE_addexpr);
		try {
			_localctx = new PlusContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			divexpr();
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(281);
				match(T__34);
				setState(282);
				exprsolo();
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
		public MultexprContext multexpr() {
			return getRuleContext(MultexprContext.class,0);
		}
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
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
		enterRule(_localctx, 36, RULE_divexpr);
		try {
			_localctx = new DivContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			multexpr();
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(286);
				match(T__35);
				setState(287);
				exprsolo();
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprsoloContext exprsolo() {
			return getRuleContext(ExprsoloContext.class,0);
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
		enterRule(_localctx, 38, RULE_multexpr);
		try {
			_localctx = new MultContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			expr();
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(291);
				match(T__36);
				setState(292);
				exprsolo();
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

	public static class Expr_seqContext extends ParserRuleContext {
		public Expr_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_seq; }
	 
		public Expr_seqContext() { }
		public void copyFrom(Expr_seqContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprSeqContext extends Expr_seqContext {
		public List<ExprsoloContext> exprsolo() {
			return getRuleContexts(ExprsoloContext.class);
		}
		public ExprsoloContext exprsolo(int i) {
			return getRuleContext(ExprsoloContext.class,i);
		}
		public ExprSeqContext(Expr_seqContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitExprSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_seqContext expr_seq() throws RecognitionException {
		Expr_seqContext _localctx = new Expr_seqContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr_seq);
		int _la;
		try {
			_localctx = new ExprSeqContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			exprsolo();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(296);
				match(T__37);
				setState(297);
				exprsolo();
				}
				}
				setState(302);
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
		enterRule(_localctx, 42, RULE_expr_list);
		int _la;
		try {
			_localctx = new ExprListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			exprsolo();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(304);
				match(T__3);
				setState(305);
				exprsolo();
				}
				}
				setState(310);
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
		enterRule(_localctx, 44, RULE_fieldcreate);
		int _la;
		try {
			_localctx = new Field_CreateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(ID);
			setState(312);
			match(T__1);
			setState(313);
			exprsolo();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(314);
				match(T__11);
				setState(315);
				match(ID);
				setState(316);
				match(T__1);
				setState(317);
				exprsolo();
				}
				}
				setState(322);
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
		enterRule(_localctx, 46, RULE_decl_list);
		int _la;
		try {
			_localctx = new DeclListContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(324); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(323);
				decl();
				}
				}
				setState(326); 
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
		public Expr_seqContext expr_seq() {
			return getRuleContext(Expr_seqContext.class,0);
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
		enterRule(_localctx, 48, RULE_freturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__38);
			setState(329);
			match(T__7);
			setState(330);
			expr_seq();
			setState(331);
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
		enterRule(_localctx, 50, RULE_prints);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__39);
			setState(334);
			match(T__7);
			{
			setState(335);
			exprsolo();
			}
			setState(336);
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
		enterRule(_localctx, 52, RULE_printi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(T__40);
			setState(339);
			match(T__7);
			{
			setState(340);
			exprsolo();
			}
			setState(341);
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
		enterRule(_localctx, 54, RULE_flush);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(T__41);
			setState(344);
			match(T__7);
			setState(345);
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
		enterRule(_localctx, 56, RULE_getchar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(T__42);
			setState(348);
			match(T__7);
			setState(349);
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
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
		enterRule(_localctx, 58, RULE_ord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(T__43);
			setState(352);
			match(T__7);
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				{
				setState(353);
				string();
				}
				break;
			case ID:
				{
				setState(354);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(357);
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
		enterRule(_localctx, 60, RULE_chr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__44);
			setState(360);
			match(T__7);
			setState(361);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(362);
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
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
		enterRule(_localctx, 62, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(T__45);
			setState(365);
			match(T__7);
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				{
				setState(366);
				string();
				}
				break;
			case ID:
				{
				setState(367);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(370);
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
		public List<TerminalNode> INT() { return getTokens(exprParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(exprParser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(exprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(exprParser.ID, i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
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
		enterRule(_localctx, 64, RULE_substring);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(T__46);
			setState(373);
			match(T__7);
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				{
				setState(374);
				string();
				}
				break;
			case ID:
				{
				setState(375);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(378);
			match(T__3);
			setState(379);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(380);
			match(T__3);
			setState(381);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ConcatContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
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
		enterRule(_localctx, 66, RULE_concat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(T__47);
			setState(385);
			match(T__7);
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				{
				setState(386);
				string();
				}
				break;
			case ID:
				{
				setState(387);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(390);
			match(T__3);
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				{
				setState(391);
				string();
				}
				break;
			case ID:
				{
				setState(392);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(395);
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
		enterRule(_localctx, 68, RULE_not);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__48);
			setState(398);
			match(T__7);
			setState(399);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(400);
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
		enterRule(_localctx, 70, RULE_exit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(T__49);
			setState(403);
			match(T__7);
			setState(404);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(405);
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
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypefieldsContext typefields() {
			return getRuleContext(TypefieldsContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_type);
		int _la;
		try {
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__51:
			case T__52:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				typeid();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				match(T__14);
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(409);
					typefields();
					}
				}

				setState(412);
				match(T__15);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				match(T__50);
				setState(414);
				match(T__13);
				setState(415);
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
		public TypefieldContext typefield() {
			return getRuleContext(TypefieldContext.class,0);
		}
		public List<TypefieldsContext> typefields() {
			return getRuleContexts(TypefieldsContext.class);
		}
		public TypefieldsContext typefields(int i) {
			return getRuleContext(TypefieldsContext.class,i);
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
		enterRule(_localctx, 74, RULE_typefields);
		try {
			int _alt;
			_localctx = new Type_FieldsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			typefield();
			setState(423);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(419);
					match(T__3);
					setState(420);
					typefields();
					}
					} 
				}
				setState(425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 76, RULE_typefield);
		try {
			_localctx = new Type_FieldContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(ID);
			setState(427);
			match(T__2);
			setState(428);
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
		enterRule(_localctx, 78, RULE_typeid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
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

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(exprParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(exprParser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(exprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(exprParser.ID, i);
		}
		public List<TerminalNode> SYMBS() { return getTokens(exprParser.SYMBS); }
		public TerminalNode SYMBS(int i) {
			return getToken(exprParser.SYMBS, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exprVisitor ) return ((exprVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(T__53);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << SYMBS) | (1L << ID))) != 0)) {
				{
				{
				setState(433);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << SYMBS) | (1L << ID))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(439);
			match(T__53);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u01bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\5\3[\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5i\n\5\f\5\16\5l\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6x\n\6\3\7\3\7\3\7\3\7\5\7~\n\7\3\7\3\7\3\7\5\7\u0083\n\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\7\b\u008b\n\b\f\b\16\b\u008e\13\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a2"+
		"\n\13\3\13\3\13\3\13\5\13\u00a7\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d3\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e5"+
		"\n\13\3\f\3\f\3\f\5\f\u00ea\n\f\3\r\3\r\3\r\5\r\u00ef\n\r\3\16\3\16\3"+
		"\16\5\16\u00f4\n\16\3\17\3\17\3\17\5\17\u00f9\n\17\3\17\3\17\3\17\5\17"+
		"\u00fe\n\17\3\17\3\17\3\17\5\17\u0103\n\17\3\17\3\17\3\17\5\17\u0108\n"+
		"\17\5\17\u010a\n\17\3\20\3\20\3\20\5\20\u010f\n\20\3\21\3\21\3\21\5\21"+
		"\u0114\n\21\3\22\3\22\3\22\5\22\u0119\n\22\3\23\3\23\3\23\5\23\u011e\n"+
		"\23\3\24\3\24\3\24\5\24\u0123\n\24\3\25\3\25\3\25\5\25\u0128\n\25\3\26"+
		"\3\26\3\26\7\26\u012d\n\26\f\26\16\26\u0130\13\26\3\27\3\27\3\27\7\27"+
		"\u0135\n\27\f\27\16\27\u0138\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u0141\n\30\f\30\16\30\u0144\13\30\3\31\6\31\u0147\n\31\r\31\16\31"+
		"\u0148\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\5\37\u0166\n\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\5!\u0173\n!\3!\3"+
		"!\3\"\3\"\3\"\3\"\5\"\u017b\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\5"+
		"#\u0187\n#\3#\3#\3#\5#\u018c\n#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"&\3&\3&\5&\u019d\n&\3&\3&\3&\3&\5&\u01a3\n&\3\'\3\'\3\'\7\'\u01a8\n\'"+
		"\f\'\16\'\u01ab\13\'\3(\3(\3(\3(\3)\3)\3*\3*\7*\u01b5\n*\f*\16*\u01b8"+
		"\13*\3*\3*\3*\2\2+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPR\2\5\4\299;;\4\2\66\67;;\3\29;\2\u01d4\2T\3\2\2"+
		"\2\4Z\3\2\2\2\6\\\3\2\2\2\ba\3\2\2\2\nw\3\2\2\2\fy\3\2\2\2\16\u0087\3"+
		"\2\2\2\20\u008f\3\2\2\2\22\u0093\3\2\2\2\24\u00e4\3\2\2\2\26\u00e6\3\2"+
		"\2\2\30\u00eb\3\2\2\2\32\u00f0\3\2\2\2\34\u0109\3\2\2\2\36\u010b\3\2\2"+
		"\2 \u0110\3\2\2\2\"\u0115\3\2\2\2$\u011a\3\2\2\2&\u011f\3\2\2\2(\u0124"+
		"\3\2\2\2*\u0129\3\2\2\2,\u0131\3\2\2\2.\u0139\3\2\2\2\60\u0146\3\2\2\2"+
		"\62\u014a\3\2\2\2\64\u014f\3\2\2\2\66\u0154\3\2\2\28\u0159\3\2\2\2:\u015d"+
		"\3\2\2\2<\u0161\3\2\2\2>\u0169\3\2\2\2@\u016e\3\2\2\2B\u0176\3\2\2\2D"+
		"\u0182\3\2\2\2F\u018f\3\2\2\2H\u0194\3\2\2\2J\u01a2\3\2\2\2L\u01a4\3\2"+
		"\2\2N\u01ac\3\2\2\2P\u01b0\3\2\2\2R\u01b2\3\2\2\2TU\5\24\13\2UV\7\2\2"+
		"\3V\3\3\2\2\2W[\5\6\4\2X[\5\n\6\2Y[\5\f\7\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2"+
		"\2\2[\5\3\2\2\2\\]\7\3\2\2]^\5P)\2^_\7\4\2\2_`\5J&\2`\7\3\2\2\2ab\7;\2"+
		"\2bc\7\5\2\2cj\5P)\2de\7\6\2\2ef\7;\2\2fg\7\5\2\2gi\5P)\2hd\3\2\2\2il"+
		"\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\t\3\2\2\2lj\3\2\2\2mn\7\7\2\2no\7;\2\2o"+
		"p\7\b\2\2px\5\26\f\2qr\7\7\2\2rs\7;\2\2st\5P)\2tu\7\b\2\2uv\5\26\f\2v"+
		"x\3\2\2\2wm\3\2\2\2wq\3\2\2\2x\13\3\2\2\2yz\7\t\2\2z{\7;\2\2{}\7\n\2\2"+
		"|~\5\b\5\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0082\7\13\2\2\u0080\u0081"+
		"\7\5\2\2\u0081\u0083\5P)\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\7\4\2\2\u0085\u0086\5\26\f\2\u0086\r\3\2\2"+
		"\2\u0087\u008c\7;\2\2\u0088\u008b\5\20\t\2\u0089\u008b\5\22\n\2\u008a"+
		"\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\17\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090"+
		"\7\f\2\2\u0090\u0091\5\26\f\2\u0091\u0092\7\r\2\2\u0092\21\3\2\2\2\u0093"+
		"\u0094\7\16\2\2\u0094\u0095\7;\2\2\u0095\23\3\2\2\2\u0096\u00e5\79\2\2"+
		"\u0097\u00e5\5R*\2\u0098\u0099\7\n\2\2\u0099\u009a\5*\26\2\u009a\u009b"+
		"\7\13\2\2\u009b\u00e5\3\2\2\2\u009c\u009d\7\17\2\2\u009d\u00e5\5\26\f"+
		"\2\u009e\u00a1\5\16\b\2\u009f\u00a0\7\b\2\2\u00a0\u00a2\5\26\f\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00e5\3\2\2\2\u00a3\u00a4\7;"+
		"\2\2\u00a4\u00a6\7\n\2\2\u00a5\u00a7\5,\27\2\u00a6\u00a5\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00e5\7\13\2\2\u00a9\u00aa\5"+
		"P)\2\u00aa\u00ab\7\f\2\2\u00ab\u00ac\5\26\f\2\u00ac\u00ad\7\r\2\2\u00ad"+
		"\u00ae\7\20\2\2\u00ae\u00af\5\26\f\2\u00af\u00e5\3\2\2\2\u00b0\u00b1\5"+
		"P)\2\u00b1\u00b2\7\21\2\2\u00b2\u00b3\5.\30\2\u00b3\u00b4\7\22\2\2\u00b4"+
		"\u00e5\3\2\2\2\u00b5\u00b6\7\23\2\2\u00b6\u00b7\5\26\f\2\u00b7\u00b8\7"+
		"\24\2\2\u00b8\u00b9\5\26\f\2\u00b9\u00e5\3\2\2\2\u00ba\u00bb\7\23\2\2"+
		"\u00bb\u00bc\5\26\f\2\u00bc\u00bd\7\24\2\2\u00bd\u00be\5\26\f\2\u00be"+
		"\u00bf\7\25\2\2\u00bf\u00c0\5\26\f\2\u00c0\u00e5\3\2\2\2\u00c1\u00c2\7"+
		"\26\2\2\u00c2\u00c3\5\26\f\2\u00c3\u00c4\7\27\2\2\u00c4\u00c5\5\26\f\2"+
		"\u00c5\u00e5\3\2\2\2\u00c6\u00c7\7\30\2\2\u00c7\u00c8\7;\2\2\u00c8\u00c9"+
		"\7\b\2\2\u00c9\u00ca\5\26\f\2\u00ca\u00cb\7\31\2\2\u00cb\u00cc\5\26\f"+
		"\2\u00cc\u00cd\7\27\2\2\u00cd\u00ce\5\26\f\2\u00ce\u00e5\3\2\2\2\u00cf"+
		"\u00e5\7\32\2\2\u00d0\u00d2\7\33\2\2\u00d1\u00d3\5\60\31\2\u00d2\u00d1"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\34\2\2"+
		"\u00d5\u00d6\5*\26\2\u00d6\u00d7\7\35\2\2\u00d7\u00e5\3\2\2\2\u00d8\u00e5"+
		"\5\64\33\2\u00d9\u00e5\5\62\32\2\u00da\u00e5\5\66\34\2\u00db\u00e5\58"+
		"\35\2\u00dc\u00e5\5:\36\2\u00dd\u00e5\5<\37\2\u00de\u00e5\5> \2\u00df"+
		"\u00e5\5@!\2\u00e0\u00e5\5B\"\2\u00e1\u00e5\5D#\2\u00e2\u00e5\5F$\2\u00e3"+
		"\u00e5\5H%\2\u00e4\u0096\3\2\2\2\u00e4\u0097\3\2\2\2\u00e4\u0098\3\2\2"+
		"\2\u00e4\u009c\3\2\2\2\u00e4\u009e\3\2\2\2\u00e4\u00a3\3\2\2\2\u00e4\u00a9"+
		"\3\2\2\2\u00e4\u00b0\3\2\2\2\u00e4\u00b5\3\2\2\2\u00e4\u00ba\3\2\2\2\u00e4"+
		"\u00c1\3\2\2\2\u00e4\u00c6\3\2\2\2\u00e4\u00cf\3\2\2\2\u00e4\u00d0\3\2"+
		"\2\2\u00e4\u00d8\3\2\2\2\u00e4\u00d9\3\2\2\2\u00e4\u00da\3\2\2\2\u00e4"+
		"\u00db\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e4\u00dd\3\2\2\2\u00e4\u00de\3\2"+
		"\2\2\u00e4\u00df\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\25\3\2\2\2\u00e6\u00e9\5\30\r"+
		"\2\u00e7\u00e8\7\b\2\2\u00e8\u00ea\5\26\f\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\27\3\2\2\2\u00eb\u00ee\5\32\16\2\u00ec\u00ed\7\36"+
		"\2\2\u00ed\u00ef\5\26\f\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\31\3\2\2\2\u00f0\u00f3\5\34\17\2\u00f1\u00f2\7\37\2\2\u00f2\u00f4\5\26"+
		"\f\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\33\3\2\2\2\u00f5\u00f8"+
		"\5\36\20\2\u00f6\u00f7\7 \2\2\u00f7\u00f9\5\26\f\2\u00f8\u00f6\3\2\2\2"+
		"\u00f8\u00f9\3\2\2\2\u00f9\u010a\3\2\2\2\u00fa\u00fd\5\36\20\2\u00fb\u00fc"+
		"\7!\2\2\u00fc\u00fe\5\26\f\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u010a\3\2\2\2\u00ff\u0102\5\36\20\2\u0100\u0101\7\"\2\2\u0101\u0103\5"+
		"\26\f\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u010a\3\2\2\2\u0104"+
		"\u0107\5\36\20\2\u0105\u0106\7#\2\2\u0106\u0108\5\26\f\2\u0107\u0105\3"+
		"\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u00f5\3\2\2\2\u0109"+
		"\u00fa\3\2\2\2\u0109\u00ff\3\2\2\2\u0109\u0104\3\2\2\2\u010a\35\3\2\2"+
		"\2\u010b\u010e\5 \21\2\u010c\u010d\7$\2\2\u010d\u010f\5\26\f\2\u010e\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\37\3\2\2\2\u0110\u0113\5\"\22\2\u0111"+
		"\u0112\7\4\2\2\u0112\u0114\5\26\f\2\u0113\u0111\3\2\2\2\u0113\u0114\3"+
		"\2\2\2\u0114!\3\2\2\2\u0115\u0118\5$\23\2\u0116\u0117\7\17\2\2\u0117\u0119"+
		"\5\26\f\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119#\3\2\2\2\u011a"+
		"\u011d\5&\24\2\u011b\u011c\7%\2\2\u011c\u011e\5\26\f\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e%\3\2\2\2\u011f\u0122\5(\25\2\u0120\u0121"+
		"\7&\2\2\u0121\u0123\5\26\f\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\'\3\2\2\2\u0124\u0127\5\24\13\2\u0125\u0126\7\'\2\2\u0126\u0128\5\26"+
		"\f\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128)\3\2\2\2\u0129\u012e"+
		"\5\26\f\2\u012a\u012b\7(\2\2\u012b\u012d\5\26\f\2\u012c\u012a\3\2\2\2"+
		"\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f+\3"+
		"\2\2\2\u0130\u012e\3\2\2\2\u0131\u0136\5\26\f\2\u0132\u0133\7\6\2\2\u0133"+
		"\u0135\5\26\f\2\u0134\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3"+
		"\2\2\2\u0136\u0137\3\2\2\2\u0137-\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a"+
		"\7;\2\2\u013a\u013b\7\4\2\2\u013b\u0142\5\26\f\2\u013c\u013d\7\16\2\2"+
		"\u013d\u013e\7;\2\2\u013e\u013f\7\4\2\2\u013f\u0141\5\26\f\2\u0140\u013c"+
		"\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"/\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0147\5\4\3\2\u0146\u0145\3\2\2\2"+
		"\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\61"+
		"\3\2\2\2\u014a\u014b\7)\2\2\u014b\u014c\7\n\2\2\u014c\u014d\5*\26\2\u014d"+
		"\u014e\7\13\2\2\u014e\63\3\2\2\2\u014f\u0150\7*\2\2\u0150\u0151\7\n\2"+
		"\2\u0151\u0152\5\26\f\2\u0152\u0153\7\13\2\2\u0153\65\3\2\2\2\u0154\u0155"+
		"\7+\2\2\u0155\u0156\7\n\2\2\u0156\u0157\5\26\f\2\u0157\u0158\7\13\2\2"+
		"\u0158\67\3\2\2\2\u0159\u015a\7,\2\2\u015a\u015b\7\n\2\2\u015b\u015c\7"+
		"\13\2\2\u015c9\3\2\2\2\u015d\u015e\7-\2\2\u015e\u015f\7\n\2\2\u015f\u0160"+
		"\7\13\2\2\u0160;\3\2\2\2\u0161\u0162\7.\2\2\u0162\u0165\7\n\2\2\u0163"+
		"\u0166\5R*\2\u0164\u0166\7;\2\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2"+
		"\2\u0166\u0167\3\2\2\2\u0167\u0168\7\13\2\2\u0168=\3\2\2\2\u0169\u016a"+
		"\7/\2\2\u016a\u016b\7\n\2\2\u016b\u016c\t\2\2\2\u016c\u016d\7\13\2\2\u016d"+
		"?\3\2\2\2\u016e\u016f\7\60\2\2\u016f\u0172\7\n\2\2\u0170\u0173\5R*\2\u0171"+
		"\u0173\7;\2\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174\u0175\7\13\2\2\u0175A\3\2\2\2\u0176\u0177\7\61\2\2\u0177\u017a"+
		"\7\n\2\2\u0178\u017b\5R*\2\u0179\u017b\7;\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\7\6\2\2\u017d\u017e\t\2"+
		"\2\2\u017e\u017f\7\6\2\2\u017f\u0180\t\2\2\2\u0180\u0181\7\13\2\2\u0181"+
		"C\3\2\2\2\u0182\u0183\7\62\2\2\u0183\u0186\7\n\2\2\u0184\u0187\5R*\2\u0185"+
		"\u0187\7;\2\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187\u0188\3\2"+
		"\2\2\u0188\u018b\7\6\2\2\u0189\u018c\5R*\2\u018a\u018c\7;\2\2\u018b\u0189"+
		"\3\2\2\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\7\13\2\2"+
		"\u018eE\3\2\2\2\u018f\u0190\7\63\2\2\u0190\u0191\7\n\2\2\u0191\u0192\t"+
		"\2\2\2\u0192\u0193\7\13\2\2\u0193G\3\2\2\2\u0194\u0195\7\64\2\2\u0195"+
		"\u0196\7\n\2\2\u0196\u0197\t\2\2\2\u0197\u0198\7\13\2\2\u0198I\3\2\2\2"+
		"\u0199\u01a3\5P)\2\u019a\u019c\7\21\2\2\u019b\u019d\5L\'\2\u019c\u019b"+
		"\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a3\7\22\2\2"+
		"\u019f\u01a0\7\65\2\2\u01a0\u01a1\7\20\2\2\u01a1\u01a3\5P)\2\u01a2\u0199"+
		"\3\2\2\2\u01a2\u019a\3\2\2\2\u01a2\u019f\3\2\2\2\u01a3K\3\2\2\2\u01a4"+
		"\u01a9\5N(\2\u01a5\u01a6\7\6\2\2\u01a6\u01a8\5L\'\2\u01a7\u01a5\3\2\2"+
		"\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aaM"+
		"\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\7;\2\2\u01ad\u01ae\7\5\2\2\u01ae"+
		"\u01af\5P)\2\u01afO\3\2\2\2\u01b0\u01b1\t\3\2\2\u01b1Q\3\2\2\2\u01b2\u01b6"+
		"\78\2\2\u01b3\u01b5\t\4\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b6\3\2"+
		"\2\2\u01b9\u01ba\78\2\2\u01baS\3\2\2\2(Zjw}\u0082\u008a\u008c\u00a1\u00a6"+
		"\u00d2\u00e4\u00e9\u00ee\u00f3\u00f8\u00fd\u0102\u0107\u0109\u010e\u0113"+
		"\u0118\u011d\u0122\u0127\u012e\u0136\u0142\u0148\u0165\u0172\u017a\u0186"+
		"\u018b\u019c\u01a2\u01a9\u01b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}