/**
 *  @author wasitshafi
 *  @since 01-07-20
 */
// Refer : https://www.thepoorcoder.com/hackerrank-kangaroo-solution/
import java.util.Scanner;

public class Solution
{
    static String kangaroo(int x1, int v1, int x2, int v2)
    {
        if(v1 <= v2)
            return "NO";
        else
        {
            if((x2 - x1) % (v1 - v2) == 0)
                return "YES";
            else
                return "NO";
        }
    }
    
    public static void main(String[] args)
    {
        int x1, x2, v1, v2;
        Scanner scanner = new Scanner(System.in);
        
        x1 = scanner.nextInt();
        v1 = scanner.nextInt();
        x2 = scanner.nextInt();
        v2 = scanner.nextInt();

        System.out.print(kangaroo(x1, v1, x2, v2));
        scanner.close();
    }
}