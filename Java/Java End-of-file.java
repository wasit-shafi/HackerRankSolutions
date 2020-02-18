import java.util.Scanner;

public class Solution
{
    public static void main(String []args)
    {
        String str;
        int lineNo = 1 ;
        Scanner scan = new Scanner(System.in);

        do
        {
            str = scan.nextLine();
            System.out.println(lineNo++ + " " + str);
        }while(scan.hasNext());
    }
}