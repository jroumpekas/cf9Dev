package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Calculates hours to minutes & seconds, for a given number of
 * hours
 */

public class HoursToMinSec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  hours = 0;
        int  seconds = 0;
        int  minutes = 0;
        final int HOURS_IN_MINUTES = 60;
        final int HOURS_IN_SECONDS = 3600;
        System.out.println("Παρακαλώ εισάγετε τον αριθμό των ωρών:");

        hours = scanner.nextInt();

        minutes  = hours * HOURS_IN_MINUTES;
        seconds  = hours * HOURS_IN_SECONDS;

        System.out.printf("Ώρες σε λεπτά: %d\n", minutes);
        System.out.printf("Ώρες σε δευτερόλεπτα: %d\n", seconds);




    }
}
