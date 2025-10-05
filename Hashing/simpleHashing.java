public class SimpleHashing {
    public static void main(String[] args) {
        int[] hashTable = new int[10]; // fixed size hash table
        int[] keys = {25, 37, 18, 55, 22, 35};

        for (int key : keys) {
            int index = key % hashTable.length; // hash function
            hashTable[index] = key;
        }

        // Display hash table
        System.out.println("Hash Table:");
        for (int i = 0; i < hashTable.length; i++) {
            System.out.println(i + " --> " + hashTable[i]);
        }
    }
}
