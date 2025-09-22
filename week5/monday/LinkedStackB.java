public class LinkedStackB<T> implements Stack<T> {
    /*
    linked stack
    where
    top of stack = tail of linked list
     */
    private Node head;

    @Override
    public void push(T item) throws IllegalStateException {
        Node newNode = new Node();
        newNode.data = item;

        // find the tail
        Node itr = head;
        while (itr.next != null) {
            itr = itr.next;
        }
        Node tail = itr;


        tail.next = newNode;
    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int length() {
        return 0;
    }

    private class Node {
        T data;
        Node next;
    }
}
