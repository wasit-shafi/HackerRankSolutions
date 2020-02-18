/**
  @author wasitshafi
  @since 20-01-2020
*/
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution
{
    public static void main(String... args) throws Exception
    {
        int n;
        String name;
        HashMap<String, String> phoneBook = new HashMap<>();
        StringBuilder ans = new StringBuilder("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        while(n-- != 0) phoneBook.put(br.readLine(), br.readLine());
        while((name = br.readLine()) != null)
        {
            if(phoneBook.containsKey(name))
                ans.append(name + "=" + phoneBook.get(name));
            else
                ans.append("Not found");
            ans.append("\n");
        }
        System.out.print(ans);
    }
}