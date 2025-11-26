package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από το χρήστη ένα ποσό (ακέραιος) σε ευρώ και
 * το μετατρέπει σε δολάρια ΗΠΑ με βάση μια ισοτιμία. Για παράδειγμα
 * αν ο χρήστης δώσει 100 ευρώ και η ισοτιμία είναι 1 euro = 99 usa cents,
 * τότε τα συνολικά USA Cents είναι 9900 και αυτό αντιστοιχεί σε 99 usa dollars & 0 usa cents
 */

public class EurosUsdConverter {
    public static void main(String[] args) {
      // Αρχικοποίηση Μεταβλητών
        Scanner scanner = new Scanner(System.in);

        int euros = 0;
        final int PARITY = 99;

        int totalUsaCents , usaCents, usaDollars;
      // Data Input from the User
        System.out.println("Please insert an amount (in Euros):");

        euros = scanner.nextInt();
     // Data Processing - Expressions
        totalUsaCents = euros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents =  totalUsaCents % 100;
      // Data output
        System.out.printf("/d euros = %d usa cents = %d  usa dollars & %d usa cents \n", euros,totalUsaCents,usaCents,usaDollars);



    }
}
