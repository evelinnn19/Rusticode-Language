import ast.Program;
import ast.RusticodeCustomVisitor;
import language.*;
import ast.ASTNode;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class Main {
    private static final String FILE_NAME = "test.smp";
    private static final String FOLDER_NAME = "./src/test";

    public static void main(String[] args) {
        try {
            // Obtener la ruta completa del archivo
            String projectRoot = System.getProperty("user.dir");
            String filePath = Paths.get(projectRoot, FOLDER_NAME, FILE_NAME).toString();

            // Verificar si el archivo existe
            if (!Files.exists(Paths.get(filePath))) {
                throw new IOException("El archivo no existe: " + filePath);
            }

            // Leer el contenido del archivo
            String content = new String(Files.readAllBytes(Paths.get(filePath)));

            // Crear el lexer y el parser
            RusticodeLexer lexer = new RusticodeLexer(CharStreams.fromString(content));
            RusticodeParser parser = new RusticodeParser(new CommonTokenStream(lexer));

            // Obtener el nodo raíz del AST
            Program root = (Program) parser.program().node;

            // Ejecutar el AST con el visitor
            RusticodeCustomVisitor visitor = new RusticodeCustomVisitor();
            visitor.visitProgram(root);

            // Ejecutar el AST
            if (root != null) {
                visitor.visitProgram(root); // Llamar al visitor en el nodo Program
            } else {
                System.err.println("Error: el nodo raíz es null.");
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
