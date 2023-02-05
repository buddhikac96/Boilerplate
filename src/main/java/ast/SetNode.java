package ast;

import ast.enums.AccessModifier;
import ast.interfaces.ASTNode;

public class SetNode implements ASTNode {
    private AccessModifier accessModifier;

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(AccessModifier accessModifier) {
        this.accessModifier = accessModifier;
    }
}
