package ast;

import java.util.HashMap;

public class ArithmeticExpression implements ASTNode {

    private String operator;
    private ASTNode op1;
    private ASTNode op2;

    public ArithmeticExpression(String operator, ASTNode left, ASTNode right) {
        super();
        this.operator = operator;
        this.op1 = left;
        this.op2 = right;
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

