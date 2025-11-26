package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Μετατροπή χιλιομέτρων σε μέτρα και εκατοστά
 */

public class KmsToMsCms {
    public static void main(String[] args) {
        // Δήλωση & Αρχικοποίηση Μεταβλητών

        Scanner scanner = new Scanner(System.in);
        int kms = 0;
        int ms = 0;
        int cen = 0;
        final int KMS_TO_MS = 1000;
        final int KMS_TO_CEN = 100_000;

        System.out.println("Παρακαλώ εισάγετε τα χιλιόμετρα:");

        // Εντολές

        kms = scanner.nextInt();

        ms = kms * KMS_TO_MS;
        cen = kms * KMS_TO_CEN;

        // Εκτύπωση Αποτελεσμάτων

        System.out.printf("Χιλιόμετρα σε μέτρα: %d\n", ms);
        System.out.printf("Χιλιόμετρα σε εκατοστά:%d\n",cen);
    }
}
