package nju.ics;

import nju.ics.antlr.oclfo.OCLfoRewriter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

import nju.ics.antlr.oclfo.OCLfoLexer;
import nju.ics.antlr.oclfo.OCLfoParser;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args ) throws Exception
    {
        String inputFile = null;
        if ( args.length > 0 ) {
            inputFile = args[0];
        }

        InputStream is = System.in;

        if(inputFile != null) {
            is = new FileInputStream(inputFile);
        }

        ANTLRInputStream input = new ANTLRInputStream(is);

        OCLfoLexer lexer = new OCLfoLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        OCLfoParser parser = new OCLfoParser(tokens);

        ParseTree tree = parser.invariant();

        OCLfoRewriter rewriter = new OCLfoRewriter();
        rewriter.visit(tree);






    }
}
