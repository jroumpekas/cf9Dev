package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class PowerMethodApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 1;
        int base = 0;
        int power = 0;

        System.out.println("Please enter base and power: ");
        base = scanner.nextInt();
        power = scanner.nextInt();

        result = power1(base, power);

        System.out.println("The result is: " + result);
    }

    /**
     * Calculates the power of a number on base
     */
    public static int power1(int base, int power) {

        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        return result;
    }
}
