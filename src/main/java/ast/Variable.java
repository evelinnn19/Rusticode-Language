package ast;

import java.util.HashMap;


public class Variable implements ASTNode{
    private String name;

    public Variable(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Object execute(HashMap<String, Object> Table) {
        Object o = Table.get(name);
        if(o instanceof Constant)
            return ((Constant) Table.get(name)).execute(Table);
        else if (o == null)
            return 0;
        return o;
    }
}
