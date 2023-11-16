class Book {
    private String author; // Приватное поле для хранения имени автора книги
    private String title; // Приватное поле для хранения названия книги
    private int year; // Приватное поле для хранения года выпуска книги

    public Book(String author, String title, int year) {
        this.author = author; // Устанавливаем переданное имя автора в поле author
        this.title = title; // Устанавливаем переданное название книги в поле title
        this.year = year; // Устанавливаем переданный год выпуска книги в поле year
    }

    // Метод для получения имени автора книги
    public String getAuthor() {
        return author;
    }

    // Метод для установки нового имени автора книги
    public void setAuthor(String author) {
        this.author = author;
    }

    // Метод для получения названия книги
    public String getTitle() {
        return title;
    }

    // Метод для установки нового названия книги
    public void setTitle(String title) {
        this.title = title;
    }

    // Метод для получения года выпуска книги
    public int getYear() {
        return year;
    }

    // Метод для установки нового года выпуска книги
    public void setYear(int year) {
        this.year = year;
    }
}