/**
 *  @author WasitShafi
 *  @since 14-SEP-2020
 */
import java.util.Scanner;

public class Solution {
  static void swap(int arr[], int i, int j) {
    if(i != j) {
      arr[i] = arr[i] + arr[j];
      arr[j] = arr[i] - arr[j];
      arr[i] = arr[i] - arr[j];
    }
  }

  static void minimumBribes(int[] q) {
    int ans = 0;
    int length = q.length;

    for (int i = length - 1; i > 0 ; i--) {
      if (q[i] != i + 1) {
        if (q[i - 1] == i + 1) {
          ans++;
          swap(q, i, i - 1);
        } else if (q[i - 2] == i + 1) {
          ans += 2;
          swap(q, i - 2, i - 1);
          swap(q, i - 1, i );
        } else {
          System.out.println("Too chaotic");
          return ;
        }
      }
    }
    System.out.println(ans);
  }

  public static void main(String[] args) {
    int t;
    int n;
    int[] q;
    Scanner scanner = new Scanner(System.in);
    
    t = scanner.nextInt();
    while(t-- != 0) {
      n = scanner.nextInt();
      q = new int[n];
      for (int i = 0; i < n ; i++) {
        q[i] = scanner.nextInt();
      }
      minimumBribes(q);
    }
    scanner.close();
  }
}