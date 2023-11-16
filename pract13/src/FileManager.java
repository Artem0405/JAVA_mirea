import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) {
        // Создание объекта Scanner для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Инициализация переменной для выхода из цикла
        boolean exit = false;

        // Цикл, пока exit равен false
        while (!exit) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Записать в файл");
            System.out.println("2. Вывести информацию из файла");
            System.out.println("3. Заменить информацию в файле");
            System.out.println("4. Добавить текст в конец файла");
            System.out.println("5. Выход");

            // Чтение выбора пользователя
            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем лишний символ новой строки

            // В зависимости от выбора пользователя, выполнение соответствующей операции
            switch (choice) {
                case 1:
                    // Вызов метода для записи в файл, передача объекта Scanner
                    writeFile(scanner);
                    break;
                case 2:
                    // Вызов метода для чтения информации из файла
                    readFile();
                    break;
                case 3:
                    // Вызов метода для замены информации в файле, передача объекта Scanner
                    replaceFile(scanner);
                    break;
                case 4:
                    // Вызов метода для добавления текста в конец файла, передача объекта Scanner
                    appendToFile(scanner);
                    break;
                case 5:
                    // Установка exit в true для выхода из цикла
                    exit = true;
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Некорректный выбор.");
                    break;
            }
        }
        scanner.close();
    }

    /**
     * Метод для записи данных в файл.
     */
    private static void writeFile(Scanner scanner) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))) {

            /* Выводим сообщение о том, что пользователь должен ввести информацию для записи в файл. */
            System.out.println("Введите информацию для записи в файл:");

            /* Считываем строку из консоли и записываем ее в файл. */
            String data = scanner.nextLine();
            writer.write(data);

            /* Выводим сообщение об успешной записи в файл. */
            System.out.println("Информация успешно записана в файл.");
        } catch (IOException e) {

            /* Если произошла ошибка при записи в файл, то выводим сообщение об этом. */
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    /**
     * Метод для чтения данных из файла.
     */
    private static void readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {

            /* Считываем каждую строку из файла и выводим ее в консоль. */
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {

            /* Если произошла ошибка при чтении файла, то выводим сообщение об этом. */
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    private static void replaceFile(Scanner scanner) {
        // Метод для замены информации в файле.

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))) {
            // Создание объекта writer для записи в файл "file.txt".

            System.out.println("Введите новую информацию для замены:");
            // Просим пользователя ввести новую информацию для замены.

            String data = scanner.nextLine();
            // Считываем введенную пользователем информацию.

            writer.write(data);
            // Записываем новую информацию в файл.

            System.out.println("Информация успешно заменена в файле.");
            // Выводим сообщение об успешной замене информации в файле.
        } catch (IOException e) {
            System.out.println("Ошибка при замене информации в файле " + e.getMessage());
            // В случае возникновения ошибки выводим сообщение об ошибке.
        }
    }

    private static void appendToFile(Scanner scanner) {
        // Метод для добавления текста в конец файла.

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt", true))) {
            // Создание объекта writer для записи в файл "file.txt" с возможностью добавления в конец файла.

            System.out.println("Введите текст для добавления в конец файла:");
            // Просим пользователя ввести текст для добавления в конец файла.

            String data = scanner.nextLine();
            // Считываем введенный пользователем текст.

            writer.write(data);
            // Добавляем текст в конец файла.

            System.out.println("Текст успешно добавлен в конец файла.");
            // Выводим сообщение об успешном добавлении текста в файл.
        } catch (IOException e) {
            System.out.println("Ошибка при добавлении текста в файл: " + e.getMessage());
            // В случае возникновения ошибки выводим сообщение об ошибке.
        }
    }
}
