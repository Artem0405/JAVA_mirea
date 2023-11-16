public class TestAuthor {
    public static void main(String[] args) {
        // Создание объекта "Author"
        Author author = new Author("John Doe", "johndoe@example.com", 'M');

        // Вывод информации об авторе с помощью метода toString()
        // Вывод имени автора
        System.out.println("Имя автора: " + author.getName());

        // Вывод электронной почты автора
        System.out.println("Электронная почта автора: " + author.getEmail());

        // Установка новой электронной почты автора
        author.setEmail("johndoe123@example.com");

        // Вывод обновленной информации об авторе
        // Вывод пола автора
        System.out.println("Пол автора: " + author.getGender());
    }
}
