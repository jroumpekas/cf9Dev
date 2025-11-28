package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

/**
 * Βρίσκει το ελάχιστο και το μέγιστο στοιχείο ενός πίνακα.
 */
public class ArrayMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int size;
        int minPosition;
        int minValue;
        int maxPosition;
        int maxValue;

        // Ζητάμε το μέγεθος του πίνακα
        System.out.print("Πόσα στοιχεία θα εισάγετε; ");
        size = scanner.nextInt();

        arr = new int[size];

        // **ΠΡΟΣΘΗΚΗ: Διαβάζουμε τα στοιχεία του πίνακα**
        System.out.println("Εισάγετε " + size + " ακέραιους αριθμούς:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Στοιχείο [" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        // Βρίσκουμε τη θέση του ελάχιστου και του μέγιστου
        minPosition = getMinPosition(arr);
        maxPosition = getMaxPosition(arr);

        if (minPosition != -1) {
            minValue = arr[minPosition];
            maxValue = arr[maxPosition];
            System.out.println("\n--- Αποτελέσματα ---");
            System.out.println("Η θέση του ελάχιστου στοιχείου είναι: " + minPosition);
            System.out.println("Η τιμή του ελάχιστου στοιχείου είναι: " + minValue);
            System.out.println("Η θέση του μέγιστου στοιχείου είναι: " + maxPosition);
            System.out.println("Η τιμή του μέγιστου στοιχείου είναι: " + maxValue);
        } else {
            System.out.println("Ο πίνακας είναι κενός.");
        }

        scanner.close();
    }

    /**
     * Βρίσκει τη θέση του ελάχιστου στοιχείου στον πίνακα.
     *
     * @param arr ο πίνακας προς αναζήτηση
     * @return η θέση του ελάχιστου στοιχείου, ή -1 αν ο πίνακας είναι null/κενός
     */
    public static int getMinPosition(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        int minPosition = 0;
        int minValue = arr[0];

        // Ψάχνουμε για μικρότερη τιμή
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }

    /**
     * Βρίσκει τη θέση του μέγιστου στοιχείου ενός πίνακα
     * @param arr ο πίνακας προς αναζήτηση
     * @return η θέση του μέγιστου στοιχείου, ή -1 αν ο πίνακας είναι null/κενός
     */
    public static int getMaxPosition(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = arr[0];  // Καλύτερα arr[0] από Integer.MIN_VALUE

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}