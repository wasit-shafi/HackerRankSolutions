/**
 *  @author wasitshafi
 *  @since  08-07-20
 */
import java.util.Scanner;

public class Solution
{
    static int howManyGames(int p, int d, int m, int s)
    {
        int count = 1;
        if(s < p)
            return 0;
        else
        {
            int sum = p, nextPrice = p - d;
            while(sum + nextPrice <= s && nextPrice >= m)
            {
                count++;
                sum += nextPrice;
                nextPrice -= d;
            }
            if(nextPrice < m)
              count += (s - sum) / m;
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int answer = howManyGames(p, d, m, s);

        System.out.print(answer);
        scanner.close();
    }
}
