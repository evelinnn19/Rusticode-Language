package ast;

import java.util.List;
import java.util.Map;

public class Print extends ASTNode{
    private ASTNode data;

    public Print(ASTNode data) {
        super();
        this.data = data;
    }

    public ASTNode getData() {
        return data;
    }

    public void setData(ASTNode data) {
        this.data = data;
    }

    @Override
    public Object accept(ASTVisitor visitor) {
        return visitor.visitPrint(this);
    }
}
