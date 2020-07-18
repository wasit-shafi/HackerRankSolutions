/**
 *  @author wasitshafi
 *  @since  18-07-20
 */
import java.util.Scanner;

public class Solution
{
    static String funnyString(String s)
    {
        for(int i = 0, j = s.length() - 1 ; i < j ; i++, j--)
        if(Math.abs(s.charAt(i) - s.charAt(i+1)) != Math.abs(s.charAt(j) - s.charAt(j -1)))
            return "Not Funny";
        return "Funny";
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
    
        while(q-- != 0) System.out.println(funnyString(scanner.next()));
        scanner.close();
    }
}