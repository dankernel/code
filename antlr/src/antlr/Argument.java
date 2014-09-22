package antlr;

public class Argument extends v_argument {
	
	private Val_type type;
	private String name;
	private Argument arg;
	
	/* e.g., 
	 * int a 	=> Int	: a	:
	 * 10		=> Int	:	: 10
	 * a		=> 		: a	:
	 */
	
	public Argument (Val_type t, String n, Argument a)
	{
		this.type = t;
		this.name = n;
		this.arg = a;
	}
	
	public Val_type get_type() {
		try {
			return this.type;
		} catch (Exception e) {
			return null;
		}
	}

}

