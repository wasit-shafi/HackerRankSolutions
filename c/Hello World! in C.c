#include <stdio.h>
#include <string.h>

int main() 
{
    char s[100];

    scanf("%[^\n]", &s);      // reading characters including spaces until '\n' 
    printf("Hello, World!\n");
    printf("%s",s);
    
    return 0;
}
