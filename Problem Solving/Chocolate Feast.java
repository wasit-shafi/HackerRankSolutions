/**
 *  @author wasitshafi
 *  @since  05-07-20
 */
import java.util.Scanner;

public class Solution
{
    static int chocolateFeast(int n, int c, int m)
    {
        int chocolates, wrappers, temp;
        
        wrappers = chocolates = n / c;
        while(wrappers >= m)
        {
            temp = wrappers / m;
            chocolates += temp;
            wrappers = temp + wrappers % m;
        }
        return chocolates;
    }
    public static void main(String[] args)
    {
        int t, n, c, m;
        Scanner scanner = new Scanner(System.in);
        StringBuilder output = new StringBuilder("");       
        
        t = scanner.nextInt();
        while(t-- != 0)
        {
           n = scanner.nextInt();
           c = scanner.nextInt();
           m = scanner.nextInt();
           output.append(chocolateFeast(n, c, m) + "\n");
        }
        System.out.println(output);
        scanner.close();
    }
}