class Head {
    private String hairColor; // Приватное поле для хранения цвета волос

    public Head(String hairColor) {
        this.hairColor = hairColor; // Устанавливаем переданный цвет волос в поле hairColor
    }

    public String getHairColor() {
        return hairColor; // Возвращаем значение цвета волос
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor; // Устанавливаем новый цвет волос
    }
}