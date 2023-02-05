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
    public ASTNode visitProgram(BoilerplateParser.ProgramContext ctx) {
        List<ASTNode> declarations = new ArrayList();
        for (BoilerplateParser.DeclarationContext declarationContext : ctx.declaration()) {
            declarations.add(visitDeclaration(declarationContext));
        }
        return new ProgramNode(declarations);
    }

    @Override
    public ASTNode visitDeclaration(BoilerplateParser.DeclarationContext ctx) {
        if(ctx.getChild(0) instanceof BoilerplateParser.ClassDeclarationContext){
            return visitClassDeclaration((BoilerplateParser.ClassDeclarationContext) ctx.getChild(0));
        } else{
            return visitInterfaceDeclaration((BoilerplateParser.InterfaceDeclarationContext) ctx.getChild(0));
        }
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
