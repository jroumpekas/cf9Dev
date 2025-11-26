package gr.aueb.cf.cf9.ch3;
/**
 * Ο χρήστης δίνει αρχική, τελική τιμή και το βήμα
 * και το πρόγραμμα υπολογίζει πόσες φορές εκτελείται μια
 * while.
 */

public class GenericWhileApp {

    public static void main(String[] args) {


        int i = 1;
        int endValue = 10;

        while ( i <= endValue) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("Επναλήψεις/ Loops / Iterations:" + (i - 1));

    }
}
