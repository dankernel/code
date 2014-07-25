
import java.*;
import java.*.String;

public class main
{
  
  public static void main(String[] args){

    System.out.println("=== Start ===");

    val a = new val();
    a.set_name("ret");

    System.out.println("name : " + a.get_name());

  }

}

/*
 * val of all type.
 */
class val
{
  String name;
  //enum type;

  public int set_name(String get)
  {
    get.len
    if (get.import < 10) {
      name = get;
      return 0;
    } else {
      return -1;
    }
  }

  public String get_name()
  {
    return name;
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
