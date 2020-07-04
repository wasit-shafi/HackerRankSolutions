/**
 *  @author wasitshafi
 *  @since  04-07-20
 */
import java.util.Scanner;

public class Solution
{
    static int beautifulTriplets(int d, int[] arr)
    {
        int i, j, k, count = 0, len = arr.length;

        for(i = 0 ; i < len - 2 ; i++)
            for(j = i + 1 ; j < len - 1 ; j++)
                if(arr[j] - arr[i] == d)
                    for(k = j + 1 ; k < len ; k++)
                        if(arr[k] - arr[j] == d)
                            count++;
        return count;
    }

    public static void main(String[] args)
    {
        int n, d, arr[];
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        d = scanner.nextInt();

        arr = new int[n];
        for(int i = 0 ; i < n ; i++) arr[i] = scanner.nextInt();
        System.out.println(beautifulTriplets(d, arr)); 
        scanner.close();
    }
}