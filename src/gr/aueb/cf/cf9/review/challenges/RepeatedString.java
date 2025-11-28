package gr.aueb.cf.cf9.review.challenges;

/**
 * Επιστρέφει ένα String που αποτελεί επανάληψη
 * ενός δοθέντος String n φορές.
 */

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter repetitions: ");
        int n = scanner.nextInt();

        String result = repeatedString(str, n);

        System.out.println("Result: " + result);

        scanner.close();
    }

    public static String repeatedString(String str, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(str);
        }

        return sb.toString();
    }
}