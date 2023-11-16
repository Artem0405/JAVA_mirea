public class TestBall {
    public static void main(String[] args) {
        // Создание объекта "Ball" с заданными координатами
        Ball ball = new Ball(10.0, 20.0);

        // Вывод текущего положения мяча
        // Изменение положения мяча и вывод новых координат
        ball.move(5.0, -10.0);
        System.out.println(ball);

         // Изменение значения координаты x мяча и вывод нового положения
        ball.setX(15.0);
        System.out.println(ball);

        // Изменение значения координаты y мяча и вывод нового положения
        ball.setY(25.0);
        System.out.println(ball);

         // Изменение положения мяча на заданные координаты и вывод нового положения
        ball.setXY(30.0, -5.0);
        System.out.println(ball);
    }
}
