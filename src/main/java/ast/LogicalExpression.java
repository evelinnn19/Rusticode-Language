package ast;

import java.util.HashMap;

public class LogicalExpression implements ASTNode{

    private ASTNode op1;
    private ASTNode op2;
    public String op;

    public LogicalExpression(String op, ASTNode op1, ASTNode op2) {
        super();
        this.op1 = op1;
        this.op2 = op2;
        this.op = op;
    }

    public ASTNode getOp1() {
        return op1;
    }

    public ASTNode getOp2() {
        return op2;
    }

    public String getOp() {
        return op;
    }

    @Override
    public Object execute(HashMap<String, Object> Table) {

        if (op2 == null)
            return !(Boolean) op1.execute(Table);

        switch (op) {
            case "&&":
                return (Boolean) op1.execute(Table) && (Boolean) op2.execute(Table);
            case "||":
                return (Boolean) op1.execute(Table) || (Boolean) op2.execute(Table);
        }
        return null;
    }
}
