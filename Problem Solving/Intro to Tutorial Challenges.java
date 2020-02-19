/**
    @author wasitshafi
    @since  19-02-2020
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    static int introTutorial(int v, ArrayList<Integer>arr)
    {
        return Collections.binarySearch(arr, v); // arr must be sorted
    }
    public static void main(String... args)
    {
        int v, n;
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        v = scan.nextInt();
        n = scan.nextInt();
        for(int i = 0; i < n; i++) arr.add(scan.nextInt());
        System.out.println(introTutorial(v, arr));
        scan.close();
    }
}