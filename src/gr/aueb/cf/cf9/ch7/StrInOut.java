package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

public class StrInOut {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = "";
        String str2 = "";

        System.out.println("Please enter two numbers: ");

        str = scanner.next(); // διαβάζει μέχρι να βρει whitespace
        str2 = scanner.nextLine(); // διαβάζει μέχρι να βρει new line.
    }
}
