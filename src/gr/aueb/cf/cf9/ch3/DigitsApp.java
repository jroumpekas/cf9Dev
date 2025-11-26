package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των στοιχείων ενός ακεραίου. Για παράδειγμα, αν
 * ο ακέραιος είναι 178, το πλήθος των ψηφίων είναι 3.
 */

public class DigitsApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int digits = 0;

        System.out.println("Please enter a number: ");

        num = scanner.nextInt();

        int inputNum = num;

        do {
            digits++;
            num /= 10;

        }while (num > 0);

        System.out.printf("The number of digits of " + inputNum + " is: " + " " + " " + digits);

    }


}
