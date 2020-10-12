
/**
 *  @author WasitShafi
 *  @since 11-OCT-2020
 */
// https://www.hackerrank.com/contests/hackerrank-hackfest-2020/challenges/cyclic-binary-string
class Result {
  public static int maximumPower(String s) {
    int count = 0;
    int maxCount = 0;
    int length = s.length();
    
    for(int i = 0; i < length; i++) {
      if(s.charAt(i) == '1') {
        count = 0;
      } else {
        if (s.charAt(i) == '0') {
          count++;
        }
        if (count > maxCount) {
          maxCount = count;
        }
      }
    }
    if (maxCount == length) { // All 1
        return -1;
    }

    if (s.charAt(0) == '0' && s.charAt(length-1) == '0') {
      int leftCount = 0;
      int rightCount = 0;
      int i = 0;
      while (i < length && s.charAt(i) == '0') {
        leftCount++;
        i++;
      }
      i = length-1;
      while (i >= 0 && s.charAt(i) == '0') {
        rightCount++;
        i--;
      }
      if ((leftCount + rightCount) > maxCount) {
        maxCount = leftCount + rightCount;
      }
    }
    return maxCount;
  }
}
public class Solution {
  public static void main(String[] args) {
    System.out.print(Result.maximumPower((new java.util.Scanner(System.in)).nextLine()));
  }
}