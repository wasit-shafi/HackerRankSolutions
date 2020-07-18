/**
 *  @author wasitshafi
 *  @since  18-07-20
 */
import java.util.Scanner;

public class Solution
{
    static int marsExploration(String s)
    {
        int len = s.length(), count = 0;   
        for(int i = 0 ; i < len - 2 ; i = i + 3)
        {
            if(Character.compare(s.charAt(i), 'S') != 0) count++;
            if(Character.compare(s.charAt(i + 1), 'O') != 0) count++;
            if(Character.compare(s.charAt(i + 2), 'S') != 0) count++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        System.out.print(marsExploration((new Scanner(System.in)).next()));
    }
}