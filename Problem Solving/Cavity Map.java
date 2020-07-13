/**
 *  @author wasitshafi
 *  @since  10-07-20
 */
 import java.util.Scanner;

public class Solution
{
    static String[] cavityMap(String[] grid)
    {
        StringBuilder sb = new StringBuilder("");
        if(grid.length == 1 && grid[0].length() == 1)//grid[] is only single digit eg: 9
            sb.append(grid[0]);
        else
        {
            int x, up, down, left, right, j; 
            int gridLength = grid.length, stringLength = grid[0].length();
    
            sb.append(grid[0] + "\n");
            for(int i = 1 ; i < gridLength - 1 ; i++)
            {
                sb.append(grid[i].charAt(0));
                for(j = 1 ; j < stringLength - 1; j++)
                {
                    x = grid[i].charAt(j) - '0';
                    up = grid[i-1].charAt(j) - '0';
                    down =grid[i+1].charAt(j) - '0';
                    left =grid[i].charAt(j-1) - '0';
                    right = grid[i].charAt(j+1) - '0';

                    if( x > up && x > down && x > left && x > right)
                        sb.append("X");
                    else
                        sb.append(grid[i].charAt(j));
                }
                sb.append(grid[i].charAt(j) + "\n");
            }
            sb.append(grid[gridLength-1]);
        }
        return sb.toString().split("\n");
    }


    public static void main(String[] args)
    {
        int n;
        String grid[], result[];
        Scanner scanner = new Scanner(System.in);
        
        n = scanner.nextInt();
        scanner.nextLine(); // clear buffer before reading strings
        grid = new String[n];
        for (int i = 0; i < n; i++) grid[i] = scanner.nextLine();
        result = cavityMap(grid);
        for (int i = 0; i < result.length; i++) System.out.println(result[i]);
        
        scanner.close();
    }
}