package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculates the factorial of a number
 * n! = 1 * 2 * 3 * 4 * ... * n
 * For instance %! = 1 * 2 * 3 * 4 * 5 = 120
 */

public class FactorialApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int factorial = 1;
        int i = 1;
        // Είσοδος δεδομένων
        System.out.println("Give us a number:");

        number = scanner.nextInt();
       // Επεξεργασία
        while (i <= number) {
            factorial *= i;    // factorial = factorial * i
            i++;

        }
       // Εκτύπωση Αποτελεσμάτων
        System.out.printf("%d! = %d\n", number,factorial);


    }
}
