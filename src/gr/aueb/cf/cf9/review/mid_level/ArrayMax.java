package gr.aueb.cf.cf9.review.mid_level;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 8, 10, 12};

        int max = 0;

        max = arrMaxValue(arr);

        System.out.println(max);

    }
   public static int arrMaxValue(int[] arr){
        int max = arr[0];
        for (int num: arr){
            if (num > max){
                max = num;
            }
        }
        return max;
   }
}
