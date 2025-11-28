package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

/**
 * To {@link java.util.InputMismatchException} συμβαίνει όταν ο {@link java.util.Scanner}
 * αποτυγχάνει να διαβάσει τον σωστό τύπο δεδομένων.
 */

public class InputExceptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // num = scanner.nextInt(); Δίνει InputMisMatch αν δοθεί non-int
        int num = 0;

   while (!scanner.hasNextInt()){
       System.out.println("Μη αποδεκτοί χαρακτήρες: ");
       scanner.nextLine(); // καταναλώνουμε το κατάλληλο String
   }
        System.out.println("Please enter one int: ");
        num = scanner.nextInt();
        System.out.println("Num: " + num);
    }
}
