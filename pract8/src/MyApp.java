// Импорт необходимых классов для создания графического интерфейса
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;

// Класс приложения
class MyApp extends JFrame {
    int WINDOW_WIDTH = 600; // Ширина окна приложения
    int WINDOW_HEIGHT = 600; // Высота окна приложения
    String background_image_path = "C:/Users/artem/OneDrive/Документы/mirea_java/pract8/frame/background/background.jpg";
    String animation_images_path = "C:/Users/artem/OneDrive/Документы/mirea_java/pract8/frame/";
    int method; // Флаг, указывающий на текущий метод

    // Инициализация приложения
    MyApp() {
        super("Some shapes"); // Заголовок окна

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // Установка размеров окна
        setLocation(300, 300); // Установка положения окна на экране
        setLayout(null); // Отключение менеджера компоновки
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Установка операции закрытия окна по умолчанию
        setVisible(true); // Установка видимости окна

        this.method = 0; // Инициализация флага метода

        // Кнопка "Start animation"
        Button btn = new Button("Start animation"); // Создание кнопки
        btn.setSize(200, 100); // Установка размеров кнопки
        btn.setLocation(0, 0); // Установка положения кнопки на экране
        btn.addActionListener(
                new ActionListener () { // Обработчик события нажатия на кнопку
                    public void actionPerformed(ActionEvent event) {
                        method = 1; // Установка флага метода в 1
                        setTitle("Animation"); // Изменение заголовка окна
                        setSize(WINDOW_WIDTH + 1, WINDOW_HEIGHT); // Изменение размеров окна
                        setSize(WINDOW_WIDTH - 1, WINDOW_HEIGHT); // Изменение размеров окна
                    }
                }
        );
        add(btn); // Добавление кнопки на окно
    }

    void set_background_image_path(String path) {
        this.background_image_path = path; // Установка пути к изображению фона
    }

    void set_animation_images_path(String path) {
        this.animation_images_path = path; // Установка пути к изображениям анимации
    }

    // Метод отрисовки
    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2; // Приведение типа графики
        Image img = Toolkit.getDefaultToolkit().getImage(this.background_image_path); // Загрузка изображения фона
        g.drawImage(img, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this); // Отрисовка изображения фона

        switch (this.method) {
            case 0:
                random_shapes_paint(50, g); // Вызов метода отрисовки случайных фигур
                break;

            case 1:
                animate(this.animation_images_path, g); // Вызов метода анимации с передачей пути к изображениям
                break;

            default:
                break;
        }
    }

    // Метод для рисования случайных фигур
    void random_shapes_paint(int shapes, Graphics2D g) {
        for (int i = 0; i < shapes; i++) { // Цикл по количеству фигур
            int choice = (int) (Math.random() * 7); // Выбор случайного числа от 0 до 6

            switch (choice) {
                // Овал
                case 1:
                    g.setColor(new Color((int) (Math.random() * 0x1000000))); // Установка случайного цвета
                    g.fillOval(
                            (int) (Math.random() * WINDOW_WIDTH), // Установка случайной x-координаты
                            (int) (Math.random() * WINDOW_HEIGHT), // Установка случайной y-координаты
                            (int) (Math.random() * 200), // Установка случайной ширины овала
                            (int) (Math.random() * 200) // Установка случайной высоты овала
                    );
                    break;

                // Прямоугольник
                case 2:
                    g.setColor(new Color((int) (Math.random() * 0x1000000))); // Установка случайного цвета
                    g.fillRect(
                            (int) (Math.random() * WINDOW_WIDTH), // Установка случайной x-координаты
                            (int) (Math.random() * WINDOW_HEIGHT), // Установка случайной y-координаты
                            (int) (Math.random() * 200), // Установка случайной ширины прямоугольника
                            (int) (Math.random() * 200) // Установка случайной высоты прямоугольника
                    );
                    break;

                // Линия
                case 3:
                    g.setColor(new Color((int) (Math.random() * 0x1000000))); // Установка случайного цвета
                    g.drawLine(
                            (int) (Math.random() * WINDOW_WIDTH), // Установка случайной x-координаты начальной точки
                            (int) (Math.random() * WINDOW_WIDTH), // Установка случайной x-координаты конечной точки
                            (int) (Math.random() * WINDOW_HEIGHT), // Установка случайной y-координаты начальной точки
                            (int) (Math.random() * WINDOW_HEIGHT) // Установка случайной y-координаты конечной точки
                    );
                    break;

                // Дуга
                case 4:
                    g.setColor(new Color((int) (Math.random() * 0x1000000))); // Установка случайного цвета
                    g.drawArc(
                            (int) (Math.random() * WINDOW_WIDTH), // Установка случайной x-координаты верхнего левого угла описывающего прямоугольника
                            (int) (Math.random() * WINDOW_HEIGHT), // Установка случайной y-координаты верхнего левого угла описывающего прямоугольника
                            (int) (Math.random() * WINDOW_WIDTH), // Установка случайной ширины описывающего прямоугольника
                            (int) (Math.random() * WINDOW_HEIGHT), // Установка случайной высоты описывающего прямоугольника
                            (int) (Math.random() * 360), // Установка начального угла дуги
                            (int) (Math.random() * 360) // Установка угловой длины дуги
                    );
                    break;

                // Закруглённый прямоугольник
                case 5:
                    g.setColor(new Color((int) (Math.random() * 0x1000000))); // Установка случайного цвета
                    g.fillRoundRect(
                            (int) (Math.random() * WINDOW_WIDTH), // Установка случайной x-координаты
                            (int) (Math.random() * WINDOW_HEIGHT), // Установка случайной y-координаты
                            (int) (Math.random() * 200), // Установка случайной ширины закруглённого прямо
                            (int) (Math.random() * 200), // Установка случайной высоты закруглённого прямоугольника
                            (int) (Math.random() * 50), // Установка случайного радиуса закругления
                            (int) (Math.random() * 50) // Установка случайного радиуса закругления
                    );
                    break;

                // Полигон
                case 6:
                    g.setColor(new Color((int) (Math.random() * 0x1000000))); // Установка случайного цвета
                    int[] xPoints = {(int) (Math.random() * WINDOW_WIDTH), (int) (Math.random() * WINDOW_WIDTH), (int) (Math.random() * WINDOW_WIDTH)}; // Установка случайных x-координат вершин полигона
                    int[] yPoints = {(int) (Math.random() * WINDOW_HEIGHT), (int) (Math.random() * WINDOW_HEIGHT), (int) (Math.random() * WINDOW_HEIGHT)}; // Установка случайных y-координат вершин полигона
                    g.fillPolygon(xPoints, yPoints, 3); // Рисование закрашенного полигона с 3 вершинами
                    break;
            }
        }
    }

    // Определение метода анимации с передачей пути кадров и объекта Graphics2D для рисования
    void animate(String frames_path, Graphics2D g) {
        // Создание объекта File на основе переданного пути кадров
        File dir = new File(frames_path);

        // Проверка существования указанного пути и является ли он директорией
        if (dir.exists() && dir.isDirectory()) {
            // Получение списка файлов в директории
            File[] files = dir.listFiles();
            if (files != null) {
                // Зацикливание анимации
                while (true) {
                    // Перебор файлов
                    for (File file : files) {
                        // Получение изображения по пути файла
                        Image frame = Toolkit.getDefaultToolkit().getImage(file.getPath());
                        // Отрисовка изображения
                        g.drawImage(frame, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            // Обработка исключения при прерывании потока
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    // Точка входа в приложение
    public static void main(String[] args) {
        // Создание экземпляра приложения
        MyApp app = new MyApp();
        // Проверка наличия аргументов командной строки
        if (args.length >= 1) {
            // Если указан второй аргумент, установить путь к изображениям анимации
            if (args.length >= 2) {
                File backgroundImage = new File(args[0]);
                File animationImages = new File(args[1]);
                if (backgroundImage.exists() && !backgroundImage.isDirectory() && animationImages.exists() && animationImages.isDirectory()) {
                    app.set_background_image_path(args[0]); // Установка пути к фоновому изображению
                    app.set_animation_images_path(args[1]); // Установка пути к изображениям анимации
                } else {
                    System.out.println("[!] Путь к фоновому изображению или директория изображений анимации не существует");
                }
            } else {
                // Вывод сообщения о недостаточном количестве аргументов
                System.out.println("");
            }
        } else {
            // Вывод сообщения о недостаточном количестве аргументов
            System.out.println("[!] Недостаточно аргументов командной строки");
        }
    }
}