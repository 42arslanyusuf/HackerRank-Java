package DataStructures._005_2DArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        // SOLUTION
        int sum = Integer.MIN_VALUE;
        for (int row = 1; row <= 4; row++) {
            for (int column = 1; column <= 4; column++) {
                int tempSum = arr.get(row - 1).get(column - 1) + arr.get(row - 1).get(column) + arr.get(row - 1).get(column + 1)
                                                               + arr.get(row).get(column) +
                              arr.get(row + 1).get(column - 1) + arr.get(row + 1).get(column) + arr.get(row + 1).get(column + 1);

                if (sum <= tempSum) sum = tempSum;
            }
        }

        System.out.println(sum);
        // SOLUTION
        bufferedReader.close();
    }
}