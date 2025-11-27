package gr.aueb.cf.cf9.ch5;

public class PowerRecursiveApp {

    public static void main(String[] args) {
        int base = 0;
        int power = 0;
        int result = 0;

        result = powerRecursive(3,4);

        System.out.println("The result is:" + result);

    }


    public static int powerRecursive(int base, int power){
        if (power == 0){
            return 1;
        }

        return base*powerRecursive(base, power -1);

    }
}
