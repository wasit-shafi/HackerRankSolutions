import java.util.Scanner;

class Solution
{
    public static void main(String []args)
    {
        int tc;
        long data;
        Scanner scan = new Scanner(System.in);
        
        tc = scan.nextInt();
        while(tc-- != 0)
        {
            try
            {
                data = scan.nextLong();
                System.out.println( data + " can be fitted in:");
                if(data >= -128 && data <= 127)System.out.println("* byte");// takes 1 byte
                if(data >=  -Math.pow(2, 15) && data <= Math.pow(2, 15) - 1) System.out.println("* short");//takes 2 bytes
                if(data >= -Math.pow(2,31) && data <= Math.pow(2, 31) - 1 )System.out.println("* int");    //takes 4 bytes
                if(data >= -Math.pow(2, 63) && data <= Math.pow(2, 63) - 1 );System.out.println("* long"); //takes 8 bytes
            }
            catch(Exception e)
            {
                System.out.println(scan.next()+" can't be fitted anywhere.");
            }
        }
        scan.close();
    }
}