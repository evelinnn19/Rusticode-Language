package ast;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayAssignment implements ASTNode {
    private String id;
    private ASTNode index;
    private ASTNode expression;

    public ArrayAssignment(String id, ASTNode index, ASTNode expression) {
        this.id = id;
        this.index = index;
        this.expression = expression;
    }

    @Override
    public Object execute(HashMap<String, Object> Table) {
        Object arrayObj = Table.get(id);
        if (!(arrayObj instanceof ArrayList)) {
            throw new RuntimeException("El identificador " + id + " no es un arreglo.");
        }

        ArrayList<Object> array = (ArrayList<Object>) arrayObj;
        int idx = (int) index.execute(Table);
        if (idx < 0 || idx >= array.size()) {
            throw new RuntimeException("Índice fuera de rango.");
        }

        array.set(idx, expression.execute(Table));
        return null;
    }
}
