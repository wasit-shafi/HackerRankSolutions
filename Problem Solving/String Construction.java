/**
 *  @author wasitshafi
 *  @since  17-07-20
 */
import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    static int stringConstruction(String s)
    {
        int count = 0, len = s.length();
        boolean arr[] = new boolean[26];

        Arrays.fill(arr, false);
        for(int i = 0 ; i < len ; i++) if(!arr[s.charAt(i) - 'a']) arr[s.charAt(i) - 'a'] = true;
        for(int i = 0 ; i < 26 ; i++) if(arr[i]) count++;
        return count;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        scanner.nextLine();
        while(q-- != 0) System.out.println(stringConstruction(scanner.nextLine()));
        scanner.close();
    }
}