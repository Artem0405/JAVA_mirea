package z2;



// Определение класса Node для связанного списка
class Node<E> {
    E data;
    Node<E> next;

    public Node(E data) {
        this.data = data;
        this.next = null;
    }
}



// Класс AbstractQueue


