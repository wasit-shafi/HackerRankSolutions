/**
 *  @author wasitshafi
 *  @since  23-07-20
 */
// TLE  in TC 2 & 3
public class Solution
{
    static int minimumAbsoluteDifference(int[] arr)
    {
        int temp, len = arr.length, min = Integer.MAX_VALUE;

        for(int i = 0 ; i < len ; i++)
            for(int j = i + 1 ; j < len ; j++)
            {
                temp = arr[i] - arr[j];
                if(temp < 0) temp = -temp;
                if(temp < min)
                    min = temp;
            }
        return min;
    }

public static void main(String[] args)
    {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];

        for(int i = 0 ; i < n ; i++) arr[i] = scanner.nextInt();
        System.out.print(minimumAbsoluteDifference(arr));
        scanner.close();
    }
}