package ExceptionHandling._001_ExceptionHandlingTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x / y);
        } catch (ArithmeticException | InputMismatchException e) {
            if (e instanceof ArithmeticException)
                System.out.println("java.lang.ArithmeticException: / by zero");
            else if (e instanceof InputMismatchException)
                System.out.println("java.util.InputMismatchException");
        }
        scanner.close();
    }
}
