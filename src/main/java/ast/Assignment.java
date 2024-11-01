package ast;

import java.util.HashMap;

public class Assignment implements ASTNode {
    private String id;
    private ASTNode expression;

    public Assignment(String id, ASTNode expression) {
        super();
        this.id = id;
        this.expression = expression;
    }

    public ASTNode getExpression() {
        return expression;
    }

    public String getId() {
        return id;
    }

    @Override
    public Object execute(HashMap<String, Object> Table) {
        Table.put(id, expression.execute(Table));
        return null;
    }
}
