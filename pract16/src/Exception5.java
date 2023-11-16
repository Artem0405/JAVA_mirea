public class Exception5 {
    public void printMessage(String key) {
        try {
            String message = getDetails(key); // Вызываем метод getDetails() с переданным ключом и присваиваем результат переменной message
            System.out.println(message); // Выводим сообщение на консоль
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage()); // Обрабатываем исключение NullPointerException и выводим ошибку на консоль, включая сообщение об ошибке
        }
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails"); // Бросаем исключение NullPointerException с сообщением "null key in getDetails", если ключ равен null
        }
        return "data for " + key; // Возвращаем строку "data for " + key
    }

    public static void main(String[] args) {
        Exception5 exceptionObj = new Exception5(); // Создаем объект класса Exception5
        exceptionObj.printMessage(null); // Вызываем метод printMessage() с переданным ключом null
    }
}
