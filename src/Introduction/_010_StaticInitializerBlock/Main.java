package Introduction._010_StaticInitializerBlock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        {
            final int b=scanner.nextInt();
            final int h=scanner.nextInt();
            if (b <= 0 || h <= 0) {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }else {

                System.out.println(b * h);
            }
        }
    }
}
