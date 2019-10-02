#include <stdio.h>

int main()
{
    char str[1000];
   
    scanf("%[^\n]", str);
    for( int i = 0 ; str[i] ; i++)
      if(str[i] == 32) printf("\n");
      else printf("%c", str[i]);

    return 0;
}