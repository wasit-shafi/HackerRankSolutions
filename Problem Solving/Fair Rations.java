/**
 *  @author wasitshafi
 *  @since  14-07-20
 */
import java.util.Scanner;

public class Solution
{
    static int fairRations(int[] B)
    {
        int count = 0, len = B.length;
        
        for(int i = 0 ; i < len - 1 ; i++)
            if((B[i] & 1) == 1)
            {
                B[i]++;
                B[i+1]++;
                count += 2;
            }

        for(int i = 0 ; i < len ; i++) if((B[i] & 1) == 1) return -1;
        return count;
    }

    public static void main(String[] args)
    {
        int B[], result, N;
        Scanner scanner = new Scanner(System.in);
        
        N = scanner.nextInt();
        B = new int[N];

        for (int i = 0; i < N; i++) B[i] = scanner.nextInt();
        result = fairRations(B); 
        if(result == -1)
            System.out.print("NO");
        else
            System.out.println(result);

        scanner.close();
    }
}