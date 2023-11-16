public class BallTester {
    public static void main(String[] args) {
        Ball ball = new Ball("Красный", 10.0); // Создание объекта "Мяч" с цветом "Красный" и диаметром 10.0
        
        // Вывод информации о мяче с помощью метода toString()
        System.out.println("Цвет мяча: " + ball.getColor()); // Вывод цвета мяча
        System.out.println("Диаметр мяча: " + ball.getDiameter()); // Вывод диаметра мяча
        
        ball.setColor("Синий"); // Изменение цвета мяча
        ball.setDiameter(15.0); // Изменение диаметра мяча
        
        // Вывод обновленной информации о мяче
        System.out.println("Цвет мяча: " + ball.getColor()); // Вывод обновленного цвета мяча
        System.out.println("Диаметр мяча: " + ball.getDiameter()); // Вывод обновленного диаметра мяча
    }
}
