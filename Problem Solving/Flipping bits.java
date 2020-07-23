/**
 *  @author wasitshafi
 *  @since  23-07-20
 */
import java.util.Scanner;
public class Solution
{
    static long flippingBits(long n)
    {
        long x = 1l;
        return n ^ ((x << 32) - 1); 
            // or
        //return 4294967295l ^ n;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while(n-- != 0) System.out.println(flippingBits((scanner.nextLong())));
        
        scanner.close();
    }
}