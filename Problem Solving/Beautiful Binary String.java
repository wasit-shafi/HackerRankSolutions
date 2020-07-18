/**
 *  @author wasitshafi
 *  @since  18-07-20
 */
import java.util.Scanner;

public class Solution
{
    static int beautifulBinaryString(String b)
    {
        int count = 0;
        for(int i = 0 ; i < b.length() - 2; i++)
            if(b.charAt(i) == '0' && b.charAt(i + 1) == '1' && b.charAt(i + 2) == '0')
            {
                count++;
                i = i + 2;
            }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
    
        scanner.nextLine();
        System.out.println(beautifulBinaryString(scanner.next()));
        scanner.close();
    }
}