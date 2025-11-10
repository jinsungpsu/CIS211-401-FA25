//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
}

class BinarySearchTree<T extends Comparable<T>>{
    private Node root;

    public void insert(T item) {
        if (item.compareTo(root.data) > 0) {
            // it's the same thing as saying
            // item > root.data
            // go right
        } else if (item.compareTo(root.data) == 0) {
            // that would mean
            // item == root.data
        } else if (item.compareTo(root.data) < 0) {
            // item < root.data
        }
    }

    class Node {
        Node left, right;
        // DATA/Key
        T data;
    }
}
