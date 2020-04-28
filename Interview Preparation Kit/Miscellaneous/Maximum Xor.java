/**
    @author wasitshafi
    @since 23-04-2020
*/
        // TLE to 6 TC
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
       int n, q, len;
       long arr[], queries, max, temp;
       Scanner scan = new Scanner(System.in);
       StringBuilder output = new StringBuilder("");
       
       n = scan.nextInt();
       arr = new long[n];
       for(int i = 0 ; i < n ; i++) arr[i] = scan.nextLong();

       q = scan.nextInt();
       for(int i = 0 ; i < q ; i++)
       {
           queries = scan.nextInt();
           max =  queries ^ arr[0];
           for(int j = 1 ; j < n ; j++)
           {
               temp = queries ^ arr[j];
               if(temp > max) max = temp;
           }
           output.append(max + "\n");
       }
       System.out.print(output);
       scan.close();
    }
}