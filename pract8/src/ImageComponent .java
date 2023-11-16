import java.awt.*;

// Класс компонента для отображения картинки
class ImageComponent extends Component {
    private Image image;

    public ImageComponent(Image image) {
        this.image = image;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image, 0, 0, null);
    }
}
