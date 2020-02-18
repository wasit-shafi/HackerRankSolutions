import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
    
        n = scan.nextInt();
        if(n % 2 != 0)
            System.out.print("Weird");
        else
        {
            if(n >= 2 && n <= 5 || n > 20)
                System.out.print("Not Weird");
            else if(n >= 6 && n <= 20)
                System.out.print("Weird");
        }
    }
}