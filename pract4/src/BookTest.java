public class BookTest {
    public static void main(String[] args) {
        // Создаем экземпляр класса Book с заданными параметрами
        Book book = new Book("John Doe", "The Great Book", 2022);

        // Выводим информацию о книге
        System.out.println("Автор: " + book.getAuthor()); // Выводим информацию об авторе книги
        System.out.println("Название: " + book.getTitle()); // Выводим информацию о названии книги
        System.out.println("Год выпуска: " + book.getYear()); // Выводим информацию о годе выпуска книги

        // Обновляем информацию о книге
        book.setAuthor("Jane Smith"); // Обновляем автора книги
        book.setTitle("The Wonderful Book"); // Обновляем название книги
        book.setYear(2023); // Обновляем год выпуска книги

        // Выводим обновленную информацию
        System.out.println("Обновленный автор: " + book.getAuthor()); // Выводим обновленную информацию об авторе книги
        System.out.println("Обновленное название: " + book.getTitle()); // Выводим обновленную информацию о названии книги
        System.out.println("Обновленный год выпуска: " + book.getYear()); // Выводим обновленную информацию о годе выпуска книги
    }
}
