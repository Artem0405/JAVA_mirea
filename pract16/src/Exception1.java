public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0); // Попытка деления на ноль, что приводит к исключительной ситуации
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero"); // Обработка исключения типа ArithmeticException,
            // вывод сообщения "Attempted division by zero" при обнаружении исключительной ситуации
        }
    }

    public static void main(String[] args) {
        Exception1 exceptionObj = new Exception1(); // Создание объекта класса Exception1
        exceptionObj.exceptionDemo(); // Вызов метода exceptionDemo() для демонстрации исключения
    }
}
