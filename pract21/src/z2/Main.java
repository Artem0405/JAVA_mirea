package z2;

// Пример использования класса LinkedQueue
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedQueue<>();

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

