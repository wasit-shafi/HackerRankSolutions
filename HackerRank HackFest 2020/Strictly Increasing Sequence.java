/**
 *  @author WasitShafi
 *  @since 10-OCT-2020
 */
//https://www.hackerrank.com/contests/hackerrank-hackfest-2020/challenges/strictly-increasing-sequence/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {// Partial Submission(WA)
    public static String whoIsTheWinner(List<Integer> arr) {
      int count = 0;
      HashMap<Integer, Integer> map = new HashMap<>();
      
      for (Integer i : arr) {
        if (map.containsKey(i)) {
          map.put(i, map.get(i) + 1);
        } else {
          map.put(i, 1);
        }
      }
      
      for (Integer v : map.values()) {
        if (v > 1) {
          count += v - 1;
        }
      }
      
      if (count % 2 == 0){
        return "First";
      } else {
        return "Second";
      }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                String result = Result.whoIsTheWinner(arr);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
