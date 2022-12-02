grammar expr;

@header {
package parser;
}

program: exprsolo EOF;

decl: typedecl | vardecl | funcdecl;

typedecl: 'type' typeid '=' type;

fielddecl:
	ID ':' typeid (',' ID ':' typeid)*;

vardecl: 'var' ID (':' typeid)? ':=' exprsolo  #VarDecl
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
	| STRING												# StringDecl
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
	| 'let' decl_list 'in' expr_seq? 'end'					# Let
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
boolexpr: minusexpr (('='|'<>'|'<='|'>='|'<'|'>') exprsolo)?	
		;

minusexpr: addexpr ('-' exprsolo)? #Moins
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

ord: 'ord' '(' (STRING | ID) ')';

chr: 'chr' '(' (INT | ID) ')';

size: 'size' '(' (STRING | ID) ')';

substring:	'substring' '(' (STRING | ID) ',' (INT | ID) ',' (INT | ID) ')';

concat: 'concat' '(' (STRING | ID) ',' (STRING | ID) ')';

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

STRING: '"' .*? '"';

//BINOP: ( '+' | '-' | '*' | '/'  '=' | '<>' | '<' | '>' | '<=' | '>=' | '&' | '|' );

USEDWORDS:
    'array'
    | 'break'
    | 'do'
    | 'else'
    | 'end'
    | 'for'
    | 'function'
    | 'if'
    | 'in'
    | 'let'
    | 'nil'
    | 'of'
    | 'then'
    | 'to'
    | 'type'
    | 'var'
    | 'while';

INT: ('0' ..'9')+;

SYMBS: ('!' | '?' | '-' | '_' | '.' | ':' | ';' | ',');

ID: ('a' ..'z' | 'A' ..'Z') ('a' ..'z'| 'A' ..'Z'| '0' ..'9'| '_')*;

WS: (' ' | '\n' | '/*' .*? '*/' | '\t')+ -> skip;