parser grammar BoilerplateParser;

options {
    tokenVocab=BoilerplateLexer;
}

program
    : declaration+
    ;

declaration
    : CREATE classType ID WITH fields (INCLUDING methods)? EOL
    ;

classType
    : CLASS | INTERFACE
    ;

fields
    : field (COMMA field)*
    ;

field
    : ID LPAREN dataType COMMA getSet RPAREN
    ;

getSet
    : get COMMA set
    | set COMMA get
    ;

get
    : accessModifier? GET
    ;

set
    : accessModifier? SET
    ;

methods
    : method (COMMA method)*
    ;

method
    : accessModifier? dataType ID LPAREN params? RPAREN
    ;

params
    : param (COMMA param)*
    ;

param
    : dataType ID
    ;

dataType
    : STRING | INT | FLOAT | BOOL
    ;

accessModifier
    : PRIVATE | PUBLIC
    ;
