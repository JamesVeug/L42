// Generated from L42.g4 by ANTLR 4.2.2
package antlrGenerated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class L42Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		S=1, Mdf=2, ORoundNoSpace=3, ORoundSpace=4, CRound=5, OSquare=6, CSquare=7, 
		OCurly=8, DotDotDot=9, EndType=10, CCurly=11, Colon=12, Semicolon=13, 
		Dot=14, Equal=15, Ph=16, Implements=17, Case=18, If=19, Else=20, While=21, 
		Loop=22, With=23, On=24, In=25, Catch=26, Var=27, Default=28, Interface=29, 
		Method=30, Using=31, Check=32, FieldSpecial=33, WalkBy=34, Stage=35, Path=36, 
		ClassSep=37, ClassMethSep=38, MX=39, X=40, HashX=41, ContextId=42, StringQuote=43, 
		UrlNL=44, Url=45, Doc=46, WS=47, UnOp=48, EqOp=49, BoolOp=50, RelOp=51, 
		DataOp=52, NumParse=53;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"S", "Mdf", "'('", "'\t'", "')'", "'['", "']'", "'{'", "'...'", "'^##'", 
		"'}'", "':'", "';'", "Dot", "'='", "'fwd'", "'implements'", "'case'", 
		"'if'", "'else'", "'while'", "'loop'", "'with'", "'on'", "'in'", "'catch'", 
		"'var'", "'default'", "'interface'", "'method'", "'use'", "'check'", "'##field'", 
		"'##walkBy'", "Stage", "Path", "ClassSep", "'::'", "MX", "X", "HashX", 
		"ContextId", "StringQuote", "UrlNL", "Url", "Doc", "WS", "UnOp", "EqOp", 
		"BoolOp", "RelOp", "DataOp", "NumParse"
	};
	public static final String[] ruleNames = {
		"Uppercase", "Lowercase", "Digit", "C", "CharsAll", "CharsUrl", "CharsAllStrLine", 
		"CharsAllString", "DocLine", "DocMultiLine", "StrLine", "String", "NumNext", 
		"S", "Mdf", "ORoundNoSpace", "ORoundSpace", "CRound", "OSquare", "CSquare", 
		"OCurly", "DotDotDot", "EndType", "CCurly", "Colon", "Semicolon", "Dot", 
		"Equal", "Ph", "Implements", "Case", "If", "Else", "While", "Loop", "With", 
		"On", "In", "Catch", "Var", "Default", "Interface", "Method", "Using", 
		"Check", "FieldSpecial", "WalkBy", "Stage", "Path", "ClassSep", "ClassMethSep", 
		"MX", "X", "HashX", "ContextId", "StringQuote", "UrlNL", "Url", "Doc", 
		"WS", "UnOp", "EqOp", "BoolOp", "RelOp", "DataOp", "NumParse"
	};


	public L42Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "L42.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\67\u028a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\7\5\u0092\n\5\f\5\16\5\u0095\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\7\n\u00a3\n\n\f\n\16\n\u00a6\13\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u00af\n\13\f\13\16\13\u00b2\13\13\3\13\3\13\3"+
		"\13\3\f\3\f\7\f\u00b9\n\f\f\f\16\f\u00bc\13\f\3\f\3\f\3\r\7\r\u00c1\n"+
		"\r\f\r\16\r\u00c4\13\r\3\16\3\16\3\16\3\16\3\16\5\16\u00cb\n\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u00e1\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00fa\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3"+
		".\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\5\61\u01b4\n\61\3\62\3\62\3\62\3\62\7\62\u01ba\n\62\f"+
		"\62\16\62\u01bd\13\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65"+
		"\7\65\u01c9\n\65\f\65\16\65\u01cc\13\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\7\66\u01d5\n\66\f\66\16\66\u01d8\13\66\3\67\3\67\3\67\3\67\3\67"+
		"\7\67\u01df\n\67\f\67\16\67\u01e2\13\67\3\67\3\67\38\38\38\38\38\78\u01eb"+
		"\n8\f8\168\u01ee\138\39\39\39\39\39\39\79\u01f6\n9\f9\169\u01f9\139\3"+
		"9\39\79\u01fd\n9\f9\169\u0200\139\39\69\u0203\n9\r9\169\u0204\39\79\u0208"+
		"\n9\f9\169\u020b\139\39\39\59\u020f\n9\3:\3:\3:\3:\3:\3:\3:\6:\u0218\n"+
		":\r:\16:\u0219\3:\6:\u021d\n:\r:\16:\u021e\3:\3:\3;\3;\3;\3;\3;\3;\3;"+
		"\6;\u022a\n;\r;\16;\u022b\3;\6;\u022f\n;\r;\16;\u0230\3<\3<\5<\u0235\n"+
		"<\6<\u0237\n<\r<\16<\u0238\3<\3<\5<\u023d\n<\5<\u023f\n<\3=\6=\u0242\n"+
		"=\r=\16=\u0243\3=\3=\3>\3>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0261\n?\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0278\nA\3B\3B\3B\3B\3B\3B\3B\3B\5"+
		"B\u0282\nB\3C\3C\7C\u0286\nC\fC\16C\u0289\13C\3\u00b0\2D\3\2\5\2\7\2\t"+
		"\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\3\37\4!\5#\6%\7\'\b"+
		")\t+\n-\13/\f\61\r\63\16\65\17\67\209\21;\22=\23?\24A\25C\26E\27G\30I"+
		"\31K\32M\33O\34Q\35S\36U\37W Y![\"]#_$a%c&e\'g(i)k*m+o,q-s.u/w\60y\61"+
		"{\62}\63\177\64\u0081\65\u0083\66\u0085\67\3\2\17\4\2&\'C\\\4\2aac|\6"+
		"\2\13\13\"#%(*\u0080\b\2\13\13\"#%(*|~~\u0080\u0080\4\2\13\13\"\u0080"+
		"\5\2\13\13\"#%\u0080\4\2\"\"..\5\2\f\f\"\"..\4\2##\u0080\u0080\4\2((~"+
		"~\4\2>>@@\4\2--//\4\2,,\61\61\u02c6\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3"+
		"\2\2\2\2\u0085\3\2\2\2\3\u0087\3\2\2\2\5\u0089\3\2\2\2\7\u008b\3\2\2\2"+
		"\t\u008d\3\2\2\2\13\u0096\3\2\2\2\r\u0098\3\2\2\2\17\u009a\3\2\2\2\21"+
		"\u009c\3\2\2\2\23\u009e\3\2\2\2\25\u00a9\3\2\2\2\27\u00b6\3\2\2\2\31\u00c2"+
		"\3\2\2\2\33\u00ca\3\2\2\2\35\u00e0\3\2\2\2\37\u00f9\3\2\2\2!\u00fb\3\2"+
		"\2\2#\u00fd\3\2\2\2%\u00ff\3\2\2\2\'\u0101\3\2\2\2)\u0103\3\2\2\2+\u0105"+
		"\3\2\2\2-\u0107\3\2\2\2/\u010b\3\2\2\2\61\u010f\3\2\2\2\63\u0111\3\2\2"+
		"\2\65\u0113\3\2\2\2\67\u0115\3\2\2\29\u0117\3\2\2\2;\u0119\3\2\2\2=\u011d"+
		"\3\2\2\2?\u0128\3\2\2\2A\u012d\3\2\2\2C\u0130\3\2\2\2E\u0135\3\2\2\2G"+
		"\u013b\3\2\2\2I\u0140\3\2\2\2K\u0145\3\2\2\2M\u0148\3\2\2\2O\u014b\3\2"+
		"\2\2Q\u0151\3\2\2\2S\u0155\3\2\2\2U\u015d\3\2\2\2W\u0167\3\2\2\2Y\u016e"+
		"\3\2\2\2[\u0172\3\2\2\2]\u0178\3\2\2\2_\u0180\3\2\2\2a\u01b3\3\2\2\2c"+
		"\u01b5\3\2\2\2e\u01be\3\2\2\2g\u01c0\3\2\2\2i\u01c3\3\2\2\2k\u01cf\3\2"+
		"\2\2m\u01d9\3\2\2\2o\u01e5\3\2\2\2q\u020e\3\2\2\2s\u0210\3\2\2\2u\u0222"+
		"\3\2\2\2w\u023e\3\2\2\2y\u0241\3\2\2\2{\u0247\3\2\2\2}\u0260\3\2\2\2\177"+
		"\u0262\3\2\2\2\u0081\u0277\3\2\2\2\u0083\u0281\3\2\2\2\u0085\u0283\3\2"+
		"\2\2\u0087\u0088\t\2\2\2\u0088\4\3\2\2\2\u0089\u008a\t\3\2\2\u008a\6\3"+
		"\2\2\2\u008b\u008c\4\62;\2\u008c\b\3\2\2\2\u008d\u0093\5\3\2\2\u008e\u0092"+
		"\5\3\2\2\u008f\u0092\5\5\3\2\u0090\u0092\5\7\4\2\u0091\u008e\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\n\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097"+
		"\t\4\2\2\u0097\f\3\2\2\2\u0098\u0099\t\5\2\2\u0099\16\3\2\2\2\u009a\u009b"+
		"\t\6\2\2\u009b\20\3\2\2\2\u009c\u009d\t\7\2\2\u009d\22\3\2\2\2\u009e\u009f"+
		"\7\61\2\2\u009f\u00a0\7\61\2\2\u00a0\u00a4\3\2\2\2\u00a1\u00a3\5\17\b"+
		"\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\f\2\2\u00a8"+
		"\24\3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ab\7,\2\2\u00ab\u00b0\3\2\2"+
		"\2\u00ac\u00af\5\17\b\2\u00ad\u00af\7\f\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7,\2\2\u00b4"+
		"\u00b5\7\61\2\2\u00b5\26\3\2\2\2\u00b6\u00ba\7)\2\2\u00b7\u00b9\5\17\b"+
		"\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\f\2\2\u00be"+
		"\30\3\2\2\2\u00bf\u00c1\5\21\t\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2"+
		"\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\32\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c5\u00cb\5\7\4\2\u00c6\u00c7\7/\2\2\u00c7\u00cb\5\7\4\2\u00c8"+
		"\u00c9\7\60\2\2\u00c9\u00cb\5\7\4\2\u00ca\u00c5\3\2\2\2\u00ca\u00c6\3"+
		"\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\34\3\2\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce"+
		"\7g\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7t\2\2\u00d1"+
		"\u00e1\7p\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7t\2\2"+
		"\u00d5\u00d6\7q\2\2\u00d6\u00e1\7t\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9"+
		"\7z\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7r\2\2\u00dc"+
		"\u00dd\7v\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7q\2\2\u00df\u00e1\7p\2\2"+
		"\u00e0\u00cc\3\2\2\2\u00e0\u00d2\3\2\2\2\u00e0\u00d7\3\2\2\2\u00e1\36"+
		"\3\2\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7c\2\2\u00e5"+
		"\u00e6\7u\2\2\u00e6\u00fa\7u\2\2\u00e7\u00e8\7o\2\2\u00e8\u00e9\7w\2\2"+
		"\u00e9\u00fa\7v\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed"+
		"\7c\2\2\u00ed\u00fa\7f\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7g\2\2\u00f0"+
		"\u00f1\7p\2\2\u00f1\u00fa\7v\2\2\u00f2\u00f3\7e\2\2\u00f3\u00f4\7c\2\2"+
		"\u00f4\u00f5\7r\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7w\2\2\u00f7\u00f8"+
		"\7n\2\2\u00f8\u00fa\7g\2\2\u00f9\u00e2\3\2\2\2\u00f9\u00e7\3\2\2\2\u00f9"+
		"\u00ea\3\2\2\2\u00f9\u00ee\3\2\2\2\u00f9\u00f2\3\2\2\2\u00fa \3\2\2\2"+
		"\u00fb\u00fc\7*\2\2\u00fc\"\3\2\2\2\u00fd\u00fe\7\13\2\2\u00fe$\3\2\2"+
		"\2\u00ff\u0100\7+\2\2\u0100&\3\2\2\2\u0101\u0102\7]\2\2\u0102(\3\2\2\2"+
		"\u0103\u0104\7_\2\2\u0104*\3\2\2\2\u0105\u0106\7}\2\2\u0106,\3\2\2\2\u0107"+
		"\u0108\7\60\2\2\u0108\u0109\7\60\2\2\u0109\u010a\7\60\2\2\u010a.\3\2\2"+
		"\2\u010b\u010c\7`\2\2\u010c\u010d\7%\2\2\u010d\u010e\7%\2\2\u010e\60\3"+
		"\2\2\2\u010f\u0110\7\177\2\2\u0110\62\3\2\2\2\u0111\u0112\7<\2\2\u0112"+
		"\64\3\2\2\2\u0113\u0114\7=\2\2\u0114\66\3\2\2\2\u0115\u0116\7\60\2\2\u0116"+
		"8\3\2\2\2\u0117\u0118\7?\2\2\u0118:\3\2\2\2\u0119\u011a\7h\2\2\u011a\u011b"+
		"\7y\2\2\u011b\u011c\7f\2\2\u011c<\3\2\2\2\u011d\u011e\7k\2\2\u011e\u011f"+
		"\7o\2\2\u011f\u0120\7r\2\2\u0120\u0121\7n\2\2\u0121\u0122\7g\2\2\u0122"+
		"\u0123\7o\2\2\u0123\u0124\7g\2\2\u0124\u0125\7p\2\2\u0125\u0126\7v\2\2"+
		"\u0126\u0127\7u\2\2\u0127>\3\2\2\2\u0128\u0129\7e\2\2\u0129\u012a\7c\2"+
		"\2\u012a\u012b\7u\2\2\u012b\u012c\7g\2\2\u012c@\3\2\2\2\u012d\u012e\7"+
		"k\2\2\u012e\u012f\7h\2\2\u012fB\3\2\2\2\u0130\u0131\7g\2\2\u0131\u0132"+
		"\7n\2\2\u0132\u0133\7u\2\2\u0133\u0134\7g\2\2\u0134D\3\2\2\2\u0135\u0136"+
		"\7y\2\2\u0136\u0137\7j\2\2\u0137\u0138\7k\2\2\u0138\u0139\7n\2\2\u0139"+
		"\u013a\7g\2\2\u013aF\3\2\2\2\u013b\u013c\7n\2\2\u013c\u013d\7q\2\2\u013d"+
		"\u013e\7q\2\2\u013e\u013f\7r\2\2\u013fH\3\2\2\2\u0140\u0141\7y\2\2\u0141"+
		"\u0142\7k\2\2\u0142\u0143\7v\2\2\u0143\u0144\7j\2\2\u0144J\3\2\2\2\u0145"+
		"\u0146\7q\2\2\u0146\u0147\7p\2\2\u0147L\3\2\2\2\u0148\u0149\7k\2\2\u0149"+
		"\u014a\7p\2\2\u014aN\3\2\2\2\u014b\u014c\7e\2\2\u014c\u014d\7c\2\2\u014d"+
		"\u014e\7v\2\2\u014e\u014f\7e\2\2\u014f\u0150\7j\2\2\u0150P\3\2\2\2\u0151"+
		"\u0152\7x\2\2\u0152\u0153\7c\2\2\u0153\u0154\7t\2\2\u0154R\3\2\2\2\u0155"+
		"\u0156\7f\2\2\u0156\u0157\7g\2\2\u0157\u0158\7h\2\2\u0158\u0159\7c\2\2"+
		"\u0159\u015a\7w\2\2\u015a\u015b\7n\2\2\u015b\u015c\7v\2\2\u015cT\3\2\2"+
		"\2\u015d\u015e\7k\2\2\u015e\u015f\7p\2\2\u015f\u0160\7v\2\2\u0160\u0161"+
		"\7g\2\2\u0161\u0162\7t\2\2\u0162\u0163\7h\2\2\u0163\u0164\7c\2\2\u0164"+
		"\u0165\7e\2\2\u0165\u0166\7g\2\2\u0166V\3\2\2\2\u0167\u0168\7o\2\2\u0168"+
		"\u0169\7g\2\2\u0169\u016a\7v\2\2\u016a\u016b\7j\2\2\u016b\u016c\7q\2\2"+
		"\u016c\u016d\7f\2\2\u016dX\3\2\2\2\u016e\u016f\7w\2\2\u016f\u0170\7u\2"+
		"\2\u0170\u0171\7g\2\2\u0171Z\3\2\2\2\u0172\u0173\7e\2\2\u0173\u0174\7"+
		"j\2\2\u0174\u0175\7g\2\2\u0175\u0176\7e\2\2\u0176\u0177\7m\2\2\u0177\\"+
		"\3\2\2\2\u0178\u0179\7%\2\2\u0179\u017a\7%\2\2\u017a\u017b\7h\2\2\u017b"+
		"\u017c\7k\2\2\u017c\u017d\7g\2\2\u017d\u017e\7n\2\2\u017e\u017f\7f\2\2"+
		"\u017f^\3\2\2\2\u0180\u0181\7%\2\2\u0181\u0182\7%\2\2\u0182\u0183\7y\2"+
		"\2\u0183\u0184\7c\2\2\u0184\u0185\7n\2\2\u0185\u0186\7m\2\2\u0186\u0187"+
		"\7D\2\2\u0187\u0188\7{\2\2\u0188`\3\2\2\2\u0189\u018a\7%\2\2\u018a\u018b"+
		"\7%\2\2\u018b\u018c\7n\2\2\u018c\u018d\7g\2\2\u018d\u018e\7u\2\2\u018e"+
		"\u01b4\7u\2\2\u018f\u0190\7%\2\2\u0190\u0191\7%\2\2\u0191\u0192\7o\2\2"+
		"\u0192\u0193\7g\2\2\u0193\u0194\7v\2\2\u0194\u01b4\7c\2\2\u0195\u0196"+
		"\7%\2\2\u0196\u0197\7%\2\2\u0197\u0198\7r\2\2\u0198\u0199\7n\2\2\u0199"+
		"\u019a\7w\2\2\u019a\u01b4\7u\2\2\u019b\u019c\7%\2\2\u019c\u019d\7%\2\2"+
		"\u019d\u019e\7u\2\2\u019e\u019f\7v\2\2\u019f\u01a0\7c\2\2\u01a0\u01b4"+
		"\7t\2\2\u01a1\u01a2\7%\2\2\u01a2\u01a3\7%\2\2\u01a3\u01a4\7p\2\2\u01a4"+
		"\u01a5\7g\2\2\u01a5\u01a6\7g\2\2\u01a6\u01a7\7f\2\2\u01a7\u01a8\7c\2\2"+
		"\u01a8\u01a9\7d\2\2\u01a9\u01aa\7n\2\2\u01aa\u01b4\7g\2\2\u01ab\u01ac"+
		"\7%\2\2\u01ac\u01ad\7%\2\2\u01ad\u01ae\7p\2\2\u01ae\u01af\7g\2\2\u01af"+
		"\u01b0\7g\2\2\u01b0\u01b1\7f\2\2\u01b1\u01b2\7g\2\2\u01b2\u01b4\7f\2\2"+
		"\u01b3\u0189\3\2\2\2\u01b3\u018f\3\2\2\2\u01b3\u0195\3\2\2\2\u01b3\u019b"+
		"\3\2\2\2\u01b3\u01a1\3\2\2\2\u01b3\u01ab\3\2\2\2\u01b4b\3\2\2\2\u01b5"+
		"\u01bb\5\t\5\2\u01b6\u01b7\5e\63\2\u01b7\u01b8\5\t\5\2\u01b8\u01ba\3\2"+
		"\2\2\u01b9\u01b6\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bcd\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\7\60\2\2"+
		"\u01bff\3\2\2\2\u01c0\u01c1\7<\2\2\u01c1\u01c2\7<\2\2\u01c2h\3\2\2\2\u01c3"+
		"\u01ca\5\5\3\2\u01c4\u01c9\5\3\2\2\u01c5\u01c9\5\5\3\2\u01c6\u01c9\5\7"+
		"\4\2\u01c7\u01c9\7%\2\2\u01c8\u01c4\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2"+
		"\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd"+
		"\u01ce\7*\2\2\u01cej\3\2\2\2\u01cf\u01d6\5\5\3\2\u01d0\u01d5\5\3\2\2\u01d1"+
		"\u01d5\5\5\3\2\u01d2\u01d5\5\7\4\2\u01d3\u01d5\7%\2\2\u01d4\u01d0\3\2"+
		"\2\2\u01d4\u01d1\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5"+
		"\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7l\3\2\2\2"+
		"\u01d8\u01d6\3\2\2\2\u01d9\u01e0\7%\2\2\u01da\u01df\5\3\2\2\u01db\u01df"+
		"\5\5\3\2\u01dc\u01df\5\7\4\2\u01dd\u01df\7%\2\2\u01de\u01da\3\2\2\2\u01de"+
		"\u01db\3\2\2\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2\2\2\u01df\u01e2\3\2"+
		"\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e3\u01e4\7*\2\2\u01e4n\3\2\2\2\u01e5\u01ec\7^\2\2\u01e6"+
		"\u01eb\5\3\2\2\u01e7\u01eb\5\5\3\2\u01e8\u01eb\5\7\4\2\u01e9\u01eb\7%"+
		"\2\2\u01ea\u01e6\3\2\2\2\u01ea\u01e7\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea"+
		"\u01e9\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2"+
		"\2\2\u01edp\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f0\7$\2\2\u01f0\u01f1"+
		"\5\31\r\2\u01f1\u01f2\7$\2\2\u01f2\u020f\3\2\2\2\u01f3\u01f7\7$\2\2\u01f4"+
		"\u01f6\t\b\2\2\u01f5\u01f4\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2"+
		"\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa"+
		"\u0202\7\f\2\2\u01fb\u01fd\t\b\2\2\u01fc\u01fb\3\2\2\2\u01fd\u0200\3\2"+
		"\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201\3\2\2\2\u0200"+
		"\u01fe\3\2\2\2\u0201\u0203\5\27\f\2\u0202\u01fe\3\2\2\2\u0203\u0204\3"+
		"\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0209\3\2\2\2\u0206"+
		"\u0208\t\b\2\2\u0207\u0206\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2"+
		"\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c"+
		"\u020d\7$\2\2\u020d\u020f\3\2\2\2\u020e\u01ef\3\2\2\2\u020e\u01f3\3\2"+
		"\2\2\u020fr\3\2\2\2\u0210\u0211\7t\2\2\u0211\u0212\7g\2\2\u0212\u0213"+
		"\7w\2\2\u0213\u0214\7u\2\2\u0214\u0215\7g\2\2\u0215\u0217\3\2\2\2\u0216"+
		"\u0218\7\"\2\2\u0217\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u0217\3\2"+
		"\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u021d\5\r\7\2\u021c"+
		"\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2"+
		"\2\2\u021f\u0220\3\2\2\2\u0220\u0221\7\f\2\2\u0221t\3\2\2\2\u0222\u0223"+
		"\7t\2\2\u0223\u0224\7g\2\2\u0224\u0225\7w\2\2\u0225\u0226\7u\2\2\u0226"+
		"\u0227\7g\2\2\u0227\u0229\3\2\2\2\u0228\u022a\7\"\2\2\u0229\u0228\3\2"+
		"\2\2\u022a\u022b\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"\u022e\3\2\2\2\u022d\u022f\5\r\7\2\u022e\u022d\3\2\2\2\u022f\u0230\3\2"+
		"\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231v\3\2\2\2\u0232\u0234"+
		"\5\23\n\2\u0233\u0235\5y=\2\u0234\u0233\3\2\2\2\u0234\u0235\3\2\2\2\u0235"+
		"\u0237\3\2\2\2\u0236\u0232\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0236\3\2"+
		"\2\2\u0238\u0239\3\2\2\2\u0239\u023f\3\2\2\2\u023a\u023c\5\25\13\2\u023b"+
		"\u023d\5y=\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023f\3\2\2"+
		"\2\u023e\u0236\3\2\2\2\u023e\u023a\3\2\2\2\u023fx\3\2\2\2\u0240\u0242"+
		"\t\t\2\2\u0241\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0241\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\b=\2\2\u0246z\3\2\2\2\u0247"+
		"\u0248\t\n\2\2\u0248|\3\2\2\2\u0249\u024a\7-\2\2\u024a\u0261\7?\2\2\u024b"+
		"\u024c\7/\2\2\u024c\u0261\7?\2\2\u024d\u024e\7,\2\2\u024e\u0261\7?\2\2"+
		"\u024f\u0250\7\61\2\2\u0250\u0261\7?\2\2\u0251\u0252\7(\2\2\u0252\u0261"+
		"\7?\2\2\u0253\u0254\7~\2\2\u0254\u0261\7?\2\2\u0255\u0256\7<\2\2\u0256"+
		"\u0261\7?\2\2\u0257\u0258\7-\2\2\u0258\u0259\7-\2\2\u0259\u0261\7?\2\2"+
		"\u025a\u025b\7,\2\2\u025b\u025c\7,\2\2\u025c\u0261\7?\2\2\u025d\u025e"+
		"\7/\2\2\u025e\u025f\7/\2\2\u025f\u0261\7?\2\2\u0260\u0249\3\2\2\2\u0260"+
		"\u024b\3\2\2\2\u0260\u024d\3\2\2\2\u0260\u024f\3\2\2\2\u0260\u0251\3\2"+
		"\2\2\u0260\u0253\3\2\2\2\u0260\u0255\3\2\2\2\u0260\u0257\3\2\2\2\u0260"+
		"\u025a\3\2\2\2\u0260\u025d\3\2\2\2\u0261~\3\2\2\2\u0262\u0263\t\13\2\2"+
		"\u0263\u0080\3\2\2\2\u0264\u0278\t\f\2\2\u0265\u0266\7?\2\2\u0266\u0278"+
		"\7?\2\2\u0267\u0268\7>\2\2\u0268\u0278\7?\2\2\u0269\u026a\7@\2\2\u026a"+
		"\u0278\7?\2\2\u026b\u026c\7#\2\2\u026c\u0278\7?\2\2\u026d\u026e\7>\2\2"+
		"\u026e\u0278\7>\2\2\u026f\u0270\7@\2\2\u0270\u0278\7@\2\2\u0271\u0272"+
		"\7>\2\2\u0272\u0273\7>\2\2\u0273\u0278\7?\2\2\u0274\u0275\7@\2\2\u0275"+
		"\u0276\7@\2\2\u0276\u0278\7?\2\2\u0277\u0264\3\2\2\2\u0277\u0265\3\2\2"+
		"\2\u0277\u0267\3\2\2\2\u0277\u0269\3\2\2\2\u0277\u026b\3\2\2\2\u0277\u026d"+
		"\3\2\2\2\u0277\u026f\3\2\2\2\u0277\u0271\3\2\2\2\u0277\u0274\3\2\2\2\u0278"+
		"\u0082\3\2\2\2\u0279\u0282\t\r\2\2\u027a\u027b\7/\2\2\u027b\u0282\7/\2"+
		"\2\u027c\u0282\t\16\2\2\u027d\u027e\7-\2\2\u027e\u0282\7-\2\2\u027f\u0280"+
		"\7,\2\2\u0280\u0282\7,\2\2\u0281\u0279\3\2\2\2\u0281\u027a\3\2\2\2\u0281"+
		"\u027c\3\2\2\2\u0281\u027d\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0084\3\2"+
		"\2\2\u0283\u0287\5\7\4\2\u0284\u0286\5\33\16\2\u0285\u0284\3\2\2\2\u0286"+
		"\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0086\3\2"+
		"\2\2\u0289\u0287\3\2\2\2)\2\u0091\u0093\u00a4\u00ae\u00b0\u00ba\u00c2"+
		"\u00ca\u00e0\u00f9\u01b3\u01bb\u01c8\u01ca\u01d4\u01d6\u01de\u01e0\u01ea"+
		"\u01ec\u01f7\u01fe\u0204\u0209\u020e\u0219\u021e\u022b\u0230\u0234\u0238"+
		"\u023c\u023e\u0243\u0260\u0277\u0281\u0287\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}