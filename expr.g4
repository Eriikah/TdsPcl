grammar expr;

@header {
package parser;
}

program : expr EOF
	;

decl : TYPE TYPEID '=' typeval  
	| vardecl 
	| funcdecl 
	;

typeval : TYPEID 
	| 'array of' TYPEID
	| '{' fielddecl '}'
	;

fielddecl : ID ':' TYPEID
	| ID ':' TYPEID ',' fielddecl
	;

vardecl : 'var' ID ':=' expr
	| 'var' ID ':' TYPEID ':=' expr
	;

funcdecl : 'function' ID '(' fielddecl ') =' expr
	| 'function' ID '(' fielddecl ') :' TYPEID '=' expr
	;

lvalue : ID subscript
	| ID fieldexpr
	;

subscript : 'nil'
	| lvalue '[' expr ']'
	;

fieldexpr : 'nil'
	| lvalue '.' ID
	;

expr : lvalue
	| 'nil'
	| INT
	| STRING
	| '(' expr_seq ')'
	| '-' expr
	| ID '(' expr_list ')'
	| '(' expr BINOP expr ')'
	| TYPEID '[' expr '] of' expr
	| TYPEID '{' fieldcreate '}'
	| lvalue ':=' expr
	| 'if' expr 'then' expr 'else' expr
	| 'if' expr 'then' expr
	| 'while' expr 'do' expr
	| 'for' ID ':=' expr 'to' expr 'do' expr
	| 'break'
	| 'let' decl_list 'in' expr_seq 'end'
	| print
	;

expr_seq : expr
	| 'nil'
	| expr ';' expr_seq
	;

expr_list : expr
	| expr ',' expr
	;

fieldcreate : ID '=' expr
	| ID '=' expr '.' fieldcreate
	;

decl_list : decl
	| 'nil'
	| decl ' ' decl_list
	; 

freturn : 'return (' expr_seq ')' 
	;

print : 'print(' (STRING | ID) ')' 
	;

flush : 'flush()'
	;

getchar : 'getchar()'
	;

ord : 'ord(' (STRING | ID) ')'
	;

chr : 'chr(' (INT | ID) ')'
	;

size : 'size(' (STRING | ID) ')'
	;

substring : 'substring(' (STRING|ID) ',' (INT|ID) ',' (INT|ID) ')'
	;

concat : 'concat(' (STRING|ID) ',' (STRING|ID) ')'
	;

not : 'not(' (INT|ID) ')'
	;

exit : 'exit(' (INT|ID) ')'
	;

BINOP : ('+' | '-' | '*' | '/ ' | '=' | '<>' | '<' | '>' | '<=' | '>=' | '&' | '|') ;
INT: ('0' ..'9')+;
//CHARS: ;
SYMBS:('!'|'?'|'-'|'_'|'.'|':'|';'|','|' ');
STRING: '"'(INT|('a' ..'z' | 'A' ..'Z')+|SYMBS|'\n')* '"';
ID : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
TYPE: 'int'|'string' ;
TYPEID:TYPE ID;

WS: (' '|'\n' | '/*'.*?'*/' | '\t')+ -> skip;