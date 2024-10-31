package ast;

import java.util.Map;

public class Variable extends  ASTNode{
    private String name;

    public Variable(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object accept(ASTVisitor visitor) {
        return visitor.visitVariable(this);
    }
}
