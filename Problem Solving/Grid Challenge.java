/**
 *  @author wasitshafi
 *  @since  03-08-20
 */
import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
    static String gridChallenge(String[] grid)
    {
        char temp[];
        String ans = "YES";
        int rows = grid.length;
        int cols = grid[0].length();
        
        for(int i = 0 ; i < rows ; i++)
        {
            temp = grid[i].toCharArray();
            Arrays.sort(temp);
            grid[i] = new String(temp);
        }

        loop:
        for(int i = 0 ; i < rows - 1 ; i++)
            for(int j = 0 ; j < cols ; j++)
                if(grid[i].charAt(j) > grid[i+1].charAt(j))
                {
                    ans = "NO";
                    break loop;
                }
        return ans;
    }

    public static void main(String[] args)
    {
        int t, n;
        String[] grid;
        Scanner scanner = new Scanner(System.in);
        StringBuilder output = new StringBuilder("");
        
        t = scanner.nextInt();        
        while(t-- != 0)
        {
            n = scanner.nextInt();
            scanner.nextLine();
            grid = new String[n];
            
            for (int i = 0; i < n; i++) grid[i] = scanner.next();
            output.append(gridChallenge(grid) + "\n");
        }
        System.out.print(output);
        scanner.close();
    }
}