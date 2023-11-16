public class Ball {
    private double x; // Положение мяча по оси X
    private double y; // Положение мяча по оси Y
    
    // Конструктор класса "Ball" для инициализации положения мяча
    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Конструктор класса "Ball" со значениями по умолчанию (0.0)
    public Ball() {
        this(0.0, 0.0);
    }
    
    // Метод для получения значения переменной "x"
    public double getX() {
        return x;
    }
    
    // Метод для установки значения переменной "x"
    public void setX(double x) {
        this.x = x;
    }
    
    // Метод для получения значения переменной "y"
    public double getY() {
        return y;
    }
    
    // Метод для установки значения переменной "y"
    public void setY(double y) {
        this.y = y;
    }
    
    // Метод для установки положения мяча по заданным координатам
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    // Метод для перемещения мяча на заданное расстояние по осям X и Y
    public void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }
    
    // Переопределенный метод toString() для возврата строкового представления объекта "Ball"
    public String toString() {
        return "Ball @ (" + x + ", " + y + ")";
    }
}
