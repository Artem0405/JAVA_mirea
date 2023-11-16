public class DogTest {
    public static void main(String[] args) {
        LabradorRetriever labrador = new LabradorRetriever(3); // Создаем экземпляр класса LabradorRetriever с возрастом 3
        System.out.println("Порода: " + labrador.getBreed() + ", Возраст: " + labrador.getAge());

        GermanShepherd germanShepherd = new GermanShepherd(5); // Создаем экземпляр класса GermanShepherd с возрастом 5
        System.out.println("Порода: " + germanShepherd.getBreed() + ", Возраст: " + germanShepherd.getAge());
    }
}
