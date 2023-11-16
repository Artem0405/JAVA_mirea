import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class DrunkardGame extends JFrame {

    private Stack<Character> player1Stack; // Создание стека для карт первого игрока
    private Stack<Character> player2Stack; // Создание стека для карт второго игрока
    private Queue<Character> player1Queue; // Создание очереди для карт первого игрока
    private Queue<Character> player2Queue; // Создание очереди для карт второго игрока
    private int moves = 0; // Инициализация переменной для хранения количества ходов

    public DrunkardGame() {
        setSize(300, 300); // Установка размеров окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Установка операции по закрытию окна

        JButton playButton = new JButton("Play"); // Создание кнопки "Play"
        playButton.addActionListener(new ActionListener() { // Добавление слушателя событий для кнопки "Play"
            @Override
            public void actionPerformed(ActionEvent e) {
                playGame(); // Вызов метода для начала игры
            }
        });

        JButton exitButton = new JButton("Exit"); // Создание кнопки "Exit"
        exitButton.addActionListener(new ActionListener() { // Добавление слушателя событий для кнопки "Exit"
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Завершение работы приложения
            }
        });

        JPanel buttonPanel = new JPanel(); // Создание панели для размещения кнопок
        buttonPanel.add(playButton); // Добавление кнопки "Play" на панель
        buttonPanel.add(exitButton); // Добавление кнопки "Exit" на панель

        add(buttonPanel, BorderLayout.CENTER); // Размещение панели кнопок в центре окна
    }

    private void playGame() {
        String player1Cards = JOptionPane.showInputDialog("Введите карты первого игрока:"); // Запрос ввода карт первого игрока
        String player2Cards = JOptionPane.showInputDialog("Введите карты второго игрока:"); // Запрос ввода карт второго игрока

        player1Stack = new Stack<>(); // Инициализация стека для карт первого игрока
        player2Stack = new Stack<>(); // Инициализация стека для карт второго игрока
        player1Queue = new LinkedList<>(); // Инициализация очереди для карт первого игрока
        player2Queue = new LinkedList<>(); // Инициализация очереди для карт второго игрока

        for (char c : player1Cards.toCharArray()) {
            player1Stack.push(c); // Добавление карт в стек первого игрока
            player1Queue.offer(c); // Добавление карт в очередь первого игрока
        }
        for (char c : player2Cards.toCharArray()) {
            player2Stack.push(c); // Добавление карт в стек второго игрока
            player2Queue.offer(c); // Добавление карт в очередь второго игрока
        }

        while (moves < 106 && !player1Stack.isEmpty() && !player2Stack.isEmpty()) {
            char p1Card = player1Stack.pop(); // Извлечение карты из стека первого игрока
            char p2Card = player2Stack.pop(); // Извлечение карты из стека второго игрока
            moves++; // Увеличение количества ходов
            if (p1Card > p2Card) {
                player1Stack.add(p1Card); // Добавление карты первого игрока в стек
                player1Stack.add(p2Card); // Добавление карты второго игрока в стек
                while (!player1Queue.isEmpty()) {
                    player1Stack.add(player1Queue.poll()); // Добавление карт из очереди первого игрока в стек
                    player1Stack.add(player2Queue.poll()); // Добавление карт из очереди второго игрока в стек
                }
            }             else {
                player2Stack.add(p2Card); // Добавление карты второго игрока в стек
                player2Stack.add(p1Card); // Добавление карты первого игрока в стек
                while (!player2Queue.isEmpty()) {
                    player2Stack.add(player1Queue.poll()); // Добавление карт из очереди первого игрока в стек
                    player2Stack.add(player2Queue.poll()); // Добавление карт из очереди второго игрока в стек
                }
            }
        }

        if (player1Stack.isEmpty()) {
            JOptionPane.showMessageDialog(this, "second " + moves); // Вывод результата игры в диалоговом окне
        } else if (player2Stack.isEmpty()) {
            JOptionPane.showMessageDialog(this, "first " + moves); // Вывод результата игры в диалоговом окне
        } else {
            JOptionPane.showMessageDialog(this, "botva"); // Вывод результата игры в диалоговом окне
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new DrunkardGame(); // Создание объекта игры
                frame.setVisible(true); // Отображение игры
            }
        });
    }
}
