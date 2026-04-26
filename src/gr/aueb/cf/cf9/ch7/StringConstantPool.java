package gr.aueb.cf.cf9.ch7;

/**
 * Identical strings are stored only once, that
 * is, strings are interned in a special heap area called
 * String Constant Pool (SCP)
 */

public class StringConstantPool {

    public static void main(String[] args) {
        String s1 = "Coding Factory";
        String s2 = "Coding Factory";

        System.out.println(s1);
        System.out.println(s2);
    }
}
