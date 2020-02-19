/**
    @author wasitshafi
    @since  18-02-2020
*/
import java.util.Scanner;

public class Solution
{
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges)
    {
        int countApples, countOranges, applesMinDiff, applesMaxDiff, orangesMinDiff, orangesMaxDiff;
        countApples = countOranges = 0;

        // CTM : Apple tree is always on left side of Sam's home
        applesMinDiff = s - a;
        applesMaxDiff = t - a;

        // CTM: Orange tree is always on right side of Sam's home
        orangesMinDiff = b - t;
        orangesMaxDiff = b - s;

        // CTM: -ve for falling towards left side of tree +ve for falling towards right side of tree.
        int len = apples.length;
        for(int i = 0 ; i < len ; i++)
            if(apples[i] > 0) // i.e. apples has fallen towards right side so there is scope that it may have fallen on Sam's home
                if(apples[i] >= applesMinDiff && apples[i] <= applesMaxDiff)
                    countApples++;

        for(int i = 0 ; i < oranges.length ; i++)
            if(oranges[i] < 0) // i.e. orange has fallen towards left side so there is scope that it may have fallen on Sam's home
                if(Math.abs(oranges[i]) >= orangesMinDiff && Math.abs(oranges[i]) <= orangesMaxDiff)
                    countOranges++;

        System.out.println(countApples);
        System.out.println(countOranges);
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int s, t, a, b, m, n, apples[], oranges[];

        s = scan.nextInt();
        t = scan.nextInt();
        a = scan.nextInt();
        b = scan.nextInt();
        m = scan.nextInt();
        n = scan.nextInt();
        apples = new int[m];
        oranges = new int[n];

        for(int i = 0 ; i < m ; i++) apples[i] = scan.nextInt();
        for(int i = 0 ; i < n ; i++) oranges[i] = scan.nextInt();
        countApplesAndOranges(s, t, a, b, apples, oranges);
        scan.close();
    }
}