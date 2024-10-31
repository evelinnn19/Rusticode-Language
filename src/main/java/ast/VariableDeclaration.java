package ast;

import java.util.Map;

public class VariableDeclaration extends ASTNode {
    private String type;
    private String id;
    private ASTNode expression;

    public VariableDeclaration(String type, String id, ASTNode expression) {
        this.type = type;
        this.id = id;
        this.expression = expression;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ASTNode getExpression() {
        return expression;
    }

    public void setExpression(ASTNode expression) {
        this.expression = expression;
    }

    @Override
    public Object accept(ASTVisitor visitor) {
        return visitor.visitVariableDeclaration(this);
    }



}
