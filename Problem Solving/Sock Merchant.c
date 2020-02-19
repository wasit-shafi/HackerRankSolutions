#include <stdio.h>

int sockMerchant(int* arr, int n)
{
    int i, count_pair = 0, array_count[101] = {0};

    for(i = 0 ; i < n ; i++) array_count[*(arr + i)]++;
    for(i = 0 ; i <= 100 ; i++)
        if(array_count[i] != 0)
            count_pair += array_count[i] / 2;
    return count_pair;
}

int main()
{
    int i, n, *arr;
    scanf("%d", &n);
    arr = (int *)malloc(n * sizeof(int));

    for(i = 0 ; i < n ; i++) scanf("%d", &arr[i]);
    printf("%d", sockMerchant(arr, n));
    free(arr);
    return 0;
}