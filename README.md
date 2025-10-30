# ☕💥 Java Collection Framework — "The Avengers of Data Structures!" 🦸‍♂️🦸‍♀️

Welcome to the **Java Collection Framework (JCF)** — where your boring arrays retire early and your data gets a social life! 🎉  

> 🗣️ “Because why use a plain array when you can have an entire **data structure universe** with sorting, searching, and attitude built-in?”

---

## 🎬 Meet the Squad

Think of the Java Collection Framework like the **Avengers Team** of Java:

| Hero | Class/Interface | Real-Life Analogy | Superpower |
|------|------------------|------------------|-------------|
| 🧺 `ArrayList` | The flexible grocery bag | Expands when you buy more chips 🍟 | Dynamic resizing |
| 🧶 `LinkedList` | A train of connected compartments 🚃 | Easy to add/remove coaches | Fast insert/delete |
| 🚫 `HashSet` | The guest list bouncer | “No duplicates allowed, bro.” 🪩 | Unique elements |
| 🌳 `TreeSet` | A neat librarian 📚 | Keeps everything sorted alphabetically | Sorted & Unique |
| 🗺️ `HashMap` | Your digital contacts app 📞 | Stores Name → Number pairs | Key-Value magic |
| ⏫ `PriorityQueue` | Hospital emergency queue 🚑 | Who’s got highest priority goes first | Automatic ordering |
| 🪜 `Stack` | Plate rack 🍽️ | Last plate in = first plate out | LIFO |
| 🧃 `Queue` | People at Starbucks ☕ | First come, first served | FIFO |

---

## ⚙️ Mini Demo (Because Code Speaks Louder than Words)

```java
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        List<String> groceries = new ArrayList<>(Arrays.asList("Milk", "Bread", "Eggs"));
        groceries.add("Butter");
        groceries.remove("Bread");
        System.out.println("🛒 Groceries: " + groceries);

        Set<String> guests = new HashSet<>(Arrays.asList("Alice", "Bob", "Alice"));
        System.out.println("🎟️ Party Guest List (No Duplicates!): " + guests);

        Map<Integer, String> phoneBook = new HashMap<>();
        phoneBook.put(101, "Kushagra");
        phoneBook.put(102, "Ananya");
        System.out.println("📞 Phone Book: " + phoneBook);
    }
}
