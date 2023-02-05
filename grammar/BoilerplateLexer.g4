lexer grammar BoilerplateLexer;

CREATE : 'create' ;
CLASS : 'class' ;
WITH : 'with' ;
INCLUDING : 'including' ;
INTERFACE : 'interface' ;
GET : 'get' ;
SET : 'set' ;

COMMA : ',' ;
LPAREN : '(' ;
RPAREN : ')' ;
EOL : ';';

STRING : 'String';
INT : 'int';
FLOAT : 'float';
BOOL : 'bool';
PRIVATE : 'private';
PUBLIC : 'public';

ID
    : [a-zA-Z_$][a-zA-Z0-9_$]*
    ;

WS  : [ \t\r\n]+ -> skip ;