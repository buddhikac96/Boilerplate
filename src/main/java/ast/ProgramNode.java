package ast;

import ast.interfaces.ASTNode;

import java.util.List;

public class ProgramNode implements ASTNode {
    private List<ASTNode> declarations;

    public ProgramNode(List<ASTNode> declarations) {
        this.declarations = declarations;
    }

    public List<ASTNode> getDeclarations() {
        return declarations;
    }

    public void addDeclaration(ASTNode declaration) {
        this.declarations.add(declaration);
    }
}
