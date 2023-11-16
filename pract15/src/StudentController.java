public class StudentController {
    private Student model; // Объект модели студента
    private StudentView view; // Объект представления студента

    public StudentController(Student model, StudentView view) {
        this.model = model; // Инициализация объекта модели студента
        this.view = view; // Инициализация объекта представления студента
    }

    public void setStudentName(String name) {
        model.setName(name); // Установка имени студента в модель
    }

    public String getStudentName() {
        return model.getName(); // Возвращает имя студента из модели
    }

    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo); // Установка номера студенческого билета студента в модель
    }

    public String getStudentRollNo() {
        return model.getRollNo(); // Возвращает номер студенческого билета студента из модели
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo()); // Обновление представления студента с выводом информации об имени и номере студенческого билета
    }
}
