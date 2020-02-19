/**
    @author wasitshafi
    @since  19-02-2020
*/
import java.util.Scanner;

public class Solution
{
    static int maximumToys(int[] prices, int k, int n)
    {
        int temp, cost, noOftoys;

        cost = noOftoys = 0;
        int lastIndex = n - 1;
        // CTM : We don't need to sort whole array first
        for(int i = 0 ; i < n - 1 ; i++)
        {
            for( int j = 0 ; j < n - i - 1 ; j++)
            {
                if( prices[j] < prices[j + 1])
                {
                    temp = prices[j];
                    prices[j] = prices[j + 1];
                    prices[j + 1] = temp;
                }
            }
            cost += prices[lastIndex--];
            if(cost <= k)
                noOftoys++;
            else
                break;
        }
        return noOftoys;
    }
    public static void main(String... args)
    {
        int n, k, prices[];
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        k = scan.nextInt();
        prices = new int[n];
        for(int i = 0; i < n; i++) prices[i] = scan.nextInt();
        System.out.println(maximumToys(prices, k, n));
        scan.close();
    }
}