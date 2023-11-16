public class Book {  
    private String title; // Название книги
    private String author; // Автор книги
    
    // Конструктор класса "Книга" для инициализации названия и автора книги
    public Book(String title, String author) {     
        this.title = title;
        this.author = author;
    }
    
    // Метод для установки названия книги
    public void setTitle(String title){
        this.title = title;
    }      
        
    // Метод для установки автора книги
    public void setAuthor(String author){        
        this.author = author;
    }
    
    // Метод для получения названия книги
    public String getTitle(){      
        return title;
    }
    
    // Метод для получения автора книги
    public String getAuthor(){        
        return author;
    }
       
    // Переопределенный метод toString() для возврата строкового представления объекта "Книга"
    public String toString(){        
        return "Book [title=" + title + ", author=" + author + "]";
    }
}
