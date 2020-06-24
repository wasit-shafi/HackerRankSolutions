/**
 *  @author wasitshafi
 *  @since  23-06-2020
 */
import java.util.Scanner;
public class Solution
{
    static int maximizingXor(int l, int r)
    {
        int max = -1, temp;
        for(int i = l ; i <= r ; i++)
        {
            for(int j = i ; j <= r ; j++)
            {
                temp = i ^ j;
                if(temp > max) max = temp;
            }
        }
        return max;
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int l, r;

        l = scan.nextInt();
        r = scan.nextInt();
        System.out.print(maximizingXor(l, r));
        scan.close();
    }
}