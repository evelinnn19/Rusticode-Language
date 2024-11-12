package ast;

import java.util.HashMap;

public class ArithmeticExpression implements ASTNode {
    private String operator;
    private ASTNode op1;
    private ASTNode op2;

    public ArithmeticExpression(String operator, ASTNode op1, ASTNode op2) {
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
    public Object execute(HashMap<String, Object> table) {
        Double val1 = (Double) op1.execute(table);
        Double val2 = (Double) op2.execute(table);

        switch (operator) {
            case "+":
                return val1 + val2;
            case "-":
                return val1 - val2;
            case "*":
                return val1 * val2;
            case "/":
                if (val2 == 0) throw new ArithmeticException("División por cero.");
                return val1 / val2;
            case "%":
                return val1 % val2;
            default:
                throw new RuntimeException("Operador desconocido: " + operator);
        }
    }
}
