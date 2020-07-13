/**
 *  @author wasitshafi
 *  @since  13-07-20
 */
import java.util.BitSet;
import java.util.Scanner;

public class Solution
{
    static int[] acmTeam(String[] topic)
    {
        int result[], max = Integer.MIN_VALUE, highBitsCount, maxCount = 0, n = topic.length, m = topic[0].length();
        BitSet b1 = new BitSet(m);
        BitSet b2 = new BitSet(m);
        BitSet temp = new BitSet(m);
        
        for(int i = 0 ; i < n ; i++)
        {
            // set b1 
            b1.clear();
            for(int k = 0 ; k < m ; k++) if(topic[i].charAt(k) == '1') b1.set(k);
            
            for(int j = i + 1 ; j < n ; j++)
            {
                // set b2 
                b2.clear();
                for(int k = 0 ; k < m ; k++) if(topic[j].charAt(k) == '1') b2.set(k);
                
                temp = (BitSet)b1.clone();
                temp.or(b2);
                highBitsCount = temp.cardinality();
                if(highBitsCount > max)
                {
                    max = highBitsCount;
                    maxCount = 0;
                }
                if(highBitsCount == max) maxCount++;
            }
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