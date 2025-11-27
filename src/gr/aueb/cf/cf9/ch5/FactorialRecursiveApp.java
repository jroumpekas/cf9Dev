package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του n
 * με αναδρομικό τρόπο.
 */

public class FactorialRecursiveApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int result = 0;

        System.out.println("Please enter a number:");
        n = scanner.nextInt();

        result = facto(5);

        System.out.println("The factorial is:" + result);
    }

    public static int facto(int n) {
//        if (n ==1){
//            return 1;
//        }
//        return n * facto(n -1);

        return  n <= 1 ? 1: n * facto(n - 1); // τριαδικός τελεστής
    }
}
