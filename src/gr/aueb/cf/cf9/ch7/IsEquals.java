package gr.aueb.cf.cf9.ch7;

public class IsEquals {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = "London";
        String s3 = "Paris";
        String s4 = "Athens";
        String s5 = "ATHENS";

        boolean isEqual;

        isEqual = s1.equals(s2);  //False
        isEqual = s2.equals(s3);  //False
        isEqual = s1.equalsIgnoreCase(s5); // True

        if (s1.compareTo(s5) > 0){
            System.out.println("Το Athens είναι μεγαλύτερο από το ATHENS");
        }else{
            System.out.println("Δεν είναι μεγαλύτερο");
        }
    }
}
