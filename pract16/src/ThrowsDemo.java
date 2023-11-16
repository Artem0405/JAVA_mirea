import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() throws Exception {
        // Определение метода getKey(), который выбрасывает исключение Exception
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        // Считываем введенный пользователем ключ
        printDetails(key);
        // Вызываем метод printDetails() с переданным ключом
    }

    public void printDetails(String key) throws Exception {
        // Определение метода printDetails(), который выбрасывает исключение Exception
        try {
            String message = getDetails(key);
            // Вызываем метод getDetails() с переданным ключом и присваиваем результат переменной message
            System.out.println(message);
            // Выводим сообщение на консоль
        } catch (Exception e) {
            // Обработка исключения Exception
            throw e;
            // Перебрасываем исключение наверх для дальнейшей обработки
        }
    }

    private String getDetails(String key) throws Exception {
        // Определение приватного метода getDetails(), который выбрасывает исключение Exception
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
            // Если ключ равен пустой строке, выбрасываем исключение Exception с сообщением "Key set to empty string"
        }
        return "data for " + key;
        // Возвращаем строку "data for " + key
    }

    public static void main(String[] args) {
        ThrowsDemo demoObj = new ThrowsDemo();
        // Создаем объект класса ThrowsDemo
        try {
            demoObj.getKey();
            // Вызываем метод getKey() с обработкой исключения Exception
        } catch (Exception e) {
            // Обработка исключения Exception
            System.out.println("Exception caught: " + e.getMessage());
            // Выводим сообщение об ошибке с сообщением исключения на консоль
        }
    }
}
