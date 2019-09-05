#include <stdio.h>

int main()
{
 int n, i, j, k, max_and = 0, max_or = 0, max_xor = 0;
  
  scanf("%d%d", &n, &k);
    
    for( i = 1 ; i <= n ; i++)
      for(j = i + 1 ; j <= n ; j++)
      {
        if( ( i & j ) < k  && ( i & j ) > max_and ) max_and = i & j;
        if( ( i | j ) < k  && ( i | j ) > max_or ) max_or = i | j; 
        if( ( i ^ j ) < k  && ( i ^ j ) > max_xor ) max_xor = i ^ j;
      } 
    printf("%d\n%d\n%d", max_and, max_or, max_xor);
}