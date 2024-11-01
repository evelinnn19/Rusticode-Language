package ast;

import java.util.ArrayList;
import java.util.HashMap;


public class If implements ASTNode{
    private ASTNode condition;
    private ArrayList<ASTNode> ifbody;
    private ArrayList<ASTNode> elsebody;


    public If(ASTNode condition, ArrayList<ASTNode> ifbody, ArrayList<ASTNode> elsebody) {
        super();
        this.condition = condition;
        this.ifbody = ifbody;
        this.elsebody = elsebody;
    }

    @Override
    public Object execute(HashMap<String, Object> Table) {
        if (condition.execute(Table) == Boolean.TRUE) {
            for (ASTNode n : ifbody) {
                n.execute(Table);
            }
        } else {
            for (ASTNode n : elsebody) {
                n.execute(Table);
            }
        }
        return null;
    }
}
