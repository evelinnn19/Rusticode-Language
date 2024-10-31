package ast;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Program extends ASTNode{
    private List<ASTNode> statements;

    public Program(List<ASTNode> statements) {
        this.statements = statements;
    }

    public List<ASTNode> getStatements() {
        return statements;
    }

    @Override
    public Object accept(ASTVisitor visitor) {
        return visitor.visitProgram(this);
    }
}
