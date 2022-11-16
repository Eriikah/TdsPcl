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

fielddecl : ID ':' TYPEID fielddecl2
	;

fielddecl2 : ',' fielddecl
	|
	;

vardecl : 'var' ID vardecls
	;

vardecls : ':=' expr
	| ':=' expr
	;

funcdecl : 'function' ID '(' fielddecl funcdecls
	;

funcdecls : ') =' expr
	| ') :' TYPEID '=' expr
	;

lvalue : ID lvalues
	;

lvalues : subscript
	| fieldexpr
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
	| TYPEID expr2
	| lvalue ':=' expr
	| 'if' expr 'then' expr expr3
	| 'while' expr 'do' expr
	| 'for' ID ':=' expr 'to' expr 'do' expr
	| 'break'
	| 'let' decl_list 'in' expr_seq 'end'
	| print
	;

expr2 : '[' expr '] of' expr
	| '{' fieldcreate '}'
	;

expr3 : 'else' expr
	|
	;

expr_seq : expr expr_seq2
	| 'nil'
	;

expr_seq2 : ';' expr_seq
	|
	;

expr_list : expr expr_list2
	;

expr_list2 : ',' expr
	|
	;

fieldcreate : ID fieldcreate2
	;

fieldcreate2 : '=' expr
	| '=' expr '.' fieldcreate
	;

decl_list : decl decl_list2
	| 'nil'
	;

decl_list2 : ' ' decl_list
	|
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