public class EmptyStringException extends Exception {
    // Определение нового класса EmptyStringException, который является подклассом класса Exception

    public EmptyStringException(String message) {
        super(message);
    }
    // Определение конструктора класса EmptyStringException, который принимает сообщение в качестве параметра
    // и передает его в конструктор суперкласса Exception с помощью ключевого слова super
}
