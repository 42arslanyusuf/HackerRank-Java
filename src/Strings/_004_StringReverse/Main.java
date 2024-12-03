package Strings._004_StringReverse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String reverseInput = "";
        for (int i = input.length()-1; i >= 0; i--) {
            reverseInput += input.charAt(i);
        }
        String result = reverseInput.equals(input) ? "Yes" : "No";

        System.out.println(result);

    }
}
