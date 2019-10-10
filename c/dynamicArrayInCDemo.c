#include<stdio.h>

int main()
{
    int *bookShelf[3];                 // Array of pointer to int;

    int shelf1[3] = {1, 2, 3};
    int shelf2[4] = {4, 5, 6, 7};
    int shelf3[5] = {8, 9, 10, 11, 12};
    int shelvesSizes[3] = {3, 4, 5};   // It is stores the s

    matrix[0] = row1;                  // base address of array is constant and row1 == & row1[0]
    matrix[1] = &row2[0];
    matrix[2] = row3;                  // or &row[0];

    printf("Dynamic matrix is as follows : \n");
    for(int i = 0 ; i < 3 ; i++)
    {
        for(int j = 0; j < size[i] ; j++)
        {
            printf("%d ", *(matrix[i] + j) );
        }
        printf("\n");
    }

    return 0;
}