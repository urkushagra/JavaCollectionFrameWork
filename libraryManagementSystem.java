import java.util.*;

/**
 * A simple Library Management System demonstrating the usage of
 * Java Collection Framework (List, Set, Map, Queue, Deque).
 */
public class LibraryManagementSystem {

    // Book class to represent each book
    static class Book {
        int id;
        String title;
        String author;

        public Book(int id, String title, String author) {
            this.id = id;
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    '}';
        }
    }

    // Collections
    private List<Book> bookList = new ArrayList<>(); // All books
    private Set<String> authors = new HashSet<>();   // Unique authors
    private Map<Integer, Book> bookMap = new HashMap<>(); // Book lookup by ID
    private Queue<Book> requestQueue = new LinkedList<>(); // Book request queue
    private Deque<Book> recentActivity = new ArrayDeque<>(); // Recent activity

    // Add a book
    public void addBook(Book book) {
        bookList.add(book);
        authors.add(book.author);
        bookMap.put(book.id, book);
        recentActivity.push(book);
    }

    // Search book by ID
    public Book searchBook(int id) {
        return bookMap.get(id);
    }

    // Sort books by title
    public void sortBooksByTitle() {
        bookList.sort(Comparator.comparing(b -> b.title));
    }

    // Display all books
    public void displayBooks() {
        System.out.println("\n📚 Library Books:");
        bookList.forEach(System.out::println);
    }

    // Display unique authors
    public void displayAuthors() {
        System.out.println("\n👨‍💻 Authors in Library:");
        authors.forEach(System.out::println);
    }

    // Request a book
    public void requestBook(Book book) {
        requestQueue.offer(book);
        System.out.println("\n✅ Book requested: " + book.title);
    }

    // Process next request
    public void processRequest() {
        Book book = requestQueue.poll();
        if (book != null) {
            System.out.println("\n📦 Processing request: " + book.title);
        } else {
            System.out.println("\n⚠️ No pending requests.");
        }
    }

    // Display recent activities
    public void showRecentActivity() {
        System.out.println("\n📌 Recent Activities (latest first):");
        recentActivity.forEach(System.out::println);
    }

    // Driver code
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        // Adding books
        library.addBook(new Book(1, "Java Programming", "James Gosling"));
        library.addBook(new Book(2, "Effective Java", "Joshua Bloch"));
        library.addBook(new Book(3, "Clean Code", "Robert C. Martin"));
        library.addBook(new Book(4, "Design Patterns", "Erich Gamma"));

        // Display
        library.displayBooks();
        library.displayAuthors();

        // Sort books
        library.sortBooksByTitle();
        System.out.println("\n📑 Books after sorting by title:");
        library.displayBooks();

        // Search book
        System.out.println("\n🔍 Searching for Book ID 3:");
        System.out.println(library.searchBook(3));

        // Book request queue
        library.requestBook(new Book(5, "Head First Java", "Kathy Sierra"));
        library.processRequest();

        // Show recent activity
        library.showRecentActivity();
    }
}
