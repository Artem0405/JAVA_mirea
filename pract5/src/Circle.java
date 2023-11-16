class Circle extends Shape {
    private double radius; // Приватное поле для хранения радиуса

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius; // Устанавливаем переданный радиус в поле radius
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // Вызываем конструктор суперкласса Shape, передавая цвет и значение filled
        this.radius = radius; // Устанавливаем переданный радиус в поле radius
    }

    public double getRadius() {
        return radius; // Возвращаем радиус
    }

    public void setRadius(double radius) {
        this.radius = radius; // Устанавливаем новое значение радиуса
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius; // Вычисляем и возвращаем площадь круга
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius; // Вычисляем и возвращаем периметр окружности
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]"; // Возвращает строковое представление объекта Circle, включая информацию о цвете, filled и радиусе
    }
}
