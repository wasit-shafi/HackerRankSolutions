/**
 *  @author WasitShafi
 *  @since 13-DEC-2021
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class Result {
    public static int minimumAbsoluteDifference(List<Integer> arr) {
      int difference = 0;
      int minDifference = Integer.MAX_VALUE;

      Collections.sort(arr);
      for (int i = 1; i < arr.size(); i++) {
        difference = arr.get(i-1) - arr.get(i);
        if (difference < 0) {
           difference = -difference;
        }
        if(minDifference > difference) {
          minDifference = difference;
        }
        if (minDifference == 0) { // optimzation
          return minDifference;
        }
      }
      return minDifference;
    }
}

public class Solution {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      List<Integer> arr = new ArrayList<>();

      for (int i = 0; i < n; i++) {
        arr.add(scanner.nextInt());
      }
      System.out.print(Result.minimumAbsoluteDifference(arr));
      scanner.close();
    }
}
