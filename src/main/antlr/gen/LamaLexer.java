// Generated from java-escape by ANTLR 4.11.1

    package com.soarex.truffle.lama.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LamaLexer extends Lexer {
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
		BRANCH_SEP=49, ARROW=50, PAT_BOX=51, PAT_VAL=52, PAT_STR=53, PAT_ARRAY=54, 
		PAT_SEXP=55, PAT_FUN=56, WILDCARD=57, WHITESPACES=58;
	public static final int
		WSCHANNEL=2, COMMENTS=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "WSCHANNEL", "COMMENTS"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPEN_PARENS", "CLOSE_PARENS", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_BRACKET", 
			"CLOSE_BRACKET", "COMMA", "SEMICOLON", "ASSIGN", "DEF_ASSIGN", "PLUS", 
			"MINUS", "MUL", "DIV", "MOD", "OP_AND", "OP_OR", "OP_LT", "OP_GT", "OP_EQ", 
			"OP_NE", "OP_LE", "OP_GE", "SKIP_", "IF", "THEN", "ELSE", "ELIF", "FI", 
			"WHILE", "DO", "OD", "FOR", "VAR", "VAL", "FUN", "CASE", "OF", "ESAC", 
			"TRUE", "FALSE", "NUMBER_LITERAL", "CHARACTER_LITERAL", "STRING_LITERAL", 
			"L_IDENT", "U_IDENT", "LINE_COMMENT", "BLOCK_COMMENT", "BRANCH_SEP", 
			"ARROW", "PAT_BOX", "PAT_VAL", "PAT_STR", "PAT_ARRAY", "PAT_SEXP", "PAT_FUN", 
			"WILDCARD", "WHITESPACES", "INPUT_CHARACTER", "IDENT_CHARACTER"
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
			null, null, null, null, null, "'|'", "'->'", "'#box'", "'#val'", "'#str'", 
			"'#array'", "'#sexp'", "'#fun'", "'_'"
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
			"ARROW", "PAT_BOX", "PAT_VAL", "PAT_STR", "PAT_ARRAY", "PAT_SEXP", "PAT_FUN", 
			"WILDCARD", "WHITESPACES"
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


	public LamaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LamaLexer.g4"; }

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
		"\u0004\u0000:\u0170\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0004)\u00fe"+
		"\b)\u000b)\f)\u00ff\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0107\b"+
		"*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0005+\u010f\b+\n+\f+\u0112"+
		"\t+\u0001+\u0001+\u0001,\u0001,\u0005,\u0118\b,\n,\f,\u011b\t,\u0001-"+
		"\u0001-\u0005-\u011f\b-\n-\f-\u0122\t-\u0001.\u0001.\u0001.\u0001.\u0005"+
		".\u0128\b.\n.\f.\u012b\t.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0005/\u0134\b/\n/\f/\u0137\t/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"0\u00010\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u0001"+
		"3\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00017\u00017\u00017\u00017\u00017\u00018\u00018\u0001"+
		"9\u00049\u0167\b9\u000b9\f9\u0168\u00019\u00019\u0001:\u0001:\u0001;\u0001"+
		";\u0001\u0135\u0000<\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014"+
		")\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e"+
		"=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s:u\u0000"+
		"w\u0000\u0001\u0000\b\u0001\u000009\u0001\u0000\'\'\u0001\u0000\"\"\u0001"+
		"\u0000az\u0001\u0000AZ\u0003\u0000\t\n\f\r  \u0004\u0000\n\n\r\r\u0085"+
		"\u0085\u2028\u2029\u0005\u0000\'\'09AZ__az\u0178\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000"+
		"\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001"+
		"\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000"+
		"\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000"+
		"?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001"+
		"\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000"+
		"\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000"+
		"M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001"+
		"\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000"+
		"\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000"+
		"[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001"+
		"\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000"+
		"\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000\u0000"+
		"i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m\u0001"+
		"\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000\u0000"+
		"\u0000\u0000s\u0001\u0000\u0000\u0000\u0001y\u0001\u0000\u0000\u0000\u0003"+
		"{\u0001\u0000\u0000\u0000\u0005}\u0001\u0000\u0000\u0000\u0007\u007f\u0001"+
		"\u0000\u0000\u0000\t\u0081\u0001\u0000\u0000\u0000\u000b\u0083\u0001\u0000"+
		"\u0000\u0000\r\u0085\u0001\u0000\u0000\u0000\u000f\u0087\u0001\u0000\u0000"+
		"\u0000\u0011\u0089\u0001\u0000\u0000\u0000\u0013\u008c\u0001\u0000\u0000"+
		"\u0000\u0015\u008e\u0001\u0000\u0000\u0000\u0017\u0090\u0001\u0000\u0000"+
		"\u0000\u0019\u0092\u0001\u0000\u0000\u0000\u001b\u0094\u0001\u0000\u0000"+
		"\u0000\u001d\u0096\u0001\u0000\u0000\u0000\u001f\u0098\u0001\u0000\u0000"+
		"\u0000!\u009b\u0001\u0000\u0000\u0000#\u009e\u0001\u0000\u0000\u0000%"+
		"\u00a0\u0001\u0000\u0000\u0000\'\u00a2\u0001\u0000\u0000\u0000)\u00a5"+
		"\u0001\u0000\u0000\u0000+\u00a8\u0001\u0000\u0000\u0000-\u00ab\u0001\u0000"+
		"\u0000\u0000/\u00ae\u0001\u0000\u0000\u00001\u00b3\u0001\u0000\u0000\u0000"+
		"3\u00b6\u0001\u0000\u0000\u00005\u00bb\u0001\u0000\u0000\u00007\u00c0"+
		"\u0001\u0000\u0000\u00009\u00c5\u0001\u0000\u0000\u0000;\u00c8\u0001\u0000"+
		"\u0000\u0000=\u00ce\u0001\u0000\u0000\u0000?\u00d1\u0001\u0000\u0000\u0000"+
		"A\u00d4\u0001\u0000\u0000\u0000C\u00d8\u0001\u0000\u0000\u0000E\u00dc"+
		"\u0001\u0000\u0000\u0000G\u00e0\u0001\u0000\u0000\u0000I\u00e4\u0001\u0000"+
		"\u0000\u0000K\u00e9\u0001\u0000\u0000\u0000M\u00ec\u0001\u0000\u0000\u0000"+
		"O\u00f1\u0001\u0000\u0000\u0000Q\u00f6\u0001\u0000\u0000\u0000S\u00fd"+
		"\u0001\u0000\u0000\u0000U\u0101\u0001\u0000\u0000\u0000W\u010a\u0001\u0000"+
		"\u0000\u0000Y\u0115\u0001\u0000\u0000\u0000[\u011c\u0001\u0000\u0000\u0000"+
		"]\u0123\u0001\u0000\u0000\u0000_\u012e\u0001\u0000\u0000\u0000a\u013d"+
		"\u0001\u0000\u0000\u0000c\u013f\u0001\u0000\u0000\u0000e\u0142\u0001\u0000"+
		"\u0000\u0000g\u0147\u0001\u0000\u0000\u0000i\u014c\u0001\u0000\u0000\u0000"+
		"k\u0151\u0001\u0000\u0000\u0000m\u0158\u0001\u0000\u0000\u0000o\u015e"+
		"\u0001\u0000\u0000\u0000q\u0163\u0001\u0000\u0000\u0000s\u0166\u0001\u0000"+
		"\u0000\u0000u\u016c\u0001\u0000\u0000\u0000w\u016e\u0001\u0000\u0000\u0000"+
		"yz\u0005(\u0000\u0000z\u0002\u0001\u0000\u0000\u0000{|\u0005)\u0000\u0000"+
		"|\u0004\u0001\u0000\u0000\u0000}~\u0005{\u0000\u0000~\u0006\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005}\u0000\u0000\u0080\b\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0005[\u0000\u0000\u0082\n\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005]\u0000\u0000\u0084\f\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0005,\u0000\u0000\u0086\u000e\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0005;\u0000\u0000\u0088\u0010\u0001\u0000\u0000\u0000\u0089\u008a\u0005"+
		":\u0000\u0000\u008a\u008b\u0005=\u0000\u0000\u008b\u0012\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005=\u0000\u0000\u008d\u0014\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0005+\u0000\u0000\u008f\u0016\u0001\u0000\u0000\u0000\u0090"+
		"\u0091\u0005-\u0000\u0000\u0091\u0018\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0005*\u0000\u0000\u0093\u001a\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		"/\u0000\u0000\u0095\u001c\u0001\u0000\u0000\u0000\u0096\u0097\u0005%\u0000"+
		"\u0000\u0097\u001e\u0001\u0000\u0000\u0000\u0098\u0099\u0005&\u0000\u0000"+
		"\u0099\u009a\u0005&\u0000\u0000\u009a \u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0005!\u0000\u0000\u009c\u009d\u0005!\u0000\u0000\u009d\"\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005<\u0000\u0000\u009f$\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0005>\u0000\u0000\u00a1&\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0005=\u0000\u0000\u00a3\u00a4\u0005=\u0000\u0000\u00a4(\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0005/\u0000\u0000\u00a6\u00a7\u0005=\u0000\u0000"+
		"\u00a7*\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005<\u0000\u0000\u00a9\u00aa"+
		"\u0005=\u0000\u0000\u00aa,\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005>"+
		"\u0000\u0000\u00ac\u00ad\u0005=\u0000\u0000\u00ad.\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0005s\u0000\u0000\u00af\u00b0\u0005k\u0000\u0000\u00b0\u00b1"+
		"\u0005i\u0000\u0000\u00b1\u00b2\u0005p\u0000\u0000\u00b20\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0005i\u0000\u0000\u00b4\u00b5\u0005f\u0000\u0000"+
		"\u00b52\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005t\u0000\u0000\u00b7\u00b8"+
		"\u0005h\u0000\u0000\u00b8\u00b9\u0005e\u0000\u0000\u00b9\u00ba\u0005n"+
		"\u0000\u0000\u00ba4\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005e\u0000\u0000"+
		"\u00bc\u00bd\u0005l\u0000\u0000\u00bd\u00be\u0005s\u0000\u0000\u00be\u00bf"+
		"\u0005e\u0000\u0000\u00bf6\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005e"+
		"\u0000\u0000\u00c1\u00c2\u0005l\u0000\u0000\u00c2\u00c3\u0005i\u0000\u0000"+
		"\u00c3\u00c4\u0005f\u0000\u0000\u00c48\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0005f\u0000\u0000\u00c6\u00c7\u0005i\u0000\u0000\u00c7:\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0005w\u0000\u0000\u00c9\u00ca\u0005h\u0000\u0000"+
		"\u00ca\u00cb\u0005i\u0000\u0000\u00cb\u00cc\u0005l\u0000\u0000\u00cc\u00cd"+
		"\u0005e\u0000\u0000\u00cd<\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005d"+
		"\u0000\u0000\u00cf\u00d0\u0005o\u0000\u0000\u00d0>\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0005o\u0000\u0000\u00d2\u00d3\u0005d\u0000\u0000\u00d3@"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005f\u0000\u0000\u00d5\u00d6\u0005"+
		"o\u0000\u0000\u00d6\u00d7\u0005r\u0000\u0000\u00d7B\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0005v\u0000\u0000\u00d9\u00da\u0005a\u0000\u0000\u00da"+
		"\u00db\u0005r\u0000\u0000\u00dbD\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005"+
		"v\u0000\u0000\u00dd\u00de\u0005a\u0000\u0000\u00de\u00df\u0005l\u0000"+
		"\u0000\u00dfF\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005f\u0000\u0000\u00e1"+
		"\u00e2\u0005u\u0000\u0000\u00e2\u00e3\u0005n\u0000\u0000\u00e3H\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0005c\u0000\u0000\u00e5\u00e6\u0005a\u0000"+
		"\u0000\u00e6\u00e7\u0005s\u0000\u0000\u00e7\u00e8\u0005e\u0000\u0000\u00e8"+
		"J\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005o\u0000\u0000\u00ea\u00eb\u0005"+
		"f\u0000\u0000\u00ebL\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005e\u0000"+
		"\u0000\u00ed\u00ee\u0005s\u0000\u0000\u00ee\u00ef\u0005a\u0000\u0000\u00ef"+
		"\u00f0\u0005c\u0000\u0000\u00f0N\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005"+
		"t\u0000\u0000\u00f2\u00f3\u0005r\u0000\u0000\u00f3\u00f4\u0005u\u0000"+
		"\u0000\u00f4\u00f5\u0005e\u0000\u0000\u00f5P\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0005f\u0000\u0000\u00f7\u00f8\u0005a\u0000\u0000\u00f8\u00f9\u0005"+
		"l\u0000\u0000\u00f9\u00fa\u0005s\u0000\u0000\u00fa\u00fb\u0005e\u0000"+
		"\u0000\u00fbR\u0001\u0000\u0000\u0000\u00fc\u00fe\u0007\u0000\u0000\u0000"+
		"\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000"+
		"\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000"+
		"\u0100T\u0001\u0000\u0000\u0000\u0101\u0106\u0005\'\u0000\u0000\u0102"+
		"\u0107\b\u0001\u0000\u0000\u0103\u0104\u0005\'\u0000\u0000\u0104\u0107"+
		"\u0005\'\u0000\u0000\u0105\u0107\u0002\t\n\u0000\u0106\u0102\u0001\u0000"+
		"\u0000\u0000\u0106\u0103\u0001\u0000\u0000\u0000\u0106\u0105\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0005\'\u0000"+
		"\u0000\u0109V\u0001\u0000\u0000\u0000\u010a\u0110\u0005\"\u0000\u0000"+
		"\u010b\u010f\b\u0002\u0000\u0000\u010c\u010d\u0005\"\u0000\u0000\u010d"+
		"\u010f\u0005\"\u0000\u0000\u010e\u010b\u0001\u0000\u0000\u0000\u010e\u010c"+
		"\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e"+
		"\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0113"+
		"\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u0005\"\u0000\u0000\u0114X\u0001\u0000\u0000\u0000\u0115\u0119\u0007"+
		"\u0003\u0000\u0000\u0116\u0118\u0003w;\u0000\u0117\u0116\u0001\u0000\u0000"+
		"\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011aZ\u0001\u0000\u0000\u0000"+
		"\u011b\u0119\u0001\u0000\u0000\u0000\u011c\u0120\u0007\u0004\u0000\u0000"+
		"\u011d\u011f\u0003w;\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u0122"+
		"\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0001\u0000\u0000\u0000\u0121\\\u0001\u0000\u0000\u0000\u0122\u0120\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0005-\u0000\u0000\u0124\u0125\u0005-\u0000"+
		"\u0000\u0125\u0129\u0001\u0000\u0000\u0000\u0126\u0128\u0003u:\u0000\u0127"+
		"\u0126\u0001\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129"+
		"\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a"+
		"\u012c\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0006.\u0000\u0000\u012d^\u0001\u0000\u0000\u0000\u012e\u012f\u0005"+
		"(\u0000\u0000\u012f\u0130\u0005*\u0000\u0000\u0130\u0135\u0001\u0000\u0000"+
		"\u0000\u0131\u0134\u0003_/\u0000\u0132\u0134\t\u0000\u0000\u0000\u0133"+
		"\u0131\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134"+
		"\u0137\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0135"+
		"\u0133\u0001\u0000\u0000\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137"+
		"\u0135\u0001\u0000\u0000\u0000\u0138\u0139\u0005*\u0000\u0000\u0139\u013a"+
		"\u0005)\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0006"+
		"/\u0000\u0000\u013c`\u0001\u0000\u0000\u0000\u013d\u013e\u0005|\u0000"+
		"\u0000\u013eb\u0001\u0000\u0000\u0000\u013f\u0140\u0005-\u0000\u0000\u0140"+
		"\u0141\u0005>\u0000\u0000\u0141d\u0001\u0000\u0000\u0000\u0142\u0143\u0005"+
		"#\u0000\u0000\u0143\u0144\u0005b\u0000\u0000\u0144\u0145\u0005o\u0000"+
		"\u0000\u0145\u0146\u0005x\u0000\u0000\u0146f\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0005#\u0000\u0000\u0148\u0149\u0005v\u0000\u0000\u0149\u014a\u0005"+
		"a\u0000\u0000\u014a\u014b\u0005l\u0000\u0000\u014bh\u0001\u0000\u0000"+
		"\u0000\u014c\u014d\u0005#\u0000\u0000\u014d\u014e\u0005s\u0000\u0000\u014e"+
		"\u014f\u0005t\u0000\u0000\u014f\u0150\u0005r\u0000\u0000\u0150j\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0005#\u0000\u0000\u0152\u0153\u0005a\u0000"+
		"\u0000\u0153\u0154\u0005r\u0000\u0000\u0154\u0155\u0005r\u0000\u0000\u0155"+
		"\u0156\u0005a\u0000\u0000\u0156\u0157\u0005y\u0000\u0000\u0157l\u0001"+
		"\u0000\u0000\u0000\u0158\u0159\u0005#\u0000\u0000\u0159\u015a\u0005s\u0000"+
		"\u0000\u015a\u015b\u0005e\u0000\u0000\u015b\u015c\u0005x\u0000\u0000\u015c"+
		"\u015d\u0005p\u0000\u0000\u015dn\u0001\u0000\u0000\u0000\u015e\u015f\u0005"+
		"#\u0000\u0000\u015f\u0160\u0005f\u0000\u0000\u0160\u0161\u0005u\u0000"+
		"\u0000\u0161\u0162\u0005n\u0000\u0000\u0162p\u0001\u0000\u0000\u0000\u0163"+
		"\u0164\u0005_\u0000\u0000\u0164r\u0001\u0000\u0000\u0000\u0165\u0167\u0007"+
		"\u0005\u0000\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001"+
		"\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169\u0001"+
		"\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u0006"+
		"9\u0001\u0000\u016bt\u0001\u0000\u0000\u0000\u016c\u016d\b\u0006\u0000"+
		"\u0000\u016dv\u0001\u0000\u0000\u0000\u016e\u016f\u0007\u0007\u0000\u0000"+
		"\u016fx\u0001\u0000\u0000\u0000\u000b\u0000\u00ff\u0106\u010e\u0110\u0119"+
		"\u0120\u0129\u0133\u0135\u0168\u0002\u0000\u0003\u0000\u0000\u0002\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}