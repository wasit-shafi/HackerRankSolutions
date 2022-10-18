/**
    @author wasitshafi
    @since  19-02-2020
*/
import java.util.Scanner;

public class Solution
{
    static void countSwaps(int[] a)
    {
        int count = 0;
        for( int i = 0 ; i < a.length ; i++)
        {
            for (int j = 0; j < a.length - i - 1 ; j++)
            {
                if(a[j] > a[j + 1])
                {
                    count++;
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                }
            }
        }
        System.out.println("Array is sorted in " + count + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.print("Last Element: " + a[a.length - 1]);
    }
    public static void main(String... args)
    {
        int n, a[];
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        a = new int[n];
        for(int i = 0 ; i < n ; i++) a[i] = scan.nextInt();
        countSwaps(a);
        scan.close();
    }
}
