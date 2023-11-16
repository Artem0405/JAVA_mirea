public class Student {
    private String name;
    private double averageScore;

    public Student(String name, double averageScore) {
        this.name = name;
        this.averageScore = averageScore;
    }
    /*
     * Класс Student представляет студента и содержит его имя и средний балл
     */

    public String getName() {
        return name;
    }
    /*
     * Метод getName() возвращает имя студента
     */

    public double getAverageScore() {
        return averageScore;
    }
    /*
     * Метод getAverageScore() возвращает средний балл студента
     */
}
