// Generated from OCLfo.g4 by ANTLR 4.13.2

    package nju.ics.antlr.oclfo;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OCLfoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OCLfoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code InvExpr}
	 * labeled alternative in {@link OCLfoParser#invariant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvExpr(OCLfoParser.InvExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsEmpty}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsEmpty(OCLfoParser.IsEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExcludesAll}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcludesAll(OCLfoParser.ExcludesAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OclBoolBoolOp}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclBoolBoolOp(OCLfoParser.OclBoolBoolOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NavEqual}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavEqual(OCLfoParser.NavEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Size}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(OCLfoParser.SizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueComp}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueComp(OCLfoParser.ValueCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code One}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOne(OCLfoParser.OneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OclSingleIsNotNull}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclSingleIsNotNull(OCLfoParser.OclSingleIsNotNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncludesAll}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludesAll(OCLfoParser.IncludesAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Excludes}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcludes(OCLfoParser.ExcludesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotOclBool}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOclBool(OCLfoParser.NotOclBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectBAttr}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectBAttr(OCLfoParser.ObjectBAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OclSingleIsNull}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclSingleIsNull(OCLfoParser.OclSingleIsNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Includes}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludes(OCLfoParser.IncludesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OclBoolParen}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclBoolParen(OCLfoParser.OclBoolParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NavNotEqual}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavNotEqual(OCLfoParser.NavNotEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Exists}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(OCLfoParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsUnique}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsUnique(OCLfoParser.IsUniqueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEmpty}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEmpty(OCLfoParser.NotEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OclVar}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclVar(OCLfoParser.OclVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForAll}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForAll(OCLfoParser.ForAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OclIsKindOf}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclIsKindOf(OCLfoParser.OclIsKindOfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OclIsTypeOf}
	 * labeled alternative in {@link OCLfoParser#oclBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclIsTypeOf(OCLfoParser.OclIsTypeOfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Set}
	 * labeled alternative in {@link OCLfoParser#oclNavigation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(OCLfoParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Single}
	 * labeled alternative in {@link OCLfoParser#oclNavigation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle(OCLfoParser.SingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Intersection}
	 * labeled alternative in {@link OCLfoParser#oclSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersection(OCLfoParser.IntersectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectByKind}
	 * labeled alternative in {@link OCLfoParser#oclSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectByKind(OCLfoParser.SelectByKindContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NfAssoClassAndRole}
	 * labeled alternative in {@link OCLfoParser#oclSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNfAssoClassAndRole(OCLfoParser.NfAssoClassAndRoleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Difference}
	 * labeled alternative in {@link OCLfoParser#oclSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDifference(OCLfoParser.DifferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectByType}
	 * labeled alternative in {@link OCLfoParser#oclSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectByType(OCLfoParser.SelectByTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NfRoleAndRole}
	 * labeled alternative in {@link OCLfoParser#oclSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNfRoleAndRole(OCLfoParser.NfRoleAndRoleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Union}
	 * labeled alternative in {@link OCLfoParser#oclSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(OCLfoParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Reject}
	 * labeled alternative in {@link OCLfoParser#oclSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReject(OCLfoParser.RejectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssoClassAndRole}
	 * labeled alternative in {@link OCLfoParser#oclSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssoClassAndRole(OCLfoParser.AssoClassAndRoleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RoleAndRole}
	 * labeled alternative in {@link OCLfoParser#oclSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleAndRole(OCLfoParser.RoleAndRoleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrOfSet}
	 * labeled alternative in {@link OCLfoParser#oclSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrOfSet(OCLfoParser.AttrOfSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Select}
	 * labeled alternative in {@link OCLfoParser#oclSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(OCLfoParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SymmetricDifference}
	 * labeled alternative in {@link OCLfoParser#oclSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymmetricDifference(OCLfoParser.SymmetricDifferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NfAttrOfObject}
	 * labeled alternative in {@link OCLfoParser#oclSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNfAttrOfObject(OCLfoParser.NfAttrOfObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AllInstances}
	 * labeled alternative in {@link OCLfoParser#oclSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllInstances(OCLfoParser.AllInstancesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectOfSingle}
	 * labeled alternative in {@link OCLfoParser#oclSingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectOfSingle(OCLfoParser.ObjectOfSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueOfSingle}
	 * labeled alternative in {@link OCLfoParser#oclSingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueOfSingle(OCLfoParser.ValueOfSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectVar}
	 * labeled alternative in {@link OCLfoParser#oclObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectVar(OCLfoParser.ObjectVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Self}
	 * labeled alternative in {@link OCLfoParser#oclObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelf(OCLfoParser.SelfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FAssoClassOfObject}
	 * labeled alternative in {@link OCLfoParser#oclObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFAssoClassOfObject(OCLfoParser.FAssoClassOfObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OclAsType}
	 * labeled alternative in {@link OCLfoParser#oclObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOclAsType(OCLfoParser.OclAsTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRoleOfObject}
	 * labeled alternative in {@link OCLfoParser#oclObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRoleOfObject(OCLfoParser.FRoleOfObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantValue}
	 * labeled alternative in {@link OCLfoParser#oclValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantValue(OCLfoParser.ConstantValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueVar}
	 * labeled alternative in {@link OCLfoParser#oclValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueVar(OCLfoParser.ValueVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FAttrOfObject}
	 * labeled alternative in {@link OCLfoParser#oclValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFAttrOfObject(OCLfoParser.FAttrOfObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinOfSet}
	 * labeled alternative in {@link OCLfoParser#oclValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinOfSet(OCLfoParser.MinOfSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MaxOfSet}
	 * labeled alternative in {@link OCLfoParser#oclValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxOfSet(OCLfoParser.MaxOfSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link OCLfoParser#boolOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(OCLfoParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link OCLfoParser#boolOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(OCLfoParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Xor}
	 * labeled alternative in {@link OCLfoParser#boolOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor(OCLfoParser.XorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Implies}
	 * labeled alternative in {@link OCLfoParser#boolOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplies(OCLfoParser.ImpliesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link OCLfoParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(OCLfoParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThanOrEqual}
	 * labeled alternative in {@link OCLfoParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanOrEqual(OCLfoParser.LessThanOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link OCLfoParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(OCLfoParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThanOrEqual}
	 * labeled alternative in {@link OCLfoParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanOrEqual(OCLfoParser.GreaterThanOrEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link OCLfoParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(OCLfoParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link OCLfoParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqual(OCLfoParser.NotEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarListValue}
	 * labeled alternative in {@link OCLfoParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarListValue(OCLfoParser.VarListValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantID}
	 * labeled alternative in {@link OCLfoParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantID(OCLfoParser.ConstantIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarID}
	 * labeled alternative in {@link OCLfoParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarID(OCLfoParser.VarIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassID}
	 * labeled alternative in {@link OCLfoParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassID(OCLfoParser.ClassIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssoClassID}
	 * labeled alternative in {@link OCLfoParser#assoClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssoClassID(OCLfoParser.AssoClassIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FAssoClassID}
	 * labeled alternative in {@link OCLfoParser#fAssoClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFAssoClassID(OCLfoParser.FAssoClassIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NfAssoClassID}
	 * labeled alternative in {@link OCLfoParser#nfAssoClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNfAssoClassID(OCLfoParser.NfAssoClassIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RoleID}
	 * labeled alternative in {@link OCLfoParser#role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleID(OCLfoParser.RoleIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRoleID}
	 * labeled alternative in {@link OCLfoParser#fRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRoleID(OCLfoParser.FRoleIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NfRoleID}
	 * labeled alternative in {@link OCLfoParser#nfRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNfRoleID(OCLfoParser.NfRoleIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrID}
	 * labeled alternative in {@link OCLfoParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrID(OCLfoParser.AttrIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BAttrID}
	 * labeled alternative in {@link OCLfoParser#bAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBAttrID(OCLfoParser.BAttrIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FAttrID}
	 * labeled alternative in {@link OCLfoParser#fAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFAttrID(OCLfoParser.FAttrIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NfAttrID}
	 * labeled alternative in {@link OCLfoParser#nfAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNfAttrID(OCLfoParser.NfAttrIDContext ctx);
}