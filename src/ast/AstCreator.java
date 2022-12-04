package ast;

import parser.exprParser;
import parser.exprBaseVisitor;

public class AstCreator extends exprBaseVisitor<Ast> {

    @Override
    public Ast visitAffect(exprParser.AffectContext ctx) {
        Ast expr = ctx.getChild(2).accept(this);
		String idfString = ctx.getChild(0).toString();
	
		//Création des sous AST
		Idf idf = new Idf(idfString);
	
		return new Affect(idf,expr);

    }

    @Override
    public Ast visitAnd(exprParser.AndContext ctx) {
        Ast left = ctx.getChild(0).accept(this);
        Ast right = ctx.getChild(2).accept(this);
        return new AndNode(left, right);
    }

    @Override
    public Ast visitChr(exprParser.ChrContext ctx) {
        String value = ctx.getChild(2).toString();
        return new Chr(value);
    }

   /*  @Override
    public Ast visitConcat(exprParser.ConcatContext ctx) {
        String left = ctx.getChild(0).toString();
        String right = ctx.getChild(2).toString();
        return new Concat(left, right);
    } */

    @Override
    public Ast visitDecl(exprParser.DeclContext ctx) {
        return ctx.getChild(0).accept(this);
    }

/*     @Override
    public Ast visitDeclList(exprParser.DeclListContext ctx) {
        DeclList declList = new DeclList();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            declList.add((Decl) ctx.getChild(i).accept(this));
        }
        
        Ast left = ctx.getChild(0).accept(this);
        Ast right = ctx.getChild(2).accept(this);
        return new DeclList(left, right);
    } */

   /*  @Override
    public Ast visitDiffNode(exprParser.DiffNodeContext ctx) {
        Ast left = ctx.getChild(0).accept(this);
        Ast right = ctx.getChild(2).accept(this);
        return new DiffNode(left, right);
    } */

    @Override
    public Ast visitDiv(exprParser.DivContext ctx) {
        Ast left = ctx.getChild(0).accept(this);
        Ast right = ctx.getChild(2).accept(this);
        return new Div(left, right);
    }

   /* @Override
    public Ast visitEqNode(exprParser.EqContext ctx) {
        Ast left = ctx.getChild(0).accept(this);
        Ast right = ctx.getChild(2).accept(this);
        return new Eq(left, right);
    } */

    @Override
    public Ast visitExit(exprParser.ExitContext ctx) {
        int value = Integer.parseInt(ctx.getChild(2).toString());
        return new Exit(value);
    }

  /*   @Override
    public Ast visitExitIdf(exprParser.ExitIdfContext ctx) {
        String value = ctx.getChild(2).toString();
        return new ExitIdf(value);
    } */

    @Override
    public Ast visitExprList(exprParser.ExprListContext ctx) {
        ExprList exprList = new ExprList();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            exprList.addExpr(ctx.getChild(i).accept(this));
        }
        return exprList;
    }

    @Override
    public Ast visitExprSeq(exprParser.ExprSeqContext ctx) {
        ExprSeq exprSeq = new ExprSeq();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            exprSeq.addExprSeq(ctx.getChild(i).accept(this));
        }
        return exprSeq;
    }

   /*  @Override
    public Ast visitFieldDecl(exprParser.FieldDeclContext ctx) {
        FieldDecl fieldDecl = new FieldDecl();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            fieldDecl.addFieldElement(ctx.getChild(i).accept(this));
        }
        return fieldDecl; 
    }  */

    /*@Override
    public Ast visitFieldElement(exprParser.FieldElementContext ctx) {
        String idfString = ctx.getChild(0).toString();
        Ast expr = ctx.getChild(2).accept(this);
        return new FieldElement(idfString, expr);
    }  */

    @Override
    public Ast visitFor(exprParser.ForContext ctx) {
        String idfString = ctx.getChild(1).toString();
        Ast expr = ctx.getChild(3).accept(this);
        Ast exprSeq = ctx.getChild(5).accept(this);
        Ast exprSeq2 = ctx.getChild(7).accept(this);

        //Création des sous AST
		Idf idf = new Idf(idfString);

        return new For(idf, expr, exprSeq, exprSeq2);
    }

 /*    @Override
    public Ast visitFuncdecl(exprParser.FuncdeclContext ctx) {
        String idfString = ctx.getChild(1).toString();
        Ast exprSeq = ctx.getChild(3).accept(this);
        Ast exprSeq2 = ctx.getChild(5).accept(this);

        //Création des sous AST
        Idf idf = new Idf(idfString);
        return new FuncDecl(idf, exprSeq, exprSeq2);
    } */

   /*  @Override
    public Ast visitFunctionCall(exprParser.FunctionCallContext ctx) {
        String idfString = ctx.getChild(0).toString();
        ExprList exprList = ctx.getChild(2).accept(this);

        //Création des sous AST
        Idf idf = new Idf(idfString);
        return new FunctionCall(idf, exprList);
    } */

  /*   @Override
    public Ast visitIdentifier(exprParser.IdentifierContext ctx) { 
		return new Idf(ctx.getChild(0).toString());
	} */

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
    public Ast visitPrintInt(exprParser.PrintIntContext ctx) {
        Ast expr = ctx.getChild(2).accept(this);
        return new PrintInt(expr);
    }

    @Override
    public Ast visitProgram(exprParser.ProgramContext ctx) { 

		Ast child = ctx.getChild(0).accept(this);
		return new Program(child);
	}

    @Override
    public Ast visitVarDecl(exprParser.VarDeclContext ctx) {
        //Récupération des noeuds fils
        Ast expr = ctx.getChild(3).accept(this);
        String idfString = ctx.getChild(1).toString();
        FieldDecl fieldDecl = (FieldDecl) ctx.getChild(2).accept(this);
        TypeId typeId = (TypeId) ctx.getChild(0).accept(this);

        //Création des sous AST
        Idf idf = new Idf(idfString);

        return new VarDecl(idf, fieldDecl, typeId, expr);
    }

    
}
