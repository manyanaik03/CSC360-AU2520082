package com.manya;

import javax.swing.*;
import java.awt.*;

public class App extends JPanel {

    private int x = 0;

    public App() {
        Timer timer = new Timer(20, e -> {
            x += 5;

            if (x > getWidth()) {
                x = -100;
            }

            repaint();
        });

        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int[] xPoints = {x, x + 50, x + 100};
        int[] yPoints = {200, 100, 200};

        g.fillPolygon(xPoints, yPoints, 3);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Triangle");

        frame.add(new App());
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}