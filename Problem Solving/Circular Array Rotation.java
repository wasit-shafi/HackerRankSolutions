/**
 *  @author wasitshafi
 *  @since  05-07-20
 */
import java.util.*;

public class Solution
{
    static int[] circularArrayRotation(int[] a, int k, int[] queries)
    {
        int temp, result[], len = a.length;

        if(k >= a.length) k = k % len;
        for(int i = 0, j = len - 1 ; i < j ; i++, j--)
        {
            a[i] ^= a[j];
            a[j] ^= a[i];
            a[i] ^= a[j];
        }
        for(int i = 0, j = k - 1 ; i < j ; i++, j--)
        {  
           a[i] ^= a[j];
            a[j] ^= a[i];
            a[i] ^= a[j];
        }
        for(int i = k, j = len - 1 ; i < j ; i++, j--)
        {
           a[i] ^= a[j];
            a[j] ^= a[i];
            a[i] ^= a[j];
        }
        len = queries.length;
        result = new int[len];
        for(int i = 0 ; i < len ; i++) result[i] = a[queries[i]];
        
        return result;
    }

    public static void main(String[] args)
    {
        int n, k, q, a[], queries[], result[];
        Scanner scanner = new Scanner(System.in);
        StringBuilder output = new StringBuilder("");

        n = scanner.nextInt();
        k = scanner.nextInt();
        q = scanner.nextInt();

        a = new int[n];
        queries = new int[q];
        for (int i = 0 ; i < n ; i++) a[i] = scanner.nextInt();
        for (int i = 0 ; i < q ; i++) queries[i] = scanner.nextInt();
        result = circularArrayRotation(a, k, queries);
        for (int i = 0 ; i < q ; i++) output.append(result[i] + "\n");
        System.out.println(output);
        scanner.close();
    }
}