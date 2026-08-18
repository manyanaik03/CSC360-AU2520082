\# Square Drawing Program



Objective



To draw a square using Java programming and four straight lines.



Program



The program uses Java Swing and the Graphics class to create a window and draw a square.



&#x20;Code



```java

import javax.swing.\*;

import java.awt.\*;



public class Square extends JPanel {



   @Override

   protected void paintComponent(Graphics g) {

       super.paintComponent(g);


       g.drawLine(100, 100, 300, 100);

       g.drawLine(300, 100, 300, 300);

       g.drawLine(300, 300, 100, 300);

       g.drawLine(100, 300, 100, 100);

   }



   public static void main(String\[] args) {

       JFrame frame = new JFrame("My Square");



       frame.add(new Square());

       frame.setSize(400, 400);

       frame.setDefaultCloseOperation(JFrame.EXIT\_ON\_CLOSE);

       frame.setVisible(true);

   }

}

