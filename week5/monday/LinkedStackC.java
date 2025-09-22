public class LinkedStackC<T> implements Stack<T> {
    /*
    not a point of emphasis in this semester
    but we can do a singly linked list...
    with a head reference
    AND a tail reference
     */

    /*
    this is a linked stack where
    the tail of the linked list = top of the stack
     */
    private Node head;
    private Node tail;

    @Override
    public void push(T item) throws IllegalStateException {
        Node newNode = new Node();
        newNode.data = item;
        tail.next = newNode;
        tail = newNode;
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
