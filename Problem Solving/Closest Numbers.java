/**
 *  @author wasitshafi
 *  @since  11-07-2020
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Solution
{
    static int[] closestNumbers(int[] arr)
    {
        int temp, minDiff, result[], length = arr.length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        Arrays.sort(arr);
        minDiff = Integer.MAX_VALUE;
        for(int i = 1 ; i < length ; i++)
        {
            temp = arr[i] - arr[i - 1];
            if(temp > 0 && temp < minDiff) minDiff = temp;
        }

        for(int i = 1 ; i < length ; i++)
        {
            if(arr[i] - arr[i - 1] == minDiff)
            {
                arrayList.add(arr[i - 1]);
                arrayList.add(arr[i]);
            }
        }
        length = arrayList.size();
        result = new int[length];
        for(int i = 0 ; i < length ; i++) result[i] = arrayList.get(i);
        return result;
    }

    public static void main(String[] args)
    {
        int n, arr[], result[], length;
        Scanner scanner = new Scanner(System.in);
        
        n = scanner.nextInt();
        arr = new int[n];

        for(int i = 0 ; i < n ; i++) arr[i] = scanner.nextInt();
        result = closestNumbers(arr);
        length = result.length;
        for(int i = 0 ; i < length ; i++) System.out.print(result[i] + " ");
    
        scanner.close();
    }
}