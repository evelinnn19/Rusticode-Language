package ast;

import java.util.HashMap;
import java.util.List;

public class ArrayAssignment implements ASTNode {
    private String arrayName;  // Nombre del arreglo
    private ASTNode index;  // Expresión para el índice
    private ASTNode value;  // Valor a asignar

    public ArrayAssignment(String arrayName, ASTNode index, ASTNode value) {
        this.arrayName = arrayName;
        this.index = index;
        this.value = value;
    }

    @Override
    public Object execute(HashMap<String, Object> table) {
        // Evaluar el índice y el valor
        Object evaluatedIndex = index.execute(table);
        if (!(evaluatedIndex instanceof Double)) {
            throw new RuntimeException("El índice debe ser un número.");
        }
        int idx = ((Double) evaluatedIndex).intValue();  // Convertir a entero

        // Obtener el arreglo desde la tabla de símbolos
        Object array = table.get(arrayName);
        if (!(array instanceof List<?>)) {
            throw new RuntimeException("La variable " + arrayName + " no es un arreglo.");
        }

        List<Object> arrayList = (List<Object>) array;

        // Validar que el índice esté dentro de los límites
        if (idx < 0 || idx >= arrayList.size()) {
            throw new RuntimeException("Índice fuera de rango.");
        }

        // Asignar el valor al índice del arreglo
        Object evaluatedValue = value.execute(table);
        arrayList.set(idx, evaluatedValue);  // Actualizar el valor en el índice correspondiente
        return null;
    }

    public String getArrayName() {
        return arrayName;
    }

    public ASTNode getIndex() {
        return index;
    }

    public ASTNode getValue() {
        return value;
    }
}
