/**
    @author wasitshafi
    @since  19-02-2020
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    static int findDigits(int n)
    {
        int digit, nCopy, count;

        nCopy = n;
        count = 0;
        while(nCopy != 0)
        {
            digit = nCopy % 10;
            if(digit != 0)
                if(n % digit == 0)
                    count++;
            nCopy = nCopy / 10;
        }
        return count;
    }
    public static void main(String... args) throws Exception
    {
        int tc;
        StringBuilder output = new StringBuilder("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        tc = Integer.parseInt(br.readLine());
        while(tc-- != 0) output.append(findDigits(Integer.parseInt(br.readLine())) + "\n");
        System.out.println(output);
        br.close();
    }
}