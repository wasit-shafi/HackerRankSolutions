import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    static int viralAdvertising(int n)
    {
        int likes = 0; 
        int peoples = 5; 
        for (int i = 1 ; i <= n ;i++)
        {
            likes = likes + peoples / 2;
            peoples = (peoples / 2) * 3;
        }
        return likes;
    }
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(viralAdvertising(Integer.parseInt(br.readLine())));
        br.close();
    }
}