import java.util.Scanner;
import java.util.ArrayList;

public class Solution
{
    public static void main(String... args)
    {
        int n, query;
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        n = scan.nextInt();
        while(n-- != 0) arr.add(scan.nextInt());

        query = scan.nextInt();
        while(query-- != 0)
            if(scan.next().equals("Insert")) arr.add(scan.nextInt(), scan.nextInt());
            else arr.remove(scan.nextInt());       

        for(int item : arr) System.out.print(item  + " ");
    }
}