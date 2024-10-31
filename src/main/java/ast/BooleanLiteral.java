package ast;

import java.util.Map;

public class BooleanLiteral extends ASTNode{
    private String value;

    public BooleanLiteral(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public Object accept(ASTVisitor visitor) {
        return visitor.visitBooleanLiteral(this);
    }
}
