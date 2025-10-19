# Java Collection Framework: Collection Interface and Algorithms

## Overview

The **Java Collection Framework (JCF)** provides a **standard architecture** to store and manipulate groups of objects. It includes **interfaces**, **classes**, and **algorithms** that are highly optimized and reusable.

This document focuses on:

1. **`Collection` Interface** – the root interface of the framework.
2. **Algorithms (`Collections` class)** – pre-defined operations for manipulating collections.

---

## 1. Collection Interface

### **Definition**

The **`Collection` interface** is the **root interface** of Java collections (except for `Map`) and represents a **group of objects**. All collection types like `List`, `Set`, and `Queue` extend this interface.

### **Hierarchy**

```
          Iterable
             |
         Collection
         /   |   \
      List   Set  Queue
```

### **Key Methods**

| Method | Description |
|--------|-------------|
| `add(E e)` | Adds an element |
| `addAll(Collection<? extends E> c)` | Adds all elements from another collection |
| `remove(Object o)` | Removes a specified element |
| `removeAll(Collection<?> c)` | Removes all elements present in another collection |
| `retainAll(Collection<?> c)` | Retains only elements present in another collection |
| `clear()` | Removes all elements |
| `contains(Object o)` | Checks if an element exists |
| `containsAll(Collection<?> c)` | Checks if all elements exist |
| `isEmpty()` | Checks if the collection is empty |
| `size()` | Returns the number of elements |
| `iterator()` | Returns an `Iterator` |
| `toArray()` | Converts collection to array |

### **Example**

```java
Collection<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Orange");

for(String fruit : fruits) {
    System.out.println(fruit);
}

fruits.remove("Banana");
System.out.println("After removal: " + fruits);
```

---

## 2. Algorithms in Java Collection Framework

### **Definition**

**Algorithms** in JCF are **predefined operations** provided by the **`Collections` utility class** (`java.util.Collections`) for **manipulating collections**, including sorting, searching, shuffling, reversing, etc.

### **Categories of Algorithms**

#### **Sorting**
- `sort(List<T> list)` – Natural order  
- `sort(List<T> list, Comparator<? super T> c)` – Custom order  

#### **Searching**
- `binarySearch(List<? extends Comparable<? super T>> list, T key)` – Search in sorted list  

#### **Modification**
- `reverse(List<?> list)` – Reverse elements  
- `shuffle(List<?> list)` – Random shuffle  
- `swap(List<?> list, int i, int j)` – Swap elements  
- `fill(List<? super T> list, T obj)` – Fill with a value  
- `copy(List<? super T> dest, List<? extends T> src)` – Copy from source  

#### **Utility**
- `max(Collection<? extends T> c)` – Maximum element  
- `min(Collection<? extends T> c)` – Minimum element  
- `frequency(Collection<?> c, Object o)` – Count occurrences  
- `disjoint(Collection<?> c1, Collection<?> c2)` – Check if collections have no elements in common  

### **Example**

```java
List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 7));

Collections.sort(numbers);
Collections.reverse(numbers);
Collections.shuffle(numbers);

System.out.println("Max: " + Collections.max(numbers));
System.out.println("Min: " + Collections.min(numbers));

numbers.add(5);
System.out.println("Frequency of 5: " + Collections.frequency(numbers, 5));

Collections.swap(numbers, 0, 2);
System.out.println("After swap: " + numbers);
```

---

## **Key Points**

- The **`Collection` interface** is the backbone of Java collections.  
- **`Collections` algorithms** provide ready-to-use, optimized methods for **sorting, searching, and manipulating collections**.  
- Using these algorithms improves **code efficiency**, **readability**, and **reusability**.  

---

This README serves as a **quick reference** for understanding the **Collection interface** and **algorithms in JCF**, making it useful for **learning, interview preparation, and development**.

