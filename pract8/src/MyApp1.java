import java.awt.*;
import javax.swing.*;
import java.io.File;

class MyApp1 extends JFrame {
    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;
    String background_image_path = "";

    MyApp1(String imagePath) {
        super("Image Viewer");
        this.background_image_path = "C:/Users/artem/OneDrive/Документы/mirea_java/pract8/frame/background/background.jpg";

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Image img = Toolkit.getDefaultToolkit().getImage(this.background_image_path);
        g.drawImage(img, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            if (args.length >= 1) {
                File imageFile = new File(args[0]);
                if (imageFile.exists() && !imageFile.isDirectory()) {
                    new MyApp1(args[0]);
                } else {
                    System.out.println("[!] Specified image file does not exist");
                }
            } else {
                System.out.println("[!] Image path is empty");
            }
        });
    }
}
