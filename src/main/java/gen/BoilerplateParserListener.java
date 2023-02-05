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
	 * Enter a parse tree produced by {@link BoilerplateParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(BoilerplateParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoilerplateParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(BoilerplateParser.ClassTypeContext ctx);
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
	 * Enter a parse tree produced by {@link BoilerplateParser#methods}.
	 * @param ctx the parse tree
	 */
	void enterMethods(BoilerplateParser.MethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoilerplateParser#methods}.
	 * @param ctx the parse tree
	 */
	void exitMethods(BoilerplateParser.MethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BoilerplateParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(BoilerplateParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link BoilerplateParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(BoilerplateParser.MethodContext ctx);
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