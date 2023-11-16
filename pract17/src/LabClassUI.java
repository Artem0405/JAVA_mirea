import java.util.Scanner;
import java.util.List;

public class LabClassUI {
    // Определение класса LabClassUI

    private LabClass labClass;
    // Определение приватного поля labClass типа LabClass

    public LabClassUI() {
        labClass = new LabClass();
        // Конструктор класса LabClassUI, создающий объект labClass типа LabClass
    }

    public void run() {
        // Метод run(), запускающий пользовательский интерфейс
        Scanner scanner = new Scanner(System.in);
        // Создание объекта scanner типа Scanner для чтения ввода пользователя

        while (true) {
            // Бесконечный цикл
            System.out.println("1. Add student");
            System.out.println("2. Sort students by average score");
            System.out.println("3. Find student by name");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    sortStudentsByAverageScore();
                    break;
                case 3:
                    findStudentByName(scanner);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    private void addStudent(Scanner scanner) {
        // Метод addStudent(), добавляющий студента
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        // Ввод имени студента

        System.out.print("Enter average score: ");
        double averageScore = scanner.nextDouble();
        scanner.nextLine();
        // Ввод среднего балла студента

        Student student = new Student(name, averageScore);
        // Создание объекта student типа Student с указанными именем и средним баллом
        labClass.addStudent(student);
        // Добавление студента в объект labClass типа LabClass

        System.out.println("Student added successfully");
        // Вывод сообщения об успешном добавлении студента
    }

    private void sortStudentsByAverageScore() {
        // Метод sortStudentsByAverageScore(), сортирующий студентов по среднему баллу
        labClass.sortStudentsByAverageScore();
        // Вызов метода sortStudentsByAverageScore() объекта labClass типа LabClass для сортировки студентов
        System.out.println("Students sorted by average score");
        // Вывод сообщения о сортировке студентов по среднему баллу
        printStudents();
        // Вывод всех студентов
    }

    private void findStudentByName(Scanner scanner) {
        // Метод findStudentByName(), ищущий студента по имени
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        // Ввод имени студента для поиска

        try {
            Student student = labClass.findStudentByName(name);
            // Попытка найти студента по указанному имени в объекте labClass типа LabClass
            System.out.println("Student found:");
            System.out.println("Name: " + student.getName());
            System.out.println("Average Score: " + student.getAverageScore());
            // Вывод информации о найденном студенте (имя и средний балл)
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
            // Если студент с указанным именем не найден, выводится сообщение об ошибке
        }
    }

    private void printStudents() {
        // Метод printStudents(), выводящий информацию о всех студентах
        List<Student> students = labClass.getStudents();
        // Получение списка студентов из объекта labClass типа LabClass
        for (Student student : students) {
            // Для каждого студента в списке студентов
            System.out.println("Name: " + student.getName());
            System.out.println("Average Score: " + student.getAverageScore());
            System.out.println();
            // Вывод информации о студенте (имя и средний балл)
        }
    }
}
