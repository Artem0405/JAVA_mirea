public class MovableRectangle implements Movable {
    private MovablePoint topLeft, bottomRight; // Приватные поля для хранения верхней левой точки и нижней правой точки прямоугольника

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed); // Создаем новый объект MovablePoint для верхней левой точки и инициализируем поля
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed); // Создаем новый объект MovablePoint для нижней правой точки и инициализируем поля
    }

    public void setSpeed(int xSpeed, int ySpeed){
        // метод с ошибкой для проверки работы isEquSpeed
        topLeft.ySpeed = ySpeed; // Задаем новую скорость по оси y для верхней левой точки
        topLeft.xSpeed = xSpeed; // Задаем новую скорость по оси x для верхней левой точки
    }

    private boolean isEquSpeed(){
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed; // Проверяет, равны ли скорости двух точек прямоугольника по осям x и y
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=MovablePoint{x=" + topLeft.x + ", y="+ topLeft.y +
                "}, bottomRight=MovablePoint{x=" + bottomRight.x + ", y=" + bottomRight.y +
                "}, xSpeed = " + topLeft.xSpeed +
                ", ySpeed=" + topLeft.ySpeed +
                "}";
    }

    @Override
    public void moveUp() {
        if(!isEquSpeed()) // Проверяет, совпадают ли скорости двух точек прямоугольника
            throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n" +
                    "topLeft:\n\txSpeed = " + topLeft.xSpeed + "\n\tySpeed = " + topLeft.ySpeed +
                    "\nbottomRight:\n\txSpeed = " + bottomRight.xSpeed + "\n\tySpeed = " + bottomRight.ySpeed);
        topLeft.moveUp(); // Передвигает верхнюю левую точку прямоугольника вверх
        bottomRight.moveUp(); // Передвигает нижнюю правую точку прямоугольника вверх
    }

    @Override
    public void moveDown() {
        if(!isEquSpeed()) // Проверяет, совпадают ли скорости двух точек прямоугольника
            throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n" +
                    "topLeft:\n\txSpeed = " + topLeft.xSpeed + "\n\tySpeed = " + topLeft.ySpeed +
                    "\nbottomRight:\n\txSpeed = " + bottomRight.xSpeed + "\n\tySpeed = " + bottomRight.ySpeed);
        topLeft.moveDown(); // Передвигает верхнюю левую точку прямоугольника вниз
        bottomRight.moveDown(); // Передвигает нижнюю правую точку прямоугольника вниз
    }

    @Override
    public void moveLeft() {
        if(!isEquSpeed()) // Проверяет, совпадают ли скорости двух точек прямоугольника
            throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n" +
                    "topLeft:\n\txSpeed = " + topLeft.xSpeed + "\n\tySpeed = " + topLeft.ySpeed +
                    "\nbottomRight:\n\txSpeed = " + bottomRight.xSpeed + "\n\tySpeed = " + bottomRight.ySpeed);
        topLeft.moveLeft(); // Передвигает верхнюю левую точку прямоугольника
        bottomRight.moveLeft();

    }

    @Override
    public void moveRight() {
        if(!isEquSpeed()) throw new IllegalStateException("Скорости точек прямоугольника не совпадают!\n" +
                "topLeft:\n\txSpeed = " + topLeft.xSpeed + "\n\tySpeed = " + topLeft.ySpeed +
                "\nbottomRight:\n\txSpeed = " + bottomRight.xSpeed + "\n\tySpeed = " + bottomRight.ySpeed);
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}