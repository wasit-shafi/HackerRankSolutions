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
//https://www.hackerrank.com/contests/hackerrank-hackfest-2020/challenges/rbg/problem
class Result { // Partial Submission(WA)
    public static List<String> mixColors(List<List<Integer>> colors, List<List<Integer>> queries) {
      int n = colors.size();
      int q = queries.size();
      List<String> ans = new ArrayList<>();
      HashSet<Integer> r = new HashSet<>();
      HashSet<Integer> b = new HashSet<>();
      HashSet<Integer> g = new HashSet<>();
      
      for (int i = 0; i < n; i++) {
        r.add(colors.get(i).get(0));
        b.add(colors.get(i).get(1));
        g.add(colors.get(i).get(2));
      }
      
      for (int i = 0; i < q; i++) {
        if (r.contains(queries.get(i).get(0)) && b.contains(queries.get(i).get(1)) && g.contains(queries.get(i).get(2))) {
          ans.add("YES");
        } else {
          ans.add("NO");  
        }
      }
      return ans;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> colors = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                colors.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<String> result = Result.mixColors(colors, queries);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
