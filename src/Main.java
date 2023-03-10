
import java.util.ArrayList;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

import ast.Ast;
import ast.AstCreator;
import graphViz.GraphVizVisitor;
import parser.*;
import parser.exprParser.ProgramContext;
import semantique.ControlVisitor;
import tds.TdsCreator;
import tds.Tds;

public class Main {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Error : Expected 1 argument filepath, found 0");
            return;
        }

        String testFile = args[0];

        try {

            // chargement du fichier et construction du parser

            CharStream input = CharStreams.fromFileName(testFile);
            exprLexer lexer = new exprLexer(input);
            CommonTokenStream stream = new CommonTokenStream(lexer);
            exprParser parser = new exprParser(stream);

            // Récupération du noeud program (le noeud à la racine)
            ProgramContext program = parser.program();

            // Visiteur de création de l'AST + création de l'AST
            AstCreator creator = new AstCreator();
            Ast ast = program.accept(creator);

            // Visiteur de représentation graphique + appel
            GraphVizVisitor graphViz = new GraphVizVisitor();
            ast.accept(graphViz);

            graphViz.dumpGraph("./out/tree.dot");
            TdsCreator tdsCreator = new TdsCreator();
            ast.accept(tdsCreator);
            ArrayList<Tds> allTDS = tdsCreator.allTds;
            allTDS.toString();

            ControlVisitor tests = new ControlVisitor(allTDS);
            int errors = ast.accept(tests);
            if (errors != 0) {
                System.out.println("Errors : \u001b[31;1m" + errors + "\u001b[0m");
            } else {
                System.out.println("Errors : \u001b[32;1m" + errors + "\u001b[0m");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

    }

}
