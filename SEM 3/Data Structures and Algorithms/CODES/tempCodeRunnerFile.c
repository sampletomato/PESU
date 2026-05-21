//21-09
#include <stdio.h>
 { int val=25;
 int *p= &val;
 int **pp = &p;

 printf("val = %d\n",val);
 printf("*p =%d\n", *p);
 printf("**pp = %d\n", **pp);

  return 0 ;
}