package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class TemperatureConverterApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = 0.0;
        double fahrenheit = 0.0;

        System.out.println("Please give us a temperature: ");

        celsius = scanner.nextDouble();

        double toFahrenheit = toFahrenheit(celsius);
        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        double backToCelsius = toCelsius(fahrenheit);  // προαιρετικό: έλεγχος αντίστροφης μετατροπής
        System.out.println(fahrenheit + "°F = " + backToCelsius + "°C");

        scanner.close();
    }

    public static double toFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;

    }

    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
