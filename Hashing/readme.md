📌 What is Hashing?

Hashing is a technique to map data to a fixed-size value (hash code) using a hash function and store it in a hash table for efficient access. It allows constant-time (O(1)) average case operations like insertion, deletion, and search.

🏗️ Key Components

Hash Function → Converts key → index

Hash Table → Stores data at calculated index

Collisions → When two keys map to the same index

Collision Handling → Chaining, Linear Probing, Quadratic Probing, Double Hashing

⚡ Time Complexity Operation Average Case Worst Case Insert O(1) O(n) Search O(1) O(n) Delete O(1) O(n) ✅ Applications of Hashing

Implementing HashMap, HashSet

Frequency counting (count occurrences in O(n))

Detect duplicates in arrays/strings

Two Sum problem

Subarray problems (sum = k, zero-sum subarray)

Group Anagrams

Caching (LRU Cache)

Cryptography (SHA-256, MD5, etc.)
