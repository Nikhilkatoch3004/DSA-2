package quilertest;

import java.util.LinkedHashMap;
import java.util.Map;

public class SimpleLRUCache {
    private final int capacity;
    private final LinkedHashMap<Integer, Integer> cache;

    public SimpleLRUCache(int capacity) {
        this.capacity = capacity;

        // Using LinkedHashMap with accessOrder = true for LRU behavior
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity; // Remove the eldest entry if size exceeds capacity
            }
        };
    }

    public void put(int key, int value) {
        cache.put(key, value); // Add or update the key-value pair
    }

    public Integer get(int key) {
        return cache.getOrDefault(key, null); // Get the value or return null if not found
    }

    public void displayCache() {
        System.out.println("Cache: " + cache);
    }

    public static void main(String[] args) {
        SimpleLRUCache lruCache = new SimpleLRUCache(3); // Cache capacity: 3

        lruCache.put(1, 10);
        lruCache.put(2, 20);
        lruCache.put(3, 30);
        lruCache.displayCache(); // Cache: {1=10, 2=20, 3=30}

        lruCache.get(2); // Access key 2
        lruCache.put(4, 40); // Add a new entry, evict the least recently used (key 1)
        lruCache.displayCache(); // Cache: {3=30, 2=20, 4=40}

        lruCache.put(5, 50); // Add another entry, evict key 3
        lruCache.displayCache(); // Cache: {2=20, 4=40, 5=50}
    }
}

