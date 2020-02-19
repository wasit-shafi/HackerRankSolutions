/**
    @author wasitshafi
    @since  19-02-2020
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    static int alternatingCharacters(String s)
    {
        int count = 0;

        for(int i = 0 ; i < s.length() - 1 ; i++)
            if(s.charAt(i) == s.charAt(i + 1))
             count++;
        return count;
    }

    public static void main(String[] args) throws Exception
    {
        int q;
        StringBuilder output = new StringBuilder("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        q = Integer.parseInt(br.readLine());
        while(q-- != 0) output.append(alternatingCharacters(br.readLine()) + "\n");
        System.out.println(output);
        br.close();
    }
}