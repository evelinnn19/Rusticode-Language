package ast;

import java.util.HashMap;
import java.util.Map;

public class BooleanLiteral implements ASTNode{
    private String value;

    public BooleanLiteral(String value) {
        this.value = value;
    }


    @Override
    public Object execute(HashMap<String, Object> Table) {
        return null;
    }
}
