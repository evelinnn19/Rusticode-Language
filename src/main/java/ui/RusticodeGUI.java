package ui;

import java.awt.Font;
import java.util.HashMap;
import javax.swing.*;
import language.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class RusticodeGUI extends JFrame {
    private static RusticodeGUI instance;
    private JTextArea inTextArea;
    private JTextArea outTextArea;
    private JButton runButton;

    private RusticodeGUI() {
        initComponents();
        setupFonts();
        inTextArea.setLineWrap(true);
        outTextArea.setLineWrap(true);
    }

    public static RusticodeGUI getInstance() {
        if (instance == null) {
            instance = new RusticodeGUI();
        }
        return instance;
    }

    private void initComponents() {
        // Inicialización de componentes
        JPanel jPanel = new JPanel();
        JScrollPane inputScrollPane = new JScrollPane();
        JScrollPane outputScrollPane = new JScrollPane();
        JLabel sourceLabel = new JLabel("Source Code");
        JLabel outputLabel = new JLabel("Output");
        runButton = new JButton("Execute");

        inTextArea = new JTextArea(20, 40);
        outTextArea = new JTextArea(20, 40);
        outTextArea.setEnabled(false); // Solo lectura

        // Configuración de la ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rusticode Compiler");
        setResizable(false);

        // Configuración del panel
        jPanel.setLayout(null);
        sourceLabel.setBounds(10, 10, 100, 25);
        inputScrollPane.setBounds(10, 30, 270, 330);
        outputScrollPane.setBounds(292, 30, 270, 360);
        runButton.setBounds(10, 370, 270, 30);
        outputLabel.setBounds(292, 10, 100, 25);

        inputScrollPane.setViewportView(inTextArea);
        outputScrollPane.setViewportView(outTextArea);

        // Agregar componentes al panel
        jPanel.add(sourceLabel);
        jPanel.add(outputLabel);
        jPanel.add(inputScrollPane);
        jPanel.add(outputScrollPane);
        jPanel.add(runButton);

        // Agregar panel a la ventana
        getContentPane().add(jPanel);
        setSize(580, 440);
        setLocationRelativeTo(null);

        // Acción del botón
        runButton.addActionListener(evt -> runButtonActionPerformed(evt));
    }

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {
        outTextArea.setText("");
        String inputText = inTextArea.getText();

        try {
            CharStream input = CharStreams.fromString(inputText);
            RusticodeLexer lexer = new RusticodeLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RusticodeParser parser = new RusticodeParser(tokens);

            RusticodeParser.ProgramContext tree = parser.program();

            // Manejo de errores de análisis
            if (parser.getNumberOfSyntaxErrors() > 0) {
                appendOutput("Se encontraron errores de sintaxis.\n");
                return;  // Salir si hay errores de análisis
            }

            HashMap<String, Object> symbolTable = new HashMap<>();
            RusticodeCustomVisitor visitor = new RusticodeCustomVisitor();
            visitor.visit(tree);

            // Ejecutar los statements
            for (RusticodeParser.SentenceContext stmt : tree.sentence()) {
                if (stmt.node != null) {
                    stmt.node.execute(symbolTable);
                }
            }

        } catch (Exception e) {
            appendOutput("Error: " + e.getMessage() + "\n");
            e.printStackTrace();
        }
    }

    private void setupFonts() {
        Font font = new Font("Consolas", Font.PLAIN, 11);
        outTextArea.setFont(font);
        inTextArea.setFont(font);
    }

    public void appendOutput(String text) {
        outTextArea.append(text);
    }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            RusticodeGUI.getInstance().setVisible(true);
        });
    }
}
