import java.util.SortedMap;
import java.util.TreeMap;

public class ConsistentHashing {

    private static SortedMap<Integer, String> ring = new TreeMap<>();

    static {
        ring.put(10, "Node-A");
        ring.put(50, "Node-B");
        ring.put(100, "Node-C");
    }

    public static String getNode(String key) {
        int hash = key.hashCode();
        SortedMap<Integer, String> tail = ring.tailMap(hash);
        return tail.isEmpty() ? ring.get(ring.firstKey()) : tail.get(tail.firstKey());
    }

    public static void main(String[] args) {
        System.out.println(getNode("user123"));
        System.out.println(getNode("order456"));
    }
}
