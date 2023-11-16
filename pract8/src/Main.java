import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.Scanner;
import javax.swing.JFrame;

import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите путь к картинке: ");
        String imagePath = scanner.nextLine();

        SwingUtilities.invokeLater(() -> createAndShowGUI(imagePath));
    }

    private static void createAndShowGUI(String imagePath) {
        JFrame frame = new JFrame("Отображение картинки");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel label = new JLabel(imageIcon);

        frame.getContentPane().add(label);

        frame.pack();
        frame.setVisible(true);
    }
}