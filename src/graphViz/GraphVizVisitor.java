package graphViz;

import java.io.FileOutputStream;
import java.io.IOException;

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
import ast.VarDecl;
import ast.While;
import ast.PrintInt;

public class GraphVizVisitor implements AstVisitor<String> {
    private int state;
    private String nodeBuffer;
    private String linkBuffer;

    public GraphVizVisitor() {
        this.state = 0;
        this.nodeBuffer = "digraph \"ast\"{\n\n\tnodesep=1;\n\tranksep=1;\n\n";
        this.linkBuffer = "\n";
    }

    public void dumpGraph(String filepath) throws IOException {

        FileOutputStream output = new FileOutputStream(filepath);

        String buffer = this.nodeBuffer + this.linkBuffer + "}";
        byte[] strToBytes = buffer.getBytes();

        output.write(strToBytes);

        output.close();

    }

    private String nextState() {
        int returnedState = this.state;
        this.state++;
        return "N" + returnedState;
    }

    private void addTransition(String from, String dest) {
        this.linkBuffer += String.format("\t%s -> %s; \n", from, dest);

    }

    private void addNode(String node, String label) {
        this.nodeBuffer += String.format("\t%s [label=\"%s\", shape=\"box\"];\n", node, label);

    }

    @Override
    public String visit(Program program) {

        String nodeIdentifier = this.nextState();
        String instructionsState = program.expressions.accept(this);

        this.addNode(nodeIdentifier, "Program");
        this.addTransition(nodeIdentifier, instructionsState);

        return nodeIdentifier;

    }

    @Override
    public String visit(VarDecl varDecl) {
        String nodeIdentifier = this.nextState();

        String idfState = varDecl.Idf.accept(this);
        String exprState = varDecl.expressions.accept(this);
        this.addNode(nodeIdentifier, "VarDecl");
        this.addTransition(nodeIdentifier, idfState);
        this.addTransition(nodeIdentifier, exprState);

        return nodeIdentifier;
    }

    // @Override
    // public String visit(VarDeclWithIdf varDeclWithIdf) {
    // String nodeIdentifier = this.nextState();

    // String exprState = varDeclWithIdf.expressions.accept(this);
    // String idfState = varDeclWithIdf.Idf.accept(this);
    // String typeState = varDeclWithIdf.typeid;

    // this.addNode(nodeIdentifier, "VarDeclWithIdf");
    // this.addTransition(nodeIdentifier, exprState);
    // this.addTransition(nodeIdentifier, idfState);
    // this.addTransition(nodeIdentifier, typeState);

    // return nodeIdentifier;
    // }

    @Override
    public String visit(PrintInt printInt) {
        String nodeIdentifier = this.nextState();

        String valueState = printInt.expressions.accept(this);

        this.addNode(nodeIdentifier, "PrintInt");
        this.addTransition(nodeIdentifier, valueState);

        return nodeIdentifier;
    }

    @Override
    public String visit(Minus minus) {

        String nodeIdentifier = this.nextState();

        String leftState = minus.left.accept(this);
        String rightState = minus.right.accept(this);

        this.addNode(nodeIdentifier, "-");

        this.addTransition(nodeIdentifier, leftState);
        this.addTransition(nodeIdentifier, rightState);

        return nodeIdentifier;

    }

    @Override
    public String visit(Mult mult) {

        String nodeIdentifier = this.nextState();

        String leftState = mult.left.accept(this);
        String rightState = mult.right.accept(this);

        this.addNode(nodeIdentifier, "*");

        this.addTransition(nodeIdentifier, leftState);
        this.addTransition(nodeIdentifier, rightState);

        return nodeIdentifier;

    }

    @Override
    public String visit(Plus plus) {

        String nodeIdentifier = this.nextState();

        String leftState = plus.left.accept(this);
        String rightState = plus.right.accept(this);

        this.addNode(nodeIdentifier, "+");

        this.addTransition(nodeIdentifier, leftState);
        this.addTransition(nodeIdentifier, rightState);

        return nodeIdentifier;

    }

    @Override
    public String visit(PrintExpr print) {

        String nodeIdentifier = this.nextState();

        String valueState = print.expressions.accept(this);

        this.addNode(nodeIdentifier, "print");
        this.addTransition(nodeIdentifier, valueState);

        return nodeIdentifier;

    }

    @Override
    public String visit(Affect affect) {
        String nodeIdentifier = this.nextState();

        String leftState = affect.left.accept(this);
        String rightState = affect.right.accept(this);

        this.addNode(nodeIdentifier, "affect");
        this.addTransition(nodeIdentifier, leftState);
        this.addTransition(nodeIdentifier, rightState);

        return nodeIdentifier;
    }

    @Override
    public String visit(AndNode affect) {
        String nodeIdentifier = this.nextState();

        String leftState = affect.left.accept(this);
        String rightState = affect.right.accept(this);

        this.addNode(nodeIdentifier, "and");
        this.addTransition(nodeIdentifier, leftState);
        this.addTransition(nodeIdentifier, rightState);

        return nodeIdentifier;
    }

    @Override
    public String visit(Chr affect) {
        String nodeIdentifier = this.nextState();

        String valueState = affect.value;

        this.addNode(nodeIdentifier, "chr");
        this.addTransition(nodeIdentifier, valueState);

        return nodeIdentifier;
    }

    @Override
    public String visit(Concat affect) {
        String nodeIdentifier = this.nextState();

        String leftStringState = affect.leftString;
        String righStringState = affect.righString;

        this.addNode(nodeIdentifier, "concat");
        this.addTransition(nodeIdentifier, leftStringState);
        this.addTransition(nodeIdentifier, righStringState);

        return nodeIdentifier;
    }

    @Override
    public String visit(DeclList affect) {
        String nodeIdentifier = this.nextState();
        this.addNode(nodeIdentifier, "DeclList");

        for (Ast declElement : affect.declElement) {
            String declElementState = declElement.accept(this);
            this.addTransition(nodeIdentifier, declElementState);
        }
        return nodeIdentifier;
    }

    @Override
    public String visit(DiffNode affect) {
        String nodeIdentifier = this.nextState();

        String leftState = affect.left.accept(this);
        String rightState = affect.right.accept(this);

        this.addNode(nodeIdentifier, "<>");
        this.addTransition(nodeIdentifier, leftState);
        this.addTransition(nodeIdentifier, rightState);

        return nodeIdentifier;
    }

    @Override
    public String visit(Div div) {
        String nodeIdentifier = this.nextState();

        String leftState = div.left.accept(this);
        String rightState = div.right.accept(this);

        this.addNode(nodeIdentifier, "/");

        this.addTransition(nodeIdentifier, leftState);
        this.addTransition(nodeIdentifier, rightState);

        return nodeIdentifier;
    }

    @Override
    public String visit(EqNode eq) {
        String nodeIdentifier = this.nextState();

        String leftState = eq.left.accept(this);
        String rightState = eq.right.accept(this);

        this.addNode(nodeIdentifier, "=");

        this.addTransition(nodeIdentifier, leftState);
        this.addTransition(nodeIdentifier, rightState);

        return nodeIdentifier;
    }

    @Override
    public String visit(Exit affect) {
        String nodeIdentifier = this.nextState();

        String IntState = affect.value.accept(this);

        this.addNode(nodeIdentifier, "exit");

        this.addTransition(nodeIdentifier, IntState);

        return nodeIdentifier;
    }

    @Override
    public String visit(ExprList affect) {
        String nodeIdentifier = this.nextState();
        this.addNode(nodeIdentifier, "exprlist");

        for (Ast exprElement : affect.expressions) {
            String exprElementState = exprElement.accept(this);
            this.addTransition(nodeIdentifier, exprElementState);
        }
        return nodeIdentifier;
    }

    @Override
    public String visit(FieldDecl affect) {
        String nodeIdentifier = this.nextState();
        this.addNode(nodeIdentifier, "fielddecl");

        for (int i = 0; i < affect.fieldIds.size(); i++) {
            String id = affect.fieldIds.get(i);
            Ast type = affect.fieldTypes.get(i);
            this.addTransition(nodeIdentifier, FieldElement(id, type));
        }

        return nodeIdentifier;
    }

    public String FieldElement(String Id, Ast Type) {
        String nodeIdentifier = this.nextState();
        this.addNode(nodeIdentifier, "FieldElement");

        this.addTransition(nodeIdentifier, Id);
        this.addTransition(nodeIdentifier, Type.accept(this));

        return nodeIdentifier;
    }

    @Override
    public String visit(FieldElement affect) {
        String nodeIdentifier = this.nextState();
        this.addNode(nodeIdentifier, "field");

        String IdftState = affect.Idf.accept(this);
        String typeidState = affect.typeid.accept(this);
        this.addTransition(nodeIdentifier, IdftState);
        this.addTransition(nodeIdentifier, typeidState);

        return nodeIdentifier;
    }

    @Override
    public String visit(FieldExpr affect) {
        String nodeIdentifier = this.nextState();
        this.addNode(nodeIdentifier, "fieldexpr");

        String IdftState = affect.Idf;
        this.addTransition(nodeIdentifier, IdftState);

        return nodeIdentifier;
    }

    @Override
    public String visit(Flush affect) {
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier, "Flush");

        return nodeIdentifier;
    }

    @Override
    public String visit(For affect) {
        String nodeIdentifier = this.nextState();

        Idf Idf = affect.Idf;
        Ast origExpr = affect.origExpr;
        Ast goalExpr = affect.goalExpr;
        String expressionsState = affect.expressions.accept(this);

        this.addNode(nodeIdentifier, "For");

        this.addTransition(nodeIdentifier, ForInitNode(Idf, origExpr));
        this.addTransition(nodeIdentifier, ForLimitNode(goalExpr));
        this.addTransition(nodeIdentifier, expressionsState);

        return nodeIdentifier;
    }

    public String ForInitNode(Idf Idf, Ast origExpr) {
        String nodeIdentifier = this.nextState();

        String IdfState = Idf.accept(this);
        String origExprState = origExpr.accept(this);

        this.addNode(nodeIdentifier, "Init");

        this.addTransition(nodeIdentifier, IdfState);
        this.addTransition(nodeIdentifier, origExprState);

        return nodeIdentifier;
    }

    public String ForLimitNode(Ast goalExpr) {
        String nodeIdentifier = this.nextState();

        String goalExprState = goalExpr.accept(this);

        this.addNode(nodeIdentifier, "Limit");

        this.addTransition(nodeIdentifier, goalExprState);

        return nodeIdentifier;
    }

    @Override
    public String visit(FuncDecl affect) {
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier, "Funcdecl");

        String IdfState = affect.Idf.accept(this);
        this.addTransition(nodeIdentifier, IdfState);

        if (affect.fieldDecl != null) {
            String fieldDeclState = affect.fieldDecl.accept(this);
            this.addTransition(nodeIdentifier, fieldDeclState);
        }

        if (affect.typeId != null) {
            String TypeIdState = affect.typeId.accept(this);
            this.addTransition(nodeIdentifier, TypeIdState);
        } else {
            this.addTransition(nodeIdentifier, typevoid());
        }
        String expressionsState = affect.expressions.accept(this);
        this.addTransition(nodeIdentifier, expressionsState);

        return nodeIdentifier;
    }


    public String typevoid() {
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier, "void");

        return nodeIdentifier;
    }

    @Override
    public String visit(FunctionCall affect) {
        String nodeIdentifier = this.nextState();

        //Ast expr = affect.exprList;

        this.addNode(nodeIdentifier, "FunctionCall");

        //this.addNode(nodeIdentifier, affect.Idf.name);
        if (affect.exprList != null) {
            Ast exprListState = affect.exprList;
            Idf IdfState = affect.Idf;
            this.addTransition(nodeIdentifier, FunctionCallNode(IdfState, exprListState));
        }

        return nodeIdentifier;
    }

    public String FunctionCallNode(Idf idf,Ast FunctionName) {
        String nodeIdentifier = this.nextState();
        String FunctionNameState = FunctionName.accept(this);

        this.addNode(nodeIdentifier, idf.name);
        this.addTransition(nodeIdentifier, FunctionNameState);

        return nodeIdentifier;
    }

    @Override
    public String visit(GetChar affect) {
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier, "getchar");

        return nodeIdentifier;
    }

    @Override
    public String visit(Idf affect) {
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier, affect.name);

        return nodeIdentifier;
    }

    @Override
    public String visit(IfThen ifThen) {
        String nodeIdentifier = this.nextState();

        Ast conditionState = ifThen.ifExpr;
        Ast thenBlockState = ifThen.expressions;

        this.addNode(nodeIdentifier, "IfThen");

        this.addTransition(nodeIdentifier, CondNode(conditionState));
        this.addTransition(nodeIdentifier, ThenNode(thenBlockState));

        return nodeIdentifier;
    }

    @Override
    public String visit(IfThenElse ifThenElse) {
        String nodeIdentifier = this.nextState();

        Ast conditionState = ifThenElse.ifExpr;
        Ast thenBlockState = ifThenElse.expressions;
        Ast elseBlockState = ifThenElse.elseExpr;

        this.addNode(nodeIdentifier, "IfThenElse");

        this.addTransition(nodeIdentifier, CondNode(conditionState));
        this.addTransition(nodeIdentifier, ThenNode(thenBlockState));
        this.addTransition(nodeIdentifier, ElseNode(elseBlockState));

        return nodeIdentifier;
    }

    public String CondNode(Ast condition) {
        String nodeIdentifier = this.nextState();
        String conditionState = condition.accept(this);

        this.addNode(nodeIdentifier, "Condition");
        this.addTransition(nodeIdentifier, conditionState);

        return nodeIdentifier;
    }

    public String ThenNode(Ast thenBlock) {
        String nodeIdentifier = this.nextState();
        String thenBlockState = thenBlock.accept(this);

        this.addNode(nodeIdentifier, "Then");
        this.addTransition(nodeIdentifier, thenBlockState);

        return nodeIdentifier;
    }

    public String ElseNode(Ast elseBlock) {
        String nodeIdentifier = this.nextState();
        String elseBlockState = elseBlock.accept(this);

        this.addNode(nodeIdentifier, "Else");
        this.addTransition(nodeIdentifier, elseBlockState);

        return nodeIdentifier;
    }

    @Override
    public String visit(InfEqNode infeq) {
        String nodeIdentifier = this.nextState();

        String leftState = infeq.left.accept(this);
        String rightState = infeq.right.accept(this);

        this.addNode(nodeIdentifier, "<=");

        this.addTransition(nodeIdentifier, leftState);
        this.addTransition(nodeIdentifier, rightState);

        return nodeIdentifier;
    }

    @Override
    public String visit(InfNode inf) {
        String nodeIdentifier = this.nextState();

        String leftState = inf.left.accept(this);
        String rightState = inf.right.accept(this);

        this.addNode(nodeIdentifier, "<");

        this.addTransition(nodeIdentifier, leftState);
        this.addTransition(nodeIdentifier, rightState);

        return nodeIdentifier;
    }

    @Override
    public String visit(IntNode intNode) {
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier, String.valueOf(intNode.value));

        return nodeIdentifier;
    }

    @Override
    public String visit(LetNode affect) {
        String nodeIdentifier = this.nextState();

        String origExprState = affect.declList.accept(this);
        String goalExprState = affect.exprSeq.accept(this);

        this.addNode(nodeIdentifier, "Let");

        this.addTransition(nodeIdentifier, origExprState);
        this.addTransition(nodeIdentifier, goalExprState);

        return nodeIdentifier;
    }

    @Override
    public String visit(Lvalue affect) {
        String nodeIdentifier = this.nextState();
        this.addNode(nodeIdentifier, "Lvalue");
        String origExprState = affect.Idf.accept(this);
        for (Ast el : affect.lvalueSubs) {
            String lvalueState = el.accept(this);
            this.addTransition(nodeIdentifier, lvalueState);
        }
        this.addTransition(nodeIdentifier, origExprState);

        return nodeIdentifier;
    }

    @Override
    public String visit(Not affect) {
        String nodeIdentifier = this.nextState();

        String valueState = affect.value.accept(this);

        this.addNode(nodeIdentifier, "not");

        this.addTransition(nodeIdentifier, valueState);

        return nodeIdentifier;
    }

    @Override
    public String visit(Ord affect) {
        String nodeIdentifier = this.nextState();

        String valueState = affect.value;

        this.addNode(nodeIdentifier, "ord");

        this.addTransition(nodeIdentifier, valueState);

        return nodeIdentifier;
    }

    @Override
    public String visit(OrNode or) {
        String nodeIdentifier = this.nextState();

        String leftState = or.left.accept(this);
        String rightState = or.right.accept(this);

        this.addNode(nodeIdentifier, "|");

        this.addTransition(nodeIdentifier, leftState);
        this.addTransition(nodeIdentifier, rightState);

        return nodeIdentifier;
    }

    @Override
    public String visit(Return affect) {
        String nodeIdentifier = this.nextState();

        String returnState = affect.expressions.accept(this);
        this.addTransition(nodeIdentifier, returnState);
        this.addNode(nodeIdentifier, "Return");

        return nodeIdentifier;
    }

    @Override
    public String visit(Size affect) {
        String nodeIdentifier = this.nextState();

        String valueState = affect.value;

        this.addNode(nodeIdentifier, "size");

        this.addTransition(nodeIdentifier, valueState);

        return nodeIdentifier;
    }

    @Override
    public String visit(StringNode affect) {
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier, "String : " + affect.value.split("\"")[1]);

        return nodeIdentifier;
    }

    @Override
    public String visit(Subscript affect) {
        String nodeIdentifier = this.nextState();

        String exprState = affect.expression.accept(this);

        this.addNode(nodeIdentifier, "subscript");

        this.addTransition(nodeIdentifier, exprState);

        return nodeIdentifier;
    }

    @Override
    public String visit(Substring affect) {
        String nodeIdentifier = this.nextState();

        String stringState = affect.string;
        String indexState = affect.index;
        String lenghtState = affect.length;

        this.addNode(nodeIdentifier, "substring");

        this.addTransition(nodeIdentifier, stringState);
        this.addTransition(nodeIdentifier, indexState);
        this.addTransition(nodeIdentifier, lenghtState);

        return nodeIdentifier;
    }

    @Override
    public String visit(SupEqNode eq) {
        String nodeIdentifier = this.nextState();

        String leftState = eq.left.accept(this);
        String rightState = eq.right.accept(this);

        this.addNode(nodeIdentifier, ">=");

        this.addTransition(nodeIdentifier, leftState);
        this.addTransition(nodeIdentifier, rightState);

        return nodeIdentifier;
    }

    @Override
    public String visit(SupNode eq) {
        String nodeIdentifier = this.nextState();

        String leftState = eq.left.accept(this);
        String rightState = eq.right.accept(this);

        this.addNode(nodeIdentifier, ">");

        this.addTransition(nodeIdentifier, leftState);
        this.addTransition(nodeIdentifier, rightState);

        return nodeIdentifier;
    }

    @Override
    public String visit(TypeDecl affect) {
        String nodeIdentifier = this.nextState();

        String TypeIdState = affect.typeid.accept(this);
        String typeState = affect.type.accept(this);

        this.addNode(nodeIdentifier, "typedecl");

        this.addTransition(nodeIdentifier, TypeIdState);
        this.addTransition(nodeIdentifier, typeState);

        return nodeIdentifier;
    }

    @Override
    public String visit(TypeFields affect) {
        String nodeIdentifier = this.nextState();

        for (Ast el : affect.typeField) {
            String typeFieldState = el.accept(this);
            this.addNode(nodeIdentifier, "typefield");
            this.addTransition(nodeIdentifier, typeFieldState);
        }
        return nodeIdentifier;
    }

    @Override
    public String visit(TypeId affect) {
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier, affect.value);
        return nodeIdentifier;
    }

    @Override
    public String visit(While affect) {
        String nodeIdentifier = this.nextState();

        String condState = affect.cond.accept(this);
        String ExprState = affect.expressions.accept(this);

        this.addNode(nodeIdentifier, "While");

        this.addTransition(nodeIdentifier, condState);
        this.addTransition(nodeIdentifier, ExprState);
        return nodeIdentifier;
    }

    @Override
    public String visit(TypeField typeField) {
        String nodeIdentifier = this.nextState();

        String IdState = typeField.Id;
        String TypeIdState = typeField.typeId;

        this.addNode(nodeIdentifier, "TypeFiel");

        this.addTransition(nodeIdentifier, IdState);
        this.addTransition(nodeIdentifier, TypeIdState);
        return nodeIdentifier;
    }

    @Override
    public String visit(List list) {
        String nodeIdentifier = this.nextState();

        String TypeIdState = list.typeid.accept(this);
        String fieldCreateState = list.fieldCreate.accept(this);

        this.addNode(nodeIdentifier, "List");

        this.addTransition(nodeIdentifier, TypeIdState);
        this.addTransition(nodeIdentifier, fieldCreateState);
        return nodeIdentifier;
    }

    @Override
    public String visit(ListDecl listDecl) {
        String nodeIdentifier = this.nextState();

        String TypeIdState = listDecl.typeId.accept(this);
        String listCreateState = listDecl.list.accept(this);
        String oftypeState = listDecl.ofexpr.accept(this);

        this.addNode(nodeIdentifier, "ListDecl");

        this.addTransition(nodeIdentifier, TypeIdState);
        this.addTransition(nodeIdentifier, listCreateState);
        this.addTransition(nodeIdentifier, oftypeState);
        return nodeIdentifier;
    }

    @Override
    public String visit(Break break1) {
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier, "Break");

        return nodeIdentifier;
    }

}
