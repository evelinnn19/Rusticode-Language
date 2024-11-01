package ui;
import javax.swing.*;
import java.awt.*;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import language.*;


public class GUIRusticode extends JFrame {
    private static GUIRusticode instance;
    private JTextArea inTextArea;
    private JTextArea outTextArea;
    private JButton runButton;
    private mxGraphComponent graphComponent;
    private JSplitPane outputSplitPane;

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

        // Panel derecho dividido para salida y árbol
        JPanel rightPanel = new JPanel(new BorderLayout(5, 5));
        outTextArea = new JTextArea(10, 25);
        outTextArea.setEnabled(false);
        JScrollPane outScrollPane = new JScrollPane(outTextArea);

        // Inicializar el componente del grafo
        mxGraph graph = new mxGraph();
        graphComponent = new mxGraphComponent(graph);

        // Crear JSplitPane vertical para salida y árbol
        outputSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
                outScrollPane,
                graphComponent);
        outputSplitPane.setResizeWeight(0.5);

        JLabel outputLabel = new JLabel("Salida y Árbol de Análisis");
        rightPanel.add(outputLabel, BorderLayout.NORTH);
        rightPanel.add(outputSplitPane, BorderLayout.CENTER);

        // Panel principal dividido
        JSplitPane mainSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                leftPanel,
                rightPanel);
        mainSplitPane.setResizeWeight(0.5);

        // Panel para el botón
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        runButton = new JButton("Ejecutar");
        runButton.addActionListener(evt -> runButtonActionPerformed());
        buttonPanel.add(runButton);

        // Agregar todo al panel principal
        mainPanel.add(mainSplitPane, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        // Configurar el frame
        add(mainPanel);
        setTitle("Rusticode Compiler");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void actualizarArbol(RusticodeParser.ProgramContext parseTree) {
        mxGraph graph = graphComponent.getGraph();
        Object parent = graph.getDefaultParent();

        // Limpiar el grafo anterior
        graph.removeCells(graph.getChildVertices(graph.getDefaultParent()));

        // Configurar estilos
        configurarEstilosGrafo(graph);

        // Crear el nuevo árbol
        Map<ParseTree, Object> vertexMap = new HashMap<>();

        graph.getModel().beginUpdate();
        try {
            crearArbol(parseTree, null, graph, parent, vertexMap);

            // Aplicar layout
            mxHierarchicalLayout layout = new mxHierarchicalLayout(graph);
            layout.setInterRankCellSpacing(50);
            layout.execute(parent);
        } finally {
            graph.getModel().endUpdate();
        }
    }

    private void configurarEstilosGrafo(mxGraph graph) {
        Map<String, Object> estilos = graph.getStylesheet().getDefaultVertexStyle();
        estilos.put("shape", "rectangle");
        estilos.put("rounded", true);
        estilos.put("strokeColor", "#666666");
        estilos.put("fillColor", "#FFFFFF");
        estilos.put("fontSize", 12);
        estilos.put("fontFamily", "Arial");

        // Estilos específicos para diferentes tipos de nodos
        Map<String, Object> estiloPrograma = new HashMap<>(estilos);
        estiloPrograma.put("fillColor", "#E1F5FE");
        graph.getStylesheet().putCellStyle("programa", estiloPrograma);

        Map<String, Object> estiloDeclaracion = new HashMap<>(estilos);
        estiloDeclaracion.put("fillColor", "#E8F5E9");
        graph.getStylesheet().putCellStyle("declaracion", estiloDeclaracion);
    }

    private void crearArbol(ParseTree nodo, Object vertexPadre, mxGraph graph,
                            Object parent, Map<ParseTree, Object> vertexMap) {
        String tipo = obtenerTipoNodo(nodo);
        String estilo = determinarEstilo(tipo);

        Object vertex = graph.insertVertex(parent, null, tipo,
                0, 0, 100, 40, estilo);
        vertexMap.put(nodo, vertex);

        if (vertexPadre != null) {
            graph.insertEdge(parent, null, "", vertexPadre, vertex);
        }

        for (int i = 0; i < nodo.getChildCount(); i++) {
            crearArbol(nodo.getChild(i), vertex, graph, parent, vertexMap);
        }
    }

    private String obtenerTipoNodo(ParseTree nodo) {
        String nombreClase = nodo.getClass().getSimpleName();
        return nombreClase.replace("Context", "");
    }

    private String determinarEstilo(String tipo) {
        if (tipo.contains("Program")) return "programa";
        if (tipo.contains("Declaration")) return "declaracion";
        return "defaultVertex";
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

        // Actualizar el árbol visual
        actualizarArbol(tree);

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