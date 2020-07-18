/**
 *  @author wasitshafi
 *  @since  18-07-20
 */
import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    static int gemstones(String[] arr)
    {
        int brr[] = new int[26], n = arr.length, count = 0, len;

        Arrays.fill(brr, 0);
        for(int i = 0 ; i < n ; i++)
        {
            len = arr[i].length();
            for(int j = 0 ; j < len ; j++)
                if(brr[arr[i].charAt(j) - 'a'] == i)
                    brr[arr[i].charAt(j) - 'a']++;
        }
    
        for(int i = 0 ; i < 26 ; i++)
            if(brr[i] == n)
                count++;
        return count;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] arr = new String[n];
       
        scanner.nextLine();
        for(int i = 0 ; i < n ; i++) arr[i] = scanner.next();
        System.out.print(gemstones(arr));
        scanner.close();
    }
}