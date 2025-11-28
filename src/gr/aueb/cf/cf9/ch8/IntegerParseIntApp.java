package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class IntegerParseIntApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        String inputStr = "";

        System.out.println("Please insert an integer: ");
        inputStr = in.nextLine();
        num = Integer.parseInt(inputStr);

        System.out.println("Input number:" + num);
    }
}
