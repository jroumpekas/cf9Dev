package gr.aueb.cf.cf9.ch7;

public class ReplaceDeleteApp {
    public static void main(String[] args) {

        String firstname = "Makis";
        String lastname = "Kotsampasis";
        String nickname = "λιονταράκι";
        String oneName;

        // replace firstname
        firstname = firstname.replace("Makis","Διονύσης");

        // replace lastname
        lastname = lastname.replace("Kotsampasis","Μαυροτσούκαλος");



        System.out.printf("Το όνομα είναι %s και το επίθετο είναι %s\n", firstname,lastname);
        System.out.println("Το παρατσούκλι είναι:" + nickname);

    }
}
