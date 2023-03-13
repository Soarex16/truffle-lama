parser grammar LamaParser;

@header {
package com.soarex.truffle.lama.parser;
}

options {
    tokenVocab=LamaLexer;
}

program
    : scopeExpression EOF
    ;

scopeExpression
    : defs=definition* expr=expression?
    ;

definition
    : variableDefinition
    | functionDefinition
    ;

variableDefinition
    : VAR variableDefinitionSequence SEMICOLON
    ;

variableDefinitionSequence
    : defs=variableDefinitionItem (COMMA defs=variableDefinitionItem)*
    ;

variableDefinitionItem
    : name=L_IDENT (DEF_ASSIGN value=basicExpression)?
    ;

functionDefinition
    : FUN name=L_IDENT OPEN_PARENS args=functionArguments CLOSE_PARENS body=functionBody
    ;

functionArguments
    : (args=L_IDENT (COMMA args=L_IDENT)*)?
    ;

functionBody
    : OPEN_BRACE scopeExpression CLOSE_BRACE
    ;

expression
    : (basicExpression SEMICOLON)* basicExpression
    ;

basicExpression
    : assocExpression
    | comparisonExpression
    ;

assocExpression
    : postfixExpression
    | <assoc=right> lhs=assocExpression operator=ASSIGN rhs=assocExpression
    | <assoc=left>  lhs=assocExpression operator=OP_OR rhs=assocExpression
    | <assoc=left>  lhs=assocExpression operator=OP_AND rhs=assocExpression
    // by precedence here was comparison
    | <assoc=left>  lhs=assocExpression operator=(PLUS | MINUS) rhs=assocExpression
    | <assoc=left>  lhs=assocExpression operator=(MUL | DIV | MOD) rhs=assocExpression
    ;

comparisonExpression
    : lhs=assocExpression operator=(OP_LT | OP_GT | OP_LE | OP_GE | OP_EQ | OP_NE) rhs=assocExpression
    ;

postfixExpression
    : primary                                                                                       #emptySuffix
    | base=postfixExpression OPEN_PARENS (args=expression (COMMA args=expression)*)? CLOSE_PARENS   #indexExpression
    | base=postfixExpression OPEN_BRACKET index=expression CLOSE_BRACKET                            #callExpression
    ;

primary
    : numberLiteral                                                                         #numberLiteralExpression
    | booleanLiteral                                                                        #booleanLiteralExpression
    | STRING_LITERAL                                                                        #stringLiteral
    | CHARACTER_LITERAL                                                                     #characterLiteral
    | OPEN_BRACKET (items=expression (COMMA items=expression)*)? CLOSE_BRACKET              #arrayLiteral
    | tag=U_IDENT (OPEN_PARENS (items=expression (COMMA items=expression)*)? CLOSE_PARENS)? #sExp
    | L_IDENT                                                                               #identifier
    | OPEN_PARENS scopeExpression CLOSE_PARENS                                              #scope
    | SKIP_                                                                                 #skip
    | FUN OPEN_PARENS args=functionArguments CLOSE_PARENS body=functionBody                 #functionExpression
    | ifThenElse                                                                            #conditionalExpression
    | caseWhen                                                                              #caseExpression
    | WHILE expression DO scopeExpression OD                                                #whileLoop
    | DO scopeExpression WHILE expression OD                                                #doWhileLoop
    | FOR scopeExpression COMMA expression COMMA expression DO scopeExpression OD           #forLoop
    ;

numberLiteral
    : num=NUMBER_LITERAL        #positive
    | MINUS num=NUMBER_LITERAL  #negative
    ;

booleanLiteral
    : TRUE  #true
    | FALSE #false
    ;

caseWhen
    : CASE expression OF caseBranches ESAC
    ;

caseBranches
    : branches=caseBranch (BRANCH_SEP branches=caseBranch)*
    ;

caseBranch
    : pattern ARROW scopeExpression
    ;

pattern
    : OPEN_PARENS pattern CLOSE_PARENS  #parens
    | alias=L_IDENT (AT pattern)?       #aliasedPattern
    | sExpPattern                       #sExpPat
    | arrayPattern                      #arrayPat
    | numberLiteral                     #numberPat
    | booleanLiteral                    #booleanPat
    | STRING_LITERAL                    #stringPat
    | CHARACTER_LITERAL                 #charPat
    | PAT_BOX                           #boxTypePat
    | PAT_VAL                           #valTypePat
    | PAT_STR                           #strTypePat
    | PAT_ARRAY                         #arrayTypePat
    | PAT_SEXP                          #sExpTypePat
    | PAT_FUN                           #funTypePat
    | WILDCARD                          #wildcard
    ;

sExpPattern
    : tag=U_IDENT (OPEN_PARENS items=pattern (COMMA items=pattern)* CLOSE_PARENS)?
    ;

arrayPattern
    : (OPEN_BRACKET items=pattern (COMMA items=pattern)* OPEN_BRACKET)?
    ;

ifThenElse
    : IF expression THEN scopeExpression elsePart? FI
    ;

elsePart
    : ELIF expression THEN scopeExpression elsePart?
    | ELSE scopeExpression
    ;