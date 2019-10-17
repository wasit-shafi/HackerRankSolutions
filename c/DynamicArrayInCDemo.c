#include<stdio.h>

int main()
{
    int *bookShelf[3];                  // Array of pointer to int;

    int shelf1[3] = {1, 2, 3};          // constains 3 books of total pages 1, 2 & 3.
    int shelf2[4] = {4, 5, 6, 7};
    int shelf3[5] = {8, 9, 10, 11, 12};
    int shelvesSizes[3] = {3, 4, 5};    // It is stores no. of shelves

    bookShelf[0] = shelf1;              // base address of array is constant and row1 == & row1[0]
    bookShelf[1] = &shelf2[0];
    bookShelf[2] = shelf3;              // or &row[0];

    printf("Book Shelf:\n\nShelf\tBook Pages\n");  // Shelf no : i + 1 message
    for(int i = 0 ; i < 3 ; i++)
    {
        printf("%d : \t", i + 1);
        for(int j = 0; j < shelvesSizes[i] ; j++)
            printf("%d ", *(bookShelf[i] + j));
        printf("\n");
    }

    return 0;
}