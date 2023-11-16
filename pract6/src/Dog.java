abstract class Dog {
    private String breed; // Закрытое поле для хранения породы собаки
    private int age; // Закрытое поле для хранения возраста собаки

    public Dog(String breed, int age) {
        this.breed = breed; // Устанавливаем переданную породу в поле breed
        this.age = age; // Устанавливаем переданный возраст в поле age
    }

    public String getBreed() {
        return breed; // Возвращаем породу собаки
    }

    public int getAge() {
        return age; // Возвращаем возраст собаки
    }
}

class LabradorRetriever extends Dog {
    public LabradorRetriever(int age) {
        super("Лабрадор Ретривер", age); // Вызываем конструктор суперкласса Dog, передавая породу и возраст
    }
}

class GermanShepherd extends Dog {
    public GermanShepherd(int age) {
        super("Немецкая овчарка", age); // Вызываем конструктор суперкласса Dog, передавая породу и возраст
    }
}

