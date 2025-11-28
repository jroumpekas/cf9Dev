package gr.aueb.cf.cf9.ch7;

import java.util.Locale;

public class StringToLowerCase {
    public static void main(String[] args) {
        String s = "Department of International and European Economic Studies";
        String lowercase;
        String upperCase;
        String trimmed;


        lowercase = s.toLowerCase();
        upperCase = s.toUpperCase();
        trimmed = s.trim();

        System.out.println(lowercase);
        System.out.println(upperCase);
        System.out.println(trimmed);

    }

}
