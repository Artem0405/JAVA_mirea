class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0.0, 0.0); // создаем объект мяча с начальными координатами (0.0, 0.0)
        System.out.println("Первоначальные координаты: ");
        System.out.println(ball.getX()); // выводим значение координаты x на экран
        System.out.println(ball.getY()); // выводим значение координаты y на экран

        ball.move(2.5, 1.5); // перемещаем мяч на значения смещения x = 2.5 и y = 1.5
        System.out.println("Измененные координаты: ");
        System.out.println(ball.getX()); // выводим новое значение координаты x на экран
        System.out.println(ball.getY()); // выводим новое значение координаты y на экран

        ball.setXY(3.0, 2.0); // устанавливаем новые значения координат x = 3.0 и y = 2.0
        System.out.println("Измененные координаты: ");
        System.out.println(ball.getX()); // выводим новое значение координаты x на экран
        System.out.println(ball.getY()); // выводим новое значение координаты y на экран

        ball.setX(-1.0); // Пытаемся установить недопустимую координату x
        ball.setY(101.0); // Пытаемся установить недопустимую координату y
        ball.setXY(-1.0, 101.0); // Пытаемся установить недопустимые координаты

        System.out.println(ball.toString()); // выводим строковое представление объекта мяча на экран
    }
}
