package gr.aueb.cf.cf9.ch4;

/**
 * Break stops execution.
 */

public class ForBreakApp {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            System.out.println(i + " ");
            if (i == 5) break; // Διακόπτει, όταν το i είναι 5
        }
        System.out.println();
        System.out.println("for loop stopped...");
    }
}
