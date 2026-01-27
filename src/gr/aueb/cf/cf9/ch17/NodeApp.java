package gr.aueb.cf.cf9.ch17;

public class NodeApp {
    public static void main(String[] args) {
        Node node = new Node(2);

        node.setValue(6);

        int data = node.getValue();

        System.out.println(data);

    }
}
