package ast;

import java.util.Map;

public class NumberLiteral extends ASTNode{

    private String value;

    public NumberLiteral(String value) {
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
        return visitor.visitNumberLiteral(this);
    }
}
