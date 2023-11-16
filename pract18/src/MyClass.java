import java.io.Serializable;

class Animal implements Serializable { }
// Класс Animal представляет животное и реализует интерфейс Serializable

// Обобщенный класс с тремя параметрами T, V, K
class MyClass<T extends Comparable<T>, V extends Animal & Serializable, K> {

    private T value1;
    private V value2;
    private K value3;
    // Объявление приватных переменных value1, value2, value3 типов T, V, K соответственно

    // Конструктор, принимающий на вход значения типов T, V, K
    public MyClass(T value1, V value2, K value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }
    // Конструктор класса MyClass, присваивающий значения переменным value1, value2, value3

    // Методы возвращают значения трех переменных
    public T getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }

    public K getValue3() {
        return value3;
    }

    // Метод выводит имена классов для трех переменных класса
    public void printClassNames() {
        System.out.println("Тип T: " + value1.getClass().getName());
        System.out.println("Тип V: " + value2.getClass().getName());
        System.out.println("Тип K: " + value3.getClass().getName());
    }
    // Метод printClassNames() выводит имена классов типов T, V, K с помощью метода getClass().getName()
}