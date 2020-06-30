/**
 *  @author wasitshafi
 *  @since  28-06-20
 */
import java.util.Scanner;

public class Solution
{
    static int theLoveLetterMystery(String s)
    {
        Boolean isPalindrome = true;
        int sum = 0, strLength = s.length();
        
        for(int i = 0 , j = strLength - 1 ; i < j ; i++, j--)
            if(s.charAt(i) != s.charAt(j))
            {
                isPalindrome = false;
                break;
            }
     
        if(!isPalindrome)
            for(int i = 0, j = strLength - 1 ; i < j ; i++, j--)
                sum += Math.abs(s.charAt(i) - s.charAt(j));
        return sum;
    }
    
    public static void main(String[] args)
    {
        int q;
        String str = "";
        Scanner scanner = new Scanner(System.in);
        
        q = scanner.nextInt();
        while(q-- != 0)
            System.out.println(theLoveLetterMystery(scanner.next()));

        scanner.close();
    }
}