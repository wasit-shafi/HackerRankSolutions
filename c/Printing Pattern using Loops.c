#include<stdio.h>

int main()
{
    int order, n;

    scanf("%d", &order);
    n  = order;

    int arr[order * 2 - 1][order * 2 - 1];
    int r1, r2, c1, c2, i;

    r1 = c1 = 0;
    r2 = c2 = order * 2 - 2;

    while(r1 <= r2 && c1 <= c2)
    {
        for(i = c1; i <= c2 ; i++) arr[r1][i] = n;
        r1++;

        for(i = r1; i <= r2 ; i++) arr[i][c2] = n;
        c2--;

        for(i = c2; i >= c1 ; i--) arr[r2][i] = n;
        r2--;

        for(i = r2; i >= r1 ; i--) arr[i][c1] = n;
        c1++;
        n--;
    }

    for(int i = 0 ; i < order * 2 - 1 ; i++)
    {
        for( int j = 0 ; j < order * 2 - 1 ; j++) printf("%d ", arr[i][j]);
        printf("\n");
    }
    return 0;
}