package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

import static java.lang.System.in;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String lexeme;
        int num;

        System.out.println("Please enter an integer:");
        lexeme = scanner.next();
        num = Integer.parseInt(lexeme);
        System.out.println("The mum is:" + num);
    }
}
