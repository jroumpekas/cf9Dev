package gr.aueb.cf.cf9.ch7;

public class PopulateApp {
    public static void main(String[] args) {
        String name = "Mitsos";

        for (char ch : name.toCharArray()){
            System.out.print(ch + " ");
        }
        System.out.println("\u2764");
    }
}
