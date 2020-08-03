/**
 *  @author wasitshafi
 *  @since  03-08-20
 */
import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    static int[] countingSort(int[] arr)
    {
        int len = arr.length;
        int max = Arrays.stream(arr).max().getAsInt();
        int[] count = new int[max +1];
        int[] result = new int[len];

        for (int i = 0 ; i < len ; i++ ) count[arr[i]]++;
        for (int i = 1 ; i < max + 1 ; i++) count[i] += count[ i - 1];
        for (int i = 0 ; i < len ; i++) result[--count[arr[i]]] = arr[i];
        return result;
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