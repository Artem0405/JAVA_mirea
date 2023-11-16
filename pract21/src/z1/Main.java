// Пример использования класса ArrayQueue
package z1;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayQueue<>();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        System.out.println("First element: " + queue.element());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Size of the queue: " + queue.size());
        System.out.println("Is the queue empty? " + queue.isEmpty());

        queue.clear();
        System.out.println("Is the queue empty after clearing? " + queue.isEmpty());
    }
}