package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;
import java.util.function.DoubleFunction;

/**
 *
 * Μετατροπή κιλών σε γραμμάρια
 * Υποθέτουμε πως 1 κιλό ισοδυναμεί με 1000 γραμμάρια.
 */

public class KiloToGrams {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int weightInKilograms = 0;
        int weightInGrams = 0;
        final int KILOS_TO_GRAMS = 1000;

        System.out.println("Παρακαλώ εισάγετε τα κιλά:");
        weightInKilograms = scanner.nextInt();
       weightInGrams = weightInKilograms * KILOS_TO_GRAMS;

        System.out.printf("Το βάρος σε γραμμάρια των %d κιλών είναι:%d\n ", weightInKilograms, weightInGrams);



    }
}
