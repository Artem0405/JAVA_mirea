import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LabClass {
    // Определение класса LabClass

    private List<Student> students;
    // Определение приватного списка students для хранения студентов

    public LabClass() {
        students = new ArrayList<>();
        // Конструктор класса LabClass, инициализирует список students как пустой ArrayList
    }

    public void addStudent(Student student) {
        students.add(student);
        // Метод addStudent(), добавляющий студента в список students
    }

    public List<Student> getStudents() {
        return students;
        // Метод getStudents(), возвращающий список students
    }

    public void sortStudentsByAverageScore() {
        Collections.sort(students, Comparator.comparingDouble(Student::getAverageScore));
        // Метод sortStudentsByAverageScore(), сортирующий студентов в списке по среднему баллу
        // Используется метод sort() из класса Collections для сортировки на основе функции,
        // указанной в Comparator.comparingDouble, которая сравнивает средний балл студентов
    }

    public Student findStudentByName(String name) throws StudentNotFoundException {
        // Метод findStudentByName(), ищущий студента по имени
        for (Student student : students) {
            // Для каждого студента в списке students
            if (student.getName().equals(name)) {
                // Если имя студента совпадает с указанным именем
                return student;
                // Возвращаем найденного студента
            }
        }
        throw new StudentNotFoundException("Student not found: " + name);
        // Если студент с указанным именем не найден, выбрасываем исключение StudentNotFoundException
    }
}
