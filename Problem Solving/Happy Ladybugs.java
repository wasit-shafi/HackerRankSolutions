/**
 *  @author wasitshafi
 *  @since  14-07-20
 */
import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    static String happyLadybugs(String b)
    {
        int len = b.length(), _Count = 0, freq[] = new int[26];

        Arrays.fill(freq, 0);
        for(int i = 0 ; i < len ; i++)
            if(b.charAt(i) == '_')
                _Count++;
            else
                freq[b.charAt(i) - 'A']++;

        for(int i = 0 ; i < 26 ; i++)
            if(freq[i] == 1) // it will be never happy
                return "NO";
        
        if(_Count == 0) // we can't do any kind of swapping
            for(int i = 1 ; i < len - 1 ; i++)
                if(!(b.charAt(i-1) == b.charAt(i)) && !(b.charAt(i) == b.charAt(i +1)))
                    return "NO";

        return "YES"; // by swapping we can rearrange, as we need atleast 1 empty cell
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        StringBuilder output = new StringBuilder("");
        
        int t = scanner.nextInt();
        while(t-- != 0)
        {
            scanner.nextInt();   // n
            scanner.nextLine(); // clear input buffer
            output.append(happyLadybugs(scanner.nextLine()) + "\n");
        }
        System.out.print(output);
        scanner.close();
    }
}