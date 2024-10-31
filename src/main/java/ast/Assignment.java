package ast;

import java.util.List;
import java.util.Map;

public class Assignment extends ASTNode {
    private String id;
    private ASTNode expression;

    public Assignment(String id, ASTNode expression) {
        this.id = id;
        this.expression = expression;
    }

    public ASTNode getExpression() {
        return expression;
    }

    public void setExpression(ASTNode expression) {
        this.expression = expression;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object accept(ASTVisitor visitor) {
        return visitor.visitAssignment(this);
    }
}
