package ui;

import language.RusticodeCustomVisitor;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import language.RusticodeLexer;
import language.RusticodeParser;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUIRusticode extends JFrame {
    private static GUIRusticode instance;
    private JTextArea inTextArea;
    private JTextPane outTextArea;
    private JButton runButton;
    private JPanel treePanel;
    private JSplitPane outputSplitPane;
    private HashMap<String, Object> tabla;
    private TreeViewer treeViewer;
    private JSlider treeScaleSlider;

    private GUIRusticode() {
        initComponents();
        setupFonts();
        inTextArea.setLineWrap(true);
        outTextArea.setEditable(false);
    }

    public static GUIRusticode getInstance() {
        if (GUIRusticode.instance == null) {
            GUIRusticode.instance = new GUIRusticode();
        }
        return GUIRusticode.instance;
    }

    private void initComponents() {
        // Panel principal con BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Panel izquierdo para el código fuente
        JPanel leftPanel = new JPanel(new BorderLayout(5, 5));
        JLabel sourceLabel = new JLabel("Código fuente");
        inTextArea = new JTextArea(20, 25);
        JScrollPane sourceScrollPane = new JScrollPane(inTextArea);
        leftPanel.add(sourceLabel, BorderLayout.NORTH);
        leftPanel.add(sourceScrollPane, BorderLayout.CENTER);
        inTextArea.append("start:\n\t\nend");

        // Panel derecho dividido para salida y árbol
        JPanel rightPanel = new JPanel(new BorderLayout(5, 5));
        outTextArea = new JTextPane();
        JScrollPane outScrollPane = new JScrollPane(outTextArea);

        // Inicializar el panel del árbol y slider de escala
        treePanel = new JPanel(new BorderLayout());
        treeScaleSlider = new JSlider(1, 300, 150); // Escala entre 1x y 3x
        treeScaleSlider.addChangeListener(e -> {
            if (treeViewer != null) {
                treeViewer.setScale(treeScaleSlider.getValue() / 100.0); // Ajustar escala
                treePanel.revalidate();
                treePanel.repaint();
            }
        });


        // Crear JSplitPane vertical para salida y árbol
        outputSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, outScrollPane, treePanel);
        outputSplitPane.setResizeWeight(0.5);

        JLabel outputLabel = new JLabel("Salida y Árbol de Análisis");
        rightPanel.add(outputLabel, BorderLayout.NORTH);
        rightPanel.add(outputSplitPane, BorderLayout.CENTER);

        // Panel principal dividido
        JSplitPane mainSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
        mainSplitPane.setResizeWeight(0.5);

        // Panel para el botón y slider de escala
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        runButton = new JButton("Ejecutar");
        runButton.addActionListener(evt -> runButtonActionPerformed());
        buttonPanel.add(runButton);
        buttonPanel.add(new JLabel("Escala del árbol:"));
        buttonPanel.add(treeScaleSlider);

        // Agregar todo al panel principal
        mainPanel.add(mainSplitPane, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Configurar el frame
        add(mainPanel);
        setTitle("Rusticode Compiler");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        setIconImage(tk.getImage("src/media/icon.png"));
    }

    private void actualizarArbol(RusticodeParser.ProgramContext parseTree, RusticodeParser parser) {
        treePanel.removeAll(); // Limpiar el árbol anterior

        // Crear TreeViewer con las reglas del parser y el árbol generado
        treeViewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), parseTree);
        treeViewer.setScale(treeScaleSlider.getValue() / 100.0); // Ajustar escala según el slider

        // Agregar TreeViewer al panel del árbol
        treePanel.add(treeViewer, BorderLayout.CENTER);
        treePanel.revalidate();
        treePanel.repaint();
    }

    private void runButtonActionPerformed() {
        outTextArea.setText("");  // Limpiar área de salida

        try {
            appendToOutput("Iniciando ejecución...", Color.BLACK);

            // Crear flujo de caracteres de entrada desde el panel de texto
            CharStream codePointCharStream = CharStreams.fromString(inTextArea.getText());

            Logger logger = Logger.getLogger(GUIRusticode.class.getName());
            logger.setLevel(Level.ALL);

            RusticodeLexer lexer = new RusticodeLexer(codePointCharStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RusticodeParser parser = new RusticodeParser(tokens);

            tabla = new HashMap<>();
            RusticodeParser.ProgramContext tree = parser.program();

            // Actualizar el árbol visual
            actualizarArbol(tree, parser);

            // Crear un visitante personalizado y visitar el árbol
            RusticodeCustomVisitor visitor = new RusticodeCustomVisitor();
            visitor.visit(tree);

            tree.sentence().forEach(statement -> statement.node.execute(tabla));

            // Confirmación de finalización de la ejecución
            appendToOutput("Ejecución finalizada correctamente", new Color(0, 128, 0));

        } catch (Exception e) {
            appendToOutput("Error: " + e.getMessage(), Color.RED);
        }
    }

    private void setupFonts() {
        Font font = new Font("Consolas", Font.PLAIN, 16);
        outTextArea.setFont(font);
        inTextArea.setFont(font);
    }

    public void appendOutput(String output) {
        appendToOutput(output, Color.BLACK); // Agrega el texto en negro por defecto
    }

    private void appendToOutput(String message, Color color) {
        // Agregar texto con color específico al JTextPane
        outTextArea.setEditable(true);
        StyleContext sc = StyleContext.getDefaultStyleContext();
        javax.swing.text.AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, color);

        int len = outTextArea.getDocument().getLength();
        outTextArea.setCaretPosition(len);
        outTextArea.setCharacterAttributes(aset, false);
        outTextArea.replaceSelection(message + "\n");
        outTextArea.setEditable(false);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> GUIRusticode.getInstance().setVisible(true));
    }
}