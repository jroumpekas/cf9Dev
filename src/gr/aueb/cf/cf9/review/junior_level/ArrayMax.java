package gr.aueb.cf.cf9.review.junior_level;

/**
 * Οι μεταβλητές a, m δεν είναι καλά ονόματα.
 * Ο κώδικας θα μπορούσε να είναι μέθοδος.
 * Δεν έχει documentation.
 * Δεν έχει δομή.
 * Δεν έχει SoC.
 */

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 15, 23};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
