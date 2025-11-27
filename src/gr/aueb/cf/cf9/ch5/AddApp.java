package gr.aueb.cf.cf9.ch5;

/**
 * Demo of Addition method.
 */
public class AddApp { // (όλες οι static methods ανήκουν στην κλάση).

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum = 0;

        sum = add(num1,num2);  // εκτός κλάσης θα ήταν AddApp(num1,num2)

        System.out.println("Sum = " + sum);

    }

    public static int add(int a, int b) {
        return a + b;
    }
}
