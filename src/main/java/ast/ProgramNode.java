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

    public void setDeclarations(List<ASTNode> declarations) {
        this.declarations = declarations;
    }

    @Override
    public String toString() {
        return "ProgramNode{" +
                "declarations=" + declarations +
                '}';
    }
}
