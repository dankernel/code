
import java.*;
import java.lang.String;

public class main
{
  
  /* main */
  public static void main(String[] args)
  {

    System.out.println("=== Start ===");

    val a = new val("index", null, 100);
    System.out.println("name : " + a.get_name());
    System.out.println("val : " + a.get_contain());

    list val_list = new list("val_list");
    System.out.println("list name : " + val_list.get_name());


  }

}

class list
{
  val head_node;
  String name;

  public list()
  {
    this.head_node = new Object();
    this.name = "init_main";
  }

  public list(String name)
  {
    this.head_node = new Object();
    this.name = name;
  }

  public String get_name()
  {
    return this.name;
  }

  public val add_node(String name, String type, Object contain)
  {
    val last_node = pic_last_node(); 
    val new_val = new val("index", null, 100);
  }

  public val pic_last_node()
  {
    return val;
  }

}

/*
 * val of all type.
 */
class val
{

  String name;
  //enum type;
  Object contain;

  /* init */
  public val()
  {
    /* Do Nothing.. */ 
  }
  
  /* init */
  public val(String name, String type, Object contain)
  {
    this.name = name;
    this.contain = contain;
  }

  public int set_name(String get)
  {
    if (get.length() < 10) {
      name = get;
      return 0;
    } else {
      return -1;
    }
  }

  public String get_name()
  {
    return (name != null) ? name : "name is null";
  }

  public Object get_contain()
  {
    return (contain != null) ? contain.toString() : "contain is null";
  }

}

class math
{
  math val1;
  math val2;

  //enum op;      
}

/* +, - , *, /, %, */
/* +=, -=, *=, /=, %=, */
/* ==, !=, <=, >=, <, >, */
/* ~, ^, |, & */

class call
{
  int argc;
  String argv[];
  //or val argv[];

  String func;  //function name..//
}

class code
{
  Object node;
}

/*
 * used branch.
 */
class code_s
{
  code list[]; 
}

//math result => code_s
class mapp_table
{
  int result[];
  int index[];
}

class branch
{
  Object math;
  Object code_s[];

  mapp_table table; //math result and code array.//
}

class set_func
{
  int argc;
  String argv[];

  String func;  //function name..//
  Object code_s[];
}

