# TreeSet in Java

## Overview
`TreeSet` is a part of the `java.util` package in Java. It implements the **Set** interface and uses a **Red-Black tree** internally. `TreeSet` stores elements in **sorted order** and does **not allow duplicates**.

It is ideal for use cases where you need:
- Sorted unique elements
- Efficient search, insertion, and deletion (O(log n) time)
- Operations like `first()`, `last()`, `ceiling()`, and `floor()`

---

## Features
- **Sorted Order:** Automatically sorts elements in natural order or according to a custom comparator.
- **No Duplicates:** Ensures unique elements in the set.
- **Efficient Operations:** `add`, `remove`, `contains` are all O(log n).
- **Null Element:** Only one null element is allowed for natural ordering.

---

## Constructors
1. **Default Constructor**
```java
TreeSet<Integer> set = new TreeSet<>();
TreeSet<String> set = new TreeSet<>(Comparator.reverseOrder());
TreeSet<Integer> set = new TreeSet<>(List.of(5, 1, 3));
| Method               | Description                               |
| -------------------- | ----------------------------------------- |
| `add(E e)`           | Adds an element to the set.               |
| `remove(Object o)`   | Removes the specified element.            |
| `contains(Object o)` | Checks if an element exists.              |
| `first()`            | Returns the first (lowest) element.       |
| `last()`             | Returns the last (highest) element.       |
| `ceiling(E e)`       | Smallest element ≥ `e`.                   |
| `floor(E e)`         | Largest element ≤ `e`.                    |
| `pollFirst()`        | Removes and returns the first element.    |
| `pollLast()`         | Removes and returns the last element.     |
| `iterator()`         | Returns an iterator to traverse elements. |



