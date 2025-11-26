package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει την ηλικία του σε έτη (έστω ακέραιος)
 * και το πρόγραμμα επιστρέφει την ηλικία, σε ημέρες.
 * Θεωρούμαι ότι ένα έτος = 365 μέρες.
 * Έστω ηλικία 20 ετών, το αποτέλεσμα είναι 7300 ημέρες.
 */

public class YearsToDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int DAYS_IN_YEAR = 365;
        int inputAgeInYears = 0;
        int AgeInDays = 0;

        System.out.println("Παρακαλώ εισάγετε την ηλικία σας:");
        inputAgeInYears = scanner.nextInt();
        AgeInDays = inputAgeInYears * DAYS_IN_YEAR;

        System.out.printf("Ηλικία σε έτη %d, Ηλικία σε ημέρες %d\n", inputAgeInYears,AgeInDays);



    }
}
