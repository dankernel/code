
#include <stdio.h>

int f1(int num)
{
  return num * 2;
}

int main()
{
  int a = 10;
  int *p = NULL;

  p = &a;
  a = f1(*p);

  printf("result : %d \n", a);
}


(FUNCTION (KEYWORD int) (DECLARATOR (ID f1) ( (KEYWORD int) (ID num) )) { 
 (STATEMENT (KEYWORD return) (ID num) * (LITERAL 2) ;) 
}) 

(FUNCTION (KEYWORD int) (DECLARATOR (ID main) ( )) { 
 (DECLARATION (KEYWORD int) (INIT_DECLARATOR (DECLARATOR (ID a)) = (LITERAL 10)) ;) 
 (DECLARATION (KEYWORD int) (INIT_DECLARATOR (DECLARATOR * (ID p)) = (ID NULL)) ;) 
 (STATEMENT (ID p) = & (ID a) ;) 
 (STATEMENT (ID a) = (ID f1) ( * (ID p) ) ;) 
 (STATEMENT (ID printf) ( (LITERAL "result : %d \n") , (ID a) ) ;) 
})

