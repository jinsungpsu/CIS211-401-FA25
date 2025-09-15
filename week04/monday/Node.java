public class Node<T> {
    public Node(T data) {
        this.data = data;
    }
    T data;
    Node<T> next;
}

class NodeTest {
    public static void main(String[] args) {
        Node<String> firstNode = new Node<>("Car1");
        int num5;
        Node<String> secondNode = new Node<>("Second car");
        String blah = ";aslkjf;alskjdf;aslkdjf;aslkdfj";
        Node<String> thirdNode = new Node<>("3rd car");

        firstNode.next = secondNode;
        secondNode.next = thirdNode;

        // many different ways of adding a 4th car...
        // all of these would achieve the same thing...
        firstNode.next.next.next = new Node<>("Fourth car");
        secondNode.next.next = new Node<>("4th car...");
        thirdNode.next = new Node<>("4th car...");

    }
}