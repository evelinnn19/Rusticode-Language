grammar Rusticode;

@parser::header {
    import java.util.HashMap;
    import java.util.ArrayList;
    import ast.*;
}

@parser::members {
    private HashMap<String, Object> symbolTable = new HashMap<>();
}


/********************************************************************************************************/
/**
 *                                     Parser Rules
 */
/***************************************************************************************************/

program
    : START sentence* END;

sentence returns [ASTNode node]
    :assignmentStmt SEMICOLON { $node = $assignmentStmt.node; }
    | expression SEMICOLON { $node = $expression.node; }
    | ifStmt { $node = $ifStmt.node; }
    | whileStmt { $node = $whileStmt.node; }
    | printStmt SEMICOLON { $node = $printStmt.node; }
    ;


assignmentStmt returns [ASTNode node]
    : ID ASSIGN expression
        { $node = new Assignment($ID.text, $expression.node); }
    ;


ifStmt returns [ASTNode node]
@init {
    ArrayList<ASTNode> thenBody = new ArrayList<>();
    ArrayList<ASTNode> elseBody = new ArrayList<>();
}
    : IF LPAREN expression RPAREN LBRACE
        (thenStmt=sentence { thenBody.add($thenStmt.node); })*
      RBRACE
      (ELSE LBRACE
        (elseStmt=sentence { elseBody.add($elseStmt.node); })*
      RBRACE)?
      { $node = new If($expression.node, thenBody, elseBody); }
    ;


whileStmt returns [ASTNode node]
@init {
    ArrayList<ASTNode> whileBody = new ArrayList<>();
}
    : WHILE LPAREN expression RPAREN LBRACE
        (bodyStmt=sentence { whileBody.add($bodyStmt.node); })*
      RBRACE
      { $node = new While($expression.node, whileBody); }
    ;


printStmt returns [ASTNode node]
    : PRINT LPAREN expression RPAREN
      { $node = new Print($expression.node); }
    ;


/**
* Define expresiones aritmeticas, comparativas y booleanas.
* Tambien tiene un info, en donde una expression puede abarcar un numero, booleano, id, string.
*/

expression returns [ASTNode node]
    : op = NOT expression {
        $node = new LogicalExpression($op.text, $expression.node, null);
    }
    | e1 = expression {$node = $e1.node;} op = AND e2 = expression {
                $node = new LogicalExpression($op.text, $node, $e2.node);
            }
    | e1 = expression {$node = $e1.node;} op = OR e2 = expression {
                $node = new LogicalExpression($op.text, $node, $e2.node);
           }
    | e1 = expression {$node = $e1.node;}  op = ( MULT | DIV ) e2 = expression {
            $node = new ArithmeticExpression($op.text, $node, $e2.node);
        }
    | e1 = expression {$node = $e1.node;}  op = ( SUM | RES ) e2 = expression {
            $node = new ArithmeticExpression($op.text, $node, $e2.node);
        }
    | e1 = expression {$node = $e1.node;}  op = ( GT | LT | GTE | LTE ) e2 = expression {
            $node = new ComparativeExpression($op.text, $node, $e2.node);
        }
    | e1 = expression {$node = $e1.node;}  op = ( EQ | NEQ ) e2 = expression {
            $node = new ComparativeExpression($op.text, $node, $e2.node);
        }
    | info {$node = $info.node; }
        ;

/**
* Define constantes y variables. Tambien precedencia de parentesis en expression y anidamiento.
*/
info returns [ASTNode node]
     : LPAREN expression {$node = $expression.node; } RPAREN
        | BOOL  { $node = new Constant(Boolean.parseBoolean($BOOL.text)); }
        | NUMBER { $node = new Constant(Double.parseDouble($NUMBER.text)); }
        | ID     { $node = new Variable(String.valueOf($ID.text)); }
        | STRING { $node = new Constant(String.format("\"%s\"", $STRING.text)); }
        ;




/********************************************************************************************************/
/**
 *                                      Lexer Rules
 */
/********************************************************************************************************/

// Keywords
IF      : 'if';
ELSE    : 'else';
WHILE   : 'while';
PRINT   : 'print';
START   : 'start:';
END     : 'end';


// Operators
SUM    : '+';
RES    : '-';
MULT   : '*';
DIV    : '/';
ASSIGN : '=';

// Comparison Operators
GT      : '>';
LT      : '<';
GTE     : '>=';
LTE     : '<=';
EQ      : '==';
NEQ     : '!=';

// Logical Operators
AND     : '&&';
OR      : '||';
NOT     : '!';

// Delimiters
LPAREN  : '(';
RPAREN  : ')';
LBRACE  : '{';
RBRACE  : '}';
SEMICOLON: ';';

// Literals
NUMBER  : '-'? [0-9]+ ('.' [0-9]+)?;
STRING : ["] ([a-zA-Z0-9]|[ ]|[-_])* ["];
BOOL  : 'true' | 'false';
ID      : [a-zA-Z_][a-zA-Z0-9_]*;

// Whitespace and comments
WS      : [ \t\r\n]+ -> skip;
COMMENT : '//' ~[\r\n]* -> skip;