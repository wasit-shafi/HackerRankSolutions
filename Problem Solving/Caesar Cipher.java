/**
 *  @author wasitshafi
 *  @since  18-07-20
 */
import java.util.Scanner;

public class Solution
{
    static String caesarCipher(String s, int k)
    {
        int len = s.length();
        char cipherChar[] = new char[26], ch;
        StringBuilder cipherText = new StringBuilder("");
        
        for(int i = 0 ; i < 26 ; i++) cipherChar[i] = (char)(((i + k) % 26) + 'A');
        for(int i = 0 ; i < len; i++)
        {
            ch = s.charAt(i); 
            if(ch >= 65 && ch <= 90)
                cipherText.append(cipherChar[ch - 'A']);
            else if(ch >= 97 && ch <= 122)
                    cipherText.append((char)(cipherChar[ch - 'a'] + 32));
            else
                cipherText.append(ch);
        }
        return cipherText.toString();
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.next();
        int k = scanner.nextInt();

        System.out.print(caesarCipher(s, k));
        scanner.close();
    }
}