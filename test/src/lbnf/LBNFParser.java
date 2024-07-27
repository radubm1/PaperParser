// Generated from lbnf\LBNFParser.g4 by ANTLR 4.5.3
package lbnf;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class LBNFParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int Surrogate_id_SYMB_0 = 1, Surrogate_id_SYMB_1 = 2, Surrogate_id_SYMB_2 = 3,
			Surrogate_id_SYMB_3 = 4, Surrogate_id_SYMB_4 = 5, Surrogate_id_SYMB_5 = 6, Surrogate_id_SYMB_6 = 7,
			Surrogate_id_SYMB_7 = 8, Surrogate_id_SYMB_8 = 9, Surrogate_id_SYMB_9 = 10, Surrogate_id_SYMB_10 = 11,
			Surrogate_id_SYMB_11 = 12, Surrogate_id_SYMB_12 = 13, Surrogate_id_SYMB_13 = 14, Surrogate_id_SYMB_14 = 15,
			Surrogate_id_SYMB_15 = 16, Surrogate_id_SYMB_16 = 17, Surrogate_id_SYMB_17 = 18, Surrogate_id_SYMB_18 = 19,
			Surrogate_id_SYMB_19 = 20, Surrogate_id_SYMB_20 = 21, Surrogate_id_SYMB_21 = 22, Surrogate_id_SYMB_22 = 23,
			Surrogate_id_SYMB_23 = 24, Surrogate_id_SYMB_24 = 25, Surrogate_id_SYMB_25 = 26, Surrogate_id_SYMB_26 = 27,
			Surrogate_id_SYMB_27 = 28, Surrogate_id_SYMB_28 = 29, Surrogate_id_SYMB_29 = 30, Surrogate_id_SYMB_30 = 31,
			Surrogate_id_SYMB_31 = 32, Surrogate_id_SYMB_32 = 33, Surrogate_id_SYMB_33 = 34, Surrogate_id_SYMB_34 = 35,
			Surrogate_id_SYMB_35 = 36, COMMENT_antlr_builtin = 37, MULTICOMMENT_antlr_builtin = 38, INTEGER = 39,
			IDENT = 40, WS = 41, ErrorToken = 42, STRING = 43, CHAR = 44, STRINGESC = 45;
	public static final int RULE_start_Grammar = 0, RULE_start_ListDef = 1, RULE_start_ListItem = 2, RULE_start_Def = 3,
			RULE_start_Item = 4, RULE_start_Cat = 5, RULE_start_Label = 6, RULE_start_LabelId = 7,
			RULE_start_ProfItem = 8, RULE_start_IntList = 9, RULE_start_ListInteger = 10, RULE_start_ListIntList = 11,
			RULE_start_ListProfItem = 12, RULE_start_ListString = 13, RULE_start_ListRHS = 14, RULE_start_RHS = 15,
			RULE_start_MinimumSize = 16, RULE_start_Reg2 = 17, RULE_start_Reg1 = 18, RULE_start_Reg3 = 19,
			RULE_start_Reg = 20, RULE_start_ListIdent = 21, RULE_grammar_ = 22, RULE_listDef = 23, RULE_listItem = 24,
			RULE_def = 25, RULE_item = 26, RULE_cat = 27, RULE_label = 28, RULE_labelId = 29, RULE_profItem = 30,
			RULE_intList = 31, RULE_listInteger = 32, RULE_listIntList = 33, RULE_listProfItem = 34,
			RULE_listString = 35, RULE_listRHS = 36, RULE_rHS = 37, RULE_minimumSize = 38, RULE_reg2 = 39,
			RULE_reg1 = 40, RULE_reg3 = 41, RULE_reg = 42, RULE_listIdent = 43;
	public static final String[] ruleNames = { "start_Grammar", "start_ListDef", "start_ListItem", "start_Def",
			"start_Item", "start_Cat", "start_Label", "start_LabelId", "start_ProfItem", "start_IntList",
			"start_ListInteger", "start_ListIntList", "start_ListProfItem", "start_ListString", "start_ListRHS",
			"start_RHS", "start_MinimumSize", "start_Reg2", "start_Reg1", "start_Reg3", "start_Reg", "start_ListIdent",
			"grammar_", "listDef", "listItem", "def", "item", "cat", "label", "labelId", "profItem", "intList",
			"listInteger", "listIntList", "listProfItem", "listString", "listRHS", "rHS", "minimumSize", "reg2", "reg1",
			"reg3", "reg", "listIdent" };

	private static final String[] _LITERAL_NAMES = { null, "';'", "'.'", "'::='", "'['", "']'", "'_'", "'('", "':'",
			"')'", "','", "'|'", "'-'", "'*'", "'+'", "'?'", "'{'", "'}'", "'char'", "'coercions'", "'comment'",
			"'digit'", "'entrypoints'", "'eps'", "'internal'", "'layout'", "'letter'", "'lower'", "'nonempty'",
			"'position'", "'rules'", "'separator'", "'stop'", "'terminator'", "'token'", "'toplevel'", "'upper'", null,
			null, null, null, null, null, "'\"'", "'''", "'\\'" };
	private static final String[] _SYMBOLIC_NAMES = { null, "Surrogate_id_SYMB_0", "Surrogate_id_SYMB_1",
			"Surrogate_id_SYMB_2", "Surrogate_id_SYMB_3", "Surrogate_id_SYMB_4", "Surrogate_id_SYMB_5",
			"Surrogate_id_SYMB_6", "Surrogate_id_SYMB_7", "Surrogate_id_SYMB_8", "Surrogate_id_SYMB_9",
			"Surrogate_id_SYMB_10", "Surrogate_id_SYMB_11", "Surrogate_id_SYMB_12", "Surrogate_id_SYMB_13",
			"Surrogate_id_SYMB_14", "Surrogate_id_SYMB_15", "Surrogate_id_SYMB_16", "Surrogate_id_SYMB_17",
			"Surrogate_id_SYMB_18", "Surrogate_id_SYMB_19", "Surrogate_id_SYMB_20", "Surrogate_id_SYMB_21",
			"Surrogate_id_SYMB_22", "Surrogate_id_SYMB_23", "Surrogate_id_SYMB_24", "Surrogate_id_SYMB_25",
			"Surrogate_id_SYMB_26", "Surrogate_id_SYMB_27", "Surrogate_id_SYMB_28", "Surrogate_id_SYMB_29",
			"Surrogate_id_SYMB_30", "Surrogate_id_SYMB_31", "Surrogate_id_SYMB_32", "Surrogate_id_SYMB_33",
			"Surrogate_id_SYMB_34", "Surrogate_id_SYMB_35", "COMMENT_antlr_builtin", "MULTICOMMENT_antlr_builtin",
			"INTEGER", "IDENT", "WS", "ErrorToken", "STRING", "CHAR", "STRINGESC" };
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
	public String getGrammarFileName() {
		return "LBNFParser.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public LBNFParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	public static class Start_GrammarContext extends ParserRuleContext {
		public lbnf.Absyn.Grammar result;
		public Grammar_Context x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public Grammar_Context grammar_() {
			return getRuleContext(Grammar_Context.class, 0);
		}

		public Start_GrammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_Grammar;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_Grammar(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_Grammar(this);
		}
	}

	public final Start_GrammarContext start_Grammar() throws RecognitionException {
		Start_GrammarContext _localctx = new Start_GrammarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_Grammar);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(88);
				((Start_GrammarContext) _localctx).x = grammar_();
				setState(89);
				match(EOF);
				((Start_GrammarContext) _localctx).result = ((Start_GrammarContext) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_ListDefContext extends ParserRuleContext {
		public lbnf.Absyn.ListDef result;
		public ListDefContext x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public ListDefContext listDef() {
			return getRuleContext(ListDefContext.class, 0);
		}

		public Start_ListDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_ListDef;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_ListDef(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_ListDef(this);
		}
	}

	public final Start_ListDefContext start_ListDef() throws RecognitionException {
		Start_ListDefContext _localctx = new Start_ListDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start_ListDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(92);
				((Start_ListDefContext) _localctx).x = listDef(0);
				setState(93);
				match(EOF);
				((Start_ListDefContext) _localctx).result = ((Start_ListDefContext) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_ListItemContext extends ParserRuleContext {
		public lbnf.Absyn.ListItem result;
		public ListItemContext x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public ListItemContext listItem() {
			return getRuleContext(ListItemContext.class, 0);
		}

		public Start_ListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_ListItem;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_ListItem(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_ListItem(this);
		}
	}

	public final Start_ListItemContext start_ListItem() throws RecognitionException {
		Start_ListItemContext _localctx = new Start_ListItemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start_ListItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(96);
				((Start_ListItemContext) _localctx).x = listItem(0);
				setState(97);
				match(EOF);
				((Start_ListItemContext) _localctx).result = ((Start_ListItemContext) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_DefContext extends ParserRuleContext {
		public lbnf.Absyn.Def result;
		public DefContext x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public DefContext def() {
			return getRuleContext(DefContext.class, 0);
		}

		public Start_DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_Def;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_Def(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_Def(this);
		}
	}

	public final Start_DefContext start_Def() throws RecognitionException {
		Start_DefContext _localctx = new Start_DefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_start_Def);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(100);
				((Start_DefContext) _localctx).x = def();
				setState(101);
				match(EOF);
				((Start_DefContext) _localctx).result = ((Start_DefContext) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_ItemContext extends ParserRuleContext {
		public lbnf.Absyn.Item result;
		public ItemContext x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public ItemContext item() {
			return getRuleContext(ItemContext.class, 0);
		}

		public Start_ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_Item;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_Item(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_Item(this);
		}
	}

	public final Start_ItemContext start_Item() throws RecognitionException {
		Start_ItemContext _localctx = new Start_ItemContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_start_Item);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(104);
				((Start_ItemContext) _localctx).x = item();
				setState(105);
				match(EOF);
				((Start_ItemContext) _localctx).result = ((Start_ItemContext) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_CatContext extends ParserRuleContext {
		public lbnf.Absyn.Cat result;
		public CatContext x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public CatContext cat() {
			return getRuleContext(CatContext.class, 0);
		}

		public Start_CatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_Cat;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_Cat(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_Cat(this);
		}
	}

	public final Start_CatContext start_Cat() throws RecognitionException {
		Start_CatContext _localctx = new Start_CatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_start_Cat);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(108);
				((Start_CatContext) _localctx).x = cat();
				setState(109);
				match(EOF);
				((Start_CatContext) _localctx).result = ((Start_CatContext) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_LabelContext extends ParserRuleContext {
		public lbnf.Absyn.Label result;
		public LabelContext x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public LabelContext label() {
			return getRuleContext(LabelContext.class, 0);
		}

		public Start_LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_Label;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_Label(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_Label(this);
		}
	}

	public final Start_LabelContext start_Label() throws RecognitionException {
		Start_LabelContext _localctx = new Start_LabelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_start_Label);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(112);
				((Start_LabelContext) _localctx).x = label();
				setState(113);
				match(EOF);
				((Start_LabelContext) _localctx).result = ((Start_LabelContext) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_LabelIdContext extends ParserRuleContext {
		public lbnf.Absyn.LabelId result;
		public LabelIdContext x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public LabelIdContext labelId() {
			return getRuleContext(LabelIdContext.class, 0);
		}

		public Start_LabelIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_LabelId;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_LabelId(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_LabelId(this);
		}
	}

	public final Start_LabelIdContext start_LabelId() throws RecognitionException {
		Start_LabelIdContext _localctx = new Start_LabelIdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_start_LabelId);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(116);
				((Start_LabelIdContext) _localctx).x = labelId();
				setState(117);
				match(EOF);
				((Start_LabelIdContext) _localctx).result = ((Start_LabelIdContext) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_ProfItemContext extends ParserRuleContext {
		public lbnf.Absyn.ProfItem result;
		public ProfItemContext x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public ProfItemContext profItem() {
			return getRuleContext(ProfItemContext.class, 0);
		}

		public Start_ProfItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_ProfItem;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_ProfItem(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_ProfItem(this);
		}
	}

	public final Start_ProfItemContext start_ProfItem() throws RecognitionException {
		Start_ProfItemContext _localctx = new Start_ProfItemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_start_ProfItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(120);
				((Start_ProfItemContext) _localctx).x = profItem();
				setState(121);
				match(EOF);
				((Start_ProfItemContext) _localctx).result = ((Start_ProfItemContext) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_IntListContext extends ParserRuleContext {
		public lbnf.Absyn.IntList result;
		public IntListContext x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public IntListContext intList() {
			return getRuleContext(IntListContext.class, 0);
		}

		public Start_IntListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_IntList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_IntList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_IntList(this);
		}
	}

	public final Start_IntListContext start_IntList() throws RecognitionException {
		Start_IntListContext _localctx = new Start_IntListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_start_IntList);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(124);
				((Start_IntListContext) _localctx).x = intList();
				setState(125);
				match(EOF);
				((Start_IntListContext) _localctx).result = ((Start_IntListContext) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_ListIntegerContext extends ParserRuleContext {
		public lbnf.Absyn.ListInteger result;
		public ListIntegerContext x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public ListIntegerContext listInteger() {
			return getRuleContext(ListIntegerContext.class, 0);
		}

		public Start_ListIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_ListInteger;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_ListInteger(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_ListInteger(this);
		}
	}

	public final Start_ListIntegerContext start_ListInteger() throws RecognitionException {
		Start_ListIntegerContext _localctx = new Start_ListIntegerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_start_ListInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(128);
				((Start_ListIntegerContext) _localctx).x = listInteger();
				setState(129);
				match(EOF);
				((Start_ListIntegerContext) _localctx).result = ((Start_ListIntegerContext) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_ListIntListContext extends ParserRuleContext {
		public lbnf.Absyn.ListIntList result;
		public ListIntListContext x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public ListIntListContext listIntList() {
			return getRuleContext(ListIntListContext.class, 0);
		}

		public Start_ListIntListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_ListIntList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_ListIntList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_ListIntList(this);
		}
	}

	public final Start_ListIntListContext start_ListIntList() throws RecognitionException {
		Start_ListIntListContext _localctx = new Start_ListIntListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_start_ListIntList);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(132);
				((Start_ListIntListContext) _localctx).x = listIntList();
				setState(133);
				match(EOF);
				((Start_ListIntListContext) _localctx).result = ((Start_ListIntListContext) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_ListProfItemContext extends ParserRuleContext {
		public lbnf.Absyn.ListProfItem result;
		public ListProfItemContext x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public ListProfItemContext listProfItem() {
			return getRuleContext(ListProfItemContext.class, 0);
		}

		public Start_ListProfItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_ListProfItem;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_ListProfItem(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_ListProfItem(this);
		}
	}

	public final Start_ListProfItemContext start_ListProfItem() throws RecognitionException {
		Start_ListProfItemContext _localctx = new Start_ListProfItemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_start_ListProfItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(136);
				((Start_ListProfItemContext) _localctx).x = listProfItem();
				setState(137);
				match(EOF);
				((Start_ListProfItemContext) _localctx).result = ((Start_ListProfItemContext) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_ListStringContext extends ParserRuleContext {
		public lbnf.Absyn.ListString result;
		public ListStringContext x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public ListStringContext listString() {
			return getRuleContext(ListStringContext.class, 0);
		}

		public Start_ListStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_ListString;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_ListString(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_ListString(this);
		}
	}

	public final Start_ListStringContext start_ListString() throws RecognitionException {
		Start_ListStringContext _localctx = new Start_ListStringContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_start_ListString);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(140);
				((Start_ListStringContext) _localctx).x = listString();
				setState(141);
				match(EOF);
				((Start_ListStringContext) _localctx).result = ((Start_ListStringContext) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_ListRHSContext extends ParserRuleContext {
		public lbnf.Absyn.ListRHS result;
		public ListRHSContext x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public ListRHSContext listRHS() {
			return getRuleContext(ListRHSContext.class, 0);
		}

		public Start_ListRHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_ListRHS;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_ListRHS(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_ListRHS(this);
		}
	}

	public final Start_ListRHSContext start_ListRHS() throws RecognitionException {
		Start_ListRHSContext _localctx = new Start_ListRHSContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_start_ListRHS);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(144);
				((Start_ListRHSContext) _localctx).x = listRHS();
				setState(145);
				match(EOF);
				((Start_ListRHSContext) _localctx).result = ((Start_ListRHSContext) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_RHSContext extends ParserRuleContext {
		public lbnf.Absyn.RHS result;
		public RHSContext x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public RHSContext rHS() {
			return getRuleContext(RHSContext.class, 0);
		}

		public Start_RHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_RHS;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_RHS(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_RHS(this);
		}
	}

	public final Start_RHSContext start_RHS() throws RecognitionException {
		Start_RHSContext _localctx = new Start_RHSContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_start_RHS);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(148);
				((Start_RHSContext) _localctx).x = rHS();
				setState(149);
				match(EOF);
				((Start_RHSContext) _localctx).result = ((Start_RHSContext) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_MinimumSizeContext extends ParserRuleContext {
		public lbnf.Absyn.MinimumSize result;
		public MinimumSizeContext x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public MinimumSizeContext minimumSize() {
			return getRuleContext(MinimumSizeContext.class, 0);
		}

		public Start_MinimumSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_MinimumSize;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_MinimumSize(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_MinimumSize(this);
		}
	}

	public final Start_MinimumSizeContext start_MinimumSize() throws RecognitionException {
		Start_MinimumSizeContext _localctx = new Start_MinimumSizeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_start_MinimumSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(152);
				((Start_MinimumSizeContext) _localctx).x = minimumSize();
				setState(153);
				match(EOF);
				((Start_MinimumSizeContext) _localctx).result = ((Start_MinimumSizeContext) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_Reg2Context extends ParserRuleContext {
		public lbnf.Absyn.Reg result;
		public Reg2Context x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public Reg2Context reg2() {
			return getRuleContext(Reg2Context.class, 0);
		}

		public Start_Reg2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_Reg2;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_Reg2(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_Reg2(this);
		}
	}

	public final Start_Reg2Context start_Reg2() throws RecognitionException {
		Start_Reg2Context _localctx = new Start_Reg2Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_start_Reg2);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(156);
				((Start_Reg2Context) _localctx).x = reg2(0);
				setState(157);
				match(EOF);
				((Start_Reg2Context) _localctx).result = ((Start_Reg2Context) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_Reg1Context extends ParserRuleContext {
		public lbnf.Absyn.Reg result;
		public Reg1Context x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public Reg1Context reg1() {
			return getRuleContext(Reg1Context.class, 0);
		}

		public Start_Reg1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_Reg1;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_Reg1(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_Reg1(this);
		}
	}

	public final Start_Reg1Context start_Reg1() throws RecognitionException {
		Start_Reg1Context _localctx = new Start_Reg1Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_start_Reg1);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(160);
				((Start_Reg1Context) _localctx).x = reg1(0);
				setState(161);
				match(EOF);
				((Start_Reg1Context) _localctx).result = ((Start_Reg1Context) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_Reg3Context extends ParserRuleContext {
		public lbnf.Absyn.Reg result;
		public Reg3Context x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public Reg3Context reg3() {
			return getRuleContext(Reg3Context.class, 0);
		}

		public Start_Reg3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_Reg3;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_Reg3(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_Reg3(this);
		}
	}

	public final Start_Reg3Context start_Reg3() throws RecognitionException {
		Start_Reg3Context _localctx = new Start_Reg3Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_start_Reg3);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(164);
				((Start_Reg3Context) _localctx).x = reg3(0);
				setState(165);
				match(EOF);
				((Start_Reg3Context) _localctx).result = ((Start_Reg3Context) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_RegContext extends ParserRuleContext {
		public lbnf.Absyn.Reg result;
		public RegContext x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public RegContext reg() {
			return getRuleContext(RegContext.class, 0);
		}

		public Start_RegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_Reg;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_Reg(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_Reg(this);
		}
	}

	public final Start_RegContext start_Reg() throws RecognitionException {
		Start_RegContext _localctx = new Start_RegContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_start_Reg);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(168);
				((Start_RegContext) _localctx).x = reg();
				setState(169);
				match(EOF);
				((Start_RegContext) _localctx).result = ((Start_RegContext) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Start_ListIdentContext extends ParserRuleContext {
		public lbnf.Absyn.ListIdent result;
		public ListIdentContext x;

		public TerminalNode EOF() {
			return getToken(LBNFParser.EOF, 0);
		}

		public ListIdentContext listIdent() {
			return getRuleContext(ListIdentContext.class, 0);
		}

		public Start_ListIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_start_ListIdent;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterStart_ListIdent(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitStart_ListIdent(this);
		}
	}

	public final Start_ListIdentContext start_ListIdent() throws RecognitionException {
		Start_ListIdentContext _localctx = new Start_ListIdentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_start_ListIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(172);
				((Start_ListIdentContext) _localctx).x = listIdent();
				setState(173);
				match(EOF);
				((Start_ListIdentContext) _localctx).result = ((Start_ListIdentContext) _localctx).x.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grammar_Context extends ParserRuleContext {
		public lbnf.Absyn.Grammar result;
		public ListDefContext p_1_1;

		public ListDefContext listDef() {
			return getRuleContext(ListDefContext.class, 0);
		}

		public Grammar_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_grammar_;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterGrammar_(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitGrammar_(this);
		}
	}

	public final Grammar_Context grammar_() throws RecognitionException {
		Grammar_Context _localctx = new Grammar_Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_grammar_);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(176);
				((Grammar_Context) _localctx).p_1_1 = listDef(0);
				((Grammar_Context) _localctx).result = new lbnf.Absyn.MkGrammar(
						((Grammar_Context) _localctx).p_1_1.result);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListDefContext extends ParserRuleContext {
		public lbnf.Absyn.ListDef result;
		public ListDefContext p_2_1;
		public DefContext p_2_2;

		public TerminalNode Surrogate_id_SYMB_0() {
			return getToken(LBNFParser.Surrogate_id_SYMB_0, 0);
		}

		public ListDefContext listDef() {
			return getRuleContext(ListDefContext.class, 0);
		}

		public DefContext def() {
			return getRuleContext(DefContext.class, 0);
		}

		public ListDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_listDef;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterListDef(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitListDef(this);
		}
	}

	public final ListDefContext listDef() throws RecognitionException {
		return listDef(0);
	}

	private ListDefContext listDef(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListDefContext _localctx = new ListDefContext(_ctx, _parentState);
		ListDefContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_listDef, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					((ListDefContext) _localctx).result = new lbnf.Absyn.ListDef();
				}
				_ctx.stop = _input.LT(-1);
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new ListDefContext(_parentctx, _parentState);
								_localctx.p_2_1 = _prevctx;
								_localctx.p_2_1 = _prevctx;
								pushNewRecursionContext(_localctx, _startState, RULE_listDef);
								setState(182);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								setState(183);
								((ListDefContext) _localctx).p_2_2 = def();
								setState(184);
								match(Surrogate_id_SYMB_0);
								((ListDefContext) _localctx).result = ((ListDefContext) _localctx).p_2_1.result;
								_localctx.result.addLast(((ListDefContext) _localctx).p_2_2.result);
							}
						}
					}
					setState(191);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListItemContext extends ParserRuleContext {
		public lbnf.Absyn.ListItem result;
		public ListItemContext p_2_1;
		public ItemContext p_2_2;

		public ListItemContext listItem() {
			return getRuleContext(ListItemContext.class, 0);
		}

		public ItemContext item() {
			return getRuleContext(ItemContext.class, 0);
		}

		public ListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_listItem;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterListItem(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitListItem(this);
		}
	}

	public final ListItemContext listItem() throws RecognitionException {
		return listItem(0);
	}

	private ListItemContext listItem(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListItemContext _localctx = new ListItemContext(_ctx, _parentState);
		ListItemContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_listItem, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					((ListItemContext) _localctx).result = new lbnf.Absyn.ListItem();
				}
				_ctx.stop = _input.LT(-1);
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new ListItemContext(_parentctx, _parentState);
								_localctx.p_2_1 = _prevctx;
								_localctx.p_2_1 = _prevctx;
								pushNewRecursionContext(_localctx, _startState, RULE_listItem);
								setState(195);
								if (!(precpred(_ctx, 1)))
									throw new FailedPredicateException(this, "precpred(_ctx, 1)");
								setState(196);
								((ListItemContext) _localctx).p_2_2 = item();
								((ListItemContext) _localctx).result = ((ListItemContext) _localctx).p_2_1.result;
								_localctx.result.addLast(((ListItemContext) _localctx).p_2_2.result);
							}
						}
					}
					setState(203);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DefContext extends ParserRuleContext {
		public lbnf.Absyn.Def result;
		public LabelContext p_1_1;
		public CatContext p_1_3;
		public ListItemContext p_1_5;
		public Token p_2_2;
		public Token p_3_2;
		public Token p_3_3;
		public LabelContext p_4_2;
		public CatContext p_4_4;
		public ListItemContext p_4_6;
		public Token p_5_2;
		public RegContext p_5_3;
		public Token p_6_3;
		public RegContext p_6_4;
		public ListIdentContext p_7_2;
		public MinimumSizeContext p_8_2;
		public CatContext p_8_3;
		public Token p_8_4;
		public MinimumSizeContext p_9_2;
		public CatContext p_9_3;
		public Token p_9_4;
		public Token p_10_2;
		public Token p_10_3;
		public Token p_11_2;
		public ListRHSContext p_11_4;
		public ListStringContext p_12_2;
		public ListStringContext p_13_3;

		public TerminalNode Surrogate_id_SYMB_1() {
			return getToken(LBNFParser.Surrogate_id_SYMB_1, 0);
		}

		public TerminalNode Surrogate_id_SYMB_2() {
			return getToken(LBNFParser.Surrogate_id_SYMB_2, 0);
		}

		public LabelContext label() {
			return getRuleContext(LabelContext.class, 0);
		}

		public CatContext cat() {
			return getRuleContext(CatContext.class, 0);
		}

		public ListItemContext listItem() {
			return getRuleContext(ListItemContext.class, 0);
		}

		public TerminalNode Surrogate_id_SYMB_19() {
			return getToken(LBNFParser.Surrogate_id_SYMB_19, 0);
		}

		public List<TerminalNode> STRING() {
			return getTokens(LBNFParser.STRING);
		}

		public TerminalNode STRING(int i) {
			return getToken(LBNFParser.STRING, i);
		}

		public TerminalNode Surrogate_id_SYMB_23() {
			return getToken(LBNFParser.Surrogate_id_SYMB_23, 0);
		}

		public TerminalNode Surrogate_id_SYMB_33() {
			return getToken(LBNFParser.Surrogate_id_SYMB_33, 0);
		}

		public TerminalNode IDENT() {
			return getToken(LBNFParser.IDENT, 0);
		}

		public RegContext reg() {
			return getRuleContext(RegContext.class, 0);
		}

		public TerminalNode Surrogate_id_SYMB_28() {
			return getToken(LBNFParser.Surrogate_id_SYMB_28, 0);
		}

		public TerminalNode Surrogate_id_SYMB_21() {
			return getToken(LBNFParser.Surrogate_id_SYMB_21, 0);
		}

		public ListIdentContext listIdent() {
			return getRuleContext(ListIdentContext.class, 0);
		}

		public TerminalNode Surrogate_id_SYMB_30() {
			return getToken(LBNFParser.Surrogate_id_SYMB_30, 0);
		}

		public MinimumSizeContext minimumSize() {
			return getRuleContext(MinimumSizeContext.class, 0);
		}

		public TerminalNode Surrogate_id_SYMB_32() {
			return getToken(LBNFParser.Surrogate_id_SYMB_32, 0);
		}

		public TerminalNode Surrogate_id_SYMB_18() {
			return getToken(LBNFParser.Surrogate_id_SYMB_18, 0);
		}

		public TerminalNode INTEGER() {
			return getToken(LBNFParser.INTEGER, 0);
		}

		public TerminalNode Surrogate_id_SYMB_29() {
			return getToken(LBNFParser.Surrogate_id_SYMB_29, 0);
		}

		public ListRHSContext listRHS() {
			return getRuleContext(ListRHSContext.class, 0);
		}

		public TerminalNode Surrogate_id_SYMB_24() {
			return getToken(LBNFParser.Surrogate_id_SYMB_24, 0);
		}

		public ListStringContext listString() {
			return getRuleContext(ListStringContext.class, 0);
		}

		public TerminalNode Surrogate_id_SYMB_31() {
			return getToken(LBNFParser.Surrogate_id_SYMB_31, 0);
		}

		public TerminalNode Surrogate_id_SYMB_34() {
			return getToken(LBNFParser.Surrogate_id_SYMB_34, 0);
		}

		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_def;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterDef(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitDef(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_def);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(204);
				((DefContext) _localctx).p_1_1 = label();
				setState(205);
				match(Surrogate_id_SYMB_1);
				setState(206);
				((DefContext) _localctx).p_1_3 = cat();
				setState(207);
				match(Surrogate_id_SYMB_2);
				setState(208);
				((DefContext) _localctx).p_1_5 = listItem(0);
				((DefContext) _localctx).result = new lbnf.Absyn.Rule(((DefContext) _localctx).p_1_1.result,
						((DefContext) _localctx).p_1_3.result, ((DefContext) _localctx).p_1_5.result);
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(211);
				match(Surrogate_id_SYMB_19);
				setState(212);
				((DefContext) _localctx).p_2_2 = match(STRING);
				((DefContext) _localctx).result = new lbnf.Absyn.Comment(((DefContext) _localctx).p_2_2.getText()
						.substring(1, ((DefContext) _localctx).p_2_2.getText().length() - 1).translateEscapes());
			}
				break;
			case 3:
				enterOuterAlt(_localctx, 3); {
				setState(214);
				match(Surrogate_id_SYMB_19);
				setState(215);
				((DefContext) _localctx).p_3_2 = match(STRING);
				setState(216);
				((DefContext) _localctx).p_3_3 = match(STRING);
				((DefContext) _localctx).result = new lbnf.Absyn.Comments(
						((DefContext) _localctx).p_3_2.getText()
								.substring(1, ((DefContext) _localctx).p_3_2.getText().length() - 1).translateEscapes(),
						((DefContext) _localctx).p_3_3.getText()
								.substring(1, ((DefContext) _localctx).p_3_3.getText().length() - 1)
								.translateEscapes());
			}
				break;
			case 4:
				enterOuterAlt(_localctx, 4); {
				setState(218);
				match(Surrogate_id_SYMB_23);
				setState(219);
				((DefContext) _localctx).p_4_2 = label();
				setState(220);
				match(Surrogate_id_SYMB_1);
				setState(221);
				((DefContext) _localctx).p_4_4 = cat();
				setState(222);
				match(Surrogate_id_SYMB_2);
				setState(223);
				((DefContext) _localctx).p_4_6 = listItem(0);
				((DefContext) _localctx).result = new lbnf.Absyn.Internal(((DefContext) _localctx).p_4_2.result,
						((DefContext) _localctx).p_4_4.result, ((DefContext) _localctx).p_4_6.result);
			}
				break;
			case 5:
				enterOuterAlt(_localctx, 5); {
				setState(226);
				match(Surrogate_id_SYMB_33);
				setState(227);
				((DefContext) _localctx).p_5_2 = match(IDENT);
				setState(228);
				((DefContext) _localctx).p_5_3 = reg();
				((DefContext) _localctx).result = new lbnf.Absyn.Token(((DefContext) _localctx).p_5_2.getText(),
						((DefContext) _localctx).p_5_3.result);
			}
				break;
			case 6:
				enterOuterAlt(_localctx, 6); {
				setState(231);
				match(Surrogate_id_SYMB_28);
				setState(232);
				match(Surrogate_id_SYMB_33);
				setState(233);
				((DefContext) _localctx).p_6_3 = match(IDENT);
				setState(234);
				((DefContext) _localctx).p_6_4 = reg();
				((DefContext) _localctx).result = new lbnf.Absyn.PosToken(((DefContext) _localctx).p_6_3.getText(),
						((DefContext) _localctx).p_6_4.result);
			}
				break;
			case 7:
				enterOuterAlt(_localctx, 7); {
				setState(237);
				match(Surrogate_id_SYMB_21);
				setState(238);
				((DefContext) _localctx).p_7_2 = listIdent();
				((DefContext) _localctx).result = new lbnf.Absyn.Entryp(((DefContext) _localctx).p_7_2.result);
			}
				break;
			case 8:
				enterOuterAlt(_localctx, 8); {
				setState(241);
				match(Surrogate_id_SYMB_30);
				setState(242);
				((DefContext) _localctx).p_8_2 = minimumSize();
				setState(243);
				((DefContext) _localctx).p_8_3 = cat();
				setState(244);
				((DefContext) _localctx).p_8_4 = match(STRING);
				((DefContext) _localctx).result = new lbnf.Absyn.Separator(((DefContext) _localctx).p_8_2.result,
						((DefContext) _localctx).p_8_3.result,
						((DefContext) _localctx).p_8_4.getText()
								.substring(1, ((DefContext) _localctx).p_8_4.getText().length() - 1)
								.translateEscapes());
			}
				break;
			case 9:
				enterOuterAlt(_localctx, 9); {
				setState(247);
				match(Surrogate_id_SYMB_32);
				setState(248);
				((DefContext) _localctx).p_9_2 = minimumSize();
				setState(249);
				((DefContext) _localctx).p_9_3 = cat();
				setState(250);
				((DefContext) _localctx).p_9_4 = match(STRING);
				((DefContext) _localctx).result = new lbnf.Absyn.Terminator(((DefContext) _localctx).p_9_2.result,
						((DefContext) _localctx).p_9_3.result,
						((DefContext) _localctx).p_9_4.getText()
								.substring(1, ((DefContext) _localctx).p_9_4.getText().length() - 1)
								.translateEscapes());
			}
				break;
			case 10:
				enterOuterAlt(_localctx, 10); {
				setState(253);
				match(Surrogate_id_SYMB_18);
				setState(254);
				((DefContext) _localctx).p_10_2 = match(IDENT);
				setState(255);
				((DefContext) _localctx).p_10_3 = match(INTEGER);
				((DefContext) _localctx).result = new lbnf.Absyn.Coercions(((DefContext) _localctx).p_10_2.getText(),
						Integer.parseInt(((DefContext) _localctx).p_10_3.getText()));
			}
				break;
			case 11:
				enterOuterAlt(_localctx, 11); {
				setState(257);
				match(Surrogate_id_SYMB_29);
				setState(258);
				((DefContext) _localctx).p_11_2 = match(IDENT);
				setState(259);
				match(Surrogate_id_SYMB_2);
				setState(260);
				((DefContext) _localctx).p_11_4 = listRHS();
				((DefContext) _localctx).result = new lbnf.Absyn.Rules(((DefContext) _localctx).p_11_2.getText(),
						((DefContext) _localctx).p_11_4.result);
			}
				break;
			case 12:
				enterOuterAlt(_localctx, 12); {
				setState(263);
				match(Surrogate_id_SYMB_24);
				setState(264);
				((DefContext) _localctx).p_12_2 = listString();
				((DefContext) _localctx).result = new lbnf.Absyn.Layout(((DefContext) _localctx).p_12_2.result);
			}
				break;
			case 13:
				enterOuterAlt(_localctx, 13); {
				setState(267);
				match(Surrogate_id_SYMB_24);
				setState(268);
				match(Surrogate_id_SYMB_31);
				setState(269);
				((DefContext) _localctx).p_13_3 = listString();
				((DefContext) _localctx).result = new lbnf.Absyn.LayoutStop(((DefContext) _localctx).p_13_3.result);
			}
				break;
			case 14:
				enterOuterAlt(_localctx, 14); {
				setState(272);
				match(Surrogate_id_SYMB_24);
				setState(273);
				match(Surrogate_id_SYMB_34);
				((DefContext) _localctx).result = new lbnf.Absyn.LayoutTop();
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemContext extends ParserRuleContext {
		public lbnf.Absyn.Item result;
		public Token p_1_1;
		public CatContext p_2_1;

		public TerminalNode STRING() {
			return getToken(LBNFParser.STRING, 0);
		}

		public CatContext cat() {
			return getRuleContext(CatContext.class, 0);
		}

		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_item;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterItem(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitItem(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_item);
		try {
			setState(282);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1); {
				setState(277);
				((ItemContext) _localctx).p_1_1 = match(STRING);
				((ItemContext) _localctx).result = new lbnf.Absyn.Terminal(((ItemContext) _localctx).p_1_1.getText()
						.substring(1, ((ItemContext) _localctx).p_1_1.getText().length() - 1).translateEscapes());
			}
				break;
			case Surrogate_id_SYMB_3:
			case IDENT:
				enterOuterAlt(_localctx, 2); {
				setState(279);
				((ItemContext) _localctx).p_2_1 = cat();
				((ItemContext) _localctx).result = new lbnf.Absyn.NTerminal(((ItemContext) _localctx).p_2_1.result);
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatContext extends ParserRuleContext {
		public lbnf.Absyn.Cat result;
		public CatContext p_1_2;
		public Token p_2_1;

		public TerminalNode Surrogate_id_SYMB_3() {
			return getToken(LBNFParser.Surrogate_id_SYMB_3, 0);
		}

		public TerminalNode Surrogate_id_SYMB_4() {
			return getToken(LBNFParser.Surrogate_id_SYMB_4, 0);
		}

		public CatContext cat() {
			return getRuleContext(CatContext.class, 0);
		}

		public TerminalNode IDENT() {
			return getToken(LBNFParser.IDENT, 0);
		}

		public CatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_cat;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterCat(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitCat(this);
		}
	}

	public final CatContext cat() throws RecognitionException {
		CatContext _localctx = new CatContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cat);
		try {
			setState(291);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_3:
				enterOuterAlt(_localctx, 1); {
				setState(284);
				match(Surrogate_id_SYMB_3);
				setState(285);
				((CatContext) _localctx).p_1_2 = cat();
				setState(286);
				match(Surrogate_id_SYMB_4);
				((CatContext) _localctx).result = new lbnf.Absyn.ListCat(((CatContext) _localctx).p_1_2.result);
			}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2); {
				setState(289);
				((CatContext) _localctx).p_2_1 = match(IDENT);
				((CatContext) _localctx).result = new lbnf.Absyn.IdCat(((CatContext) _localctx).p_2_1.getText());
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public lbnf.Absyn.Label result;
		public LabelIdContext p_1_1;
		public LabelIdContext p_2_1;
		public ListProfItemContext p_2_2;
		public LabelIdContext p_3_1;
		public LabelIdContext p_3_2;
		public ListProfItemContext p_3_3;
		public LabelIdContext p_4_1;
		public LabelIdContext p_4_2;

		public List<LabelIdContext> labelId() {
			return getRuleContexts(LabelIdContext.class);
		}

		public LabelIdContext labelId(int i) {
			return getRuleContext(LabelIdContext.class, i);
		}

		public ListProfItemContext listProfItem() {
			return getRuleContext(ListProfItemContext.class, 0);
		}

		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_label;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterLabel(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_label);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(293);
				((LabelContext) _localctx).p_1_1 = labelId();
				((LabelContext) _localctx).result = new lbnf.Absyn.LabNoP(((LabelContext) _localctx).p_1_1.result);
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(296);
				((LabelContext) _localctx).p_2_1 = labelId();
				setState(297);
				((LabelContext) _localctx).p_2_2 = listProfItem();
				((LabelContext) _localctx).result = new lbnf.Absyn.LabP(((LabelContext) _localctx).p_2_1.result,
						((LabelContext) _localctx).p_2_2.result);
			}
				break;
			case 3:
				enterOuterAlt(_localctx, 3); {
				setState(300);
				((LabelContext) _localctx).p_3_1 = labelId();
				setState(301);
				((LabelContext) _localctx).p_3_2 = labelId();
				setState(302);
				((LabelContext) _localctx).p_3_3 = listProfItem();
				((LabelContext) _localctx).result = new lbnf.Absyn.LabPF(((LabelContext) _localctx).p_3_1.result,
						((LabelContext) _localctx).p_3_2.result, ((LabelContext) _localctx).p_3_3.result);
			}
				break;
			case 4:
				enterOuterAlt(_localctx, 4); {
				setState(305);
				((LabelContext) _localctx).p_4_1 = labelId();
				setState(306);
				((LabelContext) _localctx).p_4_2 = labelId();
				((LabelContext) _localctx).result = new lbnf.Absyn.LabF(((LabelContext) _localctx).p_4_1.result,
						((LabelContext) _localctx).p_4_2.result);
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelIdContext extends ParserRuleContext {
		public lbnf.Absyn.LabelId result;
		public Token p_1_1;

		public TerminalNode IDENT() {
			return getToken(LBNFParser.IDENT, 0);
		}

		public TerminalNode Surrogate_id_SYMB_5() {
			return getToken(LBNFParser.Surrogate_id_SYMB_5, 0);
		}

		public TerminalNode Surrogate_id_SYMB_3() {
			return getToken(LBNFParser.Surrogate_id_SYMB_3, 0);
		}

		public TerminalNode Surrogate_id_SYMB_4() {
			return getToken(LBNFParser.Surrogate_id_SYMB_4, 0);
		}

		public TerminalNode Surrogate_id_SYMB_6() {
			return getToken(LBNFParser.Surrogate_id_SYMB_6, 0);
		}

		public TerminalNode Surrogate_id_SYMB_7() {
			return getToken(LBNFParser.Surrogate_id_SYMB_7, 0);
		}

		public TerminalNode Surrogate_id_SYMB_8() {
			return getToken(LBNFParser.Surrogate_id_SYMB_8, 0);
		}

		public LabelIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_labelId;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterLabelId(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitLabelId(this);
		}
	}

	public final LabelIdContext labelId() throws RecognitionException {
		LabelIdContext _localctx = new LabelIdContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_labelId);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(311);
				((LabelIdContext) _localctx).p_1_1 = match(IDENT);
				((LabelIdContext) _localctx).result = new lbnf.Absyn.Id(((LabelIdContext) _localctx).p_1_1.getText());
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(313);
				match(Surrogate_id_SYMB_5);
				((LabelIdContext) _localctx).result = new lbnf.Absyn.Wild();
			}
				break;
			case 3:
				enterOuterAlt(_localctx, 3); {
				setState(315);
				match(Surrogate_id_SYMB_3);
				setState(316);
				match(Surrogate_id_SYMB_4);
				((LabelIdContext) _localctx).result = new lbnf.Absyn.ListE();
			}
				break;
			case 4:
				enterOuterAlt(_localctx, 4); {
				setState(318);
				match(Surrogate_id_SYMB_6);
				setState(319);
				match(Surrogate_id_SYMB_7);
				setState(320);
				match(Surrogate_id_SYMB_8);
				((LabelIdContext) _localctx).result = new lbnf.Absyn.ListCons();
			}
				break;
			case 5:
				enterOuterAlt(_localctx, 5); {
				setState(322);
				match(Surrogate_id_SYMB_6);
				setState(323);
				match(Surrogate_id_SYMB_7);
				setState(324);
				match(Surrogate_id_SYMB_3);
				setState(325);
				match(Surrogate_id_SYMB_4);
				setState(326);
				match(Surrogate_id_SYMB_8);
				((LabelIdContext) _localctx).result = new lbnf.Absyn.ListOne();
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProfItemContext extends ParserRuleContext {
		public lbnf.Absyn.ProfItem result;
		public ListIntListContext p_1_3;
		public ListIntegerContext p_1_7;

		public TerminalNode Surrogate_id_SYMB_6() {
			return getToken(LBNFParser.Surrogate_id_SYMB_6, 0);
		}

		public List<TerminalNode> Surrogate_id_SYMB_3() {
			return getTokens(LBNFParser.Surrogate_id_SYMB_3);
		}

		public TerminalNode Surrogate_id_SYMB_3(int i) {
			return getToken(LBNFParser.Surrogate_id_SYMB_3, i);
		}

		public List<TerminalNode> Surrogate_id_SYMB_4() {
			return getTokens(LBNFParser.Surrogate_id_SYMB_4);
		}

		public TerminalNode Surrogate_id_SYMB_4(int i) {
			return getToken(LBNFParser.Surrogate_id_SYMB_4, i);
		}

		public TerminalNode Surrogate_id_SYMB_9() {
			return getToken(LBNFParser.Surrogate_id_SYMB_9, 0);
		}

		public TerminalNode Surrogate_id_SYMB_8() {
			return getToken(LBNFParser.Surrogate_id_SYMB_8, 0);
		}

		public ListIntListContext listIntList() {
			return getRuleContext(ListIntListContext.class, 0);
		}

		public ListIntegerContext listInteger() {
			return getRuleContext(ListIntegerContext.class, 0);
		}

		public ProfItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_profItem;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterProfItem(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitProfItem(this);
		}
	}

	public final ProfItemContext profItem() throws RecognitionException {
		ProfItemContext _localctx = new ProfItemContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_profItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(330);
				match(Surrogate_id_SYMB_6);
				setState(331);
				match(Surrogate_id_SYMB_3);
				setState(332);
				((ProfItemContext) _localctx).p_1_3 = listIntList();
				setState(333);
				match(Surrogate_id_SYMB_4);
				setState(334);
				match(Surrogate_id_SYMB_9);
				setState(335);
				match(Surrogate_id_SYMB_3);
				setState(336);
				((ProfItemContext) _localctx).p_1_7 = listInteger();
				setState(337);
				match(Surrogate_id_SYMB_4);
				setState(338);
				match(Surrogate_id_SYMB_8);
				((ProfItemContext) _localctx).result = new lbnf.Absyn.ProfIt(((ProfItemContext) _localctx).p_1_3.result,
						((ProfItemContext) _localctx).p_1_7.result);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntListContext extends ParserRuleContext {
		public lbnf.Absyn.IntList result;
		public ListIntegerContext p_1_2;

		public TerminalNode Surrogate_id_SYMB_3() {
			return getToken(LBNFParser.Surrogate_id_SYMB_3, 0);
		}

		public TerminalNode Surrogate_id_SYMB_4() {
			return getToken(LBNFParser.Surrogate_id_SYMB_4, 0);
		}

		public ListIntegerContext listInteger() {
			return getRuleContext(ListIntegerContext.class, 0);
		}

		public IntListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_intList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterIntList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitIntList(this);
		}
	}

	public final IntListContext intList() throws RecognitionException {
		IntListContext _localctx = new IntListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_intList);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(341);
				match(Surrogate_id_SYMB_3);
				setState(342);
				((IntListContext) _localctx).p_1_2 = listInteger();
				setState(343);
				match(Surrogate_id_SYMB_4);
				((IntListContext) _localctx).result = new lbnf.Absyn.Ints(((IntListContext) _localctx).p_1_2.result);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListIntegerContext extends ParserRuleContext {
		public lbnf.Absyn.ListInteger result;
		public Token p_2_1;
		public Token p_3_1;
		public ListIntegerContext p_3_3;

		public TerminalNode INTEGER() {
			return getToken(LBNFParser.INTEGER, 0);
		}

		public TerminalNode Surrogate_id_SYMB_9() {
			return getToken(LBNFParser.Surrogate_id_SYMB_9, 0);
		}

		public ListIntegerContext listInteger() {
			return getRuleContext(ListIntegerContext.class, 0);
		}

		public ListIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_listInteger;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterListInteger(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitListInteger(this);
		}
	}

	public final ListIntegerContext listInteger() throws RecognitionException {
		ListIntegerContext _localctx = new ListIntegerContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_listInteger);
		try {
			setState(354);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				((ListIntegerContext) _localctx).result = new lbnf.Absyn.ListInteger();
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(347);
				((ListIntegerContext) _localctx).p_2_1 = match(INTEGER);
				((ListIntegerContext) _localctx).result = new lbnf.Absyn.ListInteger();
				_localctx.result.addLast(Integer.parseInt(((ListIntegerContext) _localctx).p_2_1.getText()));
			}
				break;
			case 3:
				enterOuterAlt(_localctx, 3); {
				setState(349);
				((ListIntegerContext) _localctx).p_3_1 = match(INTEGER);
				setState(350);
				match(Surrogate_id_SYMB_9);
				setState(351);
				((ListIntegerContext) _localctx).p_3_3 = listInteger();
				((ListIntegerContext) _localctx).result = ((ListIntegerContext) _localctx).p_3_3.result;
				_localctx.result.addFirst(Integer.parseInt(((ListIntegerContext) _localctx).p_3_1.getText()));
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListIntListContext extends ParserRuleContext {
		public lbnf.Absyn.ListIntList result;
		public IntListContext p_2_1;
		public IntListContext p_3_1;
		public ListIntListContext p_3_3;

		public IntListContext intList() {
			return getRuleContext(IntListContext.class, 0);
		}

		public TerminalNode Surrogate_id_SYMB_9() {
			return getToken(LBNFParser.Surrogate_id_SYMB_9, 0);
		}

		public ListIntListContext listIntList() {
			return getRuleContext(ListIntListContext.class, 0);
		}

		public ListIntListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_listIntList;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterListIntList(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitListIntList(this);
		}
	}

	public final ListIntListContext listIntList() throws RecognitionException {
		ListIntListContext _localctx = new ListIntListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_listIntList);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				((ListIntListContext) _localctx).result = new lbnf.Absyn.ListIntList();
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(357);
				((ListIntListContext) _localctx).p_2_1 = intList();
				((ListIntListContext) _localctx).result = new lbnf.Absyn.ListIntList();
				_localctx.result.addLast(((ListIntListContext) _localctx).p_2_1.result);
			}
				break;
			case 3:
				enterOuterAlt(_localctx, 3); {
				setState(360);
				((ListIntListContext) _localctx).p_3_1 = intList();
				setState(361);
				match(Surrogate_id_SYMB_9);
				setState(362);
				((ListIntListContext) _localctx).p_3_3 = listIntList();
				((ListIntListContext) _localctx).result = ((ListIntListContext) _localctx).p_3_3.result;
				_localctx.result.addFirst(((ListIntListContext) _localctx).p_3_1.result);
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListProfItemContext extends ParserRuleContext {
		public lbnf.Absyn.ListProfItem result;
		public ProfItemContext p_1_1;
		public ProfItemContext p_2_1;
		public ListProfItemContext p_2_2;

		public ProfItemContext profItem() {
			return getRuleContext(ProfItemContext.class, 0);
		}

		public ListProfItemContext listProfItem() {
			return getRuleContext(ListProfItemContext.class, 0);
		}

		public ListProfItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_listProfItem;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterListProfItem(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitListProfItem(this);
		}
	}

	public final ListProfItemContext listProfItem() throws RecognitionException {
		ListProfItemContext _localctx = new ListProfItemContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_listProfItem);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(367);
				((ListProfItemContext) _localctx).p_1_1 = profItem();
				((ListProfItemContext) _localctx).result = new lbnf.Absyn.ListProfItem();
				_localctx.result.addLast(((ListProfItemContext) _localctx).p_1_1.result);
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(370);
				((ListProfItemContext) _localctx).p_2_1 = profItem();
				setState(371);
				((ListProfItemContext) _localctx).p_2_2 = listProfItem();
				((ListProfItemContext) _localctx).result = ((ListProfItemContext) _localctx).p_2_2.result;
				_localctx.result.addFirst(((ListProfItemContext) _localctx).p_2_1.result);
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListStringContext extends ParserRuleContext {
		public lbnf.Absyn.ListString result;
		public Token p_1_1;
		public Token p_2_1;
		public ListStringContext p_2_3;

		public TerminalNode STRING() {
			return getToken(LBNFParser.STRING, 0);
		}

		public TerminalNode Surrogate_id_SYMB_9() {
			return getToken(LBNFParser.Surrogate_id_SYMB_9, 0);
		}

		public ListStringContext listString() {
			return getRuleContext(ListStringContext.class, 0);
		}

		public ListStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_listString;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterListString(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitListString(this);
		}
	}

	public final ListStringContext listString() throws RecognitionException {
		ListStringContext _localctx = new ListStringContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_listString);
		try {
			setState(383);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(376);
				((ListStringContext) _localctx).p_1_1 = match(STRING);
				((ListStringContext) _localctx).result = new lbnf.Absyn.ListString();
				_localctx.result.addLast(((ListStringContext) _localctx).p_1_1.getText()
						.substring(1, ((ListStringContext) _localctx).p_1_1.getText().length() - 1).translateEscapes());
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(378);
				((ListStringContext) _localctx).p_2_1 = match(STRING);
				setState(379);
				match(Surrogate_id_SYMB_9);
				setState(380);
				((ListStringContext) _localctx).p_2_3 = listString();
				((ListStringContext) _localctx).result = ((ListStringContext) _localctx).p_2_3.result;
				_localctx.result.addFirst(((ListStringContext) _localctx).p_2_1.getText()
						.substring(1, ((ListStringContext) _localctx).p_2_1.getText().length() - 1).translateEscapes());
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListRHSContext extends ParserRuleContext {
		public lbnf.Absyn.ListRHS result;
		public RHSContext p_1_1;
		public RHSContext p_2_1;
		public ListRHSContext p_2_3;

		public RHSContext rHS() {
			return getRuleContext(RHSContext.class, 0);
		}

		public TerminalNode Surrogate_id_SYMB_10() {
			return getToken(LBNFParser.Surrogate_id_SYMB_10, 0);
		}

		public ListRHSContext listRHS() {
			return getRuleContext(ListRHSContext.class, 0);
		}

		public ListRHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_listRHS;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterListRHS(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitListRHS(this);
		}
	}

	public final ListRHSContext listRHS() throws RecognitionException {
		ListRHSContext _localctx = new ListRHSContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_listRHS);
		try {
			setState(393);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(385);
				((ListRHSContext) _localctx).p_1_1 = rHS();
				((ListRHSContext) _localctx).result = new lbnf.Absyn.ListRHS();
				_localctx.result.addLast(((ListRHSContext) _localctx).p_1_1.result);
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(388);
				((ListRHSContext) _localctx).p_2_1 = rHS();
				setState(389);
				match(Surrogate_id_SYMB_10);
				setState(390);
				((ListRHSContext) _localctx).p_2_3 = listRHS();
				((ListRHSContext) _localctx).result = ((ListRHSContext) _localctx).p_2_3.result;
				_localctx.result.addFirst(((ListRHSContext) _localctx).p_2_1.result);
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RHSContext extends ParserRuleContext {
		public lbnf.Absyn.RHS result;
		public ListItemContext p_1_1;

		public ListItemContext listItem() {
			return getRuleContext(ListItemContext.class, 0);
		}

		public RHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_rHS;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterRHS(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitRHS(this);
		}
	}

	public final RHSContext rHS() throws RecognitionException {
		RHSContext _localctx = new RHSContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_rHS);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(395);
				((RHSContext) _localctx).p_1_1 = listItem(0);
				((RHSContext) _localctx).result = new lbnf.Absyn.MkRHS(((RHSContext) _localctx).p_1_1.result);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinimumSizeContext extends ParserRuleContext {
		public lbnf.Absyn.MinimumSize result;

		public TerminalNode Surrogate_id_SYMB_27() {
			return getToken(LBNFParser.Surrogate_id_SYMB_27, 0);
		}

		public MinimumSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_minimumSize;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterMinimumSize(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitMinimumSize(this);
		}
	}

	public final MinimumSizeContext minimumSize() throws RecognitionException {
		MinimumSizeContext _localctx = new MinimumSizeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_minimumSize);
		try {
			setState(401);
			switch (_input.LA(1)) {
			case Surrogate_id_SYMB_27:
				enterOuterAlt(_localctx, 1); {
				setState(398);
				match(Surrogate_id_SYMB_27);
				((MinimumSizeContext) _localctx).result = new lbnf.Absyn.MNonempty();
			}
				break;
			case EOF:
			case Surrogate_id_SYMB_3:
			case IDENT:
				enterOuterAlt(_localctx, 2); {
				((MinimumSizeContext) _localctx).result = new lbnf.Absyn.MEmpty();
			}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reg2Context extends ParserRuleContext {
		public lbnf.Absyn.Reg result;
		public Reg2Context p_1_1;
		public Reg3Context p_2_1;
		public Reg3Context p_1_2;

		public Reg3Context reg3() {
			return getRuleContext(Reg3Context.class, 0);
		}

		public Reg2Context reg2() {
			return getRuleContext(Reg2Context.class, 0);
		}

		public Reg2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_reg2;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterReg2(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitReg2(this);
		}
	}

	public final Reg2Context reg2() throws RecognitionException {
		return reg2(0);
	}

	private Reg2Context reg2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Reg2Context _localctx = new Reg2Context(_ctx, _parentState);
		Reg2Context _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_reg2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				{
					setState(404);
					((Reg2Context) _localctx).p_2_1 = reg3(0);
					((Reg2Context) _localctx).result = ((Reg2Context) _localctx).p_2_1.result;
				}
				_ctx.stop = _input.LT(-1);
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new Reg2Context(_parentctx, _parentState);
								_localctx.p_1_1 = _prevctx;
								_localctx.p_1_1 = _prevctx;
								pushNewRecursionContext(_localctx, _startState, RULE_reg2);
								setState(407);
								if (!(precpred(_ctx, 2)))
									throw new FailedPredicateException(this, "precpred(_ctx, 2)");
								setState(408);
								((Reg2Context) _localctx).p_1_2 = reg3(0);
								((Reg2Context) _localctx).result = new lbnf.Absyn.RSeq(
										((Reg2Context) _localctx).p_1_1.result, ((Reg2Context) _localctx).p_1_2.result);
							}
						}
					}
					setState(415);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 13, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Reg1Context extends ParserRuleContext {
		public lbnf.Absyn.Reg result;
		public Reg1Context p_1_1;
		public Reg2Context p_2_1;
		public Reg2Context p_2_3;
		public Reg2Context p_3_1;
		public Reg2Context p_1_3;

		public TerminalNode Surrogate_id_SYMB_11() {
			return getToken(LBNFParser.Surrogate_id_SYMB_11, 0);
		}

		public List<Reg2Context> reg2() {
			return getRuleContexts(Reg2Context.class);
		}

		public Reg2Context reg2(int i) {
			return getRuleContext(Reg2Context.class, i);
		}

		public TerminalNode Surrogate_id_SYMB_10() {
			return getToken(LBNFParser.Surrogate_id_SYMB_10, 0);
		}

		public Reg1Context reg1() {
			return getRuleContext(Reg1Context.class, 0);
		}

		public Reg1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_reg1;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterReg1(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitReg1(this);
		}
	}

	public final Reg1Context reg1() throws RecognitionException {
		return reg1(0);
	}

	private Reg1Context reg1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Reg1Context _localctx = new Reg1Context(_ctx, _parentState);
		Reg1Context _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_reg1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(425);
				_errHandler.sync(this);
				switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
				case 1: {
					setState(417);
					((Reg1Context) _localctx).p_2_1 = reg2(0);
					setState(418);
					match(Surrogate_id_SYMB_11);
					setState(419);
					((Reg1Context) _localctx).p_2_3 = reg2(0);
					((Reg1Context) _localctx).result = new lbnf.Absyn.RMinus(((Reg1Context) _localctx).p_2_1.result,
							((Reg1Context) _localctx).p_2_3.result);
				}
					break;
				case 2: {
					setState(422);
					((Reg1Context) _localctx).p_3_1 = reg2(0);
					((Reg1Context) _localctx).result = ((Reg1Context) _localctx).p_3_1.result;
				}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							{
								_localctx = new Reg1Context(_parentctx, _parentState);
								_localctx.p_1_1 = _prevctx;
								_localctx.p_1_1 = _prevctx;
								pushNewRecursionContext(_localctx, _startState, RULE_reg1);
								setState(427);
								if (!(precpred(_ctx, 3)))
									throw new FailedPredicateException(this, "precpred(_ctx, 3)");
								setState(428);
								match(Surrogate_id_SYMB_10);
								setState(429);
								((Reg1Context) _localctx).p_1_3 = reg2(0);
								((Reg1Context) _localctx).result = new lbnf.Absyn.RAlt(
										((Reg1Context) _localctx).p_1_1.result, ((Reg1Context) _localctx).p_1_3.result);
							}
						}
					}
					setState(436);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Reg3Context extends ParserRuleContext {
		public lbnf.Absyn.Reg result;
		public Reg3Context p_1_1;
		public Reg3Context p_2_1;
		public Reg3Context p_3_1;
		public Token p_5_1;
		public Token p_6_2;
		public Token p_7_2;
		public RegContext p_13_2;

		public TerminalNode Surrogate_id_SYMB_22() {
			return getToken(LBNFParser.Surrogate_id_SYMB_22, 0);
		}

		public TerminalNode CHAR() {
			return getToken(LBNFParser.CHAR, 0);
		}

		public TerminalNode Surrogate_id_SYMB_3() {
			return getToken(LBNFParser.Surrogate_id_SYMB_3, 0);
		}

		public TerminalNode Surrogate_id_SYMB_4() {
			return getToken(LBNFParser.Surrogate_id_SYMB_4, 0);
		}

		public TerminalNode STRING() {
			return getToken(LBNFParser.STRING, 0);
		}

		public TerminalNode Surrogate_id_SYMB_15() {
			return getToken(LBNFParser.Surrogate_id_SYMB_15, 0);
		}

		public TerminalNode Surrogate_id_SYMB_16() {
			return getToken(LBNFParser.Surrogate_id_SYMB_16, 0);
		}

		public TerminalNode Surrogate_id_SYMB_20() {
			return getToken(LBNFParser.Surrogate_id_SYMB_20, 0);
		}

		public TerminalNode Surrogate_id_SYMB_25() {
			return getToken(LBNFParser.Surrogate_id_SYMB_25, 0);
		}

		public TerminalNode Surrogate_id_SYMB_35() {
			return getToken(LBNFParser.Surrogate_id_SYMB_35, 0);
		}

		public TerminalNode Surrogate_id_SYMB_26() {
			return getToken(LBNFParser.Surrogate_id_SYMB_26, 0);
		}

		public TerminalNode Surrogate_id_SYMB_17() {
			return getToken(LBNFParser.Surrogate_id_SYMB_17, 0);
		}

		public TerminalNode Surrogate_id_SYMB_6() {
			return getToken(LBNFParser.Surrogate_id_SYMB_6, 0);
		}

		public TerminalNode Surrogate_id_SYMB_8() {
			return getToken(LBNFParser.Surrogate_id_SYMB_8, 0);
		}

		public RegContext reg() {
			return getRuleContext(RegContext.class, 0);
		}

		public TerminalNode Surrogate_id_SYMB_12() {
			return getToken(LBNFParser.Surrogate_id_SYMB_12, 0);
		}

		public Reg3Context reg3() {
			return getRuleContext(Reg3Context.class, 0);
		}

		public TerminalNode Surrogate_id_SYMB_13() {
			return getToken(LBNFParser.Surrogate_id_SYMB_13, 0);
		}

		public TerminalNode Surrogate_id_SYMB_14() {
			return getToken(LBNFParser.Surrogate_id_SYMB_14, 0);
		}

		public Reg3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_reg3;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterReg3(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitReg3(this);
		}
	}

	public final Reg3Context reg3() throws RecognitionException {
		return reg3(0);
	}

	private Reg3Context reg3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Reg3Context _localctx = new Reg3Context(_ctx, _parentState);
		Reg3Context _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_reg3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(465);
				switch (_input.LA(1)) {
				case Surrogate_id_SYMB_22: {
					setState(438);
					match(Surrogate_id_SYMB_22);
					((Reg3Context) _localctx).result = new lbnf.Absyn.REps();
				}
					break;
				case CHAR: {
					setState(440);
					((Reg3Context) _localctx).p_5_1 = match(CHAR);
					((Reg3Context) _localctx).result = new lbnf.Absyn.RChar(((Reg3Context) _localctx).p_5_1.getText()
							.substring(1, ((Reg3Context) _localctx).p_5_1.getText().length() - 1).translateEscapes()
							.charAt(0));
				}
					break;
				case Surrogate_id_SYMB_3: {
					setState(442);
					match(Surrogate_id_SYMB_3);
					setState(443);
					((Reg3Context) _localctx).p_6_2 = match(STRING);
					setState(444);
					match(Surrogate_id_SYMB_4);
					((Reg3Context) _localctx).result = new lbnf.Absyn.RAlts(((Reg3Context) _localctx).p_6_2.getText()
							.substring(1, ((Reg3Context) _localctx).p_6_2.getText().length() - 1).translateEscapes());
				}
					break;
				case Surrogate_id_SYMB_15: {
					setState(446);
					match(Surrogate_id_SYMB_15);
					setState(447);
					((Reg3Context) _localctx).p_7_2 = match(STRING);
					setState(448);
					match(Surrogate_id_SYMB_16);
					((Reg3Context) _localctx).result = new lbnf.Absyn.RSeqs(((Reg3Context) _localctx).p_7_2.getText()
							.substring(1, ((Reg3Context) _localctx).p_7_2.getText().length() - 1).translateEscapes());
				}
					break;
				case Surrogate_id_SYMB_20: {
					setState(450);
					match(Surrogate_id_SYMB_20);
					((Reg3Context) _localctx).result = new lbnf.Absyn.RDigit();
				}
					break;
				case Surrogate_id_SYMB_25: {
					setState(452);
					match(Surrogate_id_SYMB_25);
					((Reg3Context) _localctx).result = new lbnf.Absyn.RLetter();
				}
					break;
				case Surrogate_id_SYMB_35: {
					setState(454);
					match(Surrogate_id_SYMB_35);
					((Reg3Context) _localctx).result = new lbnf.Absyn.RUpper();
				}
					break;
				case Surrogate_id_SYMB_26: {
					setState(456);
					match(Surrogate_id_SYMB_26);
					((Reg3Context) _localctx).result = new lbnf.Absyn.RLower();
				}
					break;
				case Surrogate_id_SYMB_17: {
					setState(458);
					match(Surrogate_id_SYMB_17);
					((Reg3Context) _localctx).result = new lbnf.Absyn.RAny();
				}
					break;
				case Surrogate_id_SYMB_6: {
					setState(460);
					match(Surrogate_id_SYMB_6);
					setState(461);
					((Reg3Context) _localctx).p_13_2 = reg();
					setState(462);
					match(Surrogate_id_SYMB_8);
					((Reg3Context) _localctx).result = ((Reg3Context) _localctx).p_13_2.result;
				}
					break;
				default:
					throw new NoViableAltException(this);
				}
				_ctx.stop = _input.LT(-1);
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
				while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(476);
							_errHandler.sync(this);
							switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
							case 1: {
								_localctx = new Reg3Context(_parentctx, _parentState);
								_localctx.p_1_1 = _prevctx;
								_localctx.p_1_1 = _prevctx;
								pushNewRecursionContext(_localctx, _startState, RULE_reg3);
								setState(467);
								if (!(precpred(_ctx, 13)))
									throw new FailedPredicateException(this, "precpred(_ctx, 13)");
								setState(468);
								match(Surrogate_id_SYMB_12);
								((Reg3Context) _localctx).result = new lbnf.Absyn.RStar(
										((Reg3Context) _localctx).p_1_1.result);
							}
								break;
							case 2: {
								_localctx = new Reg3Context(_parentctx, _parentState);
								_localctx.p_2_1 = _prevctx;
								_localctx.p_2_1 = _prevctx;
								pushNewRecursionContext(_localctx, _startState, RULE_reg3);
								setState(470);
								if (!(precpred(_ctx, 12)))
									throw new FailedPredicateException(this, "precpred(_ctx, 12)");
								setState(471);
								match(Surrogate_id_SYMB_13);
								((Reg3Context) _localctx).result = new lbnf.Absyn.RPlus(
										((Reg3Context) _localctx).p_2_1.result);
							}
								break;
							case 3: {
								_localctx = new Reg3Context(_parentctx, _parentState);
								_localctx.p_3_1 = _prevctx;
								_localctx.p_3_1 = _prevctx;
								pushNewRecursionContext(_localctx, _startState, RULE_reg3);
								setState(473);
								if (!(precpred(_ctx, 11)))
									throw new FailedPredicateException(this, "precpred(_ctx, 11)");
								setState(474);
								match(Surrogate_id_SYMB_14);
								((Reg3Context) _localctx).result = new lbnf.Absyn.ROpt(
										((Reg3Context) _localctx).p_3_1.result);
							}
								break;
							}
						}
					}
					setState(480);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RegContext extends ParserRuleContext {
		public lbnf.Absyn.Reg result;
		public Reg1Context p_1_1;

		public Reg1Context reg1() {
			return getRuleContext(Reg1Context.class, 0);
		}

		public RegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_reg;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterReg(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitReg(this);
		}
	}

	public final RegContext reg() throws RecognitionException {
		RegContext _localctx = new RegContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_reg);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(481);
				((RegContext) _localctx).p_1_1 = reg1(0);
				((RegContext) _localctx).result = ((RegContext) _localctx).p_1_1.result;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListIdentContext extends ParserRuleContext {
		public lbnf.Absyn.ListIdent result;
		public Token p_1_1;
		public Token p_2_1;
		public ListIdentContext p_2_3;

		public TerminalNode IDENT() {
			return getToken(LBNFParser.IDENT, 0);
		}

		public TerminalNode Surrogate_id_SYMB_9() {
			return getToken(LBNFParser.Surrogate_id_SYMB_9, 0);
		}

		public ListIdentContext listIdent() {
			return getRuleContext(ListIdentContext.class, 0);
		}

		public ListIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_listIdent;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).enterListIdent(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof LBNFParserListener)
				((LBNFParserListener) listener).exitListIdent(this);
		}
	}

	public final ListIdentContext listIdent() throws RecognitionException {
		ListIdentContext _localctx = new ListIdentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_listIdent);
		try {
			setState(491);
			_errHandler.sync(this);
			switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1); {
				setState(484);
				((ListIdentContext) _localctx).p_1_1 = match(IDENT);
				((ListIdentContext) _localctx).result = new lbnf.Absyn.ListIdent();
				_localctx.result.addLast(((ListIdentContext) _localctx).p_1_1.getText());
			}
				break;
			case 2:
				enterOuterAlt(_localctx, 2); {
				setState(486);
				((ListIdentContext) _localctx).p_2_1 = match(IDENT);
				setState(487);
				match(Surrogate_id_SYMB_9);
				setState(488);
				((ListIdentContext) _localctx).p_2_3 = listIdent();
				((ListIdentContext) _localctx).result = ((ListIdentContext) _localctx).p_2_3.result;
				_localctx.result.addFirst(((ListIdentContext) _localctx).p_2_1.getText());
			}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23:
			return listDef_sempred((ListDefContext) _localctx, predIndex);
		case 24:
			return listItem_sempred((ListItemContext) _localctx, predIndex);
		case 39:
			return reg2_sempred((Reg2Context) _localctx, predIndex);
		case 40:
			return reg1_sempred((Reg1Context) _localctx, predIndex);
		case 41:
			return reg3_sempred((Reg3Context) _localctx, predIndex);
		}
		return true;
	}

	private boolean listDef_sempred(ListDefContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean listItem_sempred(ListItemContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private boolean reg2_sempred(Reg2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	private boolean reg1_sempred(Reg1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	private boolean reg3_sempred(Reg3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u01f0\4\2\t\2\4"
			+ "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
			+ "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
			+ "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
			+ "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
			+ "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
			+ ",\t,\4-\t-\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5"
			+ "\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"
			+ "\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"
			+ "\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"
			+ "\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"
			+ "\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"
			+ "\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u00be\n\31\f\31\16\31\u00c1"
			+ "\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u00ca\n\32\f\32\16\32\u00cd"
			+ "\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"
			+ "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"
			+ "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"
			+ "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"
			+ "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"
			+ "\3\33\3\33\5\33\u0116\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u011d\n\34\3"
			+ "\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0126\n\35\3\36\3\36\3\36\3\36"
			+ "\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0138"
			+ "\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"
			+ "\3\37\3\37\3\37\3\37\5\37\u014b\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "
			+ "\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0165\n\"\3#\3#\3"
			+ "#\3#\3#\3#\3#\3#\3#\5#\u0170\n#\3$\3$\3$\3$\3$\3$\3$\5$\u0179\n$\3%\3"
			+ "%\3%\3%\3%\3%\3%\5%\u0182\n%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u018c\n&\3\'\3"
			+ "\'\3\'\3(\3(\3(\5(\u0194\n(\3)\3)\3)\3)\3)\3)\3)\3)\7)\u019e\n)\f)\16"
			+ ")\u01a1\13)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u01ac\n*\3*\3*\3*\3*\3*\7*\u01b3"
			+ "\n*\f*\16*\u01b6\13*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"
			+ "+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01d4\n+\3+\3+\3+\3+\3+\3+\3+\3"
			+ "+\3+\7+\u01df\n+\f+\16+\u01e2\13+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\5-\u01ee"
			+ "\n-\3-\2\7\60\62PRT.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"
			+ "\62\64\668:<>@BDFHJLNPRTVX\2\2\u01f3\2Z\3\2\2\2\4^\3\2\2\2\6b\3\2\2\2"
			+ "\bf\3\2\2\2\nj\3\2\2\2\fn\3\2\2\2\16r\3\2\2\2\20v\3\2\2\2\22z\3\2\2\2"
			+ "\24~\3\2\2\2\26\u0082\3\2\2\2\30\u0086\3\2\2\2\32\u008a\3\2\2\2\34\u008e"
			+ "\3\2\2\2\36\u0092\3\2\2\2 \u0096\3\2\2\2\"\u009a\3\2\2\2$\u009e\3\2\2"
			+ "\2&\u00a2\3\2\2\2(\u00a6\3\2\2\2*\u00aa\3\2\2\2,\u00ae\3\2\2\2.\u00b2"
			+ "\3\2\2\2\60\u00b5\3\2\2\2\62\u00c2\3\2\2\2\64\u0115\3\2\2\2\66\u011c\3"
			+ "\2\2\28\u0125\3\2\2\2:\u0137\3\2\2\2<\u014a\3\2\2\2>\u014c\3\2\2\2@\u0157"
			+ "\3\2\2\2B\u0164\3\2\2\2D\u016f\3\2\2\2F\u0178\3\2\2\2H\u0181\3\2\2\2J"
			+ "\u018b\3\2\2\2L\u018d\3\2\2\2N\u0193\3\2\2\2P\u0195\3\2\2\2R\u01ab\3\2"
			+ "\2\2T\u01d3\3\2\2\2V\u01e3\3\2\2\2X\u01ed\3\2\2\2Z[\5.\30\2[\\\7\2\2\3"
			+ "\\]\b\2\1\2]\3\3\2\2\2^_\5\60\31\2_`\7\2\2\3`a\b\3\1\2a\5\3\2\2\2bc\5"
			+ "\62\32\2cd\7\2\2\3de\b\4\1\2e\7\3\2\2\2fg\5\64\33\2gh\7\2\2\3hi\b\5\1"
			+ "\2i\t\3\2\2\2jk\5\66\34\2kl\7\2\2\3lm\b\6\1\2m\13\3\2\2\2no\58\35\2op"
			+ "\7\2\2\3pq\b\7\1\2q\r\3\2\2\2rs\5:\36\2st\7\2\2\3tu\b\b\1\2u\17\3\2\2"
			+ "\2vw\5<\37\2wx\7\2\2\3xy\b\t\1\2y\21\3\2\2\2z{\5> \2{|\7\2\2\3|}\b\n\1"
			+ "\2}\23\3\2\2\2~\177\5@!\2\177\u0080\7\2\2\3\u0080\u0081\b\13\1\2\u0081"
			+ "\25\3\2\2\2\u0082\u0083\5B\"\2\u0083\u0084\7\2\2\3\u0084\u0085\b\f\1\2"
			+ "\u0085\27\3\2\2\2\u0086\u0087\5D#\2\u0087\u0088\7\2\2\3\u0088\u0089\b"
			+ "\r\1\2\u0089\31\3\2\2\2\u008a\u008b\5F$\2\u008b\u008c\7\2\2\3\u008c\u008d"
			+ "\b\16\1\2\u008d\33\3\2\2\2\u008e\u008f\5H%\2\u008f\u0090\7\2\2\3\u0090"
			+ "\u0091\b\17\1\2\u0091\35\3\2\2\2\u0092\u0093\5J&\2\u0093\u0094\7\2\2\3"
			+ "\u0094\u0095\b\20\1\2\u0095\37\3\2\2\2\u0096\u0097\5L\'\2\u0097\u0098"
			+ "\7\2\2\3\u0098\u0099\b\21\1\2\u0099!\3\2\2\2\u009a\u009b\5N(\2\u009b\u009c"
			+ "\7\2\2\3\u009c\u009d\b\22\1\2\u009d#\3\2\2\2\u009e\u009f\5P)\2\u009f\u00a0"
			+ "\7\2\2\3\u00a0\u00a1\b\23\1\2\u00a1%\3\2\2\2\u00a2\u00a3\5R*\2\u00a3\u00a4"
			+ "\7\2\2\3\u00a4\u00a5\b\24\1\2\u00a5\'\3\2\2\2\u00a6\u00a7\5T+\2\u00a7"
			+ "\u00a8\7\2\2\3\u00a8\u00a9\b\25\1\2\u00a9)\3\2\2\2\u00aa\u00ab\5V,\2\u00ab"
			+ "\u00ac\7\2\2\3\u00ac\u00ad\b\26\1\2\u00ad+\3\2\2\2\u00ae\u00af\5X-\2\u00af"
			+ "\u00b0\7\2\2\3\u00b0\u00b1\b\27\1\2\u00b1-\3\2\2\2\u00b2\u00b3\5\60\31"
			+ "\2\u00b3\u00b4\b\30\1\2\u00b4/\3\2\2\2\u00b5\u00b6\b\31\1\2\u00b6\u00b7"
			+ "\b\31\1\2\u00b7\u00bf\3\2\2\2\u00b8\u00b9\f\3\2\2\u00b9\u00ba\5\64\33"
			+ "\2\u00ba\u00bb\7\3\2\2\u00bb\u00bc\b\31\1\2\u00bc\u00be\3\2\2\2\u00bd"
			+ "\u00b8\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"
			+ "\2\2\u00c0\61\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\b\32\1\2\u00c3\u00c4"
			+ "\b\32\1\2\u00c4\u00cb\3\2\2\2\u00c5\u00c6\f\3\2\2\u00c6\u00c7\5\66\34"
			+ "\2\u00c7\u00c8\b\32\1\2\u00c8\u00ca\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca"
			+ "\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\63\3\2\2"
			+ "\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\5:\36\2\u00cf\u00d0\7\4\2\2\u00d0\u00d1"
			+ "\58\35\2\u00d1\u00d2\7\5\2\2\u00d2\u00d3\5\62\32\2\u00d3\u00d4\b\33\1"
			+ "\2\u00d4\u0116\3\2\2\2\u00d5\u00d6\7\26\2\2\u00d6\u00d7\7-\2\2\u00d7\u0116"
			+ "\b\33\1\2\u00d8\u00d9\7\26\2\2\u00d9\u00da\7-\2\2\u00da\u00db\7-\2\2\u00db"
			+ "\u0116\b\33\1\2\u00dc\u00dd\7\32\2\2\u00dd\u00de\5:\36\2\u00de\u00df\7"
			+ "\4\2\2\u00df\u00e0\58\35\2\u00e0\u00e1\7\5\2\2\u00e1\u00e2\5\62\32\2\u00e2"
			+ "\u00e3\b\33\1\2\u00e3\u0116\3\2\2\2\u00e4\u00e5\7$\2\2\u00e5\u00e6\7*"
			+ "\2\2\u00e6\u00e7\5V,\2\u00e7\u00e8\b\33\1\2\u00e8\u0116\3\2\2\2\u00e9"
			+ "\u00ea\7\37\2\2\u00ea\u00eb\7$\2\2\u00eb\u00ec\7*\2\2\u00ec\u00ed\5V,"
			+ "\2\u00ed\u00ee\b\33\1\2\u00ee\u0116\3\2\2\2\u00ef\u00f0\7\30\2\2\u00f0"
			+ "\u00f1\5X-\2\u00f1\u00f2\b\33\1\2\u00f2\u0116\3\2\2\2\u00f3\u00f4\7!\2"
			+ "\2\u00f4\u00f5\5N(\2\u00f5\u00f6\58\35\2\u00f6\u00f7\7-\2\2\u00f7\u00f8"
			+ "\b\33\1\2\u00f8\u0116\3\2\2\2\u00f9\u00fa\7#\2\2\u00fa\u00fb\5N(\2\u00fb"
			+ "\u00fc\58\35\2\u00fc\u00fd\7-\2\2\u00fd\u00fe\b\33\1\2\u00fe\u0116\3\2"
			+ "\2\2\u00ff\u0100\7\25\2\2\u0100\u0101\7*\2\2\u0101\u0102\7)\2\2\u0102"
			+ "\u0116\b\33\1\2\u0103\u0104\7 \2\2\u0104\u0105\7*\2\2\u0105\u0106\7\5"
			+ "\2\2\u0106\u0107\5J&\2\u0107\u0108\b\33\1\2\u0108\u0116\3\2\2\2\u0109"
			+ "\u010a\7\33\2\2\u010a\u010b\5H%\2\u010b\u010c\b\33\1\2\u010c\u0116\3\2"
			+ "\2\2\u010d\u010e\7\33\2\2\u010e\u010f\7\"\2\2\u010f\u0110\5H%\2\u0110"
			+ "\u0111\b\33\1\2\u0111\u0116\3\2\2\2\u0112\u0113\7\33\2\2\u0113\u0114\7"
			+ "%\2\2\u0114\u0116\b\33\1\2\u0115\u00ce\3\2\2\2\u0115\u00d5\3\2\2\2\u0115"
			+ "\u00d8\3\2\2\2\u0115\u00dc\3\2\2\2\u0115\u00e4\3\2\2\2\u0115\u00e9\3\2"
			+ "\2\2\u0115\u00ef\3\2\2\2\u0115\u00f3\3\2\2\2\u0115\u00f9\3\2\2\2\u0115"
			+ "\u00ff\3\2\2\2\u0115\u0103\3\2\2\2\u0115\u0109\3\2\2\2\u0115\u010d\3\2"
			+ "\2\2\u0115\u0112\3\2\2\2\u0116\65\3\2\2\2\u0117\u0118\7-\2\2\u0118\u011d"
			+ "\b\34\1\2\u0119\u011a\58\35\2\u011a\u011b\b\34\1\2\u011b\u011d\3\2\2\2"
			+ "\u011c\u0117\3\2\2\2\u011c\u0119\3\2\2\2\u011d\67\3\2\2\2\u011e\u011f"
			+ "\7\6\2\2\u011f\u0120\58\35\2\u0120\u0121\7\7\2\2\u0121\u0122\b\35\1\2"
			+ "\u0122\u0126\3\2\2\2\u0123\u0124\7*\2\2\u0124\u0126\b\35\1\2\u0125\u011e"
			+ "\3\2\2\2\u0125\u0123\3\2\2\2\u01269\3\2\2\2\u0127\u0128\5<\37\2\u0128"
			+ "\u0129\b\36\1\2\u0129\u0138\3\2\2\2\u012a\u012b\5<\37\2\u012b\u012c\5"
			+ "F$\2\u012c\u012d\b\36\1\2\u012d\u0138\3\2\2\2\u012e\u012f\5<\37\2\u012f"
			+ "\u0130\5<\37\2\u0130\u0131\5F$\2\u0131\u0132\b\36\1\2\u0132\u0138\3\2"
			+ "\2\2\u0133\u0134\5<\37\2\u0134\u0135\5<\37\2\u0135\u0136\b\36\1\2\u0136"
			+ "\u0138\3\2\2\2\u0137\u0127\3\2\2\2\u0137\u012a\3\2\2\2\u0137\u012e\3\2"
			+ "\2\2\u0137\u0133\3\2\2\2\u0138;\3\2\2\2\u0139\u013a\7*\2\2\u013a\u014b"
			+ "\b\37\1\2\u013b\u013c\7\b\2\2\u013c\u014b\b\37\1\2\u013d\u013e\7\6\2\2"
			+ "\u013e\u013f\7\7\2\2\u013f\u014b\b\37\1\2\u0140\u0141\7\t\2\2\u0141\u0142"
			+ "\7\n\2\2\u0142\u0143\7\13\2\2\u0143\u014b\b\37\1\2\u0144\u0145\7\t\2\2"
			+ "\u0145\u0146\7\n\2\2\u0146\u0147\7\6\2\2\u0147\u0148\7\7\2\2\u0148\u0149"
			+ "\7\13\2\2\u0149\u014b\b\37\1\2\u014a\u0139\3\2\2\2\u014a\u013b\3\2\2\2"
			+ "\u014a\u013d\3\2\2\2\u014a\u0140\3\2\2\2\u014a\u0144\3\2\2\2\u014b=\3"
			+ "\2\2\2\u014c\u014d\7\t\2\2\u014d\u014e\7\6\2\2\u014e\u014f\5D#\2\u014f"
			+ "\u0150\7\7\2\2\u0150\u0151\7\f\2\2\u0151\u0152\7\6\2\2\u0152\u0153\5B"
			+ "\"\2\u0153\u0154\7\7\2\2\u0154\u0155\7\13\2\2\u0155\u0156\b \1\2\u0156"
			+ "?\3\2\2\2\u0157\u0158\7\6\2\2\u0158\u0159\5B\"\2\u0159\u015a\7\7\2\2\u015a"
			+ "\u015b\b!\1\2\u015bA\3\2\2\2\u015c\u0165\b\"\1\2\u015d\u015e\7)\2\2\u015e"
			+ "\u0165\b\"\1\2\u015f\u0160\7)\2\2\u0160\u0161\7\f\2\2\u0161\u0162\5B\""
			+ "\2\u0162\u0163\b\"\1\2\u0163\u0165\3\2\2\2\u0164\u015c\3\2\2\2\u0164\u015d"
			+ "\3\2\2\2\u0164\u015f\3\2\2\2\u0165C\3\2\2\2\u0166\u0170\b#\1\2\u0167\u0168"
			+ "\5@!\2\u0168\u0169\b#\1\2\u0169\u0170\3\2\2\2\u016a\u016b\5@!\2\u016b"
			+ "\u016c\7\f\2\2\u016c\u016d\5D#\2\u016d\u016e\b#\1\2\u016e\u0170\3\2\2"
			+ "\2\u016f\u0166\3\2\2\2\u016f\u0167\3\2\2\2\u016f\u016a\3\2\2\2\u0170E"
			+ "\3\2\2\2\u0171\u0172\5> \2\u0172\u0173\b$\1\2\u0173\u0179\3\2\2\2\u0174"
			+ "\u0175\5> \2\u0175\u0176\5F$\2\u0176\u0177\b$\1\2\u0177\u0179\3\2\2\2"
			+ "\u0178\u0171\3\2\2\2\u0178\u0174\3\2\2\2\u0179G\3\2\2\2\u017a\u017b\7"
			+ "-\2\2\u017b\u0182\b%\1\2\u017c\u017d\7-\2\2\u017d\u017e\7\f\2\2\u017e"
			+ "\u017f\5H%\2\u017f\u0180\b%\1\2\u0180\u0182\3\2\2\2\u0181\u017a\3\2\2"
			+ "\2\u0181\u017c\3\2\2\2\u0182I\3\2\2\2\u0183\u0184\5L\'\2\u0184\u0185\b"
			+ "&\1\2\u0185\u018c\3\2\2\2\u0186\u0187\5L\'\2\u0187\u0188\7\r\2\2\u0188"
			+ "\u0189\5J&\2\u0189\u018a\b&\1\2\u018a\u018c\3\2\2\2\u018b\u0183\3\2\2"
			+ "\2\u018b\u0186\3\2\2\2\u018cK\3\2\2\2\u018d\u018e\5\62\32\2\u018e\u018f"
			+ "\b\'\1\2\u018fM\3\2\2\2\u0190\u0191\7\36\2\2\u0191\u0194\b(\1\2\u0192"
			+ "\u0194\b(\1\2\u0193\u0190\3\2\2\2\u0193\u0192\3\2\2\2\u0194O\3\2\2\2\u0195"
			+ "\u0196\b)\1\2\u0196\u0197\5T+\2\u0197\u0198\b)\1\2\u0198\u019f\3\2\2\2"
			+ "\u0199\u019a\f\4\2\2\u019a\u019b\5T+\2\u019b\u019c\b)\1\2\u019c\u019e"
			+ "\3\2\2\2\u019d\u0199\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f"
			+ "\u01a0\3\2\2\2\u01a0Q\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\b*\1\2\u01a3"
			+ "\u01a4\5P)\2\u01a4\u01a5\7\16\2\2\u01a5\u01a6\5P)\2\u01a6\u01a7\b*\1\2"
			+ "\u01a7\u01ac\3\2\2\2\u01a8\u01a9\5P)\2\u01a9\u01aa\b*\1\2\u01aa\u01ac"
			+ "\3\2\2\2\u01ab\u01a2\3\2\2\2\u01ab\u01a8\3\2\2\2\u01ac\u01b4\3\2\2\2\u01ad"
			+ "\u01ae\f\5\2\2\u01ae\u01af\7\r\2\2\u01af\u01b0\5P)\2\u01b0\u01b1\b*\1"
			+ "\2\u01b1\u01b3\3\2\2\2\u01b2\u01ad\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2"
			+ "\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5S\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7"
			+ "\u01b8\b+\1\2\u01b8\u01b9\7\31\2\2\u01b9\u01d4\b+\1\2\u01ba\u01bb\7.\2"
			+ "\2\u01bb\u01d4\b+\1\2\u01bc\u01bd\7\6\2\2\u01bd\u01be\7-\2\2\u01be\u01bf"
			+ "\7\7\2\2\u01bf\u01d4\b+\1\2\u01c0\u01c1\7\22\2\2\u01c1\u01c2\7-\2\2\u01c2"
			+ "\u01c3\7\23\2\2\u01c3\u01d4\b+\1\2\u01c4\u01c5\7\27\2\2\u01c5\u01d4\b"
			+ "+\1\2\u01c6\u01c7\7\34\2\2\u01c7\u01d4\b+\1\2\u01c8\u01c9\7&\2\2\u01c9"
			+ "\u01d4\b+\1\2\u01ca\u01cb\7\35\2\2\u01cb\u01d4\b+\1\2\u01cc\u01cd\7\24"
			+ "\2\2\u01cd\u01d4\b+\1\2\u01ce\u01cf\7\t\2\2\u01cf\u01d0\5V,\2\u01d0\u01d1"
			+ "\7\13\2\2\u01d1\u01d2\b+\1\2\u01d2\u01d4\3\2\2\2\u01d3\u01b7\3\2\2\2\u01d3"
			+ "\u01ba\3\2\2\2\u01d3\u01bc\3\2\2\2\u01d3\u01c0\3\2\2\2\u01d3\u01c4\3\2"
			+ "\2\2\u01d3\u01c6\3\2\2\2\u01d3\u01c8\3\2\2\2\u01d3\u01ca\3\2\2\2\u01d3"
			+ "\u01cc\3\2\2\2\u01d3\u01ce\3\2\2\2\u01d4\u01e0\3\2\2\2\u01d5\u01d6\f\17"
			+ "\2\2\u01d6\u01d7\7\17\2\2\u01d7\u01df\b+\1\2\u01d8\u01d9\f\16\2\2\u01d9"
			+ "\u01da\7\20\2\2\u01da\u01df\b+\1\2\u01db\u01dc\f\r\2\2\u01dc\u01dd\7\21"
			+ "\2\2\u01dd\u01df\b+\1\2\u01de\u01d5\3\2\2\2\u01de\u01d8\3\2\2\2\u01de"
			+ "\u01db\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2"
			+ "\2\2\u01e1U\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\5R*\2\u01e4\u01e5"
			+ "\b,\1\2\u01e5W\3\2\2\2\u01e6\u01e7\7*\2\2\u01e7\u01ee\b-\1\2\u01e8\u01e9"
			+ "\7*\2\2\u01e9\u01ea\7\f\2\2\u01ea\u01eb\5X-\2\u01eb\u01ec\b-\1\2\u01ec"
			+ "\u01ee\3\2\2\2\u01ed\u01e6\3\2\2\2\u01ed\u01e8\3\2\2\2\u01eeY\3\2\2\2"
			+ "\26\u00bf\u00cb\u0115\u011c\u0125\u0137\u014a\u0164\u016f\u0178\u0181"
			+ "\u018b\u0193\u019f\u01ab\u01b4\u01d3\u01de\u01e0\u01ed";
	public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}