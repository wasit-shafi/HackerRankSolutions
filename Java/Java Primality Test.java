import java.util.Scanner;
import java.math.BigInteger;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        BigInteger num = new BigInteger(scan.nextLine());

        System.out.print(num.isProbablePrime(1)? "prime" : "not prime");
        scan.close();
    }
}