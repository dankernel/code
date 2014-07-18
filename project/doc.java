
/*
 * val of all type.
 */
class val
{
  string name;
  enum type;
}

class math
{
  math val1;
  math val2;

  //+, -, *, /, ...//
  enum op;      
}

/* +, - , *, /, %, */
/* +=, -=, *=, /=, %=, */
/* ==, !=, <=, >=, <, >, */
/* ~, ^, |, & */

class call
{
  int argc;
  string argv[];
  //or val argv[];

  string func;  //function name..//
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
  object math;
  object code_s[];

  mapp_table table; //math result and code array.//
}

class set_func
{
  int argc;
  string argv[];

  string func;  //function name..//
  object code_s[];
}
