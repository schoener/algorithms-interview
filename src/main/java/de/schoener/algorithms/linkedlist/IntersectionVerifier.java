package de.schoener.algorithms.linkedlist;

public class IntersectionVerifier {
    public static void main(String[] args) {
        Node node1 = new Node(12);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(41);
        Node node5 = new Node(5);
        Node node6 = new Node(1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);
        Node node7 = new Node(4);
        node7.setNext(node4);

        //print
        NodePrinter.print(node1);
        NodePrinter.print(node7);

        int firstLength = determineLength(node1);
        int secondLength = determineLength(node7);

        Node firstList = node1;
        Node secondList = node7;

        if (firstLength != secondLength) {
            Node longer = firstLength > secondLength ? node1 : node7;
            firstList = fastForwardList(longer, firstLength - secondLength);
        }

        Node intersecionNode = determineIntersectionNode(firstList, secondList);
        NodePrinter.print(intersecionNode);
    }

    private static Node determineIntersectionNode(Node firstList, Node secondList) {
        while (firstList != null && secondList != null) {
            if (firstList == secondList) {
                return firstList;
            }
            firstList = firstList.getNext();
            secondList = secondList.getNext();
        }
        return null;
    }

    private static Node fastForwardList(Node node, int offset) {
        while (offset-- > 0) {
            node = node.getNext();
        }
        return node;
    }

    private static int determineLength(Node node) {
        int result = 0;
        while (node != null) {
            result++;
            node = node.getNext();
        }
        return result;
    }
}
