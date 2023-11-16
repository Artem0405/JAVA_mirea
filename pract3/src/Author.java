public class Author {
    private String name; // Приватное поле для хранения имени автора
    private String email; // Приватное поле для хранения электронной почты автора
    private char gender; // Приватное поле для хранения пола автора

    // Конструктор класса, который принимает имя, электронную почту и пол автора
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;

        // Проверяем, что пол автора равен 'M' или 'F' и присваиваем его приватному полю,
        // в противном случае выбрасываем исключение
        if(gender == 'M' || gender == 'F')
            this.gender = gender;
        else
            throw new IllegalArgumentException("Гендерное несоответствие"); // Выбрасываем исключение с сообщением "Гендерное несоответствие" при неверном поле
    }

    // Метод для получения имени автора
    public String getName() {
        return name;
    }

    // Метод для получения электронной почты автора
    public String getEmail() {
        return email;
    }

    // Метод для установки новой электронной почты автора
    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String email) {
        this.name = name;
    }

    // Метод для получения пола автора
    public char getGender() {
        return gender;
    }

    // Переопределение метода toString() для возвращения строкового представления объекта Author
    @Override
    public String toString() {
        // Определяем строковую переменную genderString, в которой будет храниться строковое представление пола автора
        String genderString = (gender == 'M') ? "Male" : "Female";
        return "Author[name=" + name + ", email=" + email + ", gender=" + genderString + "]";
    }

    // Метод для установки нового значения пола автора
    public void setGender(char gender) {
        // Проверяем, что пол автора равен 'M' или 'F' и присваиваем его приватному полю,
        // в противном случае выбрасываем исключение
        if(gender == 'M' || gender == 'F')
            this.gender = gender;
        else
            throw new IllegalArgumentException("Гендерное несоответствие"); // Выбрасываем исключение с сообщением "Гендерное несоответствие" при неверном поле
    }
}
