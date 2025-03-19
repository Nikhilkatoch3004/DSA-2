package quilertest;

import java.util.ArrayList;

public class SimpleHashMap {
    private ArrayList<KeyValue> map;

    public SimpleHashMap() {
        map = new ArrayList<>();
    }

    public void put(String key, String value) {
        for (KeyValue pair : map) {
            if (pair.key.equals(key)) {
                pair.value = value; // Update value if key exists
                return;
            }
        }
        map.add(new KeyValue(key, value)); // Add new key-value pair
    }

    public String get(String key) {
        for (KeyValue pair : map) {
            if (pair.key.equals(key)) {
                return pair.value; // Return the value for the key
            }
        }
        return null; // Key not found
    }

    public void displayMap() {
        for (KeyValue pair : map) {
            System.out.println(pair.key + ": " + pair.value);
        }
    }

    // Nested class to store key-value pairs
    private static class KeyValue {
        String key;
        String value;

        KeyValue(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        SimpleHashMap simpleMap = new SimpleHashMap();

        simpleMap.put("Name", "Alice");
        simpleMap.put("Age", "25");
        simpleMap.put("City", "Bengaluru");

        System.out.println("Value for 'Name': " + simpleMap.get("Name"));
        System.out.println("Value for 'City': " + simpleMap.get("City"));

        System.out.println("\nFull map:");
        simpleMap.displayMap();
    }
}
