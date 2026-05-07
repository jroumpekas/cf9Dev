package gr.aueb.cf.cf9.ch15.defaults;

public class CodingFactory  implements IWelcome{


    @Override
    public void saySomething(String message) {
        System.out.println("Please read the message: " + message);

    }

    @Override
    public void sayHelloCodingFactory() {
        IWelcome.super.sayHelloCodingFactory();
        System.out.println("\u2764".repeat(5)); // Red Heart
    }
}
