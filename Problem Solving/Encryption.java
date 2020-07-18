/**
 *  @author wasitshafi
 *  @since  -07-20
 */
import java.util.Scanner;

public class Solution
{
    static String encryption(String s)
    {
        StringBuilder ans[];
        int len, rows, cols, index;
        StringBuilder output = new StringBuilder("");

        s.replace(" ", "");
        len = s.length();
        rows = (int)(Math.floor(Math.sqrt(len)));
        cols = (int)(Math.ceil(Math.sqrt(len)));
    
        while(rows * cols < len) rows++;
        ans = new StringBuilder[rows];
        for(int i = 0 ; i < rows ; i++) ans[i] = new StringBuilder("");
        
        index = 0;
        for(int i = 0 ; i < rows ; i++)
            for(int j = 0 ; j < cols ; j++)
            {
                if(index == len) break;
                ans[i].append(s.charAt(index++));
            }

        for(int i = 0 ; i < cols ; i++)
        {
            for(int j = 0 ; j < rows ; j++)
                if(i < ans[j].length())
                    output.append(ans[j].charAt(i));
            output.append(" ");
        }

        return output.toString();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println(encryption(s));
        scanner.close();
    }
}