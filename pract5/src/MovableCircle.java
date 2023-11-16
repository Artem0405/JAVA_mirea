public class MovableCircle implements Movable {

    int radius; // Поле для хранения радиуса окружности
    MovablePoint center; // Поле для хранения центра окружности типа MovablePoint

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed); // Создаем новый объект MovablePoint и инициализируем поле center
        this.radius = radius; // Присваиваем переменной radius переданное значение
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center.toString() +
                '}'; // Возвращает строковое представление объекта MovableCircle, включая информацию о радиусе и центре
    }

    @Override
    public void moveUp() {
        center.moveUp(); // Вызывает метод moveUp() у объекта center типа MovablePoint
    }

    @Override
    public void moveDown() {
        center.moveDown(); // Вызывает метод moveDown() у объекта center типа MovablePoint
    }

    @Override
    public void moveLeft() {
        center.moveLeft(); // Вызывает метод moveLeft() у объекта center типа MovablePoint
    }

    @Override
    public void moveRight() {
        center.moveRight(); // Вызывает метод moveRight() у объекта center типа MovablePoint
    }
}
