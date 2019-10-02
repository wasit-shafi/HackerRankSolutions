#include <stdio.h>
#include <stdlib.h>

int main()
{    
    int *arr, n, sum = 0;
    
    scanf("%d", &n);
    arr =(int *)malloc(n * sizeof(int));
    
    while(--n >= 0)
     scanf("%d", &arr[n]), sum += arr[n];
    
    printf("%d", sum);
    free(arr);
    return 0;
}
