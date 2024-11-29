package Introduction._013_CurrencyFormatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        String usFormattedPayment = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String indiaFormattedPayment = NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);;
        String chinaFormattedPayment = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String franceFormattedPayment = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);


        System.out.println("US: " + usFormattedPayment);
        System.out.println("India: " + indiaFormattedPayment);
        System.out.println("China: " + chinaFormattedPayment);
        System.out.println("France: " + franceFormattedPayment);
    }
}
