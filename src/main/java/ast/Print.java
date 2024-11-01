package ast;

import ui.RusticodeGUI;
import java.util.HashMap;

public class Print implements ASTNode {
    private ASTNode data;

    public Print(ASTNode data) {
        this.data = data;
    }

    @Override
    public Object execute(HashMap<String, Object> Table) {
        String msg = String.valueOf(data.execute(Table));
        msg = msg.replaceAll("\"", "");
        RusticodeGUI.getInstance().appendOutput(msg + "\n");
        return null;
    }
}