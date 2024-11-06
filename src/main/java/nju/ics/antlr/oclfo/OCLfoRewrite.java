package nju.ics.antlr.oclfo;

public class OCLfoRewrite extends OCLfoBaseVisitor<String>{


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
                result =  "(" + bool1 + " || " + bool2 + " ) ";
                break;
            default:
                result =  "error";
        }
        System.out.println(result);
        return result;

    }



    @Override
    public String visitNotOclBool(OCLfoParser.NotOclBoolContext ctx) {
        String bool1 = visit(ctx.oclBool());
        String result = " not " + bool1 + " ";
        System.out.println(result);
        return result;
    }


    @Override
    public String visitIncludesAll(OCLfoParser.IncludesAllContext ctx) {
        String set1 = visit(ctx.oclSet(0));
        String set2 = visit(ctx.oclSet(1));

        String result = " " + set2 + "->forAll( e2 | not " + set1 + "->forAll(e1 | e1 <> e2 ) ";

        System.out.println(result);
        return result;
    }


    @Override
    public String visitExcludesAll(OCLfoParser.ExcludesAllContext ctx) {
        String set1 = visit(ctx.oclSet(0));
        String set2 = visit(ctx.oclSet(1));

        String result = " " + set2 + "->forAll( e2 | " + set1 + "->forAll(e1 | e1 <> e2 ) ";

        System.out.println(result);
        return result;
    }


    @Override
    public String visitIncludes(OCLfoParser.IncludesContext ctx) {
        String set = visit(ctx.oclSet());
        String single = visit(ctx.oclSingle());

        String result = " not " + set + "->forAll( e | e <> " + single + ") ";

        System.out.println(result);
        return result;
    }


    @Override
    public String visitExcludes(OCLfoParser.ExcludesContext ctx) {
        String set = visit(ctx.oclSet());
        String single = visit(ctx.oclSingle());

        String result = " " + set + "->forAll( e | e <> " + single + " ) ";

        System.out.println(result);
        return result;
    }



    @Override
    public String visitForAll(OCLfoParser.ForAllContext ctx) {
        String set = visit(ctx.oclSet());
        String varList = visit(ctx.varList());
        String oclBool = visit(ctx.oclBool());

        String result = " " + set + "->forAll(" + varList + " | " + oclBool + " ) ";

        System.out.println(result);
        return result;
    }


    @Override
    public String visitExists(OCLfoParser.ExistsContext ctx) {
        String set = visit(ctx.oclSet());
        String varList = visit(ctx.varList());
        String oclBool = visit(ctx.oclBool());

        String result = " not " + set + "->forAll(" + varList + " | not " + oclBool + " ) ";

        System.out.println(result);
        return result;
    }


    @Override
    public String visitIsEmpty(OCLfoParser.IsEmptyContext ctx) {
        String set = visit(ctx.oclSet());

        String result = " " + set + "->forAll( e | 1<>1 ) ";

        System.out.println(result);
        return result;
    }


    @Override
    public String visitNotEmpty(OCLfoParser.NotEmptyContext ctx) {
        String set = visit(ctx.oclSet());

        String result = " not " + set + "->forAll( e | 1<>1 ) ";

        System.out.println(result);
        return result;
    }


    @Override
    public String visitSize(OCLfoParser.SizeContext ctx) {
        String set = visit(ctx.oclSet());
        String op = visit(ctx.oclSet());
        int size = Integer.parseInt(ctx.INT().getText());

        String forAll_n__1 = " " + set + "->forAll(e1, ..., e" + (size-1) + " | e1=e2 or e1=e3 or ... or e" + (size-2) + "=e" + (size-1) + " ) ";
        String forAll_n = " " + set + "->forAll(e1, ..., e" + size + " | e1=e2 or e1=e3 or ... or e" + (size-1) + "=e" + size + " ) ";
        String forAll_n_1 = " " + set + "->forAll(e1, ..., e" + (size+1) + " | e1=e2 or e1=e3 or ... or e" + (size) + "=e" + (size+1) + " ) ";

        String result;

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

        System.out.println(result);
        return result;
    }




    @Override
    public String visitOne(OCLfoParser.OneContext ctx) {
        String set = visit(ctx.oclSet());
        String var = visit(ctx.var());
        String bool = visit(ctx.oclBool());

        String selectSet = " " + set + "->select(" + var + " | " + bool + " ) ";

        String result = " " + selectSet + "->forAll(e1, e2 | e1=e2 ) and not ( not " + selectSet + "->forAll(e | 1<>1 ) )";

        System.out.println(result);
        return result;
    }



    @Override
    public String visitIsUnique(OCLfoParser.IsUniqueContext ctx) {
        String set = visit(ctx.oclSet());
        String attr = visit(ctx.attr());


        String result = " " + set + "->forAll(v1, v2 | v1 <> v2 implies v1." + attr + " <> v2." + attr + " ) ";

        System.out.println(result);
        return result;
    }



    @Override
    public String visitOclIsKindOf(OCLfoParser.OclIsKindOfContext ctx) {
        String v = visit(ctx.oclObject());
        String className = visit(ctx.class_());



        String result = " not " + className + "->forAll(e | e <> " + v + " ) ";

        System.out.println(result);
        return result;
    }



    // TODO
    @Override
    public String visitOclIsTypeOf(OCLfoParser.OclIsTypeOfContext ctx) {
        String v = visit(ctx.oclObject());
        String className = visit(ctx.class_());

        String result = " not " + className + "->forAll(e | e <> " + v + " ) and Subclass->forAll(e | e<>v) ... ";

        System.out.println(result);
        return result;
    }




    @Override
    public String visitOclSingleIsNull(OCLfoParser.OclSingleIsNullContext ctx) {
        String single = visit(ctx.oclSingle());


        String result = " " + single + "->forAll(e | 1<>1 ) ";

        System.out.println(result);
        return result;
    }




    @Override
    public String visitOclSingleIsNotNull(OCLfoParser.OclSingleIsNotNullContext ctx) {
        String single = visit(ctx.oclSingle());


        String result = " not " + single + "->forAll(e | 1<>1 ) ";

        System.out.println(result);
        return result;
    }



//
//    @Override
//    public String visitNavEqual(OCLfoParser.NavEqualContext ctx) {
//        String nav1 = visit(ctx.oclNavigation(0));
//        String nav2 = visit(ctx.oclNavigation(1));
//
//
//        String result;
//
//
//
//
//
//        System.out.println(result);
//        return result;
//    }














}
