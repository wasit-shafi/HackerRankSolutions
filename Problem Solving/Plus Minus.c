#include <stdio.h>

int main()
{
    int *arr, n, i, count_positive = 0, count_negative = 0, count_zero = 0;
    
    scanf("%d", &n);
    arr = malloc(n * sizeof(int));
    for(i = 0; i < n ; i++)
    {
        scanf("%d", (arr + i));
        if(*(arr + i) == 0) count_zero++;
        else if (*(arr + i) > 0) count_positive++;
        else count_negative++;
    }
    printf("%f\n%f\n%f",(float)count_positive / n, (float)count_negative / n, (float)count_zero / n);
    return 0;
}