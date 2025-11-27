package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Ορίζει 2 μεθόδους τις isEven και isOdd για
 * τον έλεγχο ενός ακεραίου.
 */

public class EvenOrApp {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        boolean isEven = false;

        System.out.println("Please enter a number:");
        i = scanner.nextInt();

        // Καλούμε τη μέθοδο isEven
        isEven = isEven(i);

        // Ελέγχουμε και τυπώνουμε αποτέλεσμα
        if (isEven) {
            System.out.println(i + " is even.");
        } else {
            System.out.println(i + " is odd.");
        }

    }


  public static boolean isEven(int number) {
      return number % 2 == 0;


  }


  public static boolean isOdd(int number){
        return number % 2 != 0;
  }


}
