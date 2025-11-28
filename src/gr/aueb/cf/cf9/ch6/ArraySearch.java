package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

/**
 * Αναζητά ένα στοίχειο σε ένα πίνακα.
 */

public class ArraySearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 18 ,18,145};
        int [] arr2 = null;
        int value = 0;
        int position = 0;

        System.out.println("Please enter a value to search for: ");
        value = scanner.nextInt();

        position = getPosition(arr, value);

       if (position == -1){
           System.out.println("Value not found.");
       }else{
           System.out.println("Value: " + value + " found at position : " + (position +1));
       }


    }

    /**
     * Επιστρέφει τη θέση του πρώτου στοιχείου του πίνακα που
     * ισούται με την τιμή αναζήτησης (value). Αν υπάρχει το στοιχείο.
     * Αν δεν υπάρχει το στοιχείο, επιστρέφει τη θέση -1.
     * @param arr   o input πίνακας.
     * @param value η τιμή αναζήτησης.
     * @return      το
     */
    public static int getPosition(int[] arr, int value) {
        if (arr == null) return -1;

        int positionToReturn = -1;

        for(int i =0; i < arr.length; i++){
            if (arr[i] == value){
                positionToReturn = i;
                break;
            }

        }
        return positionToReturn;
    }

  //  public static int getPositions2
}
