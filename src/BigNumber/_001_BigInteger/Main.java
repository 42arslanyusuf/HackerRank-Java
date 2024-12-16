package BigNumber._001_BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger s1 = scanner.nextBigInteger();
        BigInteger s2 = scanner.nextBigInteger();
        
        System.out.println(s1.add(s2));
        System.out.println(s1.multiply(s2)); 
    }
}