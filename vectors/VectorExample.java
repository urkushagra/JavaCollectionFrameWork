import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector of Integer type
        Vector<Integer> numbers = new Vector<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Displaying elements
        System.out.println("Vector elements: " + numbers);

        // Accessing element at index
        System.out.println("Element at index 2: " + numbers.get(2));

        // Inserting element at specific position
        numbers.add(2, 25);
        System.out.println("After inserting 25 at index 2: " + numbers);

        // Removing element
        numbers.remove(1);
        System.out.println("After removing element at index 1: " + numbers);

        // Checking size and capacity
        System.out.println("Size: " + numbers.size());
        System.out.println("Capacity: " + numbers.capacity());

        // Checking if Vector contains an element
        System.out.println("Contains 30? " + numbers.contains(30));

        // Iterating using for-each loop
        System.out.print("Iterating elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
