#include <stdio.h>

int main() 
{    
    char ch, s[30], sen[50];

    scanf("%c", &ch);

    scanf("\n");
    scanf("%s", s);

    scanf("\n");
    scanf("%[^\n]", sen);
      
    printf("%c\n%s\n%s",ch,s,sen);
    
    return 0;
}