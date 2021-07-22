// Generated from calc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calcParser}.
 */
public interface calcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calcParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(calcParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(calcParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(calcParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(calcParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(calcParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(calcParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(calcParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(calcParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(calcParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(calcParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(calcParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(calcParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(calcParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(calcParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(calcParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(calcParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(calcParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(calcParser.IntContext ctx);
}