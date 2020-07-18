/**
 *  @author wasitshafi
 *  @since  18-07-20
 */
import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    static int anagram(String s)
    {
        int len = s.length(), count = 0;
        if((len & 1) == 1)
            return -1;
        else
        {
            int mid = len / 2, arr[] = new int[26];
            Arrays.fill(arr, 0);

            for(int i = 0; i < mid ; i++) arr[s.charAt(i) - 'a']++;
            for(int i = mid ; i < len ; i++)
                if(arr[s.charAt(i) - 'a'] == 0)
                    count++;
                else
                    arr[s.charAt(i)- 'a']--;
        }
        return count;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.nextLine();
        
        while(q-- != 0) System.out.println(anagram(scanner.next()));
        scanner.close();
    }
}