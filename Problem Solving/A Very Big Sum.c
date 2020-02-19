#include <stdio.h>

int main()
{
    unsigned long int *arr, sum = 0, n, i;
    
    scanf("%ld", &n);
    arr = (unsigned long int *)malloc(n * sizeof(unsigned long int));
    
    for(i = 0; i < n; i++)
    {
        scanf("%d", (arr + i));
        sum += *(arr + i);
    }
    printf("%ld", sum);
    free(arr);
}