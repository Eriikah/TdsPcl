package semantique;

import ast.*;
import tds.*;

import java.util.ArrayList;

public class ControlVisitor implements AstVisitor<Integer> {
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
            if (tds.getName().equals("Main")) {
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
        int error = affect.left.accept(this);
        error += affect.right.accept(this);

        return error;
    }

    public Integer visit(AndNode affect) {
        int error = affect.left.accept(this);
        error += affect.right.accept(this);

        return error;
    }

    public Integer visit(Chr affect) {
        int error = 0;
        // TODO tests de retours de fonction
        return error;
    }

    public Integer visit(Concat affect) {
        int error = 0;
        // TODO tests de retours de fonction
        return error;
    }

    public Integer visit(DeclList affect) {
        int error = 0;
        for (Ast el : affect.declElement) {
            error += el.accept(this);
        }
        return error;
    }

    public Integer visit(DiffNode affect) {
        int error = affect.left.accept(this);
        error += affect.right.accept(this);

        error += new BinOpTypeControl(affect, currentTds, tdsList).control();

        return error;
    }

    public Integer visit(Div affect) {
        int error = affect.left.accept(this);
        error += affect.right.accept(this);

        error += new BinOpTypeControl(affect, currentTds, tdsList).control();

        return error;
    }

    public Integer visit(EqNode affect) {
        int error = affect.left.accept(this);
        error += affect.right.accept(this);

        error += new BinOpTypeControl(affect, currentTds, tdsList).control();

        return error;
    }

    public Integer visit(Exit affect) {
        int error = 0;
        // TODO tests de retours de fonction
        return error;
    }

    public Integer visit(ExprList affect) {
        int error = 0;
        for (Ast elAst : affect.expressions) {
            error += elAst.accept(this);
        }
        return error;
    }

    public Integer visit(FieldDecl affect) {
        int error = 0;
        for (Ast fieldDecl : affect.fieldTypes) {
            error += ((TypeId) fieldDecl).accept(this);
        }
        return error;
    }

    public Integer visit(FieldElement affect) {
        int error = 0;
        error += affect.typeid.accept(this);
        return error;
    }

    public Integer visit(FieldExpr affect) {
        int error = 0;
        return error;
    }

    public Integer visit(Flush affect) {
        int error = 0;
        // TODO tests de retours de fonction
        return error;
    }

    public Integer visit(For affect) {
        int error = 0;
        Tds prevTds = this.currentTds;
        this.currentTds = getTds(affect.Idf.name);
        error += affect.expressions.accept(this);
        error += affect.goalExpr.accept(this);
        error += affect.origExpr.accept(this);
        this.currentTds = prevTds;
        return error;
    }

    public Integer visit(FuncDecl affect) {
        int error = 0;
        Tds prevTds = this.currentTds;
        this.currentTds = getTds(affect.Idf.name);
        error += affect.expressions.accept(this);
        if (affect.fieldDecl != null) {
            error += affect.fieldDecl.accept(this);
        }
        if (affect.typeId != null) {
            error += affect.typeId.accept(this);
        }
        this.currentTds = prevTds;
        return error;
    }

    public Integer visit(FunctionCall affect) {
        int error = 0;
        DeclarationControl test = new DeclarationControl(affect, getTds(affect.Idf.name), tdsList);
        error += test.control();
        if (error == 0) {
            ParamNumControl testParamNumControl = new ParamNumControl(affect, currentTds, tdsList);
            error += testParamNumControl.control();
            if (error == 0) {
                ParamTypeControl testParamTypeControl = new ParamTypeControl(affect, currentTds, tdsList);
                error += testParamTypeControl.control();
            }

        }
        return error;
    }

    public Integer visit(GetChar affect) {
        int error = 0;
        // TODO tests de retours de fonction
        return error;
    }

    public Integer visit(Idf affect) {
        int error = 0;
        error += (new DeclarationControl(affect, currentTds, tdsList)).control();
        return error;
    }

    public Integer visit(IfThen affect) {
        int error = 0;

        error += affect.expressions.accept(this);
        error += affect.ifExpr.accept(this);
        return error;
    }

    public Integer visit(IfThenElse affect) {
        int error = 0;
        IfThenElseTypeControl ifControl = new IfThenElseTypeControl(affect, currentTds, tdsList);
        error += affect.elseExpr.accept(this);
        error += affect.ifExpr.accept(this);
        error += affect.expressions.accept(this);
        if (error == 0) {
            error += ifControl.control();
        }
        return error;
    }

    public Integer visit(InfEqNode affect) {
        int error = affect.left.accept(this);
        error += affect.right.accept(this);

        error += new BinOpTypeControl(affect, currentTds, tdsList).control();

        return error;
    }

    public Integer visit(InfNode affect) {
        int error = affect.left.accept(this);
        error += affect.right.accept(this);

        error += new BinOpTypeControl(affect, currentTds, tdsList).control();

        return error;
    }

    public Integer visit(IntNode affect) {
        return 0;
    }

    public Integer visit(LetNode affect) {
        int error = 0;
        error += affect.declList.accept(this);
        error += affect.exprSeq.accept(this);
        return error;
    }

    public Integer visit(Lvalue affect) {
        int error = 0;
        // TODO trouver pourquoi le visiteur passe pas par la
        error += affect.Idf.accept(this);
        for (Ast el : affect.lvalueSubs) {
            error += el.accept(this);
        }
        return error;
    }

    public Integer visit(Minus affect) {
        int error = affect.left.accept(this);
        error += affect.right.accept(this);

        error += new BinOpTypeControl(affect, currentTds, tdsList).control();

        return error;
    }

    public Integer visit(Mult affect) {
        int error = affect.left.accept(this);
        error += affect.right.accept(this);

        error += new BinOpTypeControl(affect, currentTds, tdsList).control();

        return error;
    }

    public Integer visit(Not affect) {
        int error = 0;
        // TODO tests de retours de fonction
        return error;
    }

    public Integer visit(Ord affect) {
        int error = 0;
        // TODO tests de retours de fonction
        return error;
    }

    public Integer visit(OrNode affect) {
        int error = affect.left.accept(this);
        error += affect.right.accept(this);

        error += new BinOpTypeControl(affect, currentTds, tdsList).control();

        return error;
    }

    public Integer visit(Plus affect) {
        int error = affect.left.accept(this);
        error += affect.right.accept(this);

        error += new BinOpTypeControl(affect, currentTds, tdsList).control();

        return error;
    }

    public Integer visit(PrintExpr affect) {
        int error = 0;
        // TODO tests de retours de fonction
        return error;
    }

    public Integer visit(PrintInt affect) {
        int error = 0;
        // TODO tests de retours de fonction
        return error;
    }

    public Integer visit(Program affect) {
        this.currentTds = getFirstTds();
        NoMultipleDeclControl test = new NoMultipleDeclControl(affect, currentTds, tdsList);
        int error = test.control();
        error += affect.expressions.accept(this);
        return error;
    }

    public Integer visit(Return affect) {
        int error = 0;
        error += affect.expressions.accept(this);
        return error;
    }

    public Integer visit(Size affect) {
        int error = 0;
        // TODO tests de retours de fonction
        return error;
    }

    public Integer visit(StringNode affect) {
        return 0;
    }

    public Integer visit(Subscript affect) {
        int error = affect.expression.accept(this);
        return error;
    }

    public Integer visit(Substring affect) {
        int error = 0;
        // TODO tests de retours de fonction
        return error;
    }

    public Integer visit(SupEqNode affect) {
        int error = affect.left.accept(this);
        error += affect.right.accept(this);

        error += new BinOpTypeControl(affect, currentTds, tdsList).control();

        return error;
    }

    public Integer visit(SupNode affect) {
        int error = affect.left.accept(this);
        error += affect.right.accept(this);

        error += new BinOpTypeControl(affect, currentTds, tdsList).control();

        return error;
    }

    public Integer visit(TypeDecl affect) {
        int error = 0;
        error += affect.typeid.accept(this);
        return error;
    }

    public Integer visit(TypeFields affect) {
        int error = 0;
        for (Ast typeField : affect.typeField) {
            error += ((TypeField) typeField).accept(this);
        }
        return error;
    }

    public Integer visit(TypeId affect) {
        int error = 0;
        DeclarationControl declCont = new DeclarationControl(affect, currentTds, tdsList);
        error += declCont.control();
        return error;
    }

    public Integer visit(VarDecl affect) {
        int error = 0;
        error += affect.expressions.accept(this);
        if (affect.fieldDecl != null) {
            error += affect.fieldDecl.accept(this);

        }
        if (affect.typeId != null) {
            error += affect.typeId.accept(this);
        }
        return error;
    }

    public Integer visit(While affect) {
        int error = 0;
        error += affect.cond.accept(this);
        error += affect.expressions.accept(this);
        return error;
    }

    public Integer visit(TypeField affect) {
        int error = 0;
        DeclarationControl declCont = new DeclarationControl(affect, currentTds, tdsList);
        error += declCont.control();
        return error;
    }

    public Integer visit(List affect) {
        int error = 0;
        error += affect.fieldCreate.accept(this);
        error += affect.typeid.accept(this);
        return error;
    }

    public Integer visit(ListDecl affect) {
        int error = 0;
        error += affect.ofexpr.accept(this);
        error += affect.typeId.accept(this);
        error += affect.list.accept(this);
        return error;
    }

    public Integer visit(Break affect) {
        int error = 0;
        // TODO tests de retours de fonction
        return error;
    }

}
