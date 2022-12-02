grammar expr;

@header {
package parser;
}

program: expr EOF;

decl: typedecl | vardecl | funcdecl;

typedecl: 'type' typeid '=' type;

fielddecl:
	ID ':' typeid (',' ID ':' typeid)*;

vardecl: 'var' ID ':=' exprsolo  #VarDecl
		| 'var' ID typeid ':=' exprsolo #VarDeclWithIdf
		;

funcdecl:
	 'function' ID  '(' fielddecl? ')' (':' typeid )? '=' exprsolo
	;

lvalue: ID  (subscript | fieldexpr)*
	;

subscript: '[' exprsolo ']';

fieldexpr: '.' ID;

expr:
	INT														# Integer
	| string												# StringDecl
	| '(' expr_seq ')'										# Parenthesis
	| '-' exprsolo											# MinusAffector
	| lvalue (':=' exprsolo)?								# Affect
	| ID '(' expr_list? ')'									# FunctionCall
	| typeid '[' exprsolo ']' 'of' exprsolo					# ListDecl
	| typeid '{' fieldcreate '}'							# List
	| 'if' exprsolo 'then' exprsolo							# IfThen
	| 'if' exprsolo 'then' exprsolo 'else' exprsolo			# IfThenElse
	| 'while' exprsolo 'do' exprsolo						# While
	| 'for' ID ':=' exprsolo 'to' exprsolo 'do' exprsolo	# For
	| 'break'												# Break
	| 'let' decl_list? 'in' expr_seq 'end'					# Let
	| prints												#PrintStr
	| freturn												#ReturnF
	| printi												#PrintInt
	| flush													#FlushF
	| getchar												#GetCharF
	| ord													#OrdF
	| chr													#CharF
	| size													#SizeF
	| substring												#SubstringF
	| concat												#ConcatenateF
	| not													#NotF
	| exit													#ExitF
	;

exprsolo: orexpr (':=' exprsolo)? #Affect2
		;

orexpr: andexpr ('|' exprsolo)? #Or
		;
andexpr: boolexpr ('&' exprsolo)? #And
		;
boolexpr: diffexpr ('<=' exprsolo)? #Infeq
	|diffexpr ('>=' exprsolo)? #Supeq
	|diffexpr ('<' exprsolo)? #Inf
	| diffexpr('>' exprsolo)? #Sup
	;
diffexpr: egexpr ('<>' exprsolo)? #Diff
	;
egexpr: minusexpr ('=' exprsolo)? #Eq
	;
minusexpr: addexpr ('-' exprsolo)? #Minus
	;
addexpr: divexpr ('+' exprsolo)? #Plus
	;
divexpr: multexpr ('/' exprsolo)? #Div
	;
multexpr: expr ('*' exprsolo)? #Mult
	;

expr_seq: exprsolo (';' exprsolo)* #ExprSeq
	;

expr_list: exprsolo (',' exprsolo)* #ExprList
	;

fieldcreate: ID '=' exprsolo ('.' ID '=' exprsolo)* #Field_Create
	;

decl_list: decl+ #DeclList
	;

freturn: 'return' '(' expr_seq ')';

prints: 'print' '(' (exprsolo) ')';

printi: 'printi' '(' (exprsolo) ')';

flush: 'flush' '(' ')';

getchar: 'getchar' '(' ')';

ord: 'ord' '(' (string | ID) ')';

chr: 'chr' '(' (INT | ID) ')';

size: 'size' '(' (string | ID) ')';

substring:	'substring' '(' (string | ID) ',' (INT | ID) ',' (INT | ID) ')';

concat: 'concat' '(' (string | ID) ',' (string | ID) ')';

not: 'not' '(' (INT | ID) ')';

exit: 'exit' '(' (INT | ID) ')';

type: typeid 
	| '{' typefields? '}' 
	| 'array' 'of' typeid
	;

typefields: typefield (',' typefields)* #Type_Fields
		; 

typefield: ID ':' typeid #Type_Field
	;

typeid: 'int' | 'string' | ID;

string: '"' (INT | ID | SYMBS)* '"';

//BINOP: ( '+' | '-' | '*' | '/'  '=' | '<>' | '<' | '>' | '<=' | '>=' | '&' | '|' );
INT: ('0' ..'9')+;

SYMBS: ('!' | '?' | '-' | '_' | '.' | ':' | ';' | ',');

ID: ('a' ..'z' | 'A' ..'Z') ('a' ..'z'| 'A' ..'Z'| '0' ..'9'| '_')*;

WS: (' ' | '\n' | '/*' .*? '*/' | '\t')+ -> skip;