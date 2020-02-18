import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int B, H;
    static boolean flag = true;
    static
    {
      try
      {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();

        if(B < 1  || H < 1)
        {
            flag = false;
            throw new Exception("Breadth and height must be positive");
        }
      }
      catch(Exception e)
      {
        System.out.print(e);
      } 
    }
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class