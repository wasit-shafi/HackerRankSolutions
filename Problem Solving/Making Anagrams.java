/**
 *  @author wasitshafi
 *  @since  07-07-20
 */
import java.util.Scanner;
import java.util.Arrays;

public class Solution
{
    static int makingAnagrams(String s1, String s2)
    {
        int len, arr[] = new int [26], sum;
        Arrays.fill(arr, 0);
        
        len = s1.length();
        for(int i = 0 ; i < len ; i++) arr[(int)(s1.charAt(i) - 'a')]--;
        len = s2.length();
        for(int i = 0 ; i < len ; i++) arr[(int)(s2.charAt(i) - 'a')]++;
        sum = 0;
        for(int i = 0 ; i < 26 ; i++) sum += Math.abs(arr[i]);
        return sum;
    }

    public static void main(String[] args)
    {    
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        System.out.println(makingAnagrams(s1, s2));
        scanner.close();
    }
}