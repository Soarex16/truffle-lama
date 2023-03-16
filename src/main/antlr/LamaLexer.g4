lexer grammar LamaLexer;

@header {
    package com.soarex.truffle.lama.parser;
}

channels {
  WSCHANNEL,
  COMMENTS
}

// Punctuations
OPEN_PARENS:                '(';
CLOSE_PARENS:               ')';
OPEN_BRACE:                 '{';
CLOSE_BRACE:                '}';
OPEN_BRACKET:               '[';
CLOSE_BRACKET:              ']';
COMMA:                      ',';
SEMICOLON:                  ';';

// Operators
ASSIGN:                     ':=';
DEF_ASSIGN:                 '=';

PLUS:                       '+';
MINUS:                      '-';
MUL:                        '*';
DIV:                        '/';
MOD:                        '%';

OP_NOT:                     '!';
OP_AND:                     '&&';
OP_OR:                      '!!';
OP_LT:                      '<';
OP_GT:                      '>';
OP_EQ:                      '==';
OP_NE:                      '/=';
OP_LE:                      '<=';
OP_GE:                      '>=';

// Keywords
SKIP_:                      'skip';
IF:                         'if';
THEN:                       'then';
ELSE:                       'else';
ELIF:                       'elif';
FI:                         'fi';
WHILE:                      'while';
DO:                         'do';
OD:                         'od';
FOR:                        'for';
VAR:                        'var';
VAL:                        'val';
FUN:                        'fun';
CASE:                       'case';
OF:                         'of';
ESAC:                       'esac';
TRUE:                       'true';
FALSE:                      'false';

// Literals
NUMBER_LITERAL:             [0-9]+;
CHARACTER_LITERAL:          '\'' (~['] | '\\\'' | '\\t' | '\\n' ) '\'';
STRING_LITERAL:             '"' (~'"' | '""')* '"';

// Identifiers
L_IDENT:                    [a-z] IDENT_CHARACTER*;
U_IDENT:                    [A-Z] IDENT_CHARACTER*;

// Comments
LINE_COMMENT:               '--' INPUT_CHARACTER* -> channel(COMMENTS);
BLOCK_COMMENT :             '(*' (BLOCK_COMMENT|.)*? '*)' -> channel(COMMENTS) ;

// Pattern matching
AT:                         '@';
BRANCH_SEP:                 '|';
ARROW:                      '->';
PAT_BOX:                    '#box';
PAT_VAL:                    '#val';
PAT_STR:                    '#str';
PAT_ARRAY:                  '#array';
PAT_SEXP:                   '#sexp';
PAT_FUN:                    '#fun';
WILDCARD:                   '_';

WHITESPACES: [ \t\r\n\u000C]+ -> channel(WSCHANNEL);

fragment INPUT_CHARACTER:   ~[\r\n\u0085\u2028\u2029];
fragment IDENT_CHARACTER:   [a-z_A-Z0-9'];