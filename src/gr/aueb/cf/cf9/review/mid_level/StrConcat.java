package gr.aueb.cf.cf9.review.mid_level;

public class StrConcat {
    public static void main(String[] args) {
        String name = "Helen";
        int age = 30;
        String message = fullData(name, age);

        System.out.println(message);

    }

    public static String fullData(String name, int age){
        return "Hello, my name is " + name + " and i am " + age +"years old";


    }
}
