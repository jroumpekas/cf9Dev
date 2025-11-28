package gr.aueb.cf.cf9.ch7;

public class ConcatApp {
    public static void main(String[] args) {
        String firstname = "Thanasis";
        String lastname = "Androutsos";
        String title = "Dr";
        String fullName1, fullName2, fullaName3,fullName4;

        fullName1 = firstname + lastname;
        fullName2 = title + firstname + lastname;
        fullaName3 = firstname.concat(lastname);
        fullName4 = title.concat(firstname).concat(lastname);

        System.out.printf("First name: %s Last name: %s%n", firstname, lastname);
        System.out.printf("Full name 1 is: %S ", fullName1);
        System.out.println();
        System.out.printf("Full name 2 is: %S ", fullName2);
        System.out.println();
        System.out.printf("Full name 3 is: %S ", fullaName3);
        System.out.println();
        System.out.printf("Full name 4 is: %S ", fullName4);
    }
}
