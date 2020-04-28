/**
    @author wasitshafi
    @since 28-04-2020
 */
import java.util.Scanner;

public class Solution
{
    static long strangeCounter(long t)
    {
        long value = 3;
        int counterNo = 1;
        long counterSize = 3;
        long previousCounterSum = 0;
        
        while(counterSize + previousCounterSum < t)
        {
            previousCounterSum += counterSize;
            counterSize = counterSize * 2;
            counterNo++;
            value = value * 2;
        }
        previousCounterSum++;
        return value - (t - previousCounterSum);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print(strangeCounter(scan.nextLong()));
        scan.close();
    }
}