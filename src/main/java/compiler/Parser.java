package compiler;

import ast.ProgramNode;
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
    public ASTNode visitClassType(BoilerplateParser.ClassTypeContext ctx) {
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
    public ASTNode visitMethods(BoilerplateParser.MethodsContext ctx) {
        return null;
    }

    @Override
    public ASTNode visitMethod(BoilerplateParser.MethodContext ctx) {
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
