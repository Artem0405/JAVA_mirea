abstract class Furniture {
    private String material; // Закрытое поле для хранения материала мебели
    private String color; // Закрытое поле для хранения цвета мебели

    public Furniture(String material, String color) { // Конструктор класса Furniture
        this.material = material; // Устанавливаем переданный материал в поле material
        this.color = color; // Устанавливаем переданный цвет в поле color
    }

    public abstract void use(); // Абстрактный метод для использования мебели (должен быть реализован в подклассах)

    public String getMaterial() { // Метод для получения материала мебели
        return material;
    }

    public String getColor() { // Метод для получения цвета мебели
        return color;
    }
}

class Chair extends Furniture {
    private int numOfLegs; // Закрытое поле для хранения числа ног у стула

    public Chair(String material, String color, int numOfLegs) { // Конструктор класса Chair
        super(material, color); // Вызываем конструктор суперкласса Furniture, передавая материал и цвет
        this.numOfLegs = numOfLegs; // Устанавливаем переданное число ног в поле numOfLegs
    }

    @Override
    public void use() { // Переопределяем абстрактный метод use()
        System.out.println("Sitting on a chair with " + numOfLegs + " legs"); // Выводим сообщение о сидении на стуле с указанием числа ног
    }
}

class Table extends Furniture {
    private int numOfSeats; // Закрытое поле для хранения числа сидений за столом

    public Table(String material, String color, int numOfSeats) { // Конструктор класса Table
        super(material, color); // Вызываем конструктор суперкласса Furniture, передавая материал и цвет
        this.numOfSeats = numOfSeats; // Устанавливаем переданное число сидений в поле numOfSeats
    }

    @Override
    public void use() { // Переопределяем абстрактный метод use()
        System.out.println("Using a table with " + numOfSeats + " seats"); // Выводим сообщение о использовании стола с указанием числа сидений
    }
}

class FurnitureShop {
    public void displayFurnitureInfo(Furniture furniture) { // Метод для вывода информации о мебели
        System.out.println("Material: " + furniture.getMaterial()); // Выводим информацию о материале мебели
        System.out.println("Color: " + furniture.getColor()); // Выводим информацию о цвете мебели
        furniture.use(); // Вызываем метод use() для мебели, что приведет к выполнению соответствующего действия
    }
}

// Тестирование классов


