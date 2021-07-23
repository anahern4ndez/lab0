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

program : 'class' 'Program' '{' declaration* '}' ;
declaration : structDeclaration | fieldDeclaration | methodDeclaration ;
// varDeclaration : (varType varId ';') | (varType varId '[' int_literal ']' ';');
varDeclaration : varType varId ';' ;
fieldDeclaration : varType fieldVar (',' fieldVar)* ';' ;
structDeclaration : 'struct' ID '{' (varDeclaration)* '}' ;
// varType : 'int' | 'char' | 'boolean' | 'struct' ID | structDeclaration ;
varType : 'int' | 'char' | 'boolean' ;
arrayId : ID '[' int_literal ']' ;
fieldVar : varId | arrayId ;
varId : ID ;
methodDeclaration : methodType methodName '(' (parameter (',' parameter)*)? ')' block ;
methodType : 'int' | 'char' | 'boolean' | 'void' ;
parameter : parameterType varId | parameterType varId '[' ']' ;
parameterType : 'int' | 'char' | 'boolean' ;
block : '{' (varDeclaration)* (statement)* '}' ;
// statement : 'if' '(' expression ')' block ('else' block)? 
//         | 'while' '(' expression ')' block
//         | 'return' (expression)? ';'
//         | methodCall ';'
//         | block
//         | location '=' expression
//         | (expression)? ';' ;
statement :  location '=' expression
        | location '=' expression ';'
        | methodCall
        | 'if' '(' expression ')' block ('else' block)?
        | varId '=' expression ';'
        | 'return' expression ';'
        | 'for' varId ('=' int_literal)? ',' ((varId ('=' int_literal)?) | int_literal) block
        | 'break' ';';
methodCallI : methodName  '('  (arg (',' arg)*)?  ')';
methodCall : methodCallI
        | methodCallI ';'
        | 'callout' '(' char_literal ((',' expression | char_literal) (',' expression | char_literal)*)? ')' ';' ;
expression : location | methodCall | literal | expression op expression 
        | '-' expression | '!' expression | '(' expression ')' ;
// location : (varId | ID '[' int_literal ']') ('.' location)? ;
location : varId | arrayId;
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