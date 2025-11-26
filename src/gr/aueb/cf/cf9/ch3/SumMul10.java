package gr.aueb.cf.cf9.ch3;

/**
 * Sum of 10 numbers from 1 to 10.
 * Mul of 10 numbers from 1 to 10
 */

public class SumMul10 {

    public static void main(String[] args) {

        int i = 1;
        int sum = 0;
        int mul = 1;
        int j = 1;

        while (i <= 10) {
            sum += i; // sum = sum + i;
            i++;

        }

        while (j <= 10) {

            mul *= j; // mul = mul * j
            j++;
        }
        System.out.println(("The sum of 10 first numbers is:" + " " + sum));
        System.out.println(("The mul of 10 first numbers is:" + " " + mul));
    }

}
