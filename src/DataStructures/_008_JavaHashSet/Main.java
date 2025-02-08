package DataStructures._008_JavaHashSet;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        // SOLUTION
        Set<String> hs = new HashSet<>();
        for (int i = 0; i < t; i++) {
            String first = pair_left[i];
            String second = pair_right[i];

            if (first.compareTo(second) > 0) {
                String temp = first;
                first = second;
                second = temp;
            }

            hs.add(first + "," + second);
            System.out.println(hs.size());
        }
        // SOLUTION
    }
}
