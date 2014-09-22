package antlr;

import antlr.Oper_type;

public class Arg_interface extends v_argument {
	
	private Argument r;
	private Argument l;
	private Oper_type op;
	
	
	public Arg_interface() {
		this.r = new Argument(null, null, null);
		this.l = new Argument(null, null, null);
		this.op = null;
	}
	
	public Arg_interface(Argument r, Argument l, Oper_type op) {
		this.r = r;
		this.l = l;
		this.op = op;
	}

}
