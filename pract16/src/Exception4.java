import java.util.Scanner;

public class Exception4 {
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
        } finally {
            System.out.println("Program execution completed."); // Блок finally - всегда выполняется в не зависимости от того,
            // было ли выброшено исключение или нет, в данном случае выводится сообщение "Program execution completed."
        }
    }

    public static void main(String[] args) {
        Exception4 exceptionObj = new Exception4(); // Создание объекта класса Exception4
        exceptionObj.exceptionDemo(); // Вызов метода exceptionDemo() для демонстрации обработки исключений
    }
}
