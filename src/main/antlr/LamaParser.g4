parser grammar LamaParser;

@header {
    package com.soarex.truffle.lama.parser;
}

options {
    tokenVocab=LamaLexer;
}

program
    : scope_expression EOF
    ;

scope_expression
    : defs=definition* expr=expression?
    ;

definition
    : variable_definition
    | function_definition
    ;

variable_definition
    : VAR variable_definition_sequence SEMICOLON
    ;

variable_definition_sequence
    : defs=variable_definition_item (COMMA defs=variable_definition_item)*
    ;

variable_definition_item
    : name=L_IDENT (DEF_ASSIGN value=basic_expression)?
    ;

function_definition
    : FUN name=L_IDENT OPEN_PARENS args=function_arguments CLOSE_PARENS body=function_body
    ;

function_arguments
    : (args=L_IDENT (COMMA args=L_IDENT)*)?
    ;

function_body
    : OPEN_BRACE scope_expression CLOSE_BRACE
    ;

expression
    : (basic_expression SEMICOLON)* basic_expression
    ;

basic_expression
    : assoc_expression
    | comparison_expression
    ;

assoc_expression
    : postfix_expression
    | <assoc=right> lhs=assoc_expression operator=ASSIGN rhs=assoc_expression
    | <assoc=left> lhs=assoc_expression operator=OP_OR rhs=assoc_expression
    | <assoc=left> lhs=assoc_expression operator=OP_AND rhs=assoc_expression
    // by precedence here was comparison
    | <assoc=left> lhs=assoc_expression operator=(PLUS | MINUS) rhs=assoc_expression
    | <assoc=left> lhs=assoc_expression operator=(MUL | DIV | MOD) rhs=assoc_expression
    ;

comparison_expression
    : lhs=assoc_expression operator=(OP_LT | OP_GT | OP_LE | OP_GE | OP_EQ | OP_NE) rhs=assoc_expression
    ;

postfix_expression
    : primary                                                                                   #empty_suffix
    | postfix_expression OPEN_PARENS (args=expression (COMMA args=expression)*)? CLOSE_PARENS   #index_expression
    | postfix_expression OPEN_BRACKET index=expression CLOSE_BRACKET                            #call_expression
    ;

primary
    : NUMBER_LITERAL                                                                            #number_literal
    | MINUS NUMBER_LITERAL                                                                      #negative_number_literal
    | STRING_LITERAL                                                                            #string_literal
    | CHARACTER_LITERAL                                                                         #character_literal
    | OPEN_BRACKET (items=expression (COMMA items=expression)*)? CLOSE_BRACKET                  #array_literal
    | name=U_IDENT (OPEN_PARENS (items=expression (COMMA items=expression)*)? CLOSE_PARENS)?    #s_exp
    | L_IDENT                                                                                   #identifier
    | OPEN_PARENS scope_expression CLOSE_PARENS                                                 #scope
    | SKIP_                                                                                     #skip
    | if_then_else                                                                              #conditional
    | WHILE expression DO scope_expression OD                                                   #while_loop
    | DO scope_expression WHILE expression OD                                                   #do_while_loop
    | FOR scope_expression COMMA expression COMMA expression DO scope_expression OD             #for_loop
    // TODO: case of
    ;

if_then_else
    : IF expression THEN scope_expression else_part? FI
    ;

else_part
    : ELIF expression THEN scope_expression else_part?
    | ELSE scope_expression
    ;