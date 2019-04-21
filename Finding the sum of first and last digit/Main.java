#include <stdio.h>
int main() {
	int n,temp,fd,ld,s=0;
  scanf("%d",&n);
  temp=n;
  ld=n%10;
    while(n>=10)
    {
      n/=10;
    }
  fd=n;
  s=fd+ld;
  printf("%d",s);
      
  
  
  
	return 0;
}