/**
 *  @author wasitshafi
 *  @since  11-07-2020
 */
import java.util.Scanner;

public class Solution
{
    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2)
    {
        int fine = 0;
        if( (y1 < y2) || ((y1 == y2) && (m1 < m2)) || ((y1 == y2) && (m1 == m2) && (d1 <= d2)) )
            fine = 0;
        else
        {
            if(y1 > y2)
                fine = 10000;
            else if(m1 > m2) // same year
                fine = (m1 - m2) * 500;
            else // same year and same month
                fine = (d1 - d2) * 15;
        }
        return fine;
    }

    public static void main(String[] args)
    {
        int d1, m1, y1, d2, m2, y2;
        Scanner scanner = new Scanner(System.in);

        d1 = scanner.nextInt();
        m1 = scanner.nextInt();
        y1 = scanner.nextInt();
        d2 = scanner.nextInt();
        m2 = scanner.nextInt();
        y2 = scanner.nextInt();
 
        System.out.print(libraryFine(d1, m1, y1, d2, m2, y2));
        scanner.close();
    }
}