import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchResultsApp extends JFrame {
    private JButton milanButton; // Кнопка для команды "AC Milan"
    private JButton madridButton; // Кнопка для команды "Real Madrid"
    private JLabel resultLabel; // Метка для отображения счета
    private JLabel lastScorerLabel; // Метка для отображения последнего забившего
    private JLabel winnerLabel; // Метка для отображения победителя
    private int milanScore; // Переменная для хранения счета "AC Milan"
    private int madridScore; // Переменная для хранения счета "Real Madrid"

    public MatchResultsApp() {
        milanScore = 0; // Инициализация счета "AC Milan" нулем
        madridScore = 0; // Инициализация счета "Real Madrid" нулем

        milanButton = new JButton("AC Milan"); // Создаем кнопку "AC Milan"
        madridButton = new JButton("Real Madrid"); // Создаем кнопку "Real Madrid"
        resultLabel = new JLabel("Result: " + milanScore + " X " + madridScore); // Создаем метку для отображения счета
        lastScorerLabel = new JLabel("Last Scorer: N/A"); // Создаем метку для отображения последнего забившего
        winnerLabel = new JLabel("Winner: DRAW"); // Создаем метку для отображения победителя

        milanButton.addActionListener(new ActionListener() { // Добавляем ActionListener для кнопки "AC Milan"
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++; // Увеличиваем счет "AC Milan" на единицу
                updateLabels("AC Milan"); // Обновляем метки после забитого гола
            }
        });

        madridButton.addActionListener(new ActionListener() { // Добавляем ActionListener для кнопки "Real Madrid"
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++; // Увеличиваем счет "Real Madrid" на единицу
                updateLabels("Real Madrid"); // Обновляем метки после забитого гола
            }
        });

        setLayout(new GridLayout(3, 2)); // Устанавливаем компоновку сеткой размером 3x2
        add(milanButton); // Добавляем кнопку "AC Milan" на форму
        add(madridButton); // Добавляем кнопку "Real Madrid" на форму
        add(resultLabel); // Добавляем метку для отображения счета
        add(lastScorerLabel); // Добавляем метку для отображения последнего забившего
        add(winnerLabel); // Добавляем метку для отображения победителя

        setTitle("Match Results"); // Устанавливаем заголовок окна
        setSize(700, 500); // Устанавливаем размер окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Устанавливаем операцию по умолчанию при закрытии окна
        setVisible(true); // Устанавливаем видимость окна
    }

    private void updateLabels(String lastScorer) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore); // Обновляем метку счета
        lastScorerLabel.setText("Last Scorer: " + lastScorer); // Обновляем метку последнего забившего

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan"); // Обновляем метку победителя, если "AC Milan" выиграла
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid"); // Обновляем метку победителя, если "Real Madrid" выиграла
        } else {
            winnerLabel.setText("Winner: DRAW"); // Обновляем метку победителя, если матч закончился вничью
        }
    }

    public static void main(String[] args) {
        new MatchResultsApp(); // Создаем экземпляр класса и запускаем приложение
    }
}
