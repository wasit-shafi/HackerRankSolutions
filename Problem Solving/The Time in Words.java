/**
 *  @author wasitshafi
 *  @since  10-07-20
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Solution
{
    static String timeInWords(int h, int m)
    {
        String oClock = "o' clock";

        Map<Integer, String> hour = new HashMap<>();
        Map<Integer, String> minutes = new HashMap<>();

        hour.put(0, "zero");
        hour.put(1, "one");
        hour.put(2, "two");
        hour.put(3, "three");
        hour.put(4, "four");
        hour.put(5, "five");
        hour.put(6, "six");
        hour.put(7, "seven");
        hour.put(8, "eight");
        hour.put(9, "nine");
        hour.put(10, "ten");
        hour.put(11, "eleven");

        minutes.put(1, "one minute past");
        minutes.put(2, "two minute past");
        minutes.put(3, "three minute past");
        minutes.put(4, "four minute past");
        minutes.put(5, "five minute past");
        minutes.put(6, "six minute past");
        minutes.put(7, "seven minute past");
        minutes.put(8, "eight minute past");
        minutes.put(9, "nine minute past");
        minutes.put(10, "ten minute past");
        minutes.put(11, "eleven minute past");
        minutes.put(12, "twelve minute past");
        minutes.put(13, "thirteen minute past");
        minutes.put(14, "fourteen minute past");
        
        minutes.put(15, "quarter past");
        
        minutes.put(16, "sixteen minutes past");
        minutes.put(17, "seventeen minutes past");
        minutes.put(18, "eighteen minutes past");
        minutes.put(19, "nineteen minutes past");
        minutes.put(20, "twenty minutes past");
        minutes.put(21, "twenty one minutes past");
        minutes.put(22, "twenty two minutes past");
        minutes.put(23, "twenty three minutes past");
        minutes.put(24, "twenty four minutes past");
        minutes.put(25, "twenty five minutes past");
        minutes.put(26, "twenty six minutes past");
        minutes.put(27, "twenty seven minutes past");
        minutes.put(28, "twenty eight minutes past");
        minutes.put(29, "twenty nine minutes past");

        minutes.put(30, "half past");

        minutes.put(31, "twenty nine minutes to");
        minutes.put(32, "twenty eight minutes to");
        minutes.put(33, "twenty seven minutes to");
        minutes.put(34, "twenty six minutes to");
        minutes.put(35, "twenty five minutes to");
        minutes.put(36, "twenty four minutes to");
        minutes.put(37, "twenty three minutes to");
        minutes.put(38, "twenty two minutes to");
        minutes.put(39, "twenty one minutes to");
        minutes.put(40, "twenty minutes to");
        minutes.put(41, "nineteen minutes to");
        minutes.put(42, "eighteen minutes to");
        minutes.put(43, "seventeen minutes to");
        minutes.put(44, "sixteen  minutes to");
        
        minutes.put(45, "quarter to");
        
        minutes.put(46, "fourteen minutes to");
        minutes.put(47, "thirteen minutes to");
        minutes.put(48, "twelve minutes to");
        minutes.put(49, "eleven minutes to");
        minutes.put(50, "ten minutes to");
        minutes.put(51, "nine minutes to");
        minutes.put(52, "eight minutes to");
        minutes.put(53, "seven minutes to");
        minutes.put(54, "six minutes to");
        minutes.put(55, "five minutes to");
        minutes.put(56, "four minutes to");
        minutes.put(57, "three minutes to");
        minutes.put(58, "two minutes to");
        minutes.put(59, "one minutes to");

        if(m == 0)
            return hour.get(h) + " " + oClock;
        else if(m == 15 || m == 30)
            return minutes.get(m) + " " + hour.get(h);
        else if(m == 45)
            return minutes.get(m) + " " + hour.get(h + 1);
        else if(m > 0 && m < 30)
            return minutes.get(m) + " " + hour.get(h);
        else
            return minutes.get(m) + " " + hour.get(h + 1);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(timeInWords(scanner.nextInt(), scanner.nextInt()));
        scanner.close();
    }
}