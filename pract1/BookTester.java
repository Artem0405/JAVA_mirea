public class BookTester{   
    public static void main(String[] args){     
        Book book = new Book("Программирование на Java", "Иван Иванов"); // Создание объекта "Книга" с названием "Программирование на Java" и автором "Иван Иванов"
        
        // Вывод информации о книге с помощью метода toString()
        System.out.println("Название книги: " + book.getTitle()); // Вывод названия книги
        System.out.println("Автор книги: " + book.getAuthor()); // Вывод автора книги
        
        book.setTitle("Java для начинающих"); // Изменение названия книги
        book.setAuthor("Петр Петров"); // Изменение автора книги
        
        // Вывод обновленной информации о книге
        System.out.println("Название книги: " + book.getTitle()); // Вывод обновленного названия книги
        System.out.println("Автор книги: " + book.getAuthor()); // Вывод обновленного автора книги
    }
}