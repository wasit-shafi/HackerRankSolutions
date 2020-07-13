/**
 *  @author wasitshafi
 *  @since  12-07-20
 */
import java.util.Scanner;

public class Solution
{
    static int workbook(int n, int k, int[] arr)
    {
        int exStart, exEnd, pageno = 1, specialProblems = 0;
        
        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i] <= k)
            {
                if(pageno >= 1 && pageno <= arr[i]) specialProblems++;
                pageno++;
            }
            else
            {
                exStart = 1;
                exEnd = k;
                while(exEnd <= arr[i])
                {
                    if(pageno >= exStart && pageno <= exEnd) specialProblems++;
                    exStart = exEnd+1;
                    exEnd += k;
                    pageno++;

                    if(exStart <= arr[i] && exEnd > arr[i])
                    {
                        if(pageno >= exStart && pageno <= arr[i]) specialProblems++;
                        pageno++;
                    }
                }
            }
        }
        return specialProblems;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();   
        System.out.println(workbook(n, k, arr));
        scanner.close();
    }
}