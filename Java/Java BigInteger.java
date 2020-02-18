import java.util.Scanner;
import java.math.BigInteger;

public class Solution
{
    public static void main(String[] args)
    {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("0");
        Scanner scan = new Scanner(System.in);

        a = scan.nextBigInteger();
        b = scan.nextBigInteger();

        System.out.println(a.add(b));
        System.out.print(a.multiply(b)); 
    }
}