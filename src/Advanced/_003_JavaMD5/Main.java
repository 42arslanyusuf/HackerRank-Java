package Advanced._003_JavaMD5;

import java.security.MessageDigest;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes());
            byte[] hash = md.digest();

            for(byte h:hash){
                System.out.printf("%02x",h);
            }

        } catch(Exception e){
            System.out.println(e);
        }
    }
}
