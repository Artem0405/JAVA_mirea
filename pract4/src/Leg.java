class Leg {
    private int length; // Приватное поле для хранения длины ноги

    public Leg(int length) {
        if (length >= 0) { // Проверяем, что длина ноги больше или равна нулю
            this.length = length; // Устанавливаем переданную длину ноги в поле length
        } else {
            System.out.println("Ошибка: длина ноги должна быть неотрицательной"); // Выводим сообщение об ошибке
        }
    }

    public int getLength() {
        return length; // Возвращаем значение длины ноги
    }

    public void setLength(int length) {
        if (length >= 0) { // Проверяем, что длина ноги больше или равна нулю
            this.length = length; // Устанавливаем новую длину ноги
        } else {
            System.out.println("Ошибка: длина ноги должна быть неотрицательной"); // Выводим сообщение об ошибке
        }
    }
}