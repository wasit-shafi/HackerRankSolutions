import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        int i;
        double d;
        String str;
        Scanner scan = new Scanner(System.in);
     
        i = scan.nextInt();
        d = scan.nextDouble();
        scan.nextLine();
        str = scan.nextLine();

        System.out.println("String: " + str);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        scan.close();
    }
}