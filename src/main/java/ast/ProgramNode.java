package ast;

import ast.interfaces.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class ProgramNode implements ASTNode {
    private List<ASTNode> declarations;

    public ProgramNode() {
        this.declarations = new ArrayList<>();
    }

    public List<ASTNode> getDeclarations() {
        return declarations;
    }

    public void addDeclaration(ASTNode declaration) {
        this.declarations.add(declaration);
    }
}
