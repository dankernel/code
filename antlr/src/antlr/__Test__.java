package antlr;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import antlr.CParser.translation_unit_return;

public class __Test__ {

	public static void main(String args[]) throws Exception {
		System.out.println("== START ==");
		CLexer lex = new CLexer(new ANTLRFileStream("/home/dkdk/code/antlr/test/main.c", "UTF-8"));
		CommonTokenStream tokens = new CommonTokenStream(lex);

		/*
		CParser g = new CParser(tokens, null);
		translation_unit_return c = g.translation_unit();
		System.out.println("Result : \n" + c.tree.toStringTree());
		*/

		try {
			CParser g1 = new CParser(tokens, null);
			translation_unit_return c1 = g1.translation_unit();
			System.out.println("print : " + c1.tree.toStringTree());

			System.out.println("print : ");
			for (int i=0; i<c1.tree.getChildCount(); i++) {
				System.out.println(c1.tree.getChild(i));
				if (c1.tree.getChild(i).getChildCount()!=0){
					for (int j=0; j<c1.tree.getChild(i).getChildCount(); j++) {
						System.out.println(">>" + c1.tree.getChild(i).getChild(j));
					}
				}
				System.out.println();
			}

		} catch (RecognitionException e) {
			e.printStackTrace();
		}
	}
}