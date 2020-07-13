/**
 *  @author wasitshafi
 *  @since  13-07-20
 */
import java.util.Scanner;

public class Solution
{
    static int[] acmTeam(String[] topic) // Solution Without using BitSet
    {
        int result[], max = Integer.MIN_VALUE, count, maxCount = 0, n = topic.length, m = topic[0].length();

        for(int i = 0 ; i < n ; i++)
            for(int j = i + 1 ; j < n ; j++)
            {
                count = 0;
                for(int k = 0 ; k < m ; k++) if(topic[i].charAt(k) == '1' || topic[j].charAt(k) == '1')  count++;
                if(count > max)
                {
                    max = count;
                    maxCount = 0;
                }
                if(count == max) maxCount++;
            }
        result = new int[2];
        result[0] = max;
        result[1] = maxCount;
        return result;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] topic = new String[n];

        for(int i = 0 ; i < n ; i++) topic[i] = scanner.next();
        int result[] = acmTeam(topic);
        for(int i = 0 ; i < result.length ; i++) System.out.println(result[i]);
        scanner.close();
    }
}