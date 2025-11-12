public class Main {
    public static void main(String[] args) {
        BinarySearchTree<Pokemon> pokedex = new BinarySearchTree<>();

        pokedex.insert(new Pokemon("Pikachu", 100, 50, 30));
        pokedex.insert(new Pokemon("Meowth", 100, 50, 30));
        pokedex.insert(new Pokemon("Bulbasaur", 100, 50, 30));
        pokedex.insert(new Pokemon("Charizard", 100, 50, 30));
        pokedex.insert(new Pokemon("Blastoise", 100, 50, 30));
        pokedex.insert(new Pokemon("Onyx", 100, 50, 30));
        pokedex.insert(new Pokemon("Magicarp", 100, 50, 30));

        System.out.println(pokedex);
    }
}

class Pokemon implements Comparable<Pokemon>{
    private String name;
    private int hp, attack, defense;

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }

    public Pokemon(String name, int hp, int attack, int defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    @Override
    public int compareTo(Pokemon other) {
        return this.name.compareTo(other.name);
    }
}

class BinarySearchTree<T extends Comparable<T>> {
    private Node root;

    public void insert(T item) {
        if (root == null) {
            root = new Node(item);
        }
        insert(item, root);
    }

    public String toString() {
        // L V R
        StringBuilder output = new StringBuilder("");
        inorder(root, output);
        return output.toString();
    }

    private void inorder(Node root, StringBuilder output) {
        if (root == null) return;
        inorder(root.left, output);
        output.append(root.data.toString() + " ");
        inorder(root.right, output);
    }

    private void insert(T item, Node root) {
        if (item.compareTo(root.data) == 0) {
            // this item already exists in this BST
            // if we're enforcing no duplicates
            return;
        }
        if (item.compareTo(root.data) > 0) {
            // it's the same thing as saying
            // item > root.data
            // go right
            if (root.right == null) {
                // fell off the tree
                // means I found the insertion point
                root.right = new Node(item);
                return;
            }
            insert(item, root.right);
        } else if (item.compareTo(root.data) < 0) {
            // item < root.data
            if (root.left == null) {
                // fell off the tree
                // means I found the insertion point
                root.left = new Node(item);
                return;
            }
            insert(item, root.left);
        }
    }

    class Node {
        Node left, right;
        // DATA/Key
        T data;

        public Node(T data) {
            this.data = data;
        }
    }
}
