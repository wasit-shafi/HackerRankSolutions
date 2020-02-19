#include <stdio.h>

int main()
{
    int n, k, *arr, count = 0, i, j;
    
    scanf("%d", &n);
    scanf("%d", &k);  
    arr = (int *)malloc(n * sizeof(int));
    for(i = 0 ; i  < n ; i++) scanf("%d", &arr[i]);
    for(i = 0; i < n ; i++)
        for(j = i ; j < n ; j++)
            if((arr[i] + arr[j]) % k == 0  && i < j)
                count++;
    printf("%d" , count);
    free(arr);  
    return 0;
}