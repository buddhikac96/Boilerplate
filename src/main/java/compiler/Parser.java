package compiler;

import ast.interfaces.ASTNode;
import ast.ProgramNode;
import gen.BoilerplateParser;
import gen.BoilerplateParserVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.ArrayList;
import java.util.List;

public class Parser extends AbstractParseTreeVisitor implements BoilerplateParserVisitor {
    @Override
    public Object visitProgram(BoilerplateParser.ProgramContext ctx) {
        return null;
    }

    @Override
    public Object visitDeclaration(BoilerplateParser.DeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitClassDeclaration(BoilerplateParser.ClassDeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitInterfaceDeclaration(BoilerplateParser.InterfaceDeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitFields(BoilerplateParser.FieldsContext ctx) {
        return null;
    }

    @Override
    public Object visitField(BoilerplateParser.FieldContext ctx) {
        return null;
    }

    @Override
    public Object visitGetSet(BoilerplateParser.GetSetContext ctx) {
        return null;
    }

    @Override
    public Object visitGet(BoilerplateParser.GetContext ctx) {
        return null;
    }

    @Override
    public Object visitSet(BoilerplateParser.SetContext ctx) {
        return null;
    }

    @Override
    public Object visitClassMethods(BoilerplateParser.ClassMethodsContext ctx) {
        return null;
    }

    @Override
    public Object visitClassMethod(BoilerplateParser.ClassMethodContext ctx) {
        return null;
    }

    @Override
    public Object visitInterfaceMethods(BoilerplateParser.InterfaceMethodsContext ctx) {
        return null;
    }

    @Override
    public Object visitInterfaceMethod(BoilerplateParser.InterfaceMethodContext ctx) {
        return null;
    }

    @Override
    public Object visitParams(BoilerplateParser.ParamsContext ctx) {
        return null;
    }

    @Override
    public Object visitParam(BoilerplateParser.ParamContext ctx) {
        return null;
    }

    @Override
    public Object visitDataType(BoilerplateParser.DataTypeContext ctx) {
        return null;
    }

    @Override
    public Object visitAccessModifier(BoilerplateParser.AccessModifierContext ctx) {
        return null;
    }
}
