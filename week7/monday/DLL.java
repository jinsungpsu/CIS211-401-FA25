public class DLL {
    private Node head, tail;
    private int count;

    /*
    is the head of the DLL index 0
    or is the tail of the DLL index 0
    there is NO right/wrong answer here...

    head=index 0
    tail="end" of the list (length - 1)
     */
    public void add(int num) {
        if (count == 0) {
            // if list is empty
            head = tail = new Node();
            tail.data = num;
        } else {
            // there's at least one item in the list
            /*
             */
            Node node = new Node();
            node.data = num;
            node.prev = tail;
            tail.next = node;
            node.next = null;
            tail = node;
        }
        count++;
    }

    public void remove(int index) {
        /*
        don't forget about special cases...
        meaning... if it's first (aka index = 0)
        or last item (index = count or length - 1)
         */
        if (index < count / 2) {
            // this means it's in the "front" half
            // this index is closer to the head node
            // aka, we're gonna iterate "forward"
        } else {
            // this means it's in the "back" half
            // this index is closer to the tail node
            // aka, we're gonna iterate "backwards"
        }
    }

    private class Node {
        Node prev, next;
        int data;
    }
}

class Tester {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
    }
}
