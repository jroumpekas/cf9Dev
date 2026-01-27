package gr.aueb.cf.cf9.ch17.singly_linked_list;

import gr.aueb.cf.cf9.ch17.NodeFlexible;

public class FlexibleNodeApp {
    public static void main(String[] args) {

        NodeFlexible head = new NodeFlexible("Coding Factory");
        head.setValue("CF");
        int data = (int) head.getValue();

        System.out.println(data);
    }
}
