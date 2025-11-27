package gr.aueb.cf.cf9.ch4;

/**
 * Εκτυπώνει 10 οριζόντια αστεράκια με for.
 */

public class StarsHorizontalApp {
    public static void main(String[] args) {

        // 1) Horizontal
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }
        System.out.println();

        // 2) Vertical
        for (int i = 1; i <= 10; i++) {
            System.out.println("*");
        }
        System.out.println();

        // 3) Grid 10x10
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // 4) 1, 2, 3, ... stars
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // 5) 10, 9, 8, ... stars
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}