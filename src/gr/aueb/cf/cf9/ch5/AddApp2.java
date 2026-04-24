package gr.aueb.cf.cf9.ch5;

public class AddApp2 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum = 0;

        sum = add(num1,num2);  // εκτός κλάσης θα ήταν AddApp(num1,num2)

        System.out.println("Sum = " + sum);

    }

    /**
     * Add two integers.
     * @param a the first int to add
     * @param b the second int to add
     * @return the sum of a and b
     */

    public static int add(int a, int b) {

        return a + b;
    }
 }

