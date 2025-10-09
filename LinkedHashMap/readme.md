# 🧩 LinkedHashMap in Java

## 📖 Overview
`LinkedHashMap` is part of Java’s `java.util` package and extends `HashMap`.  
It maintains a **doubly-linked list** of entries to preserve the **insertion** or **access order** of elements, providing predictable iteration.

---

## ⚙️ Features
- Maintains **insertion** or **access** order.
- Provides **O(1)** time complexity for `get()` and `put()` operations.
- Allows **one null key** and **multiple null values**.
- Not thread-safe by default.
- Useful for **caching** (like LRU cache implementation).

---

## 🧱 Class Declaration
```java
public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>
```

---

## 🧠 Internal Working
`LinkedHashMap` uses:
- **Hash table** for storage (like `HashMap`)
- **Doubly-linked list** across entries for maintaining order

Each node keeps:
```java
Entry<K, V> before;
Entry<K, V> after;
```

---

## 🔧 Constructors
```java
LinkedHashMap()
LinkedHashMap(int initialCapacity)
LinkedHashMap(int initialCapacity, float loadFactor)
LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)
LinkedHashMap(Map<? extends K, ? extends V> m)
```

---

## 💡 Example Code

### 🧩 Basic Usage
```java
LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
map.put(101, "Alice");
map.put(102, "Bob");
map.put(103, "Charlie");

System.out.println(map);
```

**Output:**
```
{101=Alice, 102=Bob, 103=Charlie}
```

---

### 🔁 Access Order Example
```java
LinkedHashMap<Integer, String> map = new LinkedHashMap<>(5, 0.75f, true);
map.put(1, "A");
map.put(2, "B");
map.put(3, "C");
map.get(1);
System.out.println(map);
```

**Output:**
```
{2=B, 3=C, 1=A}
```

---

### 🧠 Implementing LRU Cache
```java
class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}
```

---

## 🚀 Use Cases
- **LRU Cache implementation**
- **Maintaining predictable iteration order**
- **Preserving insertion or access history**

---

## 🧾 References
- [Java Docs - LinkedHashMap](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html)
- [Oracle Tutorials](https://docs.oracle.com/javase/tutorial/collections/)
