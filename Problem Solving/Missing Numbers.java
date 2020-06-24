/**
 *  @author wasitshafi
 *  @since  23-06-2020
 */
import java.util.Set;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Missing
{
    static int[] missingNumbers(int[] arr, int[] brr)
    {
        int result[], aLen, bLen, i, j;
        Set<Integer> s = new LinkedHashSet<>();//Why not ArrayList? Refer 3 note of Ques.
        
        Arrays.sort(arr);
        Arrays.sort(brr);

        aLen = arr.length;
        bLen = brr.length;
        i = j = 0;
        while(i < aLen && j < bLen)
            if(arr[i] > brr[j])
                while(arr[i] > brr[j]) s.add(brr[j++]);
            else
            {
                i++;
                j++;
            }
        while(j < bLen)
        {
             s.add(brr[j++]);
        }
        result = new int[s.size()];
        i = 0;
        Iterator<Integer> itr = s.iterator();
        while(itr.hasNext()) result[i++] = itr.next();
        return result;
    }

    public static void main(String[] args)
    {
        int n, m, arr[], brr[], result[], len;
        Scanner scan = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        
        n = scan.nextInt();
        arr = new int[n];
        for(int i = 0 ; i < n ; i++) arr[i] = scan.nextInt();
        
        m = scan.nextInt();
        brr = new int[m];
        for(int i = 0 ; i < m ; i++) brr[i] = scan.nextInt();

        result = missingNumbers(arr, brr);
        len = result.length;
        for(int i = 0 ; i < len ; i++) output.append(result[i] + " ");
        System.out.print(output);
        scan.close();
    }
}