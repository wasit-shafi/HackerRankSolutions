import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        int max, j, sum;
        int[][] arr = new int[6][6];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++)
            for(j = 0 ; j < 6 ; j++)
                arr[i][j] = scanner.nextInt();
        max = Integer.MIN_VALUE;

        for(int i = 0 ; i < 6 - 2 ; i++)
        {
            for(j = 0 ; j < 6 - 2 ; j++)
            {
                sum = arr[i][j] + arr[i][j+ 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if(sum > max) max = sum;
            }
        }
        System.out.print(max);
        scanner.close();
    }
}