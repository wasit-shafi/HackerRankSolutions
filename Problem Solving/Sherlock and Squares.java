/**
 *  @author wasitshafi
 *  @since  04-07-20
 */
import java.util.Scanner;
public class Solution
{
    static int squares(int a, int b)
    {
        return (int) (Math.floor(Math.sqrt(b)) - Math.ceil(Math.sqrt(a))) + 1;
    }

    public static void main(String[] args)
    {
        int q, a, b;
        Scanner scanner = new Scanner(System.in);
        StringBuilder output = new StringBuilder("");
        
        q = scanner.nextInt();
        while(q-- != 0)
        {
            a = scanner.nextInt();
            b = scanner.nextInt();
            output.append(squares(a, b) + "\n");
        }
        System.out.println(output);
        scanner.close();
    }
}