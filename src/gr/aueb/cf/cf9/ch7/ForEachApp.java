package gr.aueb.cf.cf9.ch7;

/**
 * Prints a string as char array
 * with for-each.
 */
public class ForEachApp {

    public static void main(String[] args) {
        String s = "Coding Factory";

        for (char ch : s.toCharArray()) {
            System.out.println(ch + " ");
        }

        System.out.println("\u2764");
    }
}
