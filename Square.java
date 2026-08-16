import javax.swing.*;
import java.awt.*;

public class Square extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawLine(100, 100, 300, 100);
        g.drawLine(300, 100, 300, 300);
        g.drawLine(300, 300, 100, 300);
        g.drawLine(100, 300, 100, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Square");

        frame.add(new Square());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}