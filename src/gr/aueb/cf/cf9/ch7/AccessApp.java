package gr.aueb.cf.cf9.ch7;

public class AccessApp {
    public static void main(String[] args) {
        String s = "Coding Factory";

        for (int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i) + " ");
        }
        // Κενό μεταξύ των δύο εκτυπώσεων
        System.out.println();

        // reverse order
        for (int i = s.length() - 1; i >= 0; i--){
            System.out.print(s.charAt(i) + " ");
        }
    }
}
