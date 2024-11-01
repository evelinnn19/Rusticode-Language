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
	 * Enter a parse tree produced by {@link RusticodeParser#info}.
	 * @param ctx the parse tree
	 */
	void enterInfo(RusticodeParser.InfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RusticodeParser#info}.
	 * @param ctx the parse tree
	 */
	void exitInfo(RusticodeParser.InfoContext ctx);
}