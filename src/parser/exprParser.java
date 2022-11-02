// Generated from expr.g4 by ANTLR 4.9.2

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
		T__31=32, BINOP=33, INT=34, STR=35, ID=36, TYPE=37, TYPEID=38;
	public static final int
		RULE_expr = 0, RULE_expr_seq = 1, RULE_expr_list = 2, RULE_field_list = 3, 
		RULE_lvalue = 4, RULE_freturn = 5, RULE_decl_list = 6, RULE_decl = 7, 
		RULE_type_decl = 8, RULE_type = 9, RULE_type_fields = 10, RULE_type_field = 11, 
		RULE_variable_decl = 12, RULE_function_decl = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"expr", "expr_seq", "expr_list", "field_list", "lvalue", "freturn", "decl_list", 
			"decl", "type_decl", "type", "type_fields", "type_field", "variable_decl", 
			"function_decl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'nil'", "'-'", "':='", "'('", "')'", "'{'", "'}'", "'['", "'] of'", 
			"'if'", "'then'", "'else'", "'while'", "'do'", "'for'", "'to'", "'break'", 
			"'let'", "'in'", "'end'", "';'", "','", "'='", "'.'", "']'", "'return ('", 
			"'array of'", "':'", "'var'", "'function'", "') ='", "') :'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "BINOP", "INT", 
			"STR", "ID", "TYPE", "TYPEID"
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(exprParser.STR, 0); }
		public TerminalNode INT() { return getToken(exprParser.INT, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Expr_seqContext expr_seq() {
			return getRuleContext(Expr_seqContext.class,0);
		}
		public TerminalNode TYPEID() { return getToken(exprParser.TYPEID, 0); }
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public TerminalNode BINOP() { return getToken(exprParser.BINOP, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(29);
				match(STR);
				}
				break;
			case 2:
				{
				setState(30);
				match(INT);
				}
				break;
			case 3:
				{
				setState(31);
				match(T__0);
				}
				break;
			case 4:
				{
				setState(32);
				lvalue(0);
				}
				break;
			case 5:
				{
				setState(33);
				match(T__1);
				setState(34);
				expr(13);
				}
				break;
			case 6:
				{
				setState(35);
				lvalue(0);
				setState(36);
				match(T__2);
				setState(37);
				expr(11);
				}
				break;
			case 7:
				{
				setState(39);
				match(ID);
				setState(40);
				match(T__3);
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__9) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << INT) | (1L << STR) | (1L << ID) | (1L << TYPEID))) != 0)) {
					{
					setState(41);
					expr_list(0);
					}
				}

				setState(44);
				match(T__4);
				}
				break;
			case 8:
				{
				setState(45);
				match(T__3);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__9) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << INT) | (1L << STR) | (1L << ID) | (1L << TYPEID))) != 0)) {
					{
					setState(46);
					expr_seq(0);
					}
				}

				setState(49);
				match(T__4);
				}
				break;
			case 9:
				{
				setState(50);
				match(TYPEID);
				setState(51);
				match(T__5);
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(52);
					field_list(0);
					}
				}

				setState(55);
				match(T__6);
				}
				break;
			case 10:
				{
				setState(56);
				match(TYPEID);
				setState(57);
				match(T__7);
				setState(58);
				expr(0);
				setState(59);
				match(T__8);
				setState(60);
				expr(7);
				}
				break;
			case 11:
				{
				setState(62);
				match(T__9);
				setState(63);
				expr(0);
				setState(64);
				match(T__10);
				setState(65);
				expr(6);
				}
				break;
			case 12:
				{
				setState(67);
				match(T__9);
				setState(68);
				expr(0);
				setState(69);
				match(T__10);
				setState(70);
				expr(0);
				setState(71);
				match(T__11);
				setState(72);
				expr(5);
				}
				break;
			case 13:
				{
				setState(74);
				match(T__12);
				setState(75);
				expr(0);
				setState(76);
				match(T__13);
				setState(77);
				expr(4);
				}
				break;
			case 14:
				{
				setState(79);
				match(T__14);
				setState(80);
				match(ID);
				setState(81);
				match(T__2);
				setState(82);
				expr(0);
				setState(83);
				match(T__15);
				setState(84);
				expr(0);
				setState(85);
				match(T__13);
				setState(86);
				expr(3);
				}
				break;
			case 15:
				{
				setState(88);
				match(T__16);
				}
				break;
			case 16:
				{
				setState(89);
				match(T__17);
				setState(90);
				decl_list(0);
				setState(91);
				match(T__18);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__9) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << INT) | (1L << STR) | (1L << ID) | (1L << TYPEID))) != 0)) {
					{
					setState(92);
					expr_seq(0);
					}
				}

				setState(95);
				match(T__19);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(99);
					if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
					setState(100);
					match(BINOP);
					setState(101);
					expr(13);
					}
					} 
				}
				setState(106);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_seqContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_seqContext expr_seq() {
			return getRuleContext(Expr_seqContext.class,0);
		}
		public Expr_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_seq; }
	}

	public final Expr_seqContext expr_seq() throws RecognitionException {
		return expr_seq(0);
	}

	private Expr_seqContext expr_seq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_seqContext _localctx = new Expr_seqContext(_ctx, _parentState);
		Expr_seqContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr_seq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(108);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_seqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_seq);
					setState(110);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(111);
					match(T__20);
					setState(112);
					expr(0);
					}
					} 
				}
				setState(117);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_listContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		return expr_list(0);
	}

	private Expr_listContext expr_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_listContext _localctx = new Expr_listContext(_ctx, _parentState);
		Expr_listContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(119);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expr_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr_list);
					setState(121);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(122);
					match(T__21);
					setState(123);
					expr(0);
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Field_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Field_listContext field_list() {
			return getRuleContext(Field_listContext.class,0);
		}
		public Field_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_list; }
	}

	public final Field_listContext field_list() throws RecognitionException {
		return field_list(0);
	}

	private Field_listContext field_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Field_listContext _localctx = new Field_listContext(_ctx, _parentState);
		Field_listContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_field_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(130);
			match(ID);
			setState(131);
			match(T__22);
			setState(132);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Field_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_field_list);
					setState(134);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(135);
					match(T__21);
					setState(136);
					match(ID);
					setState(137);
					match(T__22);
					setState(138);
					expr(0);
					}
					} 
				}
				setState(143);
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	}

	public final LvalueContext lvalue() throws RecognitionException {
		return lvalue(0);
	}

	private LvalueContext lvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LvalueContext _localctx = new LvalueContext(_ctx, _parentState);
		LvalueContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(145);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(155);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(147);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(148);
						match(T__23);
						setState(149);
						match(ID);
						}
						break;
					case 2:
						{
						_localctx = new LvalueContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(150);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(151);
						match(T__7);
						setState(152);
						expr(0);
						setState(153);
						match(T__24);
						}
						break;
					}
					} 
				}
				setState(159);
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

	public static class FreturnContext extends ParserRuleContext {
		public Expr_seqContext expr_seq() {
			return getRuleContext(Expr_seqContext.class,0);
		}
		public FreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freturn; }
	}

	public final FreturnContext freturn() throws RecognitionException {
		FreturnContext _localctx = new FreturnContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_freturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__25);
			setState(161);
			expr_seq(0);
			setState(162);
			match(T__4);
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
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_list; }
	}

	public final Decl_listContext decl_list() throws RecognitionException {
		return decl_list(0);
	}

	private Decl_listContext decl_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Decl_listContext _localctx = new Decl_listContext(_ctx, _parentState);
		Decl_listContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_decl_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(165);
			decl();
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Decl_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_decl_list);
					setState(167);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(168);
					decl();
					}
					} 
				}
				setState(173);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public Type_declContext type_decl() {
			return getRuleContext(Type_declContext.class,0);
		}
		public Variable_declContext variable_decl() {
			return getRuleContext(Variable_declContext.class,0);
		}
		public Function_declContext function_decl() {
			return getRuleContext(Function_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decl);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				type_decl();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				variable_decl();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				function_decl();
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

	public static class Type_declContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(exprParser.TYPE, 0); }
		public TerminalNode TYPEID() { return getToken(exprParser.TYPEID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Type_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_decl; }
	}

	public final Type_declContext type_decl() throws RecognitionException {
		Type_declContext _localctx = new Type_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(TYPE);
			setState(180);
			match(TYPEID);
			setState(181);
			match(T__22);
			setState(182);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPEID() { return getToken(exprParser.TYPEID, 0); }
		public Type_fieldContext type_field() {
			return getRuleContext(Type_fieldContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPEID:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(TYPEID);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(T__5);
				setState(186);
				type_field();
				setState(187);
				match(T__6);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(T__26);
				setState(190);
				match(TYPEID);
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

	public static class Type_fieldsContext extends ParserRuleContext {
		public Type_fieldContext type_field() {
			return getRuleContext(Type_fieldContext.class,0);
		}
		public Type_fieldsContext type_fields() {
			return getRuleContext(Type_fieldsContext.class,0);
		}
		public Type_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_fields; }
	}

	public final Type_fieldsContext type_fields() throws RecognitionException {
		return type_fields(0);
	}

	private Type_fieldsContext type_fields(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_fieldsContext _localctx = new Type_fieldsContext(_ctx, _parentState);
		Type_fieldsContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_type_fields, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(194);
			type_field();
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type_fieldsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type_fields);
					setState(196);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(197);
					match(T__21);
					setState(198);
					type_field();
					}
					} 
				}
				setState(203);
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

	public static class Type_fieldContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public TerminalNode TYPEID() { return getToken(exprParser.TYPEID, 0); }
		public Type_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_field; }
	}

	public final Type_fieldContext type_field() throws RecognitionException {
		Type_fieldContext _localctx = new Type_fieldContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(ID);
			setState(205);
			match(T__27);
			setState(206);
			match(TYPEID);
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

	public static class Variable_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TYPEID() { return getToken(exprParser.TYPEID, 0); }
		public Variable_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_decl; }
	}

	public final Variable_declContext variable_decl() throws RecognitionException {
		Variable_declContext _localctx = new Variable_declContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable_decl);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(T__28);
				setState(209);
				match(ID);
				setState(210);
				match(T__2);
				setState(211);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(T__28);
				setState(213);
				match(ID);
				setState(214);
				match(T__27);
				setState(215);
				match(TYPEID);
				setState(216);
				match(T__2);
				setState(217);
				expr(0);
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

	public static class Function_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(exprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Type_fieldContext type_field() {
			return getRuleContext(Type_fieldContext.class,0);
		}
		public TerminalNode TYPEID() { return getToken(exprParser.TYPEID, 0); }
		public Function_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_decl; }
	}

	public final Function_declContext function_decl() throws RecognitionException {
		Function_declContext _localctx = new Function_declContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function_decl);
		int _la;
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(T__29);
				setState(221);
				match(ID);
				setState(222);
				match(T__3);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(223);
					type_field();
					}
				}

				setState(226);
				match(T__30);
				setState(227);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(T__29);
				setState(229);
				match(ID);
				setState(230);
				match(T__3);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(231);
					type_field();
					}
				}

				setState(234);
				match(T__31);
				setState(235);
				match(TYPEID);
				setState(236);
				match(T__22);
				setState(237);
				expr(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 1:
			return expr_seq_sempred((Expr_seqContext)_localctx, predIndex);
		case 2:
			return expr_list_sempred((Expr_listContext)_localctx, predIndex);
		case 3:
			return field_list_sempred((Field_listContext)_localctx, predIndex);
		case 4:
			return lvalue_sempred((LvalueContext)_localctx, predIndex);
		case 6:
			return decl_list_sempred((Decl_listContext)_localctx, predIndex);
		case 10:
			return type_fields_sempred((Type_fieldsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean expr_seq_sempred(Expr_seqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_list_sempred(Expr_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean field_list_sempred(Field_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean decl_list_sempred(Decl_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_fields_sempred(Type_fieldsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00f3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2-\n\2\3\2\3\2\3\2\5\2\62\n\2\3\2\3\2\3\2"+
		"\3\2\5\28\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2`\n\2\3\2\3\2\5\2d\n\2\3\2\3\2\3\2\7\2i"+
		"\n\2\f\2\16\2l\13\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3t\n\3\f\3\16\3w\13\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4\177\n\4\f\4\16\4\u0082\13\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u008e\n\5\f\5\16\5\u0091\13\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u009e\n\6\f\6\16\6\u00a1\13\6\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u00ac\n\b\f\b\16\b\u00af\13\b\3\t"+
		"\3\t\3\t\5\t\u00b4\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00c2\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ca\n\f\f\f\16"+
		"\f\u00cd\13\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00dd\n\16\3\17\3\17\3\17\3\17\5\17\u00e3\n\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u00eb\n\17\3\17\3\17\3\17\3\17\5\17\u00f1"+
		"\n\17\3\17\2\t\2\4\6\b\n\16\26\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\2\2\2\u0107\2c\3\2\2\2\4m\3\2\2\2\6x\3\2\2\2\b\u0083\3\2\2\2\n\u0092"+
		"\3\2\2\2\f\u00a2\3\2\2\2\16\u00a6\3\2\2\2\20\u00b3\3\2\2\2\22\u00b5\3"+
		"\2\2\2\24\u00c1\3\2\2\2\26\u00c3\3\2\2\2\30\u00ce\3\2\2\2\32\u00dc\3\2"+
		"\2\2\34\u00f0\3\2\2\2\36\37\b\2\1\2\37d\7%\2\2 d\7$\2\2!d\7\3\2\2\"d\5"+
		"\n\6\2#$\7\4\2\2$d\5\2\2\17%&\5\n\6\2&\'\7\5\2\2\'(\5\2\2\r(d\3\2\2\2"+
		")*\7&\2\2*,\7\6\2\2+-\5\6\4\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2.d\7\7\2\2"+
		"/\61\7\6\2\2\60\62\5\4\3\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63"+
		"d\7\7\2\2\64\65\7(\2\2\65\67\7\b\2\2\668\5\b\5\2\67\66\3\2\2\2\678\3\2"+
		"\2\289\3\2\2\29d\7\t\2\2:;\7(\2\2;<\7\n\2\2<=\5\2\2\2=>\7\13\2\2>?\5\2"+
		"\2\t?d\3\2\2\2@A\7\f\2\2AB\5\2\2\2BC\7\r\2\2CD\5\2\2\bDd\3\2\2\2EF\7\f"+
		"\2\2FG\5\2\2\2GH\7\r\2\2HI\5\2\2\2IJ\7\16\2\2JK\5\2\2\7Kd\3\2\2\2LM\7"+
		"\17\2\2MN\5\2\2\2NO\7\20\2\2OP\5\2\2\6Pd\3\2\2\2QR\7\21\2\2RS\7&\2\2S"+
		"T\7\5\2\2TU\5\2\2\2UV\7\22\2\2VW\5\2\2\2WX\7\20\2\2XY\5\2\2\5Yd\3\2\2"+
		"\2Zd\7\23\2\2[\\\7\24\2\2\\]\5\16\b\2]_\7\25\2\2^`\5\4\3\2_^\3\2\2\2_"+
		"`\3\2\2\2`a\3\2\2\2ab\7\26\2\2bd\3\2\2\2c\36\3\2\2\2c \3\2\2\2c!\3\2\2"+
		"\2c\"\3\2\2\2c#\3\2\2\2c%\3\2\2\2c)\3\2\2\2c/\3\2\2\2c\64\3\2\2\2c:\3"+
		"\2\2\2c@\3\2\2\2cE\3\2\2\2cL\3\2\2\2cQ\3\2\2\2cZ\3\2\2\2c[\3\2\2\2dj\3"+
		"\2\2\2ef\f\16\2\2fg\7#\2\2gi\5\2\2\17he\3\2\2\2il\3\2\2\2jh\3\2\2\2jk"+
		"\3\2\2\2k\3\3\2\2\2lj\3\2\2\2mn\b\3\1\2no\5\2\2\2ou\3\2\2\2pq\f\3\2\2"+
		"qr\7\27\2\2rt\5\2\2\2sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\5\3\2\2"+
		"\2wu\3\2\2\2xy\b\4\1\2yz\5\2\2\2z\u0080\3\2\2\2{|\f\3\2\2|}\7\30\2\2}"+
		"\177\5\2\2\2~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\7\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\b\5\1\2\u0084\u0085"+
		"\7&\2\2\u0085\u0086\7\31\2\2\u0086\u0087\5\2\2\2\u0087\u008f\3\2\2\2\u0088"+
		"\u0089\f\3\2\2\u0089\u008a\7\30\2\2\u008a\u008b\7&\2\2\u008b\u008c\7\31"+
		"\2\2\u008c\u008e\5\2\2\2\u008d\u0088\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\t\3\2\2\2\u0091\u008f\3\2\2\2"+
		"\u0092\u0093\b\6\1\2\u0093\u0094\7&\2\2\u0094\u009f\3\2\2\2\u0095\u0096"+
		"\f\4\2\2\u0096\u0097\7\32\2\2\u0097\u009e\7&\2\2\u0098\u0099\f\3\2\2\u0099"+
		"\u009a\7\n\2\2\u009a\u009b\5\2\2\2\u009b\u009c\7\33\2\2\u009c\u009e\3"+
		"\2\2\2\u009d\u0095\3\2\2\2\u009d\u0098\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\13\3\2\2\2\u00a1\u009f\3\2\2"+
		"\2\u00a2\u00a3\7\34\2\2\u00a3\u00a4\5\4\3\2\u00a4\u00a5\7\7\2\2\u00a5"+
		"\r\3\2\2\2\u00a6\u00a7\b\b\1\2\u00a7\u00a8\5\20\t\2\u00a8\u00ad\3\2\2"+
		"\2\u00a9\u00aa\f\3\2\2\u00aa\u00ac\5\20\t\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\17\3\2\2"+
		"\2\u00af\u00ad\3\2\2\2\u00b0\u00b4\5\22\n\2\u00b1\u00b4\5\32\16\2\u00b2"+
		"\u00b4\5\34\17\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3"+
		"\2\2\2\u00b4\21\3\2\2\2\u00b5\u00b6\7\'\2\2\u00b6\u00b7\7(\2\2\u00b7\u00b8"+
		"\7\31\2\2\u00b8\u00b9\5\24\13\2\u00b9\23\3\2\2\2\u00ba\u00c2\7(\2\2\u00bb"+
		"\u00bc\7\b\2\2\u00bc\u00bd\5\30\r\2\u00bd\u00be\7\t\2\2\u00be\u00c2\3"+
		"\2\2\2\u00bf\u00c0\7\35\2\2\u00c0\u00c2\7(\2\2\u00c1\u00ba\3\2\2\2\u00c1"+
		"\u00bb\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\25\3\2\2\2\u00c3\u00c4\b\f\1"+
		"\2\u00c4\u00c5\5\30\r\2\u00c5\u00cb\3\2\2\2\u00c6\u00c7\f\3\2\2\u00c7"+
		"\u00c8\7\30\2\2\u00c8\u00ca\5\30\r\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3"+
		"\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\27\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00cf\7&\2\2\u00cf\u00d0\7\36\2\2\u00d0\u00d1\7("+
		"\2\2\u00d1\31\3\2\2\2\u00d2\u00d3\7\37\2\2\u00d3\u00d4\7&\2\2\u00d4\u00d5"+
		"\7\5\2\2\u00d5\u00dd\5\2\2\2\u00d6\u00d7\7\37\2\2\u00d7\u00d8\7&\2\2\u00d8"+
		"\u00d9\7\36\2\2\u00d9\u00da\7(\2\2\u00da\u00db\7\5\2\2\u00db\u00dd\5\2"+
		"\2\2\u00dc\u00d2\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dd\33\3\2\2\2\u00de\u00df"+
		"\7 \2\2\u00df\u00e0\7&\2\2\u00e0\u00e2\7\6\2\2\u00e1\u00e3\5\30\r\2\u00e2"+
		"\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7!"+
		"\2\2\u00e5\u00f1\5\2\2\2\u00e6\u00e7\7 \2\2\u00e7\u00e8\7&\2\2\u00e8\u00ea"+
		"\7\6\2\2\u00e9\u00eb\5\30\r\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2"+
		"\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7\"\2\2\u00ed\u00ee\7(\2\2\u00ee\u00ef"+
		"\7\31\2\2\u00ef\u00f1\5\2\2\2\u00f0\u00de\3\2\2\2\u00f0\u00e6\3\2\2\2"+
		"\u00f1\35\3\2\2\2\25,\61\67_cju\u0080\u008f\u009d\u009f\u00ad\u00b3\u00c1"+
		"\u00cb\u00dc\u00e2\u00ea\u00f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}