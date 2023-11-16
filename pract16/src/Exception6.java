public class Exception6 {
    public String getDetails(String key) throws NullPointerException {
        // Определение метода getDetails(), который выбрасывает исключение NullPointerException
        if (key.equals("null")) {
            throw new NullPointerException("null key in getDetails");
            // Если ключ равен "null", то выбрасывается исключение NullPointerException с сообщением "null key in getDetails"
        }
        return "Valid key";
        // Возвращает строку "Valid key", если ключ не равен "null"
    }

    public void printMessage(String key) {
        // Определение метода printMessage(), который не выбрасывает исключения
        try {
            String details = getDetails(key);
            // Вызываем метод getDetails() с переданным ключом и присваиваем результат переменной details
            System.out.println(details);
            // Выводим сообщение на консоль
        } catch (NullPointerException e) {
            // Обработка исключения NullPointerException
            System.out.println("Error: " + e.getMessage());
            // Выводим сообщение об ошибке на консоль, включая сообщение исключения
        }
    }

    public static void main(String[] args) {
        Exception6 exceptionObj = new Exception6();
        // Создаем объект класса Exception6
        exceptionObj.printMessage("null");
        // Вызываем метод printMessage() с переданным ключом "null"
    }
}
