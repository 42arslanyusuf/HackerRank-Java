package Strings._003_SubstringComparisons;

import java.util.Scanner;

public class Main {

    public class Solution {

        public static String getSmallestAndLargest(String s, int k) {
            String smallest = s.substring(0, k);
            String largest = s.substring(0, k);

            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'

            for (int i = 0; i < s.length(); i++) {
                int startIndex = i;
                int endIndex = i+k;

                if (endIndex > s.length()) {
                    continue;
                }

                String nowString = s.substring(startIndex, endIndex);

                if (smallest.compareTo(nowString) > 0) {
                    smallest = nowString;

                }

                if (largest.compareTo(nowString) < 0) {
                    largest = nowString;
                }

            }


            return smallest + "\n" + largest;
        }


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();

            System.out.println(getSmallestAndLargest(s, k));
        }
    }
}
