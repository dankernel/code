
grammar t058rewriteAST18;
options {language=JavaScript;output=AST;}
a : b b -> b*;
b : ID ;
ID : 'a'..'z'+ ;
INT : '0'..'9'+;
WS : (' '|'\n') {$channel=HIDDEN;} ;