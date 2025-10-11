# 📚 Java Vector Example

This project demonstrates the use of the **Vector** class in the **Java Collection Framework**.  
A **Vector** is a **dynamic array** that can grow or shrink in size automatically and provides **thread-safe** operations.

---

## 🧠 Overview

- **Class:** `Vector<E>`
- **Package:** `java.util`
- **Implements:** `List`, `RandomAccess`, `Cloneable`, `Serializable`
- **Thread-Safe:** ✅ Yes (synchronized)
- **Introduced In:** JDK 1.0  
- **Type:** Legacy class (still supported in modern Java)

---

## ⚙️ Features of Vector

- Stores elements in a **dynamic array** (resizes automatically).
- **Maintains insertion order**.
- Allows **duplicate elements**.
- **Synchronized** methods (safe for multithreaded access).
- Can hold **heterogeneous objects** (not recommended in generics).

---

## 🧩 Common Constructors

| Constructor | Description |
|--------------|--------------|
| `Vector()` | Creates an empty vector with default capacity (10). |
| `Vector(int initialCapacity)` | Creates a vector with a given capacity. |
| `Vector(int initialCapacity, int capacityIncrement)` | Creates a vector with specified capacity and increment size. |
| `Vector(Collection c)` | Creates a vector containing all elements of a given collection. |

---

## 🧮 Commonly Used Methods

| Method | Description |
|---------|-------------|
| `add(E e)` | Adds an element to the end of the vector. |
| `add(int index, E element)` | Inserts an element at the specified position. |
| `get(int index)` | Returns the element at the given position. |
| `remove(int index)` | Removes the element at the given position. |
| `size()` | Returns the number of elements in the vector. |
| `capacity()` | Returns the current capacity of the vector. |
| `clear()` | Removes all elements. |
| `contains(Object o)` | Checks if the vector contains the element. |
| `isEmpty()` | Checks if the vector is empty. |

---

## 💻 Example Code

### `VectorExample.java`

```java
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> animals = new Vector<>();

        // Adding elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");

        // Adding at specific index
        animals.add(1, "Horse");

        // Accessing elements
        System.out.println("Element at index 2: " + animals.get(2));

        // Iterating through vector
        for (String a : animals) {
            System.out.println(a);
        }

        // Size and Capacity
        System.out.println("Size: " + animals.size());
        System.out.println("Capacity: " + animals.capacity());
    }
}
