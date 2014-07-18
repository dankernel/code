
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

  enum op;      //+, -, *, /, ...//
}

/*
   +, - , *, /, %,
   +=, -=, *=, /=, %=,
   ==, !=, <=, >=, <, >,
   ~, ^, |, &
*/

class call
{
  int argc;
  string argv[];

  string func;  //function name..//
}

/*
 * used branch.
 */
class code_s
{
  code list[]; 
}

class branch
{
  object math;
  object code_s[];

  list mapping; //math result and code array.//
}

class set_func
{
  int argc;
  string argv[];

  string func;  //function name..//
  object code_s[];
}
