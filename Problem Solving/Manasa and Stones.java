/**
 *  @author wasitshafi
 *  @since  14-07-20
 */
//Copied
import java.util.Scanner;
import java.util.ArrayList;

public class Solution
{
    static int[] stones(int n, int a, int b)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int current = Math.min(a, b) * (n - 1);
        int max = Math.max(a, b) * (n -1);
        int diff = Math.abs(a-b);
        if(a == b)
            arrayList.add(current);
        else
            while(current <= max)
            {
                arrayList.add(current);
                current += diff;
            }

        int size = arrayList.size();
        int res[] = new int[size];

        for(int i = 0 ; i < size ; i++) res[i] = arrayList.get(i);
        return res;
    }

    public static void main(String[] args)
    {
        int t, len, res[];
        Scanner scanner = new Scanner(System.in);
        StringBuilder output = new StringBuilder("");

        t = scanner.nextInt();
        while(t-- != 0)
        {
            res = stones(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            len = res.length;
            for(int i = 0 ; i < len ; i++) output.append(res[i] + " ");
            output.append("\n");
        }
        System.out.print(output);
    }
}