package TableNested;

import java.util.ArrayList;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class TableNested<K, V> {
    private ArrayList<Entry> entries;

    public TableNested() {
        entries = new ArrayList<>();
    }

    public V get(K key) {
        for (Entry entry : entries) {
            if (key.equals(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void put(K key, V value) {
        boolean present = false;
        for (int i = 0; i < entries.size(); i++) {
            if (key.equals(entries.get(i).getKey())) {
                entries.set(i, new Entry(key, value));
                present = true;
            }
        }
        if (! present) {
            entries.add(new Entry(key, value));
        }
    }

    public void remove(K key) {
        for (int i = 0; i < entries.size(); i++) {
            if (key.equals(entries.get(i).getKey())) {
                entries.remove(i);
                break;
            }
        }
    }

    private class Entry {
        private K key;
        private V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        K getKey() {
            return key;
        }

        V getValue() {
            return value;
        }

    }
}
