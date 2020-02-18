import java.util.Scanner;

public class Solution
{
    public static void main(String... args)
    {
        int i, j;
        String str;
        boolean isPalindrome = true;
        Scanner scan = new Scanner(System.in);
        
        str = scan.next();
        for(i = 0, j = str.length() - 1 ; i < j ; i++, j--)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}