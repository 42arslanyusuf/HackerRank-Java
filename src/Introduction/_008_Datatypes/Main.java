package Introduction._008_Datatypes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            try{
                long result = scanner.nextLong();
                System.out.println(result + " can be fitted in:");
                if (result >= Byte.MIN_VALUE && result <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (result >= Short.MIN_VALUE && result <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (result >= Integer.MIN_VALUE && result <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (result >= Long.MIN_VALUE && result <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch(Exception e){
                System.out.println(scanner.next()+" can't be fitted anywhere.");
            }
        }
    }
}
