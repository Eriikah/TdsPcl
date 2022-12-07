// Generated from ./expr.g4 by ANTLR 4.9.2

package parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link exprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface exprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link exprParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(exprParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(exprParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#typedecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedecl(exprParser.TypedeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#fielddecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFielddecl(exprParser.FielddeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDecl}
	 * labeled alternative in {@link exprParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(exprParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#funcdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdecl(exprParser.FuncdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(exprParser.LvalueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubscriptF}
	 * labeled alternative in {@link exprParser#lvalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptF(exprParser.SubscriptFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldexprF}
	 * labeled alternative in {@link exprParser#lvalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldexprF(exprParser.FieldexprFContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(exprParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#fieldexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldexpr(exprParser.FieldexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(exprParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringDecl}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDecl(exprParser.StringDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(exprParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusAffector}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusAffector(exprParser.MinusAffectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Val}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(exprParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(exprParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListDecl}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDecl(exprParser.ListDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code List}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(exprParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfThen}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThen(exprParser.IfThenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfThenElse}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElse(exprParser.IfThenElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(exprParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(exprParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Break}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(exprParser.BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Let}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(exprParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStr}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStr(exprParser.PrintStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnF}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnF(exprParser.ReturnFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintInt}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintInt(exprParser.PrintIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FlushF}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlushF(exprParser.FlushFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GetCharF}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetCharF(exprParser.GetCharFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrdF}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdF(exprParser.OrdFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharF}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharF(exprParser.CharFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SizeF}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeF(exprParser.SizeFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubstringF}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstringF(exprParser.SubstringFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConcatenateF}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenateF(exprParser.ConcatenateFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotF}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotF(exprParser.NotFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExitF}
	 * labeled alternative in {@link exprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitF(exprParser.ExitFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Affect}
	 * labeled alternative in {@link exprParser#exprsolo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffect(exprParser.AffectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link exprParser#orexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(exprParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link exprParser#andexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(exprParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#boolexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolexpr(exprParser.BoolexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Moins}
	 * labeled alternative in {@link exprParser#minusexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoins(exprParser.MoinsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link exprParser#addexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(exprParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link exprParser#divexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(exprParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link exprParser#multexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(exprParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprList}
	 * labeled alternative in {@link exprParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(exprParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Field_Create}
	 * labeled alternative in {@link exprParser#fieldcreate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_Create(exprParser.Field_CreateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclList}
	 * labeled alternative in {@link exprParser#decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclList(exprParser.DeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#freturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFreturn(exprParser.FreturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#prints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrints(exprParser.PrintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#printi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrinti(exprParser.PrintiContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#flush}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlush(exprParser.FlushContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#getchar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetchar(exprParser.GetcharContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#ord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrd(exprParser.OrdContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#chr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChr(exprParser.ChrContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(exprParser.SizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#substring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstring(exprParser.SubstringContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(exprParser.ConcatContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(exprParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#exit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit(exprParser.ExitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeIdF}
	 * labeled alternative in {@link exprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeIdF(exprParser.TypeIdFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tyfields}
	 * labeled alternative in {@link exprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyfields(exprParser.TyfieldsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclArrayOfTyfields}
	 * labeled alternative in {@link exprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclArrayOfTyfields(exprParser.DeclArrayOfTyfieldsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_Fields}
	 * labeled alternative in {@link exprParser#typefields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_Fields(exprParser.Type_FieldsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Type_Field}
	 * labeled alternative in {@link exprParser#typefield}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_Field(exprParser.Type_FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link exprParser#typeid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeid(exprParser.TypeidContext ctx);
}