/**
 *  @author wasitshafi
 *  @since  01-08-20
 */
import java.util.Scanner;

public class Solution
{
    public static void insertionSort(int[] A)
    {
        for (int i = 1; i < A.length; i++)
        {
            int value = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > value)
            {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = value;
        }
        printArray(A);
    }

    static void printArray(int[] arr)
    {
        for(int n: arr) System.out.print(n + " ");
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0 ; i < n ; i++) arr[i] = scanner.nextInt();
        insertionSort(arr);
        scanner.close();
    }
}