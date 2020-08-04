/**
 *  @author wasitshafi
 *  @since  03-08-20
 */
import java.util.Scanner;

public class Solution
{
    static int partition(int arr[], int low, int high)
    {
        int temp, i = low - 1;
        for(int j = low ; j < high ; j++)
            if(arr[j] > arr[high]) // arr[high] as pivot
            {
                temp = arr[++i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        temp = arr[++i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    static void quickSort(int arr[], int low, int high)
    {
        if(low < high)
        {      
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }
 
    static long marcsCakewalk(int[] calorie)
    {
        int len = calorie.length;
        long powersOf2 = 1, ans = 0;
 
        quickSort(calorie, 0, len - 1);       
        for(int i = 0 ; i < len ; i++)
        {
            ans += powersOf2 * calorie[i];
            powersOf2 *= 2;
        }
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] calorie = new int[n];

        for (int i = 0; i < n; i++) calorie[i] = scanner.nextInt();
        System.out.print(marcsCakewalk(calorie));
        scanner.close();
    }
}