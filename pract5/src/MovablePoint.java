public class MovablePoint implements Movable {

    int x, y, xSpeed, ySpeed; // Поля для хранения координат, скоростей по осям x и y

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x; // Присваиваем значение x переданное в конструктор
        this.y = y; // Присваиваем значение y переданное в конструктор
        this.xSpeed = xSpeed; // Присваиваем значение xSpeed переданное в конструктор
        this.ySpeed = ySpeed; // Присваиваем значение ySpeed переданное в конструктор
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}'; // Возвращает строковое представление объекта MovablePoint, включающее значения полей x, y, xSpeed и ySpeed
    }

    @Override
    public void moveUp() {
        x += xSpeed; // Передвигаем точку вверх путем увеличения значения x
    }

    @Override
    public void moveDown() {
        x -= xSpeed; // Передвигаем точку вниз путем уменьшения значения x
    }

    @Override
    public void moveLeft() {
        y -= ySpeed; // Передвигаем точку влево путем уменьшения значения y
    }

    @Override
    public void moveRight() {
        y += ySpeed; // Передвигаем точку вправо путем увеличения значения y
    }
}
