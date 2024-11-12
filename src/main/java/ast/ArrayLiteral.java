package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayLiteral implements ASTNode {
    private List<ASTNode> elements;  // Lista de elementos en el arreglo

    public ArrayLiteral(List<ASTNode> elements) {
        this.elements = elements;
    }

    @Override
    public Object execute(HashMap<String, Object> table) {
        List<Object> evaluatedElements = new ArrayList<>();
        for (ASTNode element : elements) {
            evaluatedElements.add(element.execute(table));  // Evaluar cada elemento
        }
        return evaluatedElements;  // Devolver la lista de elementos evaluados
    }

    public List<ASTNode> getElements() {
        return elements;
    }
}
