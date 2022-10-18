/**
    @author wasitshafi
    @since  19-02-2020
*/
import java.util.Scanner;

public class Solution
{
    static int jumpingOnClouds(int[] c, int k)
    {
        int i, e;

        i = 0;
        e = 100;
        do
        {
            i = (i + k) % c.length;
            e--;
            if(c[i] == 1) e = e - 2;
        }while(i != 0);
        return e;
    }
    public static void main(String... args)
    {
        int n, k, c[];
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        k = scan.nextInt();
        c = new int[n];
        for(int i = 0 ; i < n ; i++) c[i] = scan.nextInt(); 
        System.out.print(jumpingOnClouds(c, k));
        scan.close();
    }
}
