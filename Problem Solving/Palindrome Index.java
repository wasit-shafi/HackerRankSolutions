/**
 *  @author wasitshafi
 *  @since  20-07-20
 */
import java.util.Scanner;
public class Solution
{
    static int palindromeIndex(String s)
    {
        int i, j, x, y, len = s.length();

        for(i = 0 , j = len - 1 ; i < j ; i++, j--)
            if(!(s.charAt(i) == s.charAt(j)))
                break;
        if(i >= j)
            return -1;

        for(x = i + 1, y = j ; x < y ; x++, y--)
            if(!(s.charAt(x) == s.charAt(y)))
                break;
        
        if(x >= y)
            return i;
        else
            return j;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.nextLine();
        while(q-- != 0) System.out.println(palindromeIndex(scanner.next()));
        scanner.close();
    }
}