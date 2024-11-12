package ast;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayAccess implements ASTNode {
    private String id;
    private ASTNode index;

    public ArrayAccess(String id, ASTNode index) {
        this.id = id;
        this.index = index;
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

        return array.get(idx);
    }
}
