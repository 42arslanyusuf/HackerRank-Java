package Strings._002_Substring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String newS = S.substring(start, end);
        System.out.println(newS);
    }
}
