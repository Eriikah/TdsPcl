grammar expr;

@header {
package parser;
}

program: exprsolo EOF;

decl: typedecl | vardecl | funcdecl;

typedecl: 'type' typeid '=' type;

fielddecl: ID ':' typeid fielddecl2;

fielddecl2: ','ID ':' typeid fielddecl2 |;

vardecl: 'var' ID vardecls;

vardecls: ':=' exprsolo | ':=' exprsolo;

funcdecl: 'function' ID '(' fielddecl?')' funcdecls ;

funcdecls: '=' exprsolo | ':' typeid '=' exprsolo;

lvalue: ID lvalue? lvalues?;

lvalues: subscript 
	| fieldexpr;

subscript: '[' exprsolo ']';

fieldexpr: '.' ID;


expr:INT
	| string
	| '(' exprsolo expr_seq ')'
	| '-' exprsolo
	|lvalue (':='exprsolo)?
	| ID '(' expr_list? ')'
	| typeid expr2
	| 'if' exprsolo 'then' exprsolo expr3?
	| 'while' exprsolo 'do' exprsolo
	| 'for' ID ':=' exprsolo 'to' exprsolo 'do' exprsolo
	| 'break'
	| 'let' decl_list? 'in' exprsolo? expr_seq? 'end'
	| prints
	|freturn;

exprsolo: orexpr (':=' exprsolo)?;
orexpr: andexpr ('|' exprsolo)?;
andexpr:diffexpr boolexpr ('&' exprsolo)?;
boolexpr: ('<=' exprsolo)?
	| ('>=' exprsolo)?
	| ('<' exprsolo)?
	| ('>' exprsolo)?;
diffexpr:egexpr ('<>' exprsolo)?;
egexpr:minusexpr('=' exprsolo)?;
minusexpr:addexpr ('-' exprsolo)?;
addexpr:divexpr ('+' exprsolo)?;
divexpr:multexpr ('/' exprsolo)?;
multexpr: expr ('*'expr)?;

expr2: '[' exprsolo ']''of' exprsolo | '{' fieldcreate '}';

expr3: 'else' exprsolo;

expr_seq: ';' exprsolo expr_seq |;

expr_list: exprsolo expr_list2;

expr_list2:',' exprsolo expr_list2| ;

fieldcreate: ID '=' exprsolo fieldcreate2;

fieldcreate2:  | '.' fieldcreate;

decl_list: decl decl_list2;

decl_list2:  decl decl_list2 |;

freturn: 'return''(' exprsolo? expr_seq? ')';

prints: 'print''(' (string | ID | exprsolo) ')';

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

string: '"' (INT | ID | SYMBS)* '"';



//BINOP: ( '+' | '-' | '*' | '/'  '=' | '<>' | '<' | '>' | '<=' | '>=' | '&' | '|' );
INT: ('0' ..'9')+;
//CHAR:('a' ..'z' | 'A' ..'Z');
SYMBS: ('!' | '?' | '-' | '_' | '.' | ':' | ';' | ',' );

ID: ('a' ..'z' | 'A' ..'Z') ( 'a' ..'z' | 'A' ..'Z' | '0' ..'9' | '_' )*;

WS: (' ' | '\n' | '/*' .*? '*/' | '\t')+ -> skip;