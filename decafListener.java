// Generated from decaf.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link decafParser}.
 */
public interface decafListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link decafParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(decafParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(decafParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(decafParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(decafParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(decafParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(decafParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(decafParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(decafParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(decafParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(decafParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#varId}.
	 * @param ctx the parse tree
	 */
	void enterVarId(decafParser.VarIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#varId}.
	 * @param ctx the parse tree
	 */
	void exitVarId(decafParser.VarIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(decafParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(decafParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(decafParser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(decafParser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(decafParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(decafParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(decafParser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(decafParser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(decafParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(decafParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(decafParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(decafParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(decafParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(decafParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(decafParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(decafParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(decafParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(decafParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(decafParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(decafParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(decafParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(decafParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(decafParser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(decafParser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(decafParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(decafParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(decafParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(decafParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(decafParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(decafParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(decafParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(decafParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(decafParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(decafParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(decafParser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(decafParser.Char_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(decafParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(decafParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(decafParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(decafParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link decafParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(decafParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link decafParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(decafParser.MethodNameContext ctx);
}