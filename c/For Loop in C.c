#include <stdio.h>

void print_digit(int d)
{
  switch(d)
     {
         case 0:printf("zero");break;
         case 1:printf("one"); break;
         case 2:printf("two"); break;
         case 3:printf("three");break;
         case 4:printf("four");break;
         case 5:printf("five");break;
         case 6:printf("six");break;
         case 7:printf("seven");break;
         case 8:printf("eight");break;
         case 9:printf("nine");break;
     }  
}

int main() 
{
    int a, b;
    int i;
    scanf("%d\n%d", &a, &b);
  
    for( i = a ; i <= b ; i++)
    {     
       if(i >= 0 && i <= 9)
         print_digit(i);
       else if(i % 2 == 0)
         printf("even");
       else
         printf("odd");
    
       printf("\n");
    }
     
    return 0;
}