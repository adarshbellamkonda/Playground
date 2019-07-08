#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float a,b,c;
  scanf("%f%f",&a,&b);
  c=a*a+b*b;
  float res=sqrt(c);
  printf("%.2f",res);
  return 0;
}