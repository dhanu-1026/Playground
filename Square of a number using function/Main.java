#include<stdio.h>
int square_of_a_numbers(int num);// Function declaration
int main() {
   int n;
   scanf("%d", &n);
   printf("%d", square_of_a_numbers(n)); // Function call
  	return 0;
}
int square_of_a_numbers(int num){// Function definition
  int result=num*num;
    
    return result;
}