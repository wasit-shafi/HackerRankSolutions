/**
 *  @author wasitshafi
 *  @since  01-07-20
 */
import static java.lang.System.out;

public class Solution
{
    static int partition(int arr[], int low, int high)
    {
        int i = low - 1, temp;
        for (int j = low ; j < high ; j++)
            if(arr[j] <= arr[high]) // arr[high] is pivot element
            {
                temp = arr[++i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return  i + 1;
    }

    static void quickSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int partition_index = partition(arr, low, high);
            quickSort(arr, low, partition_index - 1);
            quickSort(arr, partition_index + 1, high);
        }
    }

    static int findMedian(int[] arr)
    {
        int n = arr.length;
        int min_index = -1;
        // Here O(N^2) sorting algo. will result in TLE as N <= 10^6 + 1 
        // => N^2 = 10^12 which is greater that 10^8(max instruction/sec)
        // So to solve this we need linear/logarithmic time complexity sorting algorithms
        // Using Quick Sort
        quickSort(arr, 0, n - 1);
        return arr[n / 2]; //Constraints : n is odd
    }
    
    public static void main(String[] args)
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        out.print(findMedian(arr));
        scanner.close();
    }
}