package z2;

abstract class AbstractQueue<E> implements Queue<E> {
    protected int size;

    public AbstractQueue() {
        size = 0;
    }

    public abstract void enqueue(E element);

    public abstract E element();

    public abstract E dequeue();

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        while (!isEmpty()) {
            dequeue();
        }
    }
}