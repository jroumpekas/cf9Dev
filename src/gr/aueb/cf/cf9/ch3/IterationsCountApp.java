package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Count the number of iterations.
 * When the user inserts -1 the while -do loop will stop.
 *
 */

public class IterationsCountApp {
    // Δήλωση και αρχικοποίηση μεταβλητών

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
    // Είσοδος Δεδομένων
        System.out.println("Give us a number:");

        num = scanner.nextInt();
    // Επεξεργασία Δεδομένων
        while (num != -1) {
            sum++;
            System.out.println("Please enter a number: ");
            num = scanner.nextInt();
        }
     // Εμφάνιση Αποτελεσμάτων
        System.out.println("The count of Iterations is :" + sum);
    }
}
