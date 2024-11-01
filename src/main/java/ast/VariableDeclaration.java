package ast;

import java.util.HashMap;

public class VariableDeclaration implements ASTNode {
    private String type;
    private String id;
    private ASTNode expression;

    public VariableDeclaration(String type, String id, ASTNode expression) {
        this.type = type;
        this.id = id;
        this.expression = expression;
    }


    @Override
    public Object execute(HashMap<String, Object> Table) {
        Object value = null;

        // Si hay una expresión, se evalúa
        if (expression != null) {
            value = expression.execute(Table);
        }

        // Se guarda la variable en la tabla de símbolos
        Table.put(id, value);

        return null;
    }
}
