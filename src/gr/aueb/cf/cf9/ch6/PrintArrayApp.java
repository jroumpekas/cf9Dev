package gr.aueb.cf.cf9.ch6;
public class PrintArrayApp {

    public static void main(String[] args) {
        int[] ages = {20, 25, 30, 35, 33, 45, 19, 90, 55};

        printArray(ages);
        System.out.println();
        printArray(ages, 1, ages.length - 2);
        System.out.println();
    }

    private static void printArray(int[] arr) {
        printArray(arr, 0, arr.length - 1);
    }

    private static void printArray(int[] arr, int low, int high) {
        if ((low < 0) || (high > arr.length - 1)) return;

        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
