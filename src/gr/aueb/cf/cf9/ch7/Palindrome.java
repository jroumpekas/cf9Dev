package gr.aueb.cf.cf9.ch7;

/**
 * Παλινδρομική είναι μια πρόταση (string) που διαβάζεται
 * το ίδιο από την αρχή μέχρι το τέλος.
 */

public class Palindrome {
    public static void main(String[] args) {
        String s1 = "AttA";
        System.out.println(isPalindrome(s1));


    }

    /**
     * Επιστρέφει true αν ένα String είναι palindrome, αλλιώς false.
     * @param str the input String.
     * @return true, is the String is palindrome, false otherwise.
     *
     */

    public static boolean isPalindrome(String str){
        for (int i = 0, j = str.length() - 1; i < j; i++, j--){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }

        }
        return true;
    }

    public static boolean isPalindrom2(String str){
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
