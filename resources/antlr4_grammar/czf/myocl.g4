grammar myocl;


oclText
    : oclExpr + EOF
    ;

oclExpr
    : 'context' oclContext 'inv' oclInvariant
    ;

oclContext
    : ID
    ;

oclInvariant
    : oclInvName ':' oclBool
    ;

oclInvName
    : ID
    ;

oclBool
    : oclSet '->' 'forAll' '(' oclVar '|' oclBool ')'       #boolForAll
    | oclSingle compOp oclSingle                  #boolCompare
    | oclBool boolOp oclBool                      #boolCalc
    | oclQuery '->' oclExist                        #boolExist
    ;

oclQuery
    : oclSet '->' 'select' '(' oclVar '|' oclBool ')'       #querySelect
    | oclSet '->' 'reject' '(' oclVar '|' oclBool ')'       #queryReject
    ;

oclSet
    : oclClass '.' 'allInstances()'                            #classAll
    ;

oclSingle
    : '(' oclSingle binaryOp oclSingle ')'          #binarySingle
    | oclObject '.' oclAttr                       #objectSingle
    | oclConstant                                 #constantSingle
    | oclClass '.' oclAttr '->' oclAggregation      #aggregationSingle
    ;

oclObject
    : oclVar                                      #varObj
    | oclObject '.' oclRole                       #roleObj
    ;

oclExist
    : 'isEmpty()' | 'notEmpty()'
    ;

oclAggregation
    : 'sum()' | 'count()' | 'average()' | 'min()' | 'max()'
    ;

oclRole
    : ID
    ;

oclAttr
    : ID
    ;

oclVar
    : ID
    ;

oclClass
    : ID
    ;

oclConstant
    : '\'' ID '\''                               #oclString
    | INT                                          #oclInt
    ;

compOp
    : '=' | '>=' | '<=' | '>' | '<' | '<>'
    ;

boolOp
    : 'and' | 'or' | 'xor' | 'implies'
    ;

binaryOp
    : '+' | '-' | '*' | '/' | '%'
    ;




SPACE:                               [ \t\r\n]+    -> channel(HIDDEN);

// Operators. Comparation


EX:                                  'exists';
CO:                                  'collect';
SIZE:                                'size()';
ID:                                  [a-zA-Z][a-zA-Z0-9_]*;
INT:                                 [0-9]+;

