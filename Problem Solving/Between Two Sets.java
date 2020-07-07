/**
 *  @author wasitshafi
 *  @since  07-07-20
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Result
{
    public static int getTotalX(List<Integer> a, List<Integer> b)
    {
        int count, LCM, GCD, sizeA = a.size(), sizeB = b.size();
         
        /* Compute GCD of list 'b' first, as that may take less time as compared to LCM, also if LCM tends to > GCD 
        then result = 0, so we can directly retur 0 instead of computing LCM */ 
        
        // GCD of list b
        if(sizeB == 1)
            GCD = b.get(0);
        else
        {
            int divisor, divident, rem;
            divisor = b.get(0);
            for(int i = 1 ; i < sizeB ; i++)
            {
                divident = b.get(i);
                rem = divident % divisor;
                while(rem != 0)
                {
                    divident = divisor;
                    divisor = rem;
                    rem = divident % divisor;
                }
            }
            GCD = divisor;
        }

        // LCM of list a       
        if(sizeA == 1)
            LCM = a.get(0);
        else
        {
            boolean isFoundLCM;
            int temp, index, maxA = Integer.MIN_VALUE;
            for(int i = 0 ; i < sizeA ; i++)
            {
                temp = a.get(i);
                if(maxA < temp) maxA = temp;
                if(maxA > GCD) return 0; // No need to compute LMC, result is 0 as LMC > GCD
            }

            LCM = maxA;
            isFoundLCM = false;
            while(!isFoundLCM)
            {
                for(index = 0 ; index < sizeA ; index++)
                    if(LCM % a.get(index) != 0)
                        break;
                if(index == sizeA) 
                    isFoundLCM = true;
                else 
                    LCM += maxA;
                if(LCM > GCD) return 0; // No need to compute LMC, result is 0 as LMC > GCD
            }
        }

        count = 0;
        for(int i = 1 ; LCM * i <= GCD ; i++)
            if(GCD % (LCM * i) == 0)
                count++;
        return count;
    }
}
public class Solution
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int m = scanner.nextInt(); 
        
        List<Integer> arr = new ArrayList<>();
        List<Integer> brr = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++) arr.add(scanner.nextInt());
        for(int i = 0 ; i < m ; i++) brr.add(scanner.nextInt());

        int total = Result.getTotalX(arr, brr);
        System.out.println(total);
        scanner.close();
    }
}
