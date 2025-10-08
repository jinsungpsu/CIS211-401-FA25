/*
we can improve the implementation of the array based map
if we keep things sorted...
array - random access needed to access things in the middle
insert()... O(?) -> O(n) -> requires finding correct spot/shifting
search... --> O(log n)
remove... --> O(n)

linked list -
don't really gain much, because of lack of random access
 */
public class Main {
    public static void main(String[] args) {
//        Map<String, Integer> phonebook = new HashMap<>();
//        phonebook.put("Bob", 302123456);
//        phonebook.put("Alex", 1234556);
//        phonebook.put("Bob", 12341235);
//
//        System.out.println(phonebook.get("Alex"));
    }
}

interface Map<K, V> {
    public void insert(K key, V value);

    public V search(K key);

    public void remove(K key);
}

class LinkedMap<K, V> implements Map<K, V> {

    private Node head;
    private int count;

    @Override
    public void insert(K key, V value) {
        // assuming we insert at head
        // this is O(1) with duplicates
        // O(n) when we enforce no duplicates
        Node node = new Node();
        node.key = key;
        node.value = value;
        // reference...
        node.next = head;
        head = node;
        count++;
    }

    @Override
    public V search(K key) {
        // O(n)
        Node itr = head;
        while(itr != null) {
            if (key.equals(itr.key)) {
                return itr.value;
            }
            itr = itr.next;
        }
        return null;
    }

    @Override
    public void remove(K key) {

    }

    class Node {
        K key;
        V value;
        Node next, prev;
    }
}

class ArrayMap<K,V> implements Map<K,V> {
    private final int DEFAULT_CAPACITY = 10;
    /* need to start pairs of values */
    private K[] keys;
    private V[] values;
    private int count;

    /*
    OR
    private Entry[] entries;

    class Entry {
        K key;
        V value;
    }
     */

    public ArrayMap() {
        keys = (K[])(new Object[DEFAULT_CAPACITY]);
        values = (V[])(new Object[DEFAULT_CAPACITY]);
    }

    public ArrayMap(int initialSize) {
        keys = (K[])(new Object[initialSize]);
        values = (V[])(new Object[initialSize]);
    }

    @Override
    public void insert(K key, V value) {
        /*
        CONCEPTUALLY, a Map is NOT a linear data structure
        so there's no question to be answered like what we did before
        there's "front" or "top" or "back" or "bottom"
         */

        // O(1) but will be O(n) when we enforce no duplicates
        if (count < keys.length) {
            // there's space!
            keys[count] = key;
            values[count] = value;
            count++;
        }
        /*
        missing functionality -
        do not allow duplicates
         */

    }

    @Override
    public V search(K key) {
        // O(n)
        for (int i = 0; i < count; i++) {
            if (key.equals(keys[i])) {
                return values[i];
            }
        }
        return null;
    }

    @Override
    public void remove(K key) {
        /*
        look for the item to remove
        then shift stuff over
        O(n)
         */
    }
}
