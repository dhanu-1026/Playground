#include<stdio.h>
int main()
{
  int year=1999;
  scanf("%d",&year);
  if((year%400==0)||((year%4==0)&&(year%100!=0)))
    printf("Leap year",year);
  else
    printf("Not Leap year",year);
  return 0;
}