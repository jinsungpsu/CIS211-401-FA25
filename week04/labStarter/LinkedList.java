public class LinkedList<T> {
    private Node head;
    private int count = 0;

    public void add(T item) {
        // special case
        // if list is empty
        Node node = new Node(item, null);
        if (head == null) {
            head = node;
        } else {
            Node itr = head; // itr, short for iterator

            // the condition needed here is:
            // keep going (or iterating)
            // until I've reached the tail
            while (itr.next != null) {
                itr = itr.next;
            }

            Node tail = itr;
            tail.next = node;
        }
        count++;
    }

    public T get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Doh");
        } else {
            // iterate through the linked list
            // condition is a little different than what we did in class
            // now it's a counter based loop (aka for loop)
            // iterate the same way...
            /*
            Node itr = head;
            for () {
                itr = itr.next;
            }
            return itr.data;
             */
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        if (count == 0) return "[ ]";
        output.append("[");
        // loop through WHOLE LinkedList
        // meaning until you hit the tail
        // inside the loop
        // output.append(itr.data + " ");

        output.append("]");
        return output.toString();
    }

    // nested/helper class
    private class Node {
        T data;
        Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
