package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        int minus = 0;
        int mul = 0;
        int div = 0;

        System.out.println("");

        System.out.println("Δώσε δύο αριθμούς: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        sum = add(num1,num2);

        System.out.println("Sum = " + sum);

        minus = remove(num1,num2);

        System.out.println("Minus = " + minus);

        mul = mul(num1,num2);

        System.out.println("Mul = " + mul);

        div = div(num1,num2);

        System.out.println("Div = " + div);

     scanner.close();
    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int remove(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {  if (b == 0) {
        System.out.println("Error: Division by zero!");
        return 0;
    }
        return a / b;
    }

}
