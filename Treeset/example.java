import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(5);
        set.add(20);
        set.add(15);

        System.out.println("TreeSet: " + set); // Output: [5, 10, 15, 20]
        System.out.println("First Element: " + set.first()); // 5
        System.out.println("Last Element: " + set.last());   // 20
        System.out.println("Ceiling of 12: " + set.ceiling(12)); // 15
        System.out.println("Floor of 12: " + set.floor(12));     // 10

        set.remove(10);
        System.out.println("After Removing 10: " + set); // [5, 15, 20]
    }
}
