/**
 *  @author wasitshafi
 *  @since  02-08-20
 */
import java.util.Scanner;

public class Solution
{
    static int partition(int[] arr, int low, int high)
    {
        int i = high + 1 , temp;
        
        for (int j = high ; j > low ; j--)
            if(arr[j] >= arr[low]) // arr[low] is pivot element
            {
                temp = arr[--i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        temp = arr[i - 1];
        arr[i - 1] = arr[low];
        arr[low] = temp;

        return i - 1;
    }

    static void printArr(int[] arr, int low, int high)
    {
        while(low <= high) System.out.print(arr[low++] + " ");
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int partition_index = partition(arr, low, high);
            quickSort(arr, low , partition_index);
            quickSort(arr, partition_index + 1, high);
            printArr(arr, low, high);
            System.out.println("low " + low + " high " + high + "partition_index " + partition_index);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
 
        for (int i = 0; i < n; i++)  arr[i] = scanner.nextInt();
        quickSort(arr, 0, n - 1);
 
        scanner.close();
    }
}