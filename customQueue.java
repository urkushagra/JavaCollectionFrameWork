package collections.custom;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A simple generic queue implementation using singly linked list.
 * 
 * @param <E> the type of elements in this queue
 */
public class CustomQueue<E> implements Iterable<E> {

    private Node<E> front;  // points to front of queue
    private Node<E> rear;   // points to rear of queue
    private int size;

    // Node class for linked list
    private static class Node<E> {
        E data;
        Node<E> next;
        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    // Enqueue element (add to rear)
    public void enqueue(E element) {
        Node<E> newNode = new Node<>(element);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Dequeue element (remove from front)
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty!");
        }
        E item = front.data;
        front = front.next;
        if (front == null) {
            rear = null; // queue became empty
        }
        size--;
        return item;
    }

    // Peek front element without removing
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty!");
        }
        return front.data;
    }

    // Get current size
    public int size() {
        return size;
    }

    // Check if empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Iterator implementation
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current = front;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                if (!hasNext()) throw new NoSuchElementException();
                E item = current.data;
                current = current.next;
                return item;
            }
        };
    }

    // For debugging
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> current = front;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) sb.append(", ");
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    // Example usage
    public static void main(String[] args) {
        CustomQueue<Integer> queue = new CustomQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Queue: " + queue);
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Queue after dequeue: " + queue);
    }
}