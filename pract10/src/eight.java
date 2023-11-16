public class eight {
    // Метод для проверки строки на палиндром
    public static String isPalindrome(String word) {
        word = word.toLowerCase(); // Приводим строку к нижнему регистру
        int left = 0; // Указатель на начало строки
        int right = word.length() - 1; // Указатель на конец строки

        while (left < right) { // Пока указатели не пересекутся
            if (word.charAt(left) != word.charAt(right)) { // Если символы на позиции left и right не совпадают
                return "NO"; // Возвращаем "NO", так как это не палиндром
            }
            left++; // Увеличиваем указатель на начало строки
            right--; // Уменьшаем указатель на конец строки
        }

        return "YES"; // Если все символы совпали, возвращаем "YES", так как это палиндром
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("yey")); // Вызываем функцию isPalindrome и выводим результат
    }
}
