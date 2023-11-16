public class EmployeeController {
    private Employee model; // Объект модели сотрудника
    private EmployeeView view; // Объект представления сотрудника

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model; // Инициализация объекта модели сотрудника
        this.view = view; // Инициализация объекта представления сотрудника
    }

    public void setEmployeeName(String name) {
        model.setName(name); // Установка имени сотрудника в модель
    }

    public String getEmployeeName() {
        return model.getName(); // Возвращает имя сотрудника из модели
    }

    public void setHourlyRate(double hourlyRate) {
        model.setHourlyRate(hourlyRate); // Установка почасовой ставки сотрудника в модель
    }

    public double getHourlyRate() {
        return model.getHourlyRate(); // Возвращает почасовую ставку сотрудника из модели
    }

    public void setHoursWorked(int hoursWorked) {
        model.setHoursWorked(hoursWorked); // Установка количества отработанных часов сотрудника в модель
    }

    public int getHoursWorked() {
        return model.getHoursWorked(); // Возвращает количество отработанных часов сотрудника из модели
    }

    public double calculateSalary() {
        return model.getHourlyRate() * model.getHoursWorked(); // Расчет зарплаты сотрудника на основе почасовой ставки и количества отработанных часов
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), calculateSalary()); // Обновление представления сотрудника с выводом информации об имени и зарплате
    }
}
