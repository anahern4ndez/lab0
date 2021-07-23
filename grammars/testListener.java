// Generated from test.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(testParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(testParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#vardeclr}.
	 * @param ctx the parse tree
	 */
	void enterVardeclr(testParser.VardeclrContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#vardeclr}.
	 * @param ctx the parse tree
	 */
	void exitVardeclr(testParser.VardeclrContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#field_declr}.
	 * @param ctx the parse tree
	 */
	void enterField_declr(testParser.Field_declrContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#field_declr}.
	 * @param ctx the parse tree
	 */
	void exitField_declr(testParser.Field_declrContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#array_id}.
	 * @param ctx the parse tree
	 */
	void enterArray_id(testParser.Array_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#array_id}.
	 * @param ctx the parse tree
	 */
	void exitArray_id(testParser.Array_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#field_var}.
	 * @param ctx the parse tree
	 */
	void enterField_var(testParser.Field_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#field_var}.
	 * @param ctx the parse tree
	 */
	void exitField_var(testParser.Field_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#var_id}.
	 * @param ctx the parse tree
	 */
	void enterVar_id(testParser.Var_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#var_id}.
	 * @param ctx the parse tree
	 */
	void exitVar_id(testParser.Var_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#method_declr}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declr(testParser.Method_declrContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#method_declr}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declr(testParser.Method_declrContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(testParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(testParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(testParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(testParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(testParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(testParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#method_call_inter}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call_inter(testParser.Method_call_interContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#method_call_inter}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call_inter(testParser.Method_call_interContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(testParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(testParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(testParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(testParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(testParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(testParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void enterCallout_arg(testParser.Callout_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void exitCallout_arg(testParser.Callout_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(testParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(testParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(testParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(testParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(testParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(testParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(testParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(testParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(testParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(testParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(testParser.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(testParser.Bin_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(testParser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(testParser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(testParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(testParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(testParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(testParser.Assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#method_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_name(testParser.Method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#method_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_name(testParser.Method_nameContext ctx);
}