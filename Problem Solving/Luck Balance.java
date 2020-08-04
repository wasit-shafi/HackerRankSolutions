/**
 *  @author wasitshafi
 *  @since  03-08-20
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    static int luckBalance(int k, int[][] contests)
    {
        int luck = 0, len = contests.length;
        ArrayList<Integer> arr = new ArrayList<>();
     
        for (int i = 0 ; i < len ; i++)
        {
            if (contests[i][1] == 0) luck += contests[i][0];
            if (contests[i][1] == 1) arr.add(contests[i][0]);
        }
     
        Collections.sort(arr, Collections.reverseOrder());
        len = arr.size();

        for (int i = 0 ; i < len ; i++)
            if(i < k)
                luck += arr.get(i);
            else
                luck -= arr.get(i);

        return luck;
    }

   public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < 2; j++)
                contests[i][j] = scanner.nextInt();
        System.out.print(luckBalance(k, contests));
        scanner.close();
    }
}