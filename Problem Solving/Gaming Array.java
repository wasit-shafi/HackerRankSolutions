/**
 *  @author WasitShafi
 *  @since 16-SEP-2020
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Result { // TLE 18, 19, 20
  public static String gamingArray(List<Integer> arr) {
    boolean isBobWins = false;
    int length = arr.size();
    int maxIndex = length;
    int max = Integer.MIN_VALUE;
    int temp  = -1;

    while (maxIndex != 0) {
      max = Integer.MIN_VALUE;
      for (int j = 0; j < maxIndex; j++) {
        if (arr.get(j) > max) {
          max = arr.get(j);
          temp = j;
        }
      }
      maxIndex = temp;
      isBobWins = !isBobWins;
    }

    if (isBobWins) {
      return "BOB";
    } else {
      return "ANDY";
    }
  }
}

public class Solution {
  public static void main(String[] args) {
    int n;
    List arr;
    Scanner scanner = new Scanner(System.in);
    int g = scanner.nextInt();

    while (g-- != 0) {
      n = scanner.nextInt();
      arr = new ArrayList<Integer>();
      for (int i = 0; i < n; i++) {
        arr.add(scanner.nextInt());
      }
      System.out.println(Result.gamingArray(arr));
    }
    scanner.close();
  }
}