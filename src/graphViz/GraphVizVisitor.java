package graphViz;

import java.io.FileOutputStream;
import java.io.IOException;

import ast.Program;
import ast.Ast;
import ast.AstVisitor;
import ast.VarDecl;
import ast.VarDeclWithIdf;
import ast.PrintInt;
//import ast.Decl;

public class GraphVizVisitor implements AstVisitor<String> {
    private int state;
    private String nodeBuffer;
    private String linkBuffer;

    public GraphVizVisitor(){
        this.state = 0;
        this.nodeBuffer = "digraph \"ast\"{\n\n\tnodesep=1;\n\tranksep=1;\n\n";
        this.linkBuffer = "\n";
    }

    public void dumpGraph(String filepath) throws IOException{
            
        FileOutputStream output = new FileOutputStream(filepath);

        String buffer = this.nodeBuffer + this.linkBuffer + "}";
        byte[] strToBytes = buffer.getBytes();

        output.write(strToBytes);

        output.close();

    }


    private String nextState(){
        int returnedState = this.state;
        this.state++;
        return "N"+ returnedState;
    }

    private void addTransition(String from,String dest){
        this.linkBuffer += String.format("\t%s -> %s; \n", from,dest);

    }

    private void addNode(String node,String label){
        this.nodeBuffer += String.format("\t%s [label=\"%s\", shape=\"box\"];\n", node,label);

    }

    @Override
    public String visit(Program program) {

        String nodeIdentifier = this.nextState();

        String instructionsState =program.expressions.accept(this);

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

    @Override
    public String visit(VarDeclWithIdf varDeclWithIdf) {
        String nodeIdentifier = this.nextState();

        String exprState = varDeclWithIdf.expressions.accept(this);
        String idfState = varDeclWithIdf.Idf.accept(this);
        String typeState = varDeclWithIdf.typeid;

        this.addNode(nodeIdentifier, "VarDeclWithIdf");
        this.addTransition(nodeIdentifier, exprState);
        this.addTransition(nodeIdentifier, idfState);
        this.addTransition(nodeIdentifier, typeState);

        return nodeIdentifier;
    }

    @Override
    public String visit(PrintInt printInt) {
        String nodeIdentifier = this.nextState();

        String valueState = printInt.value.accept(this);

        this.addNode(nodeIdentifier, "PrintInt");
        this.addTransition(nodeIdentifier, valueState);

        return nodeIdentifier;
    }
}
