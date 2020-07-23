/**
 *  @author wasitshafi
 *  @since  23-07-20
 */
import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    static int lonelyinteger(int[] a)
    {
        int ans = a[0], len = a.length();
        for(int i = 1 ; i < len ; i++) ans ^= a[i]; 
        return ans;
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
        System.out.println(lonelyinteger(a));
        scanner.close();
    }
}