/**
 *  @author wasitshafi
 *  @since  14-07-20
 */
import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    static int flatlandSpaceStations(int n, int[] c)
    {
        int max, l, r, len = c.length;
 
        if(n == len)
            max = 0;
        else if(c.length == 1)
        {
            l = c[0];
            r = n - 1 - c[0];
            max = l > r ? l : r;
        }         
        else
        {
            int temp;
            Arrays.sort(c);
            l = c[0];
            r = n - 1 - c[len - 1];
            max = l > r ? l : r;
            for(int i = 0 ; i < len - 1 ; i++)
            {
                temp = (c[i + 1] - c[i]) / 2; 
                if(temp > max) max = temp;
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int c[] = new int[m];

        for(int i = 0; i < m; i++) c[i] = scanner.nextInt();
        System.out.print(flatlandSpaceStations(n, c));
        scanner.close();
    }
}