// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BoilerplateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BoilerplateParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BoilerplateParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BoilerplateParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoilerplateParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(BoilerplateParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoilerplateParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(BoilerplateParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoilerplateParser#fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields(BoilerplateParser.FieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoilerplateParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(BoilerplateParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoilerplateParser#getSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetSet(BoilerplateParser.GetSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoilerplateParser#get}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet(BoilerplateParser.GetContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoilerplateParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(BoilerplateParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoilerplateParser#methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethods(BoilerplateParser.MethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoilerplateParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(BoilerplateParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoilerplateParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(BoilerplateParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoilerplateParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(BoilerplateParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoilerplateParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(BoilerplateParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BoilerplateParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(BoilerplateParser.AccessModifierContext ctx);
}