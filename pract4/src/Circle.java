public class Circle {
    private double radius; // Приватное поле для хранения радиуса

    public Circle(double radius) {
        if (radius > 0) { // Проверяем, что радиус больше нуля
            this.radius = radius; // Устанавливаем переданный радиус в поле radius
        } else {
            System.out.println("Ошибка: радиус должен быть больше нуля"); // Выводим сообщение об ошибке
        }
    }

    public double getRadius() {
        return radius; // Возвращаем значение радиуса
    }

    public void setRadius(double radius) {
        if (radius > 0) { // Проверяем, что радиус больше нуля
            this.radius = radius; // Устанавливаем новое значение радиуса
        } else {
            System.out.println("Ошибка: радиус должен быть больше нуля"); // Выводим сообщение об ошибке
        }
    }

    public double getArea() {
        return Math.PI * radius * radius; // Вычисляем и возвращаем площадь круга
    }

    public double getCircumference() {
        return 2 * Math.PI * radius; // Вычисляем и возвращаем длину окружности
    }
}