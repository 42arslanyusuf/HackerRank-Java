package Introduction._003_IfElse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        // Solution
        if(N % 2 == 0){
            if(N >= 2 && N <= 5){
                System.out.println("Not Weird");
            } if(N >= 6 && N <= 20){
                System.out.println("Weird");
            } if(N > 20){
                System.out.println("Not Weird");
            }
        }else{
            System.out.println("Weird");
        }
        // Solution

        bufferedReader.close();
    }
}
