grammar OCLfo;

@header {
    package nju.ics.antlr.oclfo;
}

invariant
        : 'context' class 'inv' ':' oclBool ';'                 # InvExpr
        ;

oclBool
        : oclBool boolOp oclBool                                # OclBoolBoolOp
        | 'not' oclBool                                         # NotOclBool
        | oclSet '->includesAll(' oclSet ')'                    # IncludesAll
        | oclSet '->excludesAll(' oclSet ')'                    # ExcludesAll
        | oclSet '->includes(' oclSingle ')'                    # Includes
        | oclSet '->excludes(' oclSingle ')'                    # Excludes
        | oclSet '->forAll(' varList '|' oclBool ')'            # ForAll
        | oclSet '->exists(' varList '|' oclBool ')'            # Exists
        | oclSet '->isEmpty()'                                  # IsEmpty
        | oclSet '->notEmpty()'                                 # NotEmpty
        | oclSet '->size()' compOp INT                          # Size
        | oclSet '->one(' var '|' oclBool ')'                   # One
        | oclSet '->isUnique(' attr ')'                         # IsUnique
        | oclObject '.oclIsKindOf(' class ')'                   # OclIsKindOf
        | oclObject '.oclIsTypeOf(' class ')'                   # OclIsTypeOf
        | oclSingle '=' 'null'                                  # OclSingleIsNull
        | oclSingle '<>' 'null'                                 # OclSingleIsNotNull
        | oclNavigation '=' oclNavigation                       # NavEqual
        | oclNavigation '<>' oclNavigation                      # NavNotEqual
        | oclValue compOp oclValue                              # ValueComp
        | oclObject '.' bAttr                                   # ObjectBAttr
        | var                                                   # OclVar
        | '(' oclBool ')'                                       # OclBoolParen
        ;


oclNavigation
        : oclSet                                                # Set
        | oclSingle                                             # Single
        ;


oclSet
        : oclSet '->union(' oclSet ')'                          # Union
        | oclSet '->intersection(' oclSet ')'                   # Intersection
        | oclSet '->symmetricDifference(' oclSet ')'            # SymmetricDifference
        | oclSet '-' oclSet                                     # Difference
        | oclSet '->select(' var '|' oclBool ')'                # Select
        | oclSet '->reject(' var '|' oclBool ')'                # Reject
        | oclSet '->selectByKind(' class ')'                    # SelectByKind
        | oclSet '->selectByType(' class ')'                    # SelectByType
        | oclSet '.' role '[' role']'                           # RoleAndRole
        | oclSet '.' assoClass '[' role ']'                     # AssoClassAndRole
        | oclSet '.' nfRole '[' role']'                         # NfRoleAndRole
        | oclSet '.' nfAssoClass '[' role ']'                   # NfAssoClassAndRole
        | oclSet '.' attr                                       # AttrOfSet
        | oclObject '.' nfAttr                                  # NfAttrOfObject
        | class '.allInstances()'                               # AllInstances
//        | oclSingle               // indirect left recursion, and oclObject and oclValue are not a set.
        ;

oclSingle
        : oclObject                                             # ObjectOfSingle
        | oclValue                                              # ValueOfSingle
        ;


oclObject
        : oclObject '.oclAsType(' class ')'                     # OclAsType
        | oclObject '.' fRole                                   # FRoleOfObject
        | oclObject '.' fAssoClass                              # FAssoClassOfObject
        | var                                                   # ObjectVar
        | 'self'                                                # Self
        ;


oclValue
        : constant                                              # ConstantValue
        | var                                                   # ValueVar
        | oclObject '.' fAttr                                   # FAttrOfObject
        | oclSet '->min()'                                      # MinOfSet
        | oclSet '->max()'                                      # MaxOfSet
        ;


boolOp
        : 'and'                 # And
        | 'or'                  # Or
        | 'xor'                 # Xor
        | 'implies'             # Implies
        ;


compOp
        : '<'                   # LessThan
        | '<='                  # LessThanOrEqual
        | '='                   # Equal
        | '>='                  # GreaterThanOrEqual
        | '>'                   # GreaterThan
        | '<>'                  # NotEqual
        ;

varList
        : var (',' var)*        # VarListValue
        ;


constant : ID                  # ConstantID
         ;

var     : ID                    # VarID
        ;

class   : ID                    # ClassID
        ;

assoClass : ID                  # AssoClassID
          ;

fAssoClass : ID                 # FAssoClassID
           ;

nfAssoClass : ID                # NfAssoClassID
            ;

role    : ID                    # RoleID
        ;

fRole   : ID                    # FRoleID
        ;

nfRole  : ID                    # NfRoleID
        ;

attr    : ID                    # AttrID
        ;

bAttr   : ID                    # BAttrID
        ;

fAttr   : ID                    # FAttrID
        ;

nfAttr  : ID                    # NfAttrID
        ;

INT     : [0-9]+ ;

NEWLINE : [\r\n]+ -> skip ;

WS      : [ \t\n\r]+ -> skip ;

ID      : [a-zA-Z$]+ [a-zA-Z0-9_$]* ; // match identifiers
