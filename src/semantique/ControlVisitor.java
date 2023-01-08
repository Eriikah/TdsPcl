package semantique;

import ast.*;
import tds.*;

import java.util.ArrayList;

public class ControlVisitor implements AstVisitor<Integer>{
    private Tds currentTds;
    private ArrayList<Tds> tdsList;
    private ArrayList<String> visitedTds;

    public ControlVisitor(ArrayList<Tds> tdsList) {
        this.currentTds = null;
        this.tdsList = tdsList;
        this.visitedTds = new ArrayList<>();
    }

    public Tds getFirstTds() {
        for (Tds tds : this.tdsList) {
            if (tds.getName().equals("main")) {
                return tds;
            }
        }
        return null;
    }

    public Tds getTds(String name) {
        for (Tds tds : this.tdsList) {
            if (tds.getName().equals(name)) {
                return tds;
            }
        }
        return null;
    }

    public Tds nextTds() {
        boolean visité;
        for (Tds tds : this.currentTds.getEnfants()) {
            visité = false;
            for (String name : this.visitedTds) {
                if (name.equals(tds.getName())) {
                    visité = true;
                }
            }
            if (!visité) {
                return tds;
            }
        }
        return null;
    }

    public Tds previouTds() {
        return this.currentTds.getParent();
    }

    public Integer visit(Affect affect) {
        affect.accept(this);
        return null;
    }

    public Integer visit(AndNode affect) {
        affect.left.accept(this);
        return null;
    }

    public Integer visit(Chr affect) {
        return null;
    }

    public Integer visit(Concat affect) {
        return null;
    }

    public Integer visit(DeclList affect) {
        return null;
    }

    public Integer visit(DiffNode affect) {
        return null;
    }

    public Integer visit(Div affect) {
        affect.accept(this);
        return null;
    }

    public Integer visit(EqNode affect) {
        return null;
    }

    public Integer visit(Exit affect) {
        return null;
    }

    public Integer visit(ExprList affect) {
        return null;
    }

    public Integer visit(FieldDecl affect) {
        return null;
    }

    public Integer visit(FieldElement affect) {
        return null;
    }

    public Integer visit(FieldExpr affect) {
        return null;
    }

    public Integer visit(Flush affect) {
        return null;
    }

    public Integer visit(For affect) {
        return null;
    }

    public Integer visit(FuncDecl affect) {
        return null;
    }

    public Integer visit(FunctionCall affect) {
        return null;
    }

    public Integer visit(GetChar affect) {
        return null;
    }

    public Integer visit(Idf affect) {
        return null;
    }

    public Integer visit(IfThen affect) {
        return null;
    }

    public Integer visit(IfThenElse affect) {
        return null;
    }

    public Integer visit(InfEqNode affect) {
        return null;
    }

    public Integer visit(InfNode affect) {
        return null;
    }

    public Integer visit(IntNode affect) {
        return null;
    }

    public Integer visit(LetNode affect) {
        return null;
    }

    public Integer visit(Lvalue affect) {
        return null;
    }

    public Integer visit(Minus affect) {
        return null;
    }

    public Integer visit(Mult affect) {
        return null;
    }

    public Integer visit(Not affect) {
        return null;
    }

    public Integer visit(Ord affect) {
        return null;
    }

    public Integer visit(OrNode affect) {
        return null;
    }

    public Integer visit(Plus affect) {
        return null;
    }

    public Integer visit(PrintExpr affect) {
        return null;
    }

    public Integer visit(PrintInt affect) {
        return null;
    }

    public Integer visit(Program affect) {
        return null;
    }

    public Integer visit(Return affect) {
        return null;
    }

    public Integer visit(Size affect) {
        return null;
    }

    public Integer visit(StringNode affect) {
        return null;
    }

    public Integer visit(Subscript affect) {
        return null;
    }

    public Integer visit(Substring affect) {
        return null;
    }

    public Integer visit(SupEqNode affect) {
        return null;
    }

    public Integer visit(SupNode affect) {
        return null;
    }

    public Integer visit(TypeDecl affect) {
        return null;
    }

    public Integer visit(TypeFields affect) {
        return null;
    }

    public Integer visit(TypeId affect) {
        return null;
    }

    public Integer visit(VarDecl affect) {
        return null;
    }

    public Integer visit(While affect) {
        return null;
    }

    public Integer visit(TypeField affect) {
        return null;
    }

    public Integer visit(List affect) {
        return null;
    }

    public Integer visit(ListDecl affect) {
        return null;
    }

    public Integer visit(Break affect) {
        return null;
    }
    
}
