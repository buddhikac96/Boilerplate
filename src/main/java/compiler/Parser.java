package compiler;

import ast.interfaces.ASTNode;
import gen.BoilerplateParser;
import gen.BoilerplateParserVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class Parser extends AbstractParseTreeVisitor implements BoilerplateParserVisitor {
    @Override
    public ASTNode visitProgram(BoilerplateParser.ProgramContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitDeclaration(BoilerplateParser.DeclarationContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitClassDeclaration(BoilerplateParser.ClassDeclarationContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitInterfaceDeclaration(BoilerplateParser.InterfaceDeclarationContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitFields(BoilerplateParser.FieldsContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitField(BoilerplateParser.FieldContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitGetSet(BoilerplateParser.GetSetContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitGet(BoilerplateParser.GetContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitSet(BoilerplateParser.SetContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitClassMethods(BoilerplateParser.ClassMethodsContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitClassMethod(BoilerplateParser.ClassMethodContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitInterfaceMethods(BoilerplateParser.InterfaceMethodsContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitInterfaceMethod(BoilerplateParser.InterfaceMethodContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitParams(BoilerplateParser.ParamsContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitParam(BoilerplateParser.ParamContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitDataType(BoilerplateParser.DataTypeContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitAccessModifier(BoilerplateParser.AccessModifierContext ctx) {
        return null;
    }
}
