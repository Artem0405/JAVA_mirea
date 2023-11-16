abstract class Shape {
    protected String color; // Защищенное поле для хранения цвета фигуры
    protected boolean filled; // Защищенное поле для хранения информации о заливке фигуры

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color; // Устанавливаем переданный цвет в поле color
        this.filled = filled; // Устанавливаем переданное значение filled в поле filled
    }

    public String getColor() {
        return color; // Возвращаем цвет фигуры
    }

    public void setColor(String color) {
        this.color = color; // Устанавливаем новое значение цвета фигуры
    }

    public boolean isFilled() {
        return filled; // Возвращаем информацию о заливке фигуры
    }

    public void setFilled(boolean filled) {
        this.filled = filled; // Устанавливаем новое значение информации о заливке фигуры
    }

    public abstract double getArea(); // Абстрактный метод для вычисления площади фигуры (должен быть реализован в подклассах)

    public abstract double getPerimeter(); // Абстрактный метод для вычисления периметра фигуры (должен быть реализован в подклассах)

    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]"; // Возвращает строковое представление объекта, включающее информацию о цвете и заливке фигуры
    }
}
