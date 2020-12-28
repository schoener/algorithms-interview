package de.schoener.algorithms.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LoopVerifier {
    public static void main(String[] args) {
        Node node1 = new Node(12);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(41);
        Node node5 = new Node(4);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node3);

        boolean containtsLoop = checkContainsLoop(node1);
        System.out.println("List contains loop: " + containtsLoop);
    }

    private static boolean checkContainsLoop(Node node) {
        Set<Node> nodes = new HashSet<Node>();
        while (node != null) {
            if (nodes.contains(node)) {
                return true;
            }
            nodes.add(node);
            node = node.getNext();
        }
        return false;
    }
}
