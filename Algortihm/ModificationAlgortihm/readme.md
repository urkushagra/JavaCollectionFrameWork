# Modification Algorithms in Java Collection Framework

## Overview
Modification algorithms in the **Java Collection Framework (JCF)** are part of the `java.util.Collections` class — a utility class that provides static methods to perform various operations on collections like sorting, searching, modifying, and synchronizing.  
Modification algorithms specifically deal with **changing or rearranging** elements in collections such as `List`, `Set`, and `Map`.

---

## Key Modification Algorithms

### 1. `reverse(List<?> list)`
- **Description:** Reverses the order of elements in the specified list.
- **Example:**
  ```java
  List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
  Collections.reverse(list);
  System.out.println(list); // Output: [5, 4, 3, 2, 1]
  ```

---

### 2. `shuffle(List<?> list)`
- **Description:** Randomly permutes the elements in the list using a default source of randomness.
- **Example:**
  ```java
  List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
  Collections.shuffle(list);
  System.out.println(list); // Output: [2, 5, 1, 4, 3] (random each time)
  ```

- **Variation:**
  ```java
  Random random = new Random(10);
  Collections.shuffle(list, random);
  ```
  This uses a specific random seed to make shuffling predictable.

---

### 3. `swap(List<?> list, int i, int j)`
- **Description:** Swaps the elements at positions `i` and `j` in the list.
- **Example:**
  ```java
  List<String> list = Arrays.asList("A", "B", "C", "D");
  Collections.swap(list, 0, 2);
  System.out.println(list); // Output: [C, B, A, D]
  ```

---

### 4. `fill(List<? super T> list, T obj)`
- **Description:** Replaces all elements of the specified list with the specified element.
- **Example:**
  ```java
  List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
  Collections.fill(list, "Z");
  System.out.println(list); // Output: [Z, Z, Z]
  ```

---

### 5. `copy(List<? super T> dest, List<? extends T> src)`
- **Description:** Copies all elements from the source list to the destination list. The destination list must be of at least equal size.
- **Example:**
  ```java
  List<String> src = Arrays.asList("A", "B", "C");
  List<String> dest = Arrays.asList("X", "Y", "Z");
  Collections.copy(dest, src);
  System.out.println(dest); // Output: [A, B, C]
  ```

- **Important:** If the destination list is smaller, `IndexOutOfBoundsException` will occur.

---

### 6. `replaceAll(List<T> list, T oldVal, T newVal)`
- **Description:** Replaces all occurrences of one specified value in the list with another.
- **Example:**
  ```java
  List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 1, 3, 1));
  Collections.replaceAll(list, 1, 9);
  System.out.println(list); // Output: [9, 2, 9, 3, 9]
  ```

---

## Performance Considerations
| Operation | Time Complexity | Remarks |
|------------|----------------|----------|
| `reverse()` | O(n) | Linear time since it traverses the list once. |
| `shuffle()` | O(n) | Each element is moved randomly once. |
| `swap()` | O(1) | Only two elements are exchanged. |
| `fill()` | O(n) | Every element is replaced. |
| `copy()` | O(n) | Copies elements from one list to another. |
| `replaceAll()` | O(n) | Traverses the list and replaces matches. |

---

## Summary
| Method | Function | Mutates Original Collection |
|---------|-----------|-----------------------------|
| `reverse()` | Reverses order | ✅ |
| `shuffle()` | Randomizes order | ✅ |
| `swap()` | Swaps two elements | ✅ |
| `fill()` | Replaces all with one value | ✅ |
| `copy()` | Copies elements from another list | ✅ |
| `replaceAll()` | Replaces specific values | ✅ |

---

## Practical Use Cases
- **Data Randomization:** `shuffle()` can be used in games or random quizzes.
- **Testing Algorithms:** `reverse()` helps test algorithms on reversed datasets.
- **Resetting Data:** `fill()` can reset list values efficiently.
- **Updating Lists:** `replaceAll()` can be used for in-place updates of data.

---

## References
- [Java Documentation - Collections Class](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html)
