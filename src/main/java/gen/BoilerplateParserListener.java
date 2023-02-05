// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BoilerplateParser}.
 */
public interface BoilerplateParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BoilerplateParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BoilerplateParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoilerplateParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BoilerplateParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoilerplateParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(BoilerplateParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoilerplateParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(BoilerplateParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoilerplateParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(BoilerplateParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoilerplateParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(BoilerplateParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoilerplateParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(BoilerplateParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoilerplateParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(BoilerplateParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoilerplateParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(BoilerplateParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoilerplateParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(BoilerplateParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoilerplateParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(BoilerplateParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoilerplateParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(BoilerplateParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoilerplateParser#getSet}.
	 * @param ctx the parse tree
	 */
	void enterGetSet(BoilerplateParser.GetSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoilerplateParser#getSet}.
	 * @param ctx the parse tree
	 */
	void exitGetSet(BoilerplateParser.GetSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoilerplateParser#get}.
	 * @param ctx the parse tree
	 */
	void enterGet(BoilerplateParser.GetContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoilerplateParser#get}.
	 * @param ctx the parse tree
	 */
	void exitGet(BoilerplateParser.GetContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoilerplateParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(BoilerplateParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoilerplateParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(BoilerplateParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoilerplateParser#classMethods}.
	 * @param ctx the parse tree
	 */
	void enterClassMethods(BoilerplateParser.ClassMethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoilerplateParser#classMethods}.
	 * @param ctx the parse tree
	 */
	void exitClassMethods(BoilerplateParser.ClassMethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoilerplateParser#classMethod}.
	 * @param ctx the parse tree
	 */
	void enterClassMethod(BoilerplateParser.ClassMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoilerplateParser#classMethod}.
	 * @param ctx the parse tree
	 */
	void exitClassMethod(BoilerplateParser.ClassMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoilerplateParser#interfaceMethods}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethods(BoilerplateParser.InterfaceMethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoilerplateParser#interfaceMethods}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethods(BoilerplateParser.InterfaceMethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoilerplateParser#interfaceMethod}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethod(BoilerplateParser.InterfaceMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoilerplateParser#interfaceMethod}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethod(BoilerplateParser.InterfaceMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoilerplateParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(BoilerplateParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoilerplateParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(BoilerplateParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoilerplateParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(BoilerplateParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoilerplateParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(BoilerplateParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoilerplateParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(BoilerplateParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoilerplateParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(BoilerplateParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoilerplateParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(BoilerplateParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoilerplateParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(BoilerplateParser.AccessModifierContext ctx);
}