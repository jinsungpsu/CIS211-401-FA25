public class LinkedList<T> {
    private Node<T> head;

    public void add(T item) {
        /*
        An empty linked list...
            head = null
         */
        if (head == null) {
            // this is the first item being added
            Node2 node = new Node2();
            node.data = item;
            // redundant
            node.next = null;
        } else { // head != null
            // there's at least one existing item...
            // if I'm adding this new node to the tail
            // I have to go find the tail...

            /*
            algorithm would be:
            ** create a new node (assign the data value)
            ** find the reference variable to the tail
            ** assign that to the new node that we created
             */
        }
    }
}

class Node2<T> {
    T data;
    Node next;
}

class Node2Tester {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);

        list.add(99);

    }
}
