package testers;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import language.*;
import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestSemantic {

    private JTextArea outTextArea = new JTextArea();
    private JPanel treePanel = new JPanel();

    public TestSemantic() {
        // Configurar la GUI del tester
        JFrame frame = new JFrame("Tester de Árbol Semántico de Rusticode");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Configurar el panel de salida de texto
        JScrollPane scrollPane = new JScrollPane(outTextArea);
        frame.add(scrollPane, BorderLayout.SOUTH);
        frame.add(treePanel, BorderLayout.CENTER);

        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    public void runTest(String code) {
        try {
            outTextArea.setText("");
            outTextArea.setForeground(Color.BLACK);

            // Paso 1: Crear el lexer y el parser
            CharStream codePointCharStream = CharStreams.fromString(code);
            Logger logger = Logger.getLogger(TestSemantic.class.getName());
            logger.setLevel(Level.ALL);

            RusticodeLexer lexer = new RusticodeLexer(codePointCharStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RusticodeParser parser = new RusticodeParser(tokens);

            // Crear la tabla de símbolos
            HashMap<String, Object> tabla = new HashMap<>();

            // Paso 2: Parsear el código y generar el árbol de sintaxis abstracto
            RusticodeParser.ProgramContext tree = parser.program();

            // Paso 3: Visualizar el árbol en el panel de la interfaz
            actualizarArbol(tree, parser);

            // Paso 4: Ejecutar el visitor y procesar el árbol
            RusticodeCustomVisitor visitor = new RusticodeCustomVisitor();
            visitor.visit(tree);

            // Paso 5: Ejecutar las sentencias en el contexto
            tree.sentence().forEach(statement -> statement.node.execute(tabla));

            // Mostrar mensaje de finalización en el área de salida
            outTextArea.append("Ejecución finalizada correctamente\n");

        } catch (Exception e) {
            // Mostrar el mensaje de error en el área de salida
            outTextArea.append("Error durante la ejecución: " + e.getMessage() + "\n");
        }
    }

    private void actualizarArbol(ParseTree tree, RusticodeParser parser) {
        // Limpiar el panel de árbol actual
        treePanel.removeAll();

        // Configurar el TreeViewer con el árbol generado
        TreeViewer treeViewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        treeViewer.setScale(1.5); // Ajustar la escala del árbol

        // Agregar el TreeViewer al panel de árbol
        treePanel.add(treeViewer);

        // Actualizar la interfaz gráfica
        treePanel.revalidate();
        treePanel.repaint();
    }

    public static void main(String[] args) {
        TestSemantic tester = new TestSemantic();

        // Código de prueba
        String testCode = "start:\n" +
                "\tx = 20;\n" +
                "\ty = 7;\n" +
                "\tz = 1;\n" +
                "while (x > y) {\n" +
                "\tif(x == y){\n" +
                "\tz = 0;\n" +
                "}else{\n" +
                "\tz = 3;\n" +
                "}\n" +
                "\ty = z + 1;\n" +
                "}\n" +
                "print(y);\n" +
                "end\n";

        // Ejecutar el test
        tester.runTest(testCode);
    }
}