class Rectangle extends Shape {
    private double width; // Приватное поле для хранения ширины прямоугольника
    private double length; // Приватное поле для хранения длины прямоугольника

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width; // Устанавливаем переданную ширину в поле width
        this.length = length; // Устанавливаем переданную длину в поле length
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled); // Вызываем конструктор суперкласса Shape, передавая цвет и значение filled
        this.width = width; // Устанавливаем переданную ширину в поле width
        this.length = length; // Устанавливаем переданную длину в поле length
    }

    public double getWidth() {
        return width; // Возвращаем ширину прямоугольника
    }

    public void setWidth(double width) {
        this.width = width; // Устанавливаем новое значение ширины прямоугольника
    }

    public double getLength() {
        return length; // Возвращаем длину прямоугольника
    }

    public void setLength(double length) {
        this.length = length; // Устанавливаем новое значение длины прямоугольника
    }

    @Override
    public double getArea() {
        return width * length; // Вычисляем и возвращаем площадь прямоугольника
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length); // Вычисляем и возвращаем периметр прямоугольника
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]"; // Возвращает строковое представление объекта, включая информацию о цвете, filled, ширине и длине прямоугольника
    }
}
