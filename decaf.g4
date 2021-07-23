grammar decaf;

ID : ALPHA ALPHA_NUM* ; // for variable name
NUM : DIGIT (DIGIT)* ;
ALPHA_NUM : ALPHA | DIGIT ;
CHAR : LETTER ;
// STRING : ('\\' [btnfr"'\\] | ~[\r\n\\"] )+ ;
// STRING : LETTER+ DIGIT+ ;
LETTER : [a-z]+ | [A-Z]+ ;
ALPHA      : [a-zA-Z_];
DIGIT : [0-9] ;
// ID :  LETTER (LETTER | DIGIT)* ;
WS : [\t\r\n]+ -> skip ; // skip spaces, tabs, newlines, \r (Windows)
SPACE : ' ' -> skip ;
LINE_COMMENT : '//' .*? '\n' -> skip; // skip single line comments starting from // and ending with new line
COMMENT : '/*' .*? '*/' -> skip; // skip mutliple comments


program : 'class' ID '{' declaration* '}' ;
declaration : structDeclaration | varDeclaration | methodDeclaration ;
varDeclaration : varType varId ';' | varType varId '[' NUM ']' ';';
// varDeclaration : varType varId ';' ;
structDeclaration : 'struct' ID '{' (varDeclaration)* '}' ;
varType : 'int' | 'char' | 'boolean' | 'string' | 'struct' ID | structDeclaration ;
varId : ID ;
methodDeclaration : methodType ID '(' (parameter (',' parameter)*)? ')' block ;
methodType : 'int' | 'char' | 'boolean' | 'void' ;
parameter : parameterType varId | parameterType varId '[' ']' ;
parameterType : 'int' | 'char' | 'boolean' | 'string';
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
literal : int_literal | char_literal | bool_literal | string_literal;
int_literal : NUM ;
char_literal : '\'' CHAR '\'' ;
string_literal : '"' ID '"' ;
bool_literal : 'true' | 'false' ;
methodName : ID ;