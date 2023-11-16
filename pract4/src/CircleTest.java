public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0); // Создаем экземпляр класса Circle с заданным радиусом
        System.out.println("Радиус: " + circle.getRadius()); // Выводим радиус круга
        System.out.println("Площадь: " + circle.getArea()); // Выводим площадь круга
        System.out.println("Длина окружности: " + circle.getCircumference()); // Выводим длину окружности

        circle.setRadius(-2.0); // Изменяем радиус круга на неправильное значение (меньше нуля)
        System.out.println("Обновленный радиус: " + circle.getRadius()); // Выводим обновленное значение радиуса
        System.out.println("Обновленная площадь: " + circle.getArea()); // Выводим обновленное значение площади круга
        System.out.println("Обновленная длина окружности: " + circle.getCircumference()); // Выводим обновленное значение длины окружности
    }
}
