package ast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public abstract class ASTNode {
    public abstract Object accept(ASTVisitor visitor);

}
