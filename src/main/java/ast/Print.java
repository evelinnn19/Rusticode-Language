package ast;

import ui.GUIRusticode;
import java.util.HashMap;

public class Print implements ASTNode {
    private ASTNode data;

    public Print(ASTNode data) {
        this.data = data;
    }

    public ASTNode getData() {
        return data;
    }

    @Override
    public Object execute(HashMap<String, Object> Table) {
            String msg = String.valueOf(data.execute(Table));
            msg = msg.replaceAll("\"", "");
            GUIRusticode.getInstance().appendOutput(msg);
            return null;
    }
}