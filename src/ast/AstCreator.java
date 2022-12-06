package ast;

import parser.exprParser;
import parser.exprParser.TypeidContext;

import java.util.ArrayList;

import org.antlr.v4.runtime.Token;

import parser.exprBaseVisitor;

public class AstCreator extends exprBaseVisitor<Ast> {

    @Override
    public Ast visitTypedecl(exprParser.TypedeclContext ctx) {
        Ast typeId = ctx.getChild(1).accept(this);
        Ast type = ctx.getChild(3).accept(this);

        // Création des sous AST
        return new TypeDecl(typeId, type);
    }

    @Override
    public Ast visitFielddecl(exprParser.FielddeclContext ctx) {
        ArrayList<Idf> idTypes = new ArrayList<Idf>();
        ArrayList<Ast> fieldTypes = new ArrayList<Ast>();

        for (Token ids : ctx.fieldid) {
            idTypes.add(new Idf(ids.toString()));
        }
        for (TypeidContext field : ctx.fieldtype) {
            fieldTypes.add(field.accept(this));
        }

        // Création des sous AST
        return new FieldDecl(idTypes, fieldTypes);
    }

    @Override
    public Ast visitFuncdecl(exprParser.FuncdeclContext ctx) {
        String idfString = ctx.getChild(1).toString();
        Ast exprSeq = ctx.funcfield.accept(this);
        Ast exprSeq2 = ctx.functype.accept(this);
        Ast exprSeq3 = ctx.funcbody.accept(this);

        // Création des sous AST
        Idf idf = new Idf(idfString);
        return new FuncDecl(idf, exprSeq, exprSeq2, exprSeq3);
    }

    @Override
    public Ast visitLvalue(exprParser.LvalueContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitLvalues(exprParser.LvaluesContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitSubscript(exprParser.SubscriptContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitFieldexpr(exprParser.FieldexprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitInteger(exprParser.IntegerContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitStringDecl(exprParser.StringDeclContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitParenthesis(exprParser.ParenthesisContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitMinusAffector(exprParser.MinusAffectorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitAffect(exprParser.AffectContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitFunctionCall(exprParser.FunctionCallContext ctx) {
        String idfString = ctx.getChild(0).toString();
        Ast exprList = ctx.getChild(2).accept(this);

        // Création des sous AST
        Idf idf = new Idf(idfString);
        return new FunctionCall(idf, exprList);
    }

    @Override
    public Ast visitListDecl(exprParser.ListDeclContext ctx) {
        DeclList declList = new DeclList();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            declList.addDecl(ctx.getChild(i).accept(this));
        }

        return declList;
    }

    @Override
    public Ast visitList(exprParser.ListContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitWhile(exprParser.WhileContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitBreak(exprParser.BreakContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitLet(exprParser.LetContext ctx) {
        Ast declList = ctx.getChild(1).accept(this);
        Ast exprSeq = ctx.getChild(3).accept(this);
        return new LetNode(declList, exprSeq);
    }

    @Override
    public Ast visitPrintStr(exprParser.PrintStrContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitReturnF(exprParser.ReturnFContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitFlushF(exprParser.FlushFContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitGetCharF(exprParser.GetCharFContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitOrdF(exprParser.OrdFContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitCharF(exprParser.CharFContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitSizeF(exprParser.SizeFContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitSubstringF(exprParser.SubstringFContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitConcatenateF(exprParser.ConcatenateFContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitExitF(exprParser.ExitFContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitAffect2(exprParser.Affect2Context ctx) {
        Ast left = ctx.getChild(0).accept(this);
        if (ctx.affexpr == null) {
            return left;
        }
        Ast right = ctx.affexpr.accept(this);
        return new Affect(left, right);
    }

    @Override
    public Ast visitOr(exprParser.OrContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitBoolexpr(exprParser.BoolexprContext ctx) {
        Ast left = ctx.getChild(0).accept(this);
        if (ctx.getChild(2) == null) {
            return left;
        }
        Ast right = ctx.getChild(2).accept(this);
        switch (ctx.op.getText()) {
            case ">":
                return new SupNode(left, right);
            case "<":
                return new InfEqNode(left, right);
            case "=":
                return new EqNode(left, right);
            case "<>":
                return new DiffNode(left, right);
            case "<=":
                return new InfEqNode(left, right);
            case ">=":
                return new SupEqNode(left, right);
            default:
                return left;
        }
    }

    @Override
    public Ast visitPlus(exprParser.PlusContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitField_Create(exprParser.Field_CreateContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitFreturn(exprParser.FreturnContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitPrints(exprParser.PrintsContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitPrinti(exprParser.PrintiContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitFlush(exprParser.FlushContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitGetchar(exprParser.GetcharContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitOrd(exprParser.OrdContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitSize(exprParser.SizeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitSubstring(exprParser.SubstringContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitNotF(exprParser.NotFContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitType(exprParser.TypeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitType_Fields(exprParser.Type_FieldsContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitType_Field(exprParser.Type_FieldContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitTypeid(exprParser.TypeidContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Ast visitAnd(exprParser.AndContext ctx) {
        Ast left = ctx.getChild(0).accept(this);
        if (ctx.getChild(2) == null) {
            return left;
        }
        Ast right = ctx.getChild(2).accept(this);
        return new AndNode(left, right);
    }

    @Override
    public Ast visitChr(exprParser.ChrContext ctx) {
        return new Chr(ctx.chrel.getText());
    }

    @Override
    public Ast visitConcat(exprParser.ConcatContext ctx) {
        String left = ctx.catel1.getText();
        String right = ctx.catel2.getText();

        return new Concat(left, right);
    }

    @Override
    public Ast visitDecl(exprParser.DeclContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Ast visitDiv(exprParser.DivContext ctx) {
        Ast left = ctx.getChild(0).accept(this);
        if (ctx.getChild(2) == null) {
            return left;
        }
        Ast right = ctx.getChild(2).accept(this);
        return new Div(left, right);
    }

    @Override
    public Ast visitExit(exprParser.ExitContext ctx) {
        IntNode value = new IntNode(ctx.exitel.getText());
        return new Exit(value);
    }

    @Override
    public Ast visitExprList(exprParser.ExprListContext ctx) {
        ExprList exprList = new ExprList();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            exprList.addExpr(ctx.getChild(i).accept(this));
        }
        return exprList;
    }

    // @Override
    // public Ast visitFieldElement(exprParser.FieldElementContext ctx) {
    // String idfString = ctx.getChild(0).toString();
    // Ast expr = ctx.getChild(2).accept(this);
    // return new FieldElement(idfString, expr);
    // }

    @Override
    public Ast visitFor(exprParser.ForContext ctx) {
        String idfString = ctx.getChild(1).toString();
        Ast expr = ctx.getChild(3).accept(this);
        Ast exprSeq = ctx.getChild(5).accept(this);
        Ast exprSeq2 = ctx.getChild(7).accept(this);

        // Création des sous AST
        Idf idf = new Idf(idfString);

        return new For(idf, expr, exprSeq, exprSeq2);
    }

    /*
     * @Override
     * public Ast visitFunctionCall(exprParser.FunctionCallContext ctx) {
     * String idfString = ctx.getChild(0).toString();
     * ExprList exprList = ctx.getChild(2).accept(this);
     * 
     * //Création des sous AST
     * Idf idf = new Idf(idfString);
     * return new FunctionCall(idf, exprList);
     * }
     */

    /*
     * @Override
     * public Ast visitIdentifier(exprParser.IdentifierContext ctx) {
     * return new Idf(ctx.getChild(0).toString());
     * }
     */

    @Override
    public Ast visitIfThen(exprParser.IfThenContext ctx) {
        Ast expr = ctx.getChild(1).accept(this);
        Ast exprSeq = ctx.getChild(3).accept(this);
        return new IfThen(expr, exprSeq);
    }

    @Override
    public Ast visitIfThenElse(exprParser.IfThenElseContext ctx) {
        Ast expr = ctx.getChild(1).accept(this);
        Ast exprSeq = ctx.getChild(3).accept(this);
        Ast exprSeq2 = ctx.getChild(5).accept(this);
        return new IfThenElse(expr, exprSeq, exprSeq2);
    }

    @Override
    public Ast visitMoins(exprParser.MoinsContext ctx) {
        Ast left = ctx.getChild(0).accept(this);
        if (ctx.getChild(2) == null) {
            return left;
        }
        Ast right = ctx.getChild(2).accept(this);
        return new Minus(left, right);
    }

    @Override
    public Ast visitMult(exprParser.MultContext ctx) {
        Ast left = ctx.getChild(0).accept(this);
        if (ctx.getChild(2) == null) {
            return left;
        }
        Ast right = ctx.getChild(2).accept(this);
        return new Mult(left, right);
    }

    @Override
    public Ast visitNot(exprParser.NotContext ctx) {
        Ast expr = ctx.getChild(1).accept(this);
        return new Not(expr);
    }

    @Override
    public Ast visitPrintInt(exprParser.PrintIntContext ctx) {
        Ast expr = ctx.getChild(2).accept(this);
        return new PrintInt(expr);
    }

    @Override
    public Ast visitProgram(exprParser.ProgramContext ctx) {
        Ast child = ctx.first.accept(this);

        return new Program(child);
    }

    @Override
    public Ast visitVarDecl(exprParser.VarDeclContext ctx) {
        // Récupération des noeuds fils
        Ast expr = ctx.getChild(3).accept(this);
        String idfString = ctx.getChild(1).toString();
        FieldDecl fieldDecl = (FieldDecl) ctx.getChild(2).accept(this);
        TypeId typeId = (TypeId) ctx.getChild(0).accept(this);

        // Création des sous AST
        Idf idf = new Idf(idfString);

        return new VarDecl(idf, fieldDecl, typeId, expr);
    }

}
