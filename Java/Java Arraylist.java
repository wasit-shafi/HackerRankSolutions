import java.util.Scanner;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        int n, d, q, x, y, data;
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        ArrayList<ArrayList<Integer>>raggedArray = new ArrayList<>();
    
        while(n-- != 0)
        {
            ArrayList<Integer> temp = new ArrayList<>();
            d = scan.nextInt();
            for(int i = 1 ; i <= d ; i++)
            {
                data = scan.nextInt();
                temp.add(data);
            }
            raggedArray.add(temp);
        }
        q = scan.nextInt();
 
        while(q-- != 0)
        {
            x = scan.nextInt();
            y = scan.nextInt();
            if(x <= raggedArray.size() && y - 1 < raggedArray.get(x -1).size())
                System.out.println(raggedArray.get(x - 1).get(y - 1));
            else
                System.out.println("ERROR!");
        }
    }
}