#include<stdio.h>

int main()
{
    int i, n, max, item, arr[100] = {0};

    scanf("%d", &n);   
    for(i = 0 ; i < n ; i++)
    {
        scanf("%d", &item);
        arr[item]++;
    }
    max = 0;    
    for(i = 0 ; i < n - 1 ; i++) if(arr[i] + arr[i + 1] > max) max = arr[i] + arr[i + 1];
    printf("%d", max);
    return 0;
}