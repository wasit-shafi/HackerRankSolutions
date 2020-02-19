/**
    @author wasitshafi
    @since  18-02-2020
*/
import java.util.Scanner;

public class Solution
{
    static int birthday(int s[], int d, int m)
    {
        int sum, count = 0;
        int len = s.length;
        for (int i = 0 ; i < len - m + 1 ; i++)
        {
            sum = 0;
            for(int j = i ; j < i + m ; j++) sum = sum + s[j];
            if(sum == d) count++;
        }
        return count;
    }
    public static void main(String... args)
    {
        int n, s[], d, m;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        s = new int[n];

        for(int i = 0 ; i < n ; i++) s[i] = scan.nextInt();
        d = scan.nextInt();
        m = scan.nextInt();

        System.out.println(birthday(s, d, m));
        scan.close();
    }
}
