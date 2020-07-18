/**
 *  @author wasitshafi
 *  @since  18-07-20
 */
import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    static String gameOfThrones(String s)
    {
        int len = s.length(), arr[] = new int[26], sum = 0;
 
        Arrays.fill(arr, 0);
        for(int i = 0 ; i < len ; i++) arr[s.charAt(i) - 'a']++;
        for(int i = 0 ; i < 26 ; i++) arr[i] = arr[i] % 2;
        for(int i = 0 ; i < 26 ; i++) sum += arr[i];

        if(sum == 0 || sum == 1)
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args)
    {
        System.out.print(gameOfThrones((new Scanner(System.in)).next()));
    }
}