/**
 *  @author WasitShafi
 *  @since 24-OCT-2021
 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Solution {
  // assuming list is already sorted list
  public static double getMedian(List<Integer> subExpenditure) {
    int n = subExpenditure.size();
    if (n % 2 == 0) {
      return (subExpenditure.get((n - 1) / 2) + subExpenditure.get(n / 2) ) / 2.0;
    } else {
      return subExpenditure.get(n / 2);
    }
  }
  
  public static int getIndex(int nextExpenditure, List<Integer> expenditureWindow, int length) {
    int index = 0;
    while (index < length && nextExpenditure > expenditureWindow.get(index)) {
      index++;
    }
    return index == length - 1 ? index + 1 : index;
  }
  public static int activityNotifications(List<Integer> expenditure, int d) {
    if (expenditure.size() <= d) {
       return 0;
    }
    int index;
    int noticesCount = 0;
    double median = -1;
    List<Integer> expenditureWindow = new ArrayList<>();
    
    // created window
    for (int i = 0; i < d; i++) {
      expenditureWindow.add(expenditure.get(i));
    }
    
    expenditureWindow.sort(Comparator.naturalOrder()); // sort list initially
    median = getMedian(expenditureWindow);
    for (int i = d; i < expenditure.size(); i++) {
      if (expenditure.get(i) != expenditure.get(i - d)) {
        median = getMedian(expenditureWindow);
        if (expenditure.get(i) >= median * 2.0) {
          noticesCount++;
        }
      } else if (expenditure.get(i) >= median * 2.0) {
        noticesCount++;
      }
      // pass Object to remove by value, otherwise it will remove by index
      expenditureWindow.remove(new Integer(expenditure.get(i - d)));
      index = getIndex(expenditure.get(i),expenditureWindow, d-1);
      if (index == d) {
        expenditureWindow.add(expenditure.get(i)); // just append
      } else {
        expenditureWindow.add(index, expenditure.get(i));  
      }
    }
    return noticesCount;
  }
  
  public static void main(String[] args) {
    int n;
    int d;
    List expenditure = new ArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);
    
    n = scanner.nextInt();
    d = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      expenditure.add(scanner.nextInt());
    }
    System.out.print(activityNotifications(expenditure, d));
    scanner.close();
 }
}
