/**
 *  @author wasitshafi
 *  @since  14-07-20
 */
import java.util.Scanner;

public class Solution
{
    static String appendAndDelete(String s, String t, int k)
    {
        int slen = s.length(), tlen = t.length();
        if(s.equals(t))
        {
            if(k >= 2 * slen)
                return "Yes";
            else if(k % 2 != 0)// we can't repeatedly delete & add characters
                return "No";
            else
                return "Yes";//we can simply repeatedly delete & append last charcter
        }
        else
        {
            int i;
            for(i = 0 ; (i < slen) && (i < tlen) && (s.charAt(i) == t.charAt(i)) ; i++);
            int srem = slen - i;
            int trem = tlen - i;

            if(k >= slen + tlen)
                return "Yes";
            else if(k < srem + trem)
                return "No";
            else if((k - (srem + trem)) % 2 != 0) // odd
                return "No";
            else
                return "Yes";
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
     
        System.out.print(appendAndDelete(scanner.nextLine(), scanner.nextLine(), scanner.nextInt()));
        scanner.close();
    }
}