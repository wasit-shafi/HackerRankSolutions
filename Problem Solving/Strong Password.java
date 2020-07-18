/**
 *  @author wasitshafi
 *  @since  18-07-20
 */
import java.util.Scanner;
public class Solution
{
    static int minimumNumber(int n, String password)
    {
        int missing = 0;
        boolean numbers = false;
        boolean lowercase = false;
        boolean uppercase = false;
        boolean specialChar = false;

        for(int i = 0 ; i < n ; i++)
            if(!numbers && password.charAt(i) >= 48 && password.charAt(i) <= 57)
                numbers = true;
            else if(!uppercase && password.charAt(i) >= 65 && password.charAt(i) <= 90)
                uppercase = true;
            else if(!lowercase && password.charAt(i) >= 97 && password.charAt(i) <= 122)
                lowercase = true;
            else if(!specialChar && "!@#$%^&*()-+".indexOf(password.charAt(i)) != -1)
                specialChar = true;

        if(!numbers) missing++;
        if(!uppercase) missing++;
        if(!lowercase) missing++;
        if(!specialChar) missing++;

        if(n + missing < 6)
            return missing + (6 - (n + missing));
        else
            return missing;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String password = scanner.nextLine();

        System.out.print(minimumNumber(n, password));
        scanner.close();
    }
}