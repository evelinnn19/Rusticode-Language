package ast;

import java.util.ArrayList;
import java.util.Map;

public class If extends ASTNode{
    private ASTNode condition;
    private ArrayList<ASTNode> ifbody;
    private ArrayList<ASTNode> elsebody;


    public If(ASTNode condition, ArrayList<ASTNode> ifbody, ArrayList<ASTNode> elsebody) {

        this.condition = condition;
        this.ifbody = ifbody;
        this.elsebody = elsebody;
    }

    public ASTNode getCondition() {
        return condition;
    }

    public void setCondition(ASTNode condition) {
        this.condition = condition;
    }

    public ArrayList<ASTNode> getElsebody() {
        return elsebody;
    }

    public void setElsebody(ArrayList<ASTNode> elsebody) {
        this.elsebody = elsebody;
    }

    public ArrayList<ASTNode> getIfbody() {
        return ifbody;
    }

    public void setIfbody(ArrayList<ASTNode> ifbody) {
        this.ifbody = ifbody;
    }

    @Override
    public Object accept(ASTVisitor visitor) {
        return visitor.visitIf(this);
    }
}
