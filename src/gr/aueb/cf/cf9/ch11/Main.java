package gr.aueb.cf.cf9.ch11;



public class Main {

    public static void main(String[] args) {

        Order order = new Order(260,"12/4/2025", 55.80, "Pending");
        Order order1 = new Order(250,"20/5/2015",55.45,"Delivered");
        order.setTotalPrice(65.80);
        order.setOrderDate("13/4/2025");

        System.out.println(order1.getTotalPrice());

        System.out.println(order.getTotalPrice());
        System.out.println(order.getOrderDate());

        System.out.println(order.getTotalPrice());
        System.out.println(order.getOrderDate());

        System.out.println(order.getOrderDate());
        System.out.println(order.getStatus());

        Point directions = new Point(250,260);

        System.out.println(directions.getX());
        System.out.println(directions.getY());

        Product milk = new Product(123L, "Milko", "Chocolate milk", 4.5, 3, true);

        System.out.println(milk.getPrice());
        int price;

        Customer customer = new Customer(345L, "Papadopoulos", "Nikos", "565456", "56545",
                "fdfd", "dgdgdg","gdgdg","Egaleo","dsdsd", "sddsd","nikpap3@gmail.com");


        System.out.println(customer.getLastname());
        System.out.println(customer.getCity());
        System.out.println(customer.getId());

       User user = new User(98L, "Giannis", "Papathanasiou", "JohnPap", "22343@",true);
       User andreas22 = new User(1L, "Andreas", "Papadopoulos", "andrew", "12342", true);
       System.out.println(andreas22.getUsername());
       System.out.println(andreas22.isActive());

        Student student = new Student();
        Student alice = new Student();
        Student bob = new Student();

        Student student2 = new Student(4,"Makis","Kapetis");
        student2.setFirstname("Chrysostomos"); // με τον setter μπορούμε να κάνουμε update.
        Student student3 = new Student(5,"Lampros","Ioannou");
        Student student4 = new Student(6,"Dionisis","Karampatsis");
        student4.setFirstname("Nikolaos");

       // System.out.println(student3);



        alice.setId(1);                     // setter
        alice.setFirstname("Alice");        // getter
        alice.setLastname("Wonderland");

        bob.setId(2);
        bob.setFirstname("Bob");
        bob.setLastname("Dylan");

        student.setId(3);
        student.setFirstname("Anna");
        student.setLastname("Karenina");


        System.out.println(alice.getId());
        System.out.println(alice.getFirstname());
        System.out.println(alice.getLastname());


        System.out.printf("Id: %d, Firstname: %s, Lastname: %s\n",
                alice.getId(), alice.getFirstname(), alice.getLastname());

        System.out.println(Student.getStudentsCount());
    }
}
