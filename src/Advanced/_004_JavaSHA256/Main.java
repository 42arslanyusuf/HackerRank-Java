package Advanced._004_JavaSHA256;

import java.io.*;
import java.util.*;
import java.security.*; // ADDED

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        MessageDigest m = MessageDigest.getInstance("SHA-256");
        m.reset();
        m.update(scanner.nextLine().getBytes());

        for (byte i : m.digest()) {
            System.out.printf("%02x", i);
        }
        System.out.println();
    }
}