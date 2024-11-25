package Introduction._004_StdinAndStdoutII;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        scanner.nextLine();
        double myDouble = scanner.nextDouble();
        String myString = scanner.nextLine();
        if (myString.isEmpty()) {
            myString = scanner.nextLine();
        }

        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);
    }
}
