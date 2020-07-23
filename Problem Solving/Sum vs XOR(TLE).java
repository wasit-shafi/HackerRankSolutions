/**
 *  @author wasitshafi
 *  @since  23-07-20
 */
// TLE in TC's 7, 8, 9, 10

public class Solution
{
    static long sumXor(long n)
    {
        long count = 0l;
        for(long i = 0l ; i <= n ; i++) if((n ^ i) == (n + i)) count++;
        return count;
    }

    public static void main(String[] args)
    {
        System.out.print(sumXor((new java.util.Scanner(System.in)).nextLong()));
    }
}