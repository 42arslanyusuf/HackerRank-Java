package Introduction._009_EndOfFile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineCount = 0;
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            lineCount++;
            System.out.println(lineCount + " " + s);
        }
    }
}
