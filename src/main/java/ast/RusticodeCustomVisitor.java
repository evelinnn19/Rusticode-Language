package ast;

import language.RusticodeBaseVisitor;
import language.RusticodeParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RusticodeCustomVisitor implements ASTVisitor {

    private Map<String, Object> symbolTable = new HashMap<>();

    @Override
    public Object visitVariableDeclaration(VariableDeclaration node) {
        Object value = node.getExpression() != null ? node.getExpression().accept(this) : null;
        symbolTable.put(node.getId(), value);
        return value;
    }

    @Override
    public Object visitAssignment(Assignment node) {
        Object value = node.getExpression().accept(this);
        symbolTable.put(node.getId(), value);
        return value;
    }

    @Override
    public Object visitLogicalExpression(LogicalExpression node) {
        Boolean left = (Boolean) node.getLeft().accept(this);
        Boolean right = (Boolean) node.getRight().accept(this);

        switch (node.getOperator()) {
            case "&&": return left && right;
            case "||": return left || right;
            default: throw new RuntimeException("Unknown logical operator: " + node.getOperator());
        }
    }

    @Override
    public Object visitComparativeExpression(ComparativeExpression node) {
        Double left = (Double) node.getLeft().accept(this);
        Double right = (Double) node.getRight().accept(this);

        switch (node.getOperator()) {
            case ">": return left > right;
            case "<": return left < right;
            case ">=": return left >= right;
            case "<=": return left <= right;
            case "==": return left.equals(right);
            case "!=": return !left.equals(right);
            default: throw new RuntimeException("Unknown comparison operator: " + node.getOperator());
        }
    }

    @Override
    public Object visitArithmeticExpression(ArithmeticExpression node) {
        Double left = (Double) node.getLeft().accept(this);
        Double right = (Double) node.getRight().accept(this);

        switch (node.getOperator()) {
            case "+": return left + right;
            case "-": return left - right;
            case "*": return left * right;
            case "/": return right != 0 ? left / right : 0; // Handle division by zero
            default: throw new RuntimeException("Unknown arithmetic operator: " + node.getOperator());
        }
    }

    @Override
    public Object visitNumberLiteral(NumberLiteral node) {
        return Double.parseDouble(node.getValue());
    }

    @Override
    public Object visitStringLiteral(StringLiteral node) {
        return node.getValue();
    }

    @Override
    public Object visitBooleanLiteral(BooleanLiteral node) {
        return Boolean.parseBoolean(node.getValue());
    }

    @Override
    public Object visitVariable(Variable node) {
        if (!symbolTable.containsKey(node.getName())) {
            throw new RuntimeException("Variable not defined: " + node.getName());
        }
        return symbolTable.get(node.getName());
    }

    @Override
    public Object visitIf(If node) {
        Boolean condition = (Boolean) node.getCondition().accept(this);
        if (condition) {
            for (ASTNode stmt : node.getIfbody()) {
                stmt.accept(this);
            }
        } else {
            for (ASTNode stmt : node.getElsebody()) {
                stmt.accept(this);
            }
        }
        return null;
    }

    @Override
    public Object visitWhile(While node) {
        while ((Boolean) node.getCondition().accept(this)) {
            for (ASTNode stmt : node.getWhilebody()) {
                stmt.accept(this);
            }
        }
        return null;
    }

    @Override
    public Object visitPrint(Print node) {
        ASTNode dataNode = node.getData();
        if (dataNode != null) {
            Object value = dataNode.accept(this); // Invocar solo si dataNode no es null
            System.out.println(value);
            return value;
        } else {
            System.err.println("Error: dataNode es null en Print."); // Manejo del error
            return null; // Retornar null o un valor por defecto
        }
    }

    @Override
    public Object visitProgram(Program node) {
        for (ASTNode statement : node.getStatements()) {
            statement.accept(this); // Visitar cada instrucción
        }
        return null;
    }
}
