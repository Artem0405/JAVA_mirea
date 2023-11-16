public class Dog {
    private String name;    // Приватная переменная для хранения имени собаки
    private int age;        // Приватная переменная для хранения возраста собаки
    
    // Конструктор класса "Собака" для инициализации имени и возраста собаки
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Метод для установки имени собаки
    public void setName(String name) {
        this.name = name;
    }
       
    // Метод для установки возраста собаки
    public void setAge(int age) {
        this.age = age;
    }
    
    // Метод для получения имени собаки
    public String getName() {
        return name;
    }
       
    // Метод для получения возраста собаки
    public int getAge() {
        return age;
    }
       
    // Переопределенный метод toString() для возврата строкового представления объекта "Собака"
    @Override
    public String toString() {
        return "Dog [name=" + name + ", age=" + age + "]";
    }
}
