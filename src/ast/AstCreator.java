package ast;

import parser.exprParser;
import parser.exprBaseVisitor;

public class AstCreator extends exprBaseVisitor<Ast> {

    

    @Override
    public Ast visitDecl(exprParser.DeclContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public Ast visitProgram(exprParser.ProgramContext ctx) { 

		Ast child = ctx.getChild(0).accept(this);
		return new Program(child);
	}

    @Override
    public Ast visitPrintInt(exprParser.PrintIntContext ctx) {
        Ast expr = ctx.getChild(2).accept(this);
        return new PrintInt(expr);
    }

    @Override
    public Ast visitVarDecl(exprParser.VarDeclContext ctx) {
        //Récupération des noeuds fils
        Ast expr = ctx.getChild(3).accept(this);
        String idfString = ctx.getChild(1).toString();

        //Création des sous AST
        Idf idf = new Idf(idfString);

        return new VarDecl(idf,expr);
    }
    
    @Override
    public Ast visitVarDeclWithIdf (exprParser.VarDeclWithIdfContext ctx) {
        //Récupération des noeuds fils
        Ast expr = ctx.getChild(4).accept(this);
        String idfString = ctx.getChild(1).toString();
        String typeString = ctx.getChild(2).toString();

        //Création des sous AST
        Idf idf = new Idf(idfString);

        return new VarDeclWithIdf(idf,typeString,expr);
    }

    
}
