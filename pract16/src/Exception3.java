import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in); // Создание объекта Scanner для чтения ввода пользователя
        System.out.print("Enter an integer: "); // Вывод приглашения для ввода целого числа
        String intString = myScanner.next(); // Считывание введенного пользователем значения как строки

        try {
            int i = Integer.parseInt(intString); // Преобразование строки в целое число
            System.out.println(2 / i); // Деление 2 на полученное целое число
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer."); // Обработка исключения типа NumberFormatException,
            // вывод сообщения "Invalid input. Please enter an integer." при неверном вводе пользователем
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero"); // Обработка исключения типа ArithmeticException,
            // вывод сообщения "Attempted division by zero" при попытке деления на ноль
        } catch (Exception e) {
            System.out.println("An error occurred"); // Обработка исключения типа Exception,
            // вывод сообщения "An error occurred" при возникновении любой другой исключительной ситуации
        }
    }

    public static void main(String[] args) {
        Exception2 exceptionObj = new Exception2(); // Создание объекта класса Exception2
        exceptionObj.exceptionDemo(); // Вызов метода exceptionDemo() для демонстрации обработки исключений
    }
}
