package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * This program checks, if the number is even or not.
 */

public class EvenApp {
    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean result = false;

        // Είσοδος δεδομένων
        System.out.println("Δώστε έναν αριθμό:");
        while (!scanner.hasNext()){
            System.out.println("Λάθος τιμή. Δώστε εκ νέου μια τιμή.");
            scanner.nextLine();
        }
        num = scanner.nextInt();

        // Επιχειρησιακή λογική - Παραστάσεις
        result = isEven(num);

        // Εκτύπωση του αποτελέσματος
        System.out.println("Ο αριθμός είναι ζυγός: " + result);

    }

    /**
     * Check if a number is even.
     * @param num the number to check.
     * @return true if the number is even , false otherwise.
     */

    public static boolean isEven(int num){
        return num % 2 == 0;
    }
}
