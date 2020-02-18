import java.lang.Math;
import java.util.Scanner;

class Solution
{
   public static void main(String []argh)
   {
       double term;
       int t, a, b, n;
        Scanner scan = new Scanner(System.in);
        
        t = scan.nextInt();
        for(int i = 0 ; i < t ; i++)
        {
            a = scan.nextInt();
            b = scan.nextInt();
            n = scan.nextInt();
           
            term = a;    
            for ( int j = 0 ; j < n ; j++ )
            {   term = term + Math.pow(2, j) * b;
                System.out.print( (int ) term );
                if(j != n - 1 ) System.out.print(" ");
            }
            System.out.println();
        }
        scan.close();
    }
}