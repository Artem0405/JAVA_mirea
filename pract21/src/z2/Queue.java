package z2;

// Класс-интерфейс Queue
interface Queue<E> {
    void enqueue(E element);  // добавить элемент в очередь
    E element();  // получить первый элемент в очереди
    E dequeue();  // удалить и вернуть первый элемент в очереди
    int size();  // получить текущий размер очереди
    boolean isEmpty();  // проверить, является ли очередь пустой
    void clear();  // удалить все элементы из очереди
}