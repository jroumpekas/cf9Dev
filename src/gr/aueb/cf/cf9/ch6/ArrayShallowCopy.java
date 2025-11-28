package gr.aueb.cf.cf9.ch6;

/**
 * Όταν κάνουμε copy references, το copy ονομάζεται shallow, και έχει
 * side effects.
 */

public class ArrayShallowCopy {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arrCopy = arr1;   // Shallow copy

        arrCopy[0] = 1000;
        System.out.println(arr1[0]);

    }


}
