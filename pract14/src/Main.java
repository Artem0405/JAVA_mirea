import java.util.ArrayList;
import java.util.List;

// Определяем интерфейс IWaitList с параметром типа E
interface IWaitList<E> {
    // Метод для добавления элемента в список
    void add(E element);

    // Метод для удаления элемента из списка
    boolean remove(E element);

    // Метод для проверки наличия элемента в списке
    boolean contains(E element);

    // Метод для проверки наличия списка элементов в списке
    boolean containsAll(List<E> elements);

    // Метод для проверки списка на пустоту
    boolean isEmpty();
}

// Класс, реализующий интерфейс IWaitList с параметром типа E
class WaitList<E> implements IWaitList<E> {
    // Поле для хранения списка элементов
    protected List<E> content;

    // Конструктор по умолчанию, создает пустой список
    public WaitList() {
        content = new ArrayList<>();
    }

    // Конструктор, принимающий список элементов и инициализирующий поле content этим списком
    public WaitList(List<E> content) {
        this.content = content;
    }

    // Метод для добавления элемента в список
    @Override
    public void add(E element) {
        content.add(element);
    }

    // Метод для удаления элемента из списка
    @Override
    public boolean remove(E element) {
        return content.remove(element);
    }

    // Метод для проверки наличия элемента в списке
    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    // Метод для проверки наличия списка элементов в списке
    @Override
    public boolean containsAll(List<E> elements) {
        return content.containsAll(elements);
    }

    // Метод для проверки списка на пустоту
    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}

class BoundedWaitList<E> extends WaitList<E> {
    // Поле для хранения вместимости ограниченного списка
    private int capacity;

    // Конструктор, принимающий вместимость и создающий пустой список
    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    // Конструктор, принимающий вместимость и список элементов, и инициализирующий поле content и capacity
    public BoundedWaitList(int capacity, List<E> content) {
        super(content);
        this.capacity = capacity;
    }

    // Метод для получения вместимости ограниченного списка
    public int getCapacity() {
        return capacity;
    }

    // Переопределение метода add из класса-родителя WaitList
    @Override
    public void add(E element) {
        // Проверка, что размер списка не превышает вместимость
        if (content.size() < capacity) {
            super.add(element);
        } else {
            // Вывод сообщения, если список полон и невозможно добавить элемент
            System.out.println("The waitlist is full. Unable to add element.");
        }
    }
}

class UnfairWaitList<E> extends WaitList<E> {
    // Конструктор по умолчанию, создает пустой список
    public UnfairWaitList() {
        super();
    }

    // Переопределение метода remove из класса-родителя WaitList
    public boolean remove(E element) {
        // Удаление элемента из списка
        content.remove(element);
        // Всегда возвращается значение false
        return false;
    }

    // Метод для перемещения элемента в конец списка
    public void moveToBack(E element) {
        // Проверка, что элемент присутствует в списке
        if (content.contains(element)) {
            // Удаление элемента из списка
            content.remove(element);
            // Добавление элемента в конец списка
            content.add(element);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Пример использования классов WaitList, BoundedWaitList и UnfairWaitList

        // Создание экземпляра WaitList и добавление элементов
        WaitList<Integer> waitList = new WaitList<>();
        waitList.add(1);
        waitList.add(2);
        waitList.add(3);

        // Проверка наличия элемента в списке
        System.out.println(waitList.contains(2)); // Вывод: true

        // Проверка наличия списка элементов в списке
        System.out.println(waitList.containsAll(List.of(2, 3))); // Вывод: true

        // Создание экземпляра BoundedWaitList с ограничением на вместимость и добавление элементов
        BoundedWaitList<String> boundedWaitList = new BoundedWaitList<>(2);
        boundedWaitList.add("a");
        boundedWaitList.add("b");
        boundedWaitList.add("c"); // Вывод: The waitlist is full. Unable to add element.

        // Создание экземпляра UnfairWaitList и добавление/удаление элементов
        UnfairWaitList<Character> unfairWaitList = new UnfairWaitList<>();
        unfairWaitList.add('X');
        unfairWaitList.add('Y');
        unfairWaitList.add('Z');
        unfairWaitList.remove('Y');
        unfairWaitList.moveToBack('X');

        // Проверка наличия элементов в списке после добавления/удаления
        System.out.println(unfairWaitList.contains('Y')); // Вывод: false
        System.out.println(unfairWaitList.contains('X')); // Вывод: true
        System.out.println(unfairWaitList.contains('Z')); // Вывод: true
    }
}

