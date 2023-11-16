package z2;

import java.util.NoSuchElementException;

// Реализация класса LinkedQueue
class LinkedQueue<E> implements Queue<E> {
    private int size;
    private Node<E> front;
    private Node<E> rear;

    public LinkedQueue() {
        size = 0;
        front = null;
        rear = null;
    }

    public void enqueue(E element) {
        Node<E> newNode = new Node<>(element);

        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }

        rear = newNode;
        size++;
    }

    public E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return front.data;
    }

    public E dequeue() {
        E removedElement = element();
        front = front.next;
        size--;

        if (isEmpty()) {
            rear = null;
        }

        return removedElement;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }
}