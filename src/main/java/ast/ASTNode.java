package ast;


import java.util.HashMap;


public interface ASTNode {
    /*
    *   Metodo que utiliza la tabla de simbolos para acceder o almacenar valores
    *   y realizar operaciones.
    */
    public Object execute(HashMap<String, Object> Table);

}
