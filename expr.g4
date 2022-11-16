grammar expr;

@header {
package parser;
}

program: expr EOF;

decl: typedecl | vardecl | funcdecl;

typedecl: 'type' typeid '=' type;

fielddecl: ID ':' typeid fielddecl2;

fielddecl2: ',' fielddecl |;

vardecl: 'var' ID vardecls;

vardecls: ':=' expr | ':=' expr;

funcdecl: 'function' ID '(' fielddecl funcdecls;

funcdecls: ') =' expr | ') :' typeid '=' expr;

lvalue: ID lvalues;

lvalues: subscript | fieldexpr;

subscript: | lvalue '[' expr ']';

fieldexpr: | lvalue '.' ID;

expr:lvalue
	| INT
	| string
	| '(' expr4
	| '-' expr
	| ID '(' expr_list ')'
	| typeid expr2
	| lvalue ':=' expr
	| 'if' expr 'then' expr expr3
	| 'while' expr 'do' expr
	| 'for' ID ':=' expr 'to' expr 'do' expr
	| 'break'
	| 'let' decl_list 'in' expr_seq 'end'
	| print;

expr2: '[' expr '] of' expr | '{' fieldcreate '}';

expr3: 'else' expr |;

expr4: expr_seq ')'
	| expr BINOP expr ')';

expr_seq: expr expr_seq2 |;

expr_seq2: ';' expr_seq |;

expr_list: expr expr_list2;

expr_list2: ',' expr |;

fieldcreate: ID '=' expr fieldcreate2;

fieldcreate2:  | '.' fieldcreate;

decl_list: decl decl_list2 |;

decl_list2:  decl_list |;

freturn: 'return (' expr_seq ')';

print: 'print(' (string | ID) ')';

flush: 'flush()';

getchar: 'getchar()';

ord: 'ord(' (string | ID) ')';

chr: 'chr(' (INT | ID) ')';

size: 'size(' (string | ID) ')';

substring: 'substring(' (string | ID) ',' (INT | ID) ',' (INT | ID) ')';

concat: 'concat(' (string | ID) ',' (string | ID) ')';

not: 'not(' (INT | ID) ')';

exit: 'exit(' (INT | ID) ')';

type:typeid
	|'{'typefields?'}'
	|'array of'typeid;

typefields:typefield
	|typefield ',' typefields;

typefield: ID ':' typeid;

typeid: 'int' | 'string';

string: '"' (INT | ID | SYMBS | '\n')* '"';

BINOP: ( '+' | '-' | '*' | '/'  '=' | '<>' | '<' | '>' | '<=' | '>=' | '&' | '|' );
INT: ('0' ..'9')+;
CHAR:('a' ..'z' | 'A' ..'Z');
SYMBS: ('!' | '?' | '-' | '_' | '.' | ':' | ';' | ',' | ' ');

ID: ('a' ..'z' | 'A' ..'Z') ( 'a' ..'z' | 'A' ..'Z' | '0' ..'9' | '_' )*;

WS: (' ' | '\n' | '/*' .*? '*/' | '\t')+ -> skip;