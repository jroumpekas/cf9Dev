package gr.aueb.cf.cf9.review.senior_level;
/**
 * Υπολογίζουμε τη θέση του μέγιστου στοιχείου του πίνακα που εμείς εισάγουμε.
 */

import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int size;

        int maxPosition;
        int maxValue;

        // Ζητάμε το μέγεθος του πίνακα
        System.out.print("Πόσα στοιχεία θα εισάγετε; ");
        size = scanner.nextInt();

        arr = new int[size];

        // **ΠΡΟΣΘΗΚΗ: Διαβάζουμε τα στοιχεία του πίνακα
        System.out.println("Εισάγετε " + size + " ακέραιους αριθμούς:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Στοιχείο [" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        // Delegation - καλεί υπηρεσίες - μεθόδους

        maxPosition = getMaxPosition(arr);

        if (maxPosition != -1) {

            maxValue = arr[maxPosition];

            System.out.printf("Η τιμή του μέγιστου στοιχείου είναι %d και η θέση του είναι %d%n", maxValue, maxPosition);
        } else {
            System.out.println("Ο πίνακας είναι κενός.");
        }

        scanner.close();
    }

    /**
     * Μέθοδος υπολογισμού και θέσης μέγιστου στοιχείου πίνακα
     * @param arr στοιχεία του πίνακα
     * @return επιστρέφει τη θέση του μέγιστου στοιχείου του πίνακα.
     */

    public static int getMaxPosition(int[] arr) {
        if (arr == null || arr.length < 1) return Integer.MIN_VALUE ;

        int maxPosition = 0;
        int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
