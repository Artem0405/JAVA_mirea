// Класс Калькулятор с обобщенными статическими методами
class Calculator {
    // Метод для сложения двух чисел разного типа
    public static <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    // Метод для умножения двух чисел разного типа
    public static <T extends Number> double multiply(T num1, T num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    // Метод для деления двух чисел разного типа
    public static <T extends Number> double divide(T num1, T num2) {
        return num1.doubleValue() / num2.doubleValue();
    }

    // Метод для вычитания двух чисел разного типа
    public static <T extends Number> double subtract(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }
}