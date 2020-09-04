/**
 *  @author WasitShafi
 *  @since 21-AUG-2020
 */
import java.util.Scanner;

public class Solution {
  static long largestRectangle(int[] h) { // Time Complexity: O(N^2)
    long max = 0;
    long temp = 0;
    int left = -1;
    int right = -1;
    int length = h.length;

    for (int i = 0; i < length; i++) {
      left = i;
      while(left >= 0 && h[left] >= h[i]) {
        left--;
      }
      left++;

      right = i;
      while(right < length && h[right] >= h[i]) {
        right++;
      }
      right--;

      temp = (long)h[i] * (right - left + 1);
      if (max < temp) {
        max = temp;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int n;
    int[] h;
    Scanner scanner = new Scanner(System.in);

    n = scanner.nextInt();
    h = new int[n];
    for (int i = 0; i < n; i++) {
      h[i] = scanner.nextInt();
    }

    System.out.print(largestRectangle(h));
    scanner.close();
  }
}