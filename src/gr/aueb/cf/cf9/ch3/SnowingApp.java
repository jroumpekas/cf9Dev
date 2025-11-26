package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 *  The user inserts the temperature in Celsius, and the
 *  status of isRaining variable and calculates if it is snowing or not.
 */

public class SnowingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("Παρακαλώ εισάγετε αν βρέχει (true/false)");

        isRaining = scanner.nextBoolean();
        System.out.println("Παρακαλώ εισάγετε την θερμοκρασία");
        temperature = scanner.nextInt();

        isSnowing = (isRaining == true) && (temperature < 0); // Short-Circuit Operator

        System.out.println("Is Snowing: " + isSnowing);


    }
}
