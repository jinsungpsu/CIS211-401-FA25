public class LinkedStackA<T> implements Stack<T> {
    /*
    linked list where
    top of stack = head of linked list
     */
    private Node head;
    private int count;

    @Override
    public void push(T item) throws IllegalStateException {
        Node newNode = new Node();
        newNode.data = item;
        newNode.next = head;
        head = newNode;
        count++;
    }

    @Override
    public T pop() {
        Node oldHead = head;
        head = head.next;
        count--;
        return oldHead.data;
    }

    @Override
    public T peek() {
        if (head == null) return null;
        return head.data;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int length() {
        return count;
    }

    private class Node {
        T data;
        Node next;
    }
}
