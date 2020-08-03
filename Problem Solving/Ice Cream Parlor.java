/**
 *  @author wasitshafi
 *  @since  03-08-20
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    static int[] icecreamParlor(int m, int[] arr)
    {
        int brr[] = arr.clone();
        Arrays.sort(brr);

        int len = brr.length;
        int i = 0, j = len - 1;

        while(brr[i] + brr[j] != m)
            if(brr[i] + brr[j] > m)
                j--;
            else
                i++;

        int[] ans  = new int[2];        
        for(int k = 0 ; k < len ; k++)
            if(arr[k] == brr[i])
            {
                ans[0] = k;
                break;
            }
        for(int k = 0; k < len ; k++)
            if(arr[k] == brr[j] && k != ans[0])
                {
                    ans[1] = k;
                    break;
                }

        ans[0]++;
        ans[1]++;
        if(ans[0] > ans[1])
        {
            ans[0] ^= ans[1];
            ans[1] ^= ans[0];
            ans[0] ^= ans[1];
        }
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while(t-- != 0)
        {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            int[] result = icecreamParlor(m, arr);
            for (int i = 0; i < result.length; i++) System.out.print(result[i] + " ");
            System.out.println();
        }
        scanner.close();
    }
}