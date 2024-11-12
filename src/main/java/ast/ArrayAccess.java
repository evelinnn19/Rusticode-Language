package ast;

import java.util.HashMap;
import java.util.List;

public class ArrayAccess implements ASTNode {
    private String arrayName;  // Nombre del arreglo
    private ASTNode index;  // Expresión para el índice

    public ArrayAccess(String arrayName, ASTNode index) {
        this.arrayName = arrayName;
        this.index = index;
    }

    @Override
    public Object execute(HashMap<String, Object> table) {
        // Evaluar el índice
        Object evaluatedIndex = index.execute(table);
        if (!(evaluatedIndex instanceof Double)) {
            throw new RuntimeException("El índice debe ser un número.");
        }

        int idx = ((Double) evaluatedIndex).intValue();  // Convertir a entero

        // Obtener el arreglo de la tabla de símbolos
        Object array = table.get(arrayName);
        if (!(array instanceof List<?>)) {
            throw new RuntimeException("La variable " + arrayName + " no es un arreglo.");
        }

        List<?> arrayList = (List<?>) array;

        // Validar que el índice esté dentro de los límites
        if (idx < 0 || idx >= arrayList.size()) {
            throw new RuntimeException("Índice fuera de rango.");
        }

        return arrayList.get(idx);  // Devolver el elemento del arreglo en el índice especificado
    }

    public String getArrayName() {
        return arrayName;
    }

    public ASTNode getIndex() {
        return index;
    }
}
