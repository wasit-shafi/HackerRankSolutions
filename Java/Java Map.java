/**
  @author wasitshafi
  @since 20-01-2020
*/

import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

class Solution
{
    public static void main(String... args) throws Exception
    {
        int n;
        String name;
        Map<String, String> phoneBook = new HashMap<>();
        StringBuilder ans = new StringBuilder("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        while(n-- != 0) phoneBook.put(br.readLine(), br.readLine());

        while((name = br.readLine()) != null)
        {
            if(phoneBook.containsKey(name))
                ans.append(name + "=" + phoneBook.get(name) + "\n");
            else
                ans.append("Not found\n");
        }
        out.print(ans);
    }
}