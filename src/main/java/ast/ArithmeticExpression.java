package ast;

import java.util.HashMap;

public class ArithmeticExpression implements ASTNode {

    private String operator;
    private ASTNode op1;
    private ASTNode op2;

    public ArithmeticExpression(String operator, ASTNode op1, ASTNode op2) {
        super();
        this.operator = operator;
        this.op1 = op1;
        this.op2 = op2;
    }

    public ASTNode getOp1() {
        return op1;
    }

    public ASTNode getOp2() {
        return op2;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public Object execute(HashMap<String, Object> Table) {
        switch(operator) {
            case "+":
                return (Double) op1.execute(Table) + (Double) op2.execute(Table);
            case "-":
                return (Double) op1.execute(Table) - (Double) op2.execute(Table);
            case "*":
                return (Double) op1.execute(Table) * (Double) op2.execute(Table);
            case "/":
                return (Double) op1.execute(Table) / (Double) op2.execute(Table);
        }
        return null;
    }
}

