class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side); // Вызываем конструктор суперкласса Rectangle, передавая side в качестве значения ширины и длины
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled); // Вызываем конструктор суперкласса Rectangle, передавая side в качестве значения ширины и длины, а также color и filled
    }

    public double getSide() {
        return getWidth(); // Возвращаем значение ширины, так как все стороны квадрата равны, достаточно взять любую из сторон (ширину)
    }

    public void setSide(double side) {
        setWidth(side); // Устанавливаем новое значение ширины
        setLength(side); // Устанавливаем новое значение длины, так как все стороны квадрата равны, достаточно установить одно значение
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side); // Вызываем метод setWidth суперкласса Rectangle, чтобы установить новое значение ширины
        super.setLength(side); // Вызываем метод setLength суперкласса Rectangle, чтобы установить новое значение длины
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side); // Вызываем метод setWidth суперкласса Rectangle, чтобы установить новое значение ширины
        super.setLength(side); // Вызываем метод setLength суперкласса Rectangle, чтобы установить новое значение длины
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]"; // Возвращает строковое представление объекта, включая информацию о цвете и заливке квадрата
    }
}
