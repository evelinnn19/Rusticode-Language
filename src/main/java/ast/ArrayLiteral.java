package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayLiteral implements ASTNode {
    private List<ASTNode> elements;

    public ArrayLiteral(List<ASTNode> elements) {
        this.elements = elements;
    }

    @Override
    public Object execute(HashMap<String, Object> Table) {
        ArrayList<Object> array = new ArrayList<>();
        for (ASTNode element : elements) {
            array.add(element.execute(Table));
        }
        return array;
    }
}
