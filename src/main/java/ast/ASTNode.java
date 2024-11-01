package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public interface ASTNode {
    public Object execute(HashMap<String, Object> Table);

}
