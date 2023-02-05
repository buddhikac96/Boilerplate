package ast;

import ast.enums.AccessModifier;
import ast.interfaces.ASTNode;

public class GetNode implements ASTNode {
    private AccessModifier accessModifier;

    public GetNode(AccessModifier accessModifier) {
        this.accessModifier = accessModifier;
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(AccessModifier accessModifier) {
        this.accessModifier = accessModifier;
    }
}