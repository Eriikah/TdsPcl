grammar expr;

@header {
package parser;
}


expr : STR
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

decl_list : decl
	|decl_list decl
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
STR: ('a' ..'z' | 'A' ..'Z')+;
ID : (STR | '_')+ (INT | STR | '_')*;
TYPE: 'int'|'string' ;
TYPEID:TYPE ID;