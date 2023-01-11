package ast;

import parser.exprParser;
import parser.exprParser.AddexprContext;
import parser.exprParser.AndexprContext;
import parser.exprParser.BoolexprContext;
import parser.exprParser.DivexprContext;
import parser.exprParser.ExprsoloContext;
import parser.exprParser.MultexprContext;
import parser.exprParser.TypefieldContext;
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
        ArrayList<String> idTypes = new ArrayList<String>();
        ArrayList<Ast> fieldTypes = new ArrayList<Ast>();

        for (Token ids : ctx.fieldid) {
            idTypes.add(ids.getText());
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
        Idf idf = new Idf(idfString);
        Ast exprSeq3 = ctx.funcbody.accept(this);
        if (ctx.funcfield == null) {
            if (ctx.functype == null) {
                return new FuncDecl(idf, null, null, exprSeq3);
            } else {
                Ast exprSeq2 = ctx.functype.accept(this);
                return new FuncDecl(idf, null, exprSeq2, exprSeq3);
            }
        } else {
            Ast exprSeq = ctx.funcfield.accept(this);
            if (ctx.functype == null) {
                return new FuncDecl(idf, exprSeq, null, exprSeq3);
            } else {
                Ast exprSeq2 = ctx.functype.accept(this);
                return new FuncDecl(idf, exprSeq, exprSeq2, exprSeq3);
            }
        }
        // Ast exprSeq = ctx.funcfield.accept(this);
        // Ast exprSeq2 = ctx.functype.accept(this);

        // // Création des sous AST
        // return new FuncDecl(idf, exprSeq, exprSeq2, exprSeq3);
    }

    @Override
    public Ast visitSubscriptF(exprParser.SubscriptFContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Ast visitFieldexprF(exprParser.FieldexprFContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Ast visitLvalue(exprParser.LvalueContext ctx) {
        String idfString = ctx.getChild(0).toString();
        Idf idf = new Idf(idfString);
        ArrayList<Ast> lvaluesubs = new ArrayList<Ast>();
        for (int i = 1; i < ctx.getChildCount(); i++) {
            lvaluesubs.add(ctx.getChild(i).accept(this));
        }
        return new Lvalue(idf, lvaluesubs);
    }

    @Override
    public Ast visitSubscript(exprParser.SubscriptContext ctx) {
        return new Subscript(ctx.getChild(1).accept(this));
    }

    @Override
    public Ast visitFieldexpr(exprParser.FieldexprContext ctx) {
        return new FieldExpr(ctx.getChild(1).toString());
    }

    @Override
    public Ast visitInteger(exprParser.IntegerContext ctx) {
        return new IntNode(ctx.getChild(0).toString());
    }

    @Override
    public Ast visitStringDecl(exprParser.StringDeclContext ctx) {
        return new StringNode(ctx.getChild(0).toString());
    }

    @Override
    public Ast visitParenthesis(exprParser.ParenthesisContext ctx) {
        return ctx.getChild(1).accept(this);
    }

    @Override
    public Ast visitMinusAffector(exprParser.MinusAffectorContext ctx) {
        return ctx.getChild(1).accept(this);
    }

    @Override
    public Ast visitVal(exprParser.ValContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Ast visitFunctionCall(exprParser.FunctionCallContext ctx) {
        String idfString = ctx.getChild(0).toString();
        Idf idf = new Idf(idfString);
        if (ctx.getChild(2) == null) {
            return new FunctionCall(idf, null);
        } else {
            Ast exprList = ctx.getChild(2).accept(this);
            return new FunctionCall(idf, exprList);
        }

        // Création des sous AST
    }

    @Override
    public Ast visitListDecl(exprParser.ListDeclContext ctx) {
        Ast typeId = ctx.getChild(0).accept(this);
        Ast list = ctx.getChild(2).accept(this);
        Ast ofexpr = ctx.getChild(5).accept(this);

        return new ListDecl(typeId, list, ofexpr);
    }

    @Override
    public Ast visitList(exprParser.ListContext ctx) {
        Ast typeid = ctx.getChild(0).accept(this);
        Ast fieldCreate = ctx.getChild(2).accept(this);
        return new List(typeid, fieldCreate);
    }

    @Override
    public Ast visitWhile(exprParser.WhileContext ctx) {
        Ast cond = ctx.getChild(1).accept(this);
        Ast expr = ctx.getChild(3).accept(this);

        // Création des sous AST
        return new While(cond, expr);
    }

    @Override
    public Ast visitBreak(exprParser.BreakContext ctx) {
        return new Break();
    }

    @Override
    public Ast visitLet(exprParser.LetContext ctx) {
        Ast declList = ctx.getChild(1).accept(this);
        Ast exprSeq = ctx.getChild(3).accept(this);
        return new LetNode(declList, exprSeq);
    }

    @Override
    public Ast visitDeclList(exprParser.DeclListContext ctx) {
        ArrayList<Ast> declList = new ArrayList<Ast>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            declList.add(ctx.getChild(i).accept(this));
        }
        return new DeclList(declList);
    }

    @Override
    public Ast visitPrintStr(exprParser.PrintStrContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    // @Override
    // public Ast visitReturnF(exprParser.ReturnFContext ctx) {
    // return ctx.getChild(0).accept(this);
    // }

    @Override
    public Ast visitFlushF(exprParser.FlushFContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Ast visitGetCharF(exprParser.GetCharFContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Ast visitOrdF(exprParser.OrdFContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Ast visitCharF(exprParser.CharFContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Ast visitSizeF(exprParser.SizeFContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Ast visitSubstringF(exprParser.SubstringFContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Ast visitConcatenateF(exprParser.ConcatenateFContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Ast visitExitF(exprParser.ExitFContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Ast visitAffect(exprParser.AffectContext ctx) {
        Ast left = ctx.getChild(0).accept(this);
        if (ctx.affexpr == null) {
            return left;
        }
        Ast right = ctx.affexpr.accept(this);
        return new Affect(left, right);
    }

    @Override
    public Ast visitOr(exprParser.OrContext ctx) {
        Ast tempNode = ctx.getChild(0).accept(this);
        for (AndexprContext el : ctx.expror) {
            Ast right = el.accept(this);
            tempNode = new OrNode(tempNode, right);

        }
        return tempNode;
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
        Ast tempNode = ctx.getChild(0).accept(this);
        for (DivexprContext el : ctx.exprplus) {
            Ast right = el.accept(this);
            tempNode = new Plus(tempNode, right);

        }
        return tempNode;
    }

    @Override
    public Ast visitField_Create(exprParser.Field_CreateContext ctx) {
        ArrayList<String> idTypes = new ArrayList<String>();
        ArrayList<Ast> fieldexpr = new ArrayList<Ast>();

        for (Token ids : ctx.fieldid) {
            idTypes.add(ids.getText());
        }
        for (ExprsoloContext field : ctx.fieldex) {
            fieldexpr.add(field.accept(this));
        }

        // Création des sous AST
        return new FieldDecl(idTypes, fieldexpr);
    }

    // @Override
    // public Ast visitFreturn(exprParser.FreturnContext ctx) {
    // return new Return(ctx.getChild(2).accept(this));
    // }

    @Override
    public Ast visitPrints(exprParser.PrintsContext ctx) {
        return new PrintExpr(ctx.getChild(2).accept(this));
    }

    @Override
    public Ast visitPrinti(exprParser.PrintiContext ctx) {
        return new PrintInt(ctx.getChild(2).accept(this));
    }

    @Override
    public Ast visitFlush(exprParser.FlushContext ctx) {
        return new Flush();
    }

    @Override
    public Ast visitGetchar(exprParser.GetcharContext ctx) {
        return new GetChar();
    }

    @Override
    public Ast visitOrd(exprParser.OrdContext ctx) {
        return new Ord(ctx.ordel.toString());
    }

    @Override
    public Ast visitSize(exprParser.SizeContext ctx) {
        return new Size(ctx.sizeel.toString());
    }

    @Override
    public Ast visitSubstring(exprParser.SubstringContext ctx) {
        return new Substring(ctx.sstrel.toString(), ctx.sstrind.toString(), ctx.sstrlen.toString());
    }

    @Override
    public Ast visitNotF(exprParser.NotFContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Ast visitTypeIdF(exprParser.TypeIdFContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Ast visitTyfields(exprParser.TyfieldsContext ctx) {
        if (ctx.tyfield != null) {
            return ctx.tyfield.accept(this);
        } else {
            return visitChildren(ctx);
        }
    }

    @Override
    public Ast visitDeclArrayOfTyfields(exprParser.DeclArrayOfTyfieldsContext ctx) {
        return new TypeId(ctx.getChild(2).getText());
    }

    @Override
    public Ast visitType_Fields(exprParser.Type_FieldsContext ctx) {
        ArrayList<Ast> typefieldList = new ArrayList<Ast>();
        for (TypefieldContext typefield : ctx.tyfield) {
            typefieldList.add(typefield.accept(this));
        }
        return new TypeFields(typefieldList);
    }

    @Override
    public Ast visitType_Field(exprParser.Type_FieldContext ctx) {
        return new TypeField(ctx.getChild(0).getText(), ctx.getChild(2).getText());
    }

    @Override
    public Ast visitTypeid(exprParser.TypeidContext ctx) {
        if (ctx.getChild(0) == null) {
            return new TypeId("void");
        }
        return new TypeId(ctx.getChild(0).toString());
    }

    @Override
    public Ast visitAnd(exprParser.AndContext ctx) {
        Ast tempNode = ctx.getChild(0).accept(this);
        for (BoolexprContext el : ctx.exprand) {
            Ast right = el.accept(this);
            tempNode = new AndNode(tempNode, right);

        }
        return tempNode;
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
        Ast tempNode = ctx.getChild(0).accept(this);
        for (MultexprContext el : ctx.exprdiv) {
            Ast right = el.accept(this);
            tempNode = new Div(tempNode, right);

        }
        return tempNode;
    }

    @Override
    public Ast visitExit(exprParser.ExitContext ctx) {
        IntNode value = new IntNode(ctx.exitel.getText());
        return new Exit(value);
    }

    @Override
    public Ast visitExprList(exprParser.ExprListContext ctx) {
        ArrayList<Ast> exprList = new ArrayList<Ast>();
        for (ExprsoloContext expr : ctx.exprlist) {
            exprList.add(expr.accept(this));
        }
        return new ExprList(exprList);
    }

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
        Ast tempNode = ctx.getChild(0).accept(this);
        for (AddexprContext el : ctx.exprminus) {
            Ast right = el.accept(this);
            tempNode = new Minus(tempNode, right);

        }
        return tempNode;
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
