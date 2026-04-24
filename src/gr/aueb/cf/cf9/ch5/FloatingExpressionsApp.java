package gr.aueb.cf.cf9.ch5;

/**
 * Demo of Floating Expressions
 */

public class FloatingExpressionsApp {

    public static void main(String[] args) {
        int intNum = 10;
        float floatNum = 10.5f;
        double doubleNum1 = 10.56789;
        double doubleNum2 = 2D;

        double doubleResult = 0.0;
        float floatResult = 0.0F;

        floatResult = floatNum +intNum;  // Αν υπάρχει ένας float οι μικρότεροι μεγέθους τύποι, μετατρέπονται σε float

        doubleResult = intNum + floatNum + doubleNum1 + doubleNum2; // όλα μετατρέπονται στον μεγαλύτερο τύπο - auto-widening

        System.out.printf("floatResult is = %f", floatResult);
        System.out.println();
        System.out.printf("doubleResult is = %f", doubleResult);
    }
}
