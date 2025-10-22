import java.util.TooManyListenersException;

public class HashMapClosed<K, V> implements Map<K, V> {
    private final int DEFAULT_CAPACITY = 10;
    private K[] keys;
    private V[] values;
    private int count;
    private int collisions;

    public HashMapClosed() {
        keys = (K[])(new Object[DEFAULT_CAPACITY]);
        values = (V[])(new Object[DEFAULT_CAPACITY]);
    }

    public HashMapClosed(int initialSize) {
        keys = (K[])(new Object[initialSize]);
        values = (V[])(new Object[initialSize]);
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

        betterHash %= keys.length;

        return betterHash;
    }

    @Override
    public void insert(K key, V value) {
        if (count < keys.length) {
            count++;
            // why this is O(1) on average
            int index = hash(key);
            if (keys[index] != null) collisions++;
            while (keys[index % keys.length] != null) {
                // something already there
                // there is a collision
                // (simplified way of thinking without
                // deletions, and collisions resolution, etc.)
                index++;
            }
            keys[index] = key;
            values[index] = value;
        } else {
            // full!!!
            // need to rehash
        }
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
}

class Main23 {
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<>(99);
        phonebook.insert("Alex", "302-555-1234");
        phonebook.insert("Chris", "302-112-2341");
        phonebook.insert("Zorbo", "123-213-1341");

    }
}
