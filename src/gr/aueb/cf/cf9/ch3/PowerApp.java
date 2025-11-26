package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Calculates the power of a number base*power.
 * base * power = base * base * base .... * base
 * (power φορές)
 */

public class PowerApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        // Είσοδος δεδομένων και αντιστοίχιση σε μεταβλητές
        System.out.println("Παρακαλώ εισάγετε το base και το power:");
        base = scanner.nextInt();
        power = scanner.nextInt();


         // Επεξεργασία δεδομένων (while-do)
        while (i <= power){

            result*=base; // result = result * base
            i++;

        }

        // Εκτύπωση των Αποτελεσμάτων
        System.out.printf("%d  ^ %d = %d\n", base,power,result);


    }
}
