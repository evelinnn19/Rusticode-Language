// Generated from Rusticode.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RusticodeParser}.
 */
public interface RusticodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RusticodeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RusticodeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(RusticodeParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(RusticodeParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(RusticodeParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(RusticodeParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStmt(RusticodeParser.AssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStmt(RusticodeParser.AssignmentStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(RusticodeParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(RusticodeParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RusticodeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RusticodeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(RusticodeParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#logicalExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(RusticodeParser.LogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(RusticodeParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#comparisonExpr}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(RusticodeParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpr(RusticodeParser.ArithmeticExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#arithmeticExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpr(RusticodeParser.ArithmeticExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(RusticodeParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(RusticodeParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(RusticodeParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(RusticodeParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(RusticodeParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(RusticodeParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(RusticodeParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(RusticodeParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link RusticodeParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(RusticodeParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(RusticodeParser.PrintStmtContext ctx);
}