grammar expr;

@header {
package parser;
}

program: expr EOF; 

expr : STRING
	| INT
	|'nil'
	|lvalue
	|'-' expr
	|expr BINOP expr 
	|lvalue ':=' expr
	|ID '('expr_list?')'
	|'('expr_seq?')'
	|TYPEID '{'field_list?'}'
	|TYPEID '['expr'] of' expr
	|'if' expr 'then' expr
	|'if' expr 'then' expr 'else' expr
	|'while' expr 'do' expr
	|'for' ID ':=' expr 'to' expr 'do' expr
	|'break'
	|'let' decl_list 'in' expr_seq? 'end'
	|print
	;

expr_seq : expr
	|expr_seq ';' expr
	;
expr_list : expr
	|expr_list ',' expr
	;
field_list : ID '=' expr
	|field_list ',' ID '=' expr
	;
lvalue : ID
	|lvalue '.' ID
	|lvalue '[' expr ']'
	;

freturn : 'return (' expr_seq ')' ;

print : 'print(' (expr | ID) ')' ; 

decl_list : decl
	|decl decl_list
	;
decl : type_decl
	|variable_decl
	|function_decl
	;
type_decl : TYPE TYPEID '=' type;
type : TYPEID
	|'{' type_field '}'
	|'array of' TYPEID
	;
type_fields: type_field
	|type_fields ',' type_field
	;
type_field : ID ':' TYPEID ;
variable_decl : 'var' ID ':=' expr
	|'var' ID ':' TYPEID ':=' expr
	;
function_decl : 'function' ID '(' type_field? ') =' expr
	| 'function' ID '(' type_field? ') :' TYPEID '=' expr
	;

BINOP : ('+' | '-' | '*' | '/ ' | '=' | '<>' | '<' | '>' | '<=' | '>=' | '&' | '|') ;
INT: ('0' ..'9')+;
CHARS: ('a' ..'z' | 'A' ..'Z')+;
SYMBS:('!'|'?'|'-'|'_'|'.'|':'|';'|','|' ');
STRING: '"'(INT|CHARS|SYMBS|'\n')* '"';
ID : (CHARS | '_')+ (INT | CHARS | '_')*;
TYPE: 'int'|'string' ;
TYPEID:TYPE ID;

WS: (' '|'\n' | '/*'.*'*/' | '\t')+ -> skip;