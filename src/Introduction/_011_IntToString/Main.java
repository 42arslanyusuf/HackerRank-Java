package Introduction._011_IntToString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String s = String.valueOf(i);
        if (Integer.parseInt(s)==i) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
