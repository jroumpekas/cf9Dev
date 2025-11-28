package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

public class StringInputApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;

        System.out.println("Please enter a string that ends with whitespace(white/tab/space)");
        s = sc.next();
        sc.nextLine();      // consumes the new lines character(s).

        System.out.println(s);

        System.out.println("Please insert a new string that ends with enter");
        s= sc.nextLine();
        System.out.println(s);

    }
}
