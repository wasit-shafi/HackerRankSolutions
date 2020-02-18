import java.util.Scanner;

public class Solution
{
    boolean CheckIsAGreater(String A, String B)
    {
        for(int i = 0 ; i < A.length() && i < B.length() ; i++)
        {
            if(A.charAt(i) > B.charAt(i))
                return true;
            else if(A.charAt(i) < B.charAt(i))
                return false;
        }
        if(A.length() == B.length()) return false;
        else if(A.length() > B.length()) return true;
        else return false;
    }

    public static void main(String[] args)
    {    
        Solution obj = new Solution();
        Scanner scan=new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        int i;
        boolean isLexicographicallyGreater = obj.CheckIsAGreater(A, B);

        System.out.println(A.length() + B.length());
        if(isLexicographicallyGreater)
            System.out.println("Yes");
        else
            System.out.println("No");

        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.print(A + " " + B);
    }
}