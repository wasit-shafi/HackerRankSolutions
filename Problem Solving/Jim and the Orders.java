/**
 *  @author wasitshafi
 *  @since  01-08-20
 */
import java.util.Scanner;

public class Solution
{
    static int[] jimOrders(int[][] orders)
    {
        int ans[], min_index, len = orders.length;

        for (int i = 0 ; i < len ; i++)
        {
            orders[i][1] += orders[i][0];
            orders[i][0] = i + 1;
        }

        for (int i = 0 ; i < len - 1 ; i++) // Selection Sort    
        {
            min_index = i;
            for (int j = i + 1 ; j < len ; j++)
                if (orders[j][1] < orders[min_index][1])
                    min_index = j;
        
            if (min_index != i)
            {
                orders[i][0] ^= orders[min_index][0];
                orders[min_index][0] ^= orders[i][0];
                orders[i][0] ^= orders[min_index][0];

                orders[i][1] ^= orders[min_index][1];
                orders[min_index][1] ^= orders[i][1];
                orders[i][1] ^= orders[min_index][1];
            }
        }
        ans = new int [len];
        for (int i = 0 ; i < len ; i++) ans[i] = orders[i][0];
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] orders = new int[n][2];

        for (int i = 0; i < n; i++)
        {
            orders[i][0] = scanner.nextInt();
            orders[i][1] = scanner.nextInt();
        }       

        int[] result = jimOrders(orders);
        for (int i = 0; i < result.length; i++) System.out.print(result[i] + " ");
        scanner.close();
    }
}