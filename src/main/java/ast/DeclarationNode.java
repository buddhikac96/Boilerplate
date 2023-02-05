package ast;

import ast.enums.ClassType;

import java.util.ArrayList;
import java.util.List;

public class DeclarationNode implements ast.interfaces.DeclarationNode {
    private ClassType classType;
    private String className;
    private List<FieldNode> fields;
    private List<MethodNode> methods;

    public DeclarationNode() {
        this.fields = new ArrayList<>();
        this.methods = new ArrayList<>();
    }

    public ClassType getClassType() {
        return classType;
    }

    public List<FieldNode> getFields() {
        return fields;
    }

    public List<MethodNode> getMethods() {
        return methods;
    }

    public String getClassName() {
        return className;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    public void addField(FieldNode field) {
        this.fields.add(field);
    }

    public void addMethod(MethodNode method) {
        this.methods.add(method);
    }

    public void setClassName(String className) {
        this.className = className;
    }
}

