import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b)
    {
        int frequency[] = new int [26];
        for(int i = 0 ; i < frequency.length ; i++) frequency[i] = 0;
        
        int len = a.length();
        for(int i = 0 ; i < len ; i++)
        {
            if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z') 
                frequency[a.charAt(i) - 'a']++;
            else if(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
                frequency[a.charAt(i) - 'A']++;
        }

        for( int i = 0 ; i < b.length() ; i++)
        {
            if(b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
                frequency[b.charAt(i) - 'a']--;
            else
                frequency[b.charAt(i) - 'A']--;
        }
        
        for(int i = 0 ; i < frequency.length ; i++)
            if(frequency[i] != 0)
                return false;
        return  true;
    }
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}