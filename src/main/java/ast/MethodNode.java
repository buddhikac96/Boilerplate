package ast;

import ast.enums.AccessModifier;
import ast.enums.DataType;

import java.util.ArrayList;
import java.util.List;

public class MethodNode {
    private String name;
    private DataType returnType;
    private AccessModifier accessModifier;
    private List<ParamNode> params;

    public MethodNode() {
        this.params = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public DataType getReturnType() {
        return returnType;
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public List<ParamNode> getParams() {
        return params;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReturnType(DataType returnType) {
        this.returnType = returnType;
    }

    public void setAccessModifier(AccessModifier accessModifier) {
        this.accessModifier = accessModifier;
    }

    public void addParam(ParamNode param) {
        this.params.add(param);
    }
}
