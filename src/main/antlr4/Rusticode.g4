grammar Rusticode;

@parser::header {
    import java.util.HashMap;
    import java.util.ArrayList;
    import ast.*;
}

@parser::members {
    private HashMap<String, Object> symbolTable = new HashMap<>();
}

/**
 * Parser Rules
 */

program returns [ASTNode node]
    @init {
        List<ASTNode> body = new ArrayList<>(); // Lista de instrucciones
    }
    : (sentence{
        if ($sentence.node != null) {
            body.add($sentence.node);
        } else {
            System.err.println("Error: sentence es null");
        }
    })+
    {
        $node = new Program(body); // Crear el nodo Program

    }
    EOF
;

sentence returns [ASTNode node]
    : varDeclaration SEMICOLON { $node = $varDeclaration.node; }
    | assignmentStmt SEMICOLON { $node = $assignmentStmt.node; }
    | expression SEMICOLON { $node = $expression.node; }
    | ifStmt { $node = $ifStmt.node; }
    | whileStmt { $node = $whileStmt.node; }
    | printStmt SEMICOLON { $node = $printStmt.node; }
    ;


varDeclaration returns [ASTNode node]
    : type ID (ASSIGN expr=expression)?
        {
            $node = ($expr.ctx != null)
                ? new VariableDeclaration($type.text, $ID.text, $expr.node)
                : new VariableDeclaration($type.text, $ID.text, null);
        }
    ;

assignmentStmt returns [ASTNode node]
    : ID ASSIGN expr=expression
        { $node = new Assignment($ID.text, $expr.node); }
    ;

type
    : INT
    | FLOAT
    | STRING
    ;

expression returns [ASTNode node]
    : logicalExpr { $node = $logicalExpr.node; }
    ;

logicalExpr returns [ASTNode node]
    : left=comparisonExpr (op=(AND | OR) right=comparisonExpr
        { $node = new LogicalExpression($op.text, $left.node, $right.node); })*
    | comparisonExpr { $node = $comparisonExpr.node; }
    ;

comparisonExpr returns [ASTNode node]
    : left=arithmeticExpr (op=(GT | LT | GTE | LTE | EQ | NEQ) right=arithmeticExpr
        { $node = new ComparativeExpression($op.text, $left.node, $right.node); })*
    | arithmeticExpr { $node = $arithmeticExpr.node; }
    ;

arithmeticExpr returns [ASTNode node]
    : left=term (op=(PLUS | MINUS) right=term
        { $node = new ArithmeticExpression($op.text, $left.node, $right.node); })*
    | term { $node = $term.node; }
    ;

term returns [ASTNode node]
    : left=factor (op=(MULT | DIV) right=factor
        { $node = new ArithmeticExpression($op.text, $left.node, $right.node); })*
    | factor { $node = $factor.node; }
    ;

factor returns [ASTNode node]
    : LPAREN expr=expression RPAREN { $node = $expr.node; }
    | NUMBER { $node = new NumberLiteral($NUMBER.text); }
    | STRING_LITERAL { $node = new StringLiteral($STRING_LITERAL.text); }
    | BOOL_LITERAL { $node = new BooleanLiteral($BOOL_LITERAL.text); }
    | ID { $node = new Variable($ID.text); }
    ;

ifStmt returns [ASTNode node]
@init {
    ArrayList<ASTNode> thenBlock = new ArrayList<>();
    ArrayList<ASTNode> elseBlock = new ArrayList<>();
}
    : IF LPAREN cond=expression RPAREN LBRACE
        (thenStmt=sentence { thenBlock.add($thenStmt.node); })*
      RBRACE
      (ELSE LBRACE
        (elseStmt=sentence { elseBlock.add($elseStmt.node); })*
      RBRACE)?
      { $node = new If($cond.node, thenBlock, elseBlock); }
    ;

whileStmt returns [ASTNode node]
@init {
    ArrayList<ASTNode> bodyBlock = new ArrayList<>();
}
    : WHILE LPAREN cond=expression RPAREN LBRACE
        (bodyStmt=sentence { bodyBlock.add($bodyStmt.node); })*
      RBRACE
      { $node = new While($cond.node, bodyBlock); }
    ;

printStmt returns [ASTNode node]
    : PRINT LPAREN expression RPAREN
      { $node = new Print($expression.node); }
    ;

/**
 * Lexer Rules
 */

// Keywords
IF      : 'if';
ELSE    : 'else';
WHILE   : 'while';
PRINT   : 'print';
START   : 'start:';
END     : 'end';

// Types
INT     : 'int';
FLOAT   : 'float';
STRING  : 'string';

// Operators
PLUS    : '+';
MINUS   : '-';
MULT    : '*';
DIV     : '/';
ASSIGN  : '=';

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

// Delimiters
LPAREN  : '(';
RPAREN  : ')';
LBRACE  : '{';
RBRACE  : '}';
SEMICOLON: ';';

// Literals
NUMBER  : '-'? [0-9]+ ('.' [0-9]+)?;
STRING_LITERAL : '"' (~["\r\n])* '"';
BOOL_LITERAL  : 'true' | 'false';
ID      : [a-zA-Z_][a-zA-Z0-9_]*;

// Whitespace and comments
WS      : [ \t\r\n]+ -> skip;
COMMENT : '//' ~[\r\n]* -> skip;
