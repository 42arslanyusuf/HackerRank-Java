package DataStructures._002_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                subList.add(scanner.nextInt());
            }
            list.add(subList);
        }

        int q = scanner.nextInt();
        for (int k = 0; k < q; k++) {
            int listIndex = scanner.nextInt();
            int subListIndex = scanner.nextInt();

            try {
                System.out.println(list.get(listIndex - 1).get(subListIndex - 1));
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("ERROR!");
            }
        }

    }
}