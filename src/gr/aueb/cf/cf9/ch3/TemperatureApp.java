package gr.aueb.cf.cf9.ch3;

import java.util.Random;
import java.util.Scanner;

/**
 * Αν η θερμοκρασία είναι ,<0, τότε is TempBelowZero
 * γίνεται true, αλλιώς γίνεται false. Ο χρήστης δίνει την θερμοκρασία.
 */

public class TemperatureApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Αρχικοποίηση Μεταβλητών
        boolean isTempBelowZero = false;
        int temp = 0;
        // Εισαγωγή Δεδομένων
        System.out.println("Please insert current temperature:");
        // Επεξεργασία Δεδομένων
        temp = scanner.nextInt();

        isTempBelowZero = (temp < 0 );
        // Εκτύπωση των Αποτελεσμάτων
        System.out.printf("Temperature is below zero" + " " +isTempBelowZero);

        scanner.close(); // κλείσιμο του scanner, αποτελεί μια καλή & χρήσιμη τακτική






    }
}
