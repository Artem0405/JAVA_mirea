public class MovableTest {
    public static void main(String[] args) {
        Movable m = new MovablePoint(0, 0, 1, 4); // Создаем объект типа MovablePoint с координатами (0, 0) и скоростью (1, 4)
        System.out.println("Point:\n");
        System.out.println(m); // Выводим информацию о точке

        m.moveUp(); // Перемещаем точку вверх
        m.moveRight(); // Перемещаем точку вправо
        System.out.println("Up+Right -> " + m); // Выводим информацию о точке после перемещения

        System.out.println("\nCircle:\n");
        m = new MovableCircle(0, 0, 2, 4, 6); // Создаем объект типа MovableCircle с центром (0, 0), радиусом 2 и скоростью (4, 6)
        System.out.println(m); // Выводим информацию о круге

        m.moveDown(); // Перемещаем круг вниз
        m.moveLeft(); // Перемещаем круг влево
        System.out.println("Down+Left -> " + m); // Выводим информацию о круге после перемещения

        System.out.println("\nRectangle:\n");
        m = new MovableRectangle(0, 0, 4, 4, 2, 4); // Создаем объект типа MovableRectangle с верхним левым углом (0, 0), нижним правым углом (4, 4) и скоростью (2, 4)
        System.out.println(m); // Выводим информацию о прямоугольнике

        m.moveRight(); // Перемещаем прямоугольник вправо
        m.moveDown(); // Перемещаем прямоугольник вниз
        System.out.println("Right+Down -> " + m); // Выводим информацию о прямоугольнике после перемещения

        System.out.println("\nChanging speed for rectangle:");
        MovableRectangle r = (MovableRectangle)m; // Приводим объект типа Movable к типу MovableRectangle
        r.setSpeed(10, 0); // Изменяем скорость верхнего левого угла прямоугольника
        try{
            r.moveDown(); // Пробуем переместить прямоугольник вниз
        }catch (IllegalStateException e){
            System.out.println(e); // Если скорости точек прямоугольника не совпадают, выводим сообщение об ошибке
        }
    }
}
