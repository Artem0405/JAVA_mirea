import java.util.Arrays; // Импортирование класса массивов из стандартной библиотеки Java
import java.util.Comparator; // Импортирование класса компараторов из стандартной библиотеки Java

// Класс Student
class Student { // Объявление класса Student
    private int iDNumber; // Приватное целочисленное поле iDNumber (номер студента)
    private double GPA; // Приватное поле с плавающей точкой двойной точности GPA (средний балл)

    public Student(int iDNumber, double GPA) { // Публичный конструктор класса Student с параметрами iDNumber и GPA
        this.iDNumber = iDNumber; // Присваивание значению iDNumber
        this.GPA = GPA; // Присваивание значению GPA
    }

    public int getiDNumber() { // Публичный метод для получения значения iDNumber
        return iDNumber; // Возвращение значения iDNumber
    }

    public double getGPA() { // Публичный метод для получения значения GPA
        return GPA; // Возвращение значения GPA
    }

    @Override
    public String toString() { // Переопределение метода toString
        return "Student{" + // Возвращение строки с информацией о студенте
                "iDNumber=" + iDNumber + // Номер студента
                ", GPA=" + GPA + // Средний балл
                '}';
    }
}