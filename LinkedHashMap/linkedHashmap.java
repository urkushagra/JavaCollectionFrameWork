import java.util.*;

class LinkedHashMapCustom<K, V> {

    // Node structure
    private class Node {
        K key;
        V value;
        Node prev, next;
        
        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private HashMap<K, Node> map;
    private Node head, tail;

    public LinkedHashMapCustom() {
        map = new HashMap<>();
        head = null;
        tail = null;
    }

    // Insert key-value
    public void put(K key, V value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value; // update value
            return;
        }

        Node newNode = new Node(key, value);
        map.put(key, newNode);

        // Insert into linked list
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Get value by key
    public V get(K key) {
        Node node = map.get(key);
        return node != null ? node.value : null;
    }

    // Remove by key
    public void remove(K key) {
        Node node = map.get(key);
        if (node == null) return;

        map.remove(key);

        if (node.prev != null)
            node.prev.next = node.next;
        else
            head = node.next;

        if (node.next != null)
            node.next.prev = node.prev;
        else
            tail = node.prev;
    }

    // Display all key-value pairs in insertion order
    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.key + "=" + curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    
    // Check if key exists
    public boolean containsKey(K key) {
        return map.containsKey(key);
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedHashMapCustom<Integer, String> lhm = new LinkedHashMapCustom<>();

        lhm.put(1, "A");
        lhm.put(2, "B");
        lhm.put(3, "C");

        System.out.println("Initial order:");
        lhm.display();

        lhm.put(2, "Z");
        System.out.println("After updating key 2:");
        lhm.display();

        lhm.remove(1);
        System.out.println("After removing key 1:");
        lhm.display();

        System.out.println("Value for key 3: " + lhm.get(3));
    }
}