import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {       int x;
            String s;
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                s = sc.next();
                x = sc.nextInt();
                System.out.printf("%-15s%03d\n", s, x);
            }
            System.out.println("================================");
    }
}