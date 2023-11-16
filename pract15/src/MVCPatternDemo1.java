public class MVCPatternDemo1 {
    public static void main(String[] args) {
        // Создаем объекты модели, представления и контроллера
        Employee employee = new Employee(); // Создание объекта модели сотрудника
        EmployeeView employeeView = new EmployeeView(); // Создание объекта представления сотрудника
        EmployeeController employeeController = new EmployeeController(employee, employeeView); // Создание объекта контроллера сотрудника

        // Устанавливаем информацию о сотруднике
        employeeController.setEmployeeName("John Smith"); // Установка имени сотрудника через контроллер
        employeeController.setHourlyRate(12.5); // Установка почасовой ставки сотрудника через контроллер
        employeeController.setHoursWorked(40); // Установка количества отработанных часов сотрудника через контроллер

        // Обновляем представление
        employeeController.updateView(); // Обновление представления с информацией о сотруднике
    }
}
