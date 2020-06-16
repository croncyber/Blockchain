import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static class TableEntry<T> {
        private final int key;
        private final T value;

        public TableEntry(int key, T value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public T getValue() {
            return value;
        }
    }

    private static class HashTable<T> {
        private int size;
        private TableEntry[] table;

        public HashTable(int size) {
            this.size = size;
            table = new TableEntry[size];
        }

        public boolean put(int key, T value) {
            int idx = findKey(key);

            if (idx == -1) {
                return false;
            }

            T item = null;
            if (table[idx] != null) {
                item = (T) table[idx].getValue();
            }

            if (item == null) {
                table[idx] = new TableEntry(key, value);
            } else {
                table[idx] = new TableEntry(key, table[idx].getValue() + " " + value);
            }

            return true;
        }

        public T get(int key) {
            int idx = findKey(key);

            if (idx == -1 || table[idx] == null) {
                return null;
            }

            return (T) table[idx].getValue();

        }

        public void entrySet() {
            for (int i = 0; i < size; i++) {
                if (table[i] != null) {
                    System.out.println(table[i].getKey() + ": " + table[i].getValue().toString());
                }

        }}


        private int findKey(int key) {
            int hash = key % size;

            while (!(table[hash] == null || table[hash].getKey() == key)) {
                hash = (hash + 1) % size;

                if (hash == key % size) {
                    return -1;
                }
            }

            return hash;
        }

        private void rehash() {
            // put your code here
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        HashTable<String> hashTable = new HashTable<>(size);
        for (int i = 0; i < size; i++) {
            int key = scanner.nextInt();
            String value = scanner.next().trim();
            hashTable.put(key, value);
        }

       hashTable.entrySet();


        // put your code here
    }
}