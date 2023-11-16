public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.0); // Создаем экземпляр класса Circle с радиусом 5.0 и присваиваем его переменной shape1
        shape1.setColor("Red"); // Устанавливаем цвет красный для shape1
        shape1.setFilled(true); // Устанавливаем заливку (filled) в true для shape1
        System.out.println(shape1); // Выводим информацию о shape1 (строковое представление объекта)
        System.out.println("Area: " + shape1.getArea()); // Выводим площадь shape1
        System.out.println("Perimeter: " + shape1.getPerimeter()); // Выводим периметр shape1

        Shape shape2 = new Rectangle(3.0, 4.0); // Создаем экземпляр класса Rectangle с шириной 3.0 и длиной 4.0 и присваиваем его переменной shape2
        shape2.setColor("Blue"); // Устанавливаем цвет синий для shape2
        shape2.setFilled(false); // Устанавливаем заливку (filled) в false для shape2
        System.out.println(shape2); // Выводим информацию о shape2 (строковое представление объекта)
        System.out.println("Area: " + shape2.getArea()); // Выводим площадь shape2
        System.out.println("Perimeter: " + shape2.getPerimeter()); // Выводим периметр shape2

        Shape shape3 = new Square(2.0); // Создаем экземпляр класса Square со стороной 2.0 и присваиваем его переменной shape3
        shape3.setColor("Green"); // Устанавливаем цвет зеленый для shape3
        shape3.setFilled(true); // Устанавливаем заливку (filled) в true для shape3
        System.out.println(shape3); // Выводим информацию о shape3 (строковое представление объекта)
        System.out.println("Area: " + shape3.getArea()); // Выводим площадь shape3
        System.out.println("Perimeter: " + shape3.getPerimeter()); // Выводим периметр shape3
    }
}