

import java.util.LinkedHashMap;
import java.util.Map;


public class LRUCacheSimple<K, V> extends LinkedHashMap<K, V> {

    private final int capacity;

    public LRUCacheSimple(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

   
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
    
    @Override
    public String toString() {
        return "LRUCacheSimple: " + super.toString();
    }
}
