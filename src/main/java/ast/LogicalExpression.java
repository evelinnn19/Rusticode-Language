package ast;

import java.util.Map;

public class LogicalExpression extends ASTNode{
    private String operator;
    private ASTNode left;
    private ASTNode right;

    public LogicalExpression(String operator, ASTNode left, ASTNode right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    public ASTNode getLeft() {
        return left;
    }

    public void setLeft(ASTNode left) {
        this.left = left;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public ASTNode getRight() {
        return right;
    }

    public void setRight(ASTNode right) {
        this.right = right;
    }

    @Override
    public Object accept(ASTVisitor visitor) {
        return visitor.visitLogicalExpression(this);
    }
}
