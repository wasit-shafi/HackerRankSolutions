import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        String str;
        int start, end;
        Scanner scan = new Scanner(System.in);

        str = scan.next();
        start = scan.nextInt();
        end = scan.nextInt();
        
        for(int i = start ; i < end ;i++) System.out.print(str.charAt(i));
    }
}