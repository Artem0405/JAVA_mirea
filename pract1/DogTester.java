public class DogTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик", 3);  // Создание объекта "Собака" с именем "Барсик" и возрастом 3
        
        System.out.println(dog);  // Вывод информации о собаке с помощью метода toString()
        System.out.println("Имя собаки: " + dog.getName());  // Вывод имени собаки
        System.out.println("Возраст собаки: " + dog.getAge());  // Вывод возраста собаки
        
        dog.setName("Шарик");  // Изменение имени собаки
        dog.setAge(5);  // Изменение возраста собаки
        
        System.out.println(dog);  // Вывод обновленной информации о собаке
        System.out.println("Имя собаки: " + dog.getName());  // Вывод имени обновленной собаки
        System.out.println("Возраст собаки: " + dog.getAge());  // Вывод возраста обновленной собаки
    }
}
