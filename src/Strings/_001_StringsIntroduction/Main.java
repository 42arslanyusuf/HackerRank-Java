package Strings._001_StringsIntroduction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int stringLenght = A.length() + B.length();

        String stringBoolean = "";
        if (A.compareToIgnoreCase(B) <= 0) {
            stringBoolean = "No";
        }if (A.compareToIgnoreCase(B) > 0) {
            stringBoolean = "Yes";
        }

        String newA = A.substring(0, 1).toUpperCase().concat(A.substring(1).toLowerCase());
        String newB = B.substring(0, 1).toUpperCase().concat(B.substring(1).toLowerCase());
        String stringConcat = newA.concat(" ").concat(newB);

        System.out.println(stringLenght);
        System.out.println(stringBoolean);
        System.out.println(stringConcat);
    }
}
