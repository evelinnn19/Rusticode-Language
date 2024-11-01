package ui;

import java.awt.Font;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import language.*;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import javax.swing.*;

public class GUIRusticode extends JFrame {

    private static GUIRusticode instance;
    private JTextArea inTextArea;
    private JTextArea outTextArea;
    private JButton runButton;

    private GUIRusticode() {
        initComponents();
        setupFonts();
        inTextArea.setLineWrap(true);
        outTextArea.setLineWrap(true);
    }

    public static GUIRusticode getInstance() {
        if (GUIRusticode.instance == null) {
            GUIRusticode.instance = new GUIRusticode();
        }
        return GUIRusticode.instance;
    }

    private void initComponents() {
        JPanel jPanel = new JPanel();
        JScrollPane jScrollPane1 = new JScrollPane();
        JScrollPane jScrollPane2 = new JScrollPane();

        outTextArea = new JTextArea(20, 25);
        outTextArea.setEnabled(false);
        jScrollPane1.setViewportView(outTextArea);

        inTextArea = new JTextArea(20, 25);
        jScrollPane2.setViewportView(inTextArea);

        JLabel jLabel1 = new JLabel("Código fuente");
        JLabel jLabel2 = new JLabel("Salida");

        runButton = new JButton("Ejecutar");
        runButton.addActionListener(evt -> runButtonActionPerformed());

        jPanel.add(jLabel1);
        jPanel.add(jScrollPane2);
        jPanel.add(jLabel2);
        jPanel.add(jScrollPane1);
        jPanel.add(runButton);

        add(jPanel);
        setTitle("Rusticode Compiler");
        setSize(600, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void runButtonActionPerformed() {
        outTextArea.setText("");
        CharStream codePointCharStream = CharStreams.fromString(inTextArea.getText());

        Logger logger = Logger.getLogger(GUIRusticode.class.getName());
        logger.setLevel(Level.ALL);

        RusticodeLexer lexer = new RusticodeLexer(codePointCharStream);


        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RusticodeParser parser = new RusticodeParser(tokens);

       
        HashMap<String, Object> tabla = new HashMap<>();
        RusticodeParser.ProgramContext tree = parser.program();

        RusticodeCustomVisitor visitor = new RusticodeCustomVisitor();
        visitor.visit(tree);

    

        tree.sentence().forEach(statement -> statement.node.execute(tabla));
    }

    private void setupFonts() {
        Font font = new Font("Consolas", Font.PLAIN, 11);
        outTextArea.setFont(font);
        inTextArea.setFont(font);
    }

    public void appendOutput(Object obj) {
        outTextArea.append(obj.toString());
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> GUIRusticode.getInstance().setVisible(true));
    }
}
