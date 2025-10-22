import java.util.Iterator;
import java.util.LinkedList;
import java.util.TooManyListenersException;

public class HashMapOpen<K, V> implements Map<K, V> {
    private final int DEFAULT_CAPACITY = 10;
    private LinkedList<Entry>[] entries;
    private int count;
    private int collisions;

    public HashMapOpen() {
        entries = new LinkedList[DEFAULT_CAPACITY];
    }

    public HashMapOpen(int initialSize) {
        entries = new LinkedList[initialSize];

        // don't do this.. usually.
//        for (int i = 0; i < entries.length; i++) {
//            entries[i] = new LinkedList<Entry>();
//        }
    }

    private int hash(K key) {
        int hashVal;
        // example using built in hashCode method...
//        hashVal = Math.abs(key.hashCode());
//        hashVal %= keys.length;

        // example using toString
//        String keyString = key.toString();
//        int aDumbHashValue = keyString.charAt(0) + keyString.charAt(1) + keyString.charAt(2);
//        aDumbHashValue %= keys.length;

        int betterHash = 0;
        String keyString = key.toString();
        for (int i = 0; i < keyString.length(); i++) {
            betterHash += keyString.charAt(i);
        }

        betterHash %= entries.length;

        return betterHash;
    }

    @Override
    public void insert(K key, V value) {
        int index = hash(key);

        if (entries[index] == null) {
            // NO LINKED LIST FOUND... YET
            // this also means - NO COLLISION!!!!!!
            entries[index] = new LinkedList<>();
        }
        // check if it already exists
        // then add it...
        Iterator<Entry> itr = entries[index].iterator();
        while(itr.hasNext()) {
            Entry node = itr.next();
            if (key.equals(node.key)) {
                // it already existws
                // so just update the existing node
                node = new Entry(key, value);
                return;
            }
        }
        // doesn't exist
        entries[index].add(new Entry(key, value));
        count++;
    }

    @Override
    public V search(K key) {
        return null;
    }

    @Override
    public void remove(K key) {

    }

    public int getCollisions() {
        return collisions;
    }

    public int getCount() {
        return count;
    }

    private class Entry {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}

class Main234 {
    public static void main(String[] args) {
        HashMapOpen<String, String> phonebook = new HashMapOpen<>(99);
        phonebook.insert("Alex", "302-555-1234");
        phonebook.insert("Alex", "302-112-2341");
        phonebook.insert("Zorbo", "123-213-1341");

    }
}
