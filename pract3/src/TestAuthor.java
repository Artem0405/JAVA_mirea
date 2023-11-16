import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя автора: ");
        String name = scanner.nextLine();

        System.out.print("Введите электронную почту автора: ");
        String email = scanner.nextLine();

        System.out.print("Введите пол автора (M - Мужской, F - Женский): ");
        char gender = scanner.nextLine().charAt(0);

        try {
            Author author = new Author(name, email, gender); // Создание нового объекта автора с введенной информацией
            System.out.println(author); // Вывод в консоль объекта автора

            System.out.println("Обновление почты");
            System.out.print("Введите новую электронную почту автора: ");
            String newEmail = scanner.nextLine();
            author.setEmail(newEmail); // Изменение электронной почты автора
            System.out.println("Новая электронная почта: " + author.getEmail()); // Вывод в консоль новой электронной почты

            System.out.println("Обновление имени");
            System.out.print("Введите новое имя автора: ");
            String newName = scanner.nextLine();
            author.setName(newName); // Изменение имени автора
            System.out.println("Новое имя автора: " + author.getName()); // Вывод в консоль нового имени

            System.out.println("Обновление пола");
            System.out.print("Введите новый пол автора (M - Мужской, F - Женский): ");
            char newGender = scanner.nextLine().charAt(0);
            author.setGender(newGender); // Изменение пола автора
            System.out.println("Новый пол автора: " + author.getGender()); // Вывод в консоль нового пола
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Вывод в консоль сообщения об ошибке из исключения
        }

        scanner.close();
    }
}
