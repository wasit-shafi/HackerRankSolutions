/**
 *  @author wasitshafi
 *  @since  17-07-20
 */
import java.util.Scanner;

public class Solution
{
    static int camelcase(String s)
    {
        int count = 0, len = s.length();

        for(int i = 0 ; i < len ; i++)
            if(s.charAt(i) >= 65 && s.charAt(i) <= 92)
                count++;
        return count + 1;
    }
    public static void main(String[] args)
    {
        System.out.print(camelcase((new Scanner(System.in)).nextLine()));
    }
}