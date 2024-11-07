package nju.ics.antlr.oclfo;

public class OCLfoRewriter extends OCLfoBaseVisitor<String>{



    @Override
    public String visitInvExpr(OCLfoParser.InvExprContext ctx) {
        String className = visit(ctx.class_());
        String oclBool = visit(ctx.oclBool());

        String result = "context " + className + " inv : " + oclBool + "; ";
        System.out.println(result);
        return result;
    }


    @Override
    public String visitOclBoolBoolOp(OCLfoParser.OclBoolBoolOpContext ctx) {
        String bool1 = visit(ctx.oclBool(0));
        String bool2 = visit(ctx.oclBool(1));
        String op = ctx.boolOp().getText();

        String result;
        switch (op) {
            case "or":
                result = " not ( not " +  bool1 + " and not " + bool2 +  " ) ";
                break;
            case "implies":
                result =  " not " + bool1 + " or " + bool2 + " ";
                break;
            case "xor":
                result =  "( " + bool1 + " or " + bool2 + " ) and ( not " + bool1 + " or not " + bool2 + " ) ";
                break;
            case "and":
                result = " " +  bool1 + " and " + bool2 + " ";
                break;
            default:
                result =  "error";
        }
//        System.out.println(result);
        return result;

    }


    @Override
    public String visitNotOclBool(OCLfoParser.NotOclBoolContext ctx) {
        String bool = visit(ctx.oclBool());

        String result = " not " + bool + " ";
//        System.out.println(result);
        return result;
    }


    @Override
    public String visitIncludesAll(OCLfoParser.IncludesAllContext ctx) {
        String set1 = visit(ctx.oclSet(0));
        String set2 = visit(ctx.oclSet(1));

        String result = " " + set2 + "->forAll( e2 | not " + set1 + "->forAll(e1 | not e1 = e2 ) ";

//        System.out.println(result);
        return result;
    }


    @Override
    public String visitExcludesAll(OCLfoParser.ExcludesAllContext ctx) {
        String set1 = visit(ctx.oclSet(0));
        String set2 = visit(ctx.oclSet(1));

        String result = " " + set2 + "->forAll( e2 | " + set1 + "->forAll(e1 | not e1 = e2 ) ";

//        System.out.println(result);
        return result;
    }


    @Override
    public String visitIncludes(OCLfoParser.IncludesContext ctx) {
        String set = visit(ctx.oclSet());
        String single = visit(ctx.oclSingle());

        String result = " not " + set + "->forAll( e | not e = " + single + ") ";

//        System.out.println(result);
        return result;
    }


    @Override
    public String visitExcludes(OCLfoParser.ExcludesContext ctx) {
        String set = visit(ctx.oclSet());
        String single = visit(ctx.oclSingle());

        String result = " " + set + "->forAll( e | not e = " + single + " ) ";

//        System.out.println(result);
        return result;
    }


    @Override
    public String visitForAll(OCLfoParser.ForAllContext ctx) {
        String set = visit(ctx.oclSet());
        String varList = visit(ctx.varList());
        String oclBool = visit(ctx.oclBool());

        String result = " " + set + "->forAll(" + varList + " | " + oclBool + " ) ";

//        System.out.println(result);
        return result;
    }


    @Override
    public String visitExists(OCLfoParser.ExistsContext ctx) {
        String set = visit(ctx.oclSet());
        String varList = visit(ctx.varList());
        String oclBool = visit(ctx.oclBool());

        String result = " not " + set + "->forAll(" + varList + " | not " + oclBool + " ) ";

//        System.out.println(result);
        return result;
    }


    @Override
    public String visitIsEmpty(OCLfoParser.IsEmptyContext ctx) {
        String set = visit(ctx.oclSet());

        String result = " " + set + "->forAll( e | not 1=1 ) ";

//        System.out.println(result);
        return result;
    }


    @Override
    public String visitNotEmpty(OCLfoParser.NotEmptyContext ctx) {
        String set = visit(ctx.oclSet());

        String result = " not " + set + "->forAll( e | not 1=1 ) ";

//        System.out.println(result);
        return result;
    }


    @Override
    public String visitSize(OCLfoParser.SizeContext ctx) {
        String set = visit(ctx.oclSet());
        String op = visit(ctx.compOp());
        int size = Integer.parseInt(ctx.INT().getText());

        String forAll_n__1 = " " + set + "->forAll(e1, ..., e" + (size-1) + " | e1=e2 or e1=e3 or ... or e" + (size-2) + "=e" + (size-1) + " ) ";
        String forAll_n = " " + set + "->forAll(e1, ..., e" + size + " | e1=e2 or e1=e3 or ... or e" + (size-1) + "=e" + size + " ) ";
        String forAll_n_1 = " " + set + "->forAll(e1, ..., e" + (size+1) + " | e1=e2 or e1=e3 or ... or e" + (size) + "=e" + (size+1) + " ) ";

        String result;
        System.out.println(op);

        switch (op) {
            case "<":
                result = forAll_n;
                break;
            case "<=":
                result = forAll_n_1;
                break;
            case "=":
                result = " " + forAll_n_1 + " and not " + forAll_n__1;
                break;
            case ">=":
                result = " not " + forAll_n_1;
                break;
            case ">":
                result = " not " + forAll_n;
                break;
            case "<>":
                result = " not ( " + forAll_n_1 + " and not " + forAll_n__1 + ")";
                break;
            default:
                result = "error";
                break;
        }

//        System.out.println(result);
        return result;
    }


    @Override
    public String visitOne(OCLfoParser.OneContext ctx) {
        String set = visit(ctx.oclSet());
        String var = visit(ctx.var());
        String bool = visit(ctx.oclBool());

        String selectSet = " " + set + "->select(" + var + " | " + bool + " ) ";

        String result = " " + selectSet + "->forAll(e1, e2 | e1=e2 ) and not ( not " + selectSet + "->forAll(e | not 1=1 ) )";

//        System.out.println(result);
        return result;
    }


    @Override
    public String visitIsUnique(OCLfoParser.IsUniqueContext ctx) {
        String set = visit(ctx.oclSet());
        String attr = visit(ctx.attr());

        String result = " " + set + "->forAll(v1, v2 | not v1 = v2 implies not v1." + attr + " = v2." + attr + " ) ";

//        System.out.println(result);
        return result;
    }


    @Override
    public String visitOclIsKindOf(OCLfoParser.OclIsKindOfContext ctx) {
        String v = visit(ctx.oclObject());
        String className = visit(ctx.class_());



        String result = " not " + className + "->forAll(e | not e = " + v + " ) ";

//        System.out.println(result);
        return result;
    }


    // TODO
    @Override
    public String visitOclIsTypeOf(OCLfoParser.OclIsTypeOfContext ctx) {
        String v = visit(ctx.oclObject());
        String className = visit(ctx.class_());

        String result = " not " + className + "->forAll(e | not e = " + v + " ) and Subclass->forAll(e | not e=v) ... ";

//        System.out.println(result);
        return result;
    }


    @Override
    public String visitOclSingleIsNull(OCLfoParser.OclSingleIsNullContext ctx) {
        String single = visit(ctx.oclSingle());


        String result = " " + single + "->forAll(e | not 1=1 ) ";

//        System.out.println(result);
        return result;
    }


    @Override
    public String visitOclSingleIsNotNull(OCLfoParser.OclSingleIsNotNullContext ctx) {
        String single = visit(ctx.oclSingle());


        String result = " not " + single + "->forAll(e | not 1=1 ) ";

//        System.out.println(result);
        return result;
    }


    @Override
    public String visitNavEqual(OCLfoParser.NavEqualContext ctx) {
        String nav1 = visit(ctx.oclNavigation(0));
        String nav2 = visit(ctx.oclNavigation(1));

        String result;

        if (ctx.oclNavigation(0).children.get(0) instanceof OCLfoParser.OclSingleContext) {
            String includesAll1 = " " + nav2 + "->forAll(e2 | not " + nav1 + "->forAll(e1 | not e1=e2 ) ) ";
            String includesAll2 = " " + nav1 + "->forAll(e2 | not " + nav2 + "->forAll(e1 | not e1=e2 ) ) ";
            result = " " + includesAll1 + " and " + includesAll2 + " ";
        } else {
            result = " " + nav1 + " = " + nav2 + " ";
        }

//        System.out.println(result);
        return result;
    }


    @Override
    public String visitNavNotEqual(OCLfoParser.NavNotEqualContext ctx) {
        String nav1 = visit(ctx.oclNavigation(0));
        String nav2 = visit(ctx.oclNavigation(1));

        String result;

        if (ctx.oclNavigation(0).children.get(0) instanceof OCLfoParser.OclSingleContext) {
            String includesAll1 = " " + nav2 + "->forAll(e2 | not " + nav1 + "->forAll(e1 | not e1=e2 ) ) ";
            String includesAll2 = " " + nav1 + "->forAll(e2 | not " + nav2 + "->forAll(e1 | not e1=e2 ) ) ";
            result = " not " + includesAll1 + " and " + includesAll2 + " ";
        } else {
            result = " not " + nav1 + " = " + nav2 + " ";
        }

//        System.out.println(result);
        return result;
    }


    @Override
    public String visitValueComp(OCLfoParser.ValueCompContext ctx) {
        String value1 = visit(ctx.oclValue(0));
        String value2 = visit(ctx.oclValue(1));
        String op = ctx.compOp().getText();

        String result = " " + value1 + " " + op + " " + value2 + " ";

//        System.out.println(result);
        return result;
    }


    @Override
    public String visitObjectBAttr(OCLfoParser.ObjectBAttrContext ctx) {
        String obj = visit(ctx.oclObject());
        String bAttr = visit(ctx.bAttr());

        String result = " " + obj + "." + bAttr + " ";
//        System.out.println(result);
        return result;
    }


    @Override
    public String visitOclVar(OCLfoParser.OclVarContext ctx) {

        String result = visit(ctx.var());
//        System.out.println(result);
        return result;
    }



    @Override
    public String visitOclBoolParen(OCLfoParser.OclBoolParenContext ctx) {

        String bool = visit(ctx.oclBool());
        String result = " ( " + bool + " ) ";
//        System.out.println(result);
        return result;
    }


    @Override
    public String visitSet(OCLfoParser.SetContext ctx) {

        return visit(ctx.oclSet());
    }


    @Override
    public String visitSingle(OCLfoParser.SingleContext ctx) {

        String result = visit(ctx.oclSingle());
        return result;
    }


    @Override
    public String visitUnion(OCLfoParser.UnionContext ctx) {
        String set1 = visit(ctx.oclSet(0));
        String set2 = visit(ctx.oclSet(1));

        String result = " " + set1 + "->union(" + set2 + ") ";
        return result;
    }


    @Override
    public String visitIntersection(OCLfoParser.IntersectionContext ctx) {

        String set1 = visit(ctx.oclSet(0));
        String set2 = visit(ctx.oclSet(1));

        String result = " " + set1 + "->intersection(" + set2 + ") ";
        return result;
    }


    @Override
    public String visitSymmetricDifference(OCLfoParser.SymmetricDifferenceContext ctx) {

        String set1 = visit(ctx.oclSet(0));
        String set2 = visit(ctx.oclSet(1));

        String result = " (" + set1 + " - " + set2 + ")->union(" + set2 + " - " + set1 + ") ";
        return result;
    }


    @Override
    public String visitDifference(OCLfoParser.DifferenceContext ctx) {

        String set1 = visit(ctx.oclSet(0));
        String set2 = visit(ctx.oclSet(1));

        String result = " " + set1 + " - " + set2 + " ";
        return result;
    }


    @Override
    public String visitSelect(OCLfoParser.SelectContext ctx) {

        String set = visit(ctx.oclSet());
        String var = visit(ctx.var());
        String bool = visit(ctx.oclBool());

        String result = " " + set + "->select( " + var + " | " + bool + " ) ";
        return result;
    }


    @Override
    public String visitReject(OCLfoParser.RejectContext ctx) {

        String set = visit(ctx.oclSet());
        String var = visit(ctx.var());
        String bool = visit(ctx.oclBool());

        String result = " " + set + "->select( " + var + " | not " + bool + " ) ";
        return result;
    }


    @Override
    public String visitSelectByKind(OCLfoParser.SelectByKindContext ctx) {

        String set = visit(ctx.oclSet());
        String className = visit(ctx.class_());

        String result = " " + set + "->select( e | not " + className + "->forAll(c | not e = c) ) ";
        return result;
    }


    @Override
    public String visitSelectByType(OCLfoParser.SelectByTypeContext ctx) {

        String set = visit(ctx.oclSet());
        String className = visit(ctx.class_());

        String result = " " + set + "->select( e | not " + className + "->forAll(c | not e = c)  and Subclass->forAll( e | not e = c) ... ) ";
        return result;
    }


    @Override
    public String visitRoleAndRole(OCLfoParser.RoleAndRoleContext ctx) {

        String set = visit(ctx.oclSet());
        String role1 = visit(ctx.role(0));
        String role2 = visit(ctx.role(1));

        String result = " " + set + "." + role1 + "[" + role2 + "] ";
        return result;
    }


    @Override
    public String visitAssoClassAndRole(OCLfoParser.AssoClassAndRoleContext ctx) {

        String set = visit(ctx.oclSet());
        String assoClass = visit(ctx.assoClass());
        String role = visit(ctx.role());

        String result = " " + set + "." + assoClass + "[" + role + "] ";
        return result;
    }


    @Override
    public String visitNfRoleAndRole(OCLfoParser.NfRoleAndRoleContext ctx) {

        String set = visit(ctx.oclSet());
        String nfRole = visit(ctx.nfRole());
        String role = visit(ctx.role());

        String result = " " + set + "." + nfRole + "[" + role + "] ";
        return result;
    }


    @Override
    public String visitNfAssoClassAndRole(OCLfoParser.NfAssoClassAndRoleContext ctx) {

        String set = visit(ctx.oclSet());
        String nfAssoClass = visit(ctx.nfAssoClass());
        String role = visit(ctx.role());

        String result = " " + set + "." + nfAssoClass + "[" + role + "] ";
        return result;
    }


    @Override
    public String visitAttrOfSet(OCLfoParser.AttrOfSetContext ctx) {

        String set = visit(ctx.oclSet());
        String attr = visit(ctx.attr());

        String result = " " + set + "." + attr + " ";
        return result;
    }


    @Override
    public String visitNfAttrOfObject(OCLfoParser.NfAttrOfObjectContext ctx) {

        String oclObject = visit(ctx.oclObject());
        String nfAttr = visit(ctx.nfAttr());

        String result = " " + oclObject + "." + nfAttr + " ";
        return result;
    }


    @Override
    public String visitAllInstances(OCLfoParser.AllInstancesContext ctx) {

        String className = visit(ctx.class_());

        String result = " " + className + ".allInstances() ";
        return result;
    }


    @Override
    public String visitObjectOfSingle(OCLfoParser.ObjectOfSingleContext ctx) {

        String oclObject = visit(ctx.oclObject());

        String result = oclObject ;
        return result;
    }


    @Override
    public String visitValueOfSingle(OCLfoParser.ValueOfSingleContext ctx) {

        String oclValue = visit(ctx.oclValue());

        String result = oclValue;
        return result;
    }


    @Override
    public String visitOclAsType(OCLfoParser.OclAsTypeContext ctx) {

        String oclObject = visit(ctx.oclObject());
        String className = visit(ctx.class_());

        String result = " " + oclObject + ".oclAsType( " + className + ") " ;
        return result;
    }


    @Override
    public String visitFRoleOfObject(OCLfoParser.FRoleOfObjectContext ctx) {

        String oclObject = visit(ctx.oclObject());
        String fRole = visit(ctx.fRole());

        String result = " " + oclObject + "." + fRole + " " ;
        return result;
    }


    @Override
    public String visitFAssoClassOfObject(OCLfoParser.FAssoClassOfObjectContext ctx) {

        String oclObject = visit(ctx.oclObject());
        String fAssoClass = visit(ctx.fAssoClass());


        String result = " " + oclObject + "." + fAssoClass + " " ;
        return result;
    }


    @Override
    public String visitObjectVar(OCLfoParser.ObjectVarContext ctx) {

        String var = visit(ctx.var());

        String result = var;
        return result;
    }


    @Override
    public String visitSelf(OCLfoParser.SelfContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitConstantValue(OCLfoParser.ConstantValueContext ctx) {

        String result = visit(ctx.constant());
        return result;
    }


    @Override
    public String visitValueVar(OCLfoParser.ValueVarContext ctx) {

        String result = visit(ctx.var());
        return result;
    }


    @Override
    public String visitFAttrOfObject(OCLfoParser.FAttrOfObjectContext ctx) {

        String oclObject = visit(ctx.oclObject());
        String fAttr = visit(ctx.fAttr());

        String result = " " + oclObject + "." + fAttr + " " ;
        return result;
    }


    @Override
    public String visitMinOfSet(OCLfoParser.MinOfSetContext ctx) {

        String set = visit(ctx.oclSet());

        String result = " " + set + "->select(min | " + set + "->forAll( e | min <= e ) ) " ;
        return result;
    }


    @Override
    public String visitMaxOfSet(OCLfoParser.MaxOfSetContext ctx) {

        String set = visit(ctx.oclSet());

        String result = " " + set + "->select(max | " + set + "->forAll( e | max >= e ) ) " ;
        return result;
    }


    // Methods below only return original text

    @Override
    public String visitAnd(OCLfoParser.AndContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitOr(OCLfoParser.OrContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitXor(OCLfoParser.XorContext ctx) {

        String result = ctx.getText();
        return result;
    }



    @Override
    public String visitImplies(OCLfoParser.ImpliesContext ctx) {

        String result = ctx.getText();
        return result;
    }



    @Override
    public String visitLessThan(OCLfoParser.LessThanContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitLessThanOrEqual(OCLfoParser.LessThanOrEqualContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitEqual(OCLfoParser.EqualContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitGreaterThanOrEqual(OCLfoParser.GreaterThanOrEqualContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitGreaterThan(OCLfoParser.GreaterThanContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitNotEqual(OCLfoParser.NotEqualContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitVarListValue(OCLfoParser.VarListValueContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitConstantID(OCLfoParser.ConstantIDContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitVarID(OCLfoParser.VarIDContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitClassID(OCLfoParser.ClassIDContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitAssoClassID(OCLfoParser.AssoClassIDContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitFAssoClassID(OCLfoParser.FAssoClassIDContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitNfAssoClassID(OCLfoParser.NfAssoClassIDContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitRoleID(OCLfoParser.RoleIDContext ctx) {

        String result = ctx.getText();
        return result;
    }

    @Override
    public String visitFRoleID(OCLfoParser.FRoleIDContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitNfRoleID(OCLfoParser.NfRoleIDContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitAttrID(OCLfoParser.AttrIDContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitBAttrID(OCLfoParser.BAttrIDContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitFAttrID(OCLfoParser.FAttrIDContext ctx) {

        String result = ctx.getText();
        return result;
    }


    @Override
    public String visitNfAttrID(OCLfoParser.NfAttrIDContext ctx) {

        String result = ctx.getText();
        return result;
    }




}
