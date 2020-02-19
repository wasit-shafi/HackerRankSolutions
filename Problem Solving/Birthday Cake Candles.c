#include <stdio.h>

int main()
{
    int *arr, i, j, n, max, max_count,max_index, total_max;
    
    scanf("%d", &n);
    arr = (int *)malloc(n * sizeof(int));
    for(i = 0 ; i < n ; i++) scanf("%d" , (arr + i));
    max = *arr;
    max_index = 0;
    for(i = 0 ; i < n ; i++)
    {
        if(arr[i] >= max)
        {
            max = arr[i];
            max_index = i;
        }
    }
    max_count = 1;
    for(i = max_index - 1 ; i >= 0; i--) if(arr[i] == max) max_count++;
    printf("%d", max_count);
    
    free(arr);
    return 0;
}