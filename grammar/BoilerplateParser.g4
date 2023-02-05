parser grammar BoilerplateParser;

options {
    tokenVocab=BoilerplateLexer;
}

program
    : declaration+
    ;

declaration
    : classDeclaration
    | interfaceDeclaration
    ;

classDeclaration
    : CREATE CLASS ID WITH fields (INCLUDING classMethods)? EOL
    ;

interfaceDeclaration
    : CREATE INTERFACE ID WITH fields (INCLUDING interfaceMethods)? EOL
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

classMethods
    : classMethod (COMMA classMethod)*
    ;

classMethod
    : accessModifier dataType ID LPAREN params? RPAREN
    ;

interfaceMethods
    : interfaceMethod (COMMA interfaceMethod)*
    ;

interfaceMethod
    : dataType ID LPAREN params? RPAREN
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
