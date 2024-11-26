package Introduction._006_LoopsI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <=10; i++) {
            System.out.printf("%d x %d = %d\n", N,i, N *i);
        }

        bufferedReader.close();
    }
}
