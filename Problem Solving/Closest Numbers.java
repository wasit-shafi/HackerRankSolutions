/**
 *  @author wasitshafi
 *  @since  11-07-2020
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Solution
{
    static void merge(int arr[], int low, int mid, int high)
    {
        int i = 0;
        int j = 0;
        int k = low;
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int x = 0 ; x < n1 ; x++) left[x] = arr[low + x];
        for (int x = 0 ; x < n2 ; x++) right[x] = arr[mid + 1 + x];

        while (i < n1 && j < n2)
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];

        while (i < n1) arr[k++] = left[i++];
        while (j < n2) arr[k++] = right[j++];
    }
    
    static void mergeSort(int arr[], int low, int high)
    {
        if(low < high)
        {
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    static int[] closestNumbers(int[] arr)
    {
        int temp, minDiff, result[], length = arr.length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        //Arrays.sort(arr);
        mergeSort(arr, 0, arr.length - 1);
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