package gr.aueb.cf.cf9.ch7;

public class RepeatMethod {
    public static void main(String[] args) {

        //20 horizontal stars
        System.out.println("*".repeat(20));

        // 10x10 border

        System.out.println();

        for (int i =1; i <= 10; i++){
            System.out.println("*".repeat(10));
        }
    }
}
