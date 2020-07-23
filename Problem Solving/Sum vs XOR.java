/**
 *  @author wasitshafi
 *  @since  23-07-20
 */
// Refer :https://www.hackerrank.com/challenges/sum-vs-xor/forum/comments/193923
public class Solution
{
    static long sumXor(long n)
    {
        long c = 0l;
        while(n != 0)
        {
            if(n % 2 == 0) c++;
            n /= 2;
        }
        return (long)(Math.pow(2, c));
    }

    public static void main(String[] args)
    {
        System.out.print(sumXor((new java.util.Scanner(System.in)).nextLong()));
    }
}
