// Generated from C:/Users/carlos/IdeaProjects/rusticode-language-syncro/src/main/antlr4/Rusticode.g4 by ANTLR 4.13.2
package language;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RusticodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RusticodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(RusticodeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(RusticodeParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(RusticodeParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(RusticodeParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(RusticodeParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(RusticodeParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RusticodeParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RusticodeParser#info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfo(RusticodeParser.InfoContext ctx);
}