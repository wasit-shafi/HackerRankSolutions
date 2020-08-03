/**
 *  @author wasitshafi
 *  @since  03-07-20
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    static String balancedSums(List<Integer> arr)
    {
        String ans = "NO";
        int size = arr.size();
        
        if(size == 1)
            ans = "YES";
        else
        {
            for(int i = 1 ; i < size ; i++) arr.set(i, arr.get(i) + arr.get(i - 1));
            
            if(arr.get(size - 1) - arr.get(0) == 0) // i = 0
                ans = "YES";
            else if(arr.get(size - 2) == 0) // i = size - 1
                ans = "YES";
            else
            {
                for(int i = 1 ; i < size -1 ; i++)
                    if(arr.get(i - 1) == arr.get(size - 1) - arr.get(i))
                    {
                        ans = "YES";
                        break;
                    }
            }
        }
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n, t = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        
        while(t-- != 0)
        {
            n = scanner.nextInt();
            for(int i = 0 ; i < n ; i++) list.add(scanner.nextInt());
            System.out.println(balancedSums(list));
            list.clear();
        }
        scanner.close();
    }
}