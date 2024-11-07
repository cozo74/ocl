grammar oclfo;




oclBool
        : oclBool boolOp oclBool
        | 'not' oclBool
        | oclSet '->includesAll(' oclSet ')'
        | oclSet '->excludesAll(' oclSet ')'
        | oclSet '->includes(' oclSet ')'
        | oclSet '->excludes(' oclSet ')'
        | oclSet '->forAll(' varList '|' oclBool ')'
        | oclSet '->exists(' varList '|' oclBool ')'
        | oclSet '->isEmpty()'
        | oclSet '->size()' compOp INT
        | oclSet '->one(' var '|' oclBool ')'
        | oclSet '->isUnique(' attr ')'
        | oclObject '.oclIsKindOf(' class ')'
        | oclObject '.oclIsTypeOf(' class ')'
        | oclObject '=' 'null'
        | oclObject '<>' 'null'
        | oclNavigation '=' oclNavigation
        | oclNavigation '<>' oclNavigation
        | oclValue compOp oclValue
        | oclObject '.' bAttr
        | var
        ;


oclNavigation
        : oclSet
        | oclSingle
        ;


oclSet
        : oclSet '->union(' oclSet ')'
        | oclSet '->intersection(' oclSet ')'
        | oclSet '->symmetricDifference(' oclSet ')'
        | oclSet '-' oclSet
        | oclSet 'select(' var '|' oclBool ')'
        | oclSet 'reject(' var '|' oclBool ')'
        | oclSet '->selectByKind(' class ')'
        | oclSet '->selectByType(' class ')'
        | oclSet '.' role '[' role']'
        | oclSet '.' assoClass '[' role ']'
        | oclSet '.' nfRole '[' role']'
        | oclSet '.' nfAssoClass '[' role ']'
        | oclSet '.' attr
        | oclObject '.' nfAttr
        | class '.allInstances()'
//        | oclSingle
        ;

oclSingle
        : oclObject
        | oclValue
        ;


oclObject
        : oclObject '.oclAsType(' class ')'
        | oclObject '.' fRole
        | oclObject '.' fAssoClass
        | var
        | 'self'
        ;


oclValue
        : constant
        | var
        | oclObject '.' fAttr
        | oclSet '->min()'
        | oclSet '->max()'
        ;


boolOp
        : 'and' | 'or' | 'xor' | 'implies'
        ;


compOp
        : '<' | '<=' | '=' | '>=' | '>' | '<>'
        ;

varList
        : var (',' var)*
        ;


constant
        : INT
        | 'true'
        | 'false'
        ;

var
        : ID
        ;


class
        : ID
        ;



assoClass
        : ID
        ;

fAssoClass
        : ID
        ;

nfAssoClass
        : ID
        ;


role
        : ID
        ;


fRole
        : ID
        ;

nfRole
        : ID
        ;


attr
        : ID
        ;

bAttr
        : ID
        ;

fAttr
        : ID
        ;


nfAttr
        : ID
        ;


INT
        : [0-9]+
        ;




NEWLINE
    : [\r\n]+ -> skip
    ;

WS
    : [ \t\n\r]+ -> skip
    ;

ID
    : [a-zA-Z$]+ [a-zA-Z0-9_$]*
    ; // match identifiers
