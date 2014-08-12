package antlr;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

import antlr.CParser.translation_unit_return;


public class __Test__ {

    public static void main(String args[]) throws Exception {
    	System.out.println("메인");
    	CLexer lex = new CLexer(new ANTLRFileStream("C:\\Users\\상길\\Desktop\\grammer\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        
        CParser g = new CParser(tokens, null);
        try {
            translation_unit_return c = g.translation_unit();
            System.out.println("트리 : " + c.tree.toStringTree());
            System.out.println(c.tree.toString());
            /*
            for(int i=0;i<c.tree.getChildCount();i++)
            {
            	System.out.println(c.tree.getChild(i));
            	if(c.tree.getChild(i).getChildCount()!=0)
            	{
            		for(int j=0;j<c.tree.getChild(i).getChildCount();j++)
            		{
            			System.out.println(c.tree.getChild(i).getChild(j));
            		}
            		
            	}
            	System.out.println();
            }
            */
           
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}