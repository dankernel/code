package antlr;

import antlr.Oper_type;

public class Arg_interface extends V_argument {
	
	private V_argument r;
	private V_argument l;
	private Oper_type op;
	
	/* Init */
	public Arg_interface() {
		this.r = new Argument(null, null, null);
		this.l = new Argument(null, null, null);
		this.op = null;
	}
	
	/* Init */
	public Arg_interface(V_argument r, V_argument l, Oper_type op) {
		this.r = r;
		this.l = l;
		this.op = op;
	}
	
	public V_argument get_r() {
		try {
			return this.r;
		} catch (Exception e) {
			return null;
		}
	}
	
	public V_argument get_l() {
		try {
			return this.l;
		} catch (Exception e) {
			return null;
		}
	}
	
	public Oper_type get_op() {
		try {
			return this.op;
		} catch (Exception e) {
			return null;
		}
	}

}
