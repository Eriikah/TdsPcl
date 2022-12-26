package tds;

import java.util.ArrayList;

import ast.Affect;
import ast.AndNode;
import ast.AstVisitor;
import ast.Break;
import ast.Chr;
import ast.Concat;
import ast.DeclList;
import ast.DiffNode;
import ast.Div;
import ast.EqNode;
import ast.Exit;
import ast.ExprList;
import ast.FieldDecl;
import ast.FieldElement;
import ast.FieldExpr;
import ast.Flush;
import ast.For;
import ast.FuncDecl;
import ast.FunctionCall;
import ast.GetChar;
import ast.Idf;
import ast.IfThen;
import ast.IfThenElse;
import ast.InfEqNode;
import ast.InfNode;
import ast.IntNode;
import ast.LetNode;
import ast.List;
import ast.ListDecl;
import ast.Lvalue;
import ast.Minus;
import ast.Mult;
import ast.Not;
import ast.OrNode;
import ast.Ord;
import ast.Plus;
import ast.PrintExpr;
import ast.PrintInt;
import ast.Program;
import ast.Return;
import ast.Size;
import ast.StringNode;
import ast.Subscript;
import ast.Substring;
import ast.SupEqNode;
import ast.SupNode;
import ast.TypeDecl;
import ast.TypeField;
import ast.TypeFields;
import ast.TypeId;
import ast.VarDecl;
import ast.While;

public class TdsCreator implements AstVisitor<Tds> {

    public ArrayList<Tds> allTds;
    public int imbrication;
    public int bloc;

    public TdsCreator() {
        allTds = new ArrayList<Tds>();
        imbrication = 0;
        bloc = 0;
    }

    @Override
    public Tds visit(Affect affect) {
        return null;
    }

    @Override
    public Tds visit(AndNode affect) {
        return null;
    }

    @Override
    public Tds visit(Chr affect) {
        return null;
    }

    @Override
    public Tds visit(Concat affect) {
        return null;
    }

    @Override
    public Tds visit(DeclList affect) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(DiffNode affect) {
        return null;
    }

    @Override
    public Tds visit(Div affect) {
        return null;
    }

    @Override
    public Tds visit(EqNode affect) {
        return null;
    }

    @Override
    public Tds visit(Exit affect) {
        return null;
    }

    @Override
    public Tds visit(ExprList affect) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(FieldDecl affect) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(FieldElement affect) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(FieldExpr affect) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(Flush affect) {
        return null;
    }

    @Override
    public Tds visit(For affect) {
        return null;
    }

    @Override
    public Tds visit(FuncDecl affect) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(FunctionCall affect) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(GetChar affect) {
        return null;
    }

    @Override
    public Tds visit(Idf affect) {
        return null;
    }

    @Override
    public Tds visit(IfThen affect) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(IfThenElse affect) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(InfEqNode affect) {
        return null;
    }

    @Override
    public Tds visit(InfNode affect) {
        return null;
    }

    @Override
    public Tds visit(IntNode affect) {
        return null;
    }

    @Override
    public Tds visit(LetNode affect) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(Lvalue affect) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(Minus affect) {
        return null;
    }

    @Override
    public Tds visit(Mult affect) {
        return null;
    }

    @Override
    public Tds visit(Not affect) {
        return null;
    }

    @Override
    public Tds visit(Ord affect) {
        return null;
    }

    @Override
    public Tds visit(OrNode affect) {
        return null;
    }

    @Override
    public Tds visit(Plus affect) {
        return null;
    }

    @Override
    public Tds visit(PrintExpr affect) {
        return null;
    }

    @Override
    public Tds visit(PrintInt affect) {
        return null;
    }

    @Override
    public Tds visit(Program affect) {
        Tds origin = new Tds(imbrication, null, bloc);
        allTds.add(origin);
        bloc++;
        imbrication++;

        Tds enfant = affect.expressions.accept(this);
        origin.addEnfant(enfant);
        enfant.setParent(origin);

        imbrication--;
        return origin;
    }

    @Override
    public Tds visit(Return affect) {
        return null;
    }

    @Override
    public Tds visit(Size affect) {
        return null;
    }

    @Override
    public Tds visit(StringNode affect) {
        return null;
    }

    @Override
    public Tds visit(Subscript affect) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(Substring affect) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(SupEqNode affect) {
        return null;
    }

    @Override
    public Tds visit(SupNode affect) {
        return null;
    }

    @Override
    public Tds visit(TypeDecl affect) {
        Param type = new Param(affect.typeid.toString(), "type", bloc);
        this.allTds.get(bloc).addSymbol(type);
        return null;
    }

    @Override
    public Tds visit(TypeFields affect) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(TypeId affect) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(VarDecl affect) {
        Param var = new Param(affect.Idf.name, "var", bloc);
        this.allTds.get(bloc).addSymbol(var);
        return null;
    }

    @Override
    public Tds visit(While affect) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(TypeField typeField) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(List list) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(ListDecl listDecl) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(Break break1) {
        return null;
    }

}
