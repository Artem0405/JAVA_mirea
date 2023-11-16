public class Author {
    private String name; // Имя автора
    private String email; // Электронная почта автора
    private char gender; // Пол автора

    // Конструктор класса "Author" для инициализации имени, электронной почты и пола автора
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Метод для получения имени автора
    public String getName() {
        return name;
    }

    // Метод для получения электронной почты автора
    public String getEmail() {
        return email;
    }

    // Метод для установки электронной почты автора
    public void setEmail(String email) {
        this.email = email;
    }

    // Метод для получения пола автора
    public char getGender() {
        return gender;
    }

    // Переопределенный метод toString() для возврата строкового представления объекта "Author"
    @Override
    public String toString() {
        return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
    }
}
