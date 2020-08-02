/**
 *  @author wasitshafi
 *  @since  02-08-20
 */
import java.util.Scanner;

public class Solution
{
    static void printArr(int[] arr) 
    {
        for (int element : arr) System.out.print(element + " ");
    }

    static void insertionSort2(int n, int[] arr)
    {
        int j, key;
        for (int i = 1 ; i < n ; i++)
        {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) arr[j + 1] = arr[j--];
            arr[j + 1] = key;
            printArr(arr);
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        insertionSort2(n, arr);
        scanner.close();
    }
}