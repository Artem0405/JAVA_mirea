// Определение двух интерфейсов - Nameable и Priceable
interface Nameable {
    String getName(); // Метод getName() для получения имени
}

interface Priceable {
    double getPrice(); // Метод getPrice() для получения цены

    String getName();
}

// Класс Planet, который реализует интерфейс Nameable
class Planet implements Nameable {
    private String name; // Приватное поле для хранения имени планеты

    // Конструктор класса Planet, принимающий имя планеты в качестве аргумента
    public Planet(String name) {
        this.name = name;
    }

    // Реализация метода getName() интерфейса Nameable
    public String getName() {
        return name; // Возвращаем имя планеты
    }
}

// Класс Car, который реализует интерфейс Nameable
class Car implements Nameable {
    private String name; // Приватное поле для хранения названия автомобиля

    // Конструктор класса Car, принимающий название автомобиля в качестве аргумента
    public Car(String name) {
        this.name = name;
    }

    // Реализация метода getName() интерфейса Nameable
    public String getName() {
        return name; // Возвращаем название автомобиля
    }
}

// Класс Animal, который реализует интерфейс Priceable и Nameable
class Animal implements Priceable, Nameable {
    private String species; // Приватное поле для хранения вида животного
    private double price; // Приватное поле для хранения цены животного

    // Конструктор класса Animal, принимающий вид и цену животного в качестве аргументов
    public Animal(String species, double price) {
        this.species = species;
        this.price = price;
    }

    // Реализация метода getPrice() интерфейса Priceable
    public double getPrice() {
        return price; // Возвращаем цену животного
    }

    // Реализация метода getName() интерфейса Nameable
    public String getName() {
        return species; // Возвращаем вид животного
    }
}

// Главный класс Main
public class Main {
    public static void main(String[] args) {
        // Создание объектов, использующих реализованные интерфейсы
        Nameable planet = new Planet("Земля"); // Создание объекта планеты
        Nameable car = new Car("Tesla"); // Создание объекта автомобиля
        Priceable animal = new Animal("Кошка", 100); // Создание объекта животного

        // Вывод информации об объектах
        System.out.println("Название планеты: " + planet.getName()); // Вывод имени планеты
        System.out.println("Название автомобиля: " + car.getName()); // Вывод названия автомобиля
        System.out.println("Животное: " + animal.getName() + ", стоймостью: $" + animal.getPrice()); // Вывод информации о животном
    }
}
