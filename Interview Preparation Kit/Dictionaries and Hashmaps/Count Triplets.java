/**
 *  @author WasitShafi
 *  @since 18-SEP-2020
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution // Got TLE on 8 TC
{
  static long countTriplets(List<Long> arr, long r) { // Brute Force Approach, O(N^3) Time Complexity
    long x;
    long y;
    int count = 0;
    int length = arr.size();

    for (int i = 0; i < length - 2; i++) {
      x = arr.get(i) * r;
      for (int j = i + 1; j < length - 1; j++) {
        if (arr.get(j) == x) {
          y = x * r;
          for (int k = j + 1; k < length; k++) {
            if (arr.get(k) == y) {
              count++;
            }
          }
        }
      }
    }
    return count;
  }
  public static void main(String[] args) {
    int n;
    long r;
    List<Long> arr;
    Scanner scanner = new Scanner(System.in);

    n = scanner.nextInt();
    r = scanner.nextInt();
    arr = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      arr.add(scanner.nextLong());
    }

    System.out.print(countTriplets(arr, r));
    scanner.close();
  }
}