/**
 *  @author wasitshafi
 *  @since  09-07-2020
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Solution
{
    static int[] cutTheSticks(int[] arr)
    {
        boolean hasPositive = true;
        int min, count, res[], len = arr.length;
        ArrayList<Integer> arrList = new ArrayList<>();
        
        while(true)
        {
            min = Integer.MAX_VALUE;
            for(int i = 0 ; i < len ; i++)
                if(arr[i] > 0 && arr[i] < min)
                    min = arr[i];
            if(min == Integer.MAX_VALUE) break;
            count = 0;             
            for(int i = 0 ; i < len ; i++)
                if(arr[i] >= min)
                {
                    arr[i] = arr[i] - min;
                    count++;
                }
            arrList.add(count);
        }
        len = arrList.size();
        res = new int[len];
        for(int i = 0 ; i < len ; i++) res[i] = arrList.get(i);
        return res;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        int[] result = cutTheSticks(arr);
        for (int i = 0; i < result.length; i++) System.out.println(result[i] + " ");
        scanner.close();
    }
}
