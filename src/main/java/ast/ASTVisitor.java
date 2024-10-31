package ast;

import org.springframework.validation.ObjectError;

public interface ASTVisitor {
    Object visitVariableDeclaration(VariableDeclaration node);
    Object visitAssignment(Assignment node);
    Object visitLogicalExpression(LogicalExpression node);
    Object visitComparativeExpression(ComparativeExpression node);
    Object visitArithmeticExpression(ArithmeticExpression node);
    Object visitNumberLiteral(NumberLiteral node);
    Object visitStringLiteral(StringLiteral node);
    Object visitBooleanLiteral(BooleanLiteral node);
    Object visitVariable(Variable node);
    Object visitIf(If node);
    Object visitWhile(While node);
    Object visitPrint(Print node);
    Object visitProgram(Program node);
}
