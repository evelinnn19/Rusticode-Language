package ast;

import java.util.HashMap;

public class Constant implements ASTNode{
    private Object value;

    public Constant(Object value) {
        this.value = value;
    }

    public Double getValue() {
        return (Double) value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public Object execute(HashMap<String, Object> Table) {
        if (Table.containsKey(String.valueOf(value))) {
            return ((Constant) Table.get(value)).value;
        }
        return value;
    }
}
