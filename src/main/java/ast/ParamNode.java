package ast;

import ast.enums.DataType;

public class ParamNode {
    private String name;
    private DataType type;

    public ParamNode(String name, DataType type) {
        this.name = name;
        this.type = type;
    }

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
}
