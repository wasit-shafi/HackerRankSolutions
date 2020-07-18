/**
 *  @author wasitshafi
 *  @since  18-07-20
 */
import java.util.Scanner;

public class Solution
{
    static String hackerrankInString(String s)
    {
        String hackerrank = "hackerrank";
        int hackerrankLength = "hackerrank".length(), index = 0, len = s.length();

        for(int i = 0 ; i < len && index < hackerrankLength ; i++) if(s.charAt(i) == hackerrank.charAt(index)) index++;
        if(index == hackerrankLength)
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
    
        scanner.nextLine();
        while(q-- != 0) System.out.println(hackerrankInString(scanner.next()));
        scanner.close();
    }
}