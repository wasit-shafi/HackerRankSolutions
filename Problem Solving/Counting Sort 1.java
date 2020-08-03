/**
 *  @author wasitshafi
 *  @since  02-08-20
 */
import java.util.Scanner;

public class Solution
{
    static int[] countingSort(int[] arr)
    {
        int count[] = new int[100], len = arr.length;
        for (int i = 0 ; i < len ; i++) count[arr[i]]++;
        return count;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt(); 
        int[] result = countingSort(arr);

        for (int i = 0; i < result.length; i++) System.out.print(result[i] + " ");
        scanner.close();
    }
}