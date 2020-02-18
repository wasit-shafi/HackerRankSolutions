import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        int prefixSum[], n, sum, count;
        Scanner scan = new Scanner(System.in);
        
        sum = count = 0;
        n = scan.nextInt();
        prefixSum = new int[n];

        for(int i = 0 ; i < n ; i++)
        {
            sum += scan.nextInt();
            prefixSum[i] = sum;
        }
        
        for(int i = 0 ; i < prefixSum.length ; i++)
        {
            for( int j = i ; j < prefixSum.length ; j++)
            {
                sum = 0;
                if(i == 0 && j == 0)       // Special case
                    sum = prefixSum[i];    // sum of arr[0]
                else if( i == 0 && j != 0)
                    sum = prefixSum[j];    // [0]to[1], [0]to[2], [0]to[3]...
                else
                    sum = prefixSum[j] - prefixSum[i - 1];

                if(sum < 0)count++;
            }
        }
        System.out.print(count);
        scan.close();
    }
}