package tds;

import java.util.ArrayList;

import ast.Affect;
import ast.AndNode;
import ast.Ast;
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
        affect.accept(this);
        return null;

    }

    @Override
    public Tds visit(AndNode affect) {
        affect.left.accept(this);
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
        for (Ast ast : affect.declElement) {
            Tds declaration = ast.accept(this);
            if (declaration != null) {

            }
        }
        return null;
    }

    @Override
    public Tds visit(DiffNode affect) {
        return null;
    }

    @Override
    public Tds visit(Div affect) {
        affect.accept(this);
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
        int shift = -affect.fieldIds.size();
        for (int i = 0; i < affect.fieldIds.size(); i++) {
            Param par = new Param(affect.fieldIds.get(i), "", shift + i);
            allTds.get(bloc - 1).addSymbol(par);
            affect.fieldTypes.get(i).accept(this);

        }
        return null;
    }

    @Override
    public Tds visit(FieldElement affect) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(FieldExpr affect) {
        return null;
    }

    @Override
    public Tds visit(Flush affect) {
        return null;
    }

    @Override
    public Tds visit(For affect) {
        return affect.expressions.accept(this);
    }

    @Override
    public Tds visit(FuncDecl affect) {
        Tds func = new Tds(imbrication, new ArrayList<Symbol>(), bloc);

        func.setParent(allTds.get(bloc - 1));
        func.setName(affect.Idf.name);
        allTds.add(func);
        bloc++;
        imbrication++;
        if (affect.fieldDecl != null) {
            affect.fieldDecl.accept(this);
        }
        if (affect.expressions != null) {
            affect.expressions.accept(this);
        }
        imbrication--;
        ArrayList<Param> params = new ArrayList<Param>();
        for (Symbol el : func.getSymbols()) {
            if (el instanceof Param) {
                params.add((Param) el);
            }
        }
        bloc--;
        if (affect.typeId != null) {
            Function function = new Function(affect.Idf.name, params, imbrication, "", bloc);
            allTds.get(bloc - 1).addSymbol(function);
            System.out.println(affect.typeId.toString());
            affect.typeId.accept(this);

        } else {
            Function function = new Function(affect.Idf.name, params, imbrication, "void", bloc);
            allTds.get(bloc - 1).addSymbol(function);
        }
        bloc++;
        return func;
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
        return affect.ifExpr.accept(this);
    }

    @Override
    public Tds visit(IfThenElse affect) {
        Tds ifTds = affect.ifExpr.accept(this);
        Tds elseTds = affect.elseExpr.accept(this);

        if (ifTds != null && elseTds != null) {
            Tds pere = allTds.get(bloc - 1);
            for (int k = 0; k < allTds.size(); k++) {
                Tds temp = allTds.get(k);
                if (temp.getImbric() == elseTds.getImbric() - 1) {
                    if (temp.getBloc() > pere.getBloc()) {
                        pere = temp;
                    }
                }
            }
            elseTds.setParent(pere);
            pere.addEnfant(elseTds);

            return ifTds;

        } else if (ifTds != null) {
            allTds.add(ifTds);
            return ifTds;
        } else if (elseTds != null) {
            allTds.add(elseTds);
            return elseTds;
        } else {
            return null;
        }
    }

    @Override
    public Tds visit(InfEqNode affect) {
        affect.accept(this);
        return null;

    }

    @Override
    public Tds visit(InfNode affect) {
        affect.accept(this);
        return null;

    }

    @Override
    public Tds visit(IntNode affect) {
        return null;
    }

    @Override
    public Tds visit(LetNode affect) {
        affect.declList.accept(this);
        affect.exprSeq.accept(this);
        return null;
    }

    @Override
    public Tds visit(Lvalue affect) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(Minus affect) {
        affect.accept(this);
        return null;

    }

    @Override
    public Tds visit(Mult affect) {
        affect.left.accept(this);
        return null;

    }

    @Override
    public Tds visit(Not affect) {
        affect.accept(this);
        return null;

    }

    @Override
    public Tds visit(Ord affect) {
        return null;
    }

    @Override
    public Tds visit(OrNode affect) {
        affect.accept(this);
        return null;

    }

    @Override
    public Tds visit(Plus affect) {
        affect.left.accept(this);
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
        Tds origin = new Tds(imbrication, new ArrayList<Symbol>(), bloc);
        origin.setName("Main");
        allTds.add(origin);
        bloc++;
        imbrication++;

        affect.expressions.accept(this);

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
        affect.accept(this);
        return null;
    }

    @Override
    public Tds visit(SupNode affect) {
        affect.accept(this);
        return null;

    }

    @Override
    public Tds visit(TypeDecl affect) {
        // TODO faire en sorte que la déclaratoin de type puisse etre affiché dans la
        // tds
        Type type = new Type(affect.typeid.toString(), affect.type.toString(), bloc);
        this.allTds.get(bloc - 1).addSymbol(type);
        System.out.println("Salut");

        // affect.typeid.accept(this);
        // affect.type.accept(this);
        return null;
    }

    @Override
    public Tds visit(TypeFields affect) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Tds visit(TypeId affect) {
        this.allTds.get(bloc - 1).getSymbols()
                .get(this.allTds.get(bloc - 1).getSymbols().size() - 1).setType(affect.value);
        return null;
    }

    @Override
    public Tds visit(VarDecl affect) {
        if (affect.typeId != null) {
            Var var = new Var(affect.Idf.name, affect.typeId.value, bloc);
            this.allTds.get(bloc - 1).addSymbol(var);
        } else {
            Var var = new Var(affect.Idf.name, "int", bloc);
            this.allTds.get(bloc - 1).addSymbol(var);
        }

        return null;
    }

    @Override
    public Tds visit(While affect) {
        return affect.expressions.accept(this);
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