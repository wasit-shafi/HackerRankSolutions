#include <stdio.h>

int main()
{
    int *arr, min, max, i;
    unsigned long long int sum = 0;

    arr = (int *)malloc(5 * sizeof(int));
    for(i = 0 ; i <= 4 ; i++) scanf("%ld", &arr[i]);
    
    i = 0;
    min = arr[i];
    max = arr[i];
    
    for(i = 0 ; i <= 4 ; i++)
    {
        sum += arr[i];
        if(arr[i] < min) min = arr[i];
        if(arr[i] > max) max =arr[i];
    }
    printf("%ld %ld",sum - max,sum - min);
    free(arr);
}