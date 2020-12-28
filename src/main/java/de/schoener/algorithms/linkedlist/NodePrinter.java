package de.schoener.algorithms.linkedlist;

public class NodePrinter {
    public static void print(Node node) {
        while (node != null) {
            System.out.println(node);
            node = node.getNext();
        }
        System.out.println("**************************************************************************************************");
    }
}
