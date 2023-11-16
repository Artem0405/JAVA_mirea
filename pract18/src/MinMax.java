// Обобщенный класс для поиска минимального и максимального элементов массива
class MinMax<T extends Comparable<T>> {
    private T[] array;
    // Объявление приватной переменной array типа T[]

    // Конструктор, принимающий массив
    public MinMax(T[] array) {
        this.array = array;
    }
    // Конструктор класса MinMax, присваивающий значение массива переменной array

    // Метод возвращает минимальный элемент массива
    public T getMin() {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }
        // Если длина массива равна 0, выбрасывается исключение IllegalArgumentException

        T min = array[0];
        // Инициализация переменной min первым элементом массива
        for (T element : array) {
            // Для каждого элемента в массиве
            if (element.compareTo(min) < 0) {
                // Если текущий элемент меньше минимального
                min = element;
                // Обновляем значение минимального элемента
            }
        }
        return min;
        // Возвращаем минимальный элемент
    }

    // Метод возвращает максимальный элемент массива
    public T getMax() {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }
        // Если длина массива равна 0, выбрасывается исключение IllegalArgumentException

        T max = array[0];
        // Инициализация переменной max первым элементом массива
        for (T element : array) {
            // Для каждого элемента в массиве
            if (element.compareTo(max) > 0) {
                // Если текущий элемент больше максимального
                max = element;
                // Обновляем значение максимального элемента
            }
        }
        return max;
        // Возвращаем максимальный элемент
    }
}
