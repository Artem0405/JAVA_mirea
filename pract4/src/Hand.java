class Hand {
    private int fingersCount; // Приватное поле для хранения количества пальцев

    public Hand(int fingersCount) {
        if (fingersCount >= 0 && fingersCount <= 5) { // Проверяем, что количество пальцев больше или равно нулю и не больше 5
            this.fingersCount = fingersCount; // Устанавливаем переданное количество пальцев в поле fingersCount
        } else {
            System.out.println("Ошибка: количество пальцев должно быть неотрицательным и не больше 5"); // Выводим сообщение об ошибке
        }
    }

    public int getFingersCount() {
        return fingersCount; // Возвращаем значение количества пальцев
    }

    public void setFingersCount(int fingersCount) {
        if (fingersCount >= 0 && fingersCount <= 5) { // Проверяем, что количество пальцев больше или равно нулю и не больше 5
            this.fingersCount = fingersCount; // Устанавливаем новое количество пальцев
        } else {
            System.out.println("Ошибка: количество пальцев должно быть неотрицательным и не больше 5"); // Выводим сообщение об ошибке
        }
    }
}
