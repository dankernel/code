
class val
{
  string name;
  enum type;
}

class math
{
  val val1;
  val val2;

  enum op;      //+, -, *, /, ...//
}

+, - , *, /, %,
+=, -=, *=, /=, %=,
==, !=, <=, >=, <, >,
~, ^, |, &

class call
{
  int argc;
  string argv[];

  string name;
}

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

