grammar decaf;

LETTER : [a-z]+ | [A-Z]+ ;
ALPHA      : [a-zA-Z_];
DIGIT : [0-9] ;
ALPHA_NUM : ALPHA | DIGIT;
// ID :  LETTER (LETTER | DIGIT)* ;
ID : ALPHA ALPHA_NUM*; // for variable name
NUM : DIGIT (DIGIT)* ;
CHAR : LETTER ;
WS : [\t\r\n]+ -> skip ; // skip spaces, tabs, newlines, \r (Windows)
SPACE : ' ' -> skip ;

program : 'class' 'Program' '{' varDeclaration* methodDeclaration* '}' ;
// declaration : structDeclaration | varDeclaration | methodDeclaration ;
// varDeclaration : varType varId ';' | varType varId '[' NUM ']' ';';
varDeclaration : varType varId ';' ;
structDeclaration : 'struct' ID '{' (varDeclaration)* '}' ;
varType : 'int' | 'char' | 'boolean' | 'struct' ID | structDeclaration ;
varId : ID ;
methodDeclaration : methodType methodName '(' (parameter (',' parameter)*)? ')' block ;
methodType : 'int' | 'char' | 'boolean' | 'void' ;
parameter : parameterType varId | parameterType varId '[' ']' ;
parameterType : 'int' | 'char' | 'boolean' ;
block : '{' (varDeclaration)* (statement)* '}' ;
statement : 'if' '(' expression ')' block ('else' block)? 
        | 'while' '(' expression ')' block
        | 'return' (expression)? ';'
        | methodCall ';'
        | block
        | location '=' expression
        | (expression)? ';' ;
location : (ID | ID '[' expression ']') ('.' location)? ;
expression : location | methodCall | literal | expression op expression 
        | '-' expression | '!' expression | '(' expression ')' ;
methodCall : (ID)  '('  (arg (',' arg)*)*  ')';
arg : expression ;
op : arith_op | rel_op | eq_op | cond_op ;
arith_op : '+' | '-' | '*' | '/' | '%' ;
rel_op : '<' | '>' | '<=' | '>=' ;
eq_op : '==' | '!=' ;
cond_op : '&&' | '||' ;
literal : int_literal | char_literal | bool_literal ;
int_literal : NUM ;
char_literal : '\'' CHAR '\'' ;
bool_literal : 'true' | 'false' ;
methodName : ID ;