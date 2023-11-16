public class ten {
    public static int reverseNumber(int n) {
        return reverseNumber(n, 0); // Вызываем вспомогательную функцию reverseNumber с параметрами n и 0
    }

    public static int reverseNumber(int n, int reversed) {
        if (n == 0) {
            return reversed; // Если n равно 0, возвращаем переменную reversed
        }

        int digit = n % 10; // Получаем остаток от деления числа n на 10, чтобы получить последнюю цифру
        reversed = reversed * 10 + digit; // Умножаем reversed на 10 и добавляем последнюю цифру digit
        return reverseNumber(n / 10, reversed); // Рекурсивно вызываем функцию reverseNumber с числом, в котором удаляем последнюю цифру, и обновленным значением reversed
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(256)); // Вызываем функцию reverseNumber и выводим результат
    }
}
