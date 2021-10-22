/**
 *  @author WasitShafi
 *  @since 12-OCT-2021
 */
import java.util.Scanner;

public class Solution {
  static int minimumSwaps(int[] arr) {
    int i = 0;
    int count = 0;
    
    // CTM: Correct place for a[i] is at i-1 index
    while (i < arr.length) {
      if (arr[i] - 1 != i) { // swap arr[i] <-> arr[arr[i] - 1]
        int temp = arr[arr[i] - 1];
        arr[arr[i] - 1] = arr[i];
        arr[i] = temp;
        count++;
        continue;
      } else {
        i++;
      }
    }
    return count;
  }
  
  public static void main(String[] args) {
    int[] arr;
    Scanner scanner = new Scanner(System.in);
    
    arr = new int[scanner.nextInt()];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextInt();
    }
    System.out.print(minimumSwaps(arr));
    scanner.close();
 }
}
