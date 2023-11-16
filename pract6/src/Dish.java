abstract class Dish {
    private String material; // Закрытое поле для хранения материала посуды
    private String color; // Закрытое поле для хранения цвета посуды

    public Dish(String material, String color) {
        this.material = material; // Устанавливаем переданный материал в поле material
        this.color = color; // Устанавливаем переданный цвет в поле color
    }

    public abstract void use(); // Абстрактный метод для использования посуды (должен быть реализован в подклассах)

    public String getMaterial() {
        return material; // Возвращаем материал посуды
    }

    public String getColor() {
        return color; // Возвращаем цвет посуды
    }
}

class Plate extends Dish {
    private int diameter; // Закрытое поле для хранения диаметра тарелки

    public Plate(String material, String color, int diameter) {
        super(material, color); // Вызываем конструктор суперкласса Dish, передавая material и color
        this.diameter = diameter; // Устанавливаем переданный диаметр в поле diameter
    }

    @Override
    public void use() {
        System.out.println("Данная тарелка имеет материал: " + getMaterial() + ", цвет: " + getColor() + ", и диаметр " + diameter + " см"); // Выводим сообщение о использовании тарелки с указанием материала, цвета и диаметра
    }
}

class Cup extends Dish {
    private int volume; // Закрытое поле для хранения объема кружки

    public Cup(String material, String color, int volume) {
        super(material, color); // Вызываем конструктор суперкласса Dish, передавая material и color
        this.volume = volume; // Устанавливаем переданный объем в поле volume
    }

    @Override
    public void use() {
        System.out.println("Данная чашка имеет материал: " + getMaterial() + ", цвет: " + getColor() + ", и объем " + volume + " мл"); // Выводим сообщение о использовании кружки с указанием материала, цвета и объема
    }
}