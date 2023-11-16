public class MVCPatternDemo {
    public static void main(String[] args) {
        // Получаем студента из базы данных
        Student student = retrieveStudentFromDatabase(); // Получение студента из базы данных

        // Создаем объекты для каждого компонента
        StudentView studentView = new StudentView(); // Создание объекта представления студента
        StudentController studentController = new StudentController(student, studentView); // Создание объекта контроллера студента

        // Обновляем представление с информацией о студенте
        studentController.updateView(); // Обновление представления с информацией о студенте

        // Обновляем модель данных студента
        studentController.setStudentName("John"); // Установка имени студента в модель
        studentController.setStudentRollNo("12345"); // Установка номера студенческого билета в модель

        // Обновляем представление после изменения данных
        studentController.updateView(); // Обновление представления после изменения данных
    }

    public static Student retrieveStudentFromDatabase() {
        // Здесь должна быть логика для получения студента из базы данных.
        // В этом примере просто создадим нового студента и вернем его.
        Student student = new Student(); // Создание нового объекта студента
        student.setName("Alice"); // Установка имени студента
        student.setRollNo("98765"); // Установка номера студенческого билета студента
        return student; // Возврат объекта студента
    }
}
