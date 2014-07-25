
import java.*;

public class main
{
  
  public static void main(String[] args){

    System.out.println("=== Start ===");

    val test[10];

  }

}

/*
 * val of all type.
 */
class val
{
  String name;
  //enum type;
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
