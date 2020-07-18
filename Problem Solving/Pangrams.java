/**
 *  @author wasitshafi
 *  @since  18-07-20
 */
import java.util.Scanner;

public class Solution
{
    static String pangrams(String s)
    {
        boolean arr[] = new boolean[26]; // default value is false
        int len = s.length();

        for(int i = 0 ; i < len ; i++)
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90 && !arr[s.charAt(i) - 'A'])
                arr[s.charAt(i) - 'A'] = true;
            else if(s.charAt(i) >= 97 && s.charAt(i) <= 122 && !arr[s.charAt(i) - 'a'])
                arr[s.charAt(i) - 'a'] = true;
        for(int i = 0 ; i < 26 ; i++) if(!arr[i]) return "not pangram";
        return "pangram";
    }
 
    public static void main(String[] args)
    {
        System.out.print(pangrams((new Scanner(System.in)).nextLine()));
    }
}