package Introduction._007_LoopsII;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        for (int i = 0; i <q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int result = a + b;
            for (int j = 0; j < n; j++) {
                System.out.print(result + " ");
                b *=2;
                result += b;
            }
            System.out.println("");
        }
    }
}