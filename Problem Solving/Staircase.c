#include <stdio.h>

void staircase(int n) 
{
    int i, j;
    for(i = 1 ; i <= n ; i++)
    {
      for(j = 1 ; j <= n - i ; j++) printf(" ");
      for(j = 1 ; j <= i ; j++) printf("#");
      printf("\n");
    }
}
int main()
{
    int n;
    scanf("%d", &n);
    staircase(n);
    return 0;
}