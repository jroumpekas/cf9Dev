package gr.aueb.cf.cf9.ch17.streams;

import gr.aueb.cf.cf9.ch17.NodeFlexible;

public class NodeFlexibleApp {

    public static void main(String[] args) {
        NodeFlexible head = new NodeFlexible("CF9");
        head.setValue(5);

        int data = (int) head.getValue();

        System.out.println(data);
    }
}
