import java.util.Scanner;
import java.util.ArrayList;
import static java.lang.System.out;

public class Solution
{
    public static void main(String[] args)
    {
        String token = "";
        Scanner scan = new Scanner(System.in);
        ArrayList<String> tokens = new ArrayList<>();
        String s = scan.nextLine();

        for(int i = 0 ; i < s.length() ; i++)
        {
            if((s.charAt(i) < 'a' || s.charAt(i) > 'z') &&(s.charAt(i) < 'A' || s.charAt(i) > 'Z') && !(token.equals("")))
            {
                tokens.add(token);
                token = "";
            }
            else if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) 
                token = token + s.charAt(i);
        }
        
        if(token.equals("")) out.println(tokens.size());
        else out.println(tokens.size() + 1);

        for(String item : tokens) out.println(item);
        if(!token.equals("")) out.println(token);

        scan.close();
    }
}