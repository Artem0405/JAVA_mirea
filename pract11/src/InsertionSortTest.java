import java.util.Arrays; // Импортирование класса массивов из стандартной библиотеки Java

public class InsertionSortTest { // Объявление класса InsertionSortTest

    public static void main(String[] args) { // Основной метод программы
        // Создание массива объектов класса Student
        Student[] students = { // Инициализация массива объектов класса Student
                new Student(3, 4.5), // Создание объекта Student с параметрам номера и среднего балла
                new Student(1, 3.7), // Аналогично
                new Student(2, 4.2), // Аналогично
                new Student(4, 3.9), // Аналогично
                new Student(5, 4.1) // Аналогично
        };

        // Сортировка массива по iDNumber с использованием сортировки вставками
        for (int i = 1; i < students.length; i++) { // Цикл для прохода по всем элементам массива, начиная со второго
            Student currentStudent = students[i]; // Сохранение текущего студента
            int j = i - 1; // Инициализация переменной j как индекса предыдущего студента
            while (j >= 0 && students[j].getiDNumber() > currentStudent.getiDNumber()) { // Цикл для смещения элементов вправо, пока не будет найдено место для вставки текущего студента
                students[j + 1] = students[j]; // Смещение элемента вправо
                j--; // Уменьшение индекса
            }
            students[j + 1] = currentStudent; // Вставка текущего студента на найденное место
        }

        // Вывод отсортированного массива
        System.out.println(Arrays.toString(students)); // Вывод отсортированного массива students в виде строки
    }
}
