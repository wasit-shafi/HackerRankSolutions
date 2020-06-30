/**
 *  @author wasitshafi
 *  @since  28-06-20
 */
import java.util.Scanner;

public class Solution
{
    static void kaprekarNumbers(int p, int q)
    {
        int left, right, nDigits;
        long powersOf10, nSquare;
        StringBuilder output = new StringBuilder("");
        
        for(int n = p ; n <= q ; n++)
        {
            powersOf10 = 1;
            nSquare = (long)n * n;
            left = right = 0;
            nDigits = (int)Math.floor(Math.log10(n)) + 1;

            while(nDigits-- != 0)
            {
                right += powersOf10 * (nSquare % 10);
                nSquare = nSquare / 10;
                powersOf10 *= 10;   
            }
            powersOf10 = 1;
            while(nSquare != 0)
            {
                left += powersOf10 * (nSquare % 10);
                nSquare = nSquare / 10;
                powersOf10 *= 10;   
            }
            if(left + right == n) output.append(n + " ");
        }

        if(output.toString().equals(""))
            System.out.println("INVALID RANGE");
        else
            System.out.println(output);
    }
    
    public static void main(String[] args)
    {
        int p, q;
        Scanner scanner = new Scanner(System.in);
        
        p = scanner.nextInt();
        q = scanner.nextInt();
        kaprekarNumbers(p, q);

        scanner.close();
    }
}