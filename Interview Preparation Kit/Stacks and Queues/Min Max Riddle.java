/**
 *  @author WasitShafi
 *  @since 29-NOV-2021
 */
import java.util.Scanner;

public class Solution {
  static long getMin(long[] arr, int leftIndex, int rightIndex) {
    long min = arr[leftIndex];
    for (int i = leftIndex + 1; i <= rightIndex; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

  static long[] riddle(long[] arr) {
    int n = arr.length;
    long[] ans = new long[n];
    long min = Integer.MAX_VALUE;
    long max = Integer.MIN_VALUE;
    
    for (int i = 0; i < n; i++) {
      max = Integer.MIN_VALUE;
      for(int j = 0; j < n - i ; j++) {
        min = getMin(arr,j ,j + i);
        if(min > max) {
          max = min;
        }
      }
      ans[i] = max;
    }
    return ans;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long[] arr = new long[n];
    long[] ans;
    
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextLong();
    }
    ans = riddle(arr);
    for (int i = 0; i < n; i++) {
      System.out.print(ans[i]);
      if(i != n-1) {
        System.out.print(" ");
      }
    }
    scanner.close();
 }
}
