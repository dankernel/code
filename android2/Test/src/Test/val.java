package Test;

public class val {
	
	private String Name;
	private String Type;
	private Object Contain;
	
	public val() {
		this.Name = "Buf";
		this.Type = "";
		this.Contain = 0;
	}

	public val(String name, String type, Object contain) {
		this.Name = name;
		this.Type = type;
		this.Contain = contain;
	}
	
	public Object getContain() {
		return this.Contain;
	}

	public void setContain(Object contain) {
		this.Contain = contain;
	}
	
	public int debug() {
		System.out.println("name : " + this.Name);
		System.out.println("type : " + this.Type);
		System.out.println("cont : " + this.Contain);
		System.out.println("cont : " + this.Contain.getClass().toString());
		
		return 0;
	}

}