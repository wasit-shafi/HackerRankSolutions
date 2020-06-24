/*
 * @author wasitshafi
 * @since 24-06-2020
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Solution
{
    static long minimumLoss(long[] price)
    {
        int length = price.length;
        long diff, min = Integer.MAX_VALUE;
        Map<Long, Integer> index = new HashMap<>();

        for(int i = 0 ; i < length ; i++) index.put(price[i], i);
        Arrays.sort(price);
        for(int i = 1 ; i < length; i++)
        {
            diff = price[i] - price[i - 1];// temp > 0
            if(diff < min && index.get(price[i]) < index.get(price[i-1])) min = diff;
        }
        return min;
    }

    public static void main(String[] args)
    {
        int n;
        long price[];
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        price = new long[n];

        for(int i = 0 ; i < n ; i++) price[i] = scan.nextLong();
        System.out.println(minimumLoss(price));
        scan.close();
    }
}