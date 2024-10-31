package ast;

import java.util.Map;
import java.util.ArrayList;

public class While extends ASTNode {
    private ASTNode condition;
    private ArrayList<ASTNode> whilebody;

    public While(ASTNode condition, ArrayList<ASTNode> whilebody) {
        this.condition = condition;
        this.whilebody = whilebody;
    }

    public ASTNode getCondition() {
        return condition;
    }

    public void setCondition(ASTNode condition) {
        this.condition = condition;
    }

    public ArrayList<ASTNode> getWhilebody() {
        return whilebody;
    }

    public void setWhilebody(ArrayList<ASTNode> whilebody) {
        this.whilebody = whilebody;
    }

    @Override
    public Object accept(ASTVisitor visitor) {
        return visitor.visitWhile(this);
    }
}
