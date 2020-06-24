/**
 *  @author wasitshafi
 *  @since  24-06-2020
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Weight
{
    static String[] weightedUniformStrings(String str, int[] queries)
    {
        int count, len, q = queries.length;
        String result[] = new String[q];
        Set<Integer> set = new HashSet<>();

        count = 1;
        set.add(str.charAt(0) - 'a' + 1);
        len = str.length();
        for(int i = 1 ; i < len ; i++)
            if(str.charAt(i - 1) == str.charAt(i))
            {
                count++;
                set.add((str.charAt(i) - 'a' + 1) * count);
            }
            else
            {
                count = 1;
                set.add(str.charAt(i) - 'a' + 1);
            }
        
        for(int i = 0 ; i < q ; i++)
            if(set.contains(queries[i]))
                result[i] = "Yes";
            else
                result[i] = "No";

        return result;
    }

    public static void main(String[] args)
    {
        String s, result[];
        int n, length, queries[];
        Scanner scan = new Scanner(System.in);
        StringBuilder output = new StringBuilder("");

        s = scan.next();
        n = scan.nextInt();
        queries = new int[n];

        for(int i = 0 ; i < n ; i++) queries[i] = scan.nextInt();
        
        result = weightedUniformStrings(s, queries);
        length = result.length;
        for(int i = 0 ; i < length ; i++) output.append(result[i] + "\n");
        System.out.println(output);
        scan.close();
    }
}