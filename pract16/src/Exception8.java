import java.util.Scanner;

public class Exception8 {
    public static void main(String[] args) {
        Exception8 exceptionObj = new Exception8();
        exceptionObj.getKey();
    }

    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean success = false;
        while (!success) {
            // Запускаем цикл, чтобы пользователь мог вводить ключ до тех пор, пока не будет успешно обработано
            try {
                System.out.print("Enter a key: ");
                // Вывод приглашения для ввода ключа
                String key = myScanner.next();
                // Считываем введенный пользователем ключ
                printKey(key);
                // Вызываем метод printKey() с переданным ключом
                success = true;
                // Устанавливаем флаг success в true, чтобы цикл завершился успешно
            } catch (Exception e) {
                // Обработка любых исключений, которые могут возникнуть в блоке try
                System.out.println("An error occurred. Please try again.");
                // Выводим сообщение об ошибке на консоль
            }
        }
    }

    public void printKey(String key) {
        System.out.println("Key: " + key);
        // Выводим сообщение с переданным ключом на консоль
    }
}
