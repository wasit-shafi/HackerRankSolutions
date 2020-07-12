/**
 *  @author wasitshafi
 *  @since 19-07-20
 */
import java.util.Scanner;
public class Solution
{
    static String dayOfProgrammer(int year)
    {
        if(year <= 1917) // Julian Calendar
            return year % 4 == 0 ? "12.09." + year : "13.09." + year;
        else if (year == 1918) // 1918 is not leap year in both the calendars
            return "26.09.1918"; // 13sep + 13 days(1 feb to 13 feb) = 26 sep 
        else // Gergorian Calendar)
              return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? "12.09." + year : "13.09." + year;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(dayOfProgrammer(scanner.nextInt()));
        scanner.close();
    }
}
