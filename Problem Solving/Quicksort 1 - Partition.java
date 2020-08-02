/**
 *  @author wasitshafi
 *  @since  02-08-20
 */
import java.util.Scanner;

public class Solution
{
    static int[] quickSort(int[] arr)
    {
        int low = 0, high = arr.length - 1;
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

        return arr; 
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)  arr[i] = scanner.nextInt();
        int[] result = quickSort(arr);
        for (int i = 0; i < result.length; i++) System.out.print(result[i] + " ");
        scanner.close();
    }
}