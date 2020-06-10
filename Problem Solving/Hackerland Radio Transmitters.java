/**
    @author wasitshafi
    @since 10-06-2020
 */
import java.util.Scanner;
import java.util.Arrays;

public class Solution
{
    static int hackerlandRadioTransmitters(int[] x, int k)
    {
        int i = 0, j, count = 0;
    
        Arrays.sort(x);
        loop: while(i < x.length)
        {
            j = i;
            count++;
            while(x[j] - x[i] <= k)
            {
                j++;
                if(j >= x.length) break loop;
            }
            i = --j; 
            while(x[j] - x[i] <= k)
            {
                j++;
                if(j >= x.length) break loop;
            }
            i = j;
        }
        return count;
    }
 
    public static void main(String[] args)
    {
        int n, k, x[];
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        k = scan.nextInt();
        x = new int[n];
        for(int i = 0 ; i < n ; i++) x[i] = scan.nextInt();

        System.out.println(hackerlandRadioTransmitters(x, k));
        scan.close();
    }
}
