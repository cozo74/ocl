// Generated from OCLfo.g4 by ANTLR 4.13.2

    package nju.ics.antlr.oclfo;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class OCLfoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

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
		T__45=46, T__46=47, T__47=48, T__48=49, INT=50, NEWLINE=51, WS=52, ID=53;
	public static final int
		RULE_invariant = 0, RULE_oclBool = 1, RULE_oclNavigation = 2, RULE_oclSet = 3, 
		RULE_oclSingle = 4, RULE_oclObject = 5, RULE_oclValue = 6, RULE_boolOp = 7, 
		RULE_compOp = 8, RULE_varList = 9, RULE_constant = 10, RULE_var = 11, 
		RULE_class = 12, RULE_assoClass = 13, RULE_fAssoClass = 14, RULE_nfAssoClass = 15, 
		RULE_role = 16, RULE_fRole = 17, RULE_nfRole = 18, RULE_attr = 19, RULE_bAttr = 20, 
		RULE_fAttr = 21, RULE_nfAttr = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"invariant", "oclBool", "oclNavigation", "oclSet", "oclSingle", "oclObject", 
			"oclValue", "boolOp", "compOp", "varList", "constant", "var", "class", 
			"assoClass", "fAssoClass", "nfAssoClass", "role", "fRole", "nfRole", 
			"attr", "bAttr", "fAttr", "nfAttr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'context'", "'inv'", "':'", "';'", "'not'", "'->includesAll('", 
			"')'", "'->excludesAll('", "'->includes('", "'->excludes('", "'->forAll('", 
			"'|'", "'->exists('", "'->isEmpty()'", "'->notEmpty()'", "'->size()'", 
			"'->one('", "'->isUnique('", "'.oclIsKindOf('", "'.oclIsTypeOf('", "'='", 
			"'null'", "'<>'", "'.'", "'('", "'->union('", "'->intersection('", "'->symmetricDifference('", 
			"'-'", "'->select('", "'->reject('", "'->selectByKind('", "'->selectByType('", 
			"'['", "']'", "'.allInstances()'", "'.oclAsType('", "'self'", "'->min()'", 
			"'->max()'", "'and'", "'or'", "'xor'", "'implies'", "'<'", "'<='", "'>='", 
			"'>'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INT", "NEWLINE", "WS", "ID"
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
	public String getGrammarFileName() { return "OCLfo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OCLfoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InvariantContext extends ParserRuleContext {
		public InvariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invariant; }
	 
		public InvariantContext() { }
		public void copyFrom(InvariantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InvExprContext extends InvariantContext {
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public OclBoolContext oclBool() {
			return getRuleContext(OclBoolContext.class,0);
		}
		public InvExprContext(InvariantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitInvExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvariantContext invariant() throws RecognitionException {
		InvariantContext _localctx = new InvariantContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_invariant);
		try {
			_localctx = new InvExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__0);
			setState(47);
			class_();
			setState(48);
			match(T__1);
			setState(49);
			match(T__2);
			setState(50);
			oclBool(0);
			setState(51);
			match(T__3);
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
	public static class OclBoolContext extends ParserRuleContext {
		public OclBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclBool; }
	 
		public OclBoolContext() { }
		public void copyFrom(OclBoolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsEmptyContext extends OclBoolContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public IsEmptyContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitIsEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExcludesAllContext extends OclBoolContext {
		public List<OclSetContext> oclSet() {
			return getRuleContexts(OclSetContext.class);
		}
		public OclSetContext oclSet(int i) {
			return getRuleContext(OclSetContext.class,i);
		}
		public ExcludesAllContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitExcludesAll(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OclBoolBoolOpContext extends OclBoolContext {
		public List<OclBoolContext> oclBool() {
			return getRuleContexts(OclBoolContext.class);
		}
		public OclBoolContext oclBool(int i) {
			return getRuleContext(OclBoolContext.class,i);
		}
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public OclBoolBoolOpContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitOclBoolBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NavEqualContext extends OclBoolContext {
		public List<OclNavigationContext> oclNavigation() {
			return getRuleContexts(OclNavigationContext.class);
		}
		public OclNavigationContext oclNavigation(int i) {
			return getRuleContext(OclNavigationContext.class,i);
		}
		public NavEqualContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitNavEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SizeContext extends OclBoolContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public TerminalNode INT() { return getToken(OCLfoParser.INT, 0); }
		public SizeContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueCompContext extends OclBoolContext {
		public List<OclValueContext> oclValue() {
			return getRuleContexts(OclValueContext.class);
		}
		public OclValueContext oclValue(int i) {
			return getRuleContext(OclValueContext.class,i);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public ValueCompContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitValueComp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OneContext extends OclBoolContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public OclBoolContext oclBool() {
			return getRuleContext(OclBoolContext.class,0);
		}
		public OneContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitOne(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OclSingleIsNotNullContext extends OclBoolContext {
		public OclSingleContext oclSingle() {
			return getRuleContext(OclSingleContext.class,0);
		}
		public OclSingleIsNotNullContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitOclSingleIsNotNull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncludesAllContext extends OclBoolContext {
		public List<OclSetContext> oclSet() {
			return getRuleContexts(OclSetContext.class);
		}
		public OclSetContext oclSet(int i) {
			return getRuleContext(OclSetContext.class,i);
		}
		public IncludesAllContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitIncludesAll(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExcludesContext extends OclBoolContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public OclSingleContext oclSingle() {
			return getRuleContext(OclSingleContext.class,0);
		}
		public ExcludesContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitExcludes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotOclBoolContext extends OclBoolContext {
		public OclBoolContext oclBool() {
			return getRuleContext(OclBoolContext.class,0);
		}
		public NotOclBoolContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitNotOclBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectBAttrContext extends OclBoolContext {
		public OclObjectContext oclObject() {
			return getRuleContext(OclObjectContext.class,0);
		}
		public BAttrContext bAttr() {
			return getRuleContext(BAttrContext.class,0);
		}
		public ObjectBAttrContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitObjectBAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OclSingleIsNullContext extends OclBoolContext {
		public OclSingleContext oclSingle() {
			return getRuleContext(OclSingleContext.class,0);
		}
		public OclSingleIsNullContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitOclSingleIsNull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncludesContext extends OclBoolContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public OclSingleContext oclSingle() {
			return getRuleContext(OclSingleContext.class,0);
		}
		public IncludesContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitIncludes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OclBoolParenContext extends OclBoolContext {
		public OclBoolContext oclBool() {
			return getRuleContext(OclBoolContext.class,0);
		}
		public OclBoolParenContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitOclBoolParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NavNotEqualContext extends OclBoolContext {
		public List<OclNavigationContext> oclNavigation() {
			return getRuleContexts(OclNavigationContext.class);
		}
		public OclNavigationContext oclNavigation(int i) {
			return getRuleContext(OclNavigationContext.class,i);
		}
		public NavNotEqualContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitNavNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExistsContext extends OclBoolContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public OclBoolContext oclBool() {
			return getRuleContext(OclBoolContext.class,0);
		}
		public ExistsContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsUniqueContext extends OclBoolContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public IsUniqueContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitIsUnique(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEmptyContext extends OclBoolContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public NotEmptyContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitNotEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OclVarContext extends OclBoolContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public OclVarContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitOclVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForAllContext extends OclBoolContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public OclBoolContext oclBool() {
			return getRuleContext(OclBoolContext.class,0);
		}
		public ForAllContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitForAll(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OclIsKindOfContext extends OclBoolContext {
		public OclObjectContext oclObject() {
			return getRuleContext(OclObjectContext.class,0);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public OclIsKindOfContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitOclIsKindOf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OclIsTypeOfContext extends OclBoolContext {
		public OclObjectContext oclObject() {
			return getRuleContext(OclObjectContext.class,0);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public OclIsTypeOfContext(OclBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitOclIsTypeOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclBoolContext oclBool() throws RecognitionException {
		return oclBool(0);
	}

	private OclBoolContext oclBool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OclBoolContext _localctx = new OclBoolContext(_ctx, _parentState);
		OclBoolContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_oclBool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new NotOclBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(54);
				match(T__4);
				setState(55);
				oclBool(22);
				}
				break;
			case 2:
				{
				_localctx = new IncludesAllContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				oclSet(0);
				setState(57);
				match(T__5);
				setState(58);
				oclSet(0);
				setState(59);
				match(T__6);
				}
				break;
			case 3:
				{
				_localctx = new ExcludesAllContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				oclSet(0);
				setState(62);
				match(T__7);
				setState(63);
				oclSet(0);
				setState(64);
				match(T__6);
				}
				break;
			case 4:
				{
				_localctx = new IncludesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				oclSet(0);
				setState(67);
				match(T__8);
				setState(68);
				oclSingle();
				setState(69);
				match(T__6);
				}
				break;
			case 5:
				{
				_localctx = new ExcludesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				oclSet(0);
				setState(72);
				match(T__9);
				setState(73);
				oclSingle();
				setState(74);
				match(T__6);
				}
				break;
			case 6:
				{
				_localctx = new ForAllContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				oclSet(0);
				setState(77);
				match(T__10);
				setState(78);
				varList();
				setState(79);
				match(T__11);
				setState(80);
				oclBool(0);
				setState(81);
				match(T__6);
				}
				break;
			case 7:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				oclSet(0);
				setState(84);
				match(T__12);
				setState(85);
				varList();
				setState(86);
				match(T__11);
				setState(87);
				oclBool(0);
				setState(88);
				match(T__6);
				}
				break;
			case 8:
				{
				_localctx = new IsEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				oclSet(0);
				setState(91);
				match(T__13);
				}
				break;
			case 9:
				{
				_localctx = new NotEmptyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				oclSet(0);
				setState(94);
				match(T__14);
				}
				break;
			case 10:
				{
				_localctx = new SizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				oclSet(0);
				setState(97);
				match(T__15);
				setState(98);
				compOp();
				setState(99);
				match(INT);
				}
				break;
			case 11:
				{
				_localctx = new OneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				oclSet(0);
				setState(102);
				match(T__16);
				setState(103);
				var();
				setState(104);
				match(T__11);
				setState(105);
				oclBool(0);
				setState(106);
				match(T__6);
				}
				break;
			case 12:
				{
				_localctx = new IsUniqueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				oclSet(0);
				setState(109);
				match(T__17);
				setState(110);
				attr();
				setState(111);
				match(T__6);
				}
				break;
			case 13:
				{
				_localctx = new OclIsKindOfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				oclObject(0);
				setState(114);
				match(T__18);
				setState(115);
				class_();
				setState(116);
				match(T__6);
				}
				break;
			case 14:
				{
				_localctx = new OclIsTypeOfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				oclObject(0);
				setState(119);
				match(T__19);
				setState(120);
				class_();
				setState(121);
				match(T__6);
				}
				break;
			case 15:
				{
				_localctx = new OclSingleIsNullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				oclSingle();
				setState(124);
				match(T__20);
				setState(125);
				match(T__21);
				}
				break;
			case 16:
				{
				_localctx = new OclSingleIsNotNullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				oclSingle();
				setState(128);
				match(T__22);
				setState(129);
				match(T__21);
				}
				break;
			case 17:
				{
				_localctx = new NavEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				oclNavigation();
				setState(132);
				match(T__20);
				setState(133);
				oclNavigation();
				}
				break;
			case 18:
				{
				_localctx = new NavNotEqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				oclNavigation();
				setState(136);
				match(T__22);
				setState(137);
				oclNavigation();
				}
				break;
			case 19:
				{
				_localctx = new ValueCompContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				oclValue();
				setState(140);
				compOp();
				setState(141);
				oclValue();
				}
				break;
			case 20:
				{
				_localctx = new ObjectBAttrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				oclObject(0);
				setState(144);
				match(T__23);
				setState(145);
				bAttr();
				}
				break;
			case 21:
				{
				_localctx = new OclVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				var();
				}
				break;
			case 22:
				{
				_localctx = new OclBoolParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(T__24);
				setState(149);
				oclBool(0);
				setState(150);
				match(T__6);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OclBoolBoolOpContext(new OclBoolContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_oclBool);
					setState(154);
					if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
					setState(155);
					boolOp();
					setState(156);
					oclBool(24);
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
	public static class OclNavigationContext extends ParserRuleContext {
		public OclNavigationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclNavigation; }
	 
		public OclNavigationContext() { }
		public void copyFrom(OclNavigationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetContext extends OclNavigationContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public SetContext(OclNavigationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleContext extends OclNavigationContext {
		public OclSingleContext oclSingle() {
			return getRuleContext(OclSingleContext.class,0);
		}
		public SingleContext(OclNavigationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclNavigationContext oclNavigation() throws RecognitionException {
		OclNavigationContext _localctx = new OclNavigationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_oclNavigation);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new SetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				oclSet(0);
				}
				break;
			case 2:
				_localctx = new SingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				oclSingle();
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
	public static class OclSetContext extends ParserRuleContext {
		public OclSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclSet; }
	 
		public OclSetContext() { }
		public void copyFrom(OclSetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntersectionContext extends OclSetContext {
		public List<OclSetContext> oclSet() {
			return getRuleContexts(OclSetContext.class);
		}
		public OclSetContext oclSet(int i) {
			return getRuleContext(OclSetContext.class,i);
		}
		public IntersectionContext(OclSetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitIntersection(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectByKindContext extends OclSetContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public SelectByKindContext(OclSetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitSelectByKind(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NfAssoClassAndRoleContext extends OclSetContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public NfAssoClassContext nfAssoClass() {
			return getRuleContext(NfAssoClassContext.class,0);
		}
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public NfAssoClassAndRoleContext(OclSetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitNfAssoClassAndRole(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DifferenceContext extends OclSetContext {
		public List<OclSetContext> oclSet() {
			return getRuleContexts(OclSetContext.class);
		}
		public OclSetContext oclSet(int i) {
			return getRuleContext(OclSetContext.class,i);
		}
		public DifferenceContext(OclSetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitDifference(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectByTypeContext extends OclSetContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public SelectByTypeContext(OclSetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitSelectByType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NfRoleAndRoleContext extends OclSetContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public NfRoleContext nfRole() {
			return getRuleContext(NfRoleContext.class,0);
		}
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public NfRoleAndRoleContext(OclSetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitNfRoleAndRole(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnionContext extends OclSetContext {
		public List<OclSetContext> oclSet() {
			return getRuleContexts(OclSetContext.class);
		}
		public OclSetContext oclSet(int i) {
			return getRuleContext(OclSetContext.class,i);
		}
		public UnionContext(OclSetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitUnion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RejectContext extends OclSetContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public OclBoolContext oclBool() {
			return getRuleContext(OclBoolContext.class,0);
		}
		public RejectContext(OclSetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitReject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssoClassAndRoleContext extends OclSetContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public AssoClassContext assoClass() {
			return getRuleContext(AssoClassContext.class,0);
		}
		public RoleContext role() {
			return getRuleContext(RoleContext.class,0);
		}
		public AssoClassAndRoleContext(OclSetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitAssoClassAndRole(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RoleAndRoleContext extends OclSetContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public List<RoleContext> role() {
			return getRuleContexts(RoleContext.class);
		}
		public RoleContext role(int i) {
			return getRuleContext(RoleContext.class,i);
		}
		public RoleAndRoleContext(OclSetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitRoleAndRole(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrOfSetContext extends OclSetContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public AttrOfSetContext(OclSetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitAttrOfSet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectContext extends OclSetContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public OclBoolContext oclBool() {
			return getRuleContext(OclBoolContext.class,0);
		}
		public SelectContext(OclSetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SymmetricDifferenceContext extends OclSetContext {
		public List<OclSetContext> oclSet() {
			return getRuleContexts(OclSetContext.class);
		}
		public OclSetContext oclSet(int i) {
			return getRuleContext(OclSetContext.class,i);
		}
		public SymmetricDifferenceContext(OclSetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitSymmetricDifference(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NfAttrOfObjectContext extends OclSetContext {
		public OclObjectContext oclObject() {
			return getRuleContext(OclObjectContext.class,0);
		}
		public NfAttrContext nfAttr() {
			return getRuleContext(NfAttrContext.class,0);
		}
		public NfAttrOfObjectContext(OclSetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitNfAttrOfObject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AllInstancesContext extends OclSetContext {
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public AllInstancesContext(OclSetContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitAllInstances(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclSetContext oclSet() throws RecognitionException {
		return oclSet(0);
	}

	private OclSetContext oclSet(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OclSetContext _localctx = new OclSetContext(_ctx, _parentState);
		OclSetContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_oclSet, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new NfAttrOfObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(168);
				oclObject(0);
				setState(169);
				match(T__23);
				setState(170);
				nfAttr();
				}
				break;
			case 2:
				{
				_localctx = new AllInstancesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				class_();
				setState(173);
				match(T__35);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new DifferenceContext(new OclSetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oclSet);
						setState(177);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(178);
						match(T__28);
						setState(179);
						oclSet(13);
						}
						break;
					case 2:
						{
						_localctx = new UnionContext(new OclSetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oclSet);
						setState(180);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(181);
						match(T__25);
						setState(182);
						oclSet(0);
						setState(183);
						match(T__6);
						}
						break;
					case 3:
						{
						_localctx = new IntersectionContext(new OclSetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oclSet);
						setState(185);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(186);
						match(T__26);
						setState(187);
						oclSet(0);
						setState(188);
						match(T__6);
						}
						break;
					case 4:
						{
						_localctx = new SymmetricDifferenceContext(new OclSetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oclSet);
						setState(190);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(191);
						match(T__27);
						setState(192);
						oclSet(0);
						setState(193);
						match(T__6);
						}
						break;
					case 5:
						{
						_localctx = new SelectContext(new OclSetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oclSet);
						setState(195);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(196);
						match(T__29);
						setState(197);
						var();
						setState(198);
						match(T__11);
						setState(199);
						oclBool(0);
						setState(200);
						match(T__6);
						}
						break;
					case 6:
						{
						_localctx = new RejectContext(new OclSetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oclSet);
						setState(202);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(203);
						match(T__30);
						setState(204);
						var();
						setState(205);
						match(T__11);
						setState(206);
						oclBool(0);
						setState(207);
						match(T__6);
						}
						break;
					case 7:
						{
						_localctx = new SelectByKindContext(new OclSetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oclSet);
						setState(209);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(210);
						match(T__31);
						setState(211);
						class_();
						setState(212);
						match(T__6);
						}
						break;
					case 8:
						{
						_localctx = new SelectByTypeContext(new OclSetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oclSet);
						setState(214);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(215);
						match(T__32);
						setState(216);
						class_();
						setState(217);
						match(T__6);
						}
						break;
					case 9:
						{
						_localctx = new RoleAndRoleContext(new OclSetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oclSet);
						setState(219);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(220);
						match(T__23);
						setState(221);
						role();
						setState(222);
						match(T__33);
						setState(223);
						role();
						setState(224);
						match(T__34);
						}
						break;
					case 10:
						{
						_localctx = new AssoClassAndRoleContext(new OclSetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oclSet);
						setState(226);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(227);
						match(T__23);
						setState(228);
						assoClass();
						setState(229);
						match(T__33);
						setState(230);
						role();
						setState(231);
						match(T__34);
						}
						break;
					case 11:
						{
						_localctx = new NfRoleAndRoleContext(new OclSetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oclSet);
						setState(233);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(234);
						match(T__23);
						setState(235);
						nfRole();
						setState(236);
						match(T__33);
						setState(237);
						role();
						setState(238);
						match(T__34);
						}
						break;
					case 12:
						{
						_localctx = new NfAssoClassAndRoleContext(new OclSetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oclSet);
						setState(240);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(241);
						match(T__23);
						setState(242);
						nfAssoClass();
						setState(243);
						match(T__33);
						setState(244);
						role();
						setState(245);
						match(T__34);
						}
						break;
					case 13:
						{
						_localctx = new AttrOfSetContext(new OclSetContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oclSet);
						setState(247);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(248);
						match(T__23);
						setState(249);
						attr();
						}
						break;
					}
					} 
				}
				setState(254);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OclSingleContext extends ParserRuleContext {
		public OclSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclSingle; }
	 
		public OclSingleContext() { }
		public void copyFrom(OclSingleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueOfSingleContext extends OclSingleContext {
		public OclValueContext oclValue() {
			return getRuleContext(OclValueContext.class,0);
		}
		public ValueOfSingleContext(OclSingleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitValueOfSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectOfSingleContext extends OclSingleContext {
		public OclObjectContext oclObject() {
			return getRuleContext(OclObjectContext.class,0);
		}
		public ObjectOfSingleContext(OclSingleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitObjectOfSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclSingleContext oclSingle() throws RecognitionException {
		OclSingleContext _localctx = new OclSingleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_oclSingle);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ObjectOfSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				oclObject(0);
				}
				break;
			case 2:
				_localctx = new ValueOfSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				oclValue();
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
	public static class OclObjectContext extends ParserRuleContext {
		public OclObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclObject; }
	 
		public OclObjectContext() { }
		public void copyFrom(OclObjectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectVarContext extends OclObjectContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ObjectVarContext(OclObjectContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitObjectVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfContext extends OclObjectContext {
		public SelfContext(OclObjectContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitSelf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FAssoClassOfObjectContext extends OclObjectContext {
		public OclObjectContext oclObject() {
			return getRuleContext(OclObjectContext.class,0);
		}
		public FAssoClassContext fAssoClass() {
			return getRuleContext(FAssoClassContext.class,0);
		}
		public FAssoClassOfObjectContext(OclObjectContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitFAssoClassOfObject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OclAsTypeContext extends OclObjectContext {
		public OclObjectContext oclObject() {
			return getRuleContext(OclObjectContext.class,0);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public OclAsTypeContext(OclObjectContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitOclAsType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FRoleOfObjectContext extends OclObjectContext {
		public OclObjectContext oclObject() {
			return getRuleContext(OclObjectContext.class,0);
		}
		public FRoleContext fRole() {
			return getRuleContext(FRoleContext.class,0);
		}
		public FRoleOfObjectContext(OclObjectContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitFRoleOfObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclObjectContext oclObject() throws RecognitionException {
		return oclObject(0);
	}

	private OclObjectContext oclObject(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OclObjectContext _localctx = new OclObjectContext(_ctx, _parentState);
		OclObjectContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_oclObject, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new ObjectVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(260);
				var();
				}
				break;
			case T__37:
				{
				_localctx = new SelfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261);
				match(T__37);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(275);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new OclAsTypeContext(new OclObjectContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oclObject);
						setState(264);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(265);
						match(T__36);
						setState(266);
						class_();
						setState(267);
						match(T__6);
						}
						break;
					case 2:
						{
						_localctx = new FRoleOfObjectContext(new OclObjectContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oclObject);
						setState(269);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(270);
						match(T__23);
						setState(271);
						fRole();
						}
						break;
					case 3:
						{
						_localctx = new FAssoClassOfObjectContext(new OclObjectContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_oclObject);
						setState(272);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(273);
						match(T__23);
						setState(274);
						fAssoClass();
						}
						break;
					}
					} 
				}
				setState(279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
	public static class OclValueContext extends ParserRuleContext {
		public OclValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclValue; }
	 
		public OclValueContext() { }
		public void copyFrom(OclValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MaxOfSetContext extends OclValueContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public MaxOfSetContext(OclValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitMaxOfSet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FAttrOfObjectContext extends OclValueContext {
		public OclObjectContext oclObject() {
			return getRuleContext(OclObjectContext.class,0);
		}
		public FAttrContext fAttr() {
			return getRuleContext(FAttrContext.class,0);
		}
		public FAttrOfObjectContext(OclValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitFAttrOfObject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueVarContext extends OclValueContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ValueVarContext(OclValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitValueVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstantValueContext extends OclValueContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantValueContext(OclValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitConstantValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinOfSetContext extends OclValueContext {
		public OclSetContext oclSet() {
			return getRuleContext(OclSetContext.class,0);
		}
		public MinOfSetContext(OclValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitMinOfSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OclValueContext oclValue() throws RecognitionException {
		OclValueContext _localctx = new OclValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_oclValue);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ConstantValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				constant();
				}
				break;
			case 2:
				_localctx = new ValueVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				var();
				}
				break;
			case 3:
				_localctx = new FAttrOfObjectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				oclObject(0);
				setState(283);
				match(T__23);
				setState(284);
				fAttr();
				}
				break;
			case 4:
				_localctx = new MinOfSetContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				oclSet(0);
				setState(287);
				match(T__38);
				}
				break;
			case 5:
				_localctx = new MaxOfSetContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(289);
				oclSet(0);
				setState(290);
				match(T__39);
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
	public static class BoolOpContext extends ParserRuleContext {
		public BoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOp; }
	 
		public BoolOpContext() { }
		public void copyFrom(BoolOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends BoolOpContext {
		public OrContext(BoolOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImpliesContext extends BoolOpContext {
		public ImpliesContext(BoolOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitImplies(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends BoolOpContext {
		public AndContext(BoolOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XorContext extends BoolOpContext {
		public XorContext(BoolOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitXor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolOpContext boolOp() throws RecognitionException {
		BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolOp);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(T__40);
				}
				break;
			case T__41:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(T__41);
				}
				break;
			case T__42:
				_localctx = new XorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(T__42);
				}
				break;
			case T__43:
				_localctx = new ImpliesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				match(T__43);
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
	public static class CompOpContext extends ParserRuleContext {
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
	 
		public CompOpContext() { }
		public void copyFrom(CompOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanContext extends CompOpContext {
		public LessThanContext(CompOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEqualContext extends CompOpContext {
		public NotEqualContext(CompOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitNotEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanOrEqualContext extends CompOpContext {
		public LessThanOrEqualContext(CompOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitLessThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualContext extends CompOpContext {
		public EqualContext(CompOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanContext extends CompOpContext {
		public GreaterThanContext(CompOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanOrEqualContext extends CompOpContext {
		public GreaterThanOrEqualContext(CompOpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitGreaterThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compOp);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(T__44);
				}
				break;
			case T__45:
				_localctx = new LessThanOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				match(T__45);
				}
				break;
			case T__20:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				match(T__20);
				}
				break;
			case T__46:
				_localctx = new GreaterThanOrEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				match(T__46);
				}
				break;
			case T__47:
				_localctx = new GreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				match(T__47);
				}
				break;
			case T__22:
				_localctx = new NotEqualContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(305);
				match(T__22);
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
	public static class VarListContext extends ParserRuleContext {
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
	 
		public VarListContext() { }
		public void copyFrom(VarListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarListValueContext extends VarListContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarListValueContext(VarListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitVarListValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varList);
		int _la;
		try {
			_localctx = new VarListValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			var();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__48) {
				{
				{
				setState(309);
				match(T__48);
				setState(310);
				var();
				}
				}
				setState(315);
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
	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstantIDContext extends ConstantContext {
		public TerminalNode ID() { return getToken(OCLfoParser.ID, 0); }
		public ConstantIDContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitConstantID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constant);
		try {
			_localctx = new ConstantIDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
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
	public static class VarContext extends ParserRuleContext {
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	 
		public VarContext() { }
		public void copyFrom(VarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarIDContext extends VarContext {
		public TerminalNode ID() { return getToken(OCLfoParser.ID, 0); }
		public VarIDContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitVarID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var);
		try {
			_localctx = new VarIDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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
	public static class ClassContext extends ParserRuleContext {
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
	 
		public ClassContext() { }
		public void copyFrom(ClassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassIDContext extends ClassContext {
		public TerminalNode ID() { return getToken(OCLfoParser.ID, 0); }
		public ClassIDContext(ClassContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitClassID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_class);
		try {
			_localctx = new ClassIDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
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
	public static class AssoClassContext extends ParserRuleContext {
		public AssoClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assoClass; }
	 
		public AssoClassContext() { }
		public void copyFrom(AssoClassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssoClassIDContext extends AssoClassContext {
		public TerminalNode ID() { return getToken(OCLfoParser.ID, 0); }
		public AssoClassIDContext(AssoClassContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitAssoClassID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssoClassContext assoClass() throws RecognitionException {
		AssoClassContext _localctx = new AssoClassContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assoClass);
		try {
			_localctx = new AssoClassIDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
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
	public static class FAssoClassContext extends ParserRuleContext {
		public FAssoClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fAssoClass; }
	 
		public FAssoClassContext() { }
		public void copyFrom(FAssoClassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FAssoClassIDContext extends FAssoClassContext {
		public TerminalNode ID() { return getToken(OCLfoParser.ID, 0); }
		public FAssoClassIDContext(FAssoClassContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitFAssoClassID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FAssoClassContext fAssoClass() throws RecognitionException {
		FAssoClassContext _localctx = new FAssoClassContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fAssoClass);
		try {
			_localctx = new FAssoClassIDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
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
	public static class NfAssoClassContext extends ParserRuleContext {
		public NfAssoClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nfAssoClass; }
	 
		public NfAssoClassContext() { }
		public void copyFrom(NfAssoClassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NfAssoClassIDContext extends NfAssoClassContext {
		public TerminalNode ID() { return getToken(OCLfoParser.ID, 0); }
		public NfAssoClassIDContext(NfAssoClassContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitNfAssoClassID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NfAssoClassContext nfAssoClass() throws RecognitionException {
		NfAssoClassContext _localctx = new NfAssoClassContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nfAssoClass);
		try {
			_localctx = new NfAssoClassIDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
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
	public static class RoleContext extends ParserRuleContext {
		public RoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role; }
	 
		public RoleContext() { }
		public void copyFrom(RoleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RoleIDContext extends RoleContext {
		public TerminalNode ID() { return getToken(OCLfoParser.ID, 0); }
		public RoleIDContext(RoleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitRoleID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoleContext role() throws RecognitionException {
		RoleContext _localctx = new RoleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_role);
		try {
			_localctx = new RoleIDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
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
	public static class FRoleContext extends ParserRuleContext {
		public FRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fRole; }
	 
		public FRoleContext() { }
		public void copyFrom(FRoleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FRoleIDContext extends FRoleContext {
		public TerminalNode ID() { return getToken(OCLfoParser.ID, 0); }
		public FRoleIDContext(FRoleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitFRoleID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FRoleContext fRole() throws RecognitionException {
		FRoleContext _localctx = new FRoleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fRole);
		try {
			_localctx = new FRoleIDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
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
	public static class NfRoleContext extends ParserRuleContext {
		public NfRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nfRole; }
	 
		public NfRoleContext() { }
		public void copyFrom(NfRoleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NfRoleIDContext extends NfRoleContext {
		public TerminalNode ID() { return getToken(OCLfoParser.ID, 0); }
		public NfRoleIDContext(NfRoleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitNfRoleID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NfRoleContext nfRole() throws RecognitionException {
		NfRoleContext _localctx = new NfRoleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nfRole);
		try {
			_localctx = new NfRoleIDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
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
	public static class AttrContext extends ParserRuleContext {
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
	 
		public AttrContext() { }
		public void copyFrom(AttrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttrIDContext extends AttrContext {
		public TerminalNode ID() { return getToken(OCLfoParser.ID, 0); }
		public AttrIDContext(AttrContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitAttrID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_attr);
		try {
			_localctx = new AttrIDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
	public static class BAttrContext extends ParserRuleContext {
		public BAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bAttr; }
	 
		public BAttrContext() { }
		public void copyFrom(BAttrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BAttrIDContext extends BAttrContext {
		public TerminalNode ID() { return getToken(OCLfoParser.ID, 0); }
		public BAttrIDContext(BAttrContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitBAttrID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BAttrContext bAttr() throws RecognitionException {
		BAttrContext _localctx = new BAttrContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bAttr);
		try {
			_localctx = new BAttrIDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
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
	public static class FAttrContext extends ParserRuleContext {
		public FAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fAttr; }
	 
		public FAttrContext() { }
		public void copyFrom(FAttrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FAttrIDContext extends FAttrContext {
		public TerminalNode ID() { return getToken(OCLfoParser.ID, 0); }
		public FAttrIDContext(FAttrContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitFAttrID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FAttrContext fAttr() throws RecognitionException {
		FAttrContext _localctx = new FAttrContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fAttr);
		try {
			_localctx = new FAttrIDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
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
	public static class NfAttrContext extends ParserRuleContext {
		public NfAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nfAttr; }
	 
		public NfAttrContext() { }
		public void copyFrom(NfAttrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NfAttrIDContext extends NfAttrContext {
		public TerminalNode ID() { return getToken(OCLfoParser.ID, 0); }
		public NfAttrIDContext(NfAttrContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OCLfoVisitor ) return ((OCLfoVisitor<? extends T>)visitor).visitNfAttrID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NfAttrContext nfAttr() throws RecognitionException {
		NfAttrContext _localctx = new NfAttrContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_nfAttr);
		try {
			_localctx = new NfAttrIDContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return oclBool_sempred((OclBoolContext)_localctx, predIndex);
		case 3:
			return oclSet_sempred((OclSetContext)_localctx, predIndex);
		case 5:
			return oclObject_sempred((OclObjectContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean oclBool_sempred(OclBoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 23);
		}
		return true;
	}
	private boolean oclSet_sempred(OclSetContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean oclObject_sempred(OclObjectContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 5);
		case 15:
			return precpred(_ctx, 4);
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00015\u0157\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0099\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u009f\b\u0001\n\u0001\f\u0001\u00a2\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u00a6\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00b0"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u00fb\b\u0003\n\u0003\f\u0003\u00fe\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0102\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u0107\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u0114\b\u0005\n\u0005\f\u0005\u0117"+
		"\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u0125\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u012b\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0133\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u0138\b\t"+
		"\n\t\f\t\u013b\t\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0000\u0003\u0002\u0006\n\u0017\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,\u0000\u0000\u0176\u0000.\u0001\u0000\u0000\u0000\u0002\u0098"+
		"\u0001\u0000\u0000\u0000\u0004\u00a5\u0001\u0000\u0000\u0000\u0006\u00af"+
		"\u0001\u0000\u0000\u0000\b\u0101\u0001\u0000\u0000\u0000\n\u0106\u0001"+
		"\u0000\u0000\u0000\f\u0124\u0001\u0000\u0000\u0000\u000e\u012a\u0001\u0000"+
		"\u0000\u0000\u0010\u0132\u0001\u0000\u0000\u0000\u0012\u0134\u0001\u0000"+
		"\u0000\u0000\u0014\u013c\u0001\u0000\u0000\u0000\u0016\u013e\u0001\u0000"+
		"\u0000\u0000\u0018\u0140\u0001\u0000\u0000\u0000\u001a\u0142\u0001\u0000"+
		"\u0000\u0000\u001c\u0144\u0001\u0000\u0000\u0000\u001e\u0146\u0001\u0000"+
		"\u0000\u0000 \u0148\u0001\u0000\u0000\u0000\"\u014a\u0001\u0000\u0000"+
		"\u0000$\u014c\u0001\u0000\u0000\u0000&\u014e\u0001\u0000\u0000\u0000("+
		"\u0150\u0001\u0000\u0000\u0000*\u0152\u0001\u0000\u0000\u0000,\u0154\u0001"+
		"\u0000\u0000\u0000./\u0005\u0001\u0000\u0000/0\u0003\u0018\f\u000001\u0005"+
		"\u0002\u0000\u000012\u0005\u0003\u0000\u000023\u0003\u0002\u0001\u0000"+
		"34\u0005\u0004\u0000\u00004\u0001\u0001\u0000\u0000\u000056\u0006\u0001"+
		"\uffff\uffff\u000067\u0005\u0005\u0000\u00007\u0099\u0003\u0002\u0001"+
		"\u001689\u0003\u0006\u0003\u00009:\u0005\u0006\u0000\u0000:;\u0003\u0006"+
		"\u0003\u0000;<\u0005\u0007\u0000\u0000<\u0099\u0001\u0000\u0000\u0000"+
		"=>\u0003\u0006\u0003\u0000>?\u0005\b\u0000\u0000?@\u0003\u0006\u0003\u0000"+
		"@A\u0005\u0007\u0000\u0000A\u0099\u0001\u0000\u0000\u0000BC\u0003\u0006"+
		"\u0003\u0000CD\u0005\t\u0000\u0000DE\u0003\b\u0004\u0000EF\u0005\u0007"+
		"\u0000\u0000F\u0099\u0001\u0000\u0000\u0000GH\u0003\u0006\u0003\u0000"+
		"HI\u0005\n\u0000\u0000IJ\u0003\b\u0004\u0000JK\u0005\u0007\u0000\u0000"+
		"K\u0099\u0001\u0000\u0000\u0000LM\u0003\u0006\u0003\u0000MN\u0005\u000b"+
		"\u0000\u0000NO\u0003\u0012\t\u0000OP\u0005\f\u0000\u0000PQ\u0003\u0002"+
		"\u0001\u0000QR\u0005\u0007\u0000\u0000R\u0099\u0001\u0000\u0000\u0000"+
		"ST\u0003\u0006\u0003\u0000TU\u0005\r\u0000\u0000UV\u0003\u0012\t\u0000"+
		"VW\u0005\f\u0000\u0000WX\u0003\u0002\u0001\u0000XY\u0005\u0007\u0000\u0000"+
		"Y\u0099\u0001\u0000\u0000\u0000Z[\u0003\u0006\u0003\u0000[\\\u0005\u000e"+
		"\u0000\u0000\\\u0099\u0001\u0000\u0000\u0000]^\u0003\u0006\u0003\u0000"+
		"^_\u0005\u000f\u0000\u0000_\u0099\u0001\u0000\u0000\u0000`a\u0003\u0006"+
		"\u0003\u0000ab\u0005\u0010\u0000\u0000bc\u0003\u0010\b\u0000cd\u00052"+
		"\u0000\u0000d\u0099\u0001\u0000\u0000\u0000ef\u0003\u0006\u0003\u0000"+
		"fg\u0005\u0011\u0000\u0000gh\u0003\u0016\u000b\u0000hi\u0005\f\u0000\u0000"+
		"ij\u0003\u0002\u0001\u0000jk\u0005\u0007\u0000\u0000k\u0099\u0001\u0000"+
		"\u0000\u0000lm\u0003\u0006\u0003\u0000mn\u0005\u0012\u0000\u0000no\u0003"+
		"&\u0013\u0000op\u0005\u0007\u0000\u0000p\u0099\u0001\u0000\u0000\u0000"+
		"qr\u0003\n\u0005\u0000rs\u0005\u0013\u0000\u0000st\u0003\u0018\f\u0000"+
		"tu\u0005\u0007\u0000\u0000u\u0099\u0001\u0000\u0000\u0000vw\u0003\n\u0005"+
		"\u0000wx\u0005\u0014\u0000\u0000xy\u0003\u0018\f\u0000yz\u0005\u0007\u0000"+
		"\u0000z\u0099\u0001\u0000\u0000\u0000{|\u0003\b\u0004\u0000|}\u0005\u0015"+
		"\u0000\u0000}~\u0005\u0016\u0000\u0000~\u0099\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0003\b\u0004\u0000\u0080\u0081\u0005\u0017\u0000\u0000\u0081"+
		"\u0082\u0005\u0016\u0000\u0000\u0082\u0099\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0003\u0004\u0002\u0000\u0084\u0085\u0005\u0015\u0000\u0000\u0085"+
		"\u0086\u0003\u0004\u0002\u0000\u0086\u0099\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0003\u0004\u0002\u0000\u0088\u0089\u0005\u0017\u0000\u0000\u0089"+
		"\u008a\u0003\u0004\u0002\u0000\u008a\u0099\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0003\f\u0006\u0000\u008c\u008d\u0003\u0010\b\u0000\u008d\u008e"+
		"\u0003\f\u0006\u0000\u008e\u0099\u0001\u0000\u0000\u0000\u008f\u0090\u0003"+
		"\n\u0005\u0000\u0090\u0091\u0005\u0018\u0000\u0000\u0091\u0092\u0003("+
		"\u0014\u0000\u0092\u0099\u0001\u0000\u0000\u0000\u0093\u0099\u0003\u0016"+
		"\u000b\u0000\u0094\u0095\u0005\u0019\u0000\u0000\u0095\u0096\u0003\u0002"+
		"\u0001\u0000\u0096\u0097\u0005\u0007\u0000\u0000\u0097\u0099\u0001\u0000"+
		"\u0000\u0000\u00985\u0001\u0000\u0000\u0000\u00988\u0001\u0000\u0000\u0000"+
		"\u0098=\u0001\u0000\u0000\u0000\u0098B\u0001\u0000\u0000\u0000\u0098G"+
		"\u0001\u0000\u0000\u0000\u0098L\u0001\u0000\u0000\u0000\u0098S\u0001\u0000"+
		"\u0000\u0000\u0098Z\u0001\u0000\u0000\u0000\u0098]\u0001\u0000\u0000\u0000"+
		"\u0098`\u0001\u0000\u0000\u0000\u0098e\u0001\u0000\u0000\u0000\u0098l"+
		"\u0001\u0000\u0000\u0000\u0098q\u0001\u0000\u0000\u0000\u0098v\u0001\u0000"+
		"\u0000\u0000\u0098{\u0001\u0000\u0000\u0000\u0098\u007f\u0001\u0000\u0000"+
		"\u0000\u0098\u0083\u0001\u0000\u0000\u0000\u0098\u0087\u0001\u0000\u0000"+
		"\u0000\u0098\u008b\u0001\u0000\u0000\u0000\u0098\u008f\u0001\u0000\u0000"+
		"\u0000\u0098\u0093\u0001\u0000\u0000\u0000\u0098\u0094\u0001\u0000\u0000"+
		"\u0000\u0099\u00a0\u0001\u0000\u0000\u0000\u009a\u009b\n\u0017\u0000\u0000"+
		"\u009b\u009c\u0003\u000e\u0007\u0000\u009c\u009d\u0003\u0002\u0001\u0018"+
		"\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009a\u0001\u0000\u0000\u0000"+
		"\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u0003\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a6\u0003\u0006\u0003\u0000"+
		"\u00a4\u00a6\u0003\b\u0004\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u0005\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0006\u0003\uffff\uffff\u0000\u00a8\u00a9\u0003\n\u0005\u0000\u00a9"+
		"\u00aa\u0005\u0018\u0000\u0000\u00aa\u00ab\u0003,\u0016\u0000\u00ab\u00b0"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003\u0018\f\u0000\u00ad\u00ae\u0005"+
		"$\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00a7\u0001\u0000"+
		"\u0000\u0000\u00af\u00ac\u0001\u0000\u0000\u0000\u00b0\u00fc\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\n\f\u0000\u0000\u00b2\u00b3\u0005\u001d\u0000"+
		"\u0000\u00b3\u00fb\u0003\u0006\u0003\r\u00b4\u00b5\n\u000f\u0000\u0000"+
		"\u00b5\u00b6\u0005\u001a\u0000\u0000\u00b6\u00b7\u0003\u0006\u0003\u0000"+
		"\u00b7\u00b8\u0005\u0007\u0000\u0000\u00b8\u00fb\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\n\u000e\u0000\u0000\u00ba\u00bb\u0005\u001b\u0000\u0000\u00bb"+
		"\u00bc\u0003\u0006\u0003\u0000\u00bc\u00bd\u0005\u0007\u0000\u0000\u00bd"+
		"\u00fb\u0001\u0000\u0000\u0000\u00be\u00bf\n\r\u0000\u0000\u00bf\u00c0"+
		"\u0005\u001c\u0000\u0000\u00c0\u00c1\u0003\u0006\u0003\u0000\u00c1\u00c2"+
		"\u0005\u0007\u0000\u0000\u00c2\u00fb\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\n\u000b\u0000\u0000\u00c4\u00c5\u0005\u001e\u0000\u0000\u00c5\u00c6\u0003"+
		"\u0016\u000b\u0000\u00c6\u00c7\u0005\f\u0000\u0000\u00c7\u00c8\u0003\u0002"+
		"\u0001\u0000\u00c8\u00c9\u0005\u0007\u0000\u0000\u00c9\u00fb\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\n\n\u0000\u0000\u00cb\u00cc\u0005\u001f\u0000"+
		"\u0000\u00cc\u00cd\u0003\u0016\u000b\u0000\u00cd\u00ce\u0005\f\u0000\u0000"+
		"\u00ce\u00cf\u0003\u0002\u0001\u0000\u00cf\u00d0\u0005\u0007\u0000\u0000"+
		"\u00d0\u00fb\u0001\u0000\u0000\u0000\u00d1\u00d2\n\t\u0000\u0000\u00d2"+
		"\u00d3\u0005 \u0000\u0000\u00d3\u00d4\u0003\u0018\f\u0000\u00d4\u00d5"+
		"\u0005\u0007\u0000\u0000\u00d5\u00fb\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\n\b\u0000\u0000\u00d7\u00d8\u0005!\u0000\u0000\u00d8\u00d9\u0003\u0018"+
		"\f\u0000\u00d9\u00da\u0005\u0007\u0000\u0000\u00da\u00fb\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\n\u0007\u0000\u0000\u00dc\u00dd\u0005\u0018\u0000\u0000"+
		"\u00dd\u00de\u0003 \u0010\u0000\u00de\u00df\u0005\"\u0000\u0000\u00df"+
		"\u00e0\u0003 \u0010\u0000\u00e0\u00e1\u0005#\u0000\u0000\u00e1\u00fb\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\n\u0006\u0000\u0000\u00e3\u00e4\u0005\u0018"+
		"\u0000\u0000\u00e4\u00e5\u0003\u001a\r\u0000\u00e5\u00e6\u0005\"\u0000"+
		"\u0000\u00e6\u00e7\u0003 \u0010\u0000\u00e7\u00e8\u0005#\u0000\u0000\u00e8"+
		"\u00fb\u0001\u0000\u0000\u0000\u00e9\u00ea\n\u0005\u0000\u0000\u00ea\u00eb"+
		"\u0005\u0018\u0000\u0000\u00eb\u00ec\u0003$\u0012\u0000\u00ec\u00ed\u0005"+
		"\"\u0000\u0000\u00ed\u00ee\u0003 \u0010\u0000\u00ee\u00ef\u0005#\u0000"+
		"\u0000\u00ef\u00fb\u0001\u0000\u0000\u0000\u00f0\u00f1\n\u0004\u0000\u0000"+
		"\u00f1\u00f2\u0005\u0018\u0000\u0000\u00f2\u00f3\u0003\u001e\u000f\u0000"+
		"\u00f3\u00f4\u0005\"\u0000\u0000\u00f4\u00f5\u0003 \u0010\u0000\u00f5"+
		"\u00f6\u0005#\u0000\u0000\u00f6\u00fb\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\n\u0003\u0000\u0000\u00f8\u00f9\u0005\u0018\u0000\u0000\u00f9\u00fb\u0003"+
		"&\u0013\u0000\u00fa\u00b1\u0001\u0000\u0000\u0000\u00fa\u00b4\u0001\u0000"+
		"\u0000\u0000\u00fa\u00b9\u0001\u0000\u0000\u0000\u00fa\u00be\u0001\u0000"+
		"\u0000\u0000\u00fa\u00c3\u0001\u0000\u0000\u0000\u00fa\u00ca\u0001\u0000"+
		"\u0000\u0000\u00fa\u00d1\u0001\u0000\u0000\u0000\u00fa\u00d6\u0001\u0000"+
		"\u0000\u0000\u00fa\u00db\u0001\u0000\u0000\u0000\u00fa\u00e2\u0001\u0000"+
		"\u0000\u0000\u00fa\u00e9\u0001\u0000\u0000\u0000\u00fa\u00f0\u0001\u0000"+
		"\u0000\u0000\u00fa\u00f7\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fd\u0007\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00ff\u0102\u0003\n\u0005\u0000\u0100\u0102\u0003\f\u0006"+
		"\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0100\u0001\u0000\u0000"+
		"\u0000\u0102\t\u0001\u0000\u0000\u0000\u0103\u0104\u0006\u0005\uffff\uffff"+
		"\u0000\u0104\u0107\u0003\u0016\u000b\u0000\u0105\u0107\u0005&\u0000\u0000"+
		"\u0106\u0103\u0001\u0000\u0000\u0000\u0106\u0105\u0001\u0000\u0000\u0000"+
		"\u0107\u0115\u0001\u0000\u0000\u0000\u0108\u0109\n\u0005\u0000\u0000\u0109"+
		"\u010a\u0005%\u0000\u0000\u010a\u010b\u0003\u0018\f\u0000\u010b\u010c"+
		"\u0005\u0007\u0000\u0000\u010c\u0114\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\n\u0004\u0000\u0000\u010e\u010f\u0005\u0018\u0000\u0000\u010f\u0114\u0003"+
		"\"\u0011\u0000\u0110\u0111\n\u0003\u0000\u0000\u0111\u0112\u0005\u0018"+
		"\u0000\u0000\u0112\u0114\u0003\u001c\u000e\u0000\u0113\u0108\u0001\u0000"+
		"\u0000\u0000\u0113\u010d\u0001\u0000\u0000\u0000\u0113\u0110\u0001\u0000"+
		"\u0000\u0000\u0114\u0117\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u000b\u0001\u0000"+
		"\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u0125\u0003\u0014"+
		"\n\u0000\u0119\u0125\u0003\u0016\u000b\u0000\u011a\u011b\u0003\n\u0005"+
		"\u0000\u011b\u011c\u0005\u0018\u0000\u0000\u011c\u011d\u0003*\u0015\u0000"+
		"\u011d\u0125\u0001\u0000\u0000\u0000\u011e\u011f\u0003\u0006\u0003\u0000"+
		"\u011f\u0120\u0005\'\u0000\u0000\u0120\u0125\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0003\u0006\u0003\u0000\u0122\u0123\u0005(\u0000\u0000\u0123\u0125"+
		"\u0001\u0000\u0000\u0000\u0124\u0118\u0001\u0000\u0000\u0000\u0124\u0119"+
		"\u0001\u0000\u0000\u0000\u0124\u011a\u0001\u0000\u0000\u0000\u0124\u011e"+
		"\u0001\u0000\u0000\u0000\u0124\u0121\u0001\u0000\u0000\u0000\u0125\r\u0001"+
		"\u0000\u0000\u0000\u0126\u012b\u0005)\u0000\u0000\u0127\u012b\u0005*\u0000"+
		"\u0000\u0128\u012b\u0005+\u0000\u0000\u0129\u012b\u0005,\u0000\u0000\u012a"+
		"\u0126\u0001\u0000\u0000\u0000\u012a\u0127\u0001\u0000\u0000\u0000\u012a"+
		"\u0128\u0001\u0000\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012b"+
		"\u000f\u0001\u0000\u0000\u0000\u012c\u0133\u0005-\u0000\u0000\u012d\u0133"+
		"\u0005.\u0000\u0000\u012e\u0133\u0005\u0015\u0000\u0000\u012f\u0133\u0005"+
		"/\u0000\u0000\u0130\u0133\u00050\u0000\u0000\u0131\u0133\u0005\u0017\u0000"+
		"\u0000\u0132\u012c\u0001\u0000\u0000\u0000\u0132\u012d\u0001\u0000\u0000"+
		"\u0000\u0132\u012e\u0001\u0000\u0000\u0000\u0132\u012f\u0001\u0000\u0000"+
		"\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0131\u0001\u0000\u0000"+
		"\u0000\u0133\u0011\u0001\u0000\u0000\u0000\u0134\u0139\u0003\u0016\u000b"+
		"\u0000\u0135\u0136\u00051\u0000\u0000\u0136\u0138\u0003\u0016\u000b\u0000"+
		"\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000"+
		"\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000"+
		"\u013a\u0013\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000"+
		"\u013c\u013d\u00055\u0000\u0000\u013d\u0015\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u00055\u0000\u0000\u013f\u0017\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u00055\u0000\u0000\u0141\u0019\u0001\u0000\u0000\u0000\u0142\u0143\u0005"+
		"5\u0000\u0000\u0143\u001b\u0001\u0000\u0000\u0000\u0144\u0145\u00055\u0000"+
		"\u0000\u0145\u001d\u0001\u0000\u0000\u0000\u0146\u0147\u00055\u0000\u0000"+
		"\u0147\u001f\u0001\u0000\u0000\u0000\u0148\u0149\u00055\u0000\u0000\u0149"+
		"!\u0001\u0000\u0000\u0000\u014a\u014b\u00055\u0000\u0000\u014b#\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u00055\u0000\u0000\u014d%\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u00055\u0000\u0000\u014f\'\u0001\u0000\u0000\u0000"+
		"\u0150\u0151\u00055\u0000\u0000\u0151)\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\u00055\u0000\u0000\u0153+\u0001\u0000\u0000\u0000\u0154\u0155\u00055"+
		"\u0000\u0000\u0155-\u0001\u0000\u0000\u0000\u000e\u0098\u00a0\u00a5\u00af"+
		"\u00fa\u00fc\u0101\u0106\u0113\u0115\u0124\u012a\u0132\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}