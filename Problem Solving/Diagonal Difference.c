#include<stdio.h>

int main()
{
    int i , j, order;
    int arr[100][100], primary_diagonals = 0, secondary_diagnols = 0;
    
    scanf("%d", &order);
    for(i = 0; i < order ; i++)
    {   
        for(j = 0 ; j < order ; j++)
        {
            scanf("%d", &arr[i][j]);
            if(i == j) primary_diagonals += arr[i][j];
        }
    }

    for(i = 0 , j = order  - 1 ; i < order ; i++ , j--) secondary_diagnols += arr[i][j];
    if(primary_diagonals > secondary_diagnols)
        printf("%d" , primary_diagonals - secondary_diagnols);
    else
        printf("%d" , secondary_diagnols - primary_diagonals);

    return 0;
}