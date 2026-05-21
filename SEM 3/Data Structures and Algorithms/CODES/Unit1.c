//21-09
// #include <stdio.h>
//  int main()
//  { int val=25;
//  int *p= &val;
//  int **pp = &p;

//  printf("val = %d\n",val);
//  printf("*p =%d\n", *p);
//  printf("**pp = %d\n", **pp);

//   return 0 ;
// }


//null pointer example
#include <stdio.h>
int main() {
int *p1 =NULL;
if (p1==NULL)
 printf("Null pointer detected \n");

 //void pointer 
 int x =25;
 void *vp;
 vp = &x;

 printf("value : %d\n", *((int*)vp));

}