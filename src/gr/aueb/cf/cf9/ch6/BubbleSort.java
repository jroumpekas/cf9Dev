package gr.aueb.cf.cf9.ch6;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        int[] sorted;
        System.out.println("Before sorting: ");
        printArray(arr);

        System.out.println();

        System.out.println("After sorting: ");
        sorted = bubbleSort(arr);



        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
