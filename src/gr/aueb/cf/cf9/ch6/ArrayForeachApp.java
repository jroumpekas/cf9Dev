package gr.aueb.cf.cf9.ch6;

/**
 * Διασχίζει και τυπώνει τα στοιχεία ενός
 * πίνακα με for-each.
 */

public class ArrayForeachApp {

    public static void main(String[] args) {
        int [] ages = {19, 29, 22, 40};

        for (int age : ages) {
            System.out.println(age + " ");
        }
    }
}
