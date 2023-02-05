package ast;

import ast.enums.DataType;
import ast.interfaces.ASTNode;

public class FieldNode implements ASTNode {
    private String name;
    private DataType type;
    private GetNode get;
    private SetNode set;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataType getType() {
        return type;
    }

    public void setType(DataType type) {
        this.type = type;
    }

    public GetNode getGet() {
        return get;
    }

    public void setGet(GetNode get) {
        this.get = get;
    }

    public SetNode getSet() {
        return set;
    }

    public void setSet(SetNode set) {
        this.set = set;
    }
}
