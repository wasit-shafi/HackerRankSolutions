/**
    @author wasitshafi
    @since  19-02-2020
*/
import java.util.Scanner;
import java.math.BigInteger;

public class Solution
{
    static void extraLongFactorials(int n)
    {
        BigInteger fact = BigInteger.ONE;
        while(n != 0) fact = fact.multiply(BigInteger.valueOf(n--));
        System.out.print(fact);
    }
    public static void main(String... args)
    {
        Scanner scan = new Scanner(System.in);

        extraLongFactorials(scan.nextInt());
        scan.close();
    }
}