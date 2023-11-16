package z1;

import java.util.NoSuchElementException;

// Определение класса ArrayQueue
class ArrayQueue<E> implements Queue<E> {
    private int size;
    private int front;
    private int rear;
    private E[] elements;

    public ArrayQueue() {
        size = 0;
        front = 0;
        rear = 0;
        elements = (E[]) new Object[10];
    }

    public void enqueue(E element) {
        if (size == elements.length) {
            resizeArray();
        }
        elements[rear] = element;
        rear = (rear + 1) % elements.length;
        size++;
    }

    public E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return elements[front];
    }

    public E dequeue() {
        E removedElement = element();
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return removedElement;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = front; i != rear; i = (i + 1) % elements.length) {
            elements[i] = null;
        }
        front = 0;
        rear = 0;
        size = 0;
    }

    private void resizeArray() {
        E[] newArray = (E[]) new Object[elements.length * 2];
        int i = front;
        int newIndex = 0;
        while (i != rear) {
            newArray[newIndex] = elements[i];
            i = (i + 1) % elements.length;
            newIndex++;
        }
        elements = newArray;
        front = 0;
        rear = size;
    }
}


