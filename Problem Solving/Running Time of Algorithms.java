/**
 *  @author wasitshafi
 *  @since  02-08-20
 */
import java.util.Scanner;

public class Solution
{
    static int runningTime(int[] arr)
    {
        int j, key, count = 0, n = arr.length;

        for (int i = 1 ; i < n ; i++)
        {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j--];
                count++;
            }
            arr[j + 1] = key;
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0 ; i < n ; i++) arr[i] = scanner.nextInt();
        System.out.print(runningTime(arr));
        scanner.close();
    }
}