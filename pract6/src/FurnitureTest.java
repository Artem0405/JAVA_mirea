public class FurnitureTest {
    public static void main(String[] args) {
        Chair chair = new Chair("Wood", "Brown", 4); // Создаем экземпляр стула с материалом "Wood", цветом "Brown" и 4 ногами
        Table table = new Table("Glass", "White", 6); // Создаем экземпляр стола с материалом "Glass", цветом "White" и 6 сидениями

        FurnitureShop furnitureShop = new FurnitureShop(); // Создаем экземпляр класса FurnitureShop

        furnitureShop.displayFurnitureInfo(chair); // Выводим информацию о стуле
        furnitureShop.displayFurnitureInfo(table); // Выводим информацию о столе
    }
}
