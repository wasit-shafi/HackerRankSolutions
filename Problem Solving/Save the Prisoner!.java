/**
 *  @author wasitshafi
 *  @since  13-07-20
 */
import java.util.Scanner;

public class Solution
{
    static int saveThePrisoner(int n, int m, int s)
    {
        int chairNo = (s-1 + m) % n;
        if(chairNo == 0)
            return n;
        else
            return chairNo;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while(t-- != 0) System.out.println(saveThePrisoner(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        scanner.close();
    }
}