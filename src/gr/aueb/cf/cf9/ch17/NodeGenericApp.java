package gr.aueb.cf.cf9.ch17;

public class NodeGenericApp {
    public static void main(String[] args) {
        GenericNode<Integer> intNode = new GenericNode<>();
        GenericNode<String> strNode = new GenericNode<>();

        intNode.setValue(4);
        strNode.setValue("CF");

        System.out.println(intNode);
        System.out.println(strNode);
    }
}
