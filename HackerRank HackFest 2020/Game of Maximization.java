/**
 *  @author WasitShafi
 *  @since 10-OCT-2020
 */
// https://www.hackerrank.com/contests/hackerrank-hackfest-2020/challenges/stones-piles

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Result {
  public static int maximumStones(List<Integer> arr) {
    int sum1 = 0;
    int sum2 = 0;
    int n = arr.size();

    for (int i = 0; i < n; i++) {
      sum1 += arr.get(i);
      if (++i < n) {
        sum2 += arr.get(i);
      }
    }
    return (sum1 < sum2 ? sum1 : sum2) * 2;
  }
}

public class Solution {
  public static void main(String[] args) {
    int n;
    List<Integer> arr = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    n = scanner.nextInt();
    while (n-- != 0) {
      arr.add(scanner.nextInt());
    }
    System.out.print(Result.maximumStones(arr));
    scanner.close();
  }
}