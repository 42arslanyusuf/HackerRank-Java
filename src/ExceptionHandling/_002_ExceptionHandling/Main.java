package ExceptionHandling._002_ExceptionHandling;

public class Main {
    public static void main(String[] args) {

    }

    class MyCalculator {
        /*
         * Create the method long power(int, int) here.
         */
        public static long power(int n, int p) throws Exception {
            if (n < 0 || p < 0) {
                throw new Exception("n or p should not be negative.");
            } else if (n == 0 && p == 0) {
                throw new Exception("n and p should not be zero.");
            }

            return ((long) Math.pow(n, p));
        }

    }
}
