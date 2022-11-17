grammar expr;

@header {
package parser;
}

program: expr EOF;

decl: typedecl | vardecl | funcdecl;

typedecl: 'type' typeid '=' type;

fielddecl: ID ':' typeid fielddecl2;

fielddecl2: ','ID ':' typeid fielddecl2 |;

vardecl: 'var' ID vardecls;

vardecls: ':=' expr | ':=' expr;

funcdecl: 'function' ID '(' fielddecl?')' funcdecls ;

funcdecls: '=' expr | ':' typeid '=' expr;

lvalue: ID lvalue? lvalues?;

lvalues: subscript 
	| fieldexpr;

subscript: '[' expr ']';

fieldexpr: '.' ID;

expr:INT
	| string
	| '(' expr expr4 ')'
	| '-' expr
	| ID expr5
	| typeid expr2
	| lvalue ':=' expr
	| 'if' expr 'then' expr expr3?
	| 'while' expr 'do' expr
	| 'for' ID ':=' expr 'to' expr 'do' expr
	| 'break'
	| 'let' decl_list? 'in' expr? expr_seq? 'end'
	| prints;

expr2: '[' expr ']''of' expr | '{' fieldcreate '}';

expr3: 'else' expr;

expr4: expr_seq
	| BINOP expr;

expr5:lvalues
	|'(' expr_list? ')'
;

expr_seq: ';' expr expr_seq |;

expr_list: expr expr_list2;

expr_list2:',' expr expr_list2| ;

fieldcreate: ID '=' expr fieldcreate2;

fieldcreate2:  | '.' fieldcreate;

decl_list: decl decl_list2;

decl_list2:  decl decl_list2 |;

freturn: 'return''(' expr? expr_seq? ')';

prints: 'print''(' (string | ID | expr) ')';

flush: 'flush''('')';

getchar: 'getchar''('')';

ord: 'ord''(' (string | ID) ')';

chr: 'chr''(' (INT | ID) ')';

size: 'size''(' (string | ID) ')';

substring: 'substring''(' (string | ID) ',' (INT | ID) ',' (INT | ID) ')';

concat: 'concat''(' (string | ID) ',' (string | ID) ')';

not: 'not''(' (INT | ID) ')';

exit: 'exit''(' (INT | ID) ')';

type:typeid
	|'{'typefields?'}'
	|'array''of'typeid;

typefields:typefield
	|typefield ',' typefields;

typefield: ID ':' typeid;

typeid: 'int' | 'string' |ID ;

string: '"' (INT | ID | SYMBS| '\n')* '"';

BINOP: ( '+' | '-' | '*' | '/'  '=' | '<>' | '<' | '>' | '<=' | '>=' | '&' | '|' );
INT: ('0' ..'9')+;
//CHAR:('a' ..'z' | 'A' ..'Z');
SYMBS: ('!' | '?' | '-' | '_' | '.' | ':' | ';' | ',' );

ID: ('a' ..'z' | 'A' ..'Z') ( 'a' ..'z' | 'A' ..'Z' | '0' ..'9' | '_' )*;

WS: (' ' | '\n' | '/*' .*? '*/' | '\t')+ -> skip;