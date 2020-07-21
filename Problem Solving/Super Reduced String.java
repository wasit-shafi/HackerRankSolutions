/**
 *  @author wasitshafi
 *  @since  20-07-20
 */
public class Solution
{
    static String superReducedString(String s)
    {
        int i = 1;
        StringBuilder sb = new StringBuilder(s);
        while(i < sb.length())
        {
            if(sb.charAt(i - 1) == sb.charAt(i))
            {
                sb.replace(i - 1, i + 1, "");
                if(i != 1)
                    i--;
            }
            else
                i++;
        }
        if(sb.length() == 0)
            return "Empty String";
        else
            return sb.toString();
    }

    public static void main(String[] args)
    {
        System.out.println(superReducedString(new java.util.Scanner(System.in).next()));
    }
}