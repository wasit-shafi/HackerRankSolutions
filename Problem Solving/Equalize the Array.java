/**
 *  @author wasitshafi
 *  @since  12-07-20
 */
import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    static int equalizeArray(int[] arr)
    {
        int freq[] = new int[101], len = arr.length;  
        Arrays.fill(freq, 0);
        for(int i = 0 ; i < len ; i++) freq[arr[i]]++;
        
        return Arrays.stream(freq).sum() - Arrays.stream(freq).max().getAsInt();
    }

    public static void main(String[] args)
    {
        int n, arr[];
        Scanner scanner = new Scanner(System.in);
        
        n = scanner.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        System.out.println(equalizeArray(arr));
        scanner.close();
    }
}