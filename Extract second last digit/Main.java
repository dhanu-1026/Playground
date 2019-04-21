#include<stdio.h>
int main()
{
  int n=12345,m;
  scanf("%d",&n);
  m=(n%100)/10;
  printf("%d",m);
  return 0;
}