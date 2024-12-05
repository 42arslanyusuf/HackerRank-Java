package Strings._006_StringTokens;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
       input = input.trim();
      if (input.length() == 0) {
            System.out.println(0);
            return;
       }
       
       String[] words = input.split("[^a-zA-Z]+");
       System.out.println(words.length);
       for (String word : words) {
        System.out.println(word);
       }
        
        
        
        
    }
}