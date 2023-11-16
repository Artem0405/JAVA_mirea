public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head("Темный");
        Leg leg = new Leg(80);
        Hand hand = new Hand(5);

        Human human = new Human(head, leg, hand);

        System.out.println("Цвет волос: " + human.getHead().getHairColor());
        System.out.println("Длина ноги: " + human.getLeg().getLength() + " см");
        System.out.println("Количество пальцев: " + human.getHand().getFingersCount());

        human.getHead().setHairColor("Светлый");
        human.getLeg().setLength(85);
        human.getHand().setFingersCount(6);

        System.out.println("Новый цвет волос: " + human.getHead().getHairColor());
        System.out.println("Новая длина ноги: " + human.getLeg().getLength() + " см");
        System.out.println("Новое количество пальцев: " + human.getHand().getFingersCount());
    }
}