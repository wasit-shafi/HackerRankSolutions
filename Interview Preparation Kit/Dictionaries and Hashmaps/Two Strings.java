/**
    @author wasitshafi
    @since  19-02-2020
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    static String twoStrings(String s1, String s2)
    {
        boolean result[] = new boolean[26];

        for(int i = 0 ; i < 26 ; i++) result[i] = false;
        for(int i = 0 ; i < s1.length() ; i++) result[s1.charAt(i) - 'a'] = true;
        for(int i = 0 ; i < s2.length() ; i++) if(result[s2.charAt(i) - 'a'] == true) return "YES";
        return "NO";
    }
    public static void main(String... args) throws Exception
    {
        StringBuilder output = new StringBuilder("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(br.readLine());
        while(q-- != 0) output.append(twoStrings(br.readLine(), br.readLine()) + "\n");
        System.out.println(output);
        br.close();
    }
}