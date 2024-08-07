// -*- Java -*- File generated by the BNF Converter (bnfc 2.9.5).

// Lexer definition for use with Antlr4
lexer grammar LBNFLexer;
// Predefined regular expressions in BNFC
fragment LETTER  : CAPITAL | SMALL ;
fragment CAPITAL : [A-Z\u00C0-\u00D6\u00D8-\u00DE] ;
fragment SMALL   : [a-z\u00DF-\u00F6\u00F8-\u00FF] ;
fragment DIGIT   : [0-9] ;
Surrogate_id_SYMB_0 : ';' ;
Surrogate_id_SYMB_1 : '.' ;
Surrogate_id_SYMB_2 : '::=' ;
Surrogate_id_SYMB_3 : '[' ;
Surrogate_id_SYMB_4 : ']' ;
Surrogate_id_SYMB_5 : '_' ;
Surrogate_id_SYMB_6 : '(' ;
Surrogate_id_SYMB_7 : ':' ;
Surrogate_id_SYMB_8 : ')' ;
Surrogate_id_SYMB_9 : ',' ;
Surrogate_id_SYMB_10 : '|' ;
Surrogate_id_SYMB_11 : '-' ;
Surrogate_id_SYMB_12 : '*' ;
Surrogate_id_SYMB_13 : '+' ;
Surrogate_id_SYMB_14 : '?' ;
Surrogate_id_SYMB_15 : '{' ;
Surrogate_id_SYMB_16 : '}' ;
Surrogate_id_SYMB_17 : 'char' ;
Surrogate_id_SYMB_18 : 'coercions' ;
Surrogate_id_SYMB_19 : 'comment' ;
Surrogate_id_SYMB_20 : 'digit' ;
Surrogate_id_SYMB_21 : 'entrypoints' ;
Surrogate_id_SYMB_22 : 'eps' ;
Surrogate_id_SYMB_23 : 'internal' ;
Surrogate_id_SYMB_24 : 'layout' ;
Surrogate_id_SYMB_25 : 'letter' ;
Surrogate_id_SYMB_26 : 'lower' ;
Surrogate_id_SYMB_27 : 'nonempty' ;
Surrogate_id_SYMB_28 : 'position' ;
Surrogate_id_SYMB_29 : 'rules' ;
Surrogate_id_SYMB_30 : 'separator' ;
Surrogate_id_SYMB_31 : 'stop' ;
Surrogate_id_SYMB_32 : 'terminator' ;
Surrogate_id_SYMB_33 : 'token' ;
Surrogate_id_SYMB_34 : 'toplevel' ;
Surrogate_id_SYMB_35 : 'upper' ;
COMMENT_antlr_builtin
: (
'--' ~[\r\n]* (('\r'? '\n')|EOF)
) -> skip;
MULTICOMMENT_antlr_builtin
: (
'{-' (.)*? '-}'
) -> skip;

// String token type
STRING : '"' -> more, mode(STRINGMODE);
CHAR : '\''   -> more, mode(CHARMODE);

//Integer predefined token type
INTEGER : DIGIT+;
// Identifier token type
fragment
IDENTIFIER_FIRST : LETTER | '_';
IDENT : IDENTIFIER_FIRST (IDENTIFIER_FIRST | DIGIT)*;
// Whitespace
WS : (' ' | '\r' | '\t' | '\n' | '\f')+ ->  skip;
// Escapable sequences
fragment
Escapable : ('"' | '\\' | 'n' | 't' | 'r' | 'f');
ErrorToken : . ;
mode STRESCAPE;
STRESCAPED : Escapable  -> more, popMode ;
mode STRINGMODE;
STRINGESC : '\\' -> more , pushMode(STRESCAPE);
STRINGEND : '"' ->  type(STRING), mode(DEFAULT_MODE);
STRINGTEXT : ~["\\] -> more;
mode CHARMODE;
CHARANY     :  ~['\\] -> more, mode(CHAREND);
CHARESC     :  '\\'  -> more, pushMode(CHAREND),pushMode(ESCAPE);
mode ESCAPE;
ESCAPED : (Escapable | '\'')  -> more, popMode ;
mode CHAREND;
CHARENDC     :  '\''  -> type(CHAR), mode(DEFAULT_MODE);
