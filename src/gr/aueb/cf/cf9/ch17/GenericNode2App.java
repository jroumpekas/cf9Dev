package gr.aueb.cf.cf9.ch17;

public class GenericNode2App {
    public static void main(String[] args) {
        GenericNode2<Integer, String> node = new GenericNode2<>();



        node.setItem1(1);
        node.setItem2("Alice");


        System.out.println(node.getItem1());
        System.out.println(node.getItem2());

        Product<String, Double> product = new Product<>("Banana", 2.4);
        product.setItem("Apple");
        product.setPrice(1.6);


        System.out.println(product.getItem());
        System.out.println(product.getPrice());



    }
}
