public class Employee {
    private String name; // Поле для хранения имени сотрудника
    private double hourlyRate; // Поле для хранения почасовой ставки сотрудника
    private int hoursWorked; // Поле для хранения отработанных часов сотрудника

    public String getName() {
        return name; // Возвращает имя сотрудника
    }

    public void setName(String name) {
        this.name = name; // Устанавливает имя сотрудника
    }

    public double getHourlyRate() {
        return hourlyRate; // Возвращает почасовую ставку сотрудника
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate; // Устанавливает почасовую ставку сотрудника
    }

    public int getHoursWorked() {
        return hoursWorked; // Возвращает количество отработанных часов сотрудника
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked; // Устанавливает количество отработанных часов сотрудника
    }
}
