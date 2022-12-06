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
import ast.TypeFields;
import ast.TypeId;
import ast.Affect;
import ast.AndNode;
import ast.Ast;
import ast.AstVisitor;
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
import ast.Lvalue;
import ast.LvalueSub;
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
//import ast.Decl;

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

        String exprState = varDecl.expressions.accept(this);
        String idfState = varDecl.Idf.accept(this);

        this.addNode(nodeIdentifier, "VarDecl");
        this.addTransition(nodeIdentifier, exprState);
        this.addTransition(nodeIdentifier, idfState);

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
        this.addNode(nodeIdentifier, "concat");

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
            String id = affect.fieldIds.get(i).accept(this);
            String type = affect.fieldTypes.get(i).accept(this);
            this.addTransition(nodeIdentifier, id);
            this.addTransition(nodeIdentifier, type);
        }

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

        String IdftState = affect.Idf.accept(this);
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

        String IdfState = affect.Idf.accept(this);
        String origExprState = affect.origExpr.accept(this);
        String goalExprState = affect.goalExpr.accept(this);
        String expressionsState = affect.expressions.accept(this);

        this.addNode(nodeIdentifier, "For");

        this.addTransition(nodeIdentifier, IdfState);
        this.addTransition(nodeIdentifier, origExprState);
        this.addTransition(nodeIdentifier, goalExprState);
        this.addTransition(nodeIdentifier, expressionsState);

        return nodeIdentifier;
    }

    @Override
    public String visit(FuncDecl affect) {
        String nodeIdentifier = this.nextState();

        String IdfState = affect.Idf.accept(this);
        String fieldDeclState = affect.fieldDecl.accept(this);
        String TypeIdState = affect.typeId.accept(this);
        String expressionsState = affect.expressions.accept(this);

        this.addNode(nodeIdentifier, "For");

        this.addTransition(nodeIdentifier, IdfState);
        this.addTransition(nodeIdentifier, fieldDeclState);
        this.addTransition(nodeIdentifier, TypeIdState);
        this.addTransition(nodeIdentifier, expressionsState);

        return nodeIdentifier;
    }

    @Override
    public String visit(FunctionCall affect) {
        String nodeIdentifier = this.nextState();

        String IdfState = affect.Idf.accept(this);
        String exprListState = affect.exprList.accept(this);

        this.addNode(nodeIdentifier, "For");

        this.addTransition(nodeIdentifier, IdfState);
        this.addTransition(nodeIdentifier, exprListState);

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

        String conditionState = ifThen.ifExpr.accept(this);
        String thenBlockState = ifThen.expressions.accept(this);

        this.addNode(nodeIdentifier, "IfThen");

        this.addTransition(nodeIdentifier, conditionState);
        this.addTransition(nodeIdentifier, thenBlockState);

        return nodeIdentifier;
    }

    @Override
    public String visit(IfThenElse affect) {
        // TODO Auto-generated method stub
        return null;
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
    public String visit(LvalueSub affect) {
        String nodeIdentifier = this.nextState();

        // String origExprState = affect.value.accept(this);

        // this.addNode(nodeIdentifier, "lvaluesub");

        // this.addTransition(nodeIdentifier, origExprState);

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

        String valueState = affect.value.accept(this);

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

        String valueState = affect.value.accept(this);

        this.addNode(nodeIdentifier, "size");

        this.addTransition(nodeIdentifier, valueState);

        return nodeIdentifier;
    }

    @Override
    public String visit(StringNode affect) {
        String nodeIdentifier = this.nextState();

        this.addNode(nodeIdentifier, "string");

        this.addTransition(nodeIdentifier, affect.value);

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

        String stringState = affect.string.accept(this);
        String indexState = affect.index.accept(this);
        String lenghtState = affect.length.accept(this);

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

        String typeDeclState = affect.typeDecl.accept(this);
        String typeFieldsState = affect.typeFields.accept(this);

        this.addNode(nodeIdentifier, "typefield");

        this.addTransition(nodeIdentifier, typeDeclState);
        this.addTransition(nodeIdentifier, typeFieldsState);

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

}
