/**
 *  @author wasitshafi
 *  @since  11-07-2020
 */
import java.util.Scanner;

class Result
{
    public static long taumBday(long b, long w, long bc, long wc, long z)
    {
        long sum = 0, newCost;
        if(bc == wc)
        {
            sum = b * bc; 
            sum += w * wc; 
        }
        else if(bc < wc)
        {
            sum = b * bc;
            
            newCost = bc + z; 
            if(newCost < wc)
                sum = sum + w * newCost; 
            else
                sum = sum + w * wc; 
        }
        else
        {
            sum = w * wc;
            newCost = wc + z; 
            if(newCost < bc)
                sum = sum + b * newCost; 
            else
                sum = sum + b * bc;
        }
        return sum;
    }
}

public class Solution
{
    public static void main(String[] args)
    {
        int t;
        long b, w, bc, wc, z;
        Scanner scanner = new Scanner(System.in);
        
        t = scanner.nextInt();
        while(t-- != 0)
        {
            b = scanner.nextLong();
            w = scanner.nextLong();
            bc = scanner.nextLong();
            wc = scanner.nextLong();
            z = scanner.nextLong();
            System.out.println(Result.taumBday(b, w, bc, wc, z));
        }
        scanner.close();
    }
}