public class Ball {
    private String color; // Цвет мяча
    private double diameter; // Диаметр мяча
    
    // Конструктор класса "Мяч" для инициализации цвета и диаметра мяча
    public Ball(String color, double diameter) {
        this.color = color;
        this.diameter = diameter;
    }
    
    // Метод для установки цвета мяча
    public void setColor(String color) {
        this.color = color;
    }
    
    // Метод для установки диаметра мяча
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
    
    // Метод для получения цвета мяча
    public String getColor() {
        return color;
    }
    
    // Метод для получения диаметра мяча
    public double getDiameter() {
        return diameter;
    }
    
    // Переопределенный метод toString() для возврата строкового представления объекта "Мяч"
    @Override
    public String toString() {
        return "Ball [color=" + color + ", diameter=" + diameter + "]";
    }
}
