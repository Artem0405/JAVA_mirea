import java.util.Arrays;

class SortingStudentsByGPA {
    public static void main(String[] args) {
        Student[] students = {
                new Student(3, 4.5),
                new Student(1, 3.7),
                new Student(2, 4.2),
                new Student(4, 3.9),
                new Student(5, 4.1)
        };

        quickSort(students, 0, students.length - 1);

        System.out.println(Arrays.toString(students));
    }

    // Метод быстрой сортировки массива студентов
    public static void quickSort(Student arr[], int left, int right) {
        // Проверка, что индекс левого конца меньше индекса правого конца
        if (left < right) {
            // Получение индекса опорного элемента
            int partitionIndex = partition(arr, left, right);
            // Рекурсивный вызов быстрой сортировки для левой и правой частей массива
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
    }

    // Метод разделения массива на части относительно опорного элемента
    public static int partition(Student arr[], int left, int right) {
        // Опорный элемент (pivot) выбирается как средний балл последнего элемента массива
        double pivot = arr[right].getGPA();
        int i = (left - 1);
        // Цикл прохода по подмассиву
        for (int j = left; j < right; j++) {
            // Если средний балл студента больше опорного, меняем их местами
            if (arr[j].getGPA() > pivot) {
                i++;
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Обмен опорного элемента с элементом, находящемся на позиции i+1
        Student temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1; // Возвращение индекса опорного элемента
    }
}
