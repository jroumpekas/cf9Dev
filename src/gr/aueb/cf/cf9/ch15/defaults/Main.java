package gr.aueb.cf.cf9.ch15.defaults;

public class Main {
    public static void main(String[] args) {
        IWelcome welcomeCf = new CodingFactory();
        welcomeCf.sayHelloCodingFactory();
    }
}
