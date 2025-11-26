package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το γινόμενο των n πρώτων αριθμών
 */

public class MulGeneric {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int i = 1;
        int result = 1;

        System.out.println("Please insert a n: ");

        n = scanner.nextInt();

        while (i <= n) {

            result *= i; // or result = i * n;
            i++;
        }

        System.out.println("Result is:" + result);


    }
}
